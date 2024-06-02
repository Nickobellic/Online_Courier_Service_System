package com.example.test.ocss;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.example.test.ocss.model.Seller;
import com.example.test.ocss.repository.SellerRepository;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OcssApplicationController {

    @Autowired
    private SellerRepository sellRep;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hey";
    }
    
    @GetMapping("/sellers")
    public List<Seller> getSellers() {
        return sellRep.findAll();
    }
    
}
