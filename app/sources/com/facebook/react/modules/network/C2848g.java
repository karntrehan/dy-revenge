package com.facebook.react.modules.network;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.react.modules.network.g */
public class C2848g {

    /* renamed from: a */
    private static OkHttpClient f8016a;

    /* renamed from: b */
    private static C2847f f8017b;

    /* renamed from: a */
    public static OkHttpClient m11298a() {
        C2847f fVar = f8017b;
        return fVar != null ? fVar.mo9226a() : m11300c().build();
    }

    /* renamed from: b */
    public static OkHttpClient m11299b(Context context) {
        C2847f fVar = f8017b;
        return fVar != null ? fVar.mo9226a() : m11301d(context).build();
    }

    /* renamed from: c */
    public static OkHttpClient.Builder m11300c() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(0, timeUnit).readTimeout(0, timeUnit).writeTimeout(0, timeUnit).cookieJar(new C2855l());
    }

    /* renamed from: d */
    public static OkHttpClient.Builder m11301d(Context context) {
        return m11302e(context, 10485760);
    }

    /* renamed from: e */
    public static OkHttpClient.Builder m11302e(Context context, int i) {
        OkHttpClient.Builder c = m11300c();
        return i == 0 ? c : c.cache(new Cache(new File(context.getCacheDir(), "http-cache"), (long) i));
    }

    /* renamed from: f */
    public static OkHttpClient m11303f() {
        if (f8016a == null) {
            f8016a = m11298a();
        }
        return f8016a;
    }
}
