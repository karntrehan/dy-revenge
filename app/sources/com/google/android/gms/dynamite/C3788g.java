package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
final class C3788g implements DynamiteModule.C3779b {
    C3788g() {
    }

    /* renamed from: a */
    public final DynamiteModule.C3779b.C3781b mo11739a(Context context, String str, DynamiteModule.C3779b.C3780a aVar) {
        DynamiteModule.C3779b.C3781b bVar = new DynamiteModule.C3779b.C3781b();
        int b = aVar.mo11741b(context, str);
        bVar.f10480a = b;
        if (b != 0) {
            bVar.f10482c = -1;
        } else {
            int a = aVar.mo11740a(context, str, true);
            bVar.f10481b = a;
            if (a != 0) {
                bVar.f10482c = 1;
            }
        }
        return bVar;
    }
}
