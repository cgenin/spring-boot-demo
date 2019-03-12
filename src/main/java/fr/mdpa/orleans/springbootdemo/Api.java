package fr.mdpa.orleans.springbootdemo;

import fr.mdpa.orleans.springbootdemo.dto.TestDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

// Déclaration du controller Rest.
@RestController
@RequestMapping("/api")
public class Api {
    // Déclaration du endpoint.
    @RequestMapping("/test")
    public List<TestDto> test(){
        // Renvoie du Dto qui sera transformé en Json.
        return Arrays.asList(
                new TestDto(UUID.randomUUID().toString(), "Luke Skywalker"),
                new TestDto(UUID.randomUUID().toString(), "Dark Vador")
                );
    }
}
