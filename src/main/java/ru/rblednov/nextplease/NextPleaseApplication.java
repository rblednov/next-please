package ru.rblednov.nextplease;

import javax.annotation.PostConstruct;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
@Log
public class NextPleaseApplication {
    @PostConstruct
    public void init(){
        System.out.println(
                  "     ====================\n"
                + "     ====== v1.1.3 ======\n"
                + "     ====================");
    }
    public static void main(String[] args) {
        SpringApplication.run(NextPleaseApplication.class);
    }
}
