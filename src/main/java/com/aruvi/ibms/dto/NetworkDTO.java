package com.aruvi.ibms.dto;

public class NetworkDTO {

	private Integer networkId;
	private String networkName;
	private String displayName;
	private String connectionType;
	private String hostIP;
	private String hostPort;

	/**
	 * @return the networkId
	 */
	public Integer getNetworkId() {
		return networkId;
	}

	/**
	 * @param networkId the networkId to set
	 */
	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}

	/**
	 * @return the networkName
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * @param networkName the networkName to set
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the connectionType
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * @param connectionType the connectionType to set
	 */
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * @return the hostIP
	 */
	public String getHostIP() {
		return hostIP;
	}

	/**
	 * @param hostIP the hostIP to set
	 */
	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}

	/**
	 * @return the hostPort
	 */
	public String getHostPort() {
		return hostPort;
	}

	/**
	 * @param hostPort the hostPort to set
	 */
	public void setHostPort(String hostPort) {
		this.hostPort = hostPort;
	}
}
