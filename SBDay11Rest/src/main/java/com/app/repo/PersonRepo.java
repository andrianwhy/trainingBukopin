package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
