package org.greenrobot.eventbus.android;

import android.os.Looper;
import org.greenrobot.eventbus.C10878c;
import org.greenrobot.eventbus.C10884f;
import org.greenrobot.eventbus.C10888h;
import org.greenrobot.eventbus.C10892l;

/* renamed from: org.greenrobot.eventbus.android.d */
public class C10876d implements C10888h {
    /* renamed from: a */
    public C10892l mo28471a(C10878c cVar) {
        return new C10884f(cVar, Looper.getMainLooper(), 10);
    }

    /* renamed from: b */
    public boolean mo28472b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
