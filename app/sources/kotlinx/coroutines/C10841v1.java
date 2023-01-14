package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10763v;

/* renamed from: kotlinx.coroutines.v1 */
public final class C10841v1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C10763v f28387a = new C10763v("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C10763v f28388b = new C10763v("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C10763v f28389c = new C10763v("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C10763v f28390d = new C10763v("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C10763v f28391e = new C10763v("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C10852z0 f28392f = new C10852z0(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C10852z0 f28393g = new C10852z0(true);

    /* renamed from: g */
    public static final Object m36923g(Object obj) {
        return obj instanceof C10727i1 ? new C10773j1((C10727i1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m36924h(Object obj) {
        C10773j1 j1Var = obj instanceof C10773j1 ? (C10773j1) obj : null;
        return j1Var == null ? obj : j1Var.f28278a;
    }
}
