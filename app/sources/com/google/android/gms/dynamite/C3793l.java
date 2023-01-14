package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.l */
final class C3793l implements DynamiteModule.C3779b {
    C3793l() {
    }

    /* renamed from: a */
    public final DynamiteModule.C3779b.C3781b mo11739a(Context context, String str, DynamiteModule.C3779b.C3780a aVar) {
        DynamiteModule.C3779b.C3781b bVar = new DynamiteModule.C3779b.C3781b();
        int b = aVar.mo11741b(context, str);
        bVar.f10480a = b;
        int i = 0;
        int a = b != 0 ? aVar.mo11740a(context, str, false) : aVar.mo11740a(context, str, true);
        bVar.f10481b = a;
        int i2 = bVar.f10480a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            bVar.f10482c = 0;
            return bVar;
        }
        if (a >= i) {
            bVar.f10482c = 1;
        } else {
            bVar.f10482c = -1;
        }
        return bVar;
    }
}
