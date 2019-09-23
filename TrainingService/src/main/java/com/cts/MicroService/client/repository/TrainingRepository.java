package com.cts.MicroService.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.MicroService.client.model.Training;

public interface TrainingRepository extends JpaRepository<Training,Long> {

	public List<Training> findByMentorIdIn(List<Long> mentorids);
}
