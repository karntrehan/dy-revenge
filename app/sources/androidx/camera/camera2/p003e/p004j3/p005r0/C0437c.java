package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C1177h;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.j3.r0.c */
class C0437c extends C0442f {

    /* renamed from: androidx.camera.camera2.e.j3.r0.c$a */
    private static final class C0438a {

        /* renamed from: a */
        final OutputConfiguration f1567a;

        /* renamed from: b */
        String f1568b;

        /* renamed from: c */
        boolean f1569c;

        C0438a(OutputConfiguration outputConfiguration) {
            this.f1567a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0438a)) {
                return false;
            }
            C0438a aVar = (C0438a) obj;
            return Objects.equals(this.f1567a, aVar.f1567a) && this.f1569c == aVar.f1569c && Objects.equals(this.f1568b, aVar.f1568b);
        }

        public int hashCode() {
            int hashCode = this.f1567a.hashCode() ^ 31;
            boolean z = this.f1569c ^ ((hashCode << 5) - hashCode);
            int i = ((z ? 1 : 0) << true) - z;
            String str = this.f1568b;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }

    C0437c(Surface surface) {
        this((Object) new C0438a(new OutputConfiguration(surface)));
    }

    C0437c(Object obj) {
        super(obj);
    }

    /* renamed from: a */
    static C0437c m1918a(OutputConfiguration outputConfiguration) {
        return new C0437c((Object) new C0438a(outputConfiguration));
    }

    /* renamed from: b */
    public Surface mo2175b() {
        return ((OutputConfiguration) mo2178e()).getSurface();
    }

    /* renamed from: c */
    public String mo2176c() {
        return ((C0438a) this.f1572a).f1568b;
    }

    /* renamed from: d */
    public void mo2177d(String str) {
        ((C0438a) this.f1572a).f1568b = str;
    }

    /* renamed from: e */
    public Object mo2178e() {
        C1177h.m4579a(this.f1572a instanceof C0438a);
        return ((C0438a) this.f1572a).f1567a;
    }
}
