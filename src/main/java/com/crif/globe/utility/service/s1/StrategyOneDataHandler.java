package com.crif.globe.utility.service.s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crif.globe.utility.domain.s1.request.Application;
import com.crif.globe.utility.domain.s1.request.Body;
import com.crif.globe.utility.domain.s1.request.Header;
import com.crif.globe.utility.domain.s1.request.S1Request;
import com.crif.globe.utility.domain.s1.request.StrategyOneRequest;
import com.crif.globe.utility.entity.GlobeEntityRequest;

@Component
public class StrategyOneDataHandler {

	private String inquiryCode = "test";
	
	private String processCode = "Globe_Project";
	
	@Autowired
	private S1ApplicationDataHandler applicationDataHandler = new S1ApplicationDataHandler();
	
	public S1Request prepareStrategyOneRequest(GlobeEntityRequest request,
			boolean flag) {
		S1Request s1Request = new S1Request();
		StrategyOneRequest strategyOneRequest = new StrategyOneRequest();
		strategyOneRequest.setHeader(prepareHeader());
		strategyOneRequest.setBody(prepareBody(request, flag));
		s1Request.setStrategyOneRequest(strategyOneRequest);
		return s1Request;
	}

	private Body prepareBody(GlobeEntityRequest request, boolean flag) {
//		S1ApplicationDataHandler applicationDataHandler = new S1ApplicationDataHandler();
		Body s1RequestBody = new Body();
		Application application = applicationDataHandler.prepareApplicationData(request, flag);
		s1RequestBody.setApplication(application);
		return s1RequestBody;
		
	}

	private Header prepareHeader() {
		Header header = new Header();
		header.setInquiryCode(inquiryCode);
		header.setProcessCode(processCode);
		return header;
	}

}
