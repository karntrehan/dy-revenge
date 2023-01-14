package com.swmansion.reanimated.p440j;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.swmansion.reanimated.j.b */
public class C9929b {

    /* renamed from: a */
    private int f26566a = 0;

    /* renamed from: b */
    private final WeakReference<ReactApplicationContext> f26567b;

    /* renamed from: c */
    private final HashMap<Integer, C9928a> f26568c = new HashMap<>();

    public C9929b(WeakReference<ReactApplicationContext> weakReference) {
        this.f26567b = weakReference;
    }

    /* renamed from: a */
    public int mo24824a(C9931d dVar, int i, NativeProxy.SensorSetter sensorSetter) {
        if (!new C9928a(this.f26567b, dVar, i, sensorSetter).mo24823b()) {
            return -1;
        }
        int i2 = this.f26566a;
        this.f26566a = i2 + 1;
        this.f26568c.put(Integer.valueOf(i2), new C9928a(this.f26567b, dVar, i, sensorSetter));
        return i2;
    }

    /* renamed from: b */
    public void mo24825b(int i) {
        C9928a aVar = this.f26568c.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.mo24822a();
            this.f26568c.remove(Integer.valueOf(i));
            return;
        }
        Log.e("Reanimated", "Tried to unregister nonexistent sensor");
    }
}
