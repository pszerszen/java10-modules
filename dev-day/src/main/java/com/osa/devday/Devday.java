package com.osa.devday;

import com.osa.devday.markdown.MarkdownService;
import com.osa.modules.service.EventService;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Devday {

    private List<EventService> eventServices;
    private MarkdownService markdownService;

    private Devday() {
        markdownService = new MarkdownService();
        eventServices = ServiceLoader.load(EventService.class).stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }

    private void printEvents() {
        System.out.println("===================");
        System.out.println("PGS Events Schedule");
        System.out.println("===================");

        List<String> events = eventServices.stream()
                .map(EventService::getEvents)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(markdownService.formatList(events));
    }

    public static void main(String[] args) {
        new Devday().printEvents();
    }
}
