package de.aik_master.indianconverter.indiannumberingconverter;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import java.math.BigDecimal;

class ToIndianTextWatcher implements TextWatcher {

    private final ToIndianConverter toIndianConverter;
    private final TextView toIndianResult;

    public ToIndianTextWatcher(ToIndianConverter toIndianConverter, TextView toIndianResult) {
        this.toIndianConverter = toIndianConverter;
        this.toIndianResult = toIndianResult;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (s.length() == 0) {
            toIndianResult.setText("");
            return;
        }

        BigDecimal valueToConvert = new BigDecimal(s.toString());
        toIndianResult.setText(toIndianConverter.getConversion(valueToConvert));
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

}

