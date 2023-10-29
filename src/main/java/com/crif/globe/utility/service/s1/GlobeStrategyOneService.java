package com.crif.globe.utility.service.s1;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crif.globe.utility.config.PropertyHandler;
import com.crif.globe.utility.domain.s1.request.S1Request;
import com.crif.globe.utility.domain.s1.response.S1Response;

@Service
public class GlobeStrategyOneService {

	private StrategyOneCommunicationService communicationService;

	public List<S1Response> processStrategyOneRequest(S1Request request, boolean flag, List<S1Response> s1ResponsesList,
			PropertyHandler property, String inquiryCode) throws IOException {
		communicationService = new StrategyOneCommunicationService(property);

		return communicationService.processS1Request(request, s1ResponsesList, inquiryCode);
	}
}
