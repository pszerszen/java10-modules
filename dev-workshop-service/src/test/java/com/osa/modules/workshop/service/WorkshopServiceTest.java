package com.osa.modules.workshop.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkshopServiceTest {

    @Test
    void testGetEvents() {
        WorkshopService ts = new WorkshopService();
        assertEquals(4, ts.getEvents().size());
    }

    @Test
    void testPrefix() {
        assertEquals(WorkshopService.prefix("blah blah"), "Workshop: blah blah");
    }

}