package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class Intl {
    /* renamed from: a */
    private static List<String> m9637a(List<String> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (next == null) {
                throw new C2354h("Incorrect locale information provided");
            } else if (!next.isEmpty()) {
                String b = C2359k.m9751b(next);
                if (!b.isEmpty() && !arrayList.contains(b)) {
                    arrayList.add(b);
                }
            } else {
                throw new C2354h("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @C6410a
    public static List<String> getCanonicalLocales(List<String> list) {
        return m9637a(list);
    }

    @C6410a
    public static String toLocaleLowerCase(List<String> list, String str) {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        return i >= 24 ? UCharacter.toLowerCase((ULocale) C2360l.m9766c(strArr).f7047a.mo7939h(), str) : str.toLowerCase((Locale) C2360l.m9769f(strArr).f7047a.mo7939h());
    }

    @C6410a
    public static String toLocaleUpperCase(List<String> list, String str) {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        return i >= 24 ? UCharacter.toUpperCase((ULocale) C2360l.m9766c(strArr).f7047a.mo7939h(), str) : str.toUpperCase((Locale) C2360l.m9769f(strArr).f7047a.mo7939h());
    }
}
