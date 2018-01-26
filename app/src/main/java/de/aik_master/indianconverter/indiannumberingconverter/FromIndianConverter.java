package de.aik_master.indianconverter.indiannumberingconverter;

import java.math.BigDecimal;

class FromIndianConverter {
    public BigDecimal getConversion(CharSequence indianValue) {
        String onlyNumericalCharactersInput = indianValue.toString().replaceAll("[^0-9]", "");

        OccurrenceCounter occurrenceCounter = new OccurrenceCounter();
        int croreCounter = occurrenceCounter.count(indianValue, "crore");
        int lakhCounter = occurrenceCounter.count(indianValue, "lakh");

        BigDecimal croreMultiplier = croreCounter > 0 ? new BigDecimal(Conversions.get("crore")).pow(croreCounter): BigDecimal.ONE;
        BigDecimal lakhMultiplier = lakhCounter > 0 ? new BigDecimal(Conversions.get("lakh")).pow(lakhCounter) : BigDecimal.ONE;

        if (onlyNumericalCharactersInput.isEmpty() && croreMultiplier.equals(BigDecimal.ONE) && lakhMultiplier.equals(BigDecimal.ONE)){
            return BigDecimal.ZERO;
        }
        return croreMultiplier.multiply(lakhMultiplier).multiply(! onlyNumericalCharactersInput.isEmpty() ? new BigDecimal(onlyNumericalCharactersInput): BigDecimal.ONE );
    }
}
