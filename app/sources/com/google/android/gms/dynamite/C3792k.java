package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.k */
final class C3792k implements DynamiteModule.C3779b {
    C3792k() {
    }

    /* renamed from: a */
    public final DynamiteModule.C3779b.C3781b mo11739a(Context context, String str, DynamiteModule.C3779b.C3780a aVar) {
        DynamiteModule.C3779b.C3781b bVar = new DynamiteModule.C3779b.C3781b();
        bVar.f10480a = aVar.mo11741b(context, str);
        int a = aVar.mo11740a(context, str, true);
        bVar.f10481b = a;
        int i = bVar.f10480a;
        if (i == 0) {
            if (a == 0) {
                bVar.f10482c = 0;
                return bVar;
            }
            i = 0;
        }
        if (a >= i) {
            bVar.f10482c = 1;
        } else {
            bVar.f10482c = -1;
        }
        return bVar;
    }
}
