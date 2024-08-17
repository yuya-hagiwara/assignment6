package com.tutorial.heIIo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/human")
    public List<Human> GetHuman() {
        List<Human> human = new ArrayList<>();
        human.add(new Human("yuya", 32));
        human.add(new Human("taka", 33));
        return human;
    }
}
