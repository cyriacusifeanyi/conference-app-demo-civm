package com.vgg.hospitalmanagementsystem.repositories;

import com.vgg.hospitalmanagementsystem.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}
