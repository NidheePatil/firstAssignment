package com.example.springboot;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {



    private static List<person> personList= new ArrayList<>(Arrays.asList(
                    new person("nidhee", "patil", 123, "xyz"),
                     new person("abc2", "pqr2", 1234, "xyz2"),
                     new person("abc3", "pqr3", 12345, "xyz3"),
                     new person("abc4", "pqr4", 123456, "xyz4")
    ) );

    public static void addPerson(person person) {
        personList.add(person);
    }

    public static void updatePerson(String name, person person) {
        for(int i=0; i<personList.size(); i++){
            person p= personList.get(i);
            if(p.getFirst_name().equals(name)){
                personList.set(i, person);
                return;
            }
        }
    }

    public List<person> getPersonList(){
                return personList;
            }


    public void deletePerson(String id) {
        for(int i=0; i<personList.size(); i++){
            person p= personList.get(i);
            if(p.getFirst_name().equals(id)){
                personList.remove(p);
                return;
            }
        }
    }
}
