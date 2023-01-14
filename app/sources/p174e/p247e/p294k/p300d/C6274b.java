package p174e.p247e.p294k.p300d;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Locale;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p264k.C6106b;
import p174e.p247e.p294k.p301e.C6313b;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;

/* renamed from: e.e.k.d.b */
public class C6274b implements C5999d {

    /* renamed from: a */
    private final String f17364a;

    /* renamed from: b */
    private final C6316e f17365b;

    /* renamed from: c */
    private final C6317f f17366c;

    /* renamed from: d */
    private final C6313b f17367d;

    /* renamed from: e */
    private final C5999d f17368e;

    /* renamed from: f */
    private final String f17369f;

    /* renamed from: g */
    private final int f17370g;

    /* renamed from: h */
    private final Object f17371h;

    /* renamed from: i */
    private final long f17372i;

    public C6274b(String str, C6316e eVar, C6317f fVar, C6313b bVar, C5999d dVar, String str2, Object obj) {
        this.f17364a = (String) C6062k.m22839g(str);
        this.f17365b = eVar;
        this.f17366c = fVar;
        this.f17367d = bVar;
        this.f17368e = dVar;
        this.f17369f = str2;
        this.f17370g = C6106b.m22991d(Integer.valueOf(str.hashCode()), Integer.valueOf(eVar != null ? eVar.hashCode() : 0), Integer.valueOf(fVar.hashCode()), bVar, dVar, str2);
        this.f17371h = obj;
        this.f17372i = RealtimeSinceBootClock.get().now();
    }

    /* renamed from: a */
    public boolean mo17918a(Uri uri) {
        return mo17920c().contains(uri.toString());
    }

    /* renamed from: b */
    public boolean mo17919b() {
        return false;
    }

    /* renamed from: c */
    public String mo17920c() {
        return this.f17364a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6274b)) {
            return false;
        }
        C6274b bVar = (C6274b) obj;
        return this.f17370g == bVar.f17370g && this.f17364a.equals(bVar.f17364a) && C6058j.m22825a(this.f17365b, bVar.f17365b) && C6058j.m22825a(this.f17366c, bVar.f17366c) && C6058j.m22825a(this.f17367d, bVar.f17367d) && C6058j.m22825a(this.f17368e, bVar.f17368e) && C6058j.m22825a(this.f17369f, bVar.f17369f);
    }

    public int hashCode() {
        return this.f17370g;
    }

    public String toString() {
        return String.format((Locale) null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f17364a, this.f17365b, this.f17366c, this.f17367d, this.f17368e, this.f17369f, Integer.valueOf(this.f17370g)});
    }
}
