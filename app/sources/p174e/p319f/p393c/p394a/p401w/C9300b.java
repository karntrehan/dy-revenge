package p174e.p319f.p393c.p394a.p401w;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9236o;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9208s;
import p174e.p319f.p393c.p394a.p395a0.C9210t;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9408u;
import p174e.p319f.p393c.p394a.p403y.C9410v;
import p174e.p319f.p393c.p394a.p403y.C9413w;
import p174e.p319f.p393c.p394a.p403y.C9416x;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.w.b */
public final class C9300b extends C9227h<C9410v> {

    /* renamed from: e.f.c.a.w.b$a */
    class C9301a extends C9227h.C9229b<C9236o, C9410v> {
        C9301a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9236o mo23211a(C9410v vVar) {
            C9408u O = vVar.mo23459S().mo23466O();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.mo23458R().mo23644G(), "HMAC");
            int P = vVar.mo23459S().mo23467P();
            int i = C9303c.f25223a[O.ordinal()];
            if (i == 1) {
                return new C9210t(new C9208s("HMACSHA1", secretKeySpec), P);
            }
            if (i == 2) {
                return new C9210t(new C9208s("HMACSHA256", secretKeySpec), P);
            }
            if (i == 3) {
                return new C9210t(new C9208s("HMACSHA512", secretKeySpec), P);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: e.f.c.a.w.b$b */
    class C9302b extends C9227h.C9228a<C9413w, C9410v> {
        C9302b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9410v mo23207a(C9413w wVar) {
            return (C9410v) C9410v.m31344U().mo23462C(C9300b.this.mo23339k()).mo23461B(wVar.mo23465P()).mo23463z(C9468i.m31674k(C9211u.m30601c(wVar.mo23464O()))).mo23985b();
        }

        /* renamed from: f */
        public C9413w mo23209c(C9468i iVar) {
            return C9413w.m31358Q(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9413w wVar) {
            if (wVar.mo23464O() >= 16) {
                C9300b.m30987o(wVar.mo23465P());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* renamed from: e.f.c.a.w.b$c */
    static /* synthetic */ class C9303c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25223a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.f.c.a.y.u[] r0 = p174e.p319f.p393c.p394a.p403y.C9408u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25223a = r0
                e.f.c.a.y.u r1 = p174e.p319f.p393c.p394a.p403y.C9408u.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25223a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.y.u r1 = p174e.p319f.p393c.p394a.p403y.C9408u.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25223a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.y.u r1 = p174e.p319f.p393c.p394a.p403y.C9408u.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p401w.C9300b.C9303c.<clinit>():void");
        }
    }

    public C9300b() {
        super(C9410v.class, new C9301a(C9236o.class));
    }

    /* renamed from: m */
    public static void m30986m(boolean z) {
        C9242r.m30711q(new C9300b(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static void m30987o(C9416x xVar) {
        if (xVar.mo23467P() >= 10) {
            int i = C9303c.f25223a[xVar.mo23466O().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (xVar.mo23467P() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.mo23467P() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.mo23467P() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9413w, C9410v> mo23202e() {
        return new C9302b(C9413w.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: k */
    public int mo23339k() {
        return 0;
    }

    /* renamed from: l */
    public C9410v mo23204g(C9468i iVar) {
        return C9410v.m31345V(iVar, C9526q.m32218b());
    }

    /* renamed from: n */
    public void mo23206i(C9410v vVar) {
        C9214w.m30607c(vVar.mo23460T(), mo23339k());
        if (vVar.mo23458R().size() >= 16) {
            m30987o(vVar.mo23459S());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
