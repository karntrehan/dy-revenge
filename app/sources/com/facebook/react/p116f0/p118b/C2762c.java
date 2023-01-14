package com.facebook.react.p116f0.p118b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.f0.b.c */
public class C2762c {

    /* renamed from: a */
    private static volatile C2762c f7826a;

    /* renamed from: b */
    private Map<String, Integer> f7827b = new HashMap();

    private C2762c() {
    }

    /* renamed from: a */
    public static C2762c m11073a() {
        if (f7826a == null) {
            synchronized (C2762c.class) {
                if (f7826a == null) {
                    f7826a = new C2762c();
                }
            }
        }
        return f7826a;
    }

    /* renamed from: b */
    public Drawable mo9027b(Context context, String str) {
        int c = mo9028c(context, str);
        if (c > 0) {
            return context.getResources().getDrawable(c);
        }
        return null;
    }

    /* renamed from: c */
    public int mo9028c(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f7827b.containsKey(replace)) {
                    return this.f7827b.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f7827b.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    /* renamed from: d */
    public Uri mo9029d(Context context, String str) {
        int c = mo9028c(context, str);
        return c > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(c)).build() : Uri.EMPTY;
    }
}
