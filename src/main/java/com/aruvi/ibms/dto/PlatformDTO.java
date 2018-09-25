package com.aruvi.ibms.dto;

public class PlatformDTO extends BaseDTO{
	
	private String platformName;
	private String displayName;
	private String platformDetail;
	private String platformType;
	private String networkName;
	private String networkId;
	
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	public String getNetworkName() { 
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;                      
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPlatformDetail() {
		return platformDetail;
	}
	public void setPlatformDetail(String platformDetail) {
		this.platformDetail = platformDetail;
	}
	public String getPlatformType() {
		return platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

}
