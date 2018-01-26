package de.aik_master.indianconverter.indiannumberingconverter;

import java.math.BigDecimal;

class ToIndianConverter {
    private static final BigDecimal CRORE_CRORE = new BigDecimal("100000000000000");
    private static final BigDecimal LAKH_CRORE = new BigDecimal("1000000000000");
    private static final BigDecimal THOUSAND_CRORE = new BigDecimal("10000000000");
    private static final BigDecimal CRORE = new BigDecimal("10000000");
    private static final BigDecimal LAKH = new BigDecimal("100000");


    public String getConversion(BigDecimal valueToConvert) {

        if (valueToConvert.compareTo(CRORE_CRORE) > -1) {
            return valueToConvert.divide(CRORE_CRORE) + " crore crore";
        }
        if (valueToConvert.compareTo(LAKH_CRORE) > -1) {
            return valueToConvert.divide(LAKH_CRORE) + " lakh crore";
        }
        if (valueToConvert.compareTo(THOUSAND_CRORE) > -1) {
            return valueToConvert.divide(THOUSAND_CRORE) + " thousand crore";
        }
        if (valueToConvert.compareTo(CRORE) > -1) {
            return valueToConvert.divide(CRORE) + " crore";
        }
        if (valueToConvert.compareTo(LAKH) > -1) {
            return valueToConvert.divide(LAKH) + " lakh";
        }

        return valueToConvert.toString();
    }
}
