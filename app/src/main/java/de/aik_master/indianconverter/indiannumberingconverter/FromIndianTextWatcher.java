package de.aik_master.indianconverter.indiannumberingconverter;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import java.math.BigDecimal;

class FromIndianTextWatcher implements TextWatcher {
    private final FromIndianConverter fromIndianConverter;
    private final TextView fromIndianResult;

    public FromIndianTextWatcher(FromIndianConverter fromIndianConverter, TextView fromIndianResult) {
        this.fromIndianConverter = fromIndianConverter;
        this.fromIndianResult = fromIndianResult;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (s.length() == 0) {
            fromIndianResult.setText("");
            return;
        }

        fromIndianResult.setText(fromIndianConverter.getConversion(s).toString());
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
