package com.example.test.ocss;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OcssApplicationController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hey";
    }
    
}
