package com.cts.MicroService.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cts.MicroService.client.model.Technology;
import com.cts.MicroService.client.service.TechnologyService;

@RestController
@RequestMapping
@CrossOrigin(origins="*",maxAge=3600)
public class TechnologyController {
	@Autowired
	TechnologyService technologyservice;
@GetMapping("")
public List<Technology> display()
{
return technologyservice.display();	
}
@PostMapping("")
public String addtechnology(@RequestBody Technology technology)
{
technologyservice.add(technology);
return "Added Successfully";
}
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
public Optional<Technology> getlist(@PathVariable Long id) {
	return technologyservice.getById(id);
}
@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
public String deleteTech(@PathVariable Long id) {
	technologyservice.delete(id);
	return "Deleted Successfully";
	
}
@RequestMapping(value = "", method = RequestMethod.PUT)
public String updatetechnology(@RequestBody Technology technology) {
	 technologyservice.update(technology);
	 return "Updated Successfully";
}
}
