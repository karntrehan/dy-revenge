package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.widget.C1188c;

/* renamed from: androidx.appcompat.widget.i */
class C0228i {

    /* renamed from: a */
    private final CompoundButton f985a;

    /* renamed from: b */
    private ColorStateList f986b = null;

    /* renamed from: c */
    private PorterDuff.Mode f987c = null;

    /* renamed from: d */
    private boolean f988d = false;

    /* renamed from: e */
    private boolean f989e = false;

    /* renamed from: f */
    private boolean f990f;

    C0228i(CompoundButton compoundButton) {
        this.f985a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1394a() {
        Drawable a = C1188c.m4677a(this.f985a);
        if (a == null) {
            return;
        }
        if (this.f988d || this.f989e) {
            Drawable mutate = C1164a.m4554r(a).mutate();
            if (this.f988d) {
                C1164a.m4551o(mutate, this.f986b);
            }
            if (this.f989e) {
                C1164a.m4552p(mutate, this.f987c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f985a.getDrawableState());
            }
            this.f985a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C1188c.m4677a(r2.f985a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1395b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f985a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C1188c.m4677a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0228i.mo1395b(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1396c() {
        return this.f986b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1397d() {
        return this.f987c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1398e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f985a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p027c.p028a.C1444j.f4286R0
            r8 = 0
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.C0292x0.m1407v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f985a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1801r()
            r7 = 0
            r4 = r10
            r6 = r11
            p027c.p064i.p072j.C1988t.m8390k0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p027c.p028a.C1444j.f4296T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1802s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1797n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f985a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p027c.p028a.p029k.p030a.C1445a.m6446d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p027c.p028a.C1444j.f4291S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1802s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1797n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f985a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p027c.p028a.p029k.p030a.C1445a.m6446d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p027c.p028a.C1444j.f4301U0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1802s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f985a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1786c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C1188c.m4679c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p027c.p028a.C1444j.f4306V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1802s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f985a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1794k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0215e0.m1121e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C1188c.m4680d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1803w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1803w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0228i.mo1398e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1399f() {
        if (this.f990f) {
            this.f990f = false;
            return;
        }
        this.f990f = true;
        mo1394a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1400g(ColorStateList colorStateList) {
        this.f986b = colorStateList;
        this.f988d = true;
        mo1394a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1401h(PorterDuff.Mode mode) {
        this.f987c = mode;
        this.f989e = true;
        mo1394a();
    }
}
