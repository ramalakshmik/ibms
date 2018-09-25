/*package com.aruvi.ibms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aruvi.ibms.dto.NetworkDTO;
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
	public NetworkDTO delete(String networkName) {
		NetworkDTO network = findByNetworkName(networkName);
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
	public NetworkDTO findByNetworkName(String networkName) {
		return networkRepository.findByNetworkName(networkName);
	}

	@Override
	public Network update(Network network) {
		return null;
	}

	@Override
	public void addNetwork(Network network) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NetworkDTO> findNetworks() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
*/