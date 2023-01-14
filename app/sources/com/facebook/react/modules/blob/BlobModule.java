package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.p109b0.p110a.C2639a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p174e.p247e.p317m.p318a.C6410a;
import p493i.C10616i;

@C2639a(name = "BlobModule")
public class BlobModule extends NativeBlobModuleSpec {
    public static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs = new HashMap();
    private final NetworkingModule.C2834f mNetworkingRequestBodyHandler = new C2783c();
    private final NetworkingModule.C2835g mNetworkingResponseHandler = new C2784d();
    private final NetworkingModule.C2836h mNetworkingUriHandler = new C2782b();
    private final WebSocketModule.C2884b mWebSocketContentHandler = new C2781a();

    /* renamed from: com.facebook.react.modules.blob.BlobModule$a */
    class C2781a implements WebSocketModule.C2884b {
        C2781a() {
        }

        /* renamed from: a */
        public void mo9105a(C10616i iVar, WritableMap writableMap) {
            byte[] b0 = iVar.mo26268b0();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(b0));
            createMap.putInt("offset", 0);
            createMap.putInt("size", b0.length);
            writableMap.putMap("data", createMap);
            writableMap.putString("type", "blob");
        }

        /* renamed from: b */
        public void mo9106b(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }
    }

    /* renamed from: com.facebook.react.modules.blob.BlobModule$b */
    class C2782b implements NetworkingModule.C2836h {
        C2782b() {
        }

        /* renamed from: a */
        public WritableMap mo9107a(Uri uri) {
            byte[] access$000 = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(access$000));
            createMap.putInt("offset", 0);
            createMap.putInt("size", access$000.length);
            createMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString("name", BlobModule.this.getNameFromUri(uri));
            createMap.putDouble("lastModified", (double) BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        /* renamed from: b */
        public boolean mo9108b(Uri uri, String str) {
            String scheme = uri.getScheme();
            return !("http".equals(scheme) || "https".equals(scheme)) && "blob".equals(str);
        }
    }

    /* renamed from: com.facebook.react.modules.blob.BlobModule$c */
    class C2783c implements NetworkingModule.C2834f {
        C2783c() {
        }

        /* renamed from: a */
        public boolean mo9109a(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        /* renamed from: b */
        public RequestBody mo9110b(ReadableMap readableMap, String str) {
            if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
        }
    }

    /* renamed from: com.facebook.react.modules.blob.BlobModule$d */
    class C2784d implements NetworkingModule.C2835g {
        C2784d() {
        }

        /* renamed from: a */
        public WritableMap mo9111a(ResponseBody responseBody) {
            byte[] bytes = responseBody.bytes();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytes));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytes.length);
            return createMap;
        }

        /* renamed from: b */
        public boolean mo9112b(String str) {
            return "blob".equals(str);
        }
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            throw new FileNotFoundException("File not found for " + uri);
        }
    }

    /* access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? HttpUrl.FRAGMENT_ENCODE_SET : type;
    }

    /* access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
                query.close();
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    public void addNetworkingHandler() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    public void addWebSocketHandler(double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, this.mWebSocketContentHandler);
        }
    }

    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String string = map.getString("type");
            string.hashCode();
            if (string.equals("string")) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                i += bytes.length;
                arrayList.add(i2, bytes);
            } else if (!string.equals("blob")) {
                throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
            } else {
                ReadableMap map2 = map.getMap("data");
                i += map2.getInt("size");
                arrayList.add(i2, resolve(map2));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        return identifier == 0 ? C2693e.m10913c() : C2693e.m10915e("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    public void initialize() {
        BlobCollector.m11128b(getReactApplicationContext(), this);
    }

    public void release(String str) {
        remove(str);
    }

    @C6410a
    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    public void removeWebSocketHandler(double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, (WebSocketModule.C2884b) null);
        }
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] resolve(java.lang.String r3, int r4, int r5) {
        /*
            r2 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r2.mBlobs
            monitor-enter(r0)
            java.util.Map<java.lang.String, byte[]> r1 = r2.mBlobs     // Catch:{ all -> 0x0021 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0021 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0021 }
            if (r3 != 0) goto L_0x0010
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x0010:
            r1 = -1
            if (r5 != r1) goto L_0x0015
            int r5 = r3.length     // Catch:{ all -> 0x0021 }
            int r5 = r5 - r4
        L_0x0015:
            if (r4 > 0) goto L_0x001a
            int r1 = r3.length     // Catch:{ all -> 0x0021 }
            if (r5 == r1) goto L_0x001f
        L_0x001a:
            int r5 = r5 + r4
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r4, r5)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.blob.BlobModule.resolve(java.lang.String, int, int):byte[]");
    }

    public void sendOverSocket(ReadableMap readableMap, double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
        if (webSocketModule != null) {
            byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
            webSocketModule.sendBinary(resolve != null ? C10616i.m36108R(resolve) : null, i);
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }
}
