package com.aruvi.ibms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.aruvi.ibms.dao.PlatformDAO;
import com.aruvi.ibms.model.Platform;
import com.aruvi.ibms.util.IBMSCommonUtils;
@Repository
public class PlatformDAOImpl implements PlatformDAO{
	
	private final MongoTemplate mongoTemplate;
	
	@Autowired
	public PlatformDAOImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Platform savePlatform(Platform platform) {
		mongoTemplate.save(platform);
		return platform;
	}  
	
	/*@Override
	public Platform findOneByPlatformName(String networkName) {
		Query query=new Query();
		query.addCriteria(Criteria.where(networkName).is(networkName));
		return mongoTemplate.findOne(query,Platform.class);
	}*/

	@Override
	public List<Platform> getAllPlatform() {
		Query query=new Query();
		query.addCriteria(Criteria.where("p_status").is(IBMSCommonUtils.class));
		return mongoTemplate.findAll(Platform.class);
	}

	@Override
	public Platform findByPlatformName(String platformName) {
	     Query query=new Query();
	     query.addCriteria(Criteria.where(platformName).is(platformName));
		return mongoTemplate.findOne(query, Platform.class);
	} 
	
	@Override
	
	public Platform updatePlatform(Platform platform,String platformId)
	{
		Query query=new Query();
		query.addCriteria(Criteria.where("_id").is(platformId));
		
		Update update= new Update();
		
		update.set("platformName",platform.getPlatformName());
		update.set("displayName",platform.getDisplayName());
		update.set("platformDetail",platform.getPlatformDetail());
		update.set("platformType",platform.getPlatformType());
		update.set("networkId",platform.getNetworkId());
		//update.set("networkName",platform.getNetworkName());
/*		update.set("CreatedBy", platform.getCreatedBy());
		update.set("CreatedOn", platform.getCreatedOn());*/
		update.set("UpdatedBy", platform.getUpdatedBy());
		update.set("UpdatedOn", platform.getUpdatedOn());
		mongoTemplate.updateFirst(query, update, Platform.class);
		return platform;
	
	}

	@Override
	public Platform findOneById(String get_id) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(get_id));
		
        return mongoTemplate.findOne(query, Platform.class);
	}

	@Override
	public Platform deletePlatform(Platform platform) {
		
		Query query=new Query();
		query.addCriteria(Criteria.where("_id").is(platform.get_id()));
		
		Update update=new Update();
		update.set("p_status",IBMSCommonUtils.P_STATUS_INACTIVE);
		
		mongoTemplate.updateFirst(query, update, Platform.class);
		return platform;
	}
	
	

}
