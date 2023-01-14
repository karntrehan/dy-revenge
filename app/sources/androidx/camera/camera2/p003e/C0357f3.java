package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.p003e.C0329b3;
import androidx.camera.camera2.p003e.p004j3.C0489w;
import androidx.camera.camera2.p003e.p004j3.C0491y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.f3 */
final class C0357f3 extends C0329b3.C0330a {

    /* renamed from: a */
    private final List<C0329b3.C0330a> f1435a;

    /* renamed from: androidx.camera.camera2.e.f3$a */
    static class C0358a extends C0329b3.C0330a {

        /* renamed from: a */
        private final CameraCaptureSession.StateCallback f1436a;

        C0358a(CameraCaptureSession.StateCallback stateCallback) {
            this.f1436a = stateCallback;
        }

        C0358a(List<CameraCaptureSession.StateCallback> list) {
            this(C0368h2.m1753a(list));
        }

        /* renamed from: n */
        public void mo1952n(C0329b3 b3Var) {
            this.f1436a.onActive(b3Var.mo1946f().mo2079c());
        }

        /* renamed from: o */
        public void mo1953o(C0329b3 b3Var) {
            C0491y.m2034b(this.f1436a, b3Var.mo1946f().mo2079c());
        }

        /* renamed from: p */
        public void mo1954p(C0329b3 b3Var) {
            this.f1436a.onClosed(b3Var.mo1946f().mo2079c());
        }

        /* renamed from: q */
        public void mo1955q(C0329b3 b3Var) {
            this.f1436a.onConfigureFailed(b3Var.mo1946f().mo2079c());
        }

        /* renamed from: r */
        public void mo1956r(C0329b3 b3Var) {
            this.f1436a.onConfigured(b3Var.mo1946f().mo2079c());
        }

        /* renamed from: s */
        public void mo1957s(C0329b3 b3Var) {
            this.f1436a.onReady(b3Var.mo1946f().mo2079c());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo1958t(C0329b3 b3Var) {
        }

        /* renamed from: u */
        public void mo1959u(C0329b3 b3Var, Surface surface) {
            C0489w.m2031a(this.f1436a, b3Var.mo1946f().mo2079c(), surface);
        }
    }

    C0357f3(List<C0329b3.C0330a> list) {
        ArrayList arrayList = new ArrayList();
        this.f1435a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: v */
    static C0329b3.C0330a m1721v(C0329b3.C0330a... aVarArr) {
        return new C0357f3(Arrays.asList(aVarArr));
    }

    /* renamed from: n */
    public void mo1952n(C0329b3 b3Var) {
        for (C0329b3.C0330a n : this.f1435a) {
            n.mo1952n(b3Var);
        }
    }

    /* renamed from: o */
    public void mo1953o(C0329b3 b3Var) {
        for (C0329b3.C0330a o : this.f1435a) {
            o.mo1953o(b3Var);
        }
    }

    /* renamed from: p */
    public void mo1954p(C0329b3 b3Var) {
        for (C0329b3.C0330a p : this.f1435a) {
            p.mo1954p(b3Var);
        }
    }

    /* renamed from: q */
    public void mo1955q(C0329b3 b3Var) {
        for (C0329b3.C0330a q : this.f1435a) {
            q.mo1955q(b3Var);
        }
    }

    /* renamed from: r */
    public void mo1956r(C0329b3 b3Var) {
        for (C0329b3.C0330a r : this.f1435a) {
            r.mo1956r(b3Var);
        }
    }

    /* renamed from: s */
    public void mo1957s(C0329b3 b3Var) {
        for (C0329b3.C0330a s : this.f1435a) {
            s.mo1957s(b3Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1958t(C0329b3 b3Var) {
        for (C0329b3.C0330a t : this.f1435a) {
            t.mo1958t(b3Var);
        }
    }

    /* renamed from: u */
    public void mo1959u(C0329b3 b3Var, Surface surface) {
        for (C0329b3.C0330a u : this.f1435a) {
            u.mo1959u(b3Var, surface);
        }
    }
}
