package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.C3469a.C3473d;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.internal.C3516e;
import com.google.android.gms.common.api.internal.C3550l;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3678j;
import com.google.android.gms.common.internal.C3705r;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C3469a<O extends C3473d> {

    /* renamed from: a */
    private final C3470a<?, O> f9831a;

    /* renamed from: b */
    private final C3479g<?> f9832b;

    /* renamed from: c */
    private final String f9833c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C3470a<T extends C3478f, O> extends C3477e<T, O> {
        @Deprecated
        /* renamed from: c */
        public T mo11180c(Context context, Looper looper, C3659d dVar, O o, C3486f.C3488b bVar, C3486f.C3489c cVar) {
            return mo11181d(context, looper, dVar, o, bVar, cVar);
        }

        /* renamed from: d */
        public T mo11181d(Context context, Looper looper, C3659d dVar, O o, C3516e eVar, C3550l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C3471b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C3472c<C extends C3471b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C3473d {

        /* renamed from: b */
        public static final C3476c f9834b = new C3476c((C3618q) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C3474a extends C3473d {
            /* renamed from: j */
            Account mo11182j();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C3475b extends C3473d {
            /* renamed from: b */
            GoogleSignInAccount mo11183b();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public static final class C3476c implements C3473d {
            private C3476c() {
            }

            /* synthetic */ C3476c(C3618q qVar) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C3477e<T extends C3471b, O> {
        /* renamed from: a */
        public List<Scope> mo11184a(O o) {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public int mo11185b() {
            return RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C3478f extends C3471b {
        /* renamed from: a */
        boolean mo11186a();

        /* renamed from: b */
        boolean mo11135b();

        /* renamed from: c */
        Set<Scope> mo11187c();

        /* renamed from: d */
        void mo11188d(C3678j jVar, Set<Scope> set);

        /* renamed from: e */
        void mo11189e(String str);

        /* renamed from: f */
        boolean mo11190f();

        /* renamed from: g */
        String mo11191g();

        /* renamed from: h */
        void mo11192h(C3651c.C3654c cVar);

        /* renamed from: i */
        void mo11193i();

        /* renamed from: j */
        void mo11194j(C3651c.C3656e eVar);

        /* renamed from: k */
        void mo11195k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: l */
        boolean mo11196l();

        /* renamed from: n */
        int mo11136n();

        /* renamed from: o */
        C3627d[] mo11197o();

        /* renamed from: r */
        String mo11198r();

        /* renamed from: s */
        Intent mo11138s();

        /* renamed from: t */
        boolean mo11199t();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C3479g<C extends C3478f> extends C3472c<C> {
    }

    public <C extends C3478f> C3469a(String str, C3470a<C, O> aVar, C3479g<C> gVar) {
        C3705r.m14347l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C3705r.m14347l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f9833c = str;
        this.f9831a = aVar;
        this.f9832b = gVar;
    }

    /* renamed from: a */
    public final C3470a<?, O> mo11176a() {
        return this.f9831a;
    }

    /* renamed from: b */
    public final C3472c<?> mo11177b() {
        return this.f9832b;
    }

    /* renamed from: c */
    public final C3477e<?, O> mo11178c() {
        return this.f9831a;
    }

    /* renamed from: d */
    public final String mo11179d() {
        return this.f9833c;
    }
}
