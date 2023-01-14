package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.h */
final class C3789h implements DynamiteModule.C3779b {
    C3789h() {
    }

    /* renamed from: a */
    public final DynamiteModule.C3779b.C3781b mo11739a(Context context, String str, DynamiteModule.C3779b.C3780a aVar) {
        DynamiteModule.C3779b.C3781b bVar = new DynamiteModule.C3779b.C3781b();
        int a = aVar.mo11740a(context, str, false);
        bVar.f10481b = a;
        if (a == 0) {
            bVar.f10482c = 0;
        } else {
            bVar.f10482c = 1;
        }
        return bVar;
    }
}
