package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

class BlobCollector {

    /* renamed from: com.facebook.react.modules.blob.BlobCollector$a */
    static class C2780a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ReactContext f7861f;

        /* renamed from: o */
        final /* synthetic */ BlobModule f7862o;

        C2780a(ReactContext reactContext, BlobModule blobModule) {
            this.f7861f = reactContext;
            this.f7862o = blobModule;
        }

        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.f7861f.getJavaScriptContextHolder();
            if (javaScriptContextHolder.get() != 0) {
                BlobCollector.nativeInstall(this.f7862o, javaScriptContextHolder.get());
            }
        }
    }

    static {
        SoLoader.m12782j("reactnativeblob");
    }

    /* renamed from: b */
    static void m11128b(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new C2780a(reactContext, blobModule));
    }

    /* access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j);
}
