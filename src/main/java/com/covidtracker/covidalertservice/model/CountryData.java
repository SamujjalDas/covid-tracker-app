package com.covidtracker.covidalertservice.model;

import java.util.Arrays;

public class CountryData {
	private SummaryData summary;
	private StateData[] regional;

	public SummaryData getSummary() {
		return summary;
	}

	public void setSummary(SummaryData summary) {
		this.summary = summary;
	}

	public StateData[] getRegional() {
		return regional;
	}

	public void setRegional(StateData[] regional) {
		this.regional = regional;
	}

	@Override
	public String toString() {
		return "CountryData [summary=" + summary + ", regional=" + Arrays.toString(regional) + "]";
	}

}
