package androidx.camera.core;

import androidx.camera.core.impl.C0784b1;
import androidx.camera.core.impl.C0800e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.x1 */
final class C1000x1 {

    /* renamed from: androidx.camera.core.x1$a */
    static final class C1001a implements C0784b1 {

        /* renamed from: a */
        final List<C0800e1> f2827a;

        C1001a(List<C0800e1> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f2827a = Collections.unmodifiableList(new ArrayList(list));
        }

        /* renamed from: a */
        public List<C0800e1> mo2947a() {
            return this.f2827a;
        }
    }

    /* renamed from: a */
    static C0784b1 m3894a(List<C0800e1> list) {
        return new C1001a(list);
    }

    /* renamed from: b */
    static C0784b1 m3895b(C0800e1... e1VarArr) {
        return new C1001a(Arrays.asList(e1VarArr));
    }

    /* renamed from: c */
    static C0784b1 m3896c() {
        return m3895b(new C0800e1.C0801a());
    }
}
