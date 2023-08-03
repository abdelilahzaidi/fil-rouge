package be.digitalicty.filrouge.presentation_layer.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/intern")
public class InternController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hi intern";
    }
}
