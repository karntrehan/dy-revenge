package com.google.firebase.p164r;

import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4504o;
import com.google.firebase.components.C4518u;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.r.d */
public class C4932d implements C4938i {

    /* renamed from: a */
    private final String f13790a;

    /* renamed from: b */
    private final C4933e f13791b;

    C4932d(Set<C4935g> set, C4933e eVar) {
        this.f13790a = m18798d(set);
        this.f13791b = eVar;
    }

    /* renamed from: b */
    public static C4501n<C4938i> m18796b() {
        return C4501n.m17120a(C4938i.class).mo14031b(C4518u.m17195k(C4935g.class)).mo14034e(C4929a.f13785a).mo14032c();
    }

    /* renamed from: c */
    static /* synthetic */ C4938i m18797c(C4504o oVar) {
        return new C4932d(oVar.mo14016d(C4935g.class), C4933e.m18800a());
    }

    /* renamed from: d */
    private static String m18798d(Set<C4935g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C4935g> it = set.iterator();
        while (it.hasNext()) {
            C4935g next = it.next();
            sb.append(next.mo14937b());
            sb.append('/');
            sb.append(next.mo14938c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo14942a() {
        if (this.f13791b.mo14943b().isEmpty()) {
            return this.f13790a;
        }
        return this.f13790a + ' ' + m18798d(this.f13791b.mo14943b());
    }
}
