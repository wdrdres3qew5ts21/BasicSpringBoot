/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.th.kmutt.sit.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author wdrdr
 */
@RestController
public class UserController {
    
    @RequestMapping("/users")
    public ArrayList<User> getUser() {
        System.out.println("/users  with out RequestParam");
        ArrayList<User> users = new ArrayList<>();
        users.add(0, new User(1, "Supakorn"));
        users.add(1, new User(2, "Brian Fargo"));
        users.add(2, new User(3, "Chris Avellon"));
        users.add(3, new User(4, "Naomi Lin"));
        users.add(4, new User(5, "Clarrisa C"));
        return users;
    }
    
    @RequestMapping("/user")
    public User getUser(@RequestParam("userId") int userId) {
        System.out.println("/user?userId=" + userId);
        ArrayList<User> users = new ArrayList<>();
        users.add(0, new User(1, "Supakorn"));
        users.add(1, new User(2, "Brian Fargo"));
        users.add(2, new User(3, "Chris Avellon"));
        users.add(3, new User(4, "Naomi Lin"));
        users.add(4, new User(5, "Clarrisa C"));
        return users.get(userId - 1);
    }
    
}
