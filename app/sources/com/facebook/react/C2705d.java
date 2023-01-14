package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.facebook.react.d */
public class C2705d implements ComponentCallbacks2 {

    /* renamed from: f */
    private final Set<MemoryPressureListener> f7801f = Collections.synchronizedSet(new LinkedHashSet());

    public C2705d(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    /* renamed from: b */
    private void m10971b(int i) {
        Set<MemoryPressureListener> set = this.f7801f;
        for (MemoryPressureListener handleMemoryPressure : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            handleMemoryPressure.handleMemoryPressure(i);
        }
    }

    /* renamed from: a */
    public void mo8850a(MemoryPressureListener memoryPressureListener) {
        this.f7801f.add(memoryPressureListener);
    }

    /* renamed from: c */
    public void mo8851c(MemoryPressureListener memoryPressureListener) {
        this.f7801f.remove(memoryPressureListener);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        m10971b(i);
    }
}
