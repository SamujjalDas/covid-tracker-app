package com.covidtracker.covidalertservice.repository;

import org.springframework.stereotype.Service;


import com.covidtracker.covidalertservice.model.StateData;
import com.covidtracker.covidalertservice.model.SummaryData;

@Service
public interface Covid19DataProvider {

	StateData getStateData(String state);

	SummaryData getSummaryData(String string);
}
