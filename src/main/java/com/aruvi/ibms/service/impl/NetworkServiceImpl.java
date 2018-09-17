package com.aruvi.ibms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aruvi.ibms.model.Network;
import com.aruvi.ibms.repository.NetworkRepository;
import com.aruvi.ibms.service.NetworkService;

@Service
public class NetworkServiceImpl implements NetworkService {
	@Autowired
	private NetworkRepository networkRepository;

	@Override
	public Network create(Network network) {
		return networkRepository.save(network);
	}

	@Override
	public Network delete(String id) {
		Network network = findByNetworkId(id);
		if (network != null) {
			networkRepository.delete(network);
		}
		return network;
	}

	@Override
	public List<Network> findAll() {
		return networkRepository.findAll();
	}

	@Override
	public Network findByNetworkId(String id) {
		return networkRepository.findByNetworkId(id);
	}

	@Override
	public Network update(Network network) {
		return null;
	}
}
