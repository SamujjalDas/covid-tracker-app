package com.covidtracker.covidalertservice.repository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import com.covidtracker.covidalertservice.model.CovidApiData;
import com.covidtracker.covidalertservice.model.StateData;
import com.covidtracker.covidalertservice.model.SummaryData;

@Component
public class Covid19DataProviderImpl implements Covid19DataProvider {

	final String url = "https://api.rootnet.in/covid19-in/stats/latest";

	@Autowired
	RestTemplate restTemplate;

	@Override
	public StateData getStateData(String state) {
		CovidApiData covidApiData = restTemplate.getForObject(url, CovidApiData.class);

		return Arrays.stream(covidApiData.getData().getRegional()).filter(e -> e.getLoc().equalsIgnoreCase(state))
				.findAny().orElse(new StateData());

	}

	@Override
	public SummaryData getSummaryData(String string) {
		CovidApiData covidApiData = restTemplate.getForObject(url, CovidApiData.class);
		SummaryData summaryData = covidApiData.getData().getSummary();
		summaryData.setUpdateTime(covidApiData.getLastRefreshed());
		return summaryData;

	}

}
