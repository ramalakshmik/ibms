package com.aruvi.ibms.service;

import java.util.List;

import com.aruvi.ibms.dto.PlatformDTO;


public interface PlatformService {
	
//Platform create(Platform platform);

//Platform delete(String id);

List<PlatformDTO> findPlatform();

//Platform update(Platform platform);

//PlatformDTO findByPlatformName(String platformName) throws Exception;

//void addPlatform(Platform platform);
//List<PlatformDTO> findPlatfrom();

//List<PlatformDTO> findPlatform();

PlatformDTO addPlatform(PlatformDTO platformDto);

PlatformDTO updateplatform(PlatformDTO platformDto);

void deleteplatform(String id);  

}
