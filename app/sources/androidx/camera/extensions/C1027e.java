package androidx.camera.extensions;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0952p1;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0961r1;
import androidx.camera.core.C0965s1;
import androidx.camera.core.impl.C0831k1;
import androidx.camera.core.impl.C0835l1;
import androidx.camera.core.impl.C0848n0;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.core.impl.C0857p0;
import androidx.camera.extensions.C1025d;
import androidx.camera.extensions.p017f.C1033e;
import androidx.camera.extensions.p017f.C1035g;
import androidx.camera.extensions.p017f.C1040j;
import androidx.camera.extensions.p017f.C1043k;
import androidx.camera.extensions.p017f.C1050n;
import androidx.camera.extensions.p017f.C1051o;
import androidx.camera.extensions.p017f.p018q.p020b.C1056a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.extensions.e */
final class C1027e {

    /* renamed from: a */
    private static final C1056a f2888a = new C1056a();

    /* renamed from: b */
    private final C0961r1 f2889b;

    /* renamed from: androidx.camera.extensions.e$a */
    static class C1028a implements C1050n {
        C1028a() {
        }

        /* renamed from: a */
        public List<Pair<Integer, Size[]>> mo3320a() {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public boolean mo3321b(String str, Map<String, CameraCharacteristics> map) {
            return false;
        }

        /* renamed from: c */
        public List<Pair<Integer, Size[]>> mo3322c() {
            return Collections.emptyList();
        }

        /* renamed from: d */
        public C0850n2 mo3323d(Context context) {
            return null;
        }

        /* renamed from: e */
        public void mo3324e(C0957q1 q1Var) {
        }
    }

    C1027e(C0961r1 r1Var) {
        this.f2889b = r1Var;
    }

    /* renamed from: a */
    private static String m3981a(int i) {
        if (i == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    /* renamed from: c */
    private static C0952p1 m3982c(int i) {
        return new C1024c(m3981a(i), m3983d(i));
    }

    /* renamed from: d */
    private static C1050n m3983d(int i) {
        boolean f = m3985f();
        return f ? new C1028a() : f2888a.mo3349a(f) ? new C1028a() : f ? new C1033e(i) : new C1035g(i);
    }

    /* renamed from: e */
    private static void m3984e(int i) {
        C0835l1 a = C0835l1.m3270a(m3981a(i));
        if (C0831k1.m3262b(a) == C0857p0.f2507a) {
            C0831k1.m3261a(a, new C1022a(i, a));
        }
    }

    /* renamed from: f */
    private static boolean m3985f() {
        if (C1040j.m4029b().compareTo(C1051o.f2943p) < 0) {
            return false;
        }
        return C1040j.m4030d();
    }

    /* renamed from: h */
    static /* synthetic */ C0848n0 m3986h(int i, C0835l1 l1Var, C0957q1 q1Var, Context context) {
        C1050n d = m3983d(i);
        d.mo3324e(q1Var);
        C1025d.C1026a e = new C1025d.C1026a().mo3314c(i).mo3317f(new C1043k(i, d, context)).mo3313b(l1Var).mo3316e(1);
        C0850n2 d2 = d.mo3323d(context);
        if (d2 != null) {
            e.mo3315d(d2);
        }
        return e.mo3312a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0965s1 mo3318b(C0965s1 s1Var, int i) {
        if (mo3319g(s1Var, i)) {
            Iterator it = s1Var.mo3214c().iterator();
            while (it.hasNext()) {
                if (((C0952p1) it.next()) instanceof C1024c) {
                    throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
                }
            }
            m3984e(i);
            C0965s1.C0966a c = C0965s1.C0966a.m3744c(s1Var);
            c.mo3217a(m3982c(i));
            return c.mo3218b();
        }
        throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo3319g(C0965s1 s1Var, int i) {
        C0965s1.C0966a c = C0965s1.C0966a.m3744c(s1Var);
        c.mo3217a(m3982c(i));
        return !c.mo3218b().mo3213b(this.f2889b.mo3206a()).isEmpty();
    }
}
