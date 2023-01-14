package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.facebook.hermes.intl.o */
public class C2364o implements C2320b<ULocale> {

    /* renamed from: a */
    private ULocale f7052a = null;

    /* renamed from: b */
    private ULocale.Builder f7053b = null;

    /* renamed from: c */
    private boolean f7054c = false;

    private C2364o(ULocale uLocale) {
        this.f7052a = uLocale;
    }

    private C2364o(String str) {
        ULocale.Builder builder = new ULocale.Builder();
        this.f7053b = builder;
        try {
            builder.setLanguageTag(str);
            this.f7054c = true;
        } catch (RuntimeException e) {
            throw new C2354h(e.getMessage());
        }
    }

    /* renamed from: i */
    public static C2320b<ULocale> m9789i() {
        return new C2364o(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    /* renamed from: j */
    public static C2320b<ULocale> m9790j(String str) {
        return new C2364o(str);
    }

    /* renamed from: k */
    public static C2320b<ULocale> m9791k(ULocale uLocale) {
        return new C2364o(uLocale);
    }

    /* renamed from: l */
    private void m9792l() {
        if (this.f7054c) {
            try {
                this.f7052a = this.f7053b.build();
                this.f7054c = false;
            } catch (RuntimeException e) {
                throw new C2354h(e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public String mo7932a() {
        return mo7939h().toLanguageTag();
    }

    /* renamed from: b */
    public HashMap<String, String> mo7933b() {
        m9792l();
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keywords = this.f7052a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                hashMap.put(C2382y.m9889b(next), this.f7052a.getKeywordValue(next));
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public ArrayList<String> mo7934c(String str) {
        m9792l();
        String a = C2382y.m9888a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        String keywordValue = this.f7052a.getKeywordValue(a);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    /* renamed from: e */
    public C2320b<ULocale> mo7936e() {
        m9792l();
        return new C2364o(this.f7052a);
    }

    /* renamed from: f */
    public String mo7937f() {
        return mo7935d().toLanguageTag();
    }

    /* renamed from: g */
    public void mo7938g(String str, ArrayList<String> arrayList) {
        m9792l();
        if (this.f7053b == null) {
            this.f7053b = new ULocale.Builder().setLocale(this.f7052a);
        }
        try {
            this.f7053b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f7054c = true;
        } catch (RuntimeException e) {
            throw new C2354h(e.getMessage());
        }
    }

    /* renamed from: m */
    public ULocale mo7939h() {
        m9792l();
        return this.f7052a;
    }

    /* renamed from: n */
    public ULocale mo7935d() {
        m9792l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f7052a);
        builder.clearExtensions();
        return builder.build();
    }
}
