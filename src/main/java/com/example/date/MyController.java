package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String getTodaysDate(){

        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dateObj.format(format1);
        
        return date;

    }
}
