package com.ryochi.springproject.respository;

import com.ryochi.springproject.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{
	
}
