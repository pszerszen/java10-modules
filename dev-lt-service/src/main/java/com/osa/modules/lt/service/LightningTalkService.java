package com.osa.modules.lt.service;

import com.osa.modules.service.EventService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LightningTalkService implements EventService {
    @Override
    public List<String> getEvents() {
        return Stream.of(
                "Java 9 Features in a Nutshell",
                "Kubernates for beginners",
                "OWASP",
                "How to pass AWS certificates",
                "Apache Cassandra vs. MongoDB")
                .map(LightningTalkService::prefix)
                .collect(Collectors.toList());
    }

    static String prefix(String input) {
        return "Lightning Talk: " + input;
    }
}
