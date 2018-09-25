package com.aruvi.ibms.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.MediaType;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aruvi.ibms.dto.PlatformDTO;
import com.aruvi.ibms.exception.RecordNotFoundException;
import com.aruvi.ibms.service.PlatformService;
import com.aruvi.ibms.util.IBMSCommonUtils;
import com.aruvi.ibms.util.IBMSUtilService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/platform")

public class PlatformController {
	
	@Autowired
	private PlatformService platformService;
	
	MultiValueMap<String, Object> dataResponse = new LinkedMultiValueMap<String,Object>();
	
	List<PlatformDTO>platformList;
	
	@GetMapping("/getAllPlatform")
	//@RequestMapping(value="/findPlat", method = RequestMethod.GET)
	
	
	/*public List<PlatformDTO> findPlatform()
	{
		return platformService.findPlatform();
	}*/
	
	public ResponseEntity<List<PlatformDTO>> getAllPlatform() throws RecordNotFoundException{
		
		platformList = platformService.findPlatform();
		
		if(platformList.isEmpty())
		{
			return new ResponseEntity<List<PlatformDTO>>(HttpStatus.NOT_FOUND);
		}
		
		return ResponseEntity.ok().body(platformList); 
	}
	
	/*@RequestMapping(value="/findPlat/{platformName}",method = RequestMethod.GET)
	public ResponseEntity<PlatformDTO> findByPlatformName(@PathVariable("platformName") String platformName) throws Exception{
		
		if(platformName == null)
		{
			throw new RecordNotFoundException("Invalid Platform Name:"+platformName);
		}
		PlatformDTO platformDto = platformService.findByPlatformName(platformName);
		if(platformDto == null)
		{
			
		}
		return ResponseEntity.ok().body(platformDto);
		else
		{
		PlatformDTO platformDto = platformService.findByPlatformName(platformName);
		{
		   platformService.findByPlatformName(platformName);
		   return ResponseEntity.ok().body(platformDto);
		}
		}
		//platformService.findByPlatformName(platformName); 
		
	}*/
	
	@RequestMapping(value ="/addPlatform", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<MultiValueMap<String, Object>> addPlatform(@RequestBody PlatformDTO platformDto){
		
		if(platformDto == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		PlatformDTO platform = platformService.addPlatform(platformDto);
		
		MultiValueMap<String, Object> dataResponse = new LinkedMultiValueMap<String,Object>();
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("platformList",platform);
		map.put("IBMSCommonUtils.STATUS_KEY", IBMSCommonUtils.STATUS_OK);
		map.put("IBMSCommonUtils.CONTENT_TYPE_KEY", IBMSCommonUtils.CONTENT_TYPE);
		map.put("IBMSCommonUtils.TOTAL_RECORDS", platform);
		
		dataResponse.add("DataResponse", map);
		dataResponse = IBMSUtilService.jsonMap(platformList, dataResponse);
		return ResponseEntity.status(200).body(dataResponse);
		
		/*platformService.addPlatform(platformDto);
		return ResponseEntity.ok().build();*/
		
		
	}
	
	@RequestMapping(value ="/updatePlatform", method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<MultiValueMap<String, Object>>updatePlatform(@RequestBody PlatformDTO platformDto) throws RecordNotFoundException{
		
		if(platformDto == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		PlatformDTO platform = platformService.updateplatform(platformDto);
		platformList.add(platform);
		dataResponse = IBMSUtilService.jsonMap(platformList, dataResponse);
		return ResponseEntity.status(200).body(dataResponse);
	}
	
	@DeleteMapping("/deletePlatform")
	
	public ResponseEntity<Object> deletePlatform(@RequestParam("_id") String id) throws RecordNotFoundException{
		
		if(id.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		platformService.deleteplatform(id);
		return ResponseEntity.ok().build();
		
	}
	
	/*@GetMapping("/getPlatform/{platformName}")
	
	public ResponseEntity<PlatformDTO>getPlatform(@PathVariable("platformName") String platformName){
		
		if(platformName.isEmpty())
		{
			return ResponseEntity.badRequest().build();
		}
		PlatformDTO platform = platformService.findByPlatformName(platformName);
		if(platformName == null)
		{
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().body(platformName);
	}*/
	

}
