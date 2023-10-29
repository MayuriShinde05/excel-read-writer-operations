package com.crif.globe.utility.service.s1;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crif.globe.utility.config.PropertyHandler;
import com.crif.globe.utility.domain.s1.request.S1Request;
import com.crif.globe.utility.domain.s1.response.S1Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StrategyOneCommunicationService {

	private static final Logger logger = LoggerFactory.getLogger(StrategyOneCommunicationService.class);

	@Autowired
	private RestTemplate restTemplate;

	@Value("${com.crif.globe.s1url}")
	String strategyOneUrl;

	@Value("${com.crif.globe.s1inquiryCode}")
	String inquiryCode;

	@Value("${com.crif.globe.s1processCode}")
	String processCode;

	@Autowired
	private PropertyHandler propertyHandler;

	public StrategyOneCommunicationService(PropertyHandler propertyHandler) {
		super();
		this.propertyHandler = propertyHandler;
	}

	public List<S1Response> processS1Request(S1Request s1Request, List<S1Response> s1ResponsesList, String inquiryCd)
			throws IOException {
		logger.debug("Inside StrategyOneCommunicationService : processS1Request");
		strategyOneUrl = propertyHandler.getS1url();

		String s1StringRequest = null;
		ObjectMapper objectMapper = new ObjectMapper();
		// get Request as json string
		try {
			s1StringRequest = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(s1Request);
			logger.debug("S1 Request :" + s1StringRequest);

		} catch (JsonProcessingException e) {
			logger.debug("Inside StrategyOneCommunicationService : processS1Request : JsonProcessingException ");
			throw e;
		}

		/*
		 * ConnectionConfig connectionConfig =
		 * ConnectionConfig.custom().setBufferSize(4128).build();
		 * 
		 * CloseableHttpClient httpclient =
		 * HttpClients.custom().setDefaultConnectionConfig(connectionConfig).build();
		 */

		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setConnectTimeout(10 * 1000);
		requestFactory.setReadTimeout(10 * 10000);
		restTemplate = new RestTemplate(requestFactory);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/plain");
		headers.add("Accept", "*/*");
		headers.add("Host", "globe-s1-uat.crif.com.ph");
		headers.add("Accept-Encoding", "gzip, deflate, br");
		headers.add("Connection", "keep-alive");
		HttpEntity<String> entity = new HttpEntity<String>(s1StringRequest, headers);

		/*
		 * HttpPost httpPost = new HttpPost(strategyOneUrl);
		 * httpclient.execute(httpPost);
		 */

		ResponseEntity<String> response = restTemplate.exchange(strategyOneUrl, HttpMethod.POST, entity, String.class);
		logger.debug("S1 Response :" + response != null ? response.getBody() : "S1 Response is null");

		S1Response s1Response = new S1Response();
		try {
			s1Response = objectMapper.readValue(response.getBody(), S1Response.class);
			setInquiryCode(inquiryCd, s1Response);
			s1ResponsesList.add(s1Response);
		} catch (JsonMappingException e) {
			logger.debug("Inside StrategyOneCommunicationService : processS1Request : JsonMappingException ");
			throw e;
		} catch (JsonProcessingException e) {
			logger.debug("Inside StrategyOneCommunicationService : processS1Request : JsonProcessingException ");
			throw e;
		}
		return s1ResponsesList;

	}

	private void setInquiryCode(String inquiryCde, S1Response s1Response) {
		s1Response.getStrategyOneResponse().getHeader().setInquiryCode(inquiryCde);
	}
}
