package com.covidtracker.covidalertservice.model;

import java.time.ZonedDateTime;

public class CovidApiData {
	private boolean success;
	private CountryData data;
	private ZonedDateTime lastRefreshed;
	private ZonedDateTime lastOriginUpdate;

	public CovidApiData(boolean success, CountryData data, ZonedDateTime lastRefreshed,
			ZonedDateTime lastOriginUpdate) {
		super();
		this.success = success;
		this.data = data;
		this.lastRefreshed = lastRefreshed;
		this.lastOriginUpdate = lastOriginUpdate;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public CountryData getData() {
		return data;
	}

	public void setData(CountryData data) {
		this.data = data;
	}

	public ZonedDateTime getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(ZonedDateTime lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public ZonedDateTime getLastOriginUpdate() {
		return lastOriginUpdate;
	}

	public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
		this.lastOriginUpdate = lastOriginUpdate;
	}

	@Override
	public String toString() {
		return "CovidApiData [success=" + success + ", data=" + data + ", lastRefreshed=" + lastRefreshed
				+ ", lastOriginUpdate=" + lastOriginUpdate + "]";
	}

}
