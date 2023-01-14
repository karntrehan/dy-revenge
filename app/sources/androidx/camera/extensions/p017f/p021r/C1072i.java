package androidx.camera.extensions.p017f.p021r;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.extensions.f.r.i */
class C1072i {

    /* renamed from: a */
    private int f2971a = 1;

    /* renamed from: b */
    private Map<CaptureRequest.Key<?>, Object> f2972b = new HashMap();

    /* renamed from: c */
    private List<C1065f> f2973c = new ArrayList();

    /* renamed from: androidx.camera.extensions.f.r.i$a */
    private static class C1073a implements C1071h {

        /* renamed from: a */
        private final int f2974a;

        /* renamed from: b */
        private final Map<CaptureRequest.Key<?>, Object> f2975b;

        /* renamed from: c */
        private final List<C1065f> f2976c;

        C1073a(int i, Map<CaptureRequest.Key<?>, Object> map, List<C1065f> list) {
            this.f2974a = i;
            this.f2975b = map;
            this.f2976c = list;
        }

        /* renamed from: a */
        public Map<CaptureRequest.Key<?>, Object> mo3374a() {
            return this.f2975b;
        }

        /* renamed from: b */
        public int mo3375b() {
            return this.f2974a;
        }

        /* renamed from: c */
        public List<C1065f> mo3376c() {
            return this.f2976c;
        }
    }

    C1072i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1072i mo3377a(C1065f fVar) {
        this.f2973c.add(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> C1072i mo3378b(CaptureRequest.Key<T> key, T t) {
        this.f2972b.put(key, t);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1071h mo3379c() {
        return new C1073a(this.f2971a, this.f2972b, this.f2973c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1072i mo3380d(int i) {
        this.f2971a = i;
        return this;
    }
}
