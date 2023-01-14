package androidx.core.content.p022d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: androidx.core.content.d.b */
public final class C1145b {

    /* renamed from: a */
    private final Shader f3201a;

    /* renamed from: b */
    private final ColorStateList f3202b;

    /* renamed from: c */
    private int f3203c;

    private C1145b(Shader shader, ColorStateList colorStateList, int i) {
        this.f3201a = shader;
        this.f3202b = colorStateList;
        this.f3203c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.p022d.C1145b m4450a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.p022d.C1144a.m4443b(r4, r5, r0, r6)
            androidx.core.content.d.b r4 = m4452c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.p022d.C1151d.m4482b(r4, r5, r0, r6)
            androidx.core.content.d.b r4 = m4453d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p022d.C1145b.m4450a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.d.b");
    }

    /* renamed from: b */
    static C1145b m4451b(int i) {
        return new C1145b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C1145b m4452c(ColorStateList colorStateList) {
        return new C1145b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C1145b m4453d(Shader shader) {
        return new C1145b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C1145b m4454g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m4450a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo3621e() {
        return this.f3203c;
    }

    /* renamed from: f */
    public Shader mo3622f() {
        return this.f3201a;
    }

    /* renamed from: h */
    public boolean mo3623h() {
        return this.f3201a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f3202b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3624i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f3201a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f3202b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p022d.C1145b.mo3624i():boolean");
    }

    /* renamed from: j */
    public boolean mo3625j(int[] iArr) {
        if (mo3624i()) {
            ColorStateList colorStateList = this.f3202b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3203c) {
                this.f3203c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo3626k(int i) {
        this.f3203c = i;
    }

    /* renamed from: l */
    public boolean mo3627l() {
        return mo3623h() || this.f3203c != 0;
    }
}
