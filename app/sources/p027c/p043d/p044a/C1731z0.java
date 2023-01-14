package p027c.p043d.p044a;

import android.util.Size;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0711a0;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: c.d.a.z0 */
public final class C1731z0 {

    /* renamed from: a */
    private final List<C1727y0> f5152a;

    /* renamed from: b */
    private final C1703q0 f5153b;

    C1731z0(List<C1727y0> list, C1703q0 q0Var) {
        C1177h.m4580b(!list.isEmpty() || q0Var != C1703q0.f5116a, "No preferred quality and fallback strategy.");
        this.f5152a = Collections.unmodifiableList(new ArrayList(list));
        this.f5153b = q0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7385a(java.util.List<p027c.p043d.p044a.C1727y0> r11, java.util.Set<p027c.p043d.p044a.C1727y0> r12) {
        /*
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r12.containsAll(r11)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Select quality by fallbackStrategy = "
            r0.append(r1)
            c.d.a.q0 r1 = r10.f5153b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QualitySelector"
            androidx.camera.core.C0949o2.m3688a(r1, r0)
            c.d.a.q0 r0 = r10.f5153b
            c.d.a.q0 r2 = p027c.p043d.p044a.C1703q0.f5116a
            if (r0 != r2) goto L_0x002d
            return
        L_0x002d:
            boolean r0 = r0 instanceof p027c.p043d.p044a.C1703q0.C1705b
            java.lang.String r2 = "Currently only support type RuleStrategy"
            androidx.core.util.C1177h.m4586h(r0, r2)
            c.d.a.q0 r0 = r10.f5153b
            c.d.a.q0$b r0 = (p027c.p043d.p044a.C1703q0.C1705b) r0
            java.util.List r2 = p027c.p043d.p044a.C1727y0.m7381b()
            c.d.a.y0 r3 = r0.mo5677c()
            c.d.a.y0 r4 = p027c.p043d.p044a.C1727y0.f5145f
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L_0x004d
            java.lang.Object r3 = r2.get(r5)
        L_0x004a:
            c.d.a.y0 r3 = (p027c.p043d.p044a.C1727y0) r3
            goto L_0x0063
        L_0x004d:
            c.d.a.y0 r3 = r0.mo5677c()
            c.d.a.y0 r4 = p027c.p043d.p044a.C1727y0.f5144e
            if (r3 != r4) goto L_0x005f
            int r3 = r2.size()
            int r3 = r3 - r6
            java.lang.Object r3 = r2.get(r3)
            goto L_0x004a
        L_0x005f:
            c.d.a.y0 r3 = r0.mo5677c()
        L_0x0063:
            int r4 = r2.indexOf(r3)
            r7 = -1
            if (r4 == r7) goto L_0x006b
            r5 = 1
        L_0x006b:
            androidx.core.util.C1177h.m4585g(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r4 + -1
        L_0x0075:
            if (r7 < 0) goto L_0x0089
            java.lang.Object r8 = r2.get(r7)
            c.d.a.y0 r8 = (p027c.p043d.p044a.C1727y0) r8
            boolean r9 = r11.contains(r8)
            if (r9 == 0) goto L_0x0086
            r5.add(r8)
        L_0x0086:
            int r7 = r7 + -1
            goto L_0x0075
        L_0x0089:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r4 = r4 + r6
        L_0x008f:
            int r8 = r2.size()
            if (r4 >= r8) goto L_0x00a7
            java.lang.Object r8 = r2.get(r4)
            c.d.a.y0 r8 = (p027c.p043d.p044a.C1727y0) r8
            boolean r9 = r11.contains(r8)
            if (r9 == 0) goto L_0x00a4
            r7.add(r8)
        L_0x00a4:
            int r4 = r4 + 1
            goto L_0x008f
        L_0x00a7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "sizeSortedQualities = "
            r11.append(r4)
            r11.append(r2)
            java.lang.String r2 = ", fallback quality = "
            r11.append(r2)
            r11.append(r3)
            java.lang.String r2 = ", largerQualities = "
            r11.append(r2)
            r11.append(r5)
            java.lang.String r2 = ", smallerQualities = "
            r11.append(r2)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            androidx.camera.core.C0949o2.m3688a(r1, r11)
            int r11 = r0.mo5678d()
            if (r11 == 0) goto L_0x010b
            if (r11 == r6) goto L_0x0105
            r0 = 2
            if (r11 == r0) goto L_0x0101
            r0 = 3
            if (r11 == r0) goto L_0x00fe
            r0 = 4
            if (r11 != r0) goto L_0x00e5
            goto L_0x0108
        L_0x00e5:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Unhandled fallback strategy: "
            r12.append(r0)
            c.d.a.q0 r0 = r10.f5153b
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00fe:
            r12.addAll(r7)
        L_0x0101:
            r12.addAll(r5)
            goto L_0x010b
        L_0x0105:
            r12.addAll(r5)
        L_0x0108:
            r12.addAll(r7)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1731z0.m7385a(java.util.List, java.util.Set):void");
    }

    /* renamed from: b */
    private static void m7386b(C1727y0 y0Var) {
        boolean a = C1727y0.m7380a(y0Var);
        C1177h.m4580b(a, "Invalid quality: " + y0Var);
    }

    /* renamed from: c */
    private static void m7387c(List<C1727y0> list) {
        for (C1727y0 next : list) {
            boolean a = C1727y0.m7380a(next);
            C1177h.m4580b(a, "qualities contain invalid quality: " + next);
        }
    }

    /* renamed from: d */
    public static C1731z0 m7388d(C1727y0 y0Var) {
        return m7389e(y0Var, C1703q0.f5116a);
    }

    /* renamed from: e */
    public static C1731z0 m7389e(C1727y0 y0Var, C1703q0 q0Var) {
        C1177h.m4584f(y0Var, "quality cannot be null");
        C1177h.m4584f(q0Var, "fallbackStrategy cannot be null");
        m7386b(y0Var);
        return new C1731z0(Arrays.asList(new C1727y0[]{y0Var}), q0Var);
    }

    /* renamed from: f */
    public static C1731z0 m7390f(List<C1727y0> list, C1703q0 q0Var) {
        C1177h.m4584f(list, "qualities cannot be null");
        C1177h.m4584f(q0Var, "fallbackStrategy cannot be null");
        C1177h.m4580b(!list.isEmpty(), "qualities cannot be empty");
        m7387c(list);
        return new C1731z0(list, q0Var);
    }

    /* renamed from: h */
    public static Size m7391h(C0957q1 q1Var, C1727y0 y0Var) {
        m7386b(y0Var);
        C0711a0 d = C1527e1.m6824c(q1Var).mo5650d(y0Var);
        if (d != null) {
            return new Size(d.mo2811p(), d.mo2809n());
        }
        return null;
    }

    /* renamed from: i */
    public static List<C1727y0> m7392i(C0957q1 q1Var) {
        return C1527e1.m6824c(q1Var).mo5651e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C1727y0> mo5964g(C0957q1 q1Var) {
        List<C1727y0> e = C1527e1.m6824c(q1Var).mo5651e();
        if (e.isEmpty()) {
            C0949o2.m3698k("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C0949o2.m3688a("QualitySelector", "supportedQualities = " + e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C1727y0> it = this.f5152a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1727y0 next = it.next();
            if (next == C1727y0.f5145f) {
                linkedHashSet.addAll(e);
                break;
            } else if (next == C1727y0.f5144e) {
                ArrayList arrayList = new ArrayList(e);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (e.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C0949o2.m3698k("QualitySelector", "quality is not supported and will be ignored: " + next);
            }
        }
        m7385a(e, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f5152a + ", fallbackStrategy=" + this.f5153b + "}";
    }
}
