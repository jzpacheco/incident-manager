package com.jzpacheco.incidentmanager.controllers;

import com.jzpacheco.incidentmanager.model.Incident;
import com.jzpacheco.incidentmanager.services.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incident/v1")
public class IncidentController {
    @Autowired
    IncidentService service;


    @GetMapping(value = "/{id}",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Incident findById(@PathVariable(value = "id") Long id) throws Exception{
        return service.findById(id);
    }

    @GetMapping(value = {"","limited-to-20/{limitTo20}"},produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Incident> findAll(@PathVariable(value = "limitTo20",required = false) boolean isLimited){
        if (isLimited){
           return service.findFistTwenty();
        }
        return service.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Incident create(@RequestBody Incident incident){
        return service.create(incident);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Incident update (@RequestBody Incident incident) throws Exception{
        return service.update(incident);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
