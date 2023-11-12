package com.jzpacheco.incidentmanager.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "incidents")
public class Incident {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;

   @CreationTimestamp
   private Date createdAt;

   @UpdateTimestamp
   private Date updatedAt;
   private Date closedAt;

   public Incident() {
   }



   public long getId() {
    return id;
   }

   public void setId(long id) {
    this.id = id;
   }

   public String getName() {
    return name;
   }

   public void setName(String name) {
    this.name = name;
   }

   public String getDescription() {
    return description;
   }

   public void setDescription(String description) {
    this.description = description;
   }

   public Date getCreatedAt() {
    return createdAt;
   }

   public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
   }

   public Date getUpdatedAt() {
    return updatedAt;
   }

   public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
   }

   public Date getClosedAt() {
    return closedAt;
   }

   public void setClosedAt(Date closedAt) {
    this.closedAt = closedAt;
   }

   @Override
   public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Incident incident = (Incident) o;
    return id == incident.id && Objects.equals(name, incident.name) && Objects.equals(description, incident.description) && Objects.equals(createdAt, incident.createdAt) && Objects.equals(updatedAt, incident.updatedAt) && Objects.equals(closedAt, incident.closedAt);
   }

   @Override
   public int hashCode() {
    return Objects.hash(id, name, description, createdAt, updatedAt, closedAt);
   }
}
