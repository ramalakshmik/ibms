package com.aruvi.ibms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aruvi.ibms.model.Network;
import com.aruvi.ibms.service.NetworkService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/networks")
public class NetworkController {

	@Autowired
	private NetworkService networkService;

	@PostMapping
	public Network create(@RequestBody Network network) {
		return networkService.create(network);
	}

	@GetMapping(path = { "/{id}" })
	public Network findOne(@PathVariable("id") String id) {
		return networkService.findByNetworkId(id);
	}

	@PutMapping
	public Network update(@RequestBody Network network) {
		return networkService.update(network);
	}

	@DeleteMapping(path = { "/{id}" })
	public Network delete(@PathVariable("id") String id) {
		return networkService.delete(id);
	}

	@GetMapping
	public List<Network> findAll() {
		return networkService.findAll();
	}
}
