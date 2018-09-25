package com.aruvi.ibms.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.MultiValueMap;

public class IBMSUtilService {
	
	public static MultiValueMap<String, Object> jsonMap(List platformList,MultiValueMap<String, Object> dataResponse)
	{
		//MultiValueMap<String, Object> dataResponse = new LinkedMultiValueMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		Object[] objArr = platformList.toArray();
		map.put("networkList", objArr);
		map.put(IBMSCommonUtils.STATUS_KEY, IBMSCommonUtils.STATUS_OK);
		map.put(IBMSCommonUtils.CONTENT_TYPE_KEY, IBMSCommonUtils.CONTENT_TYPE);
		map.put(IBMSCommonUtils.TOTAL_RECORDS,  platformList.size());
		
		dataResponse.add("DataResponse", map);  
		return dataResponse;
	}

}
