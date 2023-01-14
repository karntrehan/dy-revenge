package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C3516e;
import com.google.android.gms.common.api.internal.C3550l;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C3669g<T extends IInterface> extends C3651c<T> implements C3469a.C3478f, C3686l0 {

    /* renamed from: F */
    private final C3659d f10301F;

    /* renamed from: G */
    private final Set<Scope> f10302G;

    /* renamed from: H */
    private final Account f10303H;

    @Deprecated
    protected C3669g(Context context, Looper looper, int i, C3659d dVar, C3486f.C3488b bVar, C3486f.C3489c cVar) {
        this(context, looper, i, dVar, (C3516e) bVar, (C3550l) cVar);
    }

    protected C3669g(Context context, Looper looper, int i, C3659d dVar, C3516e eVar, C3550l lVar) {
        this(context, looper, C3672h.m14272b(context), C3629e.m14086q(), i, dVar, (C3516e) C3705r.m14346k(eVar), (C3550l) C3705r.m14346k(lVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3669g(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.C3672h r13, com.google.android.gms.common.C3629e r14, int r15, com.google.android.gms.common.internal.C3659d r16, com.google.android.gms.common.api.internal.C3516e r17, com.google.android.gms.common.api.internal.C3550l r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.j0 r3 = new com.google.android.gms.common.internal.j0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.k0 r0 = new com.google.android.gms.common.internal.k0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo11577j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f10301F = r0
            android.accounts.Account r1 = r16.mo11568a()
            r9.f10303H = r1
            java.util.Set r0 = r16.mo11571d()
            java.util.Set r0 = r10.m14261q0(r0)
            r9.f10302G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3669g.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.h, com.google.android.gms.common.e, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.l):void");
    }

    /* renamed from: q0 */
    private final Set<Scope> m14261q0(Set<Scope> set) {
        Set<Scope> p0 = mo11597p0(set);
        for (Scope contains : p0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Executor mo11527B() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final Set<Scope> mo11532H() {
        return this.f10302G;
    }

    /* renamed from: c */
    public Set<Scope> mo11187c() {
        return mo11560t() ? this.f10302G : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final C3659d mo11596o0() {
        return this.f10301F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public Set<Scope> mo11597p0(Set<Scope> set) {
        return set;
    }

    /* renamed from: z */
    public final Account mo11564z() {
        return this.f10303H;
    }
}
