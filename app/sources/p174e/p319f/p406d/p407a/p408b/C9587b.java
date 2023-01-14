package p174e.p319f.p406d.p407a.p408b;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3697p;
import java.util.EnumMap;
import java.util.Map;
import p174e.p319f.p320a.p335c.p345f.p353h.C7131i0;
import p174e.p319f.p320a.p335c.p345f.p353h.C7133j0;
import p174e.p319f.p406d.p407a.p409c.C9609l;
import p174e.p319f.p406d.p407a.p409c.p410p.C9613a;

/* renamed from: e.f.d.a.b.b */
public abstract class C9587b {

    /* renamed from: a */
    private static final Map<C9613a, String> f25665a;
    @RecentlyNonNull

    /* renamed from: b */
    public static final Map<C9613a, String> f25666b;

    /* renamed from: c */
    private final String f25667c;

    /* renamed from: d */
    private final C9613a f25668d;

    /* renamed from: e */
    private final C9609l f25669e;

    static {
        Class<C9613a> cls = C9613a.class;
        f25665a = new EnumMap(cls);
        f25666b = new EnumMap(cls);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9587b)) {
            return false;
        }
        C9587b bVar = (C9587b) obj;
        return C3697p.m14323b(this.f25667c, bVar.f25667c) && C3697p.m14323b(this.f25668d, bVar.f25668d) && C3697p.m14323b(this.f25669e, bVar.f25669e);
    }

    public int hashCode() {
        return C3697p.m14324c(this.f25667c, this.f25668d, this.f25669e);
    }

    @RecentlyNonNull
    public String toString() {
        C7131i0 a = C7133j0.m27128a("RemoteModel");
        a.mo20525a("modelName", this.f25667c);
        a.mo20525a("baseModel", this.f25668d);
        a.mo20525a("modelType", this.f25669e);
        return a.toString();
    }
}
