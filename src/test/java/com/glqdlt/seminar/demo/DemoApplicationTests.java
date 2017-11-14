package com.glqdlt.seminar.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

    private MockMvc mockMvc;

    @Autowired
    @InjectMocks
    private DemoController demoController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(demoController).build();
    }


    @Test
    public void contextLoads() {

    }

    @Test
    public void testGreeting() throws Exception {

        String message = "Jhun.iw";

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/greeting/").contentType(MediaType.TEXT_PLAIN).content(message)).andReturn();


        log.info("Response As String ==> " + result.getResponse().getContentAsString());
        log.info("Response Status ==> " + result.getResponse().getStatus());


    }

}
