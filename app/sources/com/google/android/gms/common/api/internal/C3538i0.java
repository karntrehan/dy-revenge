package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3469a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
final class C3538i0 extends C3563o0 {

    /* renamed from: o */
    private final ArrayList<C3469a.C3478f> f9983o;

    /* renamed from: p */
    final /* synthetic */ C3567p0 f9984p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3538i0(C3567p0 p0Var, ArrayList<C3469a.C3478f> arrayList) {
        super(p0Var, (C3559n0) null);
        this.f9984p = p0Var;
        this.f9983o = arrayList;
    }

    /* renamed from: a */
    public final void mo11352a() {
        C3567p0 p0Var = this.f9984p;
        p0Var.f10036a.f10169n.f10122p = C3567p0.m13864x(p0Var);
        ArrayList<C3469a.C3478f> arrayList = this.f9983o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3567p0 p0Var2 = this.f9984p;
            arrayList.get(i).mo11188d(p0Var2.f10050o, p0Var2.f10036a.f10169n.f10122p);
        }
    }
}
