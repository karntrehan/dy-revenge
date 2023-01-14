package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.C1135a;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;
import com.yalantis.ucrop.C10146i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

class PickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CAMERA_PICKER_REQUEST = 61111;
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "E_ACTIVITY_DOES_NOT_EXIST";
    private static final String E_CALLBACK_ERROR = "E_CALLBACK_ERROR";
    private static final String E_CAMERA_IS_NOT_AVAILABLE = "E_CAMERA_IS_NOT_AVAILABLE";
    private static final String E_CANNOT_LAUNCH_CAMERA = "E_CANNOT_LAUNCH_CAMERA";
    private static final String E_ERROR_WHILE_CLEANING_FILES = "E_ERROR_WHILE_CLEANING_FILES";
    private static final String E_FAILED_TO_OPEN_CAMERA = "E_FAILED_TO_OPEN_CAMERA";
    private static final String E_FAILED_TO_SHOW_PICKER = "E_FAILED_TO_SHOW_PICKER";
    private static final String E_NO_CAMERA_PERMISSION_KEY = "E_NO_CAMERA_PERMISSION";
    private static final String E_NO_CAMERA_PERMISSION_MSG = "User did not grant camera permission.";
    private static final String E_NO_IMAGE_DATA_FOUND = "E_NO_IMAGE_DATA_FOUND";
    private static final String E_NO_LIBRARY_PERMISSION_KEY = "E_NO_LIBRARY_PERMISSION";
    private static final String E_NO_LIBRARY_PERMISSION_MSG = "User did not grant library permission.";
    private static final String E_PICKER_CANCELLED_KEY = "E_PICKER_CANCELLED";
    private static final String E_PICKER_CANCELLED_MSG = "User cancelled image selection";
    private static final int IMAGE_PICKER_REQUEST = 61110;
    /* access modifiers changed from: private */
    public C5226a compression = new C5226a();
    private String cropperActiveWidgetColor = null;
    private boolean cropperCircleOverlay = false;
    private String cropperStatusBarColor = null;
    private String cropperToolbarColor = null;
    private String cropperToolbarTitle = null;
    private String cropperToolbarWidgetColor = null;
    private boolean cropping = false;
    private boolean disableCropperColorSetters = false;
    private boolean enableRotationGesture = false;
    private boolean freeStyleCropEnabled = false;
    private int height = 0;
    private boolean hideBottomControls = false;
    private boolean includeBase64 = false;
    private boolean includeExif = false;
    private Uri mCameraCaptureURI;
    private String mCurrentMediaPath;
    private String mediaType = "any";
    private boolean multiple = false;
    /* access modifiers changed from: private */
    public ReadableMap options;
    private ReactApplicationContext reactContext;
    /* access modifiers changed from: private */
    public C5231f resultCollector = new C5231f();
    private boolean showCropFrame = true;
    private boolean showCropGuidelines = true;
    private boolean useFrontCamera = false;
    private int width = 0;

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$a */
    class C5217a implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ PickerModule f14717a;

        /* renamed from: b */
        final /* synthetic */ Activity f14718b;

        /* renamed from: c */
        final /* synthetic */ Promise f14719c;

        C5217a(PickerModule pickerModule, Activity activity, Promise promise) {
            this.f14717a = pickerModule;
            this.f14718b = activity;
            this.f14719c = promise;
        }

        /* renamed from: a */
        public Void call() {
            try {
                File file = new File(this.f14717a.getTmpDir(this.f14718b));
                if (file.exists()) {
                    this.f14717a.deleteRecursive(file);
                    this.f14719c.resolve((Object) null);
                    return null;
                }
                throw new Exception("File does not exist");
            } catch (Exception e) {
                e.printStackTrace();
                this.f14719c.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$b */
    class C5218b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f14721a;

        /* renamed from: b */
        final /* synthetic */ PickerModule f14722b;

        /* renamed from: c */
        final /* synthetic */ Promise f14723c;

        C5218b(String str, PickerModule pickerModule, Promise promise) {
            this.f14721a = str;
            this.f14722b = pickerModule;
            this.f14723c = promise;
        }

        /* renamed from: a */
        public Void call() {
            try {
                String str = this.f14721a;
                if (str.startsWith("file://")) {
                    str = str.substring(7);
                }
                File file = new File(str);
                if (file.exists()) {
                    this.f14722b.deleteRecursive(file);
                    this.f14723c.resolve((Object) null);
                    return null;
                }
                throw new Exception("File does not exist. Path: " + str);
            } catch (Exception e) {
                e.printStackTrace();
                this.f14723c.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$c */
    class C5219c implements C2803f {

        /* renamed from: f */
        final /* synthetic */ Promise f14725f;

        /* renamed from: o */
        final /* synthetic */ Callable f14726o;

        C5219c(Promise promise, Callable callable) {
            this.f14725f = promise;
            this.f14726o = callable;
        }

        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            String str;
            Promise promise;
            String str2;
            if (i == 1) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str3 = strArr[i2];
                    if (iArr[i2] == -1) {
                        if (str3.equals("android.permission.CAMERA")) {
                            promise = this.f14725f;
                            str = PickerModule.E_NO_CAMERA_PERMISSION_KEY;
                            str2 = PickerModule.E_NO_CAMERA_PERMISSION_MSG;
                        } else {
                            boolean equals = str3.equals("android.permission.WRITE_EXTERNAL_STORAGE");
                            str = PickerModule.E_NO_LIBRARY_PERMISSION_KEY;
                            if (equals) {
                                promise = this.f14725f;
                                str2 = PickerModule.E_NO_LIBRARY_PERMISSION_MSG;
                            } else {
                                promise = this.f14725f;
                                str2 = "Required permission missing";
                            }
                        }
                        promise.reject(str, str2);
                        return true;
                    }
                }
                try {
                    this.f14726o.call();
                } catch (Exception e) {
                    this.f14725f.reject(PickerModule.E_CALLBACK_ERROR, "Unknown error", (Throwable) e);
                }
            }
            return true;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$d */
    class C5220d implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f14728a;

        C5220d(Activity activity) {
            this.f14728a = activity;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiateCamera(this.f14728a);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$e */
    class C5221e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f14730a;

        C5221e(Activity activity) {
            this.f14730a = activity;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiatePicker(this.f14730a);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$f */
    class C5222f implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f14732a;

        /* renamed from: b */
        final /* synthetic */ Uri f14733b;

        C5222f(Activity activity, Uri uri) {
            this.f14732a = activity;
            this.f14733b = uri;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.startCropping(this.f14732a, this.f14733b);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g */
    class C5223g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Activity f14735f;

        /* renamed from: o */
        final /* synthetic */ String f14736o;

        /* renamed from: p */
        final /* synthetic */ String f14737p;

        /* renamed from: q */
        final /* synthetic */ String f14738q;

        /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g$a */
        class C5224a implements Callback {
            C5224a() {
            }

            public void invoke(Object... objArr) {
                String str = objArr[0];
                try {
                    Bitmap access$600 = PickerModule.this.validateVideo(str);
                    long lastModified = new File(str).lastModified();
                    long longValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("width", access$600.getWidth());
                    writableNativeMap.putInt("height", access$600.getHeight());
                    writableNativeMap.putString("mime", C5223g.this.f14738q);
                    writableNativeMap.putInt("size", (int) new File(str).length());
                    writableNativeMap.putInt("duration", (int) longValue);
                    writableNativeMap.putString("path", "file://" + str);
                    writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
                    PickerModule.this.resultCollector.mo15835d(writableNativeMap);
                } catch (Exception e) {
                    PickerModule.this.resultCollector.mo15834c(PickerModule.E_NO_IMAGE_DATA_FOUND, e);
                }
            }
        }

        /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g$b */
        class C5225b implements Callback {
            C5225b() {
            }

            public void invoke(Object... objArr) {
                WritableNativeMap writableNativeMap = objArr[0];
                PickerModule.this.resultCollector.mo15833b(writableNativeMap.getString("code"), writableNativeMap.getString("message"));
            }
        }

        C5223g(Activity activity, String str, String str2, String str3) {
            this.f14735f = activity;
            this.f14736o = str;
            this.f14737p = str2;
            this.f14738q = str3;
        }

        public void run() {
            PickerModule.this.compression.mo15829d(this.f14735f, PickerModule.this.options, this.f14736o, this.f14737p, new PromiseImpl(new C5224a(), new C5225b()));
        }
    }

    PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    private void cameraPickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.mo15833b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        } else if (i2 == -1) {
            Uri uri = this.mCameraCaptureURI;
            if (uri == null) {
                this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
            } else if (this.cropping) {
                new C10146i.C10147a().mo25224e(Bitmap.CompressFormat.JPEG);
                startCropping(activity, uri);
            } else {
                try {
                    this.resultCollector.mo15836e(1);
                    WritableMap selection = getSelection(activity, uri, true);
                    if (selection != null) {
                        this.resultCollector.mo15835d(selection);
                    }
                } catch (Exception e) {
                    this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                }
            }
        }
    }

    private void configureCropperColors(C10146i.C10147a aVar) {
        String str = this.cropperActiveWidgetColor;
        if (str != null) {
            aVar.mo25221b(Color.parseColor(str));
        }
        String str2 = this.cropperToolbarColor;
        if (str2 != null) {
            aVar.mo25231l(Color.parseColor(str2));
        }
        String str3 = this.cropperStatusBarColor;
        if (str3 != null) {
            aVar.mo25230k(Color.parseColor(str3));
        }
        String str4 = this.cropperToolbarWidgetColor;
        if (str4 != null) {
            aVar.mo25233n(Color.parseColor(str4));
        }
    }

    private File createImageFile() {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.mCurrentMediaPath = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private File createVideoFile() {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.mCurrentMediaPath = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private void croppingResult(Activity activity, int i, int i2, Intent intent) {
        if (intent != null) {
            Uri b = C10146i.m34329b(intent);
            if (b != null) {
                try {
                    if (this.width > 0 && this.height > 0) {
                        C5226a aVar = this.compression;
                        ReactApplicationContext reactApplicationContext = this.reactContext;
                        String path = b.getPath();
                        int i3 = this.width;
                        int i4 = this.height;
                        b = Uri.fromFile(aVar.mo15830e(reactApplicationContext, path, i3, i4, i3, i4, 100));
                    }
                    WritableMap selection = getSelection(activity, b, false);
                    if (selection != null) {
                        selection.putMap("cropRect", getCroppedRectMap(intent));
                        this.resultCollector.mo15836e(1);
                        this.resultCollector.mo15835d(selection);
                        return;
                    }
                    throw new Exception("Cannot crop video files");
                } catch (Exception e) {
                    this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                }
            } else {
                this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, "Cannot find image data");
            }
        } else {
            this.resultCollector.mo15833b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        }
    }

    /* access modifiers changed from: private */
    public void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File deleteRecursive : file.listFiles()) {
                deleteRecursive(deleteRecursive);
            }
        }
        file.delete();
    }

    private void getAsyncSelection(Activity activity, Uri uri, boolean z) {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath == null || resolveRealPath.isEmpty()) {
            this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve asset path.");
            return;
        }
        String mimeType = getMimeType(resolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            this.resultCollector.mo15835d(getImage(activity, resolveRealPath));
        } else {
            getVideo(activity, resolveRealPath, mimeType);
        }
    }

    private String getBase64StringFromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static WritableMap getCroppedRectMap(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("x", intent.getIntExtra("com.yalantis.ucrop.OffsetX", -1));
        writableNativeMap.putInt("y", intent.getIntExtra("com.yalantis.ucrop.OffsetY", -1));
        writableNativeMap.putInt("width", intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1));
        writableNativeMap.putInt("height", intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1));
        return writableNativeMap;
    }

    private WritableMap getImage(Activity activity, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith("http://") || str.startsWith("https://")) {
            throw new Exception("Cannot select remote files");
        }
        String path = this.compression.mo15828c(this.reactContext, this.options, str, validateImage(str)).getPath();
        BitmapFactory.Options validateImage = validateImage(path);
        long lastModified = new File(str).lastModified();
        writableNativeMap.putString("path", "file://" + path);
        writableNativeMap.putInt("width", validateImage.outWidth);
        writableNativeMap.putInt("height", validateImage.outHeight);
        writableNativeMap.putString("mime", validateImage.outMimeType);
        writableNativeMap.putInt("size", (int) new File(path).length());
        writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
        if (this.includeBase64) {
            writableNativeMap.putString("data", getBase64StringFromFile(path));
        }
        if (this.includeExif) {
            try {
                writableNativeMap.putMap("exif", C5227b.m19532a(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    private String getMimeType(String str) {
        Uri fromFile = Uri.fromFile(new File(str));
        if (fromFile.getScheme().equals("content")) {
            return this.reactContext.getContentResolver().getType(fromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    private WritableMap getSelection(Activity activity, Uri uri, boolean z) {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath == null || resolveRealPath.isEmpty()) {
            throw new Exception("Cannot resolve asset path.");
        }
        String mimeType = getMimeType(resolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            return getImage(activity, resolveRealPath);
        }
        getVideo(activity, resolveRealPath, mimeType);
        return null;
    }

    /* access modifiers changed from: private */
    public String getTmpDir(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    private void getVideo(Activity activity, String str, String str2) {
        validateVideo(str);
        new Thread(new C5223g(activity, str, getTmpDir(activity) + "/" + UUID.randomUUID().toString() + ".mp4", str2)).run();
    }

    /* access modifiers changed from: private */
    public static Long getVideoDuration(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
        } catch (Exception unused) {
            return -1L;
        }
    }

    private void imagePickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.mo15833b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        } else if (i2 != -1) {
        } else {
            if (this.multiple) {
                ClipData clipData = intent.getClipData();
                if (clipData == null) {
                    try {
                        this.resultCollector.mo15836e(1);
                        getAsyncSelection(activity, intent.getData(), false);
                    } catch (Exception e) {
                        this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                    }
                } else {
                    this.resultCollector.mo15836e(clipData.getItemCount());
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        getAsyncSelection(activity, clipData.getItemAt(i3).getUri(), false);
                    }
                }
            } else {
                Uri data = intent.getData();
                if (data == null) {
                    this.resultCollector.mo15833b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
                } else if (this.cropping) {
                    startCropping(activity, data);
                } else {
                    getAsyncSelection(activity, data, false);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void initiateCamera(Activity activity) {
        File file;
        String str;
        Uri e;
        try {
            if (this.mediaType.equals("video")) {
                str = "android.media.action.VIDEO_CAPTURE";
                file = createVideoFile();
            } else {
                str = "android.media.action.IMAGE_CAPTURE";
                file = createImageFile();
            }
            Intent intent = new Intent(str);
            if (Build.VERSION.SDK_INT < 21) {
                e = Uri.fromFile(file);
            } else {
                e = FileProvider.m4407e(activity, activity.getApplicationContext().getPackageName() + ".provider", file);
            }
            this.mCameraCaptureURI = e;
            intent.putExtra("output", this.mCameraCaptureURI);
            if (this.useFrontCamera) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.resultCollector.mo15833b(E_CANNOT_LAUNCH_CAMERA, "Cannot launch camera");
            } else {
                activity.startActivityForResult(intent, CAMERA_PICKER_REQUEST);
            }
        } catch (Exception e2) {
            this.resultCollector.mo15834c(E_FAILED_TO_OPEN_CAMERA, e2);
        }
    }

    /* access modifiers changed from: private */
    public void initiatePicker(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (!this.cropping) {
                if (!this.mediaType.equals("photo")) {
                    if (this.mediaType.equals("video")) {
                        intent.setType("video/*");
                    } else {
                        intent.setType("*/*");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    }
                    intent.setFlags(67108864);
                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
                    intent.addCategory("android.intent.category.OPENABLE");
                    activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
                }
            }
            intent.setType("image/*");
            if (this.cropping) {
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png"});
            }
            intent.setFlags(67108864);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
            intent.addCategory("android.intent.category.OPENABLE");
            activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
        } catch (Exception e) {
            this.resultCollector.mo15834c(E_FAILED_TO_SHOW_PICKER, e);
        }
    }

    private boolean isCameraAvailable(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("android.hardware.camera") || activity.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    private void permissionsCheck(Activity activity, Promise promise, List<String> list, Callable<Void> callable) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>(list);
        if (Build.VERSION.SDK_INT > 29) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        for (String str : arrayList2) {
            if (C1135a.m4415a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((C2802e) activity).mo8378i((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new C5219c(promise, callable));
            return;
        }
        try {
            callable.call();
        } catch (Exception e) {
            promise.reject(E_CALLBACK_ERROR, "Unknown error", (Throwable) e);
        }
    }

    private String resolveRealPath(Activity activity, Uri uri, boolean z) {
        return (Build.VERSION.SDK_INT >= 21 && z) ? Uri.parse(this.mCurrentMediaPath).getPath() : C5230e.m19542c(activity, uri);
    }

    private void setConfiguration(ReadableMap readableMap) {
        this.mediaType = readableMap.hasKey("mediaType") ? readableMap.getString("mediaType") : "any";
        boolean z = true;
        this.multiple = readableMap.hasKey("multiple") && readableMap.getBoolean("multiple");
        this.includeBase64 = readableMap.hasKey("includeBase64") && readableMap.getBoolean("includeBase64");
        this.includeExif = readableMap.hasKey("includeExif") && readableMap.getBoolean("includeExif");
        this.width = readableMap.hasKey("width") ? readableMap.getInt("width") : 0;
        this.height = readableMap.hasKey("height") ? readableMap.getInt("height") : 0;
        this.cropping = readableMap.hasKey("cropping") && readableMap.getBoolean("cropping");
        String str = null;
        this.cropperActiveWidgetColor = readableMap.hasKey("cropperActiveWidgetColor") ? readableMap.getString("cropperActiveWidgetColor") : null;
        this.cropperStatusBarColor = readableMap.hasKey("cropperStatusBarColor") ? readableMap.getString("cropperStatusBarColor") : null;
        this.cropperToolbarColor = readableMap.hasKey("cropperToolbarColor") ? readableMap.getString("cropperToolbarColor") : null;
        this.cropperToolbarTitle = readableMap.hasKey("cropperToolbarTitle") ? readableMap.getString("cropperToolbarTitle") : null;
        if (readableMap.hasKey("cropperToolbarWidgetColor")) {
            str = readableMap.getString("cropperToolbarWidgetColor");
        }
        this.cropperToolbarWidgetColor = str;
        this.cropperCircleOverlay = readableMap.hasKey("cropperCircleOverlay") && readableMap.getBoolean("cropperCircleOverlay");
        this.freeStyleCropEnabled = readableMap.hasKey("freeStyleCropEnabled") && readableMap.getBoolean("freeStyleCropEnabled");
        this.showCropGuidelines = !readableMap.hasKey("showCropGuidelines") || readableMap.getBoolean("showCropGuidelines");
        this.showCropFrame = !readableMap.hasKey("showCropFrame") || readableMap.getBoolean("showCropFrame");
        this.hideBottomControls = readableMap.hasKey("hideBottomControls") && readableMap.getBoolean("hideBottomControls");
        this.enableRotationGesture = readableMap.hasKey("enableRotationGesture") && readableMap.getBoolean("enableRotationGesture");
        this.disableCropperColorSetters = readableMap.hasKey("disableCropperColorSetters") && readableMap.getBoolean("disableCropperColorSetters");
        if (!readableMap.hasKey("useFrontCamera") || !readableMap.getBoolean("useFrontCamera")) {
            z = false;
        }
        this.useFrontCamera = z;
        this.options = readableMap;
    }

    /* access modifiers changed from: private */
    public void startCropping(Activity activity, Uri uri) {
        int i;
        C10146i.C10147a aVar = new C10146i.C10147a();
        aVar.mo25224e(Bitmap.CompressFormat.JPEG);
        aVar.mo25225f(100);
        aVar.mo25223d(this.cropperCircleOverlay);
        aVar.mo25226g(this.freeStyleCropEnabled);
        aVar.mo25229j(this.showCropGuidelines);
        aVar.mo25228i(this.showCropFrame);
        aVar.mo25227h(this.hideBottomControls);
        String str = this.cropperToolbarTitle;
        if (str != null) {
            aVar.mo25232m(str);
        }
        if (this.enableRotationGesture) {
            aVar.mo25222c(3, 3, 3);
        }
        if (!this.disableCropperColorSetters) {
            configureCropperColors(aVar);
        }
        String tmpDir = getTmpDir(activity);
        C10146i g = C10146i.m34330c(uri, Uri.fromFile(new File(tmpDir, UUID.randomUUID().toString() + ".jpg"))).mo25219g(aVar);
        int i2 = this.width;
        if (i2 > 0 && (i = this.height) > 0) {
            g.mo25218f((float) i2, (float) i);
        }
        g.mo25216d(activity);
    }

    private BitmapFactory.Options validateImage(String str) {
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        options2.inDither = true;
        BitmapFactory.decodeFile(str, options2);
        if (options2.outMimeType != null && options2.outWidth != 0 && options2.outHeight != 0) {
            return options2;
        }
        throw new Exception("Invalid image selected");
    }

    /* access modifiers changed from: private */
    public Bitmap validateVideo(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new Exception("Cannot retrieve video data");
    }

    @ReactMethod
    public void clean(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new C5217a(this, currentActivity, promise));
        }
    }

    @ReactMethod
    public void cleanSingle(String str, Promise promise) {
        if (str == null) {
            promise.reject(E_ERROR_WHILE_CLEANING_FILES, "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new C5218b(str, this, promise));
        }
    }

    public String getName() {
        return "ImageCropPicker";
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == IMAGE_PICKER_REQUEST) {
            imagePickerResult(activity, i, i2, intent);
        } else if (i == CAMERA_PICKER_REQUEST) {
            cameraPickerResult(activity, i, i2, intent);
        } else if (i == 69) {
            croppingResult(activity, i, i2, intent);
        }
    }

    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openCamera(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else if (!isCameraAvailable(currentActivity)) {
            promise.reject(E_CAMERA_IS_NOT_AVAILABLE, "Camera not available");
        } else {
            setConfiguration(readableMap);
            this.resultCollector.mo15837f(promise, false);
            permissionsCheck(currentActivity, promise, Arrays.asList(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}), new C5220d(currentActivity));
        }
    }

    @ReactMethod
    public void openCropper(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.mo15837f(promise, false);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new C5222f(currentActivity, Uri.parse(readableMap.getString("path"))));
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.mo15837f(promise, this.multiple);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new C5221e(currentActivity));
    }
}
