package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.p022d.C1154f;
import androidx.core.widget.C1187b;
import java.lang.ref.WeakReference;
import p027c.p028a.C1444j;

/* renamed from: androidx.appcompat.widget.y */
class C0293y {

    /* renamed from: a */
    private final TextView f1247a;

    /* renamed from: b */
    private C0277v0 f1248b;

    /* renamed from: c */
    private C0277v0 f1249c;

    /* renamed from: d */
    private C0277v0 f1250d;

    /* renamed from: e */
    private C0277v0 f1251e;

    /* renamed from: f */
    private C0277v0 f1252f;

    /* renamed from: g */
    private C0277v0 f1253g;

    /* renamed from: h */
    private C0277v0 f1254h;

    /* renamed from: i */
    private final C0191a0 f1255i;

    /* renamed from: j */
    private int f1256j = 0;

    /* renamed from: k */
    private int f1257k = -1;

    /* renamed from: l */
    private Typeface f1258l;

    /* renamed from: m */
    private boolean f1259m;

    /* renamed from: androidx.appcompat.widget.y$a */
    class C0294a extends C1154f.C1157c {

        /* renamed from: a */
        final /* synthetic */ int f1260a;

        /* renamed from: b */
        final /* synthetic */ int f1261b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1262c;

        C0294a(int i, int i2, WeakReference weakReference) {
            this.f1260a = i;
            this.f1261b = i2;
            this.f1262c = weakReference;
        }

        /* renamed from: d */
        public void mo1826d(int i) {
        }

