package com.loginportal.register;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.loginportal.register.controller.RegisterController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public abstract class AbstractTest {

 

     protected MockMvc mvc;
       @Autowired
       private RegisterController myController;

 

       protected void setUp() {
          mvc = MockMvcBuilders.standaloneSetup(myController)
                    .build();
           
       }
       protected String mapToJson(Object obj) throws JsonProcessingException {
          ObjectMapper objectMapper = new ObjectMapper();
          return objectMapper.writeValueAsString(obj);
       }
       protected <T> T mapFromJson(String json, Class<T> clazz)
          throws JsonParseException, JsonMappingException, IOException {
          
          ObjectMapper objectMapper = new ObjectMapper();
          return objectMapper.readValue(json, clazz);
       }
}
 
