package com.facebook.react.uimanager;

import com.facebook.react.common.C2689a;
import com.facebook.yoga.C3316p;

/* renamed from: com.facebook.react.uimanager.i1 */
public class C2986i1 {

    /* renamed from: a */
    private static final Object f8316a = new Object();

    /* renamed from: b */
    private static C2689a<C3316p> f8317b;

    /* renamed from: a */
    public static C2689a<C3316p> m11844a() {
        C2689a<C3316p> aVar;
        C2689a<C3316p> aVar2 = f8317b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (f8316a) {
            if (f8317b == null) {
                f8317b = new C2689a<>(1024);
            }
            aVar = f8317b;
        }
        return aVar;
    }
}
