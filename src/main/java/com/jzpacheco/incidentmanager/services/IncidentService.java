package com.jzpacheco.incidentmanager.services;

import com.jzpacheco.incidentmanager.model.Incident;
import com.jzpacheco.incidentmanager.repositories.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IncidentService  {

    @Autowired
    IncidentRepository repository;

    public Incident findById(Long id) throws Exception{
        return repository.findById(id).orElseThrow(()-> new Exception("Teste"));
    }

    public List<Incident> findAll(){
        return repository.findAll();
    }

    public List<Incident> findFistTwenty(){
        return repository.findTop20ByOrderByCreatedAtDesc();
    }

    public Incident create(Incident incident){
        return repository.save(incident);
    }

    public Incident update(Incident incident) throws Exception{
        Incident entity = repository.findById(incident.getId()).orElseThrow(() -> new Exception("Incident not found"));
        entity.setName(incident.getName());
        entity.setDescription(incident.getDescription());
        entity.setUpdatedAt(new Date());
        entity.setClosedAt(incident.getClosedAt());

        return repository.save(entity);
    }

    public void delete(Long id) throws Exception{
        Incident entity = repository.findById(id).orElseThrow(() -> new Exception("Incident not found"));
        repository.delete(entity);
    }
}
