package com.aruvi.ibms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aruvi.ibms.dao.PlatformDAO;
import com.aruvi.ibms.dto.PlatformDTO;
import com.aruvi.ibms.exception.RecordNotFoundException;
import com.aruvi.ibms.model.Platform;
import com.aruvi.ibms.service.PlatformService;

@Service
public class PlatformServiceImpl implements PlatformService{
	
	
	
	 @Autowired
		private PlatformDAO platformDao;

		public List<PlatformDTO> findPlatform() {
			// TODO Auto-generated method stub
			
			List<PlatformDTO> platformList=new ArrayList<PlatformDTO>();
			List<Platform> platform = platformDao.getAllPlatform();
			
			if(platform  != null)
			{
				for(Platform plat:platform)
				{
					PlatformDTO platDto = new PlatformDTO();
					if(platDto != null)
					{
					platDto.setPlatformName(plat.getPlatformName());
					platDto.setDisplayName(plat.getDisplayName());
					platDto.setPlatformDetail(plat.getPlatformDetail());
					platDto.setPlatformType(plat.getPlatformType());
					platDto.set_id(plat.get_id());
					platDto.setP_status(plat.getP_status());
					platDto.setNetworkId(plat.getNetworkId());
					platDto.setNetworkName(plat.getNetworkName());
					platDto.setCreatedBy(plat.getCreatedBy());
					platDto.setCreatedOn(plat.getCreatedOn());
					platDto.setUpdatedBy(plat.getUpdatedBy());
					platDto.setUpdatedOn(plat.getUpdatedOn());
					platformList.add(platDto);
				}
			  }
			}
			
		
		return platformList;
		
		}
		
		
		

	/*@Override
	public Platform create(Platform platform) {
		// TODO Auto-generated method stub
		return platformRepository.save(platform);
	}*/

	/*@Override
	public Platform delete(String platformName) {
		Platform platform=findbyPlatformName(platformName);
		if(platform !=null) {
			platformRepository.delete(platform);
		}
		return platform;
	}*/

	//@Override
	//public List<Platform> findAll() {
		// TODO Auto-generated method stub
	//	return platformRepository.findAll();
	//}

	/*@Override
	public Platform update(Platform platform) {
		// TODO Auto-generated method stub
		return null;
	}

	*/
	/*public PlatformDTO findByPlatformName(String platformName)
	{
		PlatformDTO platformDto = new PlatformDTO();
		Platform platform = platformDao.findByPlatformName(platformName);
				
			if(platform == null) {
				
				platform.setPlatformName(platformDto.getPlatformName());
				platform.set_id(platformDto.get_id());
				platform.setPlatformType(platformDto.getPlatformType());
				platform.setPlatformDetail(platformDto.getPlatformDetail());
				platform.setNetworkId(platformDto.getNetworkId());
				platform.setNetworkName(platformDto.getNetworkName());
			}
			
		return platformDto;
	}*/
		
		/*@Override
		public PlatformDTO findByPlatformName(String platformName)
		{
		
			PlatformDTO platDto = new PlatformDTO(); 
			Platform platform = platformDao.findByPlatformName(platformName);
			if(platform ==null)
			{
				setDtoValues(platDto,platform);
			}
			return platDto;
		}*/
		
		
	
	/*@Override
	public void addPlatform(Platform platform) {
		// TODO Auto-generated method stub
		
	}*/
  

	@Override
	public PlatformDTO addPlatform(PlatformDTO platformDto) {
		// TODO Auto-generated method stub
		Platform platform = new Platform();
		
		if(platformDto !=null)
		{
			platform.setPlatformName(platformDto.getDisplayName());
			platform.setDisplayName(platformDto.getDisplayName());
			platform.setPlatformDetail(platformDto.getPlatformDetail());
			platform.setPlatformType(platformDto.getPlatformType());
			platform.setNetworkId(platformDto.getNetworkId());
			platform.setNetworkName(platformDto.getNetworkName());
			platform.setCreatedBy(platformDto.getCreatedBy());
			platform.setCreatedOn(platformDto.getCreatedOn());
			platform.setUpdatedBy(platformDto.getUpdatedBy());
			platform.setUpdatedOn(platformDto.getUpdatedOn());    
			
		}
		platform = platformDao.savePlatform(platform);
		return platformDto;
		
		//platformDto.savePlatform(platform);
		
	}



	@Override
	public PlatformDTO updateplatform(PlatformDTO platformDto) throws RecordNotFoundException {
		
		Platform platform = platformDao.findOneById(platformDto.get_id());
		
		Platform modplatform = new Platform();
		
		if(platform != null)
		{
			
			modplatform.setPlatformName(platformDto.getPlatformName());
			modplatform.setDisplayName(platformDto.getDisplayName());
			modplatform.setPlatformDetail(platformDto.getPlatformDetail());
			modplatform.setPlatformType(platformDto.getPlatformType());
			modplatform.setNetworkId(platformDto.getNetworkId());
			modplatform.setNetworkName(platformDto.getNetworkName());
			modplatform.setCreatedBy(platformDto.getCreatedBy());
			modplatform.setCreatedOn(platformDto.getCreatedOn());
			modplatform.setUpdatedBy(platformDto.getUpdatedBy());
			modplatform.setUpdatedOn(platformDto.getCreatedOn());
	
		}
		
		
		
		platformDao.updatePlatform(modplatform,platformDto.get_id());
		return platformDto;	
	}



	@Override
	public void deleteplatform(String id) {
		
		Platform platform = platformDao.findOneById(id);
		if(platform != null)
		{
			
		    platformDao.deletePlatform(platform);
		    
		}
	}



	

	
}
