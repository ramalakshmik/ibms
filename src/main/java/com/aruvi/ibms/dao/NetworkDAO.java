package com.aruvi.ibms.dao;

import java.util.List;

import com.aruvi.ibms.model.Network;

public interface NetworkDAO{

	Network saveNetwork(Network network);

	List<Network> getAllNetwork();

	Network findOneByNetworkName(String networkName);

}
