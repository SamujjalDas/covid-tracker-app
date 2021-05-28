package com.covidtracker.covidalertservice.model;

import java.time.ZonedDateTime;

public class SummaryData {
	private int total;
	private int confirmedCasesIndian;
	private int confirmedCasesForeign;
	private int discharged;
	private int deaths;
	private int confirmedButLocationUnidentified;

	private ZonedDateTime updateTime;

	public SummaryData(int total, int confirmedCasesIndian, int confirmedCasesForeign, int discharged, int deaths,
			int confirmedButLocationUnidentified) {
		super();
		this.total = total;
		this.confirmedCasesIndian = confirmedCasesIndian;
		this.confirmedCasesForeign = confirmedCasesForeign;
		this.discharged = discharged;
		this.deaths = deaths;
		this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getConfirmedCasesIndian() {
		return confirmedCasesIndian;
	}

	public void setConfirmedCasesIndian(int confirmedCasesIndian) {
		this.confirmedCasesIndian = confirmedCasesIndian;
	}

	public int getConfirmedCasesForeign() {
		return confirmedCasesForeign;
	}

	public void setConfirmedCasesForeign(int confirmedCasesForeign) {
		this.confirmedCasesForeign = confirmedCasesForeign;
	}

	public int getDischarged() {
		return discharged;
	}

	public void setDischarged(int discharged) {
		this.discharged = discharged;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getConfirmedButLocationUnidentified() {
		return confirmedButLocationUnidentified;
	}

	public void setConfirmedButLocationUnidentified(int confirmedButLocationUnidentified) {
		this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
	}

	@Override
	public String toString() {
		return "SummaryData [total=" + total + ", confirmedCasesIndian=" + confirmedCasesIndian
				+ ", confirmedCasesForeign=" + confirmedCasesForeign + ", discharged=" + discharged + ", deaths="
				+ deaths + ", confirmedButLocationUnidentified=" + confirmedButLocationUnidentified + "]";
	}

	public ZonedDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(ZonedDateTime updateTime) {
		this.updateTime = updateTime;
	}

}
