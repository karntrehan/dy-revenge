package com.mrousavy.camera;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Objects;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.l */
public final class C5162l {
    /* renamed from: a */
    private static final WritableMap m19421a(Throwable th) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", th.getMessage());
        createMap.putString("stacktrace", C10248b.m34835b(th));
        Throwable cause = th.getCause();
        if (cause != null) {
            createMap.putMap("cause", m19421a(cause));
        }
        C10457l.m35319d(createMap, "map");
        return createMap;
    }

    /* renamed from: b */
    public static final void m19422b(CameraView cameraView, Throwable th) {
        C10457l.m35320e(cameraView, "<this>");
        C10457l.m35320e(th, "error");
        Log.e("CameraView", "invokeOnError(...):");
        th.printStackTrace();
        C5152g i0Var = th instanceof C5152g ? (C5152g) th : new C5157i0(th);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", C5198q.m19500a(i0Var));
        createMap.putString("message", i0Var.getMessage());
        Throwable cause = i0Var.getCause();
        if (cause != null) {
            createMap.putMap("cause", m19421a(cause));
        }
        Context context = cameraView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraError", createMap);
    }

    /* renamed from: c */
    public static final void m19423c(CameraView cameraView, double d, double d2) {
        C10457l.m35320e(cameraView, "<this>");
        Log.e("CameraView", "invokeOnFrameProcessorPerformanceSuggestionAvailable(suggestedFps: " + d2 + "):");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", d2 > d ? "can-use-higher-fps" : "should-use-lower-fps");
        createMap.putDouble("suggestedFrameProcessorFps", d2);
        Context context = cameraView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraPerformanceSuggestionAvailable", createMap);
    }

    /* renamed from: d */
    public static final void m19424d(CameraView cameraView) {
        C10457l.m35320e(cameraView, "<this>");
        Log.i("CameraView", "invokeOnInitialized()");
        Context context = cameraView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraInitialized", (WritableMap) null);
    }

    /* renamed from: e */
    public static final void m19425e(CameraView cameraView) {
        C10457l.m35320e(cameraView, "<this>");
        WritableMap createMap = Arguments.createMap();
        Context context = cameraView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraViewReady", createMap);
    }
}
