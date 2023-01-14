package p493i;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p455g.C10323s;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10456k;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.d */
public class C10593d extends C10600e0 {
    public static final C10594a Companion = new C10594a((C10452g) null);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_MILLIS;
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    /* access modifiers changed from: private */
    public static C10593d head;
    private boolean inQueue;
    /* access modifiers changed from: private */
    public C10593d next;
    /* access modifiers changed from: private */
    public long timeoutAt;

    /* renamed from: i.d$a */
    public static final class C10594a {
        private C10594a() {
        }

        public /* synthetic */ C10594a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m35973d(C10593d dVar) {
            boolean z;
            synchronized (C10593d.class) {
                C10593d access$getHead$cp = C10593d.head;
                while (true) {
                    if (access$getHead$cp == null) {
                        z = true;
                        break;
                    } else if (access$getHead$cp.next == dVar) {
                        access$getHead$cp.next = dVar.next;
                        dVar.next = null;
                        z = false;
                        break;
                    } else {
                        access$getHead$cp = access$getHead$cp.next;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0065 A[EDGE_INSN: B:35:0x0065->B:22:0x0065 ?: BREAK  , SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m35974e(p493i.C10593d r7, long r8, boolean r10) {
            /*
                r6 = this;
                java.lang.Class<i.d> r0 = p493i.C10593d.class
                monitor-enter(r0)
                i.d r1 = p493i.C10593d.head     // Catch:{ all -> 0x0082 }
                if (r1 != 0) goto L_0x0019
                i.d r1 = new i.d     // Catch:{ all -> 0x0082 }
                r1.<init>()     // Catch:{ all -> 0x0082 }
                p493i.C10593d.head = r1     // Catch:{ all -> 0x0082 }
                i.d$b r1 = new i.d$b     // Catch:{ all -> 0x0082 }
                r1.<init>()     // Catch:{ all -> 0x0082 }
                r1.start()     // Catch:{ all -> 0x0082 }
            L_0x0019:
                long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
                r3 = 0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0033
                if (r10 == 0) goto L_0x0033
                long r3 = r7.deadlineNanoTime()     // Catch:{ all -> 0x0082 }
                long r3 = r3 - r1
                long r8 = java.lang.Math.min(r8, r3)     // Catch:{ all -> 0x0082 }
            L_0x002e:
                long r8 = r8 + r1
                r7.timeoutAt = r8     // Catch:{ all -> 0x0082 }
                goto L_0x003f
            L_0x0033:
                if (r5 == 0) goto L_0x0036
                goto L_0x002e
            L_0x0036:
                if (r10 == 0) goto L_0x007c
                long r8 = r7.deadlineNanoTime()     // Catch:{ all -> 0x0082 }
                r7.timeoutAt = r8     // Catch:{ all -> 0x0082 }
            L_0x003f:
                long r8 = r7.remainingNanos(r1)     // Catch:{ all -> 0x0082 }
                i.d r10 = p493i.C10593d.head     // Catch:{ all -> 0x0082 }
            L_0x0047:
                p455g.p470y.p472d.C10457l.m35317b(r10)     // Catch:{ all -> 0x0082 }
                i.d r3 = r10.next     // Catch:{ all -> 0x0082 }
                if (r3 == 0) goto L_0x0065
                i.d r3 = r10.next     // Catch:{ all -> 0x0082 }
                p455g.p470y.p472d.C10457l.m35317b(r3)     // Catch:{ all -> 0x0082 }
                long r3 = r3.remainingNanos(r1)     // Catch:{ all -> 0x0082 }
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x0060
                goto L_0x0065
            L_0x0060:
                i.d r10 = r10.next     // Catch:{ all -> 0x0082 }
                goto L_0x0047
            L_0x0065:
                i.d r8 = r10.next     // Catch:{ all -> 0x0082 }
                r7.next = r8     // Catch:{ all -> 0x0082 }
                r10.next = r7     // Catch:{ all -> 0x0082 }
                i.d r7 = p493i.C10593d.head     // Catch:{ all -> 0x0082 }
                if (r10 != r7) goto L_0x0078
                r0.notify()     // Catch:{ all -> 0x0082 }
            L_0x0078:
                g.s r7 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0082 }
                monitor-exit(r0)
                return
            L_0x007c:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0082 }
                r7.<init>()     // Catch:{ all -> 0x0082 }
                throw r7     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p493i.C10593d.C10594a.m35974e(i.d, long, boolean):void");
        }

        /* renamed from: c */
        public final C10593d mo26289c() {
            Class<C10593d> cls = C10593d.class;
            C10593d access$getHead$cp = C10593d.head;
            C10457l.m35317b(access$getHead$cp);
            C10593d access$getNext$p = access$getHead$cp.next;
            long nanoTime = System.nanoTime();
            if (access$getNext$p == null) {
                cls.wait(C10593d.IDLE_TIMEOUT_MILLIS);
                C10593d access$getHead$cp2 = C10593d.head;
                C10457l.m35317b(access$getHead$cp2);
                if (access$getHead$cp2.next != null || System.nanoTime() - nanoTime < C10593d.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C10593d.head;
            }
            long access$remainingNanos = access$getNext$p.remainingNanos(nanoTime);
            if (access$remainingNanos > 0) {
                long j = access$remainingNanos / 1000000;
                cls.wait(j, (int) (access$remainingNanos - (1000000 * j)));
                return null;
            }
            C10593d access$getHead$cp3 = C10593d.head;
            C10457l.m35317b(access$getHead$cp3);
            access$getHead$cp3.next = access$getNext$p.next;
            access$getNext$p.next = null;
            return access$getNext$p;
        }
    }

    /* renamed from: i.d$b */
    private static final class C10595b extends Thread {
        public C10595b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.timedOut();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<i.d> r0 = p493i.C10593d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                i.d$a r1 = p493i.C10593d.Companion     // Catch:{ all -> 0x001e }
                i.d r1 = r1.mo26289c()     // Catch:{ all -> 0x001e }
                i.d r2 = p493i.C10593d.head     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p493i.C10593d.head = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                g.s r2 = p455g.C10323s.f27547a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p493i.C10593d.C10595b.run():void");
        }
    }

    /* renamed from: i.d$c */
    public static final class C10596c implements C10590b0 {

        /* renamed from: f */
        final /* synthetic */ C10593d f28030f;

        /* renamed from: o */
        final /* synthetic */ C10590b0 f28031o;

        C10596c(C10593d dVar, C10590b0 b0Var) {
            this.f28030f = dVar;
            this.f28031o = b0Var;
        }

        /* renamed from: a */
        public C10593d timeout() {
            return this.f28030f;
        }

        public void close() {
            C10593d dVar = this.f28030f;
            dVar.enter();
            try {
                this.f28031o.close();
                C10323s sVar = C10323s.f27547a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.exit()) {
                    e = dVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = dVar.exit();
            }
        }

        public void flush() {
            C10593d dVar = this.f28030f;
            dVar.enter();
            try {
                this.f28031o.flush();
                C10323s sVar = C10323s.f27547a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.exit()) {
                    e = dVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f28031o + ')';
        }

        public void write(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "source");
            C10591c.m35966b(fVar.size(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C10636y yVar = fVar.f28034f;
                    while (true) {
                        C10457l.m35317b(yVar);
                        if (j2 >= ((long) C10593d.TIMEOUT_WRITE_SIZE)) {
                            break;
                        }
                        j2 += (long) (yVar.f28092d - yVar.f28091c);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        yVar = yVar.f28095g;
                    }
                    C10593d dVar = this.f28030f;
                    dVar.enter();
                    try {
                        this.f28031o.write(fVar, j2);
                        C10323s sVar = C10323s.f27547a;
                        if (!dVar.exit()) {
                            j -= j2;
                        } else {
                            throw dVar.access$newTimeoutException((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (dVar.exit()) {
                            e = dVar.access$newTimeoutException(e);
                        }
                        throw e;
                    } finally {
                        boolean exit = dVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i.d$d */
    public static final class C10597d implements C10598d0 {

        /* renamed from: f */
        final /* synthetic */ C10593d f28032f;

        /* renamed from: o */
        final /* synthetic */ C10598d0 f28033o;

        C10597d(C10593d dVar, C10598d0 d0Var) {
            this.f28032f = dVar;
            this.f28033o = d0Var;
        }

        /* renamed from: a */
        public C10593d timeout() {
            return this.f28032f;
        }

        public void close() {
            C10593d dVar = this.f28032f;
            dVar.enter();
            try {
                this.f28033o.close();
                C10323s sVar = C10323s.f27547a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.exit()) {
                    e = dVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = dVar.exit();
            }
        }

        public long read(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "sink");
            C10593d dVar = this.f28032f;
            dVar.enter();
            try {
                long read = this.f28033o.read(fVar, j);
                if (!dVar.exit()) {
                    return read;
                }
                throw dVar.access$newTimeoutException((IOException) null);
            } catch (IOException e) {
                e = e;
                if (dVar.exit()) {
                    e = dVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f28033o + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                Companion.m35974e(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return Companion.m35973d(this);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final C10590b0 sink(C10590b0 b0Var) {
        C10457l.m35320e(b0Var, "sink");
        return new C10596c(this, b0Var);
    }

    public final C10598d0 source(C10598d0 d0Var) {
        C10457l.m35320e(d0Var, "source");
        return new C10597d(this, d0Var);
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public final <T> T withTimeout(C10419a<? extends T> aVar) {
        C10457l.m35320e(aVar, "block");
        enter();
        try {
            T invoke = aVar.invoke();
            C10456k.m35315b(1);
            if (!exit()) {
                C10456k.m35314a(1);
                return invoke;
            }
            throw access$newTimeoutException((IOException) null);
        } catch (IOException e) {
            e = e;
            if (exit()) {
                e = access$newTimeoutException(e);
            }
            throw e;
        } catch (Throwable th) {
            C10456k.m35315b(1);
            boolean exit = exit();
            C10456k.m35314a(1);
            throw th;
        }
    }
}
