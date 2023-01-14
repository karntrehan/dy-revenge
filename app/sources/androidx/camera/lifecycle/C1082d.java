package androidx.camera.lifecycle;

import androidx.camera.core.p009e3.C0649e;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.C1291g;
import java.util.Objects;

/* renamed from: androidx.camera.lifecycle.d */
final class C1082d extends LifecycleCameraRepository.C1078a {

    /* renamed from: a */
    private final C1291g f2998a;

    /* renamed from: b */
    private final C0649e.C0651b f2999b;

    C1082d(C1291g gVar, C0649e.C0651b bVar) {
        Objects.requireNonNull(gVar, "Null lifecycleOwner");
        this.f2998a = gVar;
        Objects.requireNonNull(bVar, "Null cameraId");
        this.f2999b = bVar;
    }

    /* renamed from: b */
    public C0649e.C0651b mo3407b() {
        return this.f2999b;
    }

    /* renamed from: c */
    public C1291g mo3408c() {
        return this.f2998a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.C1078a)) {
            return false;
        }
        LifecycleCameraRepository.C1078a aVar = (LifecycleCameraRepository.C1078a) obj;
        return this.f2998a.equals(aVar.mo3408c()) && this.f2999b.equals(aVar.mo3407b());
    }

    public int hashCode() {
        return ((this.f2998a.hashCode() ^ 1000003) * 1000003) ^ this.f2999b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f2998a + ", cameraId=" + this.f2999b + "}";
    }
}
