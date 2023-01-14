package com.reactnativeimageresizer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.reactnativeimageresizer.c */
public class C5337c {

    /* renamed from: com.reactnativeimageresizer.c$a */
    class C5338a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ String f14953a;

        /* renamed from: b */
        final /* synthetic */ double f14954b;

        /* renamed from: c */
        final /* synthetic */ double f14955c;

        /* renamed from: d */
        final /* synthetic */ String f14956d;

        /* renamed from: e */
        final /* synthetic */ double f14957e;

        /* renamed from: f */
        final /* synthetic */ Double f14958f;

        /* renamed from: g */
        final /* synthetic */ String f14959g;

        /* renamed from: h */
        final /* synthetic */ Boolean f14960h;

        /* renamed from: i */
        final /* synthetic */ WritableMap f14961i;

        /* renamed from: j */
        final /* synthetic */ Context f14962j;

        /* renamed from: k */
        final /* synthetic */ Promise f14963k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5338a(ReactContext reactContext, String str, double d, double d2, String str2, double d3, Double d4, String str3, Boolean bool, WritableMap writableMap, Context context, Promise promise) {
            super(reactContext);
            this.f14953a = str;
            this.f14954b = d;
            this.f14955c = d2;
            this.f14956d = str2;
            this.f14957e = d3;
            this.f14958f = d4;
            this.f14959g = str3;
            this.f14960h = bool;
            this.f14961i = writableMap;
            this.f14962j = context;
            this.f14963k = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                this.f14963k.resolve(C5337c.m19785c(this.f14953a, (int) this.f14954b, (int) this.f14955c, this.f14956d, (int) this.f14957e, this.f14958f.intValue(), this.f14959g, this.f14960h.booleanValue(), this.f14961i, this.f14962j));
            } catch (IOException e) {
                this.f14963k.reject((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public static void m19784b(String str, double d, double d2, String str2, double d3, Double d4, String str3, Boolean bool, String str4, Boolean bool2, Promise promise, Context context, ReactApplicationContext reactApplicationContext) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("mode", str4);
        createMap.putBoolean("onlyScaleDown", bool2.booleanValue());
        C5338a aVar = r0;
        C5338a aVar2 = new C5338a(reactApplicationContext, str, d, d2, str2, d3, d4, str3, bool, createMap, context, promise);
        aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"LongLogTag"})
    /* renamed from: c */
    public static Object m19785c(String str, int i, int i2, String str2, int i3, int i4, String str3, boolean z, ReadableMap readableMap, Context context) {
        String str4 = str3;
        ReadableMap readableMap2 = readableMap;
        Bitmap.CompressFormat valueOf = Bitmap.CompressFormat.valueOf(str2);
        Uri parse = Uri.parse(str);
        Bitmap c = C5336b.m19772c(context, parse, i, i2, i3, i4, readableMap2.getString("mode"), readableMap2.getBoolean("onlyScaleDown"));
        if (c != null) {
            File cacheDir = context.getCacheDir();
            if (str4 != null) {
                cacheDir = new File(str4);
            }
            File m = C5336b.m19782m(c, cacheDir, UUID.randomUUID().toString(), valueOf, i3);
            WritableMap createMap = Arguments.createMap();
            if (m.isFile()) {
                createMap.putString("path", m.getAbsolutePath());
                createMap.putString("uri", Uri.fromFile(m).toString());
                createMap.putString("name", m.getName());
                createMap.putDouble("size", (double) m.length());
                createMap.putDouble("width", (double) c.getWidth());
                createMap.putDouble("height", (double) c.getHeight());
                if (z) {
                    try {
                        C5336b.m19771b(context, parse, m.getAbsolutePath());
                    } catch (Exception e) {
                        Log.e("ImageResizer::createResizedImageWithExceptions", "EXIF copy failed", e);
                    }
                }
                c.recycle();
                return createMap;
            }
            throw new IOException("Error getting resized image path");
        }
        throw new IOException("The image failed to be resized; invalid Bitmap result.");
    }
}
