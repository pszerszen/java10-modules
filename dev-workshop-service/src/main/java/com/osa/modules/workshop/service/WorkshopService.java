package com.osa.modules.workshop.service;

import com.osa.modules.service.EventService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkshopService implements EventService {

    @Override
    public List<String> getEvents() {
        return Stream.of(
                "Docker",
                "Kubernetes",
                "Big Data",
                "Amazon")
                .map(WorkshopService::prefix)
                .collect(Collectors.toList());
    }

    static String prefix(String input) {
        return "Workshop: " + input;
    }
}
