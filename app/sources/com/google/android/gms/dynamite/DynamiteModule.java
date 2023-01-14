package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3760g;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;

public final class DynamiteModule {

    /* renamed from: a */
    public static final C3779b f10463a = new C3787f();

    /* renamed from: b */
    public static final C3779b f10464b = new C3788g();

    /* renamed from: c */
    public static final C3779b f10465c = new C3789h();

    /* renamed from: d */
    public static final C3779b f10466d = new C3790i();

    /* renamed from: e */
    public static final C3779b f10467e = new C3791j();

    /* renamed from: f */
    public static final C3779b f10468f = new C3792k();

    /* renamed from: g */
    private static Boolean f10469g = null;

    /* renamed from: h */
    private static String f10470h = null;

    /* renamed from: i */
    private static boolean f10471i = false;

    /* renamed from: j */
    private static int f10472j = -1;

    /* renamed from: k */
    private static final ThreadLocal<C3795n> f10473k = new ThreadLocal<>();

    /* renamed from: l */
    private static final ThreadLocal<Long> f10474l = new C3785d();

    /* renamed from: m */
    private static final C3779b.C3780a f10475m = new C3786e();

    /* renamed from: n */
    public static final C3779b f10476n = new C3793l();

    /* renamed from: o */
    private static C3798q f10477o;

    /* renamed from: p */
    private static C3799r f10478p;

