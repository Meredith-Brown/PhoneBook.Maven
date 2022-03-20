package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        Map<String, List<String>> phonebook = new HashMap<>();
        this.phonebook = phonebook;
    }

    public void add(String name, String phoneNumber) {
        List<String> phoneNumberList = new ArrayList<>();
        phoneNumberList.add(phoneNumber);
        phonebook.put(name, phoneNumberList);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> phoneNumberList = new ArrayList<>();
        for (int i = 0; i < phoneNumbers.length; i++) {
            phoneNumberList.add(phoneNumbers[i]);
        }
        phonebook.put(name, phoneNumberList);
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
