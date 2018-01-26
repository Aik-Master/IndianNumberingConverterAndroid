package de.aik_master.indianconverter.indiannumberingconverter;

import java.util.HashMap;
import java.util.Map;

public class Conversions {
    final static Map<String, Integer> fromIndian;

    static {
        fromIndian = new HashMap<>();
        fromIndian.put("lakh", 10000);
        fromIndian.put("crore", 10000000);
    }

    public static int get(String key) {
        return fromIndian.get(key);
    }
}
