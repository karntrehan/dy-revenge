package p174e.p247e.p249b.p251b;

import java.io.IOException;
import p174e.p247e.p249b.p250a.C5996b;
import p174e.p247e.p249b.p250a.C5997c;
import p174e.p247e.p249b.p250a.C5999d;

/* renamed from: e.e.b.b.j */
public class C6031j implements C5996b {

    /* renamed from: a */
    private static final Object f16676a = new Object();

    /* renamed from: b */
    private static C6031j f16677b;

    /* renamed from: c */
    private static int f16678c;

    /* renamed from: d */
    private C5999d f16679d;

    /* renamed from: e */
    private String f16680e;

    /* renamed from: f */
    private long f16681f;

    /* renamed from: g */
    private long f16682g;

    /* renamed from: h */
    private long f16683h;

    /* renamed from: i */
    private IOException f16684i;

    /* renamed from: j */
    private C5997c.C5998a f16685j;

    /* renamed from: k */
    private C6031j f16686k;

    private C6031j() {
    }

    /* renamed from: a */
    public static C6031j m22777a() {
        synchronized (f16676a) {
            C6031j jVar = f16677b;
            if (jVar == null) {
                return new C6031j();
            }
            f16677b = jVar.f16686k;
            jVar.f16686k = null;
            f16678c--;
            return jVar;
        }
    }

    /* renamed from: c */
    private void m22778c() {
        this.f16679d = null;
        this.f16680e = null;
        this.f16681f = 0;
        this.f16682g = 0;
        this.f16683h = 0;
        this.f16684i = null;
        this.f16685j = null;
    }

    /* renamed from: b */
    public void mo17990b() {
        synchronized (f16676a) {
            if (f16678c < 5) {
                m22778c();
                f16678c++;
                C6031j jVar = f16677b;
                if (jVar != null) {
                    this.f16686k = jVar;
                }
                f16677b = this;
            }
        }
    }

    /* renamed from: d */
    public C6031j mo17991d(C5999d dVar) {
        this.f16679d = dVar;
        return this;
    }

    /* renamed from: e */
    public C6031j mo17992e(long j) {
        this.f16682g = j;
        return this;
    }

    /* renamed from: f */
    public C6031j mo17993f(long j) {
        this.f16683h = j;
        return this;
    }

    /* renamed from: g */
    public C6031j mo17994g(C5997c.C5998a aVar) {
        this.f16685j = aVar;
        return this;
    }

    /* renamed from: h */
    public C6031j mo17995h(IOException iOException) {
        this.f16684i = iOException;
        return this;
    }

    /* renamed from: i */
    public C6031j mo17996i(long j) {
        this.f16681f = j;
        return this;
    }

    /* renamed from: j */
    public C6031j mo17997j(String str) {
        this.f16680e = str;
        return this;
    }
}
