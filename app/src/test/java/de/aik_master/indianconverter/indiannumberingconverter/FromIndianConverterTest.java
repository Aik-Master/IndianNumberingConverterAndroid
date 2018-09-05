package de.aik_master.indianconverter.indiannumberingconverter;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class FromIndianConverterTest {
    FromIndianConverter subject;

    @Before
    public void setUp() throws Exception {
        subject = new FromIndianConverter();
    }

    @Test
    public void shouldReturn123For123() throws Exception {
        assertEquals(new BigDecimal("123"), subject.getConversion("123"));
    }

    @Test
    public void shouldReturn123For123lak() throws Exception {
        assertEquals(new BigDecimal("123"), subject.getConversion("123lak"));
    }

    @Test
    public void shouldReturn10000For1lakh() throws Exception {
        assertEquals(new BigDecimal("100000"), subject.getConversion("1lakh"));
    }

    @Test
    public void shouldReturn10000000For1crore() throws Exception {
        assertEquals(new BigDecimal("10000000"), subject.getConversion("1crore"));
    }

    @Test
    public void shouldReturn100000For1_lakh() throws Exception {
        assertEquals(new BigDecimal("100000"), subject.getConversion("1 lakh"));
    }

    @Test
    public void shouldReturn100000For1_lakh_crore() throws Exception {
        assertEquals(new BigDecimal("1000000000000"), subject.getConversion("1 lakh crore"));
    }

    @Test
    public void shouldReturn100000For1_lakhcrore() throws Exception {
        assertEquals(new BigDecimal("1000000000000"), subject.getConversion("1 lakhcrore"));
    }
}