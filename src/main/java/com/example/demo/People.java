package com.example.demo;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;
    
    People() {
    }
    
    People(List<PersonType> personList) {
        this.personList = personList;
    }
    
    void add(PersonType personType) {
        personList.add(personType);
    }
    
    void remove(PersonType personType) {
        personList.remove(personType);
    }
    
    Integer size(List<PersonType> personList) {
        return personList.size();
    }
    
    void clear(List<PersonType> personList) {
        personList.clear();
    }
    
    void addAll() {
        for (PersonType personType : personList) {
            personList.add(Iterable < PersonType >);
        }
    }
    
    public PersonType getById(Long id) {
        for (PersonType p : personList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    List<PersonType> findAll() {
        return personList;
    }
}
