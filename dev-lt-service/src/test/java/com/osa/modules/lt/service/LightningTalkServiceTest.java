package com.osa.modules.lt.service;

import com.osa.modules.service.EventService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LightningTalkServiceTest {

    @Test
    void testGetEvents() {
        EventService ts = new LightningTalkService();
        assertEquals(5, ts.getEvents().size());
    }

    @Test
    void testPrefix() {
        assertEquals(LightningTalkService.prefix("blah blah"), "Lightning Talk: blah blah");
    }
}