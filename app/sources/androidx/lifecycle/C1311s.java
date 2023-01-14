package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.s */
public class C1311s {

    /* renamed from: a */
    private final HashMap<String, C1306q> f3744a = new HashMap<>();

    /* renamed from: a */
    public final void mo4379a() {
        for (C1306q a : this.f3744a.values()) {
            a.mo4373a();
        }
        this.f3744a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1306q mo4380b(String str) {
        return this.f3744a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo4381c() {
        return new HashSet(this.f3744a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4382d(String str, C1306q qVar) {
        C1306q put = this.f3744a.put(str, qVar);
        if (put != null) {
            put.mo4183d();
        }
    }
}
