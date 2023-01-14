package com.reactnativesafx.p172f;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p027c.p080l.p081a.C2034a;
import p027c.p080l.p081a.C2035b;

/* renamed from: com.reactnativesafx.f.a */
public class C5353a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ReactApplicationContext f14977a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ActivityEventListener f14978b;

    /* renamed from: com.reactnativesafx.f.a$a */
    class C5354a implements ActivityEventListener {

        /* renamed from: f */
        final /* synthetic */ boolean f14979f;

        /* renamed from: o */
        final /* synthetic */ Promise f14980o;

        C5354a(boolean z, Promise promise) {
            this.f14979f = z;
            this.f14980o = promise;
        }

        @SuppressLint({"WrongConstant"})
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == 1 && i2 == -1 && intent != null) {
                Uri data = intent.getData();
                if (this.f14979f) {
                    C5353a.this.f14977a.getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
                }
                try {
                    C5353a.m19811r(C5353a.this.mo16151i(data.toString(), false), this.f14980o, data.toString());
                } catch (Exception unused) {
                }
                C5353a.this.f14977a.removeActivityEventListener(C5353a.this.f14978b);
                ActivityEventListener unused2 = C5353a.this.f14978b = null;
            }
            this.f14980o.resolve((Object) null);
            C5353a.this.f14977a.removeActivityEventListener(C5353a.this.f14978b);
            ActivityEventListener unused3 = C5353a.this.f14978b = null;
        }

        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.reactnativesafx.f.a$b */
    class C5355b implements ActivityEventListener {

        /* renamed from: f */
        final /* synthetic */ boolean f14982f;

        /* renamed from: o */
        final /* synthetic */ Promise f14983o;

        C5355b(boolean z, Promise promise) {
            this.f14982f = z;
            this.f14983o = promise;
        }

        @SuppressLint({"WrongConstant"})
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == 2 && i2 == -1 && intent != null) {
                Uri data = intent.getData();
                if (this.f14982f) {
                    C5353a.this.f14977a.getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
                }
                try {
                    C5353a.m19811r(C5353a.this.mo16151i(data.toString(), false), this.f14983o, data.toString());
                } catch (Exception unused) {
                }
                C5353a.this.f14977a.removeActivityEventListener(C5353a.this.f14978b);
                ActivityEventListener unused2 = C5353a.this.f14978b = null;
            }
            this.f14983o.resolve((Object) null);
            C5353a.this.f14977a.removeActivityEventListener(C5353a.this.f14978b);
            ActivityEventListener unused3 = C5353a.this.f14978b = null;
        }

        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.reactnativesafx.f.a$c */
    class C5356c implements ActivityEventListener {

        /* renamed from: f */
        final /* synthetic */ String f14985f;

        /* renamed from: o */
        final /* synthetic */ String f14986o;

        /* renamed from: p */
        final /* synthetic */ Promise f14987p;

        C5356c(String str, String str2, Promise promise) {
            this.f14985f = str;
            this.f14986o = str2;
            this.f14987p = promise;
        }

        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            OutputStream openOutputStream;
            if (i == 3 && i2 == -1 && intent != null) {
                Uri data = intent.getData();
                C2034a f = C2034a.m8642f(C5353a.this.f14977a, data);
                try {
                    byte[] a = C5357b.m19826a(this.f14985f, this.f14986o);
                    openOutputStream = C5353a.this.f14977a.getContentResolver().openOutputStream(data);
                    openOutputStream.write(a);
                    openOutputStream.close();
                    C5353a.m19811r(f, this.f14987p, data.toString());
                } catch (Exception e) {
                    this.f14987p.reject("ERROR", e.getLocalizedMessage());
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                this.f14987p.resolve((Object) null);
            }
            C5353a.this.f14977a.removeActivityEventListener(C5353a.this.f14978b);
            ActivityEventListener unused = C5353a.this.f14978b = null;
            return;
            throw th;
        }

        public void onNewIntent(Intent intent) {
        }
    }

    public C5353a(ReactApplicationContext reactApplicationContext) {
        this.f14977a = reactApplicationContext;
    }

    /* renamed from: h */
    private String m19810h(String str) {
        return "You don't have read/write permission to access uri: " + str;
    }

    /* renamed from: r */
    public static WritableMap m19811r(C2034a aVar, Promise promise, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", C5358c.m19827a(str));
        createMap.putString("name", aVar.mo6800h());
        createMap.putString("type", aVar.mo6803k() ? "directory" : "file");
        if (aVar.mo6804l()) {
            createMap.putString("mime", aVar.mo6801i());
            createMap.putDouble("size", (double) aVar.mo6806n());
        }
        createMap.putDouble("lastModified", (double) aVar.mo6805m());
        if (promise != null) {
            promise.resolve(createMap);
        }
        return createMap;
    }

    /* renamed from: d */
    public void mo16147d(String str, String str2, String str3, String str4, Promise promise) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            if (str3 != null) {
                intent.putExtra("android.intent.extra.TITLE", str3);
            }
            if (str4 != null) {
                intent.setType(str4);
            } else {
                intent.setType("*/*");
            }
            ActivityEventListener activityEventListener = this.f14978b;
            if (activityEventListener != null) {
                this.f14977a.removeActivityEventListener(activityEventListener);
                this.f14978b = null;
            }
            C5356c cVar = new C5356c(str, str2, promise);
            this.f14978b = cVar;
            this.f14977a.addActivityEventListener(cVar);
            Activity currentActivity = this.f14977a.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivityForResult(intent, 3);
            } else {
                promise.reject("ERROR", "Cannot get current activity, so cannot launch document picker");
            }
        } catch (Exception e) {
            promise.reject("ERROR", e.getMessage());
        }
    }

    /* renamed from: e */
    public C2034a mo16148e(String str, String str2) {
        if (!mo16149f(str)) {
            C2034a m = mo16155m(str, false);
            String b = C5358c.m19828b(str);
            if (b.indexOf(58) == -1) {
                if (str2 == null || str2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    str2 = "*/*";
                }
                C2034a b2 = m.mo6796b(str2, b);
                if (b2 != null) {
                    return b2;
                }
                throw new IOException("File creation failed without any specific error for '" + b + "'");
            }
            throw new IOException("Invalid file name: Could not extract filename from uri string provided");
        }
        throw new IOException("a file or directory already exist at: " + str);
    }

    /* renamed from: f */
    public boolean mo16149f(String str) {
        return mo16150g(str, false);
    }

    /* renamed from: g */
    public boolean mo16150g(String str, boolean z) {
        try {
            C2034a i = mo16151i(str, false);
            if (z) {
                return !i.mo6803k();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public C2034a mo16151i(String str, boolean z) {
        return mo16152j(str, z, true);
    }

    /* renamed from: j */
    public C2034a mo16152j(String str, boolean z, boolean z2) {
        String str2;
        String c = C5358c.m19829c(str);
        String[] strArr = new String[0];
        Iterator<UriPermission> it = this.f14977a.getContentResolver().getPersistedUriPermissions().iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            }
            UriPermission next = it.next();
            str2 = next.getUri().toString();
            if (mo16158p(next, c)) {
                strArr = Uri.decode(c.substring(str2.length())).split("/");
                break;
            }
        }
        if (str2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            throw new SecurityException(m19810h(c));
        } else if (str2.matches("^content://[\\w.]+/document/.*")) {
            C2034a f = C2034a.m8642f(this.f14977a, Uri.parse(c));
            if (f != null && f.mo6804l() && f.mo6798d()) {
                return f;
            }
            throw new FileNotFoundException("Cannot find the given document. File does not exist at '" + c + "'");
        } else {
            C2034a g = C2034a.m8643g(this.f14977a, Uri.parse(str2));
            int length = z2 ? strArr.length : strArr.length - 1;
            for (int i = 0; i < length; i++) {
                if (!strArr[i].equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    C2034a a = C2035b.m8658a(this.f14977a, g, strArr[i]);
                    if (a != null) {
                        if (!a.mo6803k() && i != length - 1) {
                            throw new IOException("There's a document with the same name as the one we are trying to traverse at: '" + a.mo6802j() + "'");
                        }
                        g = a;
                    } else if (z) {
                        g = g.mo6795a(strArr[i]);
                    } else {
                        throw new FileNotFoundException("Cannot traverse to the pointed document. Directory '" + strArr[i] + "' does not exist in '" + g.mo6802j() + "'");
                    }
                }
            }
            return g;
        }
    }

    /* renamed from: k */
    public boolean mo16153k(String str) {
        for (UriPermission p : this.f14977a.getContentResolver().getPersistedUriPermissions()) {
            if (mo16158p(p, C5358c.m19829c(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public C2034a mo16154l(String str) {
        return mo16155m(str, true);
    }

    /* renamed from: m */
    public C2034a mo16155m(String str, boolean z) {
        return mo16152j(str, true, z);
    }

    /* renamed from: n */
    public void mo16156n(boolean z, Promise promise) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            ActivityEventListener activityEventListener = this.f14978b;
            if (activityEventListener != null) {
                this.f14977a.removeActivityEventListener(activityEventListener);
                this.f14978b = null;
            }
            C5355b bVar = new C5355b(z, promise);
            this.f14978b = bVar;
            this.f14977a.addActivityEventListener(bVar);
            Activity currentActivity = this.f14977a.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivityForResult(intent, 2);
            } else {
                promise.reject("ERROR", "Cannot get current activity, so cannot launch document picker");
            }
        } catch (Exception e) {
            promise.reject("ERROR", e.getMessage());
        }
    }

    /* renamed from: o */
    public void mo16157o(boolean z, Promise promise) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.OPEN_DOCUMENT_TREE");
            ActivityEventListener activityEventListener = this.f14978b;
            if (activityEventListener != null) {
                this.f14977a.removeActivityEventListener(activityEventListener);
                this.f14978b = null;
            }
            C5354a aVar = new C5354a(z, promise);
            this.f14978b = aVar;
            this.f14977a.addActivityEventListener(aVar);
            Activity currentActivity = this.f14977a.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivityForResult(intent, 1);
            } else {
                promise.reject("ERROR", "Cannot get current activity, so cannot launch document picker");
            }
        } catch (Exception e) {
            promise.reject("ERROR", e.getMessage());
        }
    }

    /* renamed from: p */
    public boolean mo16158p(UriPermission uriPermission, String str) {
        String uri = uriPermission.getUri().toString();
        return (uri.startsWith(str) || str.startsWith(uri)) && uriPermission.isReadPermission() && uriPermission.isWritePermission();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo16159q(android.net.Uri r7, java.lang.String r8) {
        /*
            r6 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r6.f14977a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r7 = r0.openInputStream(r7)
            int r0 = r7.available()
            byte[] r1 = new byte[r0]
            r7.read(r1)
            r7.close()
            java.lang.String r7 = r8.toLowerCase()
            int r8 = r7.hashCode()
            r2 = -1396204209(0xffffffffacc79d4f, float:-5.673385E-12)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r8 == r2) goto L_0x0045
            r2 = 3600241(0x36ef71, float:5.045012E-39)
            if (r8 == r2) goto L_0x003b
            r2 = 93106001(0x58caf51, float:1.3229938E-35)
            if (r8 == r2) goto L_0x0031
            goto L_0x004f
        L_0x0031:
            java.lang.String r8 = "ascii"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x004f
            r7 = 1
            goto L_0x0050
        L_0x003b:
            java.lang.String r8 = "utf8"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x004f
            r7 = 2
            goto L_0x0050
        L_0x0045:
            java.lang.String r8 = "base64"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x004f
            r7 = 0
            goto L_0x0050
        L_0x004f:
            r7 = -1
        L_0x0050:
            if (r7 == 0) goto L_0x0069
            if (r7 == r5) goto L_0x005a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            return r7
        L_0x005a:
            com.facebook.react.bridge.WritableArray r7 = com.facebook.react.bridge.Arguments.createArray()
        L_0x005e:
            if (r3 >= r0) goto L_0x0068
            byte r8 = r1[r3]
            r7.pushInt(r8)
            int r3 = r3 + 1
            goto L_0x005e
        L_0x0068:
            return r7
        L_0x0069:
            java.lang.String r7 = android.util.Base64.encodeToString(r1, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativesafx.p172f.C5353a.mo16159q(android.net.Uri, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = mo16148e(r7, r6.mo6801i());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16160s(java.lang.String r6, java.lang.String r7, boolean r8, boolean r9, com.facebook.react.bridge.Promise r10) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            c.l.a.a r6 = r5.mo16152j(r6, r1, r0)     // Catch:{ Exception -> 0x0084 }
            boolean r2 = r6.mo6803k()     // Catch:{ Exception -> 0x0084 }
            if (r2 != 0) goto L_0x007c
            c.l.a.a r0 = r5.mo16152j(r7, r1, r0)     // Catch:{ FileNotFoundException -> 0x001b }
            if (r8 == 0) goto L_0x0013
            goto L_0x0023
        L_0x0013:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x001b }
            java.lang.String r0 = "a document with the same name already exists in destination"
            r8.<init>(r0)     // Catch:{ FileNotFoundException -> 0x001b }
            throw r8     // Catch:{ FileNotFoundException -> 0x001b }
        L_0x001b:
            java.lang.String r8 = r6.mo6801i()     // Catch:{ Exception -> 0x0084 }
            c.l.a.a r0 = r5.mo16148e(r7, r8)     // Catch:{ Exception -> 0x0084 }
        L_0x0023:
            com.facebook.react.bridge.ReactApplicationContext r8 = r5.f14977a     // Catch:{ Exception -> 0x0084 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x0084 }
            android.net.Uri r2 = r6.mo6802j()     // Catch:{ Exception -> 0x0084 }
            java.io.InputStream r8 = r8.openInputStream(r2)     // Catch:{ Exception -> 0x0084 }
            com.facebook.react.bridge.ReactApplicationContext r2 = r5.f14977a     // Catch:{ all -> 0x0070 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0070 }
            android.net.Uri r3 = r0.mo6802j()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "wt"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r4)     // Catch:{ all -> 0x0070 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0064 }
        L_0x0045:
            int r4 = r8.read(r3)     // Catch:{ all -> 0x0064 }
            if (r4 <= 0) goto L_0x004f
            r2.write(r3, r1, r4)     // Catch:{ all -> 0x0064 }
            goto L_0x0045
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ all -> 0x0070 }
        L_0x0054:
            r8.close()     // Catch:{ Exception -> 0x0084 }
            if (r9 != 0) goto L_0x005c
            r6.mo6797c()     // Catch:{ Exception -> 0x0084 }
        L_0x005c:
            com.facebook.react.bridge.WritableMap r6 = m19811r(r0, r10, r7)     // Catch:{ Exception -> 0x0084 }
            r10.resolve(r6)     // Catch:{ Exception -> 0x0084 }
            goto L_0x008e
        L_0x0064:
            r6 = move-exception
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ all -> 0x0070 }
        L_0x006f:
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r6 = move-exception
            if (r8 == 0) goto L_0x007b
            r8.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ Exception -> 0x0084 }
        L_0x007b:
            throw r6     // Catch:{ Exception -> 0x0084 }
        L_0x007c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0084 }
            java.lang.String r7 = "Cannot move directories"
            r6.<init>(r7)     // Catch:{ Exception -> 0x0084 }
            throw r6     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            java.lang.String r6 = r6.getLocalizedMessage()
            java.lang.String r7 = "EUNSPECIFIED"
            r10.reject((java.lang.String) r7, (java.lang.String) r6)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativesafx.p172f.C5353a.mo16160s(java.lang.String, java.lang.String, boolean, boolean, com.facebook.react.bridge.Promise):void");
    }
}
