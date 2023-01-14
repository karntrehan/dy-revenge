package p174e.p319f.p320a.p335c.p338b.p339a;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.C3424a;
import com.google.android.gms.auth.api.signin.C3431b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C3446h;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.internal.C3697p;
import p174e.p319f.p320a.p335c.p338b.p339a.p341e.C6627a;
import p174e.p319f.p320a.p335c.p345f.p348c.C6669f;

/* renamed from: e.f.a.c.b.a.a */
public final class C6619a {
    @Deprecated

    /* renamed from: a */
    public static final C3469a<C6623c> f18278a = C6622b.f18294a;

    /* renamed from: b */
    public static final C3469a<C6620a> f18279b;

    /* renamed from: c */
    public static final C3469a<GoogleSignInOptions> f18280c;
    @Deprecated

    /* renamed from: d */
    public static final C6627a f18281d = C6622b.f18295b;

    /* renamed from: e */
    public static final C3424a f18282e = new C6669f();

    /* renamed from: f */
    public static final C3431b f18283f = new C3446h();

    /* renamed from: g */
    public static final C3469a.C3479g f18284g;

    /* renamed from: h */
    public static final C3469a.C3479g f18285h;

    /* renamed from: i */
    private static final C3469a.C3470a f18286i;

    /* renamed from: j */
    private static final C3469a.C3470a f18287j;

    @Deprecated
    /* renamed from: e.f.a.c.b.a.a$a */
    public static class C6620a implements C3469a.C3473d {

        /* renamed from: f */
        public static final C6620a f18288f = new C6620a(new C6621a());
        /* access modifiers changed from: private */

        /* renamed from: o */
        public final String f18289o = null;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public final boolean f18290p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public final String f18291q;

        @Deprecated
        /* renamed from: e.f.a.c.b.a.a$a$a */
        public static class C6621a {

            /* renamed from: a */
            protected Boolean f18292a = Boolean.FALSE;

            /* renamed from: b */
            protected String f18293b;

            public C6621a() {
            }

            public C6621a(C6620a aVar) {
                String unused = aVar.f18289o;
                this.f18292a = Boolean.valueOf(aVar.f18290p);
                this.f18293b = aVar.f18291q;
            }

            /* renamed from: a */
            public final C6621a mo19443a(String str) {
                this.f18293b = str;
                return this;
            }
        }

        public C6620a(C6621a aVar) {
            this.f18290p = aVar.f18292a.booleanValue();
            this.f18291q = aVar.f18293b;
        }

        /* renamed from: a */
        public final Bundle mo19439a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putBoolean("force_save_dialog", this.f18290p);
            bundle.putString("log_session_id", this.f18291q);
            return bundle;
        }

        /* renamed from: e */
        public final String mo19440e() {
            return this.f18291q;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6620a)) {
                return false;
            }
            C6620a aVar = (C6620a) obj;
            String str = aVar.f18289o;
            return C3697p.m14323b((Object) null, (Object) null) && this.f18290p == aVar.f18290p && C3697p.m14323b(this.f18291q, aVar.f18291q);
        }

        public int hashCode() {
            return C3697p.m14324c(null, Boolean.valueOf(this.f18290p), this.f18291q);
        }
    }

    static {
        C3469a.C3479g gVar = new C3469a.C3479g();
        f18284g = gVar;
        C3469a.C3479g gVar2 = new C3469a.C3479g();
        f18285h = gVar2;
        C6628f fVar = new C6628f();
        f18286i = fVar;
        C6629g gVar3 = new C6629g();
        f18287j = gVar3;
        f18279b = new C3469a<>("Auth.CREDENTIALS_API", fVar, gVar);
        f18280c = new C3469a<>("Auth.GOOGLE_SIGN_IN_API", gVar3, gVar2);
    }
}
