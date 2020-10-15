package com.example.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;

import java.util.List;


@RestController

public class HelloController {

    @Autowired
    private PersonService personService;

    @GetMapping(value= "/person")
    public List<person> getallperson() {
        //System.out.println("id= "+ id);
        return  personService.getPersonList();
    }
    @PostMapping("/person")
    public void createuser(@RequestBody person person){
        //System.out.println("id = "+ id);
        PersonService.addPerson(person);
    }

    @RequestMapping(value= "/person/{id}", method = RequestMethod.DELETE)
    public void deleteuser(@PathVariable("id") String id){
        personService.deletePerson(id);
    }

    @RequestMapping(value="/person/{name}", method = RequestMethod.PUT)
    public void update(@RequestBody person person, @PathVariable String name){
        PersonService.updatePerson(name, person);
    }


    @RequestMapping(value="/user/nidhee", method = RequestMethod.POST)
    // @GetMapping("/user")
    public String hii(@RequestBody String ants){
        System.out.println("id = "+ ants);
        return "created new user with id= "+ ants;
    }

}