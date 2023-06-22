package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeaController {

    private List<Tea> teas = new ArrayList<>();

    public TeaController() {
        teas.addAll(List.of(new Tea("Black"),
                new Tea("Green"),
                new Tea("White"),
                new Tea("Pu-erh")));
    }

    @GetMapping("/tealist")
    public Iterable<Tea> getTeas() {
        return teas;
    }

    @PostMapping("tealist/teas")
    public Tea createTea(@RequestBody Tea tea) {
        teas.add(tea);
        return tea;
    }
}
