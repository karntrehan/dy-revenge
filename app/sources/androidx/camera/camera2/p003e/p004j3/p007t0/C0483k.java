package androidx.camera.camera2.p003e.p004j3.p007t0;

import android.util.Size;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0457i;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0467s;
import androidx.camera.core.impl.C0879s2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j3.t0.k */
public class C0483k {

    /* renamed from: a */
    private final C0467s f1616a;

    public C0483k() {
        this((C0467s) C0457i.m1980a(C0467s.class));
    }

    C0483k(C0467s sVar) {
        this.f1616a = sVar;
    }

    /* renamed from: a */
    public List<Size> mo2228a(C0879s2.C0881b bVar, List<Size> list) {
        Size c;
        C0467s sVar = this.f1616a;
        if (sVar == null || (c = sVar.mo2214c(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        for (Size next : list) {
            if (!next.equals(c)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
