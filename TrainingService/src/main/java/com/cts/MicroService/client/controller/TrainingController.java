package com.cts.MicroService.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MicroService.client.model.Training;
import com.cts.MicroService.client.service.TrainingService;


@RestController
@RequestMapping("training")
public class TrainingController {
	@Autowired
	TrainingService trainingservice;
	@GetMapping("/list")
	public List<Training> display()
	{
	return trainingservice.display();	
	}
	@PostMapping("/add")
	public String addtechnology(@RequestBody Training training)
	{
	trainingservice.add(training);
	return "Added Successfully";
	}
	@RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
	public Optional<Training> getlist(@PathVariable Long id) {
		return trainingservice.getById(id);
	}
	@RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
	public String deleteTraining(@PathVariable Long id) {
		trainingservice.delete(id);
		return "Deleted Successfully";
		
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updatetraining(@RequestBody Training training) {
		 trainingservice.update(training);
		 return "Updated Successfully";
	}
	
	@PostMapping("/search")
	public List<Training> getAllTrainings(@RequestBody List<Long> mentorids){
		return trainingservice.getAllTrainings(mentorids);
	}
}
