package com.covidtracker.covidalertservice.service;

import org.springframework.stereotype.Service;

import com.covidtracker.covidalertservice.model.AlertStatus;
import com.covidtracker.covidalertservice.model.SummaryData;

@Service
public interface AlertService {

	AlertStatus getAlertAboutState(String state);

	SummaryData getOverAllSummary();

}
