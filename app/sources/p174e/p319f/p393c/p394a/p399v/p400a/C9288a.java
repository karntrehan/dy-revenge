package p174e.p319f.p393c.p394a.p399v.p400a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9217b;
import p174e.p319f.p393c.p394a.C9224g;
import p174e.p319f.p393c.p394a.C9230i;
import p174e.p319f.p393c.p394a.C9231j;
import p174e.p319f.p393c.p394a.C9232k;
import p174e.p319f.p393c.p394a.C9233l;
import p174e.p319f.p393c.p394a.p399v.p400a.C9292c;
import p174e.p319f.p393c.p394a.p404z.p405a.C9443c0;

/* renamed from: e.f.c.a.v.a.a */
public final class C9288a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f25198a = "a";

    /* renamed from: b */
    private final C9233l f25199b;

    /* renamed from: c */
    private final C9175a f25200c;

    /* renamed from: d */
    private C9231j f25201d;

    /* renamed from: e.f.c.a.v.a.a$b */
    public static final class C9290b {

        /* renamed from: a */
        private C9232k f25202a = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C9233l f25203b = null;

        /* renamed from: c */
        private String f25204c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C9175a f25205d = null;

        /* renamed from: e */
        private boolean f25206e = true;

        /* renamed from: f */
        private C9224g f25207f = null;

        /* renamed from: g */
        private KeyStore f25208g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C9231j f25209h;

        /* renamed from: e */
        private C9231j m30938e() {
            C9175a aVar = this.f25205d;
            if (aVar != null) {
                try {
                    return C9231j.m30666j(C9230i.m30656j(this.f25202a, aVar));
                } catch (C9443c0 | GeneralSecurityException e) {
                    Log.w(C9288a.f25198a, "cannot decrypt keyset: ", e);
                }
            }
            return C9231j.m30666j(C9217b.m30614a(this.f25202a));
        }

        /* renamed from: f */
        private C9231j m30939f() {
            try {
                return m30938e();
            } catch (FileNotFoundException e) {
                Log.w(C9288a.f25198a, "keyset not found, will generate a new one", e);
                if (this.f25207f != null) {
                    C9231j a = C9231j.m30665i().mo23218a(this.f25207f);
                    C9231j h = a.mo23221h(a.mo23220c().mo23214g().mo23387R(0).mo23390R());
                    if (this.f25205d != null) {
                        h.mo23220c().mo23216k(this.f25203b, this.f25205d);
                    } else {
                        C9217b.m30615b(h.mo23220c(), this.f25203b);
                    }
                    return h;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        /* renamed from: g */
        private C9175a m30940g() {
            if (!C9288a.m30933d()) {
                Log.w(C9288a.f25198a, "Android Keystore requires at least Android M");
                return null;
            }
            C9292c a = this.f25208g != null ? new C9292c.C9294b().mo23331b(this.f25208g).mo23330a() : new C9292c();
            boolean e = a.mo23329e(this.f25204c);
            if (!e) {
                try {
                    C9292c.m30951d(this.f25204c);
                } catch (GeneralSecurityException | ProviderException e2) {
                    Log.w(C9288a.f25198a, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
            }
            try {
                return a.mo23227b(this.f25204c);
            } catch (GeneralSecurityException | ProviderException e3) {
                if (!e) {
                    Log.w(C9288a.f25198a, "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f25204c}), e3);
            }
        }

        /* renamed from: d */
        public synchronized C9288a mo23325d() {
            if (this.f25204c != null) {
                this.f25205d = m30940g();
            }
            this.f25209h = m30939f();
            return new C9288a(this);
        }

        /* renamed from: h */
        public C9290b mo23326h(C9224g gVar) {
            this.f25207f = gVar;
            return this;
        }

        /* renamed from: i */
        public C9290b mo23327i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f25206e) {
                this.f25204c = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        /* renamed from: j */
        public C9290b mo23328j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.f25202a = new C9295d(context, str, str2);
                this.f25203b = new C9296e(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    private C9288a(C9290b bVar) {
        this.f25199b = bVar.f25203b;
        this.f25200c = bVar.f25205d;
        this.f25201d = bVar.f25209h;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m30933d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: c */
    public synchronized C9230i mo23324c() {
        return this.f25201d.mo23220c();
    }
}
