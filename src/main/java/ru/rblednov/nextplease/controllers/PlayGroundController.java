package ru.rblednov.nextplease.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class PlayGroundController {
    public static volatile ArrayList<String> dialog = new ArrayList<>();

    @RequestMapping("/dialog/")
    public String dialog(@RequestParam(name = "msg", required = false) String message) {

        log.info("/dialog/: {}", message);
        String response = "";
        if(message!=null && !message.isEmpty()){
            dialog.add(LocalDateTime.now() + " : " + message);
        }
        response = dialog.stream()
                .skip(Math.max(0, dialog.size() - 5))
                .collect(Collectors.joining("<br><br>"));
        return response;
    }

    @RequestMapping("/dialog/clean")
    public String clean() {
        log.info("/dialog/clean");
        dialog = new ArrayList<>();
        return "dialog is empty";
    }
}
