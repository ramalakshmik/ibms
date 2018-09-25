package com.aruvi.ibms.dao;

import java.util.List;

import com.aruvi.ibms.model.Platform;

public interface PlatformDAO{
	
	
	List<Platform> getAllPlatform();
	
	Platform savePlatform(Platform platform);

	Platform findByPlatformName(String platformName);
	
	
	Platform updatePlatform(Platform platform,String platformId);   

	Platform findOneById(String get_id);

	Platform deletePlatform(Platform platform);
	

	
	
	
	/*Platform findOneByPlatformName(String PlatformName); */

}
