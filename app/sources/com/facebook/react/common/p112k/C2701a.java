package com.facebook.react.common.p112k;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.react.common.k.a */
public class C2701a {
    /* renamed from: a */
    public static void m10935a(OkHttpClient okHttpClient, Object obj) {
        for (Call next : okHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(next.request().tag())) {
                next.cancel();
                return;
            }
        }
        for (Call next2 : okHttpClient.dispatcher().runningCalls()) {
            if (obj.equals(next2.request().tag())) {
                next2.cancel();
                return;
            }
        }
    }
}
