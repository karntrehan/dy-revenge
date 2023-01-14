package com.facebook.imagepipeline.memory;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6076a;
import p174e.p247e.p253d.p260g.C6078c;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6087k;
import p174e.p247e.p294k.p302f.C6342m;

/* renamed from: com.facebook.imagepipeline.memory.e0 */
public class C2406e0 {

    /* renamed from: a */
    private final C2402d0 f7163a;

    /* renamed from: b */
    private C2429v f7164b;

    /* renamed from: c */
    private C2405e f7165c;

    /* renamed from: d */
    private C2429v f7166d;

    /* renamed from: e */
    private C2422q f7167e;

    /* renamed from: f */
    private C2429v f7168f;

    /* renamed from: g */
    private C6084h f7169g;

    /* renamed from: h */
    private C6087k f7170h;

    /* renamed from: i */
    private C6076a f7171i;

    public C2406e0(C2402d0 d0Var) {
        this.f7163a = (C2402d0) C6062k.m22839g(d0Var);
    }

    /* renamed from: a */
    private C2429v m9997a() {
        if (this.f7164b == null) {
            try {
                this.f7164b = (C2429v) Class.forName("com.facebook.imagepipeline.memory.AshmemMemoryChunkPool").getConstructor(new Class[]{C6078c.class, C2408f0.class, C2410g0.class}).newInstance(new Object[]{this.f7163a.mo8107i(), this.f7163a.mo8105g(), this.f7163a.mo8106h()});
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                this.f7164b = null;
            }
        }
        return this.f7164b;
    }

    /* renamed from: f */
    private C2429v m9998f(int i) {
        if (i == 0) {
            return mo8117g();
        }
        if (i == 1) {
            return mo8114c();
        }
        if (i == 2) {
            return m9997a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* renamed from: b */
    public C2405e mo8113b() {
        C2405e eVar;
        if (this.f7165c == null) {
            String e = this.f7163a.mo8103e();
            char c = 65535;
            switch (e.hashCode()) {
                case -1868884870:
                    if (e.equals("legacy_default_params")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e.equals("legacy")) {
                        c = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e.equals("experimental")) {
                        c = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e.equals("dummy_with_tracking")) {
                        c = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e.equals("dummy")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                eVar = new C2420o();
            } else if (c == 1) {
                eVar = new C2421p();
            } else if (c != 2) {
                eVar = c != 3 ? Build.VERSION.SDK_INT >= 21 ? new C2414i(this.f7163a.mo8107i(), this.f7163a.mo8101c(), this.f7163a.mo8102d(), this.f7163a.mo8110l()) : new C2420o() : new C2414i(this.f7163a.mo8107i(), C2416k.m10056a(), this.f7163a.mo8102d(), this.f7163a.mo8110l());
            } else {
                eVar = new C2426s(this.f7163a.mo8100b(), this.f7163a.mo8099a(), C2392a0.m9923h(), this.f7163a.mo8111m() ? this.f7163a.mo8107i() : null);
            }
            this.f7165c = eVar;
        }
        return this.f7165c;
    }

    /* renamed from: c */
    public C2429v mo8114c() {
        if (this.f7166d == null) {
            try {
                this.f7166d = (C2429v) Class.forName("com.facebook.imagepipeline.memory.BufferMemoryChunkPool").getConstructor(new Class[]{C6078c.class, C2408f0.class, C2410g0.class}).newInstance(new Object[]{this.f7163a.mo8107i(), this.f7163a.mo8105g(), this.f7163a.mo8106h()});
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                this.f7166d = null;
            }
        }
        return this.f7166d;
    }

    /* renamed from: d */
    public C2422q mo8115d() {
        if (this.f7167e == null) {
            this.f7167e = new C2422q(this.f7163a.mo8107i(), this.f7163a.mo8104f());
        }
        return this.f7167e;
    }

    /* renamed from: e */
    public int mo8116e() {
        return this.f7163a.mo8104f().f7178g;
    }

    /* renamed from: g */
    public C2429v mo8117g() {
        if (this.f7168f == null) {
            try {
                this.f7168f = (C2429v) Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(new Class[]{C6078c.class, C2408f0.class, C2410g0.class}).newInstance(new Object[]{this.f7163a.mo8107i(), this.f7163a.mo8105g(), this.f7163a.mo8106h()});
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                C6071a.m22876j("PoolFactory", HttpUrl.FRAGMENT_ENCODE_SET, e);
                this.f7168f = null;
            }
        }
        return this.f7168f;
    }

    /* renamed from: h */
    public C6084h mo8118h() {
        return mo8119i(C6342m.m24169a() ^ true ? 1 : 0);
    }

    /* renamed from: i */
    public C6084h mo8119i(int i) {
        if (this.f7169g == null) {
            C2429v f = m9998f(i);
            C6062k.m22840h(f, "failed to get pool for chunk type: " + i);
            this.f7169g = new C2432y(f, mo8120j());
        }
        return this.f7169g;
    }

    /* renamed from: j */
    public C6087k mo8120j() {
        if (this.f7170h == null) {
            this.f7170h = new C6087k(mo8121k());
        }
        return this.f7170h;
    }

    /* renamed from: k */
    public C6076a mo8121k() {
        if (this.f7171i == null) {
            this.f7171i = new C2425r(this.f7163a.mo8107i(), this.f7163a.mo8108j(), this.f7163a.mo8109k());
        }
        return this.f7171i;
    }
}
