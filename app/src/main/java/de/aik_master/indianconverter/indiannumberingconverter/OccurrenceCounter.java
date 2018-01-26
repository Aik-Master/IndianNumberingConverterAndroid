package de.aik_master.indianconverter.indiannumberingconverter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceCounter {

    public int count(CharSequence charSequence, String s) {
        int counter = 0;

        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(charSequence);
        while (m.find()) {
            counter++;
        }
        return counter;
    }
}
