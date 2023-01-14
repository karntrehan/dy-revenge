package com.RNFetchBlob;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import okhttp3.HttpUrl;

/* renamed from: com.RNFetchBlob.b */
class C2281b {

    /* renamed from: a */
    public Boolean f6728a;

    /* renamed from: b */
    public String f6729b;

    /* renamed from: c */
    public String f6730c;

    /* renamed from: d */
    public ReadableMap f6731d;

    /* renamed from: e */
    public Boolean f6732e;

    /* renamed from: f */
    public Boolean f6733f;

    /* renamed from: g */
    public String f6734g;

    /* renamed from: h */
    public String f6735h;

    /* renamed from: i */
    public Boolean f6736i;

    /* renamed from: j */
    public Boolean f6737j;

    /* renamed from: k */
    public long f6738k = 60000;

    /* renamed from: l */
    public Boolean f6739l;

    /* renamed from: m */
    public Boolean f6740m;

    /* renamed from: n */
    public ReadableArray f6741n;

    C2281b(ReadableMap readableMap) {
        Boolean bool = Boolean.FALSE;
        this.f6733f = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f6737j = bool2;
        this.f6739l = bool;
        this.f6740m = bool2;
        String str = null;
        this.f6741n = null;
        if (readableMap != null) {
            boolean z = false;
            this.f6728a = Boolean.valueOf(readableMap.hasKey("fileCache") ? readableMap.getBoolean("fileCache") : false);
            this.f6729b = readableMap.hasKey("path") ? readableMap.getString("path") : null;
            this.f6730c = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : HttpUrl.FRAGMENT_ENCODE_SET;
            this.f6732e = Boolean.valueOf(readableMap.hasKey("trusty") ? readableMap.getBoolean("trusty") : false);
            this.f6733f = Boolean.valueOf(readableMap.hasKey("wifiOnly") ? readableMap.getBoolean("wifiOnly") : false);
            if (readableMap.hasKey("addAndroidDownloads")) {
                this.f6731d = readableMap.getMap("addAndroidDownloads");
            }
            if (readableMap.hasKey("binaryContentTypes")) {
                this.f6741n = readableMap.getArray("binaryContentTypes");
            }
            String str2 = this.f6729b;
            if (str2 != null && str2.toLowerCase().contains("?append=true")) {
                this.f6737j = bool;
            }
            if (readableMap.hasKey("overwrite")) {
                this.f6737j = Boolean.valueOf(readableMap.getBoolean("overwrite"));
            }
            if (readableMap.hasKey("followRedirect")) {
                this.f6740m = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
            }
            this.f6734g = readableMap.hasKey("key") ? readableMap.getString("key") : null;
            this.f6735h = readableMap.hasKey("contentType") ? readableMap.getString("contentType") : str;
            this.f6739l = Boolean.valueOf(readableMap.hasKey("increment") ? readableMap.getBoolean("increment") : false);
            this.f6736i = Boolean.valueOf(readableMap.hasKey("auto") ? readableMap.getBoolean("auto") : z);
            if (readableMap.hasKey("timeout")) {
                this.f6738k = (long) readableMap.getInt("timeout");
            }
        }
    }
}
