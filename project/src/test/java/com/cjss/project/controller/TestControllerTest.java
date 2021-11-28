package com.cjss.project.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;


@RunWith(MockitoJUnitRunner.class)
public class TestControllerTest {

    @InjectMocks
    private TestController testController;

    @Test
    public void getCustomerShouldReturnValidMessage(){
        String customersMessage = testController.getCustomers();
        assertEquals("hello world", customersMessage);

    }
}
