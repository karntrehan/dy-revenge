package com.mrousavy.camera.frameprocessor;

import java.util.ArrayList;
import p455g.C10323s;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10458m;

/* renamed from: com.mrousavy.camera.frameprocessor.c */
public final class C5149c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f14640a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<Double> f14641b = new ArrayList<>();

    /* renamed from: com.mrousavy.camera.frameprocessor.c$a */
    static final class C5150a extends C10458m implements C10419a<C10323s> {

        /* renamed from: f */
        final /* synthetic */ long f14642f;

        /* renamed from: o */
        final /* synthetic */ C5149c f14643o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5150a(long j, C5149c cVar) {
            super(0);
            this.f14642f = j;
            this.f14643o = cVar;
        }

        /* renamed from: a */
        public final void mo15766a() {
            double currentTimeMillis = ((double) (System.currentTimeMillis() - this.f14642f)) / 1000.0d;
            int a = this.f14643o.f14640a % 15;
            if (this.f14643o.f14641b.size() > a) {
                this.f14643o.f14641b.set(a, Double.valueOf(currentTimeMillis));
            } else {
                this.f14643o.f14641b.add(Double.valueOf(currentTimeMillis));
            }
            C5149c cVar = this.f14643o;
            cVar.f14640a = cVar.f14640a + 1;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15766a();
            return C10323s.f27547a;
        }
    }

    /* renamed from: d */
    public final C5151d mo15763d() {
        return new C5151d(new C5150a(System.currentTimeMillis(), this));
    }

    /* renamed from: e */
    public final void mo15764e() {
        this.f14640a = 0;
        this.f14641b.clear();
    }

    /* renamed from: f */
    public final double mo15765f() {
        return C10358t.m35176x(this.f14641b);
    }
}
