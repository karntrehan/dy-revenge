package com.RNFetchBlob.p107i;

import com.RNFetchBlob.C2288f;
import com.RNFetchBlob.C2290g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10625q;

/* renamed from: com.RNFetchBlob.i.b */
public class C2303b extends ResponseBody {

    /* renamed from: f */
    String f6811f;

    /* renamed from: o */
    ResponseBody f6812o;

    /* renamed from: p */
    String f6813p;

    /* renamed from: q */
    long f6814q = 0;

    /* renamed from: r */
    ReactApplicationContext f6815r;

    /* renamed from: s */
    FileOutputStream f6816s;

    /* renamed from: t */
    boolean f6817t;

    /* renamed from: com.RNFetchBlob.i.b$b */
    private class C2305b implements C10598d0 {
        private C2305b() {
        }

        /* renamed from: a */
        private void m9611a(String str, long j, long j2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", str);
            createMap.putString("written", String.valueOf(j));
            createMap.putString("total", String.valueOf(j2));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) C2303b.this.f6815r.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", createMap);
        }

        public void close() {
            C2303b.this.f6816s.close();
        }

        public long read(C10603f fVar, long j) {
            float f;
            C2303b bVar;
            String str;
            long j2;
            int i = (int) j;
            try {
                byte[] bArr = new byte[i];
                long read = (long) C2303b.this.f6812o.byteStream().read(bArr, 0, i);
                C2303b bVar2 = C2303b.this;
                int i2 = (read > 0 ? 1 : (read == 0 ? 0 : -1));
                bVar2.f6814q += i2 > 0 ? read : 0;
                if (i2 > 0) {
                    bVar2.f6816s.write(bArr, 0, (int) read);
                } else if (bVar2.contentLength() == -1 && read == -1) {
                    C2303b.this.f6817t = true;
                }
                C2288f i3 = C2290g.m9599i(C2303b.this.f6811f);
                if (C2303b.this.contentLength() != 0) {
                    if (C2303b.this.contentLength() != -1) {
                        C2303b bVar3 = C2303b.this;
                        f = (float) (bVar3.f6814q / bVar3.contentLength());
                    } else {
                        f = C2303b.this.f6817t ? 1.0f : 0.0f;
                    }
                    if (i3 != null && i3.mo7651a(f)) {
                        if (C2303b.this.contentLength() != -1) {
                            bVar = C2303b.this;
                            str = bVar.f6811f;
                            j2 = bVar.f6814q;
                        } else {
                            bVar = C2303b.this;
                            if (!bVar.f6817t) {
                                str = bVar.f6811f;
                                j2 = 0;
                            } else {
                                String str2 = bVar.f6811f;
                                long j3 = bVar.f6814q;
                                m9611a(str2, j3, j3);
                            }
                        }
                        m9611a(str, j2, bVar.contentLength());
                    }
                }
                return read;
            } catch (Exception unused) {
                return -1;
            }
        }

        public C10600e0 timeout() {
            return null;
        }
    }

    static {
        Class<C2303b> cls = C2303b.class;
    }

    public C2303b(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z) {
        this.f6815r = reactApplicationContext;
        this.f6811f = str;
        this.f6812o = responseBody;
        this.f6813p = str2;
        this.f6817t = false;
        if (str2 != null) {
            boolean z2 = !z;
            String replace = str2.replace("?append=true", HttpUrl.FRAGMENT_ENCODE_SET);
            this.f6813p = replace;
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.f6816s = new FileOutputStream(new File(replace), z2);
                return;
            }
            throw new IllegalStateException("Couldn't create dir: " + parentFile);
        }
    }

    /* renamed from: a */
    public boolean mo7667a() {
        return this.f6814q == contentLength() || (contentLength() == -1 && this.f6817t);
    }

    public long contentLength() {
        return this.f6812o.contentLength();
    }

    public MediaType contentType() {
        return this.f6812o.contentType();
    }

    public C10615h source() {
        return C10625q.m36156d(new C2305b());
    }
}
