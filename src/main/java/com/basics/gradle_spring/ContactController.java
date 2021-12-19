package com.basics.gradle_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController
{
    @Autowired
    private ContactRepository contactRepository;


    @PostMapping(value= "/contact")
    @ResponseBody
    public String createContact(@RequestBody Contact contact)
    {
        contactRepository.save(contact);
        return contact.toString();
    }

    @GetMapping(value= "/contact")
    @ResponseBody
    public String getContactByFirstName(@RequestBody Contact contact)
    {
        List<Contact> contacts = contactRepository.findByFirstName(contact.getFirstName());
        Optional<Contact> first = contacts.stream().findFirst();
        if(first.isPresent())
        {
            return first.get().toString();

        }
        return "contact not found.";
    }

    @GetMapping(value= "/contact/findAll")
    @ResponseBody
    public String findAll()
    {
        return contactRepository.findAll().toString();
    }

    @DeleteMapping(value= "/contact")
    @ResponseBody
    public String deleteContact(@RequestBody Contact contact)
    {
        contactRepository.delete(contact);
            return contact.toString();

    }


}