    /* renamed from: q */
    private final Context f10479q;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C3778a extends Exception {
        /* synthetic */ C3778a(String str, C3797p pVar) {
            super(str);
        }

        /* synthetic */ C3778a(String str, Throwable th, C3797p pVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C3779b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C3780a {
            /* renamed from: a */
            int mo11740a(Context context, String str, boolean z);

            /* renamed from: b */
            int mo11741b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C3781b {

            /* renamed from: a */
            public int f10480a = 0;

            /* renamed from: b */
            public int f10481b = 0;

            /* renamed from: c */
            public int f10482c = 0;
        }

        /* renamed from: a */
        C3781b mo11739a(Context context, String str, C3780a aVar);
    }

    private DynamiteModule(Context context) {
        C3705r.m14346k(context);
        this.f10479q = context;
    }

    /* renamed from: a */
    public static int m14548a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C3697p.m14323b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: b */
    public static int m14549b(Context context, String str) {
        return m14551e(context, str, false);
    }

    /* renamed from: d */
    public static DynamiteModule m14550d(Context context, C3779b bVar, String str) {
        int i;
        ThreadLocal<Long> threadLocal;
        Boolean bool;
        DynamiteModule dynamiteModule;
        C6634a aVar;
        C3799r rVar;
        Boolean valueOf;
        C6634a aVar2;
        Context context2 = context;
        C3779b bVar2 = bVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<C3795n> threadLocal2 = f10473k;
        C3795n nVar = threadLocal2.get();
        C3795n nVar2 = new C3795n((C3794m) null);
        threadLocal2.set(nVar2);
        ThreadLocal<Long> threadLocal3 = f10474l;
        long longValue = threadLocal3.get().longValue();
        try {
            threadLocal3.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C3779b.C3781b a = bVar2.mo11739a(context2, str2, f10475m);
            int i2 = a.f10480a;
            int i3 = a.f10481b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a.f10482c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a.f10480a != 0) {
                        i4 = -1;
                    }
                }
                if (!(i4 == 1 && a.f10481b == 0)) {
                    if (i4 == -1) {
                        DynamiteModule g = m14553g(context2, str2);
                        if (longValue == 0) {
                            threadLocal3.remove();
                        } else {
                            threadLocal3.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = nVar2.f10485a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal2.set(nVar);
                        return g;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a.f10481b;
                            try {
                                synchronized (cls) {
                                    bool = f10469g;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str2);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (cls) {
                                            rVar = f10478p;
                                        }
                                        if (rVar != null) {
                                            C3795n nVar3 = threadLocal2.get();
                                            if (nVar3 == null || nVar3.f10485a == null) {
                                                throw new C3778a("No result cursor", (C3797p) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = nVar3.f10485a;
                                            C6636b.m25276Y(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f10472j >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVar2 = rVar.mo11752Y(C6636b.m25276Y(applicationContext), str2, i5, C6636b.m25276Y(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVar2 = rVar.mo11753m(C6636b.m25276Y(applicationContext), str2, i5, C6636b.m25276Y(cursor2));
                                            }
                                            Context context3 = (Context) C6636b.m25277m(aVar2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new C3778a("Failed to get module context", (C3797p) null);
                                            }
                                        } else {
                                            throw new C3778a("DynamiteLoaderV2 was not cached.", (C3797p) null);
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str2);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        Log.i("DynamiteModule", sb3.toString());
                                        C3798q j = m14556j(context);
                                        if (j != null) {
                                            int m = j.mo11751m();
                                            if (m >= 3) {
                                                C3795n nVar4 = threadLocal2.get();
                                                if (nVar4 != null) {
                                                    aVar = j.mo11747R0(C6636b.m25276Y(context), str2, i5, C6636b.m25276Y(nVar4.f10485a));
                                                } else {
                                                    throw new C3778a("No cached result cursor holder", (C3797p) null);
                                                }
                                            } else if (m == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVar = j.mo11748S0(C6636b.m25276Y(context), str2, i5);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVar = j.mo11746Q0(C6636b.m25276Y(context), str2, i5);
                                            }
                                            if (C6636b.m25277m(aVar) != null) {
                                                dynamiteModule = new DynamiteModule((Context) C6636b.m25277m(aVar));
                                            } else {
                                                throw new C3778a("Failed to load remote module.", (C3797p) null);
                                            }
                                        } else {
                                            throw new C3778a("Failed to create IDynamiteLoader.", (C3797p) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal3.remove();
                                    } else {
                                        threadLocal3.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = nVar2.f10485a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal2.set(nVar);
                                    return dynamiteModule;
                                }
                                throw new C3778a("Failed to determine which loading route to use.", (C3797p) null);
                            } catch (RemoteException e) {
                                throw new C3778a("Failed to load remote module.", e, (C3797p) null);
                            } catch (C3778a e2) {
                                throw e2;
                            } catch (Throwable th) {
                                C3760g.m14510a(context2, th);
                                throw new C3778a("Failed to load remote module.", th, (C3797p) null);
                            }
                        } catch (C3778a e3) {
                            String valueOf2 = String.valueOf(e3.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i6 = a.f10480a;
                            if (i6 != 0) {
                                if (bVar.mo11739a(context2, str2, new C3796o(i6, 0)).f10482c == -1) {
                                    DynamiteModule g2 = m14553g(context2, str2);
                                    if (i != 0) {
                                        threadLocal.set(Long.valueOf(longValue));
                                    }
                                    return g2;
                                }
                            }
                            throw new C3778a("Remote load failed. No local fallback found.", e3, (C3797p) null);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(i4);
                        throw new C3778a(sb4.toString(), (C3797p) null);
                    }
                }
            }
            int i7 = a.f10480a;
            int i8 = a.f10481b;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str2);
            sb5.append(" found. Local version is ");
            sb5.append(i7);
            sb5.append(" and remote version is ");
            sb5.append(i8);
            sb5.append(".");
            throw new C3778a(sb5.toString(), (C3797p) null);
        } finally {
            i = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
            threadLocal = f10474l;
            if (i == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = nVar2.f10485a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f10473k.set(nVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x003a=Splitter:B:18:0x003a, B:24:0x004a=Splitter:B:24:0x004a, B:43:0x008e=Splitter:B:43:0x008e} */
    /* renamed from: e */
    public static int m14551e(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r1 = f10469g     // Catch:{ all -> 0x01c1 }
            r2 = 0
            if (r1 != 0) goto L_0x00cf
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a3 }
            if (r4 != r1) goto L_0x0037
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x0037:
            m14554h(r4)     // Catch:{ a -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x003d:
            boolean r4 = f10471i     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x0099
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a3 }
            boolean r5 = r4.equals(r2)     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x004a
            goto L_0x0099
        L_0x004a:
            int r5 = m14552f(r9, r10, r11)     // Catch:{ a -> 0x0091 }
            java.lang.String r6 = f10470h     // Catch:{ a -> 0x0091 }
            if (r6 == 0) goto L_0x008e
            boolean r6 = r6.isEmpty()     // Catch:{ a -> 0x0091 }
            if (r6 == 0) goto L_0x0059
            goto L_0x008e
        L_0x0059:
            java.lang.ClassLoader r6 = com.google.android.gms.dynamite.C3783b.m14561a()     // Catch:{ a -> 0x0091 }
            if (r6 == 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0091 }
            r7 = 29
            if (r6 < r7) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0091 }
            java.lang.String r7 = f10470h     // Catch:{ a -> 0x0091 }
            com.google.android.gms.common.internal.C3705r.m14346k(r7)     // Catch:{ a -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ a -> 0x0091 }
            goto L_0x0083
        L_0x0075:
            com.google.android.gms.dynamite.c r6 = new com.google.android.gms.dynamite.c     // Catch:{ a -> 0x0091 }
            java.lang.String r7 = f10470h     // Catch:{ a -> 0x0091 }
            com.google.android.gms.common.internal.C3705r.m14346k(r7)     // Catch:{ a -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ a -> 0x0091 }
        L_0x0083:
            m14554h(r6)     // Catch:{ a -> 0x0091 }
            r1.set(r2, r6)     // Catch:{ a -> 0x0091 }
            f10469g = r4     // Catch:{ a -> 0x0091 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r5
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r5
        L_0x0091:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a3 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a3 }
            goto L_0x0033
        L_0x0099:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a3 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a3 }
            goto L_0x0033
        L_0x00a1:
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            goto L_0x00cd
        L_0x00a3:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            goto L_0x00ab
        L_0x00a8:
            r1 = move-exception
            goto L_0x00ab
        L_0x00aa:
            r1 = move-exception
        L_0x00ab:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c1 }
            int r4 = r1.length()     // Catch:{ all -> 0x01c1 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c1 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01c1 }
            r5.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01c1 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01c1 }
        L_0x00cd:
            f10469g = r1     // Catch:{ all -> 0x01c1 }
        L_0x00cf:
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c4 }
            r1 = 0
            if (r0 == 0) goto L_0x00fd
            int r9 = m14552f(r9, r10, r11)     // Catch:{ a -> 0x00dc }
            return r9
        L_0x00dc:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01c4 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01c4 }
            int r2 = r10.length()     // Catch:{ all -> 0x01c4 }
            if (r2 == 0) goto L_0x00f4
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01c4 }
            goto L_0x00f9
        L_0x00f4:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01c4 }
            r10.<init>(r0)     // Catch:{ all -> 0x01c4 }
        L_0x00f9:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01c4 }
            return r1
        L_0x00fd:
            com.google.android.gms.dynamite.q r3 = m14556j(r9)     // Catch:{ all -> 0x01c4 }
            if (r3 != 0) goto L_0x0105
            goto L_0x01b8
        L_0x0105:
            int r0 = r3.mo11751m()     // Catch:{ RemoteException -> 0x0192 }
            r4 = 3
            if (r0 < r4) goto L_0x016d
            java.lang.ThreadLocal<com.google.android.gms.dynamite.n> r0 = f10473k     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.gms.dynamite.n r0 = (com.google.android.gms.dynamite.C3795n) r0     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x0120
            android.database.Cursor r0 = r0.f10485a     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x0120
            int r1 = r0.getInt(r1)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b8
        L_0x0120:
            e.f.a.c.d.a r4 = p174e.p319f.p320a.p335c.p343d.C6636b.m25276Y(r9)     // Catch:{ RemoteException -> 0x0192 }
            java.lang.ThreadLocal<java.lang.Long> r0 = f10474l     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0192 }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x0192 }
            r5 = r10
            r6 = r11
            e.f.a.c.d.a r10 = r3.mo11749T0(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = p174e.p319f.p320a.p335c.p343d.C6636b.m25277m(r10)     // Catch:{ RemoteException -> 0x0192 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x0192 }
            if (r10 == 0) goto L_0x015a
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r11 != 0) goto L_0x0145
            goto L_0x015a
        L_0x0145:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r11 <= 0) goto L_0x0152
            boolean r0 = m14555i(r10)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r0 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r2 = r10
        L_0x0153:
            if (r2 == 0) goto L_0x0158
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x0158:
            r1 = r11
            goto L_0x01b8
        L_0x015a:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r10 == 0) goto L_0x01b8
            r10.close()     // Catch:{ all -> 0x01c4 }
            goto L_0x01b8
        L_0x0167:
            r11 = move-exception
            r2 = r10
            goto L_0x01bb
        L_0x016a:
            r11 = move-exception
            r2 = r10
            goto L_0x0194
        L_0x016d:
            r4 = 2
            if (r0 != r4) goto L_0x0180
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0192 }
            e.f.a.c.d.a r0 = p174e.p319f.p320a.p335c.p343d.C6636b.m25276Y(r9)     // Catch:{ RemoteException -> 0x0192 }
            int r1 = r3.mo11745P0(r0, r10, r11)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b8
        L_0x0180:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0192 }
            e.f.a.c.d.a r0 = p174e.p319f.p320a.p335c.p343d.C6636b.m25276Y(r9)     // Catch:{ RemoteException -> 0x0192 }
            int r1 = r3.mo11750Y(r0, r10, r11)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b8
        L_0x0190:
            r11 = r10
            goto L_0x01bb
        L_0x0192:
            r10 = move-exception
            r11 = r10
        L_0x0194:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            int r3 = r11.length()     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x01ab
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x01b9 }
            goto L_0x01b0
        L_0x01ab:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x01b9 }
            r11.<init>(r0)     // Catch:{ all -> 0x01b9 }
        L_0x01b0:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x01b8
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x01b8:
            return r1
        L_0x01b9:
            r10 = move-exception
            goto L_0x0190
        L_0x01bb:
            if (r2 == 0) goto L_0x01c0
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x01c0:
            throw r11     // Catch:{ all -> 0x01c4 }
        L_0x01c1:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            throw r10     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r10 = move-exception
            com.google.android.gms.common.util.C3760g.m14510a(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m14551e(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14552f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = f10474l     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r12.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r10 == 0) goto L_0x00a0
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009e }
            if (r11 == 0) goto L_0x00a0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009e }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009e }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f10470h = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f10472j = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f10471i = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m14555i(r10)     // Catch:{ Exception -> 0x009e }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x008e:
            if (r11 != 0) goto L_0x0096
            if (r10 == 0) goto L_0x0095
            r10.close()
        L_0x0095:
            return r12
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            r11 = move-exception
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009e }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x00af:
            r10 = move-exception
            r11 = r10
            goto L_0x00c4
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.C3778a     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x00ba
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00ba:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch:{ all -> 0x00c2 }
            throw r12     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r11 = move-exception
            r0 = r10
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m14552f(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: g */
    private static DynamiteModule m14553g(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: h */
    private static void m14554h(ClassLoader classLoader) {
        C3799r rVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                rVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                rVar = queryLocalInterface instanceof C3799r ? (C3799r) queryLocalInterface : new C3799r(iBinder);
            }
            f10478p = rVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C3778a("Failed to instantiate dynamite loader", e, (C3797p) null);
        }
    }

    /* renamed from: i */
    private static boolean m14555i(Cursor cursor) {
        C3795n nVar = f10473k.get();
        if (nVar == null || nVar.f10485a != null) {
            return false;
        }
        nVar.f10485a = cursor;
        return true;
    }

    /* renamed from: j */
    private static C3798q m14556j(Context context) {
        C3798q qVar;
        synchronized (DynamiteModule.class) {
            C3798q qVar2 = f10477o;
            if (qVar2 != null) {
                return qVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    qVar = queryLocalInterface instanceof C3798q ? (C3798q) queryLocalInterface : new C3798q(iBinder);
                }
                if (qVar != null) {
                    f10477o = qVar;
                    return qVar;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    /* renamed from: c */
    public IBinder mo11738c(String str) {
        try {
            return (IBinder) this.f10479q.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C3778a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C3797p) null);
        }
    }
}
