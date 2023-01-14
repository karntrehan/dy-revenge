package p174e.p319f.p320a.p363d.p379x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: e.f.a.d.x.c */
public class C9062c {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = r2.getColor(r3, -1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m30197a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p027c.p028a.p029k.p030a.C1445a.m6445c(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 15
            if (r1 > r0) goto L_0x0026
            r1 = -1
            int r0 = r2.getColor(r3, r1)
            if (r0 == r1) goto L_0x0026
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            return r1
        L_0x0026:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = r2.mo1785b(r3, -1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m30198b(android.content.Context r1, androidx.appcompat.widget.C0292x0 r2, int r3) {
        /*
            boolean r0 = r2.mo1802s(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.mo1797n(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p027c.p028a.p029k.p030a.C1445a.m6445c(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 15
            if (r1 > r0) goto L_0x0026
            r1 = -1
            int r0 = r2.mo1785b(r3, r1)
            if (r0 == r1) goto L_0x0026
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            return r1
        L_0x0026:
            android.content.res.ColorStateList r1 = r2.mo1786c(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p379x.C9062c.m30198b(android.content.Context, androidx.appcompat.widget.x0, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static int m30199c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p027c.p028a.p029k.p030a.C1445a.m6446d(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m30200d(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = p027c.p028a.p029k.p030a.C1445a.m6446d(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p379x.C9062c.m30200d(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    static int m30201e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C9063d m30202f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C9063d(context, resourceId);
    }
}
