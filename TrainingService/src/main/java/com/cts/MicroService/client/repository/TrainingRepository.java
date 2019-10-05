package com.cts.MicroService.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.MicroService.client.model.Training;

public interface TrainingRepository extends JpaRepository<Training,Long> {

	public List<Training> findByMentorIdIn(List<Long> mentorids);
	
	@Query(value="SELECT * FROM Training_TB t where t.userId = ?1 and t.progress < 100",nativeQuery = true)
	public List<Training> findCurrentByUserId(Long userid);
	
	@Query(value="SELECT * FROM Training_TB t where t.mentorId = ?1 and t.progress < 100",nativeQuery = true)
	public List<Training> findCurrentByMentorId(Long mentorid);
	
	@Query(value="SELECT * FROM Training_TB t where t.userId = ?1 and t.progress = 100",nativeQuery = true)
	public List<Training> findCompletedByUserId(Long userid);
	
	@Query(value="SELECT * FROM Training_TB t where t.mentorId = ?1 and t.progress = 100",nativeQuery = true)
	public List<Training> findCompletedByMentorId(Long userid);
}
