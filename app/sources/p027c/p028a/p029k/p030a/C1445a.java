package p027c.p028a.p029k.p030a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0247m0;
import androidx.core.content.C1135a;
import androidx.core.content.p022d.C1144a;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: c.a.k.a.a */
public final class C1445a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f4459a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C1446a>> f4460b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f4461c = new Object();

    /* renamed from: c.a.k.a.a$a */
    private static class C1446a {

        /* renamed from: a */
        final ColorStateList f4462a;

        /* renamed from: b */
        final Configuration f4463b;

        C1446a(ColorStateList colorStateList, Configuration configuration) {
            this.f4462a = colorStateList;
            this.f4463b = configuration;
        }
    }

    /* renamed from: a */
    private static void m6443a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f4461c) {
            WeakHashMap<Context, SparseArray<C1446a>> weakHashMap = f4460b;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C1446a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m6444b(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f4461c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<c.a.k.a.a$a>> r1 = f4460b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            c.a.k.a.a$a r2 = (p027c.p028a.p029k.p030a.C1445a.C1446a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f4463b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f4462a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p028a.p029k.p030a.C1445a.m6444b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m6445c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m6444b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m6448f(context, i);
        if (f == null) {
            return C1135a.m4418d(context, i);
        }
        m6443a(context, i, f);
        return f;
    }

    /* renamed from: d */
    public static Drawable m6446d(Context context, int i) {
        return C0247m0.m1250h().mo1514j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m6447e() {
        ThreadLocal<TypedValue> threadLocal = f4459a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m6448f(Context context, int i) {
        if (m6449g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C1144a.m4442a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m6449g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m6447e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
