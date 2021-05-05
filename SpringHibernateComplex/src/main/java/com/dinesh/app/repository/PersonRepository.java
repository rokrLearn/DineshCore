package com.dinesh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.app.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
