package androidx.core.content.p022d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.C1173d;
import androidx.core.util.C1177h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.d.f */
public final class C1154f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3217a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C1156b, SparseArray<C1155a>> f3218b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3219c = new Object();

    /* renamed from: androidx.core.content.d.f$a */
    private static class C1155a {

        /* renamed from: a */
        final ColorStateList f3220a;

        /* renamed from: b */
        final Configuration f3221b;

        C1155a(ColorStateList colorStateList, Configuration configuration) {
            this.f3220a = colorStateList;
            this.f3221b = configuration;
        }
    }

    /* renamed from: androidx.core.content.d.f$b */
    private static final class C1156b {

        /* renamed from: a */
        final Resources f3222a;

        /* renamed from: b */
        final Resources.Theme f3223b;

        C1156b(Resources resources, Resources.Theme theme) {
            this.f3222a = resources;
            this.f3223b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1156b.class != obj.getClass()) {
                return false;
            }
            C1156b bVar = (C1156b) obj;
            return this.f3222a.equals(bVar.f3222a) && C1173d.m4572a(this.f3223b, bVar.f3223b);
        }

        public int hashCode() {
            return C1173d.m4573b(this.f3222a, this.f3223b);
        }
    }

    /* renamed from: androidx.core.content.d.f$c */
    public static abstract class C1157c {

        /* renamed from: androidx.core.content.d.f$c$a */
        class C1158a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f3224f;

            C1158a(Typeface typeface) {
                this.f3224f = typeface;
            }

            public void run() {
                C1157c.this.mo1827e(this.f3224f);
            }
        }

        /* renamed from: androidx.core.content.d.f$c$b */
        class C1159b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f3226f;

            C1159b(int i) {
                this.f3226f = i;
            }

            public void run() {
                C1157c.this.mo1826d(this.f3226f);
            }
        }

        /* renamed from: c */
        public static Handler m4501c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void mo3641a(int i, Handler handler) {
            m4501c(handler).post(new C1159b(i));
        }

        /* renamed from: b */
        public final void mo3642b(Typeface typeface, Handler handler) {
            m4501c(handler).post(new C1158a(typeface));
        }

        /* renamed from: d */
        public abstract void mo1826d(int i);

        /* renamed from: e */
        public abstract void mo1827e(Typeface typeface);
    }

    /* renamed from: androidx.core.content.d.f$d */
    public static final class C1160d {

        /* renamed from: androidx.core.content.d.f$d$a */
        static class C1161a {

            /* renamed from: a */
            private static final Object f3228a = new Object();

            /* renamed from: b */
            private static Method f3229b;

            /* renamed from: c */
            private static boolean f3230c;

            /* renamed from: a */
            static void m4507a(Resources.Theme theme) {
                synchronized (f3228a) {
                    if (!f3230c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3229b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f3230c = true;
                    }
                    Method method = f3229b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f3229b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.d.f$d$b */
        static class C1162b {
            /* renamed from: a */
            static void m4508a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m4506a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C1162b.m4508a(theme);
            } else if (i >= 23) {
                C1161a.m4507a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m4488a(C1156b bVar, int i, ColorStateList colorStateList) {
        synchronized (f3219c) {
            WeakHashMap<C1156b, SparseArray<C1155a>> weakHashMap = f3218b;
            SparseArray sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i, new C1155a(colorStateList, bVar.f3222a.getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m4489b(androidx.core.content.p022d.C1154f.C1156b r4, int r5) {
        /*
            java.lang.Object r0 = f3219c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.d.f$b, android.util.SparseArray<androidx.core.content.d.f$a>> r1 = f3218b     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0033 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0030
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 <= 0) goto L_0x0030
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0033 }
            androidx.core.content.d.f$a r2 = (androidx.core.content.p022d.C1154f.C1155a) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0030
            android.content.res.Configuration r3 = r2.f3221b     // Catch:{ all -> 0x0033 }
            android.content.res.Resources r4 = r4.f3222a     // Catch:{ all -> 0x0033 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0033 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002d
            android.content.res.ColorStateList r4 = r2.f3220a     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002d:
            r1.remove(r5)     // Catch:{ all -> 0x0033 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            r4 = 0
            return r4
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p022d.C1154f.m4489b(androidx.core.content.d.f$b, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static int m4490c(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    /* renamed from: d */
    public static ColorStateList m4491d(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        C1156b bVar = new C1156b(resources, theme);
        ColorStateList b = m4489b(bVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList j = m4497j(resources, i, theme);
        if (j == null) {
            return resources.getColorStateList(i);
        }
        m4488a(bVar, i, j);
        return j;
    }

    /* renamed from: e */
    public static Drawable m4492e(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: f */
    public static Typeface m4493f(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m4499l(context, i, new TypedValue(), 0, (C1157c) null, (Handler) null, false, false);
    }

    /* renamed from: g */
    public static Typeface m4494g(Context context, int i, TypedValue typedValue, int i2, C1157c cVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m4499l(context, i, typedValue, i2, cVar, (Handler) null, true, false);
    }

    /* renamed from: h */
    public static void m4495h(Context context, int i, C1157c cVar, Handler handler) {
        C1177h.m4583e(cVar);
        if (context.isRestricted()) {
            cVar.mo3641a(-4, handler);
            return;
        }
        m4499l(context, i, new TypedValue(), 0, cVar, handler, false, false);
    }

    /* renamed from: i */
    private static TypedValue m4496i() {
        ThreadLocal<TypedValue> threadLocal = f3217a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: j */
    private static ColorStateList m4497j(Resources resources, int i, Resources.Theme theme) {
        if (m4498k(resources, i)) {
            return null;
        }
        try {
            return C1144a.m4442a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: k */
    private static boolean m4498k(Resources resources, int i) {
        TypedValue i2 = m4496i();
        resources.getValue(i, i2, true);
        int i3 = i2.type;
        return i3 >= 28 && i3 <= 31;
    }

    /* renamed from: l */
    private static Typeface m4499l(Context context, int i, TypedValue typedValue, int i2, C1157c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface m = m4500m(context, resources, typedValue, i, i2, cVar, handler, z, z2);
        if (m != null || cVar != null || z2) {
            return m;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m4500m(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p022d.C1154f.C1157c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x009d
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo3641a(r13, r10)
        L_0x0025:
            return r14
        L_0x0026:
            android.graphics.Typeface r1 = p027c.p064i.p065d.C1832d.m7785f(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo3642b(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            if (r1 == 0) goto L_0x0068
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            androidx.core.content.d.c$a r2 = androidx.core.content.p022d.C1146c.m4463b(r1, r0)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x0056
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0055
            r9.mo3641a(r13, r10)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
        L_0x0055:
            return r14
        L_0x0056:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p027c.p064i.p065d.C1832d.m7782c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            return r0
        L_0x0068:
            r1 = r15
            android.graphics.Typeface r0 = p027c.p064i.p065d.C1832d.m7783d(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            if (r9 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0075
            r9.mo3642b(r0, r10)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
            goto L_0x0078
        L_0x0075:
            r9.mo3641a(r13, r10)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0079 }
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x008a
        L_0x0082:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x008a:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L_0x009c
            r9.mo3641a(r13, r10)
        L_0x009c:
            return r14
        L_0x009d:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p022d.C1154f.m4500m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.d.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
