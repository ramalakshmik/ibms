/*package com.aruvi.ibms.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aruvi.ibms.dto.NetworkDTO;
import com.aruvi.ibms.model.Network;

public interface NetworkRepository extends MongoRepository<Network, String> {

	void delete(NetworkDTO network);

	List<Network> findAll();

	Network findByNetworkName(String networkName);  

	Network save(Network network);

}
*/