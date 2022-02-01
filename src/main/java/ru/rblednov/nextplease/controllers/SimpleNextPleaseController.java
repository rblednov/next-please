package ru.rblednov.nextplease.controllers;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rblednov.nextplease.dto.SimpleTask;

@RestController
@Log4j2
public class SimpleNextPleaseController {
    @GetMapping("/simple/**")
    public List<SimpleTask> addTask() {
        return null;
    }

    @GetMapping
    public SimpleTask getTask() {
        return null;
    }
}
