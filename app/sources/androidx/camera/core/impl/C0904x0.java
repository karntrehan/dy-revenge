package androidx.camera.core.impl;

import androidx.camera.core.C0945n2;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0984u1;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.x0 */
public final class C0904x0 {

    /* renamed from: a */
    private final Object f2591a = new Object();

    /* renamed from: b */
    private final Map<String, C0899w0> f2592b = new LinkedHashMap();

    /* renamed from: c */
    private final Set<C0899w0> f2593c = new HashSet();

    /* renamed from: a */
    public LinkedHashSet<C0899w0> mo3145a() {
        LinkedHashSet<C0899w0> linkedHashSet;
        synchronized (this.f2591a) {
            linkedHashSet = new LinkedHashSet<>(this.f2592b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void mo3146b(C0883t0 t0Var) {
        synchronized (this.f2591a) {
            try {
                for (String next : t0Var.mo2361a()) {
                    C0949o2.m3688a("CameraRepository", "Added camera: " + next);
                    this.f2592b.put(next, t0Var.mo2362b(next));
                }
            } catch (C0984u1 e) {
                throw new C0945n2(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
