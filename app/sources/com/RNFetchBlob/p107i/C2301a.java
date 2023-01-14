package com.RNFetchBlob.p107i;

import com.RNFetchBlob.C2288f;
import com.RNFetchBlob.C2290g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10625q;

/* renamed from: com.RNFetchBlob.i.a */
public class C2301a extends ResponseBody {

    /* renamed from: f */
    String f6804f;

    /* renamed from: o */
    ReactApplicationContext f6805o;

    /* renamed from: p */
    ResponseBody f6806p;

    /* renamed from: q */
    boolean f6807q = false;

    /* renamed from: com.RNFetchBlob.i.a$a */
    private class C2302a implements C10598d0 {

        /* renamed from: f */
        C10615h f6808f;

        /* renamed from: o */
        long f6809o = 0;

        C2302a(C10615h hVar) {
            this.f6808f = hVar;
        }

        public void close() {
        }

        public long read(C10603f fVar, long j) {
            long read = this.f6808f.read(fVar, j);
            this.f6809o += read > 0 ? read : 0;
            C2288f i = C2290g.m9599i(C2301a.this.f6804f);
            long contentLength = C2301a.this.contentLength();
            if (!(i == null || contentLength == 0 || !i.mo7651a((float) (this.f6809o / C2301a.this.contentLength())))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", C2301a.this.f6804f);
                createMap.putString("written", String.valueOf(this.f6809o));
                createMap.putString("total", String.valueOf(C2301a.this.contentLength()));
                createMap.putString("chunk", C2301a.this.f6807q ? fVar.mo26325N(Charset.defaultCharset()) : HttpUrl.FRAGMENT_ENCODE_SET);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) C2301a.this.f6805o.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", createMap);
            }
            return read;
        }

        public C10600e0 timeout() {
            return null;
        }
    }

    public C2301a(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z) {
        this.f6805o = reactApplicationContext;
        this.f6804f = str;
        this.f6806p = responseBody;
        this.f6807q = z;
    }

    public long contentLength() {
        return this.f6806p.contentLength();
    }

    public MediaType contentType() {
        return this.f6806p.contentType();
    }

    public C10615h source() {
        return C10625q.m36156d(new C2302a(this.f6806p.source()));
    }
}
