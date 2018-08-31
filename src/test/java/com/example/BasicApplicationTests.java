package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {
    
    @LocalServerPort
    private int port;
    
    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        // assertThat(this.restTemplate.getForObject(url, responseType))
    }
    
    

}
