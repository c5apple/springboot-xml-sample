package com.example.demo.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/sample")
public class SampleController {

	private static List<SampleResource> store = new ArrayList<SampleResource>();

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<SampleResource> post(@ModelAttribute SampleResource data,
			UriComponentsBuilder uriComponentsBuilder) {
		store.add(data);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriComponentsBuilder.path("/sample/{id}").buildAndExpand(store.size()).toUri());
		return new ResponseEntity<SampleResource>(data, headers, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<SampleResource> get() {
		return store;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public SampleResource get(@PathVariable int id) {
		return store.get(id - 1);
	}

}
