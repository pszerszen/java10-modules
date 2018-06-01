package com.osa.devday.markdown;

import java.util.List;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;

public class MarkdownService {

    public String formatList(List<String> events) {
        return events.stream()
                .map(e -> "* " + e)
                .collect(joining(lineSeparator()));
    }
}
