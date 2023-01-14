package p174e.p247e.p274h.p275a.p276a;

import android.content.Context;
import p174e.p247e.p274h.p288i.C6242f;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p302f.C6331i;
import p174e.p247e.p294k.p302f.C6341l;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.a.a.c */
public class C6142c {

    /* renamed from: a */
    private static final Class<?> f16827a = C6142c.class;

    /* renamed from: b */
    private static C6146f f16828b = null;

    /* renamed from: c */
    private static volatile boolean f16829c = false;

    private C6142c() {
    }

    /* renamed from: a */
    public static C6327h m23126a() {
        return m23127b().mo18805j();
    }

    /* renamed from: b */
    public static C6341l m23127b() {
        return C6341l.m24151l();
    }

    /* renamed from: c */
    public static void m23128c(Context context, C6331i iVar) {
        m23129d(context, iVar, (C6141b) null);
    }

    /* renamed from: d */
    public static void m23129d(Context context, C6331i iVar, C6141b bVar) {
        m23130e(context, iVar, bVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (p174e.p247e.p294k.p312p.C6394b.m24481d() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.facebook.soloader.p127o.C3291a.m12873b(new com.facebook.soloader.p127o.C3293c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (p174e.p247e.p294k.p312p.C6394b.m24481d() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.facebook.soloader.p127o.C3291a.m12873b(new com.facebook.soloader.p127o.C3293c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (p174e.p247e.p294k.p312p.C6394b.m24481d() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        com.facebook.soloader.p127o.C3291a.m12873b(new com.facebook.soloader.p127o.C3293c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (p174e.p247e.p294k.p312p.C6394b.m24481d() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        com.facebook.soloader.p127o.C3291a.m12873b(new com.facebook.soloader.p127o.C3293c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (p174e.p247e.p294k.p312p.C6394b.m24481d() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        p174e.p247e.p294k.p312p.C6394b.m24479b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (p174e.p247e.p294k.p312p.C6394b.m24481d() != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        p174e.p247e.p294k.p312p.C6394b.m24479b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x0052, B:22:0x0061, B:26:0x0070, B:30:0x007f] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0061 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0070=Splitter:B:26:0x0070, B:22:0x0061=Splitter:B:22:0x0061, B:18:0x0052=Splitter:B:18:0x0052, B:30:0x007f=Splitter:B:30:0x007f} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23130e(android.content.Context r5, p174e.p247e.p294k.p302f.C6331i r6, p174e.p247e.p274h.p275a.p276a.C6141b r7, boolean r8) {
        /*
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Fresco#initialize"
            p174e.p247e.p294k.p312p.C6394b.m24478a(r0)
        L_0x000b:
            boolean r0 = f16829c
            r1 = 1
            if (r0 == 0) goto L_0x0018
            java.lang.Class<?> r0 = f16827a
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            p174e.p247e.p253d.p258e.C6071a.m22855C(r0, r2)
            goto L_0x001a
        L_0x0018:
            f16829c = r1
        L_0x001a:
            p174e.p247e.p294k.p302f.C6342m.m24170b(r8)
            boolean r8 = com.facebook.soloader.p127o.C3291a.m12874c()
            if (r8 != 0) goto L_0x009b
            boolean r8 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r8 == 0) goto L_0x002e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            p174e.p247e.p294k.p312p.C6394b.m24478a(r8)
        L_0x002e:
            java.lang.String r8 = "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            r1[r4] = r5     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            r8.invoke(r0, r1)     // Catch:{ ClassNotFoundException -> 0x007f, IllegalAccessException -> 0x0070, InvocationTargetException -> 0x0061, NoSuchMethodException -> 0x0052 }
            boolean r8 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r8 == 0) goto L_0x009b
            goto L_0x008d
        L_0x0050:
            r5 = move-exception
            goto L_0x0091
        L_0x0052:
            com.facebook.soloader.o.c r8 = new com.facebook.soloader.o.c     // Catch:{ all -> 0x0050 }
            r8.<init>()     // Catch:{ all -> 0x0050 }
            com.facebook.soloader.p127o.C3291a.m12873b(r8)     // Catch:{ all -> 0x0050 }
            boolean r8 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r8 == 0) goto L_0x009b
            goto L_0x008d
        L_0x0061:
            com.facebook.soloader.o.c r8 = new com.facebook.soloader.o.c     // Catch:{ all -> 0x0050 }
            r8.<init>()     // Catch:{ all -> 0x0050 }
            com.facebook.soloader.p127o.C3291a.m12873b(r8)     // Catch:{ all -> 0x0050 }
            boolean r8 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r8 == 0) goto L_0x009b
            goto L_0x008d
        L_0x0070:
            com.facebook.soloader.o.c r8 = new com.facebook.soloader.o.c     // Catch:{ all -> 0x0050 }
            r8.<init>()     // Catch:{ all -> 0x0050 }
            com.facebook.soloader.p127o.C3291a.m12873b(r8)     // Catch:{ all -> 0x0050 }
            boolean r8 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r8 == 0) goto L_0x009b
            goto L_0x008d
        L_0x007f:
            com.facebook.soloader.o.c r8 = new com.facebook.soloader.o.c     // Catch:{ all -> 0x0050 }
            r8.<init>()     // Catch:{ all -> 0x0050 }
            com.facebook.soloader.p127o.C3291a.m12873b(r8)     // Catch:{ all -> 0x0050 }
            boolean r8 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r8 == 0) goto L_0x009b
        L_0x008d:
            p174e.p247e.p294k.p312p.C6394b.m24479b()
            goto L_0x009b
        L_0x0091:
            boolean r6 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r6 == 0) goto L_0x009a
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x009a:
            throw r5
        L_0x009b:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto L_0x00a5
            p174e.p247e.p294k.p302f.C6341l.m24155u(r5)
            goto L_0x00a8
        L_0x00a5:
            p174e.p247e.p294k.p302f.C6341l.m24156v(r6)
        L_0x00a8:
            m23131f(r5, r7)
            boolean r5 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r5 == 0) goto L_0x00b4
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p275a.p276a.C6142c.m23130e(android.content.Context, e.e.k.f.i, e.e.h.a.a.b, boolean):void");
    }

    /* renamed from: f */
    private static void m23131f(Context context, C6141b bVar) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("Fresco.initializeDrawee");
        }
        C6146f fVar = new C6146f(context, bVar);
        f16828b = fVar;
        C6242f.m23671g(fVar);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: g */
    public static C6144e m23132g() {
        return f16828b.get();
    }
}
