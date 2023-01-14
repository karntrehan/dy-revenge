package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.C1135a;
import androidx.core.content.FileProvider;
import androidx.core.util.C1174e;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;
import com.facebook.react.p109b0.p110a.C2639a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

@C2639a(name = "RNCWebView")
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    protected static final C5310d shouldOverrideUrlLoadingLock = new C5310d();
    /* access modifiers changed from: private */
    public DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;
    private C2803f webviewFileDownloaderPermissionListener = new C5307a();

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$a */
    class C5307a implements C2803f {
        C5307a() {
        }

        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile();
            }
            return true;
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$b */
    static /* synthetic */ class C5308b {

        /* renamed from: a */
        static final /* synthetic */ int[] f14915a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.reactnativecommunity.webview.RNCWebViewModule$c[] r0 = com.reactnativecommunity.webview.RNCWebViewModule.C5309c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14915a = r0
                com.reactnativecommunity.webview.RNCWebViewModule$c r1 = com.reactnativecommunity.webview.RNCWebViewModule.C5309c.IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14915a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.reactnativecommunity.webview.RNCWebViewModule$c r1 = com.reactnativecommunity.webview.RNCWebViewModule.C5309c.VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.C5308b.<clinit>():void");
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$c */
    private enum C5309c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");
        
        /* access modifiers changed from: private */

        /* renamed from: r */
        public final String f14920r;

        private C5309c(String str) {
            this.f14920r = str;
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$d */
    protected static class C5310d {

        /* renamed from: a */
        private int f14921a = 1;

        /* renamed from: b */
        private final HashMap<Integer, AtomicReference<C5311a>> f14922b = new HashMap<>();

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$d$a */
        protected enum C5311a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected C5310d() {
        }

        /* renamed from: a */
        public synchronized AtomicReference<C5311a> mo16100a(Integer num) {
            return this.f14922b.get(num);
        }

        /* renamed from: b */
        public synchronized C1174e<Integer, AtomicReference<C5311a>> mo16101b() {
            int i;
            AtomicReference atomicReference;
            i = this.f14921a;
            this.f14921a = i + 1;
            atomicReference = new AtomicReference(C5311a.UNDECIDED);
            this.f14922b.put(Integer.valueOf(i), atomicReference);
            return new C1174e<>(Integer.valueOf(i), atomicReference);
        }

        /* renamed from: c */
        public synchronized void mo16102c(Integer num) {
            this.f14922b.remove(num);
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(C5309c.IMAGE.f14920r));
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, C5309c.DEFAULT.f14920r).booleanValue() || arrayContainsString(acceptedMimeType, C5309c.IMAGE.f14920r).booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.FALSE;
        }
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(C5309c.VIDEO.f14920r));
    }

    private Boolean acceptsVideo(String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.FALSE;
        }
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, C5309c.DEFAULT.f14920r).booleanValue() || arrayContainsString(acceptedMimeType, C5309c.VIDEO.f14920r).booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String contains : strArr) {
            if (contains.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{C5309c.DEFAULT.f14920r};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
                if (mimeTypeFromExtension != null) {
                    strArr2[i] = mimeTypeFromExtension;
                } else {
                    strArr2[i] = str;
                }
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File getCapturedFile(com.reactnativecommunity.webview.RNCWebViewModule.C5309c r7) {
        /*
            r6 = this;
            int[] r0 = com.reactnativecommunity.webview.RNCWebViewModule.C5308b.f14915a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            java.lang.String r1 = ""
            if (r7 == r0) goto L_0x001a
            r0 = 2
            if (r7 == r0) goto L_0x0013
            r7 = r1
            r0 = r7
            goto L_0x0023
        L_0x0013:
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES
            java.lang.String r7 = "video-"
            java.lang.String r0 = ".mp4"
            goto L_0x0020
        L_0x001a:
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r7 = "image-"
            java.lang.String r0 = ".jpg"
        L_0x0020:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 >= r4) goto L_0x004d
            java.io.File r7 = android.os.Environment.getExternalStoragePublicDirectory(r7)
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r2)
            goto L_0x005a
        L_0x004d:
            com.facebook.react.bridge.ReactApplicationContext r7 = r6.getReactApplicationContext()
            r2 = 0
            java.io.File r7 = r7.getExternalFilesDir(r2)
            java.io.File r0 = java.io.File.createTempFile(r1, r0, r7)
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.getCapturedFile(com.reactnativecommunity.webview.RNCWebViewModule$c):java.io.File");
    }

    private Intent getFileChooserIntent(String str) {
        String g = str.isEmpty() ? C5309c.DEFAULT.f14920r : str;
        if (str.matches("\\.\\w+")) {
            g = getMimeTypeFromExtension(str.replace(".", HttpUrl.FRAGMENT_ENCODE_SET));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(g);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(C5309c.DEFAULT.f14920r);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.m4407e(reactApplicationContext, packageName + ".fileprovider", file);
    }

    private C2802e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof C2802e) {
            return (C2802e) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private Intent getPhotoIntent() {
        Intent intent;
        Exception e;
        try {
            File capturedFile = getCapturedFile(C5309c.IMAGE);
            this.outputImage = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException | IllegalArgumentException e2) {
                e = e2;
            }
        } catch (IOException | IllegalArgumentException e3) {
            intent = null;
            e = e3;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        }
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else if (intent.getData() == null || i != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent;
        Exception e;
        try {
            File capturedFile = getCapturedFile(C5309c.VIDEO);
            this.outputVideo = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException | IllegalArgumentException e2) {
                e = e2;
            }
        } catch (IOException | IllegalArgumentException e3) {
            intent = null;
            e = e3;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        }
        return intent;
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        boolean z = true;
        if (!(strArr.length == 0 || (strArr.length == 1 && strArr[0] != null && strArr[0].length() == 0))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
    }

    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions() {
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            return true;
        }
        boolean z = C1135a.m4415a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z && i >= 23) {
            getPermissionAwareActivity().mo8378i(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Boolean bool = Boolean.FALSE;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            bool = Boolean.TRUE;
        }
        if (i >= 16 && i <= 18) {
            bool = Boolean.TRUE;
        }
        promise.resolve(bool);
    }

    /* access modifiers changed from: protected */
    public boolean needsCameraPermission() {
        try {
            return Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") && C1135a.m4415a(getCurrentActivity(), "android.permission.CAMERA") != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r9 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(android.app.Activity r8, int r9, int r10, android.content.Intent r11) {
        /*
            r7 = this;
            android.webkit.ValueCallback<android.net.Uri[]> r8 = r7.filePathCallback
            if (r8 != 0) goto L_0x0009
            android.webkit.ValueCallback<android.net.Uri> r8 = r7.filePathCallbackLegacy
            if (r8 != 0) goto L_0x0009
            return
        L_0x0009:
            java.io.File r8 = r7.outputImage
            r0 = 0
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x001b
            long r4 = r8.length()
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x001b
            r8 = 1
            goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            java.io.File r4 = r7.outputVideo
            if (r4 == 0) goto L_0x002a
            long r4 = r4.length()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r1 = -1
            r4 = 0
            if (r9 == r3) goto L_0x005d
            r2 = 3
            if (r9 == r2) goto L_0x0033
            goto L_0x008d
        L_0x0033:
            if (r10 == r1) goto L_0x003b
            android.webkit.ValueCallback<android.net.Uri> r9 = r7.filePathCallbackLegacy
        L_0x0037:
            r9.onReceiveValue(r4)
            goto L_0x008d
        L_0x003b:
            android.webkit.ValueCallback<android.net.Uri> r9 = r7.filePathCallbackLegacy
            if (r8 == 0) goto L_0x0049
            java.io.File r10 = r7.outputImage
            android.net.Uri r10 = r7.getOutputUri(r10)
            r9.onReceiveValue(r10)
            goto L_0x008d
        L_0x0049:
            if (r0 == 0) goto L_0x0055
            java.io.File r10 = r7.outputVideo
            android.net.Uri r10 = r7.getOutputUri(r10)
            r9.onReceiveValue(r10)
            goto L_0x008d
        L_0x0055:
            android.net.Uri r10 = r11.getData()
            r9.onReceiveValue(r10)
            goto L_0x008d
        L_0x005d:
            if (r10 == r1) goto L_0x0064
            android.webkit.ValueCallback<android.net.Uri[]> r9 = r7.filePathCallback
            if (r9 == 0) goto L_0x008d
            goto L_0x0037
        L_0x0064:
            android.webkit.ValueCallback<android.net.Uri[]> r9 = r7.filePathCallback
            if (r8 == 0) goto L_0x0076
            android.net.Uri[] r10 = new android.net.Uri[r3]
            java.io.File r11 = r7.outputImage
            android.net.Uri r11 = r7.getOutputUri(r11)
            r10[r2] = r11
            r9.onReceiveValue(r10)
            goto L_0x008d
        L_0x0076:
            if (r0 == 0) goto L_0x0086
            android.net.Uri[] r10 = new android.net.Uri[r3]
            java.io.File r11 = r7.outputVideo
            android.net.Uri r11 = r7.getOutputUri(r11)
            r10[r2] = r11
            r9.onReceiveValue(r10)
            goto L_0x008d
        L_0x0086:
            android.net.Uri[] r10 = r7.getSelectedFiles(r11, r10)
            r9.onReceiveValue(r10)
        L_0x008d:
            java.io.File r9 = r7.outputImage
            if (r9 == 0) goto L_0x0096
            if (r8 != 0) goto L_0x0096
            r9.delete()
        L_0x0096:
            java.io.File r8 = r7.outputVideo
            if (r8 == 0) goto L_0x009f
            if (r0 != 0) goto L_0x009f
            r8.delete()
        L_0x009f:
            r7.filePathCallback = r4
            r7.filePathCallbackLegacy = r4
            r7.outputImage = r4
            r7.outputVideo = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    public void onNewIntent(Intent intent) {
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void onShouldStartLoadWithRequestCallback(boolean z, int i) {
        AtomicReference<C5310d.C5311a> a = shouldOverrideUrlLoadingLock.mo16100a(Integer.valueOf(i));
        if (a != null) {
            synchronized (a) {
                a.set(z ? C5310d.C5311a.DO_NOT_OVERRIDE : C5310d.C5311a.SHOULD_OVERRIDE);
                a.notify();
            }
        }
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), HttpUrl.FRAGMENT_ENCODE_SET);
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
        return true;
    }
}
