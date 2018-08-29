/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.th.kmutt.sit.controller;

/**
 *
 * @author wdrdr
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public String test() {
        return "Test JSON";
    }
    
    @RequestMapping("/eiei")
    public String eiei() {
        return "eiei";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/student/{id}")
    public Student student() {
        
        return new Student("Supakorn", "Trakulmaiphol", 3.67);
    }

}
