package com.aruvi.ibms.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aruvi.ibms.model.Network;

public interface NetworkRepository extends MongoRepository<Network, String> {

	void delete(Network network);

	List<Network> findAll();

	Network findByNetworkId(String id);

	Network save(Network network);

}
