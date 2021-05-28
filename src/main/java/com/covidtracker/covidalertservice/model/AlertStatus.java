package com.covidtracker.covidalertservice.model;

import java.util.List;

public class AlertStatus {

	String alertLevel;  //RED,ORANGE, GREEN
	List<String> measuresToBeTaken;
	private StateData summaryData;

	public String getAlertLevel() {
		return alertLevel;
	}

	public void setAlertLevel(String alertLevel) {
		this.alertLevel = alertLevel;
	}

	public List<String> getMeasuresToBeTaken() {
		return measuresToBeTaken;
	}

	public void setMeasuresToBeTaken(List<String> measuresToBeTaken) {
		this.measuresToBeTaken = measuresToBeTaken;
	}


	@Override
	public String toString() {
		return "AlertStatus [alertLevel=" + alertLevel + ", measuresToBeTaken=" + measuresToBeTaken + "]";
	}

	public StateData getSummaryData() {
		return summaryData;
	}

	public void setSummaryData(StateData summaryData) {
		this.summaryData = summaryData;
	}

}
