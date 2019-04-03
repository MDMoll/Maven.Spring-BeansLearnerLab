package com.example.demo;

import java.util.Iterator;
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
    
    Integer size() {
        return personList.size();
    }
    
    void clear() {
        personList.clear();
    }
    
    void addAll() {
        personList.addAll(personList);
    }
    
    public PersonType getById(Long id) {
        for (PersonType p : personList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public void findAll() {
        personList.stream()
                .map(personType -> personList)
                .forEach(System.out::println);
    }
    
    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
