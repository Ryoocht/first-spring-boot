package com.ryochi.springproject.respository;

import com.ryochi.springproject.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long>{

}
