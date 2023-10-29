package com.crif.globe.utility.service.s1;

import java.util.List;

import org.springframework.stereotype.Component;

import com.crif.globe.utility.domain.s1.request.Application;
import com.crif.globe.utility.domain.s1.request.ApplicationVariables;
import com.crif.globe.utility.domain.s1.request.Categories;
import com.crif.globe.utility.entity.GlobeEntityRequest;

@Component
public class S1ApplicationDataHandler {

	public Application prepareApplicationData(GlobeEntityRequest request, boolean flag) {
		S1ApplicationVariableDataHandler applicationVariableDataHandler = new S1ApplicationVariableDataHandler();
		S1ApplicationCategoriesDataHandler applicationCategoriesDataHandler = new S1ApplicationCategoriesDataHandler();
		Application application = new Application();
		ApplicationVariables applicationVariables = applicationVariableDataHandler.prepareApplicationVariables(request);
		application.setVariables(applicationVariables);

		List<Categories> categories = applicationCategoriesDataHandler.prepareApplicationCategories(request, flag);
		application.setCategories(categories);

		return application;
	}

}
