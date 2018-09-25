/*package com.aruvi.ibms.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aruvi.ibms.dto.NetworkDTO;
import com.aruvi.ibms.model.Network;
import com.aruvi.ibms.service.NetworkService;


@RestController
@RequestMapping("/networks")
public class NetworkController {

	@Autowired
	private NetworkService networkService;

	@RequestMapping(value = "/findNet", method = RequestMethod.GET)
	public List<NetworkDTO> findNetworks() {
		System.out.println("test");
		return networkService.findNetworks();
	}
	
	@RequestMapping(value = "/findNet/{networkName}", method = RequestMethod.GET)
	public NetworkDTO findByNetworkName(@PathVariable("networkName") String networkName) {
		return networkService.findByNetworkName(networkName);
	}
	
	@RequestMapping(value = "/addNetwork", method = RequestMethod.POST)
	public ResponseEntity<Object> addNetwork(@RequestBody Network network) {
		networkService.addNetwork(network);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Network create(@RequestBody Network network) {
		return networkService.create(network);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Network findOne(@PathVariable("networkId") Integer id) {
		return networkService.findByNetworkId(id);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Network update(@RequestBody Network network) {
		return networkService.update(network);
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Network delete(@PathVariable("networkId") Integer id) {
		return networkService.delete(id);
	} 

	
}*/