package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class AndroidUnicodeUtils {
    @C6410a
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale = z ? Locale.getDefault() : Locale.ENGLISH;
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        throw new RuntimeException("Invalid target case");
    }

    @C6410a
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat dateFormat;
        if (z && z2) {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            dateFormat = DateFormat.getDateInstance(2);
        } else if (z2) {
            dateFormat = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException("Bad dateFormat configuration");
        }
        return dateFormat.format(Long.valueOf((long) d)).toString();
    }

    @C6410a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @C6410a
    public static String normalize(String str, int i) {
        Normalizer.Form form;
        if (i == 0) {
            form = Normalizer.Form.NFC;
        } else if (i == 1) {
            form = Normalizer.Form.NFD;
        } else if (i == 2) {
            form = Normalizer.Form.NFKC;
        } else if (i == 3) {
            form = Normalizer.Form.NFKD;
        } else {
            throw new RuntimeException("Invalid form");
        }
        return Normalizer.normalize(str, form);
    }
}
