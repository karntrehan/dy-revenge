package com.facebook.imagepipeline.producers;

import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.e1 */
public final class C2476e1 {
    /* renamed from: a */
    public static int m10298a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: b */
    public static boolean m10299b(int i, int i2, C6316e eVar) {
        int a = m10298a(i);
        return eVar == null ? ((float) a) >= 2048.0f && m10298a(i2) >= 2048 : a >= eVar.f17470a && m10298a(i2) >= eVar.f17471b;
    }

    /* renamed from: c */
    public static boolean m10300c(C6369d dVar, C6316e eVar) {
        int c;
        int e;
        if (dVar == null) {
            return false;
        }
        int i0 = dVar.mo18898i0();
        if (i0 == 90 || i0 == 270) {
            c = dVar.mo18894c();
            e = dVar.mo18896e();
        } else {
            c = dVar.mo18896e();
            e = dVar.mo18894c();
        }
        return m10299b(c, e, eVar);
    }
}
