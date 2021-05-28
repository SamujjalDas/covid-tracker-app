package com.covidtracker.covidalertservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.covidtracker.covidalertservice.model.AlertStatus;
import com.covidtracker.covidalertservice.model.StateData;
import com.covidtracker.covidalertservice.model.SummaryData;
import com.covidtracker.covidalertservice.repository.Covid19DataProvider;

@Component
public class AlertServiceImpl implements AlertService {

	@Autowired
	private Covid19DataProvider covid19DataProvider;

	@Override
	public AlertStatus getAlertAboutState(String state) {

		AlertStatus alertStatus = new AlertStatus();

		StateData stateData = covid19DataProvider.getStateData(state);

		alertStatus.setSummaryData(stateData);

		if (stateData.getTotalConfirmed() < 20000) {
			alertStatus.setAlertLevel("GREEN");
			alertStatus.setMeasuresToBeTaken(Arrays.asList("Everything is normal. Nothing to fear about!"));
		} else if (stateData.getTotalConfirmed() >= 20000 && stateData.getTotalConfirmed() < 100000) {
			alertStatus.setAlertLevel("ORANGE");
			alertStatus.setMeasuresToBeTaken(
					Arrays.asList("Partial lockdown should be implemented","Only essential services should be allowed" ));
		} else if (stateData.getTotalConfirmed() >= 10000) {
			alertStatus.setAlertLevel("RED");
			alertStatus.setMeasuresToBeTaken(
					Arrays.asList("Absolute lockdown should be implemented", "Only Medical and food services should be allowed"));
		}

		return alertStatus;
	}

	@Override
	public SummaryData getOverAllSummary() {
		return covid19DataProvider.getSummaryData("summary");
	}

}
