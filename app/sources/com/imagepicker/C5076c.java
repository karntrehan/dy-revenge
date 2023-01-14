package com.imagepicker;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.imagepicker.c */
abstract class C5076c {

    /* renamed from: a */
    protected String f14394a;

    /* renamed from: b */
    protected int f14395b;

    /* renamed from: c */
    protected int f14396c;

    C5076c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15417a(String str, String str2) {
        try {
            Locale locale = Locale.US;
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            if (parse != null) {
                return simpleDateFormat.format(parse);
            }
            return null;
        } catch (Exception e) {
            Log.e("RNIP", "Could not parse image datetime to UTC: " + e.getMessage());
            return null;
        }
    }
}
