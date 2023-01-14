package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.appcompat.widget.o0 */
class C0257o0 {

    /* renamed from: a */
    private int f1087a = 0;

    /* renamed from: b */
    private int f1088b = 0;

    /* renamed from: c */
    private int f1089c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f1090d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f1091e = 0;

    /* renamed from: f */
    private int f1092f = 0;

    /* renamed from: g */
    private boolean f1093g = false;

    /* renamed from: h */
    private boolean f1094h = false;

    C0257o0() {
    }

    /* renamed from: a */
    public int mo1585a() {
        return this.f1093g ? this.f1087a : this.f1088b;
    }

    /* renamed from: b */
    public int mo1586b() {
        return this.f1087a;
    }

    /* renamed from: c */
    public int mo1587c() {
        return this.f1088b;
    }

    /* renamed from: d */
    public int mo1588d() {
        return this.f1093g ? this.f1088b : this.f1087a;
    }

    /* renamed from: e */
    public void mo1589e(int i, int i2) {
        this.f1094h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1091e = i;
            this.f1087a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1092f = i2;
            this.f1088b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1590f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1093g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1093g = r2
            boolean r0 = r1.f1094h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1090d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1091e
        L_0x0016:
            r1.f1087a = r2
            int r2 = r1.f1089c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1089c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1091e
        L_0x0024:
            r1.f1087a = r2
            int r2 = r1.f1090d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1091e
            r1.f1087a = r2
        L_0x002f:
            int r2 = r1.f1092f
        L_0x0031:
            r1.f1088b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0257o0.mo1590f(boolean):void");
    }

    /* renamed from: g */
    public void mo1591g(int i, int i2) {
        this.f1089c = i;
        this.f1090d = i2;
        this.f1094h = true;
        if (this.f1093g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1087a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1088b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1087a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1088b = i2;
        }
    }
}
