package p174e.p247e.p274h.p275a.p276a.p278i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: e.e.h.a.a.i.a */
public class C6150a implements C6151b {

    /* renamed from: a */
    private final List<C6151b> f16867a;

    public C6150a(C6151b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        this.f16867a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    /* renamed from: a */
    public synchronized void mo18197a(String str, int i, boolean z, String str2) {
        int size = this.f16867a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C6151b bVar = this.f16867a.get(i2);
            if (bVar != null) {
                try {
                    bVar.mo18197a(str, i, z, str2);
                } catch (Exception e) {
                    C6071a.m22876j("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo18199b(C6151b bVar) {
        this.f16867a.add(bVar);
    }

    /* renamed from: c */
    public synchronized void mo18200c(C6151b bVar) {
        this.f16867a.remove(bVar);
    }
}