        /* renamed from: e */
        public void mo1827e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1260a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1261b & 2) != 0);
            }
            C0293y.this.mo1815n(this.f1262c, typeface);
        }
    }

    C0293y(TextView textView) {
        this.f1247a = textView;
        this.f1255i = new C0191a0(textView);
    }

    /* renamed from: A */
    private void m1428A(int i, float f) {
        this.f1255i.mo1239y(i, f);
    }

    /* renamed from: B */
    private void m1429B(Context context, C0292x0 x0Var) {
        String o;
        Typeface typeface;
        Typeface typeface2;
        this.f1256j = x0Var.mo1794k(C1444j.f4333a3, this.f1256j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int k = x0Var.mo1794k(C1444j.f4358f3, -1);
            this.f1257k = k;
            if (k != -1) {
                this.f1256j = (this.f1256j & 2) | 0;
            }
        }
        int i2 = C1444j.f4353e3;
        if (x0Var.mo1802s(i2) || x0Var.mo1802s(C1444j.f4363g3)) {
            this.f1258l = null;
            int i3 = C1444j.f4363g3;
            if (x0Var.mo1802s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1257k;
            int i5 = this.f1256j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = x0Var.mo1793j(i2, this.f1256j, new C0294a(i4, i5, new WeakReference(this.f1247a)));
                    if (j != null) {
                        if (i >= 28 && this.f1257k != -1) {
                            j = Typeface.create(Typeface.create(j, 0), this.f1257k, (this.f1256j & 2) != 0);
                        }
                        this.f1258l = j;
                    }
                    this.f1259m = this.f1258l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1258l == null && (o = x0Var.mo1798o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1257k == -1) {
                    typeface = Typeface.create(o, this.f1256j);
                } else {
                    Typeface create = Typeface.create(o, 0);
                    int i6 = this.f1257k;
                    if ((this.f1256j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i6, z);
                }
                this.f1258l = typeface;
                return;
            }
            return;
        }
        int i7 = C1444j.f4328Z2;
        if (x0Var.mo1802s(i7)) {
            this.f1259m = false;
            int k2 = x0Var.mo1794k(i7, 1);
            if (k2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (k2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1258l = typeface2;
        }
    }

    /* renamed from: a */
    private void m1430a(Drawable drawable, C0277v0 v0Var) {
        if (drawable != null && v0Var != null) {
            C0231j.m1181i(drawable, v0Var, this.f1247a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0277v0 m1431d(Context context, C0231j jVar, int i) {
        ColorStateList f = jVar.mo1444f(context, i);
        if (f == null) {
            return null;
        }
        C0277v0 v0Var = new C0277v0();
        v0Var.f1211d = true;
        v0Var.f1208a = f;
        return v0Var;
    }

    /* renamed from: x */
    private void m1432x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1247a.getCompoundDrawablesRelative();
            TextView textView = this.f1247a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1247a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1247a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1247a.getCompoundDrawables();
            TextView textView3 = this.f1247a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: y */
    private void m1433y() {
        C0277v0 v0Var = this.f1254h;
        this.f1248b = v0Var;
        this.f1249c = v0Var;
        this.f1250d = v0Var;
        this.f1251e = v0Var;
        this.f1252f = v0Var;
        this.f1253g = v0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1804b() {
        if (!(this.f1248b == null && this.f1249c == null && this.f1250d == null && this.f1251e == null)) {
            Drawable[] compoundDrawables = this.f1247a.getCompoundDrawables();
            m1430a(compoundDrawables[0], this.f1248b);
            m1430a(compoundDrawables[1], this.f1249c);
            m1430a(compoundDrawables[2], this.f1250d);
            m1430a(compoundDrawables[3], this.f1251e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1252f != null || this.f1253g != null) {
            Drawable[] compoundDrawablesRelative = this.f1247a.getCompoundDrawablesRelative();
            m1430a(compoundDrawablesRelative[0], this.f1252f);
            m1430a(compoundDrawablesRelative[2], this.f1253g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1805c() {
        this.f1255i.mo1226b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1806e() {
        return this.f1255i.mo1228j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1807f() {
        return this.f1255i.mo1229k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1808g() {
        return this.f1255i.mo1230l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo1809h() {
        return this.f1255i.mo1231m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo1810i() {
        return this.f1255i.mo1232n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo1811j() {
        C0277v0 v0Var = this.f1254h;
        if (v0Var != null) {
            return v0Var.f1208a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo1812k() {
        C0277v0 v0Var = this.f1254h;
        if (v0Var != null) {
            return v0Var.f1209b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo1813l() {
        return this.f1255i.mo1234s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1814m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1247a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.j r11 = androidx.appcompat.widget.C0231j.m1178b()
            int[] r2 = p027c.p028a.C1444j.f4330a0
            r12 = 0
            androidx.appcompat.widget.x0 r13 = androidx.appcompat.widget.C0292x0.m1407v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1247a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo1801r()
            r6 = 0
            r3 = r24
            r5 = r25
            p027c.p064i.p072j.C1988t.m8390k0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p027c.p028a.C1444j.f4335b0
            r14 = -1
            int r0 = r13.mo1797n(r0, r14)
            int r1 = p027c.p028a.C1444j.f4350e0
            boolean r2 = r13.mo1802s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo1797n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1431d(r10, r11, r1)
            r7.f1248b = r1
        L_0x0042:
            int r1 = p027c.p028a.C1444j.f4340c0
            boolean r2 = r13.mo1802s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo1797n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1431d(r10, r11, r1)
            r7.f1249c = r1
        L_0x0054:
            int r1 = p027c.p028a.C1444j.f4355f0
            boolean r2 = r13.mo1802s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo1797n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1431d(r10, r11, r1)
            r7.f1250d = r1
        L_0x0066:
            int r1 = p027c.p028a.C1444j.f4345d0
            boolean r2 = r13.mo1802s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo1797n(r1, r12)
            androidx.appcompat.widget.v0 r1 = m1431d(r10, r11, r1)
            r7.f1251e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = p027c.p028a.C1444j.f4360g0
            boolean r3 = r13.mo1802s(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.mo1797n(r2, r12)
            androidx.appcompat.widget.v0 r2 = m1431d(r10, r11, r2)
            r7.f1252f = r2
        L_0x0090:
            int r2 = p027c.p028a.C1444j.f4365h0
            boolean r3 = r13.mo1802s(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.mo1797n(r2, r12)
            androidx.appcompat.widget.v0 r2 = m1431d(r10, r11, r2)
            r7.f1253g = r2
        L_0x00a2:
            r13.mo1803w()
            android.widget.TextView r2 = r7.f1247a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = p027c.p028a.C1444j.f4318X2
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.C0292x0.m1405t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = p027c.p028a.C1444j.f4373i3
            boolean r15 = r0.mo1802s(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.mo1784a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.m1429B(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = p027c.p028a.C1444j.f4338b3
            boolean r17 = r0.mo1802s(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.mo1786c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = p027c.p028a.C1444j.f4343c3
            boolean r18 = r0.mo1802s(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.mo1786c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = p027c.p028a.C1444j.f4348d3
            boolean r19 = r0.mo1802s(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.mo1786c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = p027c.p028a.C1444j.f4378j3
            boolean r20 = r0.mo1802s(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.mo1798o(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = p027c.p028a.C1444j.f4368h3
            boolean r21 = r0.mo1802s(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.mo1798o(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.mo1803w()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = p027c.p028a.C1444j.f4318X2
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.C0292x0.m1407v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = p027c.p028a.C1444j.f4373i3
            boolean r22 = r0.mo1802s(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo1784a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = p027c.p028a.C1444j.f4338b3
            boolean r12 = r0.mo1802s(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.mo1786c(r3)
        L_0x0152:
            int r3 = p027c.p028a.C1444j.f4343c3
            boolean r12 = r0.mo1802s(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.mo1786c(r3)
        L_0x015e:
            int r3 = p027c.p028a.C1444j.f4348d3
            boolean r12 = r0.mo1802s(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.mo1786c(r3)
        L_0x016a:
            int r3 = p027c.p028a.C1444j.f4378j3
            boolean r12 = r0.mo1802s(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.mo1798o(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = p027c.p028a.C1444j.f4368h3
            boolean r12 = r0.mo1802s(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.mo1798o(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = p027c.p028a.C1444j.f4323Y2
            boolean r16 = r0.mo1802s(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.mo1789f(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1247a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.m1429B(r10, r0)
            r0.mo1803w()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1247a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1247a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1247a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.mo1819r(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1258l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1257k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1247a
            int r4 = r7.f1256j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1247a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1247a
            r0.setFontVariationSettings(r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020f
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1247a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x020f
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020f
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f1247a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x020f:
            androidx.appcompat.widget.a0 r0 = r7.f1255i
            r1 = r24
            r0.mo1235t(r1, r9)
            boolean r0 = androidx.core.widget.C1187b.f3326a
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.a0 r0 = r7.f1255i
            int r0 = r0.mo1232n()
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.a0 r0 = r7.f1255i
            int[] r0 = r0.mo1231m()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0257
            android.widget.TextView r2 = r7.f1247a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0251
            android.widget.TextView r0 = r7.f1247a
            androidx.appcompat.widget.a0 r2 = r7.f1255i
            int r2 = r2.mo1229k()
            androidx.appcompat.widget.a0 r3 = r7.f1255i
            int r3 = r3.mo1228j()
            androidx.appcompat.widget.a0 r4 = r7.f1255i
            int r4 = r4.mo1230l()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x0257
        L_0x0251:
            r5 = 0
            android.widget.TextView r2 = r7.f1247a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x0257:
            int[] r0 = p027c.p028a.C1444j.f4370i0
            androidx.appcompat.widget.x0 r8 = androidx.appcompat.widget.C0292x0.m1406u(r10, r1, r0)
            int r0 = p027c.p028a.C1444j.f4410q0
            r1 = -1
            int r0 = r8.mo1797n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026e
            android.graphics.drawable.Drawable r0 = r2.mo1442c(r10, r0)
            r3 = r0
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            int r0 = p027c.p028a.C1444j.f4435v0
            int r0 = r8.mo1797n(r0, r1)
            if (r0 == r1) goto L_0x027d
            android.graphics.drawable.Drawable r0 = r2.mo1442c(r10, r0)
            r4 = r0
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            int r0 = p027c.p028a.C1444j.f4415r0
            int r0 = r8.mo1797n(r0, r1)
            if (r0 == r1) goto L_0x028c
            android.graphics.drawable.Drawable r0 = r2.mo1442c(r10, r0)
            r5 = r0
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            int r0 = p027c.p028a.C1444j.f4400o0
            int r0 = r8.mo1797n(r0, r1)
            if (r0 == r1) goto L_0x029b
            android.graphics.drawable.Drawable r0 = r2.mo1442c(r10, r0)
            r6 = r0
            goto L_0x029c
        L_0x029b:
            r6 = 0
        L_0x029c:
            int r0 = p027c.p028a.C1444j.f4420s0
            int r0 = r8.mo1797n(r0, r1)
            if (r0 == r1) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r2.mo1442c(r10, r0)
            r9 = r0
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            int r0 = p027c.p028a.C1444j.f4405p0
            int r0 = r8.mo1797n(r0, r1)
            if (r0 == r1) goto L_0x02b9
            android.graphics.drawable.Drawable r0 = r2.mo1442c(r10, r0)
            r10 = r0
            goto L_0x02ba
        L_0x02b9:
            r10 = 0
        L_0x02ba:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.m1432x(r1, r2, r3, r4, r5, r6)
            int r0 = p027c.p028a.C1444j.f4425t0
            boolean r1 = r8.mo1802s(r0)
            if (r1 == 0) goto L_0x02d6
            android.content.res.ColorStateList r0 = r8.mo1786c(r0)
            android.widget.TextView r1 = r7.f1247a
            androidx.core.widget.C1194i.m4700g(r1, r0)
        L_0x02d6:
            int r0 = p027c.p028a.C1444j.f4430u0
            boolean r1 = r8.mo1802s(r0)
            if (r1 == 0) goto L_0x02ee
            r1 = -1
            int r0 = r8.mo1794k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0215e0.m1121e(r0, r2)
            android.widget.TextView r2 = r7.f1247a
            androidx.core.widget.C1194i.m4701h(r2, r0)
            goto L_0x02ef
        L_0x02ee:
            r1 = -1
        L_0x02ef:
            int r0 = p027c.p028a.C1444j.f4440w0
            int r0 = r8.mo1789f(r0, r1)
            int r2 = p027c.p028a.C1444j.f4445x0
            int r2 = r8.mo1789f(r2, r1)
            int r3 = p027c.p028a.C1444j.f4450y0
            int r3 = r8.mo1789f(r3, r1)
            r8.mo1803w()
            if (r0 == r1) goto L_0x030b
            android.widget.TextView r4 = r7.f1247a
            androidx.core.widget.C1194i.m4703j(r4, r0)
        L_0x030b:
            if (r2 == r1) goto L_0x0312
            android.widget.TextView r0 = r7.f1247a
            androidx.core.widget.C1194i.m4704k(r0, r2)
        L_0x0312:
            if (r3 == r1) goto L_0x0319
            android.widget.TextView r0 = r7.f1247a
            androidx.core.widget.C1194i.m4705l(r0, r3)
        L_0x0319:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0293y.mo1814m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo1815n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1259m) {
            this.f1258l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1256j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1816o(boolean z, int i, int i2, int i3, int i4) {
        if (!C1187b.f3326a) {
            mo1805c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo1817p() {
        mo1804b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1818q(Context context, int i) {
        String o;
        ColorStateList c;
        C0292x0 t = C0292x0.m1405t(context, i, C1444j.f4318X2);
        int i2 = C1444j.f4373i3;
        if (t.mo1802s(i2)) {
            mo1819r(t.mo1784a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C1444j.f4338b3;
            if (t.mo1802s(i4) && (c = t.mo1786c(i4)) != null) {
                this.f1247a.setTextColor(c);
            }
        }
        int i5 = C1444j.f4323Y2;
        if (t.mo1802s(i5) && t.mo1789f(i5, -1) == 0) {
            this.f1247a.setTextSize(0, 0.0f);
        }
        m1429B(context, t);
        if (i3 >= 26) {
            int i6 = C1444j.f4368h3;
            if (t.mo1802s(i6) && (o = t.mo1798o(i6)) != null) {
                this.f1247a.setFontVariationSettings(o);
            }
        }
        t.mo1803w();
        Typeface typeface = this.f1258l;
        if (typeface != null) {
            this.f1247a.setTypeface(typeface, this.f1256j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1819r(boolean z) {
        this.f1247a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1820s(int i, int i2, int i3, int i4) {
        this.f1255i.mo1236u(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1821t(int[] iArr, int i) {
        this.f1255i.mo1237v(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1822u(int i) {
        this.f1255i.mo1238w(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1823v(ColorStateList colorStateList) {
        if (this.f1254h == null) {
            this.f1254h = new C0277v0();
        }
        C0277v0 v0Var = this.f1254h;
        v0Var.f1208a = colorStateList;
        v0Var.f1211d = colorStateList != null;
        m1433y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1824w(PorterDuff.Mode mode) {
        if (this.f1254h == null) {
            this.f1254h = new C0277v0();
        }
        C0277v0 v0Var = this.f1254h;
        v0Var.f1209b = mode;
        v0Var.f1210c = mode != null;
        m1433y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1825z(int i, float f) {
        if (!C1187b.f3326a && !mo1813l()) {
            m1428A(i, f);
        }
    }
}
