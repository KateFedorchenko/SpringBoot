package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/get-data")
    public String getData(){
        return "Hello, world";
    }



}


// Chat app -> global task

// TODO
// Change Path-content of our server -> Profiles to be read about // create several profile // for each profile different port to be used