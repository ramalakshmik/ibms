package com.aruvi.ibms.service;

import java.util.List;

import com.aruvi.ibms.model.Network;

public interface NetworkService {

	Network create(Network network);

	Network delete(String id);

	List<Network> findAll();

	Network update(Network network);

	Network findByNetworkId(String id);

}
