package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import java.io.File;
import java.util.List;

@C2639a(name = "ImagePickerManager")
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    static final String NAME = "ImagePickerManager";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private Uri fileUri;
    C5077d options;
    final ReactApplicationContext reactContext;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback2) {
        int i;
        String str;
        ReactApplicationContext reactApplicationContext;
        Intent intent;
        if (!C5078e.m19212v(this.reactContext)) {
            callback2.invoke(C5078e.m19200j(C5078e.f14409b, (String) null));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback2.invoke(C5078e.m19200j(C5078e.f14411d, "Activity error"));
        } else if (!C5078e.m19213w(this.reactContext, currentActivity)) {
            callback2.invoke(C5078e.m19200j(C5078e.f14411d, C5078e.f14414g));
        } else {
            this.callback = callback2;
            C5077d dVar = new C5077d(readableMap);
            this.options = dVar;
            if (!dVar.f14404h.booleanValue() || Build.VERSION.SDK_INT > 28 || C5078e.m19211u(currentActivity)) {
                if (this.options.f14407k.equals(C5078e.f14413f)) {
                    i = REQUEST_LAUNCH_VIDEO_CAPTURE;
                    intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.videoQuality", this.options.f14400d);
                    int i2 = this.options.f14405i;
                    if (i2 > 0) {
                        intent.putExtra("android.intent.extra.durationLimit", i2);
                    }
                    reactApplicationContext = this.reactContext;
                    str = "mp4";
                } else {
                    i = REQUEST_LAUNCH_IMAGE_CAPTURE;
                    intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    reactApplicationContext = this.reactContext;
                    str = "jpg";
                }
                File c = C5078e.m19193c(reactApplicationContext, str);
                this.cameraCaptureURI = C5078e.m19194d(c, this.reactContext);
                if (this.options.f14406j.booleanValue()) {
                    C5078e.m19188D(intent);
                }
                this.fileUri = Uri.fromFile(c);
                intent.putExtra("output", this.cameraCaptureURI);
                intent.addFlags(3);
                try {
                    currentActivity.startActivityForResult(intent, i);
                } catch (ActivityNotFoundException e) {
                    callback2.invoke(C5078e.m19200j(C5078e.f14411d, e.getMessage()));
                    this.callback = null;
                }
            } else {
                callback2.invoke(C5078e.m19200j(C5078e.f14410c, (String) null));
            }
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback2) {
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback2.invoke(C5078e.m19200j(C5078e.f14411d, "Activity error"));
            return;
        }
        this.callback = callback2;
        C5077d dVar = new C5077d(readableMap);
        this.options = dVar;
        boolean z = dVar.f14397a == 1;
        boolean equals = dVar.f14407k.equals(C5078e.f14412e);
        boolean equals2 = this.options.f14407k.equals(C5078e.f14413f);
        if (!z || (!equals && !equals2)) {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        } else {
            intent = new Intent("android.intent.action.PICK");
        }
        if (!z) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (equals) {
            intent.setType("image/*");
        } else if (equals2) {
            intent.setType("video/*");
        } else {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        }
        try {
            currentActivity.startActivityForResult(intent, REQUEST_LAUNCH_LIBRARY);
        } catch (ActivityNotFoundException e) {
            callback2.invoke(C5078e.m19200j(C5078e.f14411d, e.getMessage()));
            this.callback = null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        com.imagepicker.C5078e.m19187C(r5, r6, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(android.app.Activity r5, int r6, int r7, android.content.Intent r8) {
        /*
            r4 = this;
            boolean r5 = com.imagepicker.C5078e.m19216z(r6)
            if (r5 == 0) goto L_0x007e
            com.facebook.react.bridge.Callback r5 = r4.callback
            if (r5 != 0) goto L_0x000c
            goto L_0x007e
        L_0x000c:
            r5 = -1
            if (r7 == r5) goto L_0x0047
            r5 = 13001(0x32c9, float:1.8218E-41)
            if (r6 != r5) goto L_0x0018
            android.net.Uri r5 = r4.fileUri
            com.imagepicker.C5078e.m19195e(r5)
        L_0x0018:
            r5 = 0
            r7 = 1
            r0 = 0
            com.facebook.react.bridge.Callback r1 = r4.callback     // Catch:{ RuntimeException -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ RuntimeException -> 0x002d }
            com.facebook.react.bridge.ReadableMap r3 = com.imagepicker.C5078e.m19199i()     // Catch:{ RuntimeException -> 0x002d }
            r2[r5] = r3     // Catch:{ RuntimeException -> 0x002d }
            r1.invoke(r2)     // Catch:{ RuntimeException -> 0x002d }
            r4.callback = r0
            return
        L_0x002b:
            r5 = move-exception
            goto L_0x0044
        L_0x002d:
            r1 = move-exception
            com.facebook.react.bridge.Callback r2 = r4.callback     // Catch:{ all -> 0x002b }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x002b }
            java.lang.String r3 = com.imagepicker.C5078e.f14411d     // Catch:{ all -> 0x002b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x002b }
            com.facebook.react.bridge.ReadableMap r1 = com.imagepicker.C5078e.m19200j(r3, r1)     // Catch:{ all -> 0x002b }
            r7[r5] = r1     // Catch:{ all -> 0x002b }
            r2.invoke(r7)     // Catch:{ all -> 0x002b }
            r4.callback = r0
            goto L_0x0047
        L_0x0044:
            r4.callback = r0
            throw r5
        L_0x0047:
            switch(r6) {
                case 13001: goto L_0x0064;
                case 13002: goto L_0x0053;
                case 13003: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x007e
        L_0x004b:
            java.util.List r5 = com.imagepicker.C5078e.m19191a(r8)
        L_0x004f:
            r4.onAssetsObtained(r5)
            goto L_0x007e
        L_0x0053:
            com.imagepicker.d r5 = r4.options
            java.lang.Boolean r5 = r5.f14404h
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0077
            android.net.Uri r5 = r4.cameraCaptureURI
            com.facebook.react.bridge.ReactApplicationContext r6 = r4.reactContext
            java.lang.String r7 = "video"
            goto L_0x0074
        L_0x0064:
            com.imagepicker.d r5 = r4.options
            java.lang.Boolean r5 = r5.f14404h
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0077
            android.net.Uri r5 = r4.cameraCaptureURI
            com.facebook.react.bridge.ReactApplicationContext r6 = r4.reactContext
            java.lang.String r7 = "photo"
        L_0x0074:
            com.imagepicker.C5078e.m19187C(r5, r6, r7)
        L_0x0077:
            android.net.Uri r5 = r4.fileUri
            java.util.List r5 = java.util.Collections.singletonList(r5)
            goto L_0x004f
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.imagepicker.ImagePickerModule.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: package-private */
    public void onAssetsObtained(List<Uri> list) {
        try {
            this.callback.invoke(C5078e.m19209s(list, this.options, this.reactContext));
        } catch (RuntimeException e) {
            this.callback.invoke(C5078e.m19200j(C5078e.f14411d, e.getMessage()));
        } catch (Throwable th) {
            this.callback = null;
            throw th;
        }
        this.callback = null;
    }

    public void onNewIntent(Intent intent) {
    }
}
