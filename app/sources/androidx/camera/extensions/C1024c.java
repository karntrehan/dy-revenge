package androidx.camera.extensions;

import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0952p1;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0835l1;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.extensions.p017f.C1050n;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.extensions.c */
final class C1024c implements C0952p1 {

    /* renamed from: b */
    private final C0835l1 f2883b;

    /* renamed from: c */
    private final C1050n f2884c;

    C1024c(String str, C1050n nVar) {
        this.f2883b = C0835l1.m3270a(str);
        this.f2884c = nVar;
    }

    /* renamed from: a */
    public C0835l1 mo3139a() {
        return this.f2883b;
    }

    /* renamed from: b */
    public List<C0957q1> mo3140b(List<C0957q1> list) {
        ArrayList arrayList = new ArrayList();
        for (C0957q1 next : list) {
            C1177h.m4580b(next instanceof C0888u0, "The camera info doesn't contain internal implementation.");
            if (this.f2884c.mo3321b(C0597i.m2471b(next).mo2533e(), C0597i.m2471b(next).mo2532d())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
