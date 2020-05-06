package com.vgg.hospitalmanagementsystem.controllers;

import com.vgg.hospitalmanagementsystem.models.Participant;
import com.vgg.hospitalmanagementsystem.repositories.ParticipantRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantController {
    @Autowired
    private ParticipantRepository participantRepository;

    @GetMapping
    public List<Participant> list() {
        return participantRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Participant get(@PathVariable Long id) {
        return participantRepository.getOne(id);
    }
    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
    public Participant create(@RequestBody final Participant participant){
        return participantRepository.saveAndFlush(participant);
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        //Also, need to check for children records before deleting.
        participantRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Participant update(@PathVariable Long id, @RequestBody Participant participant) {
        //because this is a PUT, we expect all attributes to be passed in. A PATCH would only need...
        //TODO: Add validation that all attributes are passed in, otherwise return a 400 bad payload
        Participant existingParticipant = participantRepository.getOne(id);
        BeanUtils.copyProperties(participant, existingParticipant, "participant_id");
        return participantRepository.saveAndFlush(existingParticipant);
    }
}