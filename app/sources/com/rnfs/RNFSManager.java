package com.rnfs;

import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.p109b0.p110a.C2639a;
import com.rnfs.C9824a;
import com.rnfs.C9833f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C2639a(name = "RNFSManager")
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<C9829c> downloaders = new SparseArray<>();
    private ReactApplicationContext reactContext;
    private SparseArray<C9838h> uploaders = new SparseArray<>();

    /* renamed from: com.rnfs.RNFSManager$a */
    class C9814a extends C9823j {

        /* renamed from: b */
        final /* synthetic */ File f26293b;

        /* renamed from: c */
        final /* synthetic */ Promise f26294c;

        /* renamed from: d */
        final /* synthetic */ String f26295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9814a(File file, Promise promise, String str) {
            super(RNFSManager.this, (C9814a) null);
            this.f26293b = file;
            this.f26294c = promise;
            this.f26295d = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f26293b.delete();
                this.f26294c.resolve(Boolean.TRUE);
                return;
            }
            exc.printStackTrace();
            RNFSManager.this.reject(this.f26294c, this.f26295d, exc);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$b */
    class C9815b extends C9823j {

        /* renamed from: b */
        final /* synthetic */ Promise f26297b;

        /* renamed from: c */
        final /* synthetic */ String f26298c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9815b(Promise promise, String str) {
            super(RNFSManager.this, (C9814a) null);
            this.f26297b = promise;
            this.f26298c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f26297b.resolve((Object) null);
                return;
            }
            exc.printStackTrace();
            RNFSManager.this.reject(this.f26297b, this.f26298c, exc);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$c */
    class C9816c implements C9824a.C9827c {

        /* renamed from: a */
        final /* synthetic */ int f26300a;

        /* renamed from: b */
        final /* synthetic */ Promise f26301b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f26302c;

        C9816c(int i, Promise promise, ReadableMap readableMap) {
            this.f26300a = i;
            this.f26301b = promise;
            this.f26302c = readableMap;
        }

        /* renamed from: a */
        public void mo24595a(C9828b bVar) {
            if (bVar.f26331c == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("jobId", this.f26300a);
                createMap.putInt("statusCode", bVar.f26329a);
                createMap.putDouble("bytesWritten", (double) bVar.f26330b);
                this.f26301b.resolve(createMap);
                return;
            }
            RNFSManager.this.reject(this.f26301b, this.f26302c.getString("toFile"), bVar.f26331c);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$d */
    class C9817d implements C9824a.C9825a {

        /* renamed from: a */
        final /* synthetic */ int f26304a;

        C9817d(int i) {
            this.f26304a = i;
        }

        /* renamed from: a */
        public void mo24596a(int i, long j, Map<String, String> map) {
            WritableMap createMap = Arguments.createMap();
            for (Map.Entry next : map.entrySet()) {
                createMap.putString((String) next.getKey(), (String) next.getValue());
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("jobId", this.f26304a);
            createMap2.putInt("statusCode", i);
            createMap2.putDouble("contentLength", (double) j);
            createMap2.putMap("headers", createMap);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", createMap2);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$e */
    class C9818e implements C9824a.C9826b {

        /* renamed from: a */
        final /* synthetic */ int f26306a;

        C9818e(int i) {
            this.f26306a = i;
        }

        /* renamed from: a */
        public void mo24597a(long j, long j2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f26306a);
            createMap.putDouble("contentLength", (double) j);
            createMap.putDouble("bytesWritten", (double) j2);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", createMap);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$f */
    class C9819f implements C9833f.C9835b {

        /* renamed from: a */
        final /* synthetic */ int f26308a;

        /* renamed from: b */
        final /* synthetic */ Promise f26309b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f26310c;

        C9819f(int i, Promise promise, ReadableMap readableMap) {
            this.f26308a = i;
            this.f26309b = promise;
            this.f26310c = readableMap;
        }

        /* renamed from: a */
        public void mo24598a(C9837g gVar) {
            if (gVar.f26348c == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("jobId", this.f26308a);
                createMap.putInt("statusCode", gVar.f26346a);
                createMap.putMap("headers", gVar.f26347b);
                createMap.putString("body", gVar.f26349d);
                this.f26309b.resolve(createMap);
                return;
            }
            RNFSManager.this.reject(this.f26309b, this.f26310c.getString("toUrl"), gVar.f26348c);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$g */
    class C9820g implements C9833f.C9834a {

        /* renamed from: a */
        final /* synthetic */ int f26312a;

        C9820g(int i) {
            this.f26312a = i;
        }

        /* renamed from: a */
        public void mo24599a() {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f26312a);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", createMap);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$h */
    class C9821h implements C9833f.C9836c {

        /* renamed from: a */
        final /* synthetic */ int f26314a;

        C9821h(int i) {
            this.f26314a = i;
        }

        /* renamed from: a */
        public void mo24600a(int i, int i2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f26314a);
            createMap.putInt("totalBytesExpectedToSend", i);
            createMap.putInt("totalBytesSent", i2);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadProgress", createMap);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$i */
    class C9822i implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        final /* synthetic */ Promise f26316a;

        C9822i(Promise promise) {
            this.f26316a = promise;
        }

        public void onMediaScannerConnected() {
        }

        public void onScanCompleted(String str, Uri uri) {
            this.f26316a.resolve(str);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$j */
    private class C9823j extends AsyncTask<String, Void, Exception> {
        private C9823j() {
        }

        /* synthetic */ C9823j(RNFSManager rNFSManager, C9814a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Exception doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                InputStream access$200 = RNFSManager.this.getInputStream(str);
                OutputStream access$300 = RNFSManager.this.getOutputStream(str2, false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = access$200.read(bArr);
                    if (read > 0) {
                        access$300.write(bArr, 0, read);
                        Thread.yield();
                    } else {
                        access$200.close();
                        access$300.close();
                        return null;
                    }
                }
            } catch (Exception e) {
                return e;
            }
        }
    }

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File DeleteRecursive : file.listFiles()) {
                DeleteRecursive(DeleteRecursive);
            }
        }
        file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058 A[SYNTHETIC, Splitter:B:31:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A[SYNTHETIC, Splitter:B:35:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void copyInputStream(java.io.InputStream r8, java.lang.String r9, java.lang.String r10, com.facebook.react.bridge.Promise r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.io.OutputStream r2 = r7.getOutputStream(r10, r1)     // Catch:{ Exception -> 0x002a, all -> 0x0028 }
            r3 = 10240(0x2800, float:1.4349E-41)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0026 }
        L_0x000a:
            int r4 = r8.read(r3)     // Catch:{ Exception -> 0x0026 }
            r5 = -1
            if (r4 == r5) goto L_0x0015
            r2.write(r3, r1, r4)     // Catch:{ Exception -> 0x0026 }
            goto L_0x000a
        L_0x0015:
            r11.resolve(r0)     // Catch:{ Exception -> 0x0026 }
            r8.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x001d
        L_0x001c:
        L_0x001d:
            if (r2 == 0) goto L_0x0055
        L_0x001f:
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0055
        L_0x0023:
            r9 = move-exception
            r0 = r2
            goto L_0x0056
        L_0x0026:
            r0 = move-exception
            goto L_0x002e
        L_0x0028:
            r9 = move-exception
            goto L_0x0056
        L_0x002a:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L_0x002e:
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = "Failed to copy '%s' to %s (%s)"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0023 }
            r5[r1] = r9     // Catch:{ all -> 0x0023 }
            r1 = 1
            r5[r1] = r10     // Catch:{ all -> 0x0023 }
            r10 = 2
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0023 }
            r5[r10] = r0     // Catch:{ all -> 0x0023 }
            java.lang.String r10 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0023 }
            r3.<init>(r10)     // Catch:{ all -> 0x0023 }
            r7.reject(r11, r9, r3)     // Catch:{ all -> 0x0023 }
            if (r8 == 0) goto L_0x0052
            r8.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            if (r2 == 0) goto L_0x0055
            goto L_0x001f
        L_0x0055:
            return
        L_0x0056:
            if (r8 == 0) goto L_0x005d
            r8.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.copyInputStream(java.io.InputStream, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    private Uri getFileUri(String str, boolean z) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            return parse;
        }
        File file = new File(str);
        if (z || !file.isDirectory()) {
            return Uri.parse("file://" + str);
        }
        throw new C9831d("EISDIR", "EISDIR: illegal operation on a directory, read '" + str + "'");
    }

    /* access modifiers changed from: private */
    public InputStream getInputStream(String str) {
        try {
            InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (openInputStream != null) {
                return openInputStream;
            }
            throw new C9831d("ENOENT", "ENOENT: could not open an input stream for '" + str + "'");
        } catch (FileNotFoundException e) {
            throw new C9831d("ENOENT", "ENOENT: " + e.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private String getOriginalFilepath(String str, boolean z) {
        Uri fileUri = getFileUri(str, z);
        if (fileUri.getScheme().equals("content")) {
            try {
                Cursor query = this.reactContext.getContentResolver().query(fileUri, (String[]) null, (String) null, (String[]) null, (String) null);
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z) {
        try {
            OutputStream openOutputStream = this.reactContext.getContentResolver().openOutputStream(getFileUri(str, false), z ? "wa" : getWriteAccessByAPILevel());
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw new C9831d("ENOENT", "ENOENT: could not open an output stream for '" + str + "'");
        } catch (FileNotFoundException e) {
            throw new C9831d("ENOENT", "ENOENT: " + e.getMessage() + ", open '" + str + "'");
        }
    }

    private int getResIdentifier(String str) {
        boolean z = true;
        String substring = str.substring(str.lastIndexOf(".") + 1);
        String substring2 = str.substring(0, str.lastIndexOf("."));
        if (!substring.equals("png") && !substring.equals("jpg") && !substring.equals("jpeg") && !substring.equals("bmp") && !substring.equals("gif") && !substring.equals("webp") && !substring.equals("psd") && !substring.equals("svg") && !substring.equals("tiff")) {
            z = false;
        }
        return getReactApplicationContext().getResources().getIdentifier(substring2, Boolean.valueOf(z).booleanValue() ? "drawable" : "raw", getReactApplicationContext().getPackageName());
    }

    private String getWriteAccessByAPILevel() {
        return Build.VERSION.SDK_INT <= 28 ? "w" : "rwt";
    }

    /* access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        String str2;
        C9831d dVar;
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
            return;
        }
        if (exc instanceof C9831d) {
            C9831d dVar2 = (C9831d) exc;
            str2 = dVar2.mo24611a();
            dVar = dVar2;
        } else {
            str2 = null;
            dVar = exc;
        }
        promise.reject(str2, dVar.getMessage());
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    /* access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext2, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext2.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve((Object) null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void copyFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        new C9815b(promise, str).execute(new String[]{str, str2});
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(String.format("Asset '%s' could not be opened", new Object[]{str})));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(String.format("Res '%s' could not be opened", new Object[]{str})));
        }
    }

    @ReactMethod
    public void downloadFile(ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            int i = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i2 = readableMap.getInt("progressInterval");
            int i3 = readableMap.getInt("progressDivider");
            int i4 = readableMap.getInt("readTimeout");
            int i5 = readableMap.getInt("connectionTimeout");
            boolean z = readableMap.getBoolean("hasBeginCallback");
            boolean z2 = readableMap.getBoolean("hasProgressCallback");
            C9824a aVar = new C9824a();
            aVar.f26319a = url;
            aVar.f26320b = file;
            aVar.f26321c = map;
            aVar.f26322d = i2;
            aVar.f26323e = (float) i3;
            aVar.f26324f = i4;
            aVar.f26325g = i5;
            aVar.f26326h = new C9816c(i, promise, readableMap);
            if (z) {
                aVar.f26327i = new C9817d(i);
            }
            if (z2) {
                aVar.f26328j = new C9818e(i);
            }
            C9829c cVar = new C9829c();
            cVar.execute(new C9824a[]{aVar});
            this.downloaders.put(i, cVar);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|(1:31)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.resolve(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0036 */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void existsAssets(java.lang.String r3, com.facebook.react.bridge.Promise r4) {
        /*
            r2 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r2.getReactApplicationContext()     // Catch:{ Exception -> 0x0037 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x0037 }
            java.lang.String[] r1 = r0.list(r3)     // Catch:{ Exception -> 0x0017 }
            if (r1 == 0) goto L_0x0017
            int r1 = r1.length     // Catch:{ Exception -> 0x0017 }
            if (r1 <= 0) goto L_0x0017
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0017 }
            r4.resolve(r1)     // Catch:{ Exception -> 0x0017 }
            return
        L_0x0017:
            r1 = 0
            java.io.InputStream r1 = r0.open(r3)     // Catch:{ Exception -> 0x0029 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0029 }
            r4.resolve(r0)     // Catch:{ Exception -> 0x0029 }
            if (r1 == 0) goto L_0x003e
        L_0x0023:
            r1.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x003e
        L_0x0027:
            r0 = move-exception
            goto L_0x0031
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0027 }
            r4.resolve(r0)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x003e
            goto L_0x0023
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r0.printStackTrace()
            r2.reject(r4, r3, r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.existsAssets(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            promise.resolve(getResIdentifier(str) > 0 ? Boolean.TRUE : Boolean.FALSE);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs((String) null);
        WritableArray createArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                createArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(createArray);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(RNFSDocumentDirectory, 0);
        hashMap.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        hashMap.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put(RNFSFileTypeRegular, 0);
        hashMap.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalStorageDirectoryPath, (Object) null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            hashMap.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalDirectoryPath, (Object) null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            hashMap.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalCachesDirectoryPath, (Object) null);
        }
        return hashMap;
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        long j;
        long j2;
        long j3;
        long j4;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j3 = statFs.getTotalBytes();
            j2 = statFs.getFreeBytes();
            j = statFs2.getTotalBytes();
            j4 = statFs2.getFreeBytes();
        } else {
            long blockSize = (long) statFs.getBlockSize();
            j3 = ((long) statFs.getBlockCount()) * blockSize;
            j2 = ((long) statFs.getAvailableBlocks()) * blockSize;
            j4 = 0;
            j = 0;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("totalSpace", (double) j3);
        createMap.putDouble("freeSpace", (double) j2);
        createMap.putDouble("totalSpaceEx", (double) j);
        createMap.putDouble("freeSpaceEx", (double) j4);
        promise.resolve(createMap);
    }

    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", "SHA-1");
            hashMap.put("sha224", "SHA-224");
            hashMap.put("sha256", "SHA-256");
            hashMap.put("sha384", "SHA-384");
            hashMap.put("sha512", "SHA-512");
            if (hashMap.containsKey(str2)) {
                File file = new File(str);
                if (file.isDirectory()) {
                    rejectFileIsDirectory(promise);
                } else if (!file.exists()) {
                    rejectFileNotFound(promise, str);
                } else {
                    MessageDigest instance = MessageDigest.getInstance((String) hashMap.get(str2));
                    FileInputStream fileInputStream = new FileInputStream(str);
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    }
                    StringBuilder sb = new StringBuilder();
                    byte[] digest = instance.digest();
                    int length = digest.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
                    }
                    promise.resolve(sb.toString());
                }
            } else {
                throw new Exception("Invalid hash algorithm");
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (file.exists()) {
                promise.resolve((Object) null);
                return;
            }
            throw new Exception("Directory could not be created");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void moveFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            if (!file.renameTo(new File(str2))) {
                new C9814a(file, promise, str).execute(new String[]{str, str2});
                return;
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    @ReactMethod
    public void read(String str, int i, int i2, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i];
            inputStream.skip((long) i2);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i), 2));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                WritableArray createArray = Arguments.createArray();
                for (File file2 : listFiles) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble("mtime", ((double) file2.lastModified()) / 1000.0d);
                    createMap.putString("name", file2.getName());
                    createMap.putString("path", file2.getAbsolutePath());
                    createMap.putDouble("size", (double) file2.length());
                    createMap.putInt("type", file2.isDirectory() ? 1 : 0);
                    createArray.pushMap(createMap);
                }
                promise.resolve(createArray);
                return;
            }
            throw new Exception("Folder does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[Catch:{ IOException -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066 A[Catch:{ IOException -> 0x0074 }] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void readDirAssets(java.lang.String r13, com.facebook.react.bridge.Promise r14) {
        /*
            r12 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r12.getReactApplicationContext()     // Catch:{ IOException -> 0x0074 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0074 }
            java.lang.String[] r1 = r0.list(r13)     // Catch:{ IOException -> 0x0074 }
            com.facebook.react.bridge.WritableArray r2 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ IOException -> 0x0074 }
            int r3 = r1.length     // Catch:{ IOException -> 0x0074 }
            r4 = 0
            r5 = 0
        L_0x0013:
            if (r5 >= r3) goto L_0x0070
            r6 = r1[r5]     // Catch:{ IOException -> 0x0074 }
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ IOException -> 0x0074 }
            java.lang.String r8 = "name"
            r7.putString(r8, r6)     // Catch:{ IOException -> 0x0074 }
            boolean r8 = r13.isEmpty()     // Catch:{ IOException -> 0x0074 }
            r9 = 1
            if (r8 == 0) goto L_0x0028
            goto L_0x0035
        L_0x0028:
            java.lang.String r8 = "%s/%s"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0074 }
            r10[r4] = r13     // Catch:{ IOException -> 0x0074 }
            r10[r9] = r6     // Catch:{ IOException -> 0x0074 }
            java.lang.String r6 = java.lang.String.format(r8, r10)     // Catch:{ IOException -> 0x0074 }
        L_0x0035:
            java.lang.String r8 = "path"
            r7.putString(r8, r6)     // Catch:{ IOException -> 0x0074 }
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r6)     // Catch:{ IOException -> 0x004f }
            if (r6 == 0) goto L_0x004c
            long r10 = r6.getLength()     // Catch:{ IOException -> 0x004f }
            int r8 = (int) r10
            r6.close()     // Catch:{ IOException -> 0x004a }
            r6 = 0
            goto L_0x005c
        L_0x004a:
            r6 = move-exception
            goto L_0x0051
        L_0x004c:
            r6 = 1
            r8 = 0
            goto L_0x005c
        L_0x004f:
            r6 = move-exception
            r8 = 0
        L_0x0051:
            java.lang.String r6 = r6.getMessage()     // Catch:{ IOException -> 0x0074 }
            java.lang.String r10 = "compressed"
            boolean r6 = r6.contains(r10)     // Catch:{ IOException -> 0x0074 }
            r6 = r6 ^ r9
        L_0x005c:
            java.lang.String r10 = "size"
            r7.putInt(r10, r8)     // Catch:{ IOException -> 0x0074 }
            java.lang.String r8 = "type"
            if (r6 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            r7.putInt(r8, r9)     // Catch:{ IOException -> 0x0074 }
            r2.pushMap(r7)     // Catch:{ IOException -> 0x0074 }
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0070:
            r14.resolve(r2)     // Catch:{ IOException -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r0 = move-exception
            r12.reject(r14, r13, r0)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.readDirAssets(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            inputStream = getReactApplicationContext().getAssets().open(str, 0);
            if (inputStream == null) {
                reject(promise, str, new Exception("Failed to open file"));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                promise.resolve(Base64.encodeToString(bArr, 2));
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
            if (inputStream == null) {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            inputStream = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
            if (inputStream == null) {
                reject(promise, str, new Exception("Failed to open file"));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                promise.resolve(Base64.encodeToString(bArr, 2));
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
            if (inputStream == null) {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void scanFile(String str, Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, (String[]) null, new C9822i(promise));
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.setReadable(bool.booleanValue(), bool2.booleanValue());
                promise.resolve(Boolean.TRUE);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        int i = 1;
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (file.exists()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("ctime", (int) (file.lastModified() / 1000));
                createMap.putInt("mtime", (int) (file.lastModified() / 1000));
                createMap.putDouble("size", (double) file.length());
                if (!file.isDirectory()) {
                    i = 0;
                }
                createMap.putInt("type", i);
                createMap.putString("originalFilepath", originalFilepath);
                promise.resolve(createMap);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void stopDownload(int i) {
        C9829c cVar = this.downloaders.get(i);
        if (cVar != null) {
            cVar.mo24608g();
        }
    }

    @ReactMethod
    public void stopUpload(int i) {
        C9838h hVar = this.uploaders.get(i);
        if (hVar != null) {
            hVar.mo24615f();
        }
    }

    @ReactMethod
    public void touch(String str, double d, double d2, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d)));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                DeleteRecursive(file);
                promise.resolve((Object) null);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void uploadFiles(ReadableMap readableMap, Promise promise) {
        String str;
        ReadableMap readableMap2 = readableMap;
        Promise promise2 = promise;
        try {
            ReadableArray array = readableMap2.getArray("files");
            URL url = new URL(readableMap2.getString("toUrl"));
            int i = readableMap2.getInt("jobId");
            ReadableMap map = readableMap2.getMap("headers");
            ReadableMap map2 = readableMap2.getMap("fields");
            String string = readableMap2.getString("method");
            boolean z = readableMap2.getBoolean("binaryStreamOnly");
            boolean z2 = readableMap2.getBoolean("hasBeginCallback");
            boolean z3 = readableMap2.getBoolean("hasProgressCallback");
            ArrayList<ReadableMap> arrayList = new ArrayList<>();
            C9833f fVar = new C9833f();
            str = "toUrl";
            int i2 = 0;
            while (i2 < array.size()) {
                try {
                    arrayList.add(array.getMap(i2));
                    i2++;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    reject(promise2, readableMap2.getString(str), e);
                }
            }
            fVar.f26337a = url;
            fVar.f26338b = arrayList;
            fVar.f26340d = map;
            fVar.f26342f = string;
            fVar.f26341e = map2;
            fVar.f26339c = z;
            fVar.f26343g = new C9819f(i, promise2, readableMap2);
            if (z2) {
                fVar.f26345i = new C9820g(i);
            }
            if (z3) {
                fVar.f26344h = new C9821h(i);
            }
            C9838h hVar = new C9838h();
            hVar.execute(new C9833f[]{fVar});
            this.uploaders.put(i, hVar);
        } catch (Exception e2) {
            e = e2;
            str = "toUrl";
            e.printStackTrace();
            reject(promise2, readableMap2.getString(str), e);
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            if (i < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(decode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek((long) i);
                randomAccessFile.write(decode);
                randomAccessFile.close();
            }
            promise.resolve((Object) null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve((Object) null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }
}
