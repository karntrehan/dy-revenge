package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.modules.core.C2804g;
import com.facebook.react.uimanager.C3041s0;
import com.facebook.react.uimanager.p122l1.C2999a;
import com.facebook.systrace.C3294a;
import com.facebook.systrace.C3296b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.uimanager.z0 */
public class C3061z0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f8493a = "z0";

    /* renamed from: A */
    private long f8494A;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int[] f8495b = new int[4];
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3022n f8496c;

    /* renamed from: d */
    private final Object f8497d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f8498e = new Object();

    /* renamed from: f */
    private final C3071j f8499f;

    /* renamed from: g */
    private final ReactApplicationContext f8500g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<C3069h> f8501h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C3082u> f8502i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<Runnable> f8503j = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ArrayDeque<C3082u> f8504k = new ArrayDeque<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2999a f8505l;

    /* renamed from: m */
    private boolean f8506m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f8507n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f8508o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f8509p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f8510q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f8511r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f8512s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f8513t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f8514u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f8515v;

    /* renamed from: w */
    private long f8516w;

    /* renamed from: x */
    private long f8517x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f8518y;

    /* renamed from: z */
    private long f8519z;

    /* renamed from: com.facebook.react.uimanager.z0$a */
    class C3062a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f8520f;

        /* renamed from: o */
        final /* synthetic */ ArrayList f8521o;

        /* renamed from: p */
        final /* synthetic */ ArrayDeque f8522p;

        /* renamed from: q */
        final /* synthetic */ ArrayList f8523q;

        /* renamed from: r */
        final /* synthetic */ long f8524r;

        /* renamed from: s */
        final /* synthetic */ long f8525s;

        /* renamed from: t */
        final /* synthetic */ long f8526t;

        /* renamed from: u */
        final /* synthetic */ long f8527u;

        C3062a(int i, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j, long j2, long j3, long j4) {
            this.f8520f = i;
            this.f8521o = arrayList;
            this.f8522p = arrayDeque;
            this.f8523q = arrayList2;
            this.f8524r = j;
            this.f8525s = j2;
            this.f8526t = j3;
            this.f8527u = j4;
        }

        public void run() {
            String i;
            ReactNoCrashSoftException reactNoCrashSoftException;
            C3296b.m12892a(0, "DispatchUI").mo10750a("BatchId", this.f8520f).mo10752c();
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = this.f8521o;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3069h hVar = (C3069h) it.next();
                        try {
                            hVar.mo9907c();
                        } catch (RetryableMountingLayerException e) {
                            RetryableMountingLayerException retryableMountingLayerException = e;
                            if (hVar.mo9905a() == 0) {
                                hVar.mo9906b();
                                C3061z0.this.f8501h.add(hVar);
                            } else {
                                i = C3061z0.f8493a;
                                reactNoCrashSoftException = new ReactNoCrashSoftException((Throwable) retryableMountingLayerException);
                            }
                        } catch (Throwable th) {
                            reactNoCrashSoftException = th;
                            i = C3061z0.f8493a;
                        }
                    }
                }
                ArrayDeque arrayDeque = this.f8522p;
                if (arrayDeque != null) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext()) {
                        ((C3082u) it2.next()).execute();
                    }
                }
                ArrayList arrayList2 = this.f8523q;
                if (arrayList2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((C3082u) it3.next()).execute();
                    }
                }
                if (C3061z0.this.f8508o && C3061z0.this.f8510q == 0) {
                    long unused = C3061z0.this.f8510q = this.f8524r;
                    long unused2 = C3061z0.this.f8511r = SystemClock.uptimeMillis();
                    long unused3 = C3061z0.this.f8512s = this.f8525s;
                    long unused4 = C3061z0.this.f8513t = this.f8526t;
                    long unused5 = C3061z0.this.f8514u = uptimeMillis;
                    C3061z0 z0Var = C3061z0.this;
                    long unused6 = z0Var.f8515v = z0Var.f8511r;
                    long unused7 = C3061z0.this.f8518y = this.f8527u;
                    C3294a.m12880b(0, "delayBeforeDispatchViewUpdates", 0, C3061z0.this.f8510q * 1000000);
                    C3294a.m12884f(0, "delayBeforeDispatchViewUpdates", 0, C3061z0.this.f8513t * 1000000);
                    C3294a.m12880b(0, "delayBeforeBatchRunStart", 0, C3061z0.this.f8513t * 1000000);
                    C3294a.m12884f(0, "delayBeforeBatchRunStart", 0, C3061z0.this.f8514u * 1000000);
                }
                C3061z0.this.f8496c.mo9774f();
                if (C3061z0.this.f8505l != null) {
                    C3061z0.this.f8505l.mo9158b();
                }
                C3294a.m12885g(0);
                return;
                ReactSoftExceptionLogger.logSoftException(i, reactNoCrashSoftException);
            } catch (Exception e2) {
                boolean unused8 = C3061z0.this.f8507n = true;
                throw e2;
            } catch (Throwable th2) {
                C3294a.m12885g(0);
                throw th2;
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$b */
    class C3063b extends GuardedRunnable {
        C3063b(ReactContext reactContext) {
            super(reactContext);
        }

        public void runGuarded() {
            C3061z0.this.m12106U();
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$c */
    private final class C3064c extends C3086y {

        /* renamed from: c */
        private final int f8530c;

        /* renamed from: d */
        private final boolean f8531d;

        /* renamed from: e */
        private final boolean f8532e;

        public C3064c(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.f8530c = i2;
            this.f8532e = z;
            this.f8531d = z2;
        }

        public void execute() {
            if (!this.f8532e) {
                C3061z0.this.f8496c.mo9789z(this.f8591a, this.f8530c, this.f8531d);
            } else {
                C3061z0.this.f8496c.mo9773e();
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$d */
    private class C3065d implements C3082u {

        /* renamed from: a */
        private final ReadableMap f8534a;

        /* renamed from: b */
        private final Callback f8535b;

        private C3065d(ReadableMap readableMap, Callback callback) {
            this.f8534a = readableMap;
            this.f8535b = callback;
        }

        /* synthetic */ C3065d(C3061z0 z0Var, ReadableMap readableMap, Callback callback, C3062a aVar) {
            this(readableMap, callback);
        }

        public void execute() {
            C3061z0.this.f8496c.mo9775h(this.f8534a, this.f8535b);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$e */
    private final class C3066e extends C3086y {

        /* renamed from: c */
        private final C3031o0 f8537c;

        /* renamed from: d */
        private final String f8538d;

        /* renamed from: e */
        private final C2962f0 f8539e;

        public C3066e(C3031o0 o0Var, int i, String str, C2962f0 f0Var) {
            super(i);
            this.f8537c = o0Var;
            this.f8538d = str;
            this.f8539e = f0Var;
            C3294a.m12888j(0, "createView", this.f8591a);
        }

        public void execute() {
            C3294a.m12882d(0, "createView", this.f8591a);
            C3061z0.this.f8496c.mo9776j(this.f8537c, this.f8591a, this.f8538d, this.f8539e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$f */
    private final class C3067f implements C3082u {
        private C3067f() {
        }

        /* synthetic */ C3067f(C3061z0 z0Var, C3062a aVar) {
            this();
        }

        public void execute() {
            C3061z0.this.f8496c.mo9777k();
        }
    }

    @Deprecated
    /* renamed from: com.facebook.react.uimanager.z0$g */
    private final class C3068g extends C3086y implements C3069h {

        /* renamed from: c */
        private final int f8542c;

        /* renamed from: d */
        private final ReadableArray f8543d;

        /* renamed from: e */
        private int f8544e = 0;

        public C3068g(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.f8542c = i2;
            this.f8543d = readableArray;
        }

        /* renamed from: a */
        public int mo9905a() {
            return this.f8544e;
        }

        /* renamed from: b */
        public void mo9906b() {
            this.f8544e++;
        }

        /* renamed from: c */
        public void mo9907c() {
            C3061z0.this.f8496c.mo9778l(this.f8591a, this.f8542c, this.f8543d);
        }

        public void execute() {
            try {
                C3061z0.this.f8496c.mo9778l(this.f8591a, this.f8542c, this.f8543d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(C3061z0.f8493a, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$h */
    private interface C3069h {
        /* renamed from: a */
        int mo9905a();

        /* renamed from: b */
        void mo9906b();

        /* renamed from: c */
        void mo9907c();
    }

    /* renamed from: com.facebook.react.uimanager.z0$i */
    private final class C3070i extends C3086y implements C3069h {

        /* renamed from: c */
        private final String f8546c;

        /* renamed from: d */
        private final ReadableArray f8547d;

        /* renamed from: e */
        private int f8548e = 0;

        public C3070i(int i, String str, ReadableArray readableArray) {
            super(i);
            this.f8546c = str;
            this.f8547d = readableArray;
        }

        /* renamed from: a */
        public int mo9905a() {
            return this.f8548e;
        }

        /* renamed from: b */
        public void mo9906b() {
            this.f8548e++;
        }

        /* renamed from: c */
        public void mo9907c() {
            C3061z0.this.f8496c.mo9779m(this.f8591a, this.f8546c, this.f8547d);
        }

        public void execute() {
            try {
                C3061z0.this.f8496c.mo9779m(this.f8591a, this.f8546c, this.f8547d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(C3061z0.f8493a, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$j */
    private class C3071j extends C2961f {

        /* renamed from: c */
        private final int f8550c;

        private C3071j(ReactContext reactContext, int i) {
            super(reactContext);
            this.f8550c = i;
        }

        /* synthetic */ C3071j(C3061z0 z0Var, ReactContext reactContext, int i, C3062a aVar) {
            this(reactContext, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2 = android.os.SystemClock.uptimeMillis();
            r1.execute();
            r0 = r8.f8551d;
            com.facebook.react.uimanager.C3061z0.m12129w(r0, com.facebook.react.uimanager.C3061z0.m12128v(r0) + (android.os.SystemClock.uptimeMillis() - r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
            com.facebook.react.uimanager.C3061z0.m12124r(r8.f8551d, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
            throw r9;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m12170d(long r9) {
            /*
                r8 = this;
            L_0x0000:
                r0 = 16
                long r2 = java.lang.System.nanoTime()
                long r2 = r2 - r9
                r4 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r2 / r4
                long r0 = r0 - r2
                int r2 = r8.f8550c
                long r2 = (long) r2
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L_0x0014
                goto L_0x0028
            L_0x0014:
                com.facebook.react.uimanager.z0 r0 = com.facebook.react.uimanager.C3061z0.this
                java.lang.Object r0 = r0.f8498e
                monitor-enter(r0)
                com.facebook.react.uimanager.z0 r1 = com.facebook.react.uimanager.C3061z0.this     // Catch:{ all -> 0x0055 }
                java.util.ArrayDeque r1 = r1.f8504k     // Catch:{ all -> 0x0055 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0055 }
                if (r1 == 0) goto L_0x0029
                monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            L_0x0028:
                return
            L_0x0029:
                com.facebook.react.uimanager.z0 r1 = com.facebook.react.uimanager.C3061z0.this     // Catch:{ all -> 0x0055 }
                java.util.ArrayDeque r1 = r1.f8504k     // Catch:{ all -> 0x0055 }
                java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0055 }
                com.facebook.react.uimanager.z0$u r1 = (com.facebook.react.uimanager.C3061z0.C3082u) r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r0)     // Catch:{ all -> 0x0055 }
                long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x004d }
                r1.execute()     // Catch:{ Exception -> 0x004d }
                com.facebook.react.uimanager.z0 r0 = com.facebook.react.uimanager.C3061z0.this     // Catch:{ Exception -> 0x004d }
                long r4 = r0.f8509p     // Catch:{ Exception -> 0x004d }
                long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x004d }
                long r6 = r6 - r2
                long r4 = r4 + r6
                long unused = r0.f8509p = r4     // Catch:{ Exception -> 0x004d }
                goto L_0x0000
            L_0x004d:
                r9 = move-exception
                com.facebook.react.uimanager.z0 r10 = com.facebook.react.uimanager.C3061z0.this
                r0 = 1
                boolean unused = r10.f8507n = r0
                throw r9
            L_0x0055:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0055 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3061z0.C3071j.m12170d(long):void");
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo8416c(long j) {
            if (C3061z0.this.f8507n) {
                C6071a.m22859G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            C3294a.m12881c(0, "dispatchNonBatchedUIOperations");
            try {
                m12170d(j);
                C3294a.m12885g(0);
                C3061z0.this.m12106U();
                C2804g.m11194i().mo9151m(C2804g.C2807c.DISPATCH_UI, this);
            } catch (Throwable th) {
                C3294a.m12885g(0);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$k */
    private final class C3072k implements C3082u {

        /* renamed from: a */
        private final int f8552a;

        /* renamed from: b */
        private final float f8553b;

        /* renamed from: c */
        private final float f8554c;

        /* renamed from: d */
        private final Callback f8555d;

        private C3072k(int i, float f, float f2, Callback callback) {
            this.f8552a = i;
            this.f8553b = f;
            this.f8554c = f2;
            this.f8555d = callback;
        }

        /* synthetic */ C3072k(C3061z0 z0Var, int i, float f, float f2, Callback callback, C3062a aVar) {
            this(i, f, f2, callback);
        }

        public void execute() {
            try {
                C3061z0.this.f8496c.mo9783t(this.f8552a, C3061z0.this.f8495b);
                float f = (float) C3061z0.this.f8495b[0];
                float f2 = (float) C3061z0.this.f8495b[1];
                int o = C3061z0.this.f8496c.mo9781o(this.f8552a, this.f8553b, this.f8554c);
                try {
                    C3061z0.this.f8496c.mo9783t(o, C3061z0.this.f8495b);
                    float a = C3038r.m12004a(((float) C3061z0.this.f8495b[0]) - f);
                    float a2 = C3038r.m12004a(((float) C3061z0.this.f8495b[1]) - f2);
                    float a3 = C3038r.m12004a((float) C3061z0.this.f8495b[2]);
                    float a4 = C3038r.m12004a((float) C3061z0.this.f8495b[3]);
                    this.f8555d.invoke(Integer.valueOf(o), Float.valueOf(a), Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(a4));
                } catch (C2981h unused) {
                    this.f8555d.invoke(new Object[0]);
                }
            } catch (C2981h unused2) {
                this.f8555d.invoke(new Object[0]);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$l */
    private final class C3073l implements C3082u {

        /* renamed from: a */
        private final C2931d0 f8557a;

        /* renamed from: b */
        private final C3041s0.C3043b f8558b;

        private C3073l(C2931d0 d0Var, C3041s0.C3043b bVar) {
            this.f8557a = d0Var;
            this.f8558b = bVar;
        }

        /* synthetic */ C3073l(C3061z0 z0Var, C2931d0 d0Var, C3041s0.C3043b bVar, C3062a aVar) {
            this(d0Var, bVar);
        }

        public void execute() {
            this.f8558b.mo9863a(this.f8557a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$m */
    private final class C3074m extends C3086y {

        /* renamed from: c */
        private final int[] f8560c;

        /* renamed from: d */
        private final C2920a1[] f8561d;

        /* renamed from: e */
        private final int[] f8562e;

        public C3074m(int i, int[] iArr, C2920a1[] a1VarArr, int[] iArr2) {
            super(i);
            this.f8560c = iArr;
            this.f8561d = a1VarArr;
            this.f8562e = iArr2;
        }

        public void execute() {
            C3061z0.this.f8496c.mo9782r(this.f8591a, this.f8560c, this.f8561d, this.f8562e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$n */
    private final class C3075n implements C3082u {

        /* renamed from: a */
        private final int f8564a;

        /* renamed from: b */
        private final Callback f8565b;

        private C3075n(int i, Callback callback) {
            this.f8564a = i;
            this.f8565b = callback;
        }

        /* synthetic */ C3075n(C3061z0 z0Var, int i, Callback callback, C3062a aVar) {
            this(i, callback);
        }

        public void execute() {
            try {
                C3061z0.this.f8496c.mo9784u(this.f8564a, C3061z0.this.f8495b);
                float a = C3038r.m12004a((float) C3061z0.this.f8495b[0]);
                float a2 = C3038r.m12004a((float) C3061z0.this.f8495b[1]);
                float a3 = C3038r.m12004a((float) C3061z0.this.f8495b[2]);
                float a4 = C3038r.m12004a((float) C3061z0.this.f8495b[3]);
                this.f8565b.invoke(Float.valueOf(a), Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(a4));
            } catch (C3032p unused) {
                this.f8565b.invoke(new Object[0]);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$o */
    private final class C3076o implements C3082u {

        /* renamed from: a */
        private final int f8567a;

        /* renamed from: b */
        private final Callback f8568b;

        private C3076o(int i, Callback callback) {
            this.f8567a = i;
            this.f8568b = callback;
        }

        /* synthetic */ C3076o(C3061z0 z0Var, int i, Callback callback, C3062a aVar) {
            this(i, callback);
        }

        public void execute() {
            try {
                C3061z0.this.f8496c.mo9783t(this.f8567a, C3061z0.this.f8495b);
                float a = C3038r.m12004a((float) C3061z0.this.f8495b[0]);
                float a2 = C3038r.m12004a((float) C3061z0.this.f8495b[1]);
                float a3 = C3038r.m12004a((float) C3061z0.this.f8495b[2]);
                float a4 = C3038r.m12004a((float) C3061z0.this.f8495b[3]);
                this.f8568b.invoke(0, 0, Float.valueOf(a3), Float.valueOf(a4), Float.valueOf(a), Float.valueOf(a2));
            } catch (C3032p unused) {
                this.f8568b.invoke(new Object[0]);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$p */
    private final class C3077p extends C3086y {
        public C3077p(int i) {
            super(i);
        }

        public void execute() {
            C3061z0.this.f8496c.mo9785v(this.f8591a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$q */
    private final class C3078q extends C3086y {

        /* renamed from: c */
        private final int f8571c;

        private C3078q(int i, int i2) {
            super(i);
            this.f8571c = i2;
        }

        /* synthetic */ C3078q(C3061z0 z0Var, int i, int i2, C3062a aVar) {
            this(i, i2);
        }

        public void execute() {
            C3061z0.this.f8496c.mo9788y(this.f8591a, this.f8571c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$r */
    private class C3079r implements C3082u {

        /* renamed from: a */
        private final boolean f8573a;

        private C3079r(boolean z) {
            this.f8573a = z;
        }

        /* synthetic */ C3079r(C3061z0 z0Var, boolean z, C3062a aVar) {
            this(z);
        }

        public void execute() {
            C3061z0.this.f8496c.mo9766A(this.f8573a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$s */
    private final class C3080s extends C3086y {

        /* renamed from: c */
        private final ReadableArray f8575c;

        /* renamed from: d */
        private final Callback f8576d;

        /* renamed from: e */
        private final Callback f8577e;

        public C3080s(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.f8575c = readableArray;
            this.f8576d = callback;
            this.f8577e = callback2;
        }

        public void execute() {
            C3061z0.this.f8496c.mo9767B(this.f8591a, this.f8575c, this.f8577e, this.f8576d);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$t */
    private class C3081t implements C3082u {

        /* renamed from: a */
        private final C3039r0 f8579a;

        public C3081t(C3039r0 r0Var) {
            this.f8579a = r0Var;
        }

        public void execute() {
            this.f8579a.mo8417a(C3061z0.this.f8496c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$u */
    public interface C3082u {
        void execute();
    }

    /* renamed from: com.facebook.react.uimanager.z0$v */
    private final class C3083v extends C3086y {

        /* renamed from: c */
        private final int f8581c;

        /* renamed from: d */
        private final int f8582d;

        /* renamed from: e */
        private final int f8583e;

        /* renamed from: f */
        private final int f8584f;

        /* renamed from: g */
        private final int f8585g;

        public C3083v(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.f8581c = i;
            this.f8582d = i3;
            this.f8583e = i4;
            this.f8584f = i5;
            this.f8585g = i6;
            C3294a.m12888j(0, "updateLayout", this.f8591a);
        }

        public void execute() {
            C3294a.m12882d(0, "updateLayout", this.f8591a);
            C3061z0.this.f8496c.mo9768C(this.f8581c, this.f8591a, this.f8582d, this.f8583e, this.f8584f, this.f8585g);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$w */
    private final class C3084w extends C3086y {

        /* renamed from: c */
        private final C2962f0 f8587c;

        private C3084w(int i, C2962f0 f0Var) {
            super(i);
            this.f8587c = f0Var;
        }

        /* synthetic */ C3084w(C3061z0 z0Var, int i, C2962f0 f0Var, C3062a aVar) {
            this(i, f0Var);
        }

        public void execute() {
            C3061z0.this.f8496c.mo9769E(this.f8591a, this.f8587c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$x */
    private final class C3085x extends C3086y {

        /* renamed from: c */
        private final Object f8589c;

        public C3085x(int i, Object obj) {
            super(i);
            this.f8589c = obj;
        }

        public void execute() {
            C3061z0.this.f8496c.mo9770F(this.f8591a, this.f8589c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.z0$y */
    private abstract class C3086y implements C3082u {

        /* renamed from: a */
        public int f8591a;

        public C3086y(int i) {
            this.f8591a = i;
        }
    }

    public C3061z0(ReactApplicationContext reactApplicationContext, C3022n nVar, int i) {
        this.f8496c = nVar;
        this.f8499f = new C3071j(this, reactApplicationContext, i == -1 ? 8 : i, (C3062a) null);
        this.f8500g = reactApplicationContext;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0.next().run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r12.f8508o == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r12.f8516w = android.os.SystemClock.uptimeMillis() - r2;
        r12.f8517x = r12.f8509p;
        r12.f8508o = false;
        com.facebook.systrace.C3294a.m12880b(0, "batchedExecutionTime", 0, 1000000 * r2);
        com.facebook.systrace.C3294a.m12883e(0, "batchedExecutionTime", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r12.f8509p = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        return;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12106U() {
        /*
            r12 = this;
            boolean r0 = r12.f8507n
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Not flushing pending UI operations because of previously thrown Exception"
            p174e.p247e.p253d.p258e.C6071a.m22859G(r0, r1)
            return
        L_0x000c:
            java.lang.Object r0 = r12.f8497d
            monitor-enter(r0)
            java.util.ArrayList<java.lang.Runnable> r1 = r12.f8503j     // Catch:{ all -> 0x0064 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0062
            java.util.ArrayList<java.lang.Runnable> r1 = r12.f8503j     // Catch:{ all -> 0x0064 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0064 }
            r2.<init>()     // Catch:{ all -> 0x0064 }
            r12.f8503j = r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.Iterator r0 = r1.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0029
        L_0x0039:
            boolean r0 = r12.f8508o
            r4 = 0
            if (r0 == 0) goto L_0x005f
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            r12.f8516w = r0
            long r0 = r12.f8509p
            r12.f8517x = r0
            r0 = 0
            r12.f8508o = r0
            r6 = 0
            java.lang.String r8 = "batchedExecutionTime"
            r9 = 0
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r2
            com.facebook.systrace.C3294a.m12880b(r6, r8, r9, r10)
            java.lang.String r1 = "batchedExecutionTime"
            com.facebook.systrace.C3294a.m12883e(r4, r1, r0)
        L_0x005f:
            r12.f8509p = r4
            return
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0064:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3061z0.m12106U():void");
    }

    /* renamed from: A */
    public void mo9873A() {
        this.f8502i.add(new C3064c(0, 0, true, false));
    }

    /* renamed from: B */
    public void mo9874B(ReadableMap readableMap, Callback callback) {
        this.f8502i.add(new C3065d(this, readableMap, callback, (C3062a) null));
    }

    /* renamed from: C */
    public void mo9875C(C3031o0 o0Var, int i, String str, C2962f0 f0Var) {
        synchronized (this.f8498e) {
            this.f8519z++;
            this.f8504k.addLast(new C3066e(o0Var, i, str, f0Var));
        }
    }

    /* renamed from: D */
    public void mo9876D() {
        this.f8502i.add(new C3067f(this, (C3062a) null));
    }

    @Deprecated
    /* renamed from: E */
    public void mo9877E(int i, int i2, ReadableArray readableArray) {
        this.f8501h.add(new C3068g(i, i2, readableArray));
    }

    /* renamed from: F */
    public void mo9878F(int i, String str, ReadableArray readableArray) {
        this.f8501h.add(new C3070i(i, str, readableArray));
    }

    /* renamed from: G */
    public void mo9879G(int i, float f, float f2, Callback callback) {
        this.f8502i.add(new C3072k(this, i, f, f2, callback, (C3062a) null));
    }

    /* renamed from: H */
    public void mo9880H(C2931d0 d0Var, C3041s0.C3043b bVar) {
        this.f8502i.add(new C3073l(this, d0Var, bVar, (C3062a) null));
    }

    /* renamed from: I */
    public void mo9881I(int i, int[] iArr, C2920a1[] a1VarArr, int[] iArr2) {
        this.f8502i.add(new C3074m(i, iArr, a1VarArr, iArr2));
    }

    /* renamed from: J */
    public void mo9882J(int i, Callback callback) {
        this.f8502i.add(new C3076o(this, i, callback, (C3062a) null));
    }

    /* renamed from: K */
    public void mo9883K(int i, Callback callback) {
        this.f8502i.add(new C3075n(this, i, callback, (C3062a) null));
    }

    /* renamed from: L */
    public void mo9884L(int i) {
        this.f8502i.add(new C3077p(i));
    }

    /* renamed from: M */
    public void mo9885M(int i, int i2) {
        this.f8502i.add(new C3078q(this, i, i2, (C3062a) null));
    }

    /* renamed from: N */
    public void mo9886N(int i, int i2, boolean z) {
        this.f8502i.add(new C3064c(i, i2, false, z));
    }

    /* renamed from: O */
    public void mo9887O(boolean z) {
        this.f8502i.add(new C3079r(this, z, (C3062a) null));
    }

    /* renamed from: P */
    public void mo9888P(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.f8502i.add(new C3080s(i, readableArray, callback, callback2));
    }

    /* renamed from: Q */
    public void mo9889Q(C3039r0 r0Var) {
        this.f8502i.add(new C3081t(r0Var));
    }

    /* renamed from: R */
    public void mo9890R(int i, Object obj) {
        this.f8502i.add(new C3085x(i, obj));
    }

    /* renamed from: S */
    public void mo9891S(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f8502i.add(new C3083v(i, i2, i3, i4, i5, i6));
    }

    /* renamed from: T */
    public void mo9892T(int i, String str, C2962f0 f0Var) {
        this.f8494A++;
        this.f8502i.add(new C3084w(this, i, f0Var, (C3062a) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C3022n mo9893V() {
        return this.f8496c;
    }

    /* renamed from: W */
    public Map<String, Long> mo9894W() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f8510q));
        hashMap.put("CommitEndTime", Long.valueOf(this.f8511r));
        hashMap.put("LayoutTime", Long.valueOf(this.f8512s));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f8513t));
        hashMap.put("RunStartTime", Long.valueOf(this.f8514u));
        hashMap.put("RunEndTime", Long.valueOf(this.f8515v));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f8516w));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f8517x));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f8518y));
        hashMap.put("CreateViewCount", Long.valueOf(this.f8519z));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.f8494A));
        return hashMap;
    }

    /* renamed from: X */
    public boolean mo9895X() {
        return this.f8502i.isEmpty() && this.f8501h.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo9896Y() {
        this.f8506m = false;
        C2804g.m11194i().mo9152o(C2804g.C2807c.DISPATCH_UI, this.f8499f);
        m12106U();
    }

    /* renamed from: Z */
    public void mo9897Z(C3039r0 r0Var) {
        this.f8502i.add(0, new C3081t(r0Var));
    }

    /* renamed from: a0 */
    public void mo9898a0() {
        this.f8508o = true;
        this.f8510q = 0;
        this.f8519z = 0;
        this.f8494A = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo9899b0() {
        this.f8506m = true;
        C2804g.m11194i().mo9151m(C2804g.C2807c.DISPATCH_UI, this.f8499f);
    }

    /* renamed from: c0 */
    public void mo9900c0(C2999a aVar) {
        this.f8505l = aVar;
    }

    /* renamed from: y */
    public void mo9901y(int i, View view) {
        this.f8496c.mo9771b(i, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b3, code lost:
        r0 = th;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9902z(int r20, long r21, long r23) {
        /*
            r19 = this;
            r15 = r19
            r0 = r20
            java.lang.String r1 = "UIViewOperationQueue.dispatchViewUpdates"
            r13 = 0
            com.facebook.systrace.b$b r1 = com.facebook.systrace.C3296b.m12892a(r13, r1)
            java.lang.String r2 = "batchId"
            com.facebook.systrace.b$b r1 = r1.mo10750a(r2, r0)
            r1.mo10752c()
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00b5 }
            long r16 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList<com.facebook.react.uimanager.z0$h> r1 = r15.f8501h     // Catch:{ all -> 0x00b5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b5 }
            r2 = 0
            if (r1 != 0) goto L_0x0031
            java.util.ArrayList<com.facebook.react.uimanager.z0$h> r1 = r15.f8501h     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r3.<init>()     // Catch:{ all -> 0x00b5 }
            r15.f8501h = r3     // Catch:{ all -> 0x00b5 }
            r4 = r1
            goto L_0x0032
        L_0x0031:
            r4 = r2
        L_0x0032:
            java.util.ArrayList<com.facebook.react.uimanager.z0$u> r1 = r15.f8502i     // Catch:{ all -> 0x00b5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0045
            java.util.ArrayList<com.facebook.react.uimanager.z0$u> r1 = r15.f8502i     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r3.<init>()     // Catch:{ all -> 0x00b5 }
            r15.f8502i = r3     // Catch:{ all -> 0x00b5 }
            r6 = r1
            goto L_0x0046
        L_0x0045:
            r6 = r2
        L_0x0046:
            java.lang.Object r1 = r15.f8498e     // Catch:{ all -> 0x00b5 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b5 }
            java.util.ArrayDeque<com.facebook.react.uimanager.z0$u> r3 = r15.f8504k     // Catch:{ all -> 0x00ad }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00ad }
            if (r3 != 0) goto L_0x005a
            java.util.ArrayDeque<com.facebook.react.uimanager.z0$u> r2 = r15.f8504k     // Catch:{ all -> 0x00ad }
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch:{ all -> 0x00ad }
            r3.<init>()     // Catch:{ all -> 0x00ad }
            r15.f8504k = r3     // Catch:{ all -> 0x00ad }
        L_0x005a:
            r5 = r2
            monitor-exit(r1)     // Catch:{ all -> 0x00ad }
            com.facebook.react.uimanager.l1.a r1 = r15.f8505l     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0063
            r1.mo9157a()     // Catch:{ all -> 0x00b5 }
        L_0x0063:
            com.facebook.react.uimanager.z0$a r9 = new com.facebook.react.uimanager.z0$a     // Catch:{ all -> 0x00b5 }
            r1 = r9
            r2 = r19
            r3 = r20
            r7 = r21
            r18 = r9
            r9 = r23
            r13 = r16
            r1.<init>(r3, r4, r5, r6, r7, r9, r11, r13)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "acquiring mDispatchRunnablesLock"
            r2 = 0
            com.facebook.systrace.b$b r1 = com.facebook.systrace.C3296b.m12892a(r2, r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = "batchId"
            com.facebook.systrace.b$b r0 = r1.mo10750a(r4, r0)     // Catch:{ all -> 0x00b1 }
            r0.mo10752c()     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r15.f8497d     // Catch:{ all -> 0x00b1 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b1 }
            com.facebook.systrace.C3294a.m12885g(r2)     // Catch:{ all -> 0x00a6 }
            java.util.ArrayList<java.lang.Runnable> r0 = r15.f8503j     // Catch:{ all -> 0x00a6 }
            r4 = r18
            r0.add(r4)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
            boolean r0 = r15.f8506m     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x00a2
            com.facebook.react.uimanager.z0$b r0 = new com.facebook.react.uimanager.z0$b     // Catch:{ all -> 0x00b1 }
            com.facebook.react.bridge.ReactApplicationContext r1 = r15.f8500g     // Catch:{ all -> 0x00b1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b1 }
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00a2:
            com.facebook.systrace.C3294a.m12885g(r2)
            return
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00a9:
            r0 = move-exception
            r2 = 0
            goto L_0x00b7
        L_0x00ad:
            r0 = move-exception
            r2 = r13
        L_0x00af:
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r0 = move-exception
            goto L_0x00af
        L_0x00b5:
            r0 = move-exception
            r2 = r13
        L_0x00b7:
            com.facebook.systrace.C3294a.m12885g(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3061z0.mo9902z(int, long, long):void");
    }
}
