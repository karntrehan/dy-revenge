package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.p127o.C3291a;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    static final boolean f9234a;

    /* renamed from: b */
    static C3281k f9235b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f9236c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static C3282l[] f9237d = null;

    /* renamed from: e */
    private static volatile int f9238e = 0;

    /* renamed from: f */
    private static C3284n[] f9239f;

    /* renamed from: g */
    private static C3262b f9240g;

    /* renamed from: h */
    private static final HashSet<String> f9241h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f9242i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f9243j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static C3283m f9244k = null;

    /* renamed from: l */
    private static int f9245l;

    /* renamed from: m */
    private static boolean f9246m;

    @C3264d
    @TargetApi(14)
    private static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m12791a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    static class C3258a implements C3281k {

        /* renamed from: a */
        final /* synthetic */ boolean f9247a;

        /* renamed from: b */
        final /* synthetic */ String f9248b;

        /* renamed from: c */
        final /* synthetic */ String f9249c;

        /* renamed from: d */
        final /* synthetic */ Runtime f9250d;

        /* renamed from: e */
        final /* synthetic */ Method f9251e;

        C3258a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f9247a = z;
            this.f9248b = str;
            this.f9249c = str2;
            this.f9250d = runtime;
            this.f9251e = method;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            throw r0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m12792b(java.lang.String r7) {
            /*
                r6 = this;
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0.<init>(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.lang.String r7 = "MD5"
                java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0 = 4096(0x1000, float:5.74E-42)
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            L_0x0014:
                int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                r3 = 0
                if (r2 <= 0) goto L_0x001f
                r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                goto L_0x0014
            L_0x001f:
                java.lang.String r0 = "%32x"
                r2 = 1
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                r4[r3] = r5     // Catch:{ all -> 0x0037 }
                java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                goto L_0x0054
            L_0x0037:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r0 = move-exception
                r1.close()     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r1 = move-exception
                r7.addSuppressed(r1)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
            L_0x0042:
                throw r0     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
            L_0x0043:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x0049:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x004f:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
            L_0x0054:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C3258a.m12792b(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v10 */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + m12792b(r9) + " search path is " + r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10722a(java.lang.String r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.f9247a
                if (r0 == 0) goto L_0x00c9
                r0 = 4
                r10 = r10 & r0
                r1 = 1
                r2 = 0
                if (r10 != r0) goto L_0x000c
                r10 = 1
                goto L_0x000d
            L_0x000c:
                r10 = 0
            L_0x000d:
                if (r10 == 0) goto L_0x0012
                java.lang.String r10 = r8.f9248b
                goto L_0x0014
            L_0x0012:
                java.lang.String r10 = r8.f9249c
            L_0x0014:
                r0 = 0
                java.lang.Runtime r3 = r8.f9250d     // Catch:{ IllegalAccessException -> 0x0080, IllegalArgumentException -> 0x007e, InvocationTargetException -> 0x007c, all -> 0x0077 }
                monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0080, IllegalArgumentException -> 0x007e, InvocationTargetException -> 0x007c, all -> 0x0077 }
                java.lang.reflect.Method r4 = r8.f9251e     // Catch:{ all -> 0x0069 }
                java.lang.Runtime r5 = r8.f9250d     // Catch:{ all -> 0x0069 }
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0069 }
                r6[r2] = r9     // Catch:{ all -> 0x0069 }
                java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0069 }
                r6[r1] = r2     // Catch:{ all -> 0x0069 }
                r1 = 2
                r6[r1] = r10     // Catch:{ all -> 0x0069 }
                java.lang.Object r1 = r4.invoke(r5, r6)     // Catch:{ all -> 0x0069 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0069 }
                if (r1 != 0) goto L_0x0063
                monitor-exit(r3)     // Catch:{ all -> 0x0075 }
                if (r1 == 0) goto L_0x00cc
                java.lang.String r0 = "SoLoader"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error when loading lib: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " lib hash: "
                r2.append(r1)
                java.lang.String r9 = r8.m12792b(r9)
                r2.append(r9)
                java.lang.String r9 = " search path is "
                r2.append(r9)
                r2.append(r10)
                java.lang.String r9 = r2.toString()
                android.util.Log.e(r0, r9)
                goto L_0x00cc
            L_0x0063:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0075 }
                r0.<init>(r1)     // Catch:{ all -> 0x0075 }
                throw r0     // Catch:{ all -> 0x0075 }
            L_0x0069:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
            L_0x006d:
                monitor-exit(r3)     // Catch:{ all -> 0x0075 }
                throw r0     // Catch:{ IllegalAccessException -> 0x0073, IllegalArgumentException -> 0x0071, InvocationTargetException -> 0x006f }
            L_0x006f:
                r0 = move-exception
                goto L_0x0084
            L_0x0071:
                r0 = move-exception
                goto L_0x0084
            L_0x0073:
                r0 = move-exception
                goto L_0x0084
            L_0x0075:
                r0 = move-exception
                goto L_0x006d
            L_0x0077:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x009c
            L_0x007c:
                r1 = move-exception
                goto L_0x0081
            L_0x007e:
                r1 = move-exception
                goto L_0x0081
            L_0x0080:
                r1 = move-exception
            L_0x0081:
                r7 = r1
                r1 = r0
                r0 = r7
            L_0x0084:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
                r2.<init>()     // Catch:{ all -> 0x009b }
                java.lang.String r3 = "Error: Cannot load "
                r2.append(r3)     // Catch:{ all -> 0x009b }
                r2.append(r9)     // Catch:{ all -> 0x009b }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x009b }
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x009b }
                r2.<init>(r1, r0)     // Catch:{ all -> 0x009b }
                throw r2     // Catch:{ all -> 0x009b }
            L_0x009b:
                r0 = move-exception
            L_0x009c:
                if (r1 == 0) goto L_0x00c8
                java.lang.String r2 = "SoLoader"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error when loading lib: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " lib hash: "
                r3.append(r1)
                java.lang.String r9 = r8.m12792b(r9)
                r3.append(r9)
                java.lang.String r9 = " search path is "
                r3.append(r9)
                r3.append(r10)
                java.lang.String r9 = r3.toString()
                android.util.Log.e(r2, r9)
            L_0x00c8:
                throw r0
            L_0x00c9:
                java.lang.System.load(r9)
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C3258a.mo10722a(java.lang.String, int):void");
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$b */
    public static final class C3259b extends UnsatisfiedLinkError {
        C3259b(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.m12801h()) + " error: " + str);
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f9234a = z;
    }

    /* renamed from: a */
    private static void m12773a() {
        if (!m12781i()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    /* renamed from: b */
    private static boolean m12774b(Context context, int i) {
        return ((i & 32) != 0 || context == null || (context.getApplicationInfo().flags & 129) == 0) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0131  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12775c(java.lang.String r12, int r13, android.os.StrictMode.ThreadPolicy r14) {
        /*
            java.lang.String r0 = " result: "
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f9236c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.lock()
            com.facebook.soloader.l[] r2 = f9237d     // Catch:{ all -> 0x0184 }
            java.lang.String r3 = "couldn't find DSO to load: "
            java.lang.String r4 = "SoLoader"
            if (r2 == 0) goto L_0x0156
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.unlock()
            r2 = 1
            r5 = 0
            if (r14 != 0) goto L_0x0024
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskReads()
            r6 = 1
            goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            boolean r7 = f9234a
            if (r7 == 0) goto L_0x0030
            java.lang.String r7 = "SoLoader.loadLibrary["
            java.lang.String r8 = "]"
            com.facebook.soloader.Api18TraceUtils.m12771a(r7, r12, r8)
        L_0x0030:
            r7 = 3
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ all -> 0x010d }
            r1.lock()     // Catch:{ all -> 0x010d }
            r1 = 0
            r8 = 0
        L_0x003a:
            if (r1 != 0) goto L_0x0086
            com.facebook.soloader.l[] r9 = f9237d     // Catch:{ all -> 0x007a }
            int r10 = r9.length     // Catch:{ all -> 0x007a }
            if (r8 >= r10) goto L_0x0086
            r9 = r9[r8]     // Catch:{ all -> 0x007a }
            int r1 = r9.mo10726a(r12, r13, r14)     // Catch:{ all -> 0x007a }
            if (r1 != r7) goto L_0x0077
            com.facebook.soloader.n[] r9 = f9239f     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x0077
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r8.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r9 = "Trying backup SoSource for "
            r8.append(r9)     // Catch:{ all -> 0x007a }
            r8.append(r12)     // Catch:{ all -> 0x007a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x007a }
            android.util.Log.d(r4, r8)     // Catch:{ all -> 0x007a }
            com.facebook.soloader.n[] r8 = f9239f     // Catch:{ all -> 0x007a }
            int r9 = r8.length     // Catch:{ all -> 0x007a }
            r10 = 0
        L_0x0065:
            if (r10 >= r9) goto L_0x0086
            r11 = r8[r10]     // Catch:{ all -> 0x007a }
            r11.mo10744o(r12)     // Catch:{ all -> 0x007a }
            int r11 = r11.mo10726a(r12, r13, r14)     // Catch:{ all -> 0x007a }
            if (r11 != r2) goto L_0x0074
            r1 = r11
            goto L_0x0086
        L_0x0074:
            int r10 = r10 + 1
            goto L_0x0065
        L_0x0077:
            int r8 = r8 + 1
            goto L_0x003a
        L_0x007a:
            r13 = move-exception
            r5 = r1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f9236c     // Catch:{ all -> 0x010d }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ all -> 0x010d }
            r1.unlock()     // Catch:{ all -> 0x010d }
            throw r13     // Catch:{ all -> 0x010d }
        L_0x0086:
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = f9236c     // Catch:{ all -> 0x010a }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r13.readLock()     // Catch:{ all -> 0x010a }
            r2.unlock()     // Catch:{ all -> 0x010a }
            boolean r2 = f9234a
            if (r2 == 0) goto L_0x0096
            com.facebook.soloader.Api18TraceUtils.m12772b()
        L_0x0096:
            if (r6 == 0) goto L_0x009b
            android.os.StrictMode.setThreadPolicy(r14)
        L_0x009b:
            if (r1 == 0) goto L_0x009f
            if (r1 != r7) goto L_0x011f
        L_0x009f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            r14.append(r12)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r13.readLock()
            r12.lock()
        L_0x00b1:
            com.facebook.soloader.l[] r12 = f9237d
            int r12 = r12.length
            if (r5 >= r12) goto L_0x00d1
            java.lang.String r12 = "\n\tSoSource "
            r14.append(r12)
            r14.append(r5)
            java.lang.String r12 = ": "
            r14.append(r12)
            com.facebook.soloader.l[] r12 = f9237d
            r12 = r12[r5]
            java.lang.String r12 = r12.toString()
            r14.append(r12)
            int r5 = r5 + 1
            goto L_0x00b1
        L_0x00d1:
            com.facebook.soloader.b r12 = f9240g
            if (r12 == 0) goto L_0x00ee
            android.content.Context r12 = r12.mo10730f()
            java.io.File r12 = com.facebook.soloader.C3262b.m12808e(r12)
            java.lang.String r13 = "\n\tNative lib dir: "
            r14.append(r13)
            java.lang.String r12 = r12.getAbsolutePath()
            r14.append(r12)
            java.lang.String r12 = "\n"
            r14.append(r12)
        L_0x00ee:
            java.util.concurrent.locks.ReentrantReadWriteLock r12 = f9236c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r12.readLock()
            r12.unlock()
            r14.append(r0)
            r14.append(r1)
            java.lang.String r12 = r14.toString()
            android.util.Log.e(r4, r12)
            java.lang.UnsatisfiedLinkError r13 = new java.lang.UnsatisfiedLinkError
            r13.<init>(r12)
            throw r13
        L_0x010a:
            r13 = move-exception
            r5 = r1
            goto L_0x010e
        L_0x010d:
            r13 = move-exception
        L_0x010e:
            boolean r1 = f9234a
            if (r1 == 0) goto L_0x0115
            com.facebook.soloader.Api18TraceUtils.m12772b()
        L_0x0115:
            if (r6 == 0) goto L_0x011a
            android.os.StrictMode.setThreadPolicy(r14)
        L_0x011a:
            if (r5 == 0) goto L_0x0120
            if (r5 != r7) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            return
        L_0x0120:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            r14.append(r12)
            java.lang.String r12 = r13.getMessage()
            if (r12 != 0) goto L_0x0135
            java.lang.String r12 = r13.toString()
        L_0x0135:
            java.lang.String r1 = " caused by: "
            r14.append(r1)
            r14.append(r12)
            r13.printStackTrace()
            r14.append(r0)
            r14.append(r5)
            java.lang.String r12 = r14.toString()
            android.util.Log.e(r4, r12)
            java.lang.UnsatisfiedLinkError r14 = new java.lang.UnsatisfiedLinkError
            r14.<init>(r12)
            r14.initCause(r13)
            throw r14
        L_0x0156:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r13.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = "Could not load: "
            r13.append(r14)     // Catch:{ all -> 0x0184 }
            r13.append(r12)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = " because no SO source exists"
            r13.append(r14)     // Catch:{ all -> 0x0184 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0184 }
            android.util.Log.e(r4, r13)     // Catch:{ all -> 0x0184 }
            java.lang.UnsatisfiedLinkError r13 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r14.<init>()     // Catch:{ all -> 0x0184 }
            r14.append(r3)     // Catch:{ all -> 0x0184 }
            r14.append(r12)     // Catch:{ all -> 0x0184 }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x0184 }
            r13.<init>(r12)     // Catch:{ all -> 0x0184 }
            throw r13     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r12 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = f9236c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r13.readLock()
            r13.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m12775c(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    /* renamed from: d */
    private static Method m12776d() {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{cls, ClassLoader.class, cls});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static void m12777e(Context context, int i, C3281k kVar) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            f9246m = m12774b(context, i);
            m12779g(kVar);
            m12780h(context, i, kVar);
            C3291a.m12873b(new C3280j());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: f */
    public static void m12778f(Context context, boolean z) {
        try {
            init(context, z ? 1 : 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    private static synchronized void m12779g(C3281k kVar) {
        synchronized (SoLoader.class) {
            if (kVar != null) {
                f9235b = kVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method d = m12776d();
            boolean z = d != null;
            String a = z ? Api14Utils.m12791a() : null;
            f9235b = new C3258a(z, a, m12787o(a), runtime, d);
        }
    }

    /* renamed from: h */
    private static void m12780h(Context context, int i, C3281k kVar) {
        int i2;
        f9236c.writeLock().lock();
        try {
            if (f9237d == null) {
                Log.d("SoLoader", "init start");
                f9245l = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = SysUtil.m12802i() ? "/vendor/lib64:/system/lib64" : "/vendor/lib:/system/lib";
                }
                for (String str2 : str.split(":")) {
                    Log.d("SoLoader", "adding system library source: " + str2);
                    arrayList.add(new C3263c(new File(str2), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        f9239f = null;
                        Log.d("SoLoader", "adding exo package source: lib-main");
                        arrayList.add(0, new C3265e(context, "lib-main"));
                    } else {
                        if (f9246m) {
                            i2 = 0;
                        } else {
                            f9240g = new C3262b(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            Log.d("SoLoader", "adding application source: " + f9240g.toString());
                            arrayList.add(0, f9240g);
                            i2 = 1;
                        }
                        if ((f9245l & 8) != 0) {
                            f9239f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            C3260a aVar = new C3260a(context, file, "lib-main", i2);
                            arrayList2.add(aVar);
                            Log.d("SoLoader", "adding backup source from : " + aVar.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d("SoLoader", "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length) {
                                    File file2 = new File(strArr[i3]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("lib-");
                                    sb.append(i4);
                                    C3260a aVar2 = new C3260a(context, file2, sb.toString(), i2);
                                    Log.d("SoLoader", "adding backup source: " + aVar2.toString());
                                    arrayList2.add(aVar2);
                                    i3++;
                                    i4++;
                                }
                            }
                            f9239f = (C3284n[]) arrayList2.toArray(new C3284n[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                C3282l[] lVarArr = (C3282l[]) arrayList.toArray(new C3282l[arrayList.size()]);
                int p = m12788p();
                int length2 = lVarArr.length;
                while (true) {
                    int i5 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    Log.d("SoLoader", "Preparing SO source: " + lVarArr[i5]);
                    lVarArr[i5].mo10727b(p);
                    length2 = i5;
                }
                f9237d = lVarArr;
                f9238e++;
                Log.d("SoLoader", "init finish: " + f9237d.length + " SO sources prepared");
            }
        } finally {
            Log.d("SoLoader", "init exiting");
            f9236c.writeLock().unlock();
        }
    }

    /* renamed from: i */
    public static boolean m12781i() {
        ReentrantReadWriteLock reentrantReadWriteLock = f9236c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = f9237d != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            f9236c.readLock().unlock();
            throw th;
        }
    }

    public static void init(Context context, int i) {
        m12777e(context, i, (C3281k) null);
    }

    /* renamed from: j */
    public static boolean m12782j(String str) {
        return m12783k(str, 0);
    }

    /* renamed from: k */
    public static boolean m12783k(String str, int i) {
        C3283m mVar;
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = f9236c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f9237d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m12773a();
                } else {
                    synchronized (SoLoader.class) {
                        z = !f9241h.contains(str);
                        if (z) {
                            C3283m mVar2 = f9244k;
                            if (mVar2 != null) {
                                mVar2.mo10743a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return z;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            if (!f9246m || (mVar = f9244k) == null) {
                String b = C3276h.m12836b(str);
                return m12785m(System.mapLibraryName(b != null ? b : str), str, b, i, (StrictMode.ThreadPolicy) null);
            }
            mVar.mo10743a(str);
            return true;
        } catch (Throwable th) {
            f9236c.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: l */
    static void m12784l(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        m12786n(str, (String) null, (String) null, i, threadPolicy);
    }

    /* renamed from: m */
    private static boolean m12785m(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2 = false;
        do {
            try {
                z2 = m12786n(str, str2, str3, i, threadPolicy);
                z = false;
                continue;
            } catch (UnsatisfiedLinkError e) {
                int i2 = f9238e;
                f9236c.writeLock().lock();
                try {
                    z = true;
                    if (f9240g == null || !f9240g.mo10729d()) {
                        z = false;
                    } else {
                        Log.w("SoLoader", "sApplicationSoSource updated during load: " + str + ", attempting load again.");
                        f9238e = f9238e + 1;
                    }
                    f9236c.writeLock().unlock();
                    if (f9238e == i2) {
                        throw e;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (Throwable th) {
                    f9236c.writeLock().unlock();
                    throw th;
                }
            }
        } while (z);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0143, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0144, code lost:
        f9236c.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x014d, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r6 = f9236c;
        r6.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r3 != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r1.contains(r10) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r12 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0051, code lost:
        r6.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        if (r3 != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        android.util.Log.d("SoLoader", "About to load: " + r10);
        m12775c(r10, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        android.util.Log.d("SoLoader", "Loaded: " + r10);
        r1.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0095, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0096, code lost:
        r11 = r10.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009a, code lost:
        if (r11 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b3, code lost:
        throw new com.facebook.soloader.SoLoader.C3259b(r10, r11.substring(r11.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b4, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ba, code lost:
        if ((r13 & 16) != 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c0, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c8, code lost:
        if (f9243j.contains(r11) == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ca, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00cb, code lost:
        if (r12 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00cd, code lost:
        if (r2 != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cf, code lost:
        r12 = f9234a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d1, code lost:
        if (r12 == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d3, code lost:
        com.facebook.soloader.Api18TraceUtils.m12771a("MergedSoMapping.invokeJniOnload[", r11, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        android.util.Log.d("SoLoader", "About to merge: " + r11 + " / " + r10);
        com.facebook.soloader.C3276h.m12835a(r11);
        f9243j.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0100, code lost:
        if (r12 == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        com.facebook.soloader.Api18TraceUtils.m12772b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0106, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0108, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012c, code lost:
        throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + r11 + "', which has been merged into '" + r10 + "'.  See comment for details.", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012f, code lost:
        if (f9234a != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0131, code lost:
        com.facebook.soloader.Api18TraceUtils.m12772b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0134, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0135, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0136, code lost:
        r6.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x013f, code lost:
        return !r3;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m12786n(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, android.os.StrictMode.ThreadPolicy r14) {
        /*
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r2 = 0
            if (r1 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r1 = f9243j
            boolean r1 = r1.contains(r11)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = f9241h     // Catch:{ all -> 0x014e }
            boolean r3 = r1.contains(r10)     // Catch:{ all -> 0x014e }
            r4 = 1
            if (r3 == 0) goto L_0x0022
            if (r12 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            return r2
        L_0x0020:
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r5 = f9242i     // Catch:{ all -> 0x014e }
            boolean r6 = r5.containsKey(r10)     // Catch:{ all -> 0x014e }
            if (r6 == 0) goto L_0x0030
            java.lang.Object r5 = r5.get(r10)     // Catch:{ all -> 0x014e }
            goto L_0x0039
        L_0x0030:
            java.lang.Object r6 = new java.lang.Object     // Catch:{ all -> 0x014e }
            r6.<init>()     // Catch:{ all -> 0x014e }
            r5.put(r10, r6)     // Catch:{ all -> 0x014e }
            r5 = r6
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = f9236c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.readLock()
            r7.lock()
            monitor-enter(r5)     // Catch:{ all -> 0x0143 }
            if (r3 != 0) goto L_0x00b8
            monitor-enter(r0)     // Catch:{ all -> 0x0140 }
            boolean r7 = r1.contains(r10)     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x005a
            if (r12 != 0) goto L_0x0059
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r5)     // Catch:{ all -> 0x0140 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r6.readLock()
            r10.unlock()
            return r2
        L_0x0059:
            r3 = 1
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            if (r3 != 0) goto L_0x00b8
            java.lang.String r7 = "SoLoader"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            r8.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            java.lang.String r9 = "About to load: "
            r8.append(r9)     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            r8.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            java.lang.String r8 = r8.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            android.util.Log.d(r7, r8)     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            m12775c(r10, r13, r14)     // Catch:{ UnsatisfiedLinkError -> 0x0095 }
            monitor-enter(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r14 = "SoLoader"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r8 = "Loaded: "
            r7.append(r8)     // Catch:{ all -> 0x0092 }
            r7.append(r10)     // Catch:{ all -> 0x0092 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0092 }
            android.util.Log.d(r14, r7)     // Catch:{ all -> 0x0092 }
            r1.add(r10)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x00b8
        L_0x0092:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r10     // Catch:{ all -> 0x0140 }
        L_0x0095:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()     // Catch:{ all -> 0x0140 }
            if (r11 == 0) goto L_0x00b4
            java.lang.String r12 = "unexpected e_machine:"
            boolean r12 = r11.contains(r12)     // Catch:{ all -> 0x0140 }
            if (r12 == 0) goto L_0x00b4
            java.lang.String r12 = "unexpected e_machine:"
            int r12 = r11.lastIndexOf(r12)     // Catch:{ all -> 0x0140 }
            java.lang.String r11 = r11.substring(r12)     // Catch:{ all -> 0x0140 }
            com.facebook.soloader.SoLoader$b r12 = new com.facebook.soloader.SoLoader$b     // Catch:{ all -> 0x0140 }
            r12.<init>(r10, r11)     // Catch:{ all -> 0x0140 }
            throw r12     // Catch:{ all -> 0x0140 }
        L_0x00b4:
            throw r10     // Catch:{ all -> 0x0140 }
        L_0x00b5:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            throw r10     // Catch:{ all -> 0x0140 }
        L_0x00b8:
            r13 = r13 & 16
            if (r13 != 0) goto L_0x0135
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0140 }
            if (r13 != 0) goto L_0x00cb
            java.util.Set<java.lang.String> r13 = f9243j     // Catch:{ all -> 0x0140 }
            boolean r13 = r13.contains(r11)     // Catch:{ all -> 0x0140 }
            if (r13 == 0) goto L_0x00cb
            r2 = 1
        L_0x00cb:
            if (r12 == 0) goto L_0x0135
            if (r2 != 0) goto L_0x0135
            boolean r12 = f9234a     // Catch:{ all -> 0x0140 }
            if (r12 == 0) goto L_0x00da
            java.lang.String r13 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r14 = "]"
            com.facebook.soloader.Api18TraceUtils.m12771a(r13, r11, r14)     // Catch:{ all -> 0x0140 }
        L_0x00da:
            java.lang.String r13 = "SoLoader"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            r14.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            java.lang.String r0 = "About to merge: "
            r14.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            r14.append(r11)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            java.lang.String r0 = " / "
            r14.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            r14.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            java.lang.String r14 = r14.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            android.util.Log.d(r13, r14)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            com.facebook.soloader.C3276h.m12835a(r11)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            java.util.Set<java.lang.String> r13 = f9243j     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            r13.add(r11)     // Catch:{ UnsatisfiedLinkError -> 0x0108 }
            if (r12 == 0) goto L_0x0135
            com.facebook.soloader.Api18TraceUtils.m12772b()     // Catch:{ all -> 0x0140 }
            goto L_0x0135
        L_0x0106:
            r10 = move-exception
            goto L_0x012d
        L_0x0108:
            r12 = move-exception
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ all -> 0x0106 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0106 }
            r14.<init>()     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r14.append(r0)     // Catch:{ all -> 0x0106 }
            r14.append(r11)     // Catch:{ all -> 0x0106 }
            java.lang.String r11 = "', which has been merged into '"
            r14.append(r11)     // Catch:{ all -> 0x0106 }
            r14.append(r10)     // Catch:{ all -> 0x0106 }
            java.lang.String r10 = "'.  See comment for details."
            r14.append(r10)     // Catch:{ all -> 0x0106 }
            java.lang.String r10 = r14.toString()     // Catch:{ all -> 0x0106 }
            r13.<init>(r10, r12)     // Catch:{ all -> 0x0106 }
            throw r13     // Catch:{ all -> 0x0106 }
        L_0x012d:
            boolean r11 = f9234a     // Catch:{ all -> 0x0140 }
            if (r11 == 0) goto L_0x0134
            com.facebook.soloader.Api18TraceUtils.m12772b()     // Catch:{ all -> 0x0140 }
        L_0x0134:
            throw r10     // Catch:{ all -> 0x0140 }
        L_0x0135:
            monitor-exit(r5)     // Catch:{ all -> 0x0140 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r6.readLock()
            r10.unlock()
            r10 = r3 ^ 1
            return r10
        L_0x0140:
            r10 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0140 }
            throw r10     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r10 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r11 = f9236c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r11.readLock()
            r11.unlock()
            throw r10
        L_0x014e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m12786n(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* renamed from: o */
    public static String m12787o(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    /* renamed from: p */
    private static int m12788p() {
        ReentrantReadWriteLock reentrantReadWriteLock = f9236c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = (f9245l & 2) != 0 ? 1 : 0;
            reentrantReadWriteLock.writeLock().unlock();
            return i;
        } catch (Throwable th) {
            f9236c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: q */
    public static File m12789q(String str) {
        m12773a();
        try {
            return m12790r(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: r */
    static File m12790r(String str) {
        f9236c.readLock().lock();
        try {
            for (C3282l c : f9237d) {
                File c2 = c.mo10728c(str);
                if (c2 != null) {
                    return c2;
                }
            }
            f9236c.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            f9236c.readLock().unlock();
        }
    }
}
