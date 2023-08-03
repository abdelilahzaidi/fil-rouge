package be.digitalicty.filrouge.presentation_layer.controllers;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/work")
@Data
public class WorkController {
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "ToDo today";
    }
}
