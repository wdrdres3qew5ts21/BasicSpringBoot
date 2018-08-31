/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.th.kmutt.sit.controller;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wdrdr
 */
public class UserControllerTest {

    public UserControllerTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of getUser method, of class UserController.
     */
    @Test
    public void testGetUserId() {
        System.out.println("testGetUserId");
        UserController userController = new UserController();
        assertEquals(3, userController.getUser(3).getId());
    }
    
    @Test
    public void testGetUserName() {
        System.out.println("testGetUserName");
        UserController userController = new UserController();
        assertEquals("Naomi Lin", userController.getUser(4).getName());
    }

    /**
     * Test of getUser method, of class UserController.
     */
    @Test
    public void testGetTotalUser() {
        System.out.println("testGetUserId");
        UserController userController = new UserController();
        int totalUser = 5;
        assertEquals(totalUser, userController.getUser().size());
    }

    @Test
    public void testIsUser() {
        System.out.println("testIsUser");
        UserController userController = new UserController();
        assertEquals(true, userController instanceof UserController);
    }

}
