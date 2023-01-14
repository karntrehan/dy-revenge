package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p022d.C1154f;

/* renamed from: androidx.appcompat.widget.x0 */
public class C0292x0 {

    /* renamed from: a */
    private final Context f1244a;

    /* renamed from: b */
    private final TypedArray f1245b;

    /* renamed from: c */
    private TypedValue f1246c;

    private C0292x0(Context context, TypedArray typedArray) {
        this.f1244a = context;
        this.f1245b = typedArray;
    }

    /* renamed from: t */
    public static C0292x0 m1405t(Context context, int i, int[] iArr) {
        return new C0292x0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0292x0 m1406u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0292x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0292x0 m1407v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0292x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo1784a(int i, boolean z) {
        return this.f1245b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo1785b(int i, int i2) {
        return this.f1245b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p027c.p028a.p029k.p030a.C1445a.m6445c(r2.f1244a, (r0 = r2.f1245b.getResourceId(r3, 0)));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo1786c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1245b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1245b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1244a
            android.content.res.ColorStateList r0 = p027c.p028a.p029k.p030a.C1445a.m6445c(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1245b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0292x0.mo1786c(int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    public float mo1787d(int i, float f) {
        return this.f1245b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo1788e(int i, int i2) {
        return this.f1245b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo1789f(int i, int i2) {
        return this.f1245b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1245b.getResourceId(r3, 0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo1790g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1245b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1245b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1244a
            android.graphics.drawable.Drawable r3 = p027c.p028a.p029k.p030a.C1445a.m6446d(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1245b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0292x0.mo1790g(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: h */
    public Drawable mo1791h(int i) {
        int resourceId;
        if (!this.f1245b.hasValue(i) || (resourceId = this.f1245b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0231j.m1178b().mo1443d(this.f1244a, resourceId, true);
    }

    /* renamed from: i */
    public float mo1792i(int i, float f) {
        return this.f1245b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo1793j(int i, int i2, C1154f.C1157c cVar) {
        int resourceId = this.f1245b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1246c == null) {
            this.f1246c = new TypedValue();
        }
        return C1154f.m4494g(this.f1244a, resourceId, this.f1246c, i2, cVar);
    }

    /* renamed from: k */
    public int mo1794k(int i, int i2) {
        return this.f1245b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo1795l(int i, int i2) {
        return this.f1245b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo1796m(int i, int i2) {
        return this.f1245b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo1797n(int i, int i2) {
        return this.f1245b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo1798o(int i) {
        return this.f1245b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo1799p(int i) {
        return this.f1245b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo1800q(int i) {
        return this.f1245b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo1801r() {
        return this.f1245b;
    }

    /* renamed from: s */
    public boolean mo1802s(int i) {
        return this.f1245b.hasValue(i);
    }

    /* renamed from: w */
    public void mo1803w() {
        this.f1245b.recycle();
    }
}
