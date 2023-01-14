package com.reactnativesafx;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import com.reactnativesafx.p172f.C5353a;
import com.reactnativesafx.p172f.C5358c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import p027c.p080l.p081a.C2034a;

@C2639a(name = "SafX")
public class SafXModule extends ReactContextBaseJavaModule {
    public static final String NAME = "SafX";
    private final C5353a documentHelper;

    public SafXModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.documentHelper = new C5353a(reactApplicationContext);
    }

    static /* synthetic */ String[] lambda$getPersistedUriPermissions$1(int i) {
        return new String[i];
    }

    static /* synthetic */ WritableMap[] lambda$listFiles$3(int i) {
        return new WritableMap[i];
    }

    @ReactMethod
    public void createDocument(String str, String str2, String str3, String str4, Promise promise) {
        this.documentHelper.mo16147d(str, str2, str3, str4, promise);
    }

    @ReactMethod
    public void createFile(String str, String str2, Promise promise) {
        try {
            C5353a.m19811r(this.documentHelper.mo16148e(str, str2), promise, str);
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.documentHelper.mo16149f(str)));
        } catch (Exception e) {
            promise.reject("ERROR", e.getLocalizedMessage());
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPersistedUriPermissions(Promise promise) {
        promise.resolve(Arguments.fromArray((String[]) getReactApplicationContext().getContentResolver().getPersistedUriPermissions().stream().map(C5351d.f14976a).toArray(C5348a.f14973a)));
    }

    @ReactMethod
    public void hasPermission(String str, Promise promise) {
        promise.resolve(this.documentHelper.mo16153k(str) ? Boolean.TRUE : Boolean.FALSE);
    }

    @ReactMethod
    public void listFiles(String str, Promise promise) {
        String str2;
        String str3;
        try {
            promise.resolve(Arguments.fromJavaArgs((WritableMap[]) Arrays.stream(this.documentHelper.mo16152j(str, false, true).mo6807o()).map(new C5349b(str)).toArray(C5350c.f14975a)));
            return;
        } catch (FileNotFoundException e) {
            str2 = e.getLocalizedMessage();
            str3 = "ENOENT";
        } catch (SecurityException e2) {
            str2 = e2.getLocalizedMessage();
            str3 = "EPERM";
        } catch (Exception e3) {
            str2 = e3.getLocalizedMessage();
            str3 = "EUNSPECIFIED";
        }
        promise.reject(str3, str2);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        String str2;
        String str3;
        try {
            C5353a.m19811r(this.documentHelper.mo16154l(str), promise, str);
            return;
        } catch (IOException e) {
            str2 = e.getLocalizedMessage();
            str3 = "EEXIST";
        } catch (SecurityException e2) {
            str2 = e2.getLocalizedMessage();
            str3 = "EPERM";
        } catch (Exception e3) {
            str2 = e3.getLocalizedMessage();
            str3 = "EUNSPECIFIED";
        }
        promise.reject(str3, str2);
    }

    @ReactMethod
    public void openDocument(boolean z, Promise promise) {
        this.documentHelper.mo16156n(z, promise);
    }

    @ReactMethod
    public void openDocumentTree(boolean z, Promise promise) {
        this.documentHelper.mo16157o(z, promise);
    }

    @ReactMethod
    public void readFile(String str, String str2, Promise promise) {
        Object q;
        try {
            C2034a j = this.documentHelper.mo16152j(str, false, true);
            if (str2 != null) {
                try {
                    q = str2.equals("ascii") ? (WritableArray) this.documentHelper.mo16159q(j.mo6802j(), str2) : this.documentHelper.mo16159q(j.mo6802j(), str2);
                } catch (Exception e) {
                    promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
                    return;
                }
            } else {
                q = this.documentHelper.mo16159q(j.mo6802j(), "utf8");
            }
            promise.resolve(q);
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "'" + str + "' does not exist");
        }
    }

    @ReactMethod
    public void releasePersistableUriPermission(String str, Promise promise) {
        getReactApplicationContext().getContentResolver().releasePersistableUriPermission(Uri.parse(C5358c.m19829c(str)), 3);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void rename(String str, String str2, Promise promise) {
        try {
            try {
                promise.resolve(this.documentHelper.mo16152j(str, false, true).mo6808p(str2) ? Boolean.TRUE : Boolean.FALSE);
            } catch (Exception e) {
                promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
            }
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "'" + str + "' does not exist");
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        String str2;
        String str3;
        try {
            C5353a.m19811r(this.documentHelper.mo16152j(str, false, true), promise, str);
            return;
        } catch (FileNotFoundException e) {
            str2 = e.getLocalizedMessage();
            str3 = "ENOENT";
        } catch (SecurityException e2) {
            str2 = e2.getLocalizedMessage();
            str3 = "EPERM";
        } catch (Exception e3) {
            str2 = e3.getLocalizedMessage();
            str3 = "EUNSPECIFIED";
        }
        promise.reject(str3, str2);
    }

    @ReactMethod
    public void transferFile(String str, String str2, boolean z, boolean z2, Promise promise) {
        this.documentHelper.mo16160s(str, str2, z, z2, promise);
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        String str2;
        String str3;
        try {
            promise.resolve(Boolean.valueOf(this.documentHelper.mo16152j(str, false, true).mo6797c()));
        } catch (FileNotFoundException unused) {
            promise.resolve(Boolean.TRUE);
        } catch (SecurityException e) {
            str2 = e.getLocalizedMessage();
            str3 = "EPERM";
            promise.reject(str3, str2);
        } catch (Exception e2) {
            str2 = e2.getLocalizedMessage();
            str3 = "EUNSPECIFIED";
            promise.reject(str3, str2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:3|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r6 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r9.reject("EUNSPECIFIED", r4.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r7 = r3.documentHelper.mo16148e(r4, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeFile(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, com.facebook.react.bridge.Promise r9) {
        /*
            r3 = this;
            com.reactnativesafx.f.a r0 = r3.documentHelper     // Catch:{ FileNotFoundException -> 0x000b }
            r1 = 0
            r2 = 1
            c.l.a.a r7 = r0.mo16152j(r4, r1, r2)     // Catch:{ FileNotFoundException -> 0x000b }
            goto L_0x0011
        L_0x0009:
            r4 = move-exception
            goto L_0x0042
        L_0x000b:
            com.reactnativesafx.f.a r0 = r3.documentHelper     // Catch:{ Exception -> 0x0009 }
            c.l.a.a r7 = r0.mo16148e(r4, r7)     // Catch:{ Exception -> 0x0009 }
        L_0x0011:
            byte[] r5 = com.reactnativesafx.p172f.C5357b.m19826a(r5, r6)     // Catch:{ Exception -> 0x0009 }
            com.facebook.react.bridge.ReactApplicationContext r6 = r3.getReactApplicationContext()     // Catch:{ Exception -> 0x0009 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x0009 }
            android.net.Uri r7 = r7.mo6802j()     // Catch:{ Exception -> 0x0009 }
            if (r8 == 0) goto L_0x0026
            java.lang.String r8 = "wa"
            goto L_0x0028
        L_0x0026:
            java.lang.String r8 = "wt"
        L_0x0028:
            java.io.OutputStream r6 = r6.openOutputStream(r7, r8)     // Catch:{ Exception -> 0x0009 }
            r6.write(r5)     // Catch:{ all -> 0x0036 }
            r6.close()     // Catch:{ Exception -> 0x0009 }
            r9.resolve(r4)     // Catch:{ Exception -> 0x0009 }
            goto L_0x004b
        L_0x0036:
            r4 = move-exception
            if (r6 == 0) goto L_0x0041
            r6.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ Exception -> 0x0009 }
        L_0x0041:
            throw r4     // Catch:{ Exception -> 0x0009 }
        L_0x0042:
            java.lang.String r4 = r4.getLocalizedMessage()
            java.lang.String r5 = "EUNSPECIFIED"
            r9.reject((java.lang.String) r5, (java.lang.String) r4)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativesafx.SafXModule.writeFile(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.facebook.react.bridge.Promise):void");
    }
}
