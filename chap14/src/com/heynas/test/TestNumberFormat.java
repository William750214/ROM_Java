package com.heynas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/**
 * <p> Description:  TestNumberFormat </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestNumberFormat {
    public static void main(String[] args) throws ParseException {
//        NumberFormat nf = NumberFormat.getNumberInstance(Locale.CHINA);
//        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
//        NumberFormat nf = NumberFormat.getPercentInstance(Locale.CHINA);
//        NumberFormat nf = NumberFormat.getPercentInstance(Locale.GERMANY);
//        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);

        nf.setMaximumFractionDigits(6);
        nf.setMinimumFractionDigits(2);

        long l = 123456789l;
        double d = 123456789.123556789;

//        System.out.println(nf.format(l));
//        System.out.println(nf.format(d));

        System.out.println(nf.parse("$123,456,789.00"));

        Set set = Currency.getAvailableCurrencies();

        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            Currency currency = (Currency) iterator.next();
            System.out.println(currency.getCurrencyCode() + " " + currency.getDisplayName() + " " + currency.getSymbol(Locale.US));
        }


    }
}
