package ru.rblednov.nextplease.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.rblednov.nextplease.dto.FrontTaskDto;

@Log4j2
@RestController
public class NextPleaseController {

    @PutMapping("clients/{clientId}/queues/{queueId}/")
    public String putNewTask(@RequestBody FrontTaskDto newTask) {
        log.info("PUT: putNewTask\n{}", newTask);
        return "Hello world";
    }

}
