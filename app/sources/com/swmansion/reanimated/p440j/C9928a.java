package com.swmansion.reanimated.p440j;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;

/* renamed from: com.swmansion.reanimated.j.a */
public class C9928a {

    /* renamed from: a */
    C9930c f26561a;

    /* renamed from: b */
    SensorManager f26562b;

    /* renamed from: c */
    Sensor f26563c;

    /* renamed from: d */
    C9931d f26564d;

    /* renamed from: e */
    int f26565e;

    C9928a(WeakReference<ReactApplicationContext> weakReference, C9931d dVar, int i, NativeProxy.SensorSetter sensorSetter) {
        this.f26561a = new C9930c(sensorSetter, (double) i);
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) weakReference.get();
        this.f26562b = (SensorManager) ((ReactApplicationContext) weakReference.get()).getSystemService("sensor");
        this.f26564d = dVar;
        if (i == -1) {
            this.f26565e = 2;
        } else {
            this.f26565e = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24822a() {
        this.f26562b.unregisterListener(this.f26561a, this.f26563c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo24823b() {
        Sensor defaultSensor = this.f26562b.getDefaultSensor(this.f26564d.mo24828g());
        this.f26563c = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        this.f26562b.registerListener(this.f26561a, defaultSensor, this.f26565e * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        return true;
    }
}
