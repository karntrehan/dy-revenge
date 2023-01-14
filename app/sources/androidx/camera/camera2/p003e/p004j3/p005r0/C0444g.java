package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.r0.g */
public final class C0444g {

    /* renamed from: a */
    private final C0447c f1579a;

    /* renamed from: androidx.camera.camera2.e.j3.r0.g$a */
    private static final class C0445a implements C0447c {

        /* renamed from: a */
        private final SessionConfiguration f1580a;

        /* renamed from: b */
        private final List<C0435b> f1581b;

        C0445a(int i, List<C0435b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, C0444g.m1938g(list), executor, stateCallback));
        }

        C0445a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f1580a = sessionConfiguration;
            this.f1581b = Collections.unmodifiableList(C0444g.m1939h(sessionConfiguration.getOutputConfigurations()));
        }

        /* renamed from: a */
        public Executor mo2196a() {
            return this.f1580a.getExecutor();
        }

        /* renamed from: b */
        public C0431a mo2197b() {
            return C0431a.m1905b(this.f1580a.getInputConfiguration());
        }

        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo2198c() {
            return this.f1580a.getStateCallback();
        }

        /* renamed from: d */
        public Object mo2199d() {
            return this.f1580a;
        }

        /* renamed from: e */
        public int mo2200e() {
            return this.f1580a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0445a)) {
                return false;
            }
            return Objects.equals(this.f1580a, ((C0445a) obj).f1580a);
        }

        /* renamed from: f */
        public List<C0435b> mo2202f() {
            return this.f1581b;
        }

        /* renamed from: g */
        public void mo2203g(CaptureRequest captureRequest) {
            this.f1580a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f1580a.hashCode();
        }
    }

    /* renamed from: androidx.camera.camera2.e.j3.r0.g$b */
    private static final class C0446b implements C0447c {

        /* renamed from: a */
        private final List<C0435b> f1582a;

        /* renamed from: b */
        private final CameraCaptureSession.StateCallback f1583b;

        /* renamed from: c */
        private final Executor f1584c;

        /* renamed from: d */
        private int f1585d;

        /* renamed from: e */
        private C0431a f1586e = null;

        /* renamed from: f */
        private CaptureRequest f1587f = null;

        C0446b(int i, List<C0435b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f1585d = i;
            this.f1582a = Collections.unmodifiableList(new ArrayList(list));
            this.f1583b = stateCallback;
            this.f1584c = executor;
        }

        /* renamed from: a */
        public Executor mo2196a() {
            return this.f1584c;
        }

        /* renamed from: b */
        public C0431a mo2197b() {
            return this.f1586e;
        }

        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo2198c() {
            return this.f1583b;
        }

        /* renamed from: d */
        public Object mo2199d() {
            return null;
        }

        /* renamed from: e */
        public int mo2200e() {
            return this.f1585d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0446b) {
                C0446b bVar = (C0446b) obj;
                if (Objects.equals(this.f1586e, bVar.f1586e) && this.f1585d == bVar.f1585d && this.f1582a.size() == bVar.f1582a.size()) {
                    for (int i = 0; i < this.f1582a.size(); i++) {
                        if (!this.f1582a.get(i).equals(bVar.f1582a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public List<C0435b> mo2202f() {
            return this.f1582a;
        }

        /* renamed from: g */
        public void mo2203g(CaptureRequest captureRequest) {
            this.f1587f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f1582a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            C0431a aVar = this.f1586e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i;
            return this.f1585d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* renamed from: androidx.camera.camera2.e.j3.r0.g$c */
    private interface C0447c {
        /* renamed from: a */
        Executor mo2196a();

        /* renamed from: b */
        C0431a mo2197b();

        /* renamed from: c */
        CameraCaptureSession.StateCallback mo2198c();

        /* renamed from: d */
        Object mo2199d();

        /* renamed from: e */
        int mo2200e();

        /* renamed from: f */
        List<C0435b> mo2202f();

        /* renamed from: g */
        void mo2203g(CaptureRequest captureRequest);
    }

    public C0444g(int i, List<C0435b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f1579a = Build.VERSION.SDK_INT < 28 ? new C0446b(i, list, executor, stateCallback) : new C0445a(i, list, executor, stateCallback);
    }

    /* renamed from: g */
    public static List<OutputConfiguration> m1938g(List<C0435b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C0435b d : list) {
            arrayList.add((OutputConfiguration) d.mo2172d());
        }
        return arrayList;
    }

    /* renamed from: h */
    static List<C0435b> m1939h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration e : list) {
            arrayList.add(C0435b.m1909e(e));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Executor mo2187a() {
        return this.f1579a.mo2196a();
    }

    /* renamed from: b */
    public C0431a mo2188b() {
        return this.f1579a.mo2197b();
    }

    /* renamed from: c */
    public List<C0435b> mo2189c() {
        return this.f1579a.mo2202f();
    }

    /* renamed from: d */
    public int mo2190d() {
        return this.f1579a.mo2200e();
    }

    /* renamed from: e */
    public CameraCaptureSession.StateCallback mo2191e() {
        return this.f1579a.mo2198c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0444g)) {
            return false;
        }
        return this.f1579a.equals(((C0444g) obj).f1579a);
    }

    /* renamed from: f */
    public void mo2193f(CaptureRequest captureRequest) {
        this.f1579a.mo2203g(captureRequest);
    }

    public int hashCode() {
        return this.f1579a.hashCode();
    }

    /* renamed from: i */
    public Object mo2195i() {
        return this.f1579a.mo2199d();
    }
}
