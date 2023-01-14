package com.RNFetchBlob;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.RNFetchBlob.Utils.C2277a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;

/* renamed from: com.RNFetchBlob.d */
class C2283d {

    /* renamed from: a */
    private static HashMap<String, C2283d> f6743a = new HashMap<>();

    /* renamed from: b */
    private ReactApplicationContext f6744b;

    /* renamed from: c */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f6745c;

    /* renamed from: d */
    private String f6746d = "base64";

    /* renamed from: e */
    private OutputStream f6747e = null;

    /* renamed from: com.RNFetchBlob.d$a */
    class C2284a extends AsyncTask<String, Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ Callback f6748a;

        C2284a(Callback callback) {
            this.f6748a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            WritableArray createArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.f6748a.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.f6748a.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    createArray.pushMap(C2283d.m9550D(file.getPath() + "/" + str));
                }
            } else {
                createArray.pushMap(C2283d.m9550D(file.getAbsolutePath()));
            }
            this.f6748a.invoke(null, createArray);
            return 0;
        }
    }

    /* renamed from: com.RNFetchBlob.d$b */
    class C2285b implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a */
        final /* synthetic */ Callback f6749a;

        C2285b(Callback callback) {
            this.f6749a = callback;
        }

        public void onScanCompleted(String str, Uri uri) {
            this.f6749a.invoke(null, Boolean.TRUE);
        }
    }

    /* renamed from: com.RNFetchBlob.d$c */
    class C2286c extends AsyncTask<ReadableArray, Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ Callback f6751a;

        C2286c(Callback callback) {
            this.f6751a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readableArrayArr[0].size(); i++) {
                    String string = readableArrayArr[0].getString(i);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f6751a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(", ");
                    }
                    this.f6751a.invoke(sb.toString());
                }
            } catch (Exception e) {
                this.f6751a.invoke(e.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    C2283d(ReactApplicationContext reactApplicationContext) {
        this.f6744b = reactApplicationContext;
        this.f6745c = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* renamed from: B */
    static void m9548B(String str, String str2, int i, int i2, String str3, Promise promise) {
        try {
            String w = m9579w(str);
            File file = new File(w);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + w + "' is a directory");
            } else if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + w + "'");
            } else {
                int length = (int) file.length();
                int min = Math.min(length, i2) - i;
                FileInputStream fileInputStream = new FileInputStream(new File(w));
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                int skip = (int) fileInputStream.skip((long) i);
                if (skip != i) {
                    promise.reject("EUNSPECIFIED", "Skipped " + skip + " instead of the specified " + i + " bytes, size is " + length);
                    return;
                }
                byte[] bArr = new byte[10240];
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        break;
                    }
                    int read = fileInputStream.read(bArr, 0, 10240);
                    int i4 = min - i3;
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, Math.min(i4, read));
                    i3 += read;
                }
                fileInputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                promise.resolve(str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    /* renamed from: C */
    static void m9549C(String str, Callback callback) {
        try {
            String w = m9579w(str);
            WritableMap D = m9550D(w);
            if (D == null) {
                callback.invoke("failed to stat path `" + w + "` because it does not exist or it is not a folder", null);
                return;
            }
            callback.invoke(null, D);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    /* renamed from: D */
    static WritableMap m9550D(String str) {
        try {
            String w = m9579w(str);
            WritableMap createMap = Arguments.createMap();
            if (m9573q(w)) {
                String replace = w.replace("bundle-assets://", HttpUrl.FRAGMENT_ENCODE_SET);
                AssetFileDescriptor openFd = C2264RNFetchBlob.RCTContext.getAssets().openFd(replace);
                createMap.putString("filename", replace);
                createMap.putString("path", w);
                createMap.putString("type", "asset");
                createMap.putString("size", String.valueOf(openFd.getLength()));
                createMap.putInt("lastModified", 0);
            } else {
                File file = new File(w);
                if (!file.exists()) {
                    return null;
                }
                createMap.putString("filename", file.getName());
                createMap.putString("path", file.getPath());
                createMap.putString("type", file.isDirectory() ? "directory" : "file");
                createMap.putString("size", String.valueOf(file.length()));
                createMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return createMap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: E */
    private static byte[] m9551E(String str, String str2) {
        return str2.equalsIgnoreCase("ascii") ? str.getBytes(Charset.forName("US-ASCII")) : str2.toLowerCase().contains("base64") ? Base64.decode(str, 2) : str2.equalsIgnoreCase("utf8") ? str.getBytes(Charset.forName("UTF-8")) : str.getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: F */
    static void m9552F(String str, Callback callback) {
        try {
            m9561e(new File(m9579w(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    /* renamed from: G */
    static void m9553G(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = f6743a.get(str).f6747e;
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    /* renamed from: H */
    static void m9554H(String str, String str2, Callback callback) {
        C2283d dVar = f6743a.get(str);
        try {
            dVar.f6747e.write(m9551E(str2, dVar.f6746d));
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    /* renamed from: I */
    static void m9555I(String str, ReadableArray readableArray, boolean z, Promise promise) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            fileOutputStream = new FileOutputStream(file, z);
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            promise.resolve(Integer.valueOf(readableArray.size()));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1 A[Catch:{ all -> 0x00e0, FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6 A[Catch:{ all -> 0x00e0, FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9556J(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, com.facebook.react.bridge.Promise r10) {
        /*
            java.lang.String r0 = "EUNSPECIFIED"
            java.lang.String r1 = "File '"
            java.lang.String r2 = "ENOENT"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r3.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.io.File r4 = r3.getParentFile()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            boolean r5 = r3.exists()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            if (r5 != 0) goto L_0x005b
            if (r4 == 0) goto L_0x003d
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            if (r5 != 0) goto L_0x003d
            boolean r4 = r4.mkdirs()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            if (r4 != 0) goto L_0x003d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r8 = "Failed to create parent directory of '"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r7.append(r6)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r8 = "'"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r10.reject((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            return
        L_0x003d:
            boolean r4 = r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            if (r4 != 0) goto L_0x005b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r7.append(r1)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r7.append(r6)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r8 = "' does not exist and could not be created"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r10.reject((java.lang.String) r2, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            return
        L_0x005b:
            java.lang.String r4 = "uri"
            boolean r4 = r7.equalsIgnoreCase(r4)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            if (r4 == 0) goto L_0x00ca
            java.lang.String r7 = m9579w(r8)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.io.File r8 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            boolean r4 = r8.exists()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            if (r4 != 0) goto L_0x0094
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r9 = "No such file '"
            r8.append(r9)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r8.append(r6)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r9 = "' ('"
            r8.append(r9)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r7 = "')"
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.lang.String r7 = r8.toString()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r10.reject((java.lang.String) r2, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            return
        L_0x0094:
            r7 = 10240(0x2800, float:1.4349E-41)
            byte[] r7 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x00bd }
            r5.<init>(r8)     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b9 }
            r8.<init>(r3, r9)     // Catch:{ all -> 0x00b9 }
            r9 = 0
            r3 = 0
        L_0x00a5:
            int r4 = r5.read(r7)     // Catch:{ all -> 0x00b7 }
            if (r4 <= 0) goto L_0x00b0
            r8.write(r7, r9, r4)     // Catch:{ all -> 0x00b7 }
            int r3 = r3 + r4
            goto L_0x00a5
        L_0x00b0:
            r5.close()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
        L_0x00b3:
            r8.close()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            goto L_0x00d8
        L_0x00b7:
            r7 = move-exception
            goto L_0x00bb
        L_0x00b9:
            r7 = move-exception
            r8 = r4
        L_0x00bb:
            r4 = r5
            goto L_0x00bf
        L_0x00bd:
            r7 = move-exception
            r8 = r4
        L_0x00bf:
            if (r4 == 0) goto L_0x00c4
            r4.close()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
        L_0x00c4:
            if (r8 == 0) goto L_0x00c9
            r8.close()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
        L_0x00c9:
            throw r7     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
        L_0x00ca:
            byte[] r7 = m9551E(r8, r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r8.<init>(r3, r9)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r8.write(r7)     // Catch:{ all -> 0x00e0 }
            int r3 = r7.length     // Catch:{ all -> 0x00e0 }
            goto L_0x00b3
        L_0x00d8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            r10.resolve(r7)     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            goto L_0x0105
        L_0x00e0:
            r7 = move-exception
            r8.close()     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
            throw r7     // Catch:{ FileNotFoundException -> 0x00ee, Exception -> 0x00e5 }
        L_0x00e5:
            r6 = move-exception
            java.lang.String r6 = r6.getLocalizedMessage()
            r10.reject((java.lang.String) r0, (java.lang.String) r6)
            goto L_0x0105
        L_0x00ee:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = "' does not exist and could not be created, or it is a directory"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r10.reject((java.lang.String) r2, (java.lang.String) r6)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2283d.m9556J(java.lang.String, java.lang.String, java.lang.String, boolean, com.facebook.react.bridge.Promise):void");
    }

    /* renamed from: a */
    static void m9557a(String str, Callback callback) {
        try {
            OutputStream outputStream = f6743a.get(str).f6747e;
            f6743a.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be A[SYNTHETIC, Splitter:B:41:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f0 A[SYNTHETIC, Splitter:B:53:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f8 A[Catch:{ Exception -> 0x00f4 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9558b(java.lang.String r6, java.lang.String r7, com.facebook.react.bridge.Callback r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r6 = m9579w(r6)
            r1 = 0
            r2 = 1
            r3 = 0
            boolean r4 = m9574r(r6)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r4 != 0) goto L_0x002d
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r4.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r5 = "Source file at path`"
            r4.append(r5)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r6 = "` does not exist"
            r4.append(r6)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r7[r3] = r6     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r8.invoke(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            return
        L_0x002d:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r4 != 0) goto L_0x0061
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            boolean r4 = r4.createNewFile()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r4 != 0) goto L_0x0061
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r4.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r5 = "Destination file at '"
            r4.append(r5)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r4.append(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r7 = "' already exists"
            r4.append(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r6[r3] = r7     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r8.invoke(r6)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            return
        L_0x0061:
            java.io.InputStream r6 = m9572p(r6)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            r4.<init>(r7)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            r7 = 10240(0x2800, float:1.4349E-41)
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
        L_0x006e:
            int r1 = r6.read(r7)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            if (r1 <= 0) goto L_0x0078
            r4.write(r7, r3, r1)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            goto L_0x006e
        L_0x0078:
            r6.close()     // Catch:{ Exception -> 0x0081 }
            r4.close()     // Catch:{ Exception -> 0x0081 }
            r6 = r0
            goto L_0x00dd
        L_0x0081:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r6 = r6.getLocalizedMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x00dd
        L_0x0096:
            r7 = move-exception
            goto L_0x009c
        L_0x0098:
            r7 = move-exception
            goto L_0x00a1
        L_0x009a:
            r7 = move-exception
            r4 = r1
        L_0x009c:
            r1 = r6
            r6 = r7
            goto L_0x00ee
        L_0x009f:
            r7 = move-exception
            r4 = r1
        L_0x00a1:
            r1 = r6
            r6 = r7
            goto L_0x00a9
        L_0x00a4:
            r6 = move-exception
            r4 = r1
            goto L_0x00ee
        L_0x00a7:
            r6 = move-exception
            r4 = r1
        L_0x00a9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r7.<init>()     // Catch:{ all -> 0x00ed }
            r7.append(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch:{ all -> 0x00ed }
            r7.append(r6)     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x00c4
            r1.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00c4
        L_0x00c2:
            r7 = move-exception
            goto L_0x00ca
        L_0x00c4:
            if (r4 == 0) goto L_0x00dd
            r4.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00dd
        L_0x00ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = r7.getLocalizedMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L_0x00dd:
            if (r6 == r0) goto L_0x00e7
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r6
            r8.invoke(r7)
            goto L_0x00ec
        L_0x00e7:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r8.invoke(r6)
        L_0x00ec:
            return
        L_0x00ed:
            r6 = move-exception
        L_0x00ee:
            if (r1 == 0) goto L_0x00f6
            r1.close()     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00f6
        L_0x00f4:
            r7 = move-exception
            goto L_0x00fc
        L_0x00f6:
            if (r4 == 0) goto L_0x010e
            r4.close()     // Catch:{ Exception -> 0x00f4 }
            goto L_0x010e
        L_0x00fc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r7 = r7.getLocalizedMessage()
            r8.append(r7)
            r8.toString()
        L_0x010e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2283d.m9558b(java.lang.String, java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    /* renamed from: c */
    static void m9559c(String str, String str2, String str3, Promise promise) {
        try {
            File file = new File(str);
            boolean createNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace("RNFetchBlob-file://", HttpUrl.FRAGMENT_ENCODE_SET));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else if (!createNewFile) {
                promise.reject("EEXIST", "File `" + str + "` already exists");
                return;
            } else {
                new FileOutputStream(file).write(m9551E(str2, str3));
            }
            promise.resolve(str);
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    /* renamed from: d */
    static void m9560d(String str, ReadableArray readableArray, Promise promise) {
        try {
            File file = new File(str);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + str + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            fileOutputStream.write(bArr);
            promise.resolve(str);
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    /* renamed from: e */
    private static void m9561e(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File e : listFiles) {
                    m9561e(e);
                }
            } else {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
        }
        if (!file.delete()) {
            throw new IOException("Failed to delete '" + file + "'");
        }
    }

    /* renamed from: f */
    static void m9562f(Callback callback) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        WritableMap createMap = Arguments.createMap();
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
            createMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
            createMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            createMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        }
        callback.invoke(null, createMap);
    }

    /* renamed from: g */
    private void m9563g(String str, String str2, WritableArray writableArray) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putArray("detail", writableArray);
        this.f6745c.emit(str, createMap);
    }

    /* renamed from: h */
    private void m9564h(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("detail", str3);
        this.f6745c.emit(str, createMap);
    }

    /* renamed from: i */
    private void m9565i(String str, String str2, String str3, String str4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("code", str3);
        createMap.putString("detail", str4);
        this.f6745c.emit(str, createMap);
    }

    /* renamed from: j */
    static void m9566j(String str, Callback callback) {
        if (m9573q(str)) {
            try {
                C2264RNFetchBlob.RCTContext.getAssets().openFd(str.replace("bundle-assets://", HttpUrl.FRAGMENT_ENCODE_SET));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
            }
        } else {
            String w = m9579w(str);
            if (w != null) {
                callback.invoke(Boolean.valueOf(new File(w).exists()), Boolean.valueOf(new File(w).isDirectory()));
                return;
            }
            Boolean bool2 = Boolean.FALSE;
            callback.invoke(bool2, bool2);
        }
    }

    /* renamed from: k */
    public static void m9567k(ReactApplicationContext reactApplicationContext, Promise promise) {
        String str;
        if (Environment.getExternalStorageState().equals("mounted")) {
            try {
                promise.resolve(reactApplicationContext.getExternalFilesDir((String) null).getParentFile().getAbsolutePath());
            } catch (Exception e) {
                str = e.getLocalizedMessage();
            }
        } else {
            str = "External storage not mounted";
            promise.reject("RNFetchBlob.getSDCardApplicationDir", str);
        }
    }

    /* renamed from: l */
    public static void m9568l(Promise promise) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            promise.resolve(Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            promise.reject("RNFetchBlob.getSDCardDir", "External storage not mounted");
        }
    }

    /* renamed from: m */
    static Map<String, Object> m9569m(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("DocumentDir", reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put("CacheDir", reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put("DCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        hashMap.put("PictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put("MusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put("DownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put("MovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        hashMap.put("RingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("SDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
            File externalFilesDir = reactApplicationContext.getExternalFilesDir((String) null);
            hashMap.put("SDCardApplicationDir", externalFilesDir != null ? externalFilesDir.getParentFile().getAbsolutePath() : HttpUrl.FRAGMENT_ENCODE_SET);
        }
        hashMap.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        return hashMap;
    }

    /* renamed from: n */
    static String m9570n(String str) {
        return C2264RNFetchBlob.RCTContext.getFilesDir() + "/RNFetchBlobTmp_" + str;
    }

    /* renamed from: o */
    static void m9571o(String str, String str2, Promise promise) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", "SHA-1");
            hashMap.put("sha224", "SHA-224");
            hashMap.put("sha256", "SHA-256");
            hashMap.put("sha384", "SHA-384");
            hashMap.put("sha512", "SHA-512");
            if (!hashMap.containsKey(str2)) {
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
                return;
            }
            File file = new File(str);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
            } else if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + str + "'");
            } else {
                MessageDigest instance = MessageDigest.getInstance((String) hashMap.get(str2));
                FileInputStream fileInputStream = new FileInputStream(str);
                byte[] bArr = new byte[1048576];
                if (file.length() != 0) {
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    }
                }
                StringBuilder sb = new StringBuilder();
                byte[] digest = instance.digest();
                int length = digest.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
                }
                promise.resolve(sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    /* renamed from: p */
    private static InputStream m9572p(String str) {
        return str.startsWith("bundle-assets://") ? C2264RNFetchBlob.RCTContext.getAssets().open(str.replace("bundle-assets://", HttpUrl.FRAGMENT_ENCODE_SET)) : new FileInputStream(new File(str));
    }

    /* renamed from: q */
    static boolean m9573q(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    /* renamed from: r */
    private static boolean m9574r(String str) {
        if (!str.startsWith("bundle-assets://")) {
            return new File(str).exists();
        }
        try {
            C2264RNFetchBlob.RCTContext.getAssets().open(str.replace("bundle-assets://", HttpUrl.FRAGMENT_ENCODE_SET));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: s */
    static void m9575s(String str, Promise promise) {
        try {
            String w = m9579w(str);
            File file = new File(w);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + w + "'");
            } else if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + w + "'");
            } else {
                String[] list = new File(w).list();
                WritableArray createArray = Arguments.createArray();
                for (String pushString : list) {
                    createArray.pushString(pushString);
                }
                promise.resolve(createArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    /* renamed from: t */
    static void m9576t(String str, Callback callback) {
        String w = m9579w(str);
        new C2284a(callback).execute(new String[]{w});
    }

    /* renamed from: u */
    static void m9577u(String str, Promise promise) {
        File file = new File(str);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.isDirectory() ? "Folder" : "File");
            sb.append(" '");
            sb.append(str);
            sb.append("' already exists");
            promise.reject("EEXIST", sb.toString());
            return;
        }
        try {
            if (!file.mkdirs()) {
                promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + str + "'");
                return;
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }

    /* renamed from: v */
    static void m9578v(String str, String str2, Callback callback) {
        File file = new File(str);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + str + "` does not exist");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    file.delete();
                    callback.invoke(new Object[0]);
                    return;
                }
            }
        } catch (FileNotFoundException unused) {
            callback.invoke("Source file not found.");
        } catch (Exception e) {
            callback.invoke(e.toString());
        }
    }

    /* renamed from: w */
    static String m9579w(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return str.startsWith("bundle-assets://") ? str : C2277a.m9531c(C2264RNFetchBlob.RCTContext, Uri.parse(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.facebook.react.bridge.WritableArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073 A[Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0090 A[Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9580x(java.lang.String r8, java.lang.String r9, com.facebook.react.bridge.Promise r10) {
        /*
            java.lang.String r0 = "bundle-assets://"
            java.lang.String r1 = m9579w(r8)
            if (r1 == 0) goto L_0x0009
            r8 = r1
        L_0x0009:
            java.lang.String r2 = "EUNSPECIFIED"
            r3 = 0
            if (r1 == 0) goto L_0x003d
            boolean r4 = r1.startsWith(r0)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            if (r4 == 0) goto L_0x003d
            java.lang.String r1 = ""
            java.lang.String r0 = r8.replace(r0, r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            com.facebook.react.bridge.ReactApplicationContext r1 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r0)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            long r4 = r1.getLength()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r1 = (int) r4     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            com.facebook.react.bridge.ReactApplicationContext r5 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.io.InputStream r0 = r5.open(r0)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r5 = r0.read(r4, r3, r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
        L_0x0039:
            r0.close()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x0071
        L_0x003d:
            if (r1 != 0) goto L_0x0058
            com.facebook.react.bridge.ReactApplicationContext r0 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            android.net.Uri r1 = android.net.Uri.parse(r8)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r1 = r0.available()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r5 = r0.read(r4)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x0039
        L_0x0058:
            java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r0.<init>(r8)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            long r4 = r0.length()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r1 = (int) r4     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r0 = r5.read(r4)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r5 = r0
        L_0x0071:
            if (r5 >= r1) goto L_0x0090
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.String r0 = "Read only "
            r9.append(r0)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r9.append(r5)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.String r0 = " bytes of "
            r9.append(r0)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r9.append(r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.String r9 = r9.toString()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r10.reject((java.lang.String) r2, (java.lang.String) r9)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            return
        L_0x0090:
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r0 = -1
            int r1 = r9.hashCode()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r5 = -1396204209(0xffffffffacc79d4f, float:-5.673385E-12)
            r6 = 2
            r7 = 1
            if (r1 == r5) goto L_0x00bf
            r5 = 3600241(0x36ef71, float:5.045012E-39)
            if (r1 == r5) goto L_0x00b5
            r5 = 93106001(0x58caf51, float:1.3229938E-35)
            if (r1 == r5) goto L_0x00ab
            goto L_0x00c8
        L_0x00ab:
            java.lang.String r1 = "ascii"
            boolean r9 = r9.equals(r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            if (r9 == 0) goto L_0x00c8
            r0 = 1
            goto L_0x00c8
        L_0x00b5:
            java.lang.String r1 = "utf8"
            boolean r9 = r9.equals(r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            if (r9 == 0) goto L_0x00c8
            r0 = 2
            goto L_0x00c8
        L_0x00bf:
            java.lang.String r1 = "base64"
            boolean r9 = r9.equals(r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            if (r9 == 0) goto L_0x00c8
            r0 = 0
        L_0x00c8:
            if (r0 == 0) goto L_0x00ec
            if (r0 == r7) goto L_0x00dd
            if (r0 == r6) goto L_0x00d7
            java.lang.String r9 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r9.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
        L_0x00d3:
            r10.resolve(r9)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x0142
        L_0x00d7:
            java.lang.String r9 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r9.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x00d3
        L_0x00dd:
            com.facebook.react.bridge.WritableArray r9 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r0 = r4.length     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
        L_0x00e2:
            if (r3 >= r0) goto L_0x00d3
            byte r1 = r4[r3]     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r9.pushInt(r1)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            int r3 = r3 + 1
            goto L_0x00e2
        L_0x00ec:
            java.lang.String r9 = android.util.Base64.encodeToString(r4, r6)     // Catch:{ FileNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x00d3
        L_0x00f1:
            r8 = move-exception
            java.lang.String r8 = r8.getLocalizedMessage()
            r10.reject((java.lang.String) r2, (java.lang.String) r8)
            goto L_0x0142
        L_0x00fa:
            r9 = move-exception
            java.lang.String r9 = r9.getLocalizedMessage()
            java.lang.String r0 = "EISDIR"
            boolean r1 = r9.contains(r0)
            if (r1 == 0) goto L_0x0124
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expecting a file but '"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = "' is a directory; "
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = r1.toString()
            r10.reject((java.lang.String) r0, (java.lang.String) r8)
            goto L_0x0142
        L_0x0124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No such file '"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "'; "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "ENOENT"
            r10.reject((java.lang.String) r9, (java.lang.String) r8)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2283d.m9580x(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    /* renamed from: z */
    static void m9581z(ReadableArray readableArray, Callback callback) {
        new C2286c(callback).execute(new ReadableArray[]{readableArray});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo7643A(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f6744b, strArr, strArr2, new C2285b(callback));
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo7644K(String str, String str2, boolean z, Callback callback) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            } else if (file.isDirectory()) {
                callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str, z);
            this.f6746d = str2;
            String uuid = UUID.randomUUID().toString();
            f6743a.put(uuid, this);
            this.f6747e = fileOutputStream;
            callback.invoke(null, null, uuid);
        } catch (Exception e) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094 A[Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010c A[Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7645y(java.lang.String r17, java.lang.String r18, int r19, int r20, java.lang.String r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r0 = r20
            r3 = r21
            java.lang.String r4 = "bundle-assets://"
            java.lang.String r5 = "base64"
            java.lang.String r6 = "error"
            java.lang.String r7 = m9579w(r17)
            if (r7 == 0) goto L_0x0016
            r8 = r7
            goto L_0x0018
        L_0x0016:
            r8 = r17
        L_0x0018:
            boolean r9 = r2.equalsIgnoreCase(r5)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r9 == 0) goto L_0x0021
            r9 = 4095(0xfff, float:5.738E-42)
            goto L_0x0023
        L_0x0021:
            r9 = 4096(0x1000, float:5.74E-42)
        L_0x0023:
            if (r19 <= 0) goto L_0x0027
            r9 = r19
        L_0x0027:
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x0040
            boolean r11 = r8.startsWith(r4)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r11 == 0) goto L_0x0040
            com.facebook.react.bridge.ReactApplicationContext r7 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r4 = r8.replace(r4, r10)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.io.InputStream r4 = r7.open(r4)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            goto L_0x005b
        L_0x0040:
            if (r7 != 0) goto L_0x0051
            com.facebook.react.bridge.ReactApplicationContext r4 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            android.net.Uri r7 = android.net.Uri.parse(r8)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            goto L_0x005b
        L_0x0051:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r4.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
        L_0x005b:
            byte[] r7 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r11 = "utf8"
            boolean r11 = r2.equalsIgnoreCase(r11)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r12 = -1
            java.lang.String r13 = "data"
            r14 = 0
            if (r11 == 0) goto L_0x0094
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.nio.charset.CharsetEncoder r5 = r5.newEncoder()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
        L_0x0073:
            int r9 = r4.read(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r9 == r12) goto L_0x00bb
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.nio.CharBuffer r11 = r11.asCharBuffer()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r5.encode(r11)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r11 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r11.<init>(r7, r14, r9)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r1.m9564h(r3, r13, r11)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r0 <= 0) goto L_0x0092
            long r14 = (long) r0     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            android.os.SystemClock.sleep(r14)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
        L_0x0092:
            r14 = 0
            goto L_0x0073
        L_0x0094:
            java.lang.String r11 = "ascii"
            boolean r11 = r2.equalsIgnoreCase(r11)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r11 == 0) goto L_0x00bd
        L_0x009c:
            int r5 = r4.read(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r5 == r12) goto L_0x00bb
            com.facebook.react.bridge.WritableArray r9 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r11 = 0
        L_0x00a7:
            if (r11 >= r5) goto L_0x00b1
            byte r14 = r7[r11]     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r9.pushInt(r14)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            int r11 = r11 + 1
            goto L_0x00a7
        L_0x00b1:
            r1.m9563g(r3, r13, r9)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r0 <= 0) goto L_0x009c
            long r14 = (long) r0     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            android.os.SystemClock.sleep(r14)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            goto L_0x009c
        L_0x00bb:
            r15 = 0
            goto L_0x00ec
        L_0x00bd:
            boolean r5 = r2.equalsIgnoreCase(r5)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r5 == 0) goto L_0x00ee
        L_0x00c3:
            int r5 = r4.read(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            if (r5 == r12) goto L_0x00bb
            r11 = 2
            if (r5 >= r9) goto L_0x00da
            byte[] r14 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r15 = 0
            java.lang.System.arraycopy(r7, r15, r14, r15, r5)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r5 = android.util.Base64.encodeToString(r14, r11)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
        L_0x00d6:
            r1.m9564h(r3, r13, r5)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            goto L_0x00e0
        L_0x00da:
            r15 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r7, r11)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            goto L_0x00d6
        L_0x00e0:
            if (r0 <= 0) goto L_0x00c3
            r19 = r13
            long r12 = (long) r0     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            android.os.SystemClock.sleep(r12)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r13 = r19
            r12 = -1
            goto L_0x00c3
        L_0x00ec:
            r14 = 0
            goto L_0x010a
        L_0x00ee:
            java.lang.String r0 = "EINVAL"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r7 = "Unrecognized encoding `"
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r5.append(r2)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r7 = "`, should be one of `base64`, `utf8`, `ascii`"
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r1.m9565i(r3, r6, r0, r5)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            r14 = 1
        L_0x010a:
            if (r14 != 0) goto L_0x0111
            java.lang.String r0 = "end"
            r1.m9564h(r3, r0, r10)     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
        L_0x0111:
            r4.close()     // Catch:{ FileNotFoundException -> 0x0135, Exception -> 0x0115 }
            goto L_0x0150
        L_0x0115:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to convert data to "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " encoded string. This might be because this encoding cannot be used for this data."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "EUNSPECIFIED"
            r1.m9565i(r3, r6, r4, r2)
            r0.printStackTrace()
            goto L_0x0150
        L_0x0135:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "No such file '"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = "'"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ENOENT"
            r1.m9565i(r3, r6, r2, r0)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2283d.mo7645y(java.lang.String, java.lang.String, int, int, java.lang.String):void");
    }
}
