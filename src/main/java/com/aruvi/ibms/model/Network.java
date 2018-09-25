/**
 * 
 *//*
package com.aruvi.ibms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

*//**
 * @author sys-user
 *
 *//*
@Document(collection = "network")
public class Network extends BaseModel {

	*//**
		 * 
		 *//*
	private static final long serialVersionUID = 1L;
	@Id
	private String networkId;
	private String networkName;
	private String displayName;
	private String connectionType;
	private String hostIP;
	private String hostPort;
	private String licenseKey;
	private Date licenseExpiryDate;
	private Date installedDate;
	private String valueKey;

	*//**
	 * @return the networkId
	 *//*
	public String getNetworkId() {
		return networkId;
	}

	*//**
	 * @param networkId the networkId to set
	 *//*
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	*//**
	 * @return the networkName
	 *//*
	public String getNetworkName() {
		return networkName;
	}

	*//**
	 * @param networkName the networkName to set
	 *//*
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	*//**
	 * @return the displayName
	 *//*
	public String getDisplayName() {
		return displayName;
	}

	*//**
	 * @param displayName the displayName to set
	 *//*
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	*//**
	 * @return the connectionType
	 *//*
	public String getConnectionType() {
		return connectionType;
	}

	*//**
	 * @param connectionType the connectionType to set
	 *//*
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	*//**
	 * @return the hostIP
	 *//*
	public String getHostIP() {
		return hostIP;
	}

	*//**
	 * @param hostIP the hostIP to set
	 *//*
	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}

	*//**
	 * @return the hostPort
	 *//*
	public String getHostPort() {
		return hostPort;
	}

	*//**
	 * @param hostPort the hostPort to set
	 *//*
	public void setHostPort(String hostPort) {
		this.hostPort = hostPort;
	}

	*//**
	 * @return the licenseKey
	 *//*
	public String getLicenseKey() {
		return licenseKey;
	}

	*//**
	 * @param licenseKey the licenseKey to set
	 *//*
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	*//**
	 * @return the licenseExpiryDate
	 *//*
	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	*//**
	 * @param licenseExpiryDate the licenseExpiryDate to set
	 *//*
	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	*//**
	 * @return the installedDate
	 *//*
	public Date getInstalledDate() {
		return installedDate;
	}

	*//**
	 * @param installedDate the installedDate to set
	 *//*
	public void setInstalledDate(Date installedDate) {
		this.installedDate = installedDate;
	}

	*//**
	 * @return the valueKey
	 *//*
	public String getValueKey() {
		return valueKey;
	}

	*//**
	 * @param valueKey the valueKey to set
	 *//*
	public void setValueKey(String valueKey) {
		this.valueKey = valueKey;
	}

}
*/