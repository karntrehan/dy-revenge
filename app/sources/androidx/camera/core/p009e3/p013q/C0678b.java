package androidx.camera.core.p009e3.p013q;

import android.util.Size;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.p014a3.C0716b;

/* renamed from: androidx.camera.core.e3.q.b */
public final class C0678b {
    /* renamed from: a */
    public static void m2819a(C0908x2.C0909a<?, ?, ?> aVar, int i) {
        Size s;
        C0877s1 s1Var = (C0877s1) aVar.mo2603c();
        int E = s1Var.mo2989E(-1);
        if (E == -1 || E != i) {
            ((C0877s1.C0878a) aVar).mo2604d(i);
        }
        if (E != -1 && i != -1 && E != i) {
            if (Math.abs(C0716b.m2966b(i) - C0716b.m2966b(E)) % 180 == 90 && (s = s1Var.mo2995s((Size) null)) != null) {
                ((C0877s1.C0878a) aVar).mo2602a(new Size(s.getHeight(), s.getWidth()));
            }
        }
    }
}
