package p174e.p181b.p182a;

import androidx.core.util.C1174e;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p027c.p060f.C1790b;
import p174e.p181b.p182a.p195z.C5645f;

/* renamed from: e.b.a.o */
public class C5467o {

    /* renamed from: a */
    private boolean f15319a = false;

    /* renamed from: b */
    private final Set<C5469b> f15320b = new C1790b();

    /* renamed from: c */
    private final Map<String, C5645f> f15321c = new HashMap();

    /* renamed from: d */
    private final Comparator<C1174e<String, Float>> f15322d = new C5468a();

    /* renamed from: e.b.a.o$a */
    class C5468a implements Comparator<C1174e<String, Float>> {
        C5468a() {
        }

        /* renamed from: a */
        public int compare(C1174e<String, Float> eVar, C1174e<String, Float> eVar2) {
            float floatValue = ((Float) eVar.f3263b).floatValue();
            float floatValue2 = ((Float) eVar2.f3263b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* renamed from: e.b.a.o$b */
    public interface C5469b {
        /* renamed from: a */
        void mo16585a(float f);
    }

    /* renamed from: a */
    public void mo16581a(String str, float f) {
        if (this.f15319a) {
            C5645f fVar = this.f15321c.get(str);
            if (fVar == null) {
                fVar = new C5645f();
                this.f15321c.put(str, fVar);
            }
            fVar.mo16925a(f);
            if (str.equals("__container")) {
                for (C5469b a : this.f15320b) {
                    a.mo16585a(f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16582b(boolean z) {
        this.f15319a = z;
    }
}
