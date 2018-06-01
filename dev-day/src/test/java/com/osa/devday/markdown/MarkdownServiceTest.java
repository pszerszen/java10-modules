package com.osa.devday.markdown;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static java.lang.System.lineSeparator;

class MarkdownServiceTest {

    @Test
    void formatList() {
        MarkdownService service = new MarkdownService();
        List<String> abc = List.of("a", "b", "c");

        assertEquals("* a" + lineSeparator() + "* b" + lineSeparator() + "* c", service.formatList(abc));
    }
}