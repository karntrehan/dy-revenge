package p174e.p319f.p320a.p335c.p338b.p339a;

import android.os.Bundle;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.internal.C3697p;

/* renamed from: e.f.a.c.b.a.c */
public final class C6623c implements C3469a.C3473d {

    /* renamed from: f */
    public static final C6623c f18298f = new C6623c(new Bundle(), (C6631i) null);

    /* renamed from: o */
    private final Bundle f18299o;

    /* synthetic */ C6623c(Bundle bundle, C6631i iVar) {
        this.f18299o = bundle;
    }

    /* renamed from: a */
    public final Bundle mo19444a() {
        return new Bundle(this.f18299o);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6623c)) {
            return false;
        }
        return C3697p.m14322a(this.f18299o, ((C6623c) obj).f18299o);
    }

    public final int hashCode() {
        return C3697p.m14324c(this.f18299o);
    }
}
