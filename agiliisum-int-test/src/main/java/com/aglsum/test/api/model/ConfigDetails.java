package com.aglsum.test.api.model;

public class ConfigDetails {
	
	private String status;
	private String configDtls;
	public ConfigDetails(String status, String configDtls) {
		super();
		this.status = status;
		this.configDtls = configDtls;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConfigDtls() {
		return configDtls;
	}
	public void setConfigDtls(String configDtls) {
		this.configDtls = configDtls;
	}
	@Override
	public String toString() {
		return "ConfigDetails [status=" + status + ", configDtls=" + configDtls + "]";
	}
	
	

}
