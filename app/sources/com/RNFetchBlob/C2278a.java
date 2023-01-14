package com.RNFetchBlob;

import android.net.Uri;
import android.util.Base64;
import com.RNFetchBlob.C2290g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p493i.C10608g;

/* renamed from: com.RNFetchBlob.a */
class C2278a extends RequestBody {

    /* renamed from: a */
    private InputStream f6712a;

    /* renamed from: b */
    private long f6713b = 0;

    /* renamed from: c */
    private ReadableArray f6714c;

    /* renamed from: d */
    private String f6715d;

    /* renamed from: e */
    private String f6716e;

    /* renamed from: f */
    private C2290g.C2295e f6717f;

    /* renamed from: g */
    private MediaType f6718g;

    /* renamed from: h */
    private File f6719h;

    /* renamed from: i */
    int f6720i = 0;

    /* renamed from: j */
    private Boolean f6721j = Boolean.FALSE;

    /* renamed from: com.RNFetchBlob.a$a */
    static /* synthetic */ class C2279a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6722a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.RNFetchBlob.g$e[] r0 = com.RNFetchBlob.C2290g.C2295e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6722a = r0
                com.RNFetchBlob.g$e r1 = com.RNFetchBlob.C2290g.C2295e.SingleFile     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6722a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.RNFetchBlob.g$e r1 = com.RNFetchBlob.C2290g.C2295e.AsIs     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6722a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.RNFetchBlob.g$e r1 = com.RNFetchBlob.C2290g.C2295e.Others     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2278a.C2279a.<clinit>():void");
        }
    }

    /* renamed from: com.RNFetchBlob.a$b */
    private class C2280b {

        /* renamed from: a */
        public String f6723a;

        /* renamed from: b */
        String f6724b;

        /* renamed from: c */
        String f6725c;

        /* renamed from: d */
        public String f6726d;

        C2280b(ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f6723a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f6724b = readableMap.getString("filename");
            }
            this.f6725c = readableMap.hasKey("type") ? readableMap.getString("type") : this.f6724b == null ? "text/plain" : "application/octet-stream";
            if (readableMap.hasKey("data")) {
                this.f6726d = readableMap.getString("data");
            }
        }
    }

    C2278a(String str) {
        this.f6715d = str;
    }

    /* renamed from: c */
    private ArrayList<C2280b> m9536c() {
        long j;
        int i;
        String localizedMessage;
        ArrayList<C2280b> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = C2264RNFetchBlob.RCTContext;
        long j2 = 0;
        for (int i2 = 0; i2 < this.f6714c.size(); i2++) {
            C2280b bVar = new C2280b(this.f6714c.getMap(i2));
            arrayList.add(bVar);
            String str = bVar.f6726d;
            if (str == null) {
                localizedMessage = "RNFetchBlob multipart request builder has found a field without `data` property, the field `" + bVar.f6723a + "` will be removed implicitly.";
            } else {
                if (bVar.f6724b == null) {
                    i = str.getBytes().length;
                } else if (str.startsWith("RNFetchBlob-file://")) {
                    String w = C2283d.m9579w(str.substring(19));
                    if (C2283d.m9573q(w)) {
                        try {
                            i = reactApplicationContext.getAssets().open(w.replace("bundle-assets://", HttpUrl.FRAGMENT_ENCODE_SET)).available();
                        } catch (IOException e) {
                            localizedMessage = e.getLocalizedMessage();
                        }
                    } else {
                        j = new File(C2283d.m9579w(w)).length();
                        j2 += j;
                    }
                } else if (str.startsWith("RNFetchBlob-content://")) {
                    String substring = str.substring(22);
                    InputStream inputStream = null;
                    try {
                        inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                        j2 += (long) inputStream.available();
                    } catch (Exception e2) {
                        C2298h.m9607a("Failed to estimate form data length from content URI:" + substring + ", " + e2.getLocalizedMessage());
                        if (inputStream == null) {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                    inputStream.close();
                } else {
                    i = Base64.decode(str, 0).length;
                }
                j = (long) i;
                j2 += j;
            }
            C2298h.m9607a(localizedMessage);
        }
        this.f6713b = j2;
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0144, code lost:
        if (r10 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0146, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x016b, code lost:
        if (r10 == null) goto L_0x01b9;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File m9537d() {
        /*
            r17 = this;
            r1 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "RNFetchBlob-"
            r0.append(r2)
            java.lang.String r2 = r1.f6715d
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.facebook.react.bridge.ReactApplicationContext r0 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r3 = "rnfb-form-tmp"
            java.lang.String r4 = ""
            java.io.File r3 = java.io.File.createTempFile(r3, r4, r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r3)
            java.util.ArrayList r0 = r17.m9536c()
            com.facebook.react.bridge.ReactApplicationContext r6 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext
            java.util.Iterator r7 = r0.iterator()
        L_0x0032:
            boolean r0 = r7.hasNext()
            java.lang.String r8 = "--"
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r7.next()
            com.RNFetchBlob.a$b r0 = (com.RNFetchBlob.C2278a.C2280b) r0
            java.lang.String r9 = r0.f6726d
            java.lang.String r10 = r0.f6723a
            if (r10 == 0) goto L_0x0032
            if (r9 != 0) goto L_0x0049
            goto L_0x0032
        L_0x0049:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r2)
            java.lang.String r8 = "\r\n"
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = r0.f6724b
            java.lang.String r13 = "\r\n\r\n"
            java.lang.String r14 = "Content-Type: "
            java.lang.String r15 = "\"\r\n"
            r16 = r7
            java.lang.String r7 = "Content-Disposition: form-data; name=\""
            if (r12 == 0) goto L_0x017d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r7)
            r12.append(r10)
            java.lang.String r7 = "\"; filename=\""
            r12.append(r7)
            java.lang.String r7 = r0.f6724b
            r12.append(r7)
            r12.append(r15)
            java.lang.String r7 = r12.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r14)
            java.lang.String r0 = r0.f6725c
            r10.append(r0)
            r10.append(r13)
            java.lang.String r0 = r10.toString()
            byte[] r0 = r0.getBytes()
            r5.write(r0)
            java.lang.String r0 = "RNFetchBlob-file://"
            boolean r0 = r9.startsWith(r0)
            java.lang.String r7 = ", "
            if (r0 == 0) goto L_0x0126
            r0 = 19
            java.lang.String r0 = r9.substring(r0)
            java.lang.String r9 = com.RNFetchBlob.C2283d.m9579w(r0)
            boolean r0 = com.RNFetchBlob.C2283d.m9573q(r9)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = "bundle-assets://"
            java.lang.String r0 = r9.replace(r0, r4)     // Catch:{ IOException -> 0x00d5 }
            android.content.res.AssetManager r10 = r6.getAssets()     // Catch:{ IOException -> 0x00d5 }
            java.io.InputStream r0 = r10.open(r0)     // Catch:{ IOException -> 0x00d5 }
            r1.m9540g(r0, r5)     // Catch:{ IOException -> 0x00d5 }
            goto L_0x01b9
        L_0x00d5:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Failed to create form data asset :"
            r10.append(r11)
            r10.append(r9)
            r10.append(r7)
            java.lang.String r0 = r0.getLocalizedMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            goto L_0x0121
        L_0x00f2:
            java.io.File r0 = new java.io.File
            java.lang.String r7 = com.RNFetchBlob.C2283d.m9579w(r9)
            r0.<init>(r7)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x010b
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r0)
            r1.m9540g(r7, r5)
            goto L_0x01b9
        L_0x010b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "Failed to create form data from path :"
            r0.append(r7)
            r0.append(r9)
            java.lang.String r7 = ", file not exists."
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        L_0x0121:
            com.RNFetchBlob.C2298h.m9607a(r0)
            goto L_0x01b9
        L_0x0126:
            java.lang.String r0 = "RNFetchBlob-content://"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x0174
            r0 = 22
            java.lang.String r9 = r9.substring(r0)
            r10 = 0
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch:{ Exception -> 0x014c }
            android.net.Uri r11 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x014c }
            java.io.InputStream r10 = r0.openInputStream(r11)     // Catch:{ Exception -> 0x014c }
            r1.m9540g(r10, r5)     // Catch:{ Exception -> 0x014c }
            if (r10 == 0) goto L_0x01b9
        L_0x0146:
            r10.close()
            goto L_0x01b9
        L_0x014a:
            r0 = move-exception
            goto L_0x016e
        L_0x014c:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x014a }
            r11.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r12 = "Failed to create form data from content URI:"
            r11.append(r12)     // Catch:{ all -> 0x014a }
            r11.append(r9)     // Catch:{ all -> 0x014a }
            r11.append(r7)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x014a }
            r11.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x014a }
            com.RNFetchBlob.C2298h.m9607a(r0)     // Catch:{ all -> 0x014a }
            if (r10 == 0) goto L_0x01b9
            goto L_0x0146
        L_0x016e:
            if (r10 == 0) goto L_0x0173
            r10.close()
        L_0x0173:
            throw r0
        L_0x0174:
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r9, r0)
            r5.write(r0)
            goto L_0x01b9
        L_0x017d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r7)
            r9.append(r10)
            r9.append(r15)
            java.lang.String r7 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r14)
            java.lang.String r7 = r0.f6725c
            r9.append(r7)
            r9.append(r13)
            java.lang.String r7 = r9.toString()
            byte[] r7 = r7.getBytes()
            r5.write(r7)
            java.lang.String r0 = r0.f6726d
            byte[] r0 = r0.getBytes()
            r5.write(r0)
        L_0x01b9:
            byte[] r0 = r8.getBytes()
            r5.write(r0)
            r7 = r16
            goto L_0x0032
        L_0x01c4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r2)
            java.lang.String r2 = "--\r\n"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            r5.write(r0)
            r5.flush()
            r5.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2278a.m9537d():java.io.File");
    }

    /* renamed from: e */
    private void m9538e(long j) {
        C2288f j2 = C2290g.m9600j(this.f6715d);
        if (j2 != null) {
            long j3 = this.f6713b;
            if (j3 != 0 && j2.mo7651a(((float) j) / ((float) j3))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", this.f6715d);
                createMap.putString("written", String.valueOf(j));
                createMap.putString("total", String.valueOf(this.f6713b));
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) C2264RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress-upload", createMap);
            }
        }
    }

    /* renamed from: f */
    private InputStream m9539f() {
        if (this.f6716e.startsWith("RNFetchBlob-file://")) {
            String w = C2283d.m9579w(this.f6716e.substring(19));
            if (C2283d.m9573q(w)) {
                try {
                    return C2264RNFetchBlob.RCTContext.getAssets().open(w.replace("bundle-assets://", HttpUrl.FRAGMENT_ENCODE_SET));
                } catch (Exception e) {
                    throw new Exception("error when getting request stream from asset : " + e.getLocalizedMessage());
                }
            } else {
                File file = new File(C2283d.m9579w(w));
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    return new FileInputStream(file);
                } catch (Exception e2) {
                    throw new Exception("error when getting request stream: " + e2.getLocalizedMessage());
                }
            }
        } else if (this.f6716e.startsWith("RNFetchBlob-content://")) {
            String substring = this.f6716e.substring(22);
            try {
                return C2264RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(substring));
            } catch (Exception e3) {
                throw new Exception("error when getting request stream for content URI: " + substring, e3);
            }
        } else {
            try {
                return new ByteArrayInputStream(Base64.decode(this.f6716e, 0));
            } catch (Exception e4) {
                throw new Exception("error when getting request stream: " + e4.getLocalizedMessage());
            }
        }
    }

    /* renamed from: g */
    private void m9540g(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    /* renamed from: h */
    private void m9541h(InputStream inputStream, C10608g gVar) {
        byte[] bArr = new byte[10240];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read > 0) {
                gVar.write(bArr, 0, read);
                j += (long) read;
                m9538e(j);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2278a mo7634a(boolean z) {
        this.f6721j = Boolean.valueOf(z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7635b() {
        try {
            File file = this.f6719h;
            if (file == null || !file.exists()) {
                return true;
            }
            this.f6719h.delete();
            return true;
        } catch (Exception e) {
            C2298h.m9607a(e.getLocalizedMessage());
            return false;
        }
    }

    public long contentLength() {
        if (this.f6721j.booleanValue()) {
            return -1;
        }
        return this.f6713b;
    }

    public MediaType contentType() {
        return this.f6718g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2278a mo7638i(ReadableArray readableArray) {
        this.f6714c = readableArray;
        try {
            this.f6719h = m9537d();
            this.f6712a = new FileInputStream(this.f6719h);
            this.f6713b = this.f6719h.length();
        } catch (Exception e) {
            e.printStackTrace();
            C2298h.m9607a("RNFetchBlob failed to create request multipart body :" + e.getLocalizedMessage());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2278a mo7639j(String str) {
        this.f6716e = str;
        if (str == null) {
            this.f6716e = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f6717f = C2290g.C2295e.AsIs;
        }
        try {
            int i = C2279a.f6722a[this.f6717f.ordinal()];
            if (i == 1) {
                InputStream f = m9539f();
                this.f6712a = f;
                this.f6713b = (long) f.available();
            } else if (i == 2) {
                this.f6713b = (long) this.f6716e.getBytes().length;
                this.f6712a = new ByteArrayInputStream(this.f6716e.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
            C2298h.m9607a("RNFetchBlob failed to create single content request body :" + e.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C2278a mo7640k(MediaType mediaType) {
        this.f6718g = mediaType;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C2278a mo7641l(C2290g.C2295e eVar) {
        this.f6717f = eVar;
        return this;
    }

    public void writeTo(C10608g gVar) {
        try {
            m9541h(this.f6712a, gVar);
        } catch (Exception e) {
            C2298h.m9607a(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
