package androidx.camera.core.p009e3.p010p.p012f;

import android.media.MediaCodec;
import androidx.camera.core.C0617b3;
import androidx.camera.core.C0967s2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.p009e3.p010p.p011e.C0668a;
import androidx.camera.core.p009e3.p010p.p011e.C0673f;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.e3.p.f.c */
public class C0676c {

    /* renamed from: a */
    private final boolean f2131a;

    public C0676c() {
        this.f2131a = C0668a.m2796a(C0673f.class) != null;
    }

    /* renamed from: a */
    private int m2805a(C0820i1 i1Var) {
        if (i1Var.mo3003c() == MediaCodec.class || i1Var.mo3003c() == C0617b3.class) {
            return 2;
        }
        return i1Var.mo3003c() == C0967s2.class ? 0 : 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ int mo2719c(C0820i1 i1Var, C0820i1 i1Var2) {
        return m2805a(i1Var) - m2805a(i1Var2);
    }

    /* renamed from: d */
    public void mo2720d(List<C0820i1> list) {
        if (this.f2131a) {
            Collections.sort(list, new C0674a(this));
        }
    }
}
