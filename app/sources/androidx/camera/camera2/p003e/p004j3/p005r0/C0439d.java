package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C1177h;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.j3.r0.d */
class C0439d extends C0437c {

    /* renamed from: androidx.camera.camera2.e.j3.r0.d$a */
    private static final class C0440a {

        /* renamed from: a */
        final OutputConfiguration f1570a;

        /* renamed from: b */
        String f1571b;

        C0440a(OutputConfiguration outputConfiguration) {
            this.f1570a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0440a)) {
                return false;
            }
            C0440a aVar = (C0440a) obj;
            return Objects.equals(this.f1570a, aVar.f1570a) && Objects.equals(this.f1571b, aVar.f1571b);
        }

        public int hashCode() {
            int hashCode = this.f1570a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            String str = this.f1571b;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }

    C0439d(Surface surface) {
        this((Object) new C0440a(new OutputConfiguration(surface)));
    }

    C0439d(Object obj) {
        super(obj);
    }

    /* renamed from: f */
    static C0439d m1923f(OutputConfiguration outputConfiguration) {
        return new C0439d((Object) new C0440a(outputConfiguration));
    }

    /* renamed from: c */
    public String mo2176c() {
        return ((C0440a) this.f1572a).f1571b;
    }

    /* renamed from: d */
    public void mo2177d(String str) {
        ((C0440a) this.f1572a).f1571b = str;
    }

    /* renamed from: e */
    public Object mo2178e() {
        C1177h.m4579a(this.f1572a instanceof C0440a);
        return ((C0440a) this.f1572a).f1570a;
    }
}
