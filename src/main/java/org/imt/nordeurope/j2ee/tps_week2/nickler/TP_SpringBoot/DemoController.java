package org.imt.nordeurope.j2ee.tps_week2.nickler.TP_SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DemoController {

    @GetMapping(path = "/{id}", produces = "application/json")
    public Book getBook(@PathVariable int id){
        if(id == 123){
            Book result = new Book(id, "La clé des progiciels Saas", LocalDate.now());
            return result;
        }
        else if(id == 456){
            Book result = new Book(id, "Le dernier Marc Levy", LocalDate.now().plusDays(1));
            return result;
        }
        return null;
    }
}
