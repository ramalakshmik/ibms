/*package com.aruvi.ibms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.aruvi.ibms.dao.NetworkDAO;
import com.aruvi.ibms.model.Network;

@Repository
public class NetworkDAOImpl implements NetworkDAO {

	private final MongoTemplate mongoTemplate;

	@Autowired
	public NetworkDAOImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Network saveNetwork(Network network) {
		mongoTemplate.save(network);
		return network;
	}

	@Override
	public List<Network> getAllNetwork() {
		return mongoTemplate.findAll(Network.class);
	}

	@Override
	public Network findOneByNetworkName(String networkName) {
		Query query = new Query();
		query.addCriteria(Criteria.where("networkName").is(networkName));
		return mongoTemplate.findOne(query, Network.class);
	}

}
*/