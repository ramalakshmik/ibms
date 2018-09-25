package com.aruvi.ibms.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "platforms")
public class Platform extends BaseModel{
	
private static final long serialVersionUID = 1L;

 @NotNull
  private String platformName;
  private String displayName;
  private String platformDetail;
  private String networkId;
  private String platformType;
  private String networkName;
  
  
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

public String getNetworkId() {
	return networkId;
}

public void setNetworkId(String networkId) {
	this.networkId = networkId;
}

public String getPlatformType() {
	return platformType;
}
public void setPlatformType(String platformType) {
	this.platformType = platformType;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
 

}
