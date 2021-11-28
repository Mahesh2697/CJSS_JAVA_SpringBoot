package com.cjss.project.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class DateServiceTest {
    private  DateService dateService = new DateService();

    @Test
    public void shouldReturnValidDayOfWeek() {
        String dayOfWeek = dateService.dayOfWeek(1);
        assertEquals( "Sunday", dayOfWeek);
    }
}
