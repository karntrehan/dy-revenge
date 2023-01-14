package androidx.camera.core;

import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0901w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: androidx.camera.core.s1 */
public final class C0965s1 {

    /* renamed from: a */
    public static final C0965s1 f2706a = new C0966a().mo3219d(0).mo3218b();

    /* renamed from: b */
    public static final C0965s1 f2707b = new C0966a().mo3219d(1).mo3218b();

    /* renamed from: c */
    private LinkedHashSet<C0952p1> f2708c;

    /* renamed from: androidx.camera.core.s1$a */
    public static final class C0966a {

        /* renamed from: a */
        private final LinkedHashSet<C0952p1> f2709a;

        public C0966a() {
            this.f2709a = new LinkedHashSet<>();
        }

        private C0966a(LinkedHashSet<C0952p1> linkedHashSet) {
            this.f2709a = new LinkedHashSet<>(linkedHashSet);
        }

        /* renamed from: c */
        public static C0966a m3744c(C0965s1 s1Var) {
            return new C0966a(s1Var.mo3214c());
        }

        /* renamed from: a */
        public C0966a mo3217a(C0952p1 p1Var) {
            this.f2709a.add(p1Var);
            return this;
        }

        /* renamed from: b */
        public C0965s1 mo3218b() {
            return new C0965s1(this.f2709a);
        }

        /* renamed from: d */
        public C0966a mo3219d(int i) {
            this.f2709a.add(new C0901w1(i));
            return this;
        }
    }

    C0965s1(LinkedHashSet<C0952p1> linkedHashSet) {
        this.f2708c = linkedHashSet;
    }

    /* renamed from: a */
    public LinkedHashSet<C0899w0> mo3212a(LinkedHashSet<C0899w0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0899w0) it.next()).mo2380a());
        }
        List<C0957q1> b = mo3213b(arrayList);
        LinkedHashSet<C0899w0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            C0899w0 w0Var = (C0899w0) it2.next();
            if (b.contains(w0Var.mo2380a())) {
                linkedHashSet2.add(w0Var);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public List<C0957q1> mo3213b(List<C0957q1> list) {
        List<C0957q1> arrayList = new ArrayList<>(list);
        Iterator it = this.f2708c.iterator();
        while (it.hasNext()) {
            arrayList = ((C0952p1) it.next()).mo3140b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public LinkedHashSet<C0952p1> mo3214c() {
        return this.f2708c;
    }

    /* renamed from: d */
    public Integer mo3215d() {
        Iterator it = this.f2708c.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C0952p1 p1Var = (C0952p1) it.next();
            if (p1Var instanceof C0901w1) {
                Integer valueOf = Integer.valueOf(((C0901w1) p1Var).mo3141c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: e */
    public C0899w0 mo3216e(LinkedHashSet<C0899w0> linkedHashSet) {
        Iterator it = mo3212a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (C0899w0) it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
