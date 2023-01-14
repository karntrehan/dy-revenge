package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.C2503k0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import p174e.p247e.p294k.p297b.p298a.C6260b;

/* renamed from: com.facebook.react.modules.fresco.b */
class C2820b extends C6260b {

    /* renamed from: d */
    private final OkHttpClient f7969d;

    /* renamed from: e */
    private final Executor f7970e;

    public C2820b(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.f7969d = okHttpClient;
        this.f7970e = okHttpClient.dispatcher().executorService();
    }

    /* renamed from: n */
    private Map<String, String> m11233n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    /* renamed from: i */
    public void mo8304d(C6260b.C6264c cVar, C2503k0.C2504a aVar) {
        cVar.f17348f = SystemClock.elapsedRealtime();
        Uri g = cVar.mo8349g();
        Map<String, String> n = cVar.mo8344b().mo8240f() instanceof C2819a ? m11233n(((C2819a) cVar.mo8344b().mo8240f()).mo9183y()) : null;
        if (n == null) {
            n = Collections.emptyMap();
        }
        mo18577j(cVar, aVar, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(g.toString()).headers(Headers.m36981of(n)).get().build());
    }
}
