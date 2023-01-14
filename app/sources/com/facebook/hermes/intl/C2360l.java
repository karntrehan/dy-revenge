package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.l */
public class C2360l {

    /* renamed from: com.facebook.hermes.intl.l$a */
    public static class C2361a {

        /* renamed from: a */
        public C2320b<?> f7047a;

        /* renamed from: b */
        public HashMap<String, String> f7048b = new HashMap<>();
    }

    /* renamed from: a */
    public static String m9764a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf("-");
            if (lastIndexOf < 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: b */
    public static ULocale m9765b(C2320b<?> bVar) {
        ULocale[] availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {(ULocale) bVar.mo7935d()};
        boolean[] zArr = new boolean[1];
        ULocale acceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (zArr[0] || acceptLanguage == null) {
            return null;
        }
        return acceptLanguage;
    }

    /* renamed from: c */
    public static C2361a m9766c(String[] strArr) {
        C2361a aVar = new C2361a();
        for (String b : strArr) {
            C2320b b2 = C2362m.m9773b(b);
            ULocale b3 = m9765b(b2);
            if (b3 != null) {
                aVar.f7047a = C2364o.m9791k(b3);
                aVar.f7048b = b2.mo7933b();
                return aVar;
            }
        }
        aVar.f7047a = C2364o.m9789i();
        return aVar;
    }

    /* renamed from: d */
    public static String[] m9767d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (m9765b(C2362m.m9773b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static String[] m9768e() {
        if (Build.VERSION.SDK_INT < 21) {
            return new String[]{"en"};
        }
        ArrayList arrayList = new ArrayList();
        for (Locale languageTag : Locale.getAvailableLocales()) {
            arrayList.add(languageTag.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: f */
    public static C2361a m9769f(String[] strArr) {
        return m9770g(strArr, m9768e());
    }

    /* renamed from: g */
    public static C2361a m9770g(String[] strArr, String[] strArr2) {
        C2361a aVar = new C2361a();
        for (String b : strArr) {
            C2320b b2 = C2362m.m9773b(b);
            String a = m9764a(strArr2, b2.mo7937f());
            if (!a.isEmpty()) {
                aVar.f7047a = C2362m.m9773b(a);
                aVar.f7048b = b2.mo7933b();
                return aVar;
            }
        }
        aVar.f7047a = C2362m.m9772a();
        return aVar;
    }

    /* renamed from: h */
    public static String[] m9771h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] e = m9768e();
        for (String str : strArr) {
            String a = m9764a(e, C2362m.m9773b(str).mo7937f());
            if (a != null && !a.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
