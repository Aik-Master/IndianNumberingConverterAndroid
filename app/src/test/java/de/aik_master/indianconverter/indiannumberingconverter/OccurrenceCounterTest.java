package de.aik_master.indianconverter.indiannumberingconverter;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OccurrenceCounterTest {
    private static OccurrenceCounter subject;

    @BeforeClass
    public static void setUp() throws Exception {
        subject = new OccurrenceCounter();
    }

    @Test
    public void shouldReturn1ForHelloinHelloString() throws Exception {
        assertEquals(1, subject.count("hello", "hello"));
    }

    @Test
    public void shouldReturn3For3hellosWithoutWhitespaces() throws Exception {
        assertEquals(3, subject.count("hellohellohello", "hello"));
    }

    @Test
    public void shouldReturn3For3hellosWithWhitespaces() throws Exception {
        assertEquals(3, subject.count("hello hello hello", "hello"));
    }

    @Test
    public void shouldReturn2For2hellosWithAWordInBetween() throws Exception {
        assertEquals(2, subject.count("hello test hello", "hello"));
    }
}