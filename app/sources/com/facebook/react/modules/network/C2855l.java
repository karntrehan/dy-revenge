package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.modules.network.l */
public class C2855l implements C2837a {

    /* renamed from: a */
    private CookieJar f8029a = null;

    /* renamed from: a */
    public void mo9207a() {
        this.f8029a = null;
    }

    /* renamed from: b */
    public void mo9208b(CookieJar cookieJar) {
        this.f8029a = cookieJar;
    }

    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.f8029a;
        if (cookieJar == null) {
            return Collections.emptyList();
        }
        List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (Cookie next : loadForRequest) {
            try {
                new Headers.Builder().add(next.name(), next.value());
                arrayList.add(next);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.f8029a;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }
}
