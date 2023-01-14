package androidx.camera.core.impl;

import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.h1 */
public final class C0816h1<T> implements C0796d2<T> {

    /* renamed from: a */
    private static final C0816h1<Object> f2425a = new C0816h1<>((Object) null);

    /* renamed from: b */
    private final C9172b<T> f2426b;

    private C0816h1(T t) {
        this.f2426b = C0768f.m3081g(t);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void mo2999f(C0796d2.C0797a aVar) {
        try {
            aVar.mo2978b(this.f2426b.get());
        } catch (InterruptedException | ExecutionException e) {
            aVar.mo2977a(e);
        }
    }

    /* renamed from: g */
    public static <U> C0796d2<U> m3215g(U u) {
        return u == null ? f2425a : new C0816h1(u);
    }

    /* renamed from: a */
    public void mo2974a(C0796d2.C0797a<? super T> aVar) {
    }

    /* renamed from: d */
    public C9172b<T> mo2975d() {
        return this.f2426b;
    }

    /* renamed from: e */
    public void mo2976e(Executor executor, C0796d2.C0797a<? super T> aVar) {
        this.f2426b.mo2919e(new C0782b(this, aVar), executor);
    }
}
