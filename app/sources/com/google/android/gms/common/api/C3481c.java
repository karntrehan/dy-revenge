package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.internal.C3500b;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import p027c.p060f.C1788a;

/* renamed from: com.google.android.gms.common.api.c */
public class C3481c extends Exception {

    /* renamed from: f */
    private final C1788a<C3500b<?>, C3623b> f9836f;

    public C3481c(C1788a<C3500b<?>, C3623b> aVar) {
        this.f9836f = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C3500b next : this.f9836f.keySet()) {
            C3623b bVar = (C3623b) C3705r.m14346k(this.f9836f.get(next));
            z &= !bVar.mo11458E();
            String b = next.mo11262b();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
