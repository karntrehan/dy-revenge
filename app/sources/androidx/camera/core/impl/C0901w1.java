package androidx.camera.core.impl;

import androidx.camera.core.C0948o1;
import androidx.camera.core.C0952p1;
import androidx.camera.core.C0957q1;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.impl.w1 */
public class C0901w1 implements C0952p1 {

    /* renamed from: b */
    private int f2588b;

    public C0901w1(int i) {
        this.f2588b = i;
    }

    /* renamed from: a */
    public /* synthetic */ C0835l1 mo3139a() {
        return C0948o1.m3687a(this);
    }

    /* renamed from: b */
    public List<C0957q1> mo3140b(List<C0957q1> list) {
        ArrayList arrayList = new ArrayList();
        for (C0957q1 next : list) {
            C1177h.m4580b(next instanceof C0888u0, "The camera info doesn't contain internal implementation.");
            Integer c = ((C0888u0) next).mo2455c();
            if (c != null && c.intValue() == this.f2588b) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int mo3141c() {
        return this.f2588b;
    }
}
