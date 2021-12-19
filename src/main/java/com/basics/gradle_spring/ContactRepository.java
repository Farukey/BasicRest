package com.basics.gradle_spring;
import java.util.List;
import org.springframework.data.repository.CrudRepository;





    public interface ContactRepository extends CrudRepository<Contact, Long> {

        List<Contact> findByLastName(String lastName);
        List<Contact> findByFirstName(String firstName);
        List<Contact> findAll();

        Contact findById(long id);
    }
