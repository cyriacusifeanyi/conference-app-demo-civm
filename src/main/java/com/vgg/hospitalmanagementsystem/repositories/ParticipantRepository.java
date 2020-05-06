package com.vgg.hospitalmanagementsystem.repositories;

import com.vgg.hospitalmanagementsystem.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {

}
