package com.jzpacheco.incidentmanager.repositories;

import com.jzpacheco.incidentmanager.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {

    List<Incident> findTop20ByOrderByCreatedAtDesc();
}
