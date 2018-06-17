package com.osa.devday;

import com.osa.devday.markdown.MarkdownService;
import com.osa.modules.service.EventService;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Devday {

    private static final Logger log = Logger.getLogger(Devday.class.getName());

    private List<EventService> eventServices;
    private MarkdownService markdownService;

    private Devday() {
        markdownService = new MarkdownService();
        eventServices = ServiceLoader.load(EventService.class).stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }

    private void printEvents() {
        log.info("===================");
        log.info("PGS Events Schedule");
        log.info("===================");

        List<String> events = eventServices.stream()
                .map(EventService::getEvents)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        log.info(markdownService.formatList(events));
    }

    public static void main(String[] args) {
        new Devday().printEvents();
    }
}
