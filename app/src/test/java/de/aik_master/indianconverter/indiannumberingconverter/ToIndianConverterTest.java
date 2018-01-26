package de.aik_master.indianconverter.indiannumberingconverter;

import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ToIndianConverterTest {
    private static ToIndianConverter subject;

    @BeforeClass
    public static void setUp() throws Exception {
        subject = new ToIndianConverter();
    }

    @Test
    public void shouldReturn666CroreCroreFor66600000000000000() throws Exception {
        assertEquals("666 crore crore", subject.getConversion(new BigDecimal("66600000000000000")));
    }

    @Test
    public void shouldReturn1LakhCroreFor1000000000000() throws Exception {
        assertEquals("1 lakh crore", subject.getConversion(new BigDecimal("1000000000000")));
    }
    @Test
    public void shouldReturn1ThousandCroreFor10000000000() throws Exception {
        assertEquals("1 thousand crore", subject.getConversion(new BigDecimal("10000000000")));
    }
    @Test
    public void shouldReturn1CroreFor10000000() throws Exception {
        assertEquals("1 crore", subject.getConversion(new BigDecimal("10000000")));
    }
    @Test
    public void shouldReturn1LakhFor100000() throws Exception {
        assertEquals("1 lakh", subject.getConversion(new BigDecimal("100000")));
    }
}