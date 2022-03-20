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
        Map<String, List<String>> phonebook = new LinkedHashMap<>();
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
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  { // TODO - figure this one out
        String returnName = "";
        List<String> completeContactList = getAllContactNames();
        for (int x = 0; x < completeContactList.size(); x++) {
            String currentName = completeContactList.get(x);
            List<String> currentNumberList = phonebook.get(currentName);
            if (currentNumberList.contains(phoneNumber)) {
                returnName = currentName;
            }
        }
        return returnName;
    }

    public List<String> getAllContactNames() {
        Set<String> phonebookKeySet = phonebook.keySet();
        Object[] intermediate = phonebookKeySet.toArray();
        List<String> contactList = new ArrayList<>();
        for (int m = 0; m < intermediate.length; m++) {
            Object object = intermediate[m];
            String string = object.toString();
            contactList.add(string);
        }
        return contactList;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
