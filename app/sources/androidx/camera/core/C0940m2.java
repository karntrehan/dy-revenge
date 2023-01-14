package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.C0891u2;
import androidx.camera.core.impl.p014a3.C0731h;

/* renamed from: androidx.camera.core.m2 */
abstract class C0940m2 implements C0927j2 {
    C0940m2() {
    }

    /* renamed from: a */
    public static C0927j2 m3675a(C0891u2 u2Var, long j, int i, Matrix matrix) {
        return new C0692h1(u2Var, j, i, matrix);
    }

    /* renamed from: b */
    public abstract long mo2692b();

    /* renamed from: c */
    public abstract C0891u2 mo2693c();

    /* renamed from: d */
    public void mo2694d(C0731h.C0733b bVar) {
        bVar.mo2861m(mo2695e());
    }

    /* renamed from: e */
    public abstract int mo2695e();

    /* renamed from: f */
    public abstract Matrix mo2740f();
}
