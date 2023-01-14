package p027c.p043d.p044a.p046l1.p050o;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p043d.p044a.p046l1.C1585j;
import p027c.p043d.p044a.p046l1.C1587k;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1595b;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1597d;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1599f;
import p027c.p043d.p044a.p046l1.p050o.C1665t0;
import p027c.p043d.p044a.p046l1.p052q.C1690a;
import p027c.p043d.p044a.p046l1.p052q.C1691b;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.a.l1.o.x0 */
public class C1675x0 {

    /* renamed from: a */
    private static final Range<Long> f5023a = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: b */
    final String f5024b;

    /* renamed from: c */
    final Object f5025c = new Object();

    /* renamed from: d */
    final boolean f5026d;

    /* renamed from: e */
    private final MediaFormat f5027e;

    /* renamed from: f */
    final MediaCodec f5028f;

    /* renamed from: g */
    final C1663s0 f5029g;

    /* renamed from: h */
    final Executor f5030h;

    /* renamed from: i */
    final Queue<Integer> f5031i = new ArrayDeque();

    /* renamed from: j */
    private final Queue<C1814b.C1815a<C1686y0>> f5032j = new ArrayDeque();

    /* renamed from: k */
    private final Set<C1686y0> f5033k = new HashSet();

    /* renamed from: l */
    final Set<C1659q0> f5034l = new HashSet();

    /* renamed from: m */
    final Deque<Range<Long>> f5035m = new ArrayDeque();

    /* renamed from: n */
    C1670v0 f5036n = C1670v0.f5017a;

    /* renamed from: o */
    Executor f5037o = C0744a.m3044a();

    /* renamed from: p */
    C1681e f5038p;

    /* renamed from: q */
    Range<Long> f5039q = f5023a;

    /* renamed from: r */
    long f5040r = 0;

    /* renamed from: s */
    private boolean f5041s = false;

    /* renamed from: t */
    private boolean f5042t = false;

    /* renamed from: u */
    final C1691b f5043u;

    /* renamed from: c.d.a.l1.o.x0$a */
    class C1676a implements C0765d<C1686y0> {

        /* renamed from: c.d.a.l1.o.x0$a$a */
        class C1677a implements C0765d<Void> {
            C1677a() {
            }

            /* renamed from: b */
            public void mo1981b(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    C1675x0.this.mo5879e((MediaCodec.CodecException) th);
                } else {
                    C1675x0.this.mo5878d(0, th.getMessage(), th);
                }
            }

            /* renamed from: c */
            public void mo1980a(Void voidR) {
            }
        }

        C1676a() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C1675x0.this.mo5878d(0, "Unable to acquire InputBuffer.", th);
        }

        /* renamed from: c */
        public void mo1980a(C1686y0 y0Var) {
            y0Var.mo5915d(C1675x0.m7193b());
            y0Var.mo5912b(true);
            y0Var.mo5913c();
            C0768f.m3075a(y0Var.mo5911a(), new C1677a(), C1675x0.this.f5030h);
        }
    }

    /* renamed from: c.d.a.l1.o.x0$b */
    static /* synthetic */ class C1678b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5046a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.d.a.l1.o.x0$e[] r0 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5046a = r0
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.CONFIGURED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.PAUSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.STOPPING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.PENDING_START_PAUSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.PENDING_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x0054 }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.PENDING_RELEASE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x0060 }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.ERROR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5046a     // Catch:{ NoSuchFieldError -> 0x006c }
                c.d.a.l1.o.x0$e r1 = p027c.p043d.p044a.p046l1.p050o.C1675x0.C1681e.RELEASED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.p046l1.p050o.C1675x0.C1678b.<clinit>():void");
        }
    }

    /* renamed from: c.d.a.l1.o.x0$c */
    private static class C1679c {
        /* renamed from: a */
        static Surface m7241a() {
            return MediaCodec.createPersistentInputSurface();
        }

        /* renamed from: b */
        static void m7242b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* renamed from: c.d.a.l1.o.x0$d */
    class C1680d implements C1661r0 {

        /* renamed from: a */
        private final Map<C0796d2.C0797a<? super C1585j.C1586a>, Executor> f5047a = new LinkedHashMap();

        /* renamed from: b */
        private C1585j.C1586a f5048b = C1585j.C1586a.INACTIVE;

        /* renamed from: c */
        private final List<C9172b<C1686y0>> f5049c = new ArrayList();

        C1680d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo5891h(C9172b bVar) {
            this.f5049c.remove(bVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo5892j(C1814b.C1815a aVar) {
            IllegalStateException illegalStateException;
            C1585j.C1586a aVar2 = this.f5048b;
            if (aVar2 == C1585j.C1586a.ACTIVE) {
                C9172b<C1686y0> a = C1675x0.this.mo5876a();
                C0768f.m3084j(a, aVar);
                aVar.mo6306a(new C1654o(a), C0744a.m3044a());
                this.f5049c.add(a);
                a.mo2919e(new C1639j(this, a), C1675x0.this.f5030h);
                return;
            }
            if (aVar2 == C1585j.C1586a.INACTIVE) {
                illegalStateException = new IllegalStateException("BufferProvider is not active.");
            } else {
                illegalStateException = new IllegalStateException("Unknown state: " + this.f5048b);
            }
            aVar.mo6310f(illegalStateException);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ Object mo5893l(C1814b.C1815a aVar) {
            C1675x0.this.f5030h.execute(new C1643l(this, aVar));
            return "acquireBuffer";
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void mo5894o(C0796d2.C0797a aVar, Executor executor) {
            this.f5047a.put((C0796d2.C0797a) C1177h.m4583e(aVar), (Executor) C1177h.m4583e(executor));
            executor.execute(new C1650n(aVar, this.f5048b));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void mo5895q(C1814b.C1815a aVar) {
            aVar.mo6308c(this.f5048b);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ Object mo5896s(C1814b.C1815a aVar) {
            C1675x0.this.f5030h.execute(new C1656p(this, aVar));
            return "fetchData";
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void mo5897u(C0796d2.C0797a aVar) {
            this.f5047a.remove(C1177h.m4583e(aVar));
        }

        /* renamed from: a */
        public void mo2974a(C0796d2.C0797a<? super C1585j.C1586a> aVar) {
            C1675x0.this.f5030h.execute(new C1635h(this, aVar));
        }

        /* renamed from: c */
        public C9172b<C1686y0> mo5766c() {
            return C1814b.m7736a(new C1646m(this));
        }

        /* renamed from: d */
        public C9172b<C1585j.C1586a> mo2975d() {
            return C1814b.m7736a(new C1658q(this));
        }

        /* renamed from: e */
        public void mo2976e(Executor executor, C0796d2.C0797a<? super C1585j.C1586a> aVar) {
            C1675x0.this.f5030h.execute(new C1637i(this, aVar, executor));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5898w(boolean z) {
            C1585j.C1586a aVar = z ? C1585j.C1586a.ACTIVE : C1585j.C1586a.INACTIVE;
            if (this.f5048b != aVar) {
                this.f5048b = aVar;
                if (aVar == C1585j.C1586a.INACTIVE) {
                    for (C9172b<C1686y0> cancel : this.f5049c) {
                        cancel.cancel(true);
                    }
                    this.f5049c.clear();
                }
                for (Map.Entry next : this.f5047a.entrySet()) {
                    try {
                        ((Executor) next.getValue()).execute(new C1641k(next, aVar));
                    } catch (RejectedExecutionException e) {
                        C0949o2.m3691d(C1675x0.this.f5024b, "Unable to post to the supplied executor.", e);
                    }
                }
            }
        }
    }

    /* renamed from: c.d.a.l1.o.x0$e */
    enum C1681e {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* renamed from: c.d.a.l1.o.x0$f */
    class C1682f extends MediaCodec.Callback {

        /* renamed from: a */
        private final C1690a f5061a;

        /* renamed from: b */
        private boolean f5062b = false;

        /* renamed from: c */
        private boolean f5063c = false;

        /* renamed from: d */
        private boolean f5064d = false;

        /* renamed from: e */
        private long f5065e = 0;

        /* renamed from: f */
        private long f5066f = 0;

        /* renamed from: g */
        private boolean f5067g = false;

        /* renamed from: c.d.a.l1.o.x0$f$a */
        class C1683a implements C0765d<Void> {

            /* renamed from: a */
            final /* synthetic */ C1659q0 f5069a;

            C1683a(C1659q0 q0Var) {
                this.f5069a = q0Var;
            }

            /* renamed from: b */
            public void mo1981b(Throwable th) {
                C1675x0.this.f5034l.remove(this.f5069a);
                if (th instanceof MediaCodec.CodecException) {
                    C1675x0.this.mo5879e((MediaCodec.CodecException) th);
                } else {
                    C1675x0.this.mo5878d(0, th.getMessage(), th);
                }
            }

            /* renamed from: c */
            public void mo1980a(Void voidR) {
                C1675x0.this.f5034l.remove(this.f5069a);
            }
        }

        C1682f() {
            this.f5061a = (!C1675x0.this.f5026d || C1597d.m7053a(C1595b.class) == null) ? null : new C1690a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo5899b(MediaCodec.CodecException codecException) {
            switch (C1678b.f5046a[C1675x0.this.f5038p.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C1675x0.this.mo5879e(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C1675x0.this.f5038p);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo5900d(int i) {
            switch (C1678b.f5046a[C1675x0.this.f5038p.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C1675x0.this.f5031i.offer(Integer.valueOf(i));
                    C1675x0.this.mo5863G();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C1675x0.this.f5038p);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo5901f(Executor executor, C1670v0 v0Var) {
            if (C1675x0.this.f5038p != C1681e.ERROR) {
                try {
                    Objects.requireNonNull(v0Var);
                    executor.execute(new C1617a(v0Var));
                } catch (RejectedExecutionException e) {
                    C0949o2.m3691d(C1675x0.this.f5024b, "Unable to post to the supplied executor.", e);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo5902h(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            C1670v0 v0Var;
            Executor executor;
            switch (C1678b.f5046a[C1675x0.this.f5038p.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C1675x0.this.f5025c) {
                        C1675x0 x0Var = C1675x0.this;
                        v0Var = x0Var.f5036n;
                        executor = x0Var.f5037o;
                    }
                    C1690a aVar = this.f5061a;
                    if (aVar != null) {
                        aVar.mo5918a(bufferInfo);
                    }
                    if (!this.f5062b) {
                        this.f5062b = true;
                        try {
                            Objects.requireNonNull(v0Var);
                            executor.execute(new C1642k0(v0Var));
                        } catch (RejectedExecutionException e) {
                            C0949o2.m3691d(C1675x0.this.f5024b, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (!m7275p(bufferInfo)) {
                        if (!this.f5063c) {
                            this.f5063c = true;
                        }
                        long j = C1675x0.this.f5040r;
                        if (j > 0) {
                            bufferInfo.presentationTimeUs -= j;
                        }
                        this.f5066f = bufferInfo.presentationTimeUs;
                        try {
                            m7274o(new C1659q0(mediaCodec, i, bufferInfo), v0Var, executor);
                        } catch (MediaCodec.CodecException e2) {
                            C1675x0.this.mo5879e(e2);
                            return;
                        }
                    } else {
                        C1675x0.this.f5028f.releaseOutputBuffer(i, false);
                    }
                    if (!this.f5064d && C1675x0.m7194g(bufferInfo)) {
                        this.f5064d = true;
                        C1675x0.this.mo5874V(new C1669v(this, executor, v0Var));
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C1675x0.this.f5038p);
            }
        }

        /* renamed from: i */
        static /* synthetic */ MediaFormat m7269i(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void mo5903l(MediaFormat mediaFormat) {
            C1670v0 v0Var;
            Executor executor;
            switch (C1678b.f5046a[C1675x0.this.f5038p.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C1675x0.this.f5025c) {
                        C1675x0 x0Var = C1675x0.this;
                        v0Var = x0Var.f5036n;
                        executor = x0Var.f5037o;
                    }
                    try {
                        executor.execute(new C1687z(v0Var, mediaFormat));
                        return;
                    } catch (RejectedExecutionException e) {
                        C0949o2.m3691d(C1675x0.this.f5024b, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C1675x0.this.f5038p);
            }
        }

        /* renamed from: o */
        private void m7274o(C1659q0 q0Var, C1670v0 v0Var, Executor executor) {
            C1675x0.this.f5034l.add(q0Var);
            C0768f.m3075a(q0Var.mo5852a(), new C1683a(q0Var), C1675x0.this.f5030h);
            try {
                executor.execute(new C1618a0(v0Var, q0Var));
            } catch (RejectedExecutionException e) {
                C0949o2.m3691d(C1675x0.this.f5024b, "Unable to post to the supplied executor.", e);
                q0Var.close();
            }
        }

        /* renamed from: p */
        private boolean m7275p(MediaCodec.BufferInfo bufferInfo) {
            if (this.f5064d) {
                C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by already reach end of stream.");
                return true;
            } else if (bufferInfo.size <= 0) {
                C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by invalid buffer size.");
                return true;
            } else if ((bufferInfo.flags & 2) != 0) {
                C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by codec config.");
                return true;
            } else {
                long j = bufferInfo.presentationTimeUs;
                if (j <= this.f5065e) {
                    C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by out of order buffer from MediaCodec.");
                    return true;
                }
                this.f5065e = j;
                if (!C1675x0.this.f5039q.contains(Long.valueOf(j))) {
                    C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by not in start-stop range.");
                    return true;
                } else if (m7276q(bufferInfo)) {
                    C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by pause.");
                    return true;
                } else if (this.f5063c || !C1675x0.this.f5026d || C1675x0.m7195i(bufferInfo)) {
                    return false;
                } else {
                    C0949o2.m3688a(C1675x0.this.f5024b, "Drop buffer by first video frame is not key frame.");
                    C1675x0.this.mo5868M();
                    return true;
                }
            }
        }

        /* renamed from: q */
        private boolean m7276q(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            C1670v0 v0Var;
            C1675x0.this.mo5875W(bufferInfo.presentationTimeUs);
            boolean h = C1675x0.this.mo5881h(bufferInfo.presentationTimeUs);
            boolean z = this.f5067g;
            if (!z && h) {
                C0949o2.m3688a(C1675x0.this.f5024b, "Switch to pause state");
                this.f5067g = true;
                synchronized (C1675x0.this.f5025c) {
                    C1675x0 x0Var = C1675x0.this;
                    executor = x0Var.f5037o;
                    v0Var = x0Var.f5036n;
                }
                executor.execute(new C1664t(v0Var));
                C1675x0 x0Var2 = C1675x0.this;
                if (x0Var2.f5038p == C1681e.PAUSED) {
                    C1663s0 s0Var = x0Var2.f5029g;
                    if (s0Var instanceof C1680d) {
                        ((C1680d) s0Var).mo5898w(false);
                    }
                    C1675x0.this.mo5870P(true);
                }
            } else if (z && !h) {
                if (!C1675x0.this.f5026d || C1675x0.m7195i(bufferInfo)) {
                    long j = bufferInfo.presentationTimeUs;
                    C1675x0 x0Var3 = C1675x0.this;
                    int i = ((j - x0Var3.f5040r) > this.f5066f ? 1 : ((j - x0Var3.f5040r) == this.f5066f ? 0 : -1));
                    String str = x0Var3.f5024b;
                    if (i > 0) {
                        C0949o2.m3688a(str, "Switch to resume state");
                        this.f5067g = false;
                    } else {
                        C0949o2.m3688a(str, "Adjusted time by pause duration is invalid.");
                    }
                } else {
                    C0949o2.m3688a(C1675x0.this.f5024b, "Not a key frame, don't switch to resume state.");
                    C1675x0.this.mo5868M();
                }
            }
            return this.f5067g;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C1675x0.this.f5030h.execute(new C1667u(this, codecException));
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            C1675x0.this.f5030h.execute(new C1672w(this, i));
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            C1675x0.this.f5030h.execute(new C1621b0(this, bufferInfo, mediaCodec, i));
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C1675x0.this.f5030h.execute(new C1674x(this, mediaFormat));
        }
    }

    /* renamed from: c.d.a.l1.o.x0$g */
    class C1684g implements C1665t0 {

        /* renamed from: a */
        private final Object f5071a = new Object();

        /* renamed from: b */
        private Surface f5072b;

        /* renamed from: c */
        private final Set<Surface> f5073c = new HashSet();

        /* renamed from: d */
        private C1665t0.C1666a f5074d;

        /* renamed from: e */
        private Executor f5075e;

        C1684g() {
        }

        /* renamed from: c */
        private void m7286c(Executor executor, C1665t0.C1666a aVar, Surface surface) {
            try {
                executor.execute(new C1628d0(aVar, surface));
            } catch (RejectedExecutionException e) {
                C0949o2.m3691d(C1675x0.this.f5024b, "Unable to post to the supplied executor.", e);
            }
        }

        /* renamed from: b */
        public void mo5855b(Executor executor, C1665t0.C1666a aVar) {
            Surface surface;
            synchronized (this.f5071a) {
                this.f5074d = (C1665t0.C1666a) C1177h.m4583e(aVar);
                this.f5075e = (Executor) C1177h.m4583e(executor);
                surface = this.f5072b;
            }
            if (surface != null) {
                m7286c(executor, aVar, surface);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5909d() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.f5071a) {
                surface = this.f5072b;
                this.f5072b = null;
                hashSet = new HashSet<>(this.f5073c);
                this.f5073c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface release : hashSet) {
                release.release();
            }
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        /* renamed from: e */
        public void mo5910e() {
            Surface surface;
            C1665t0.C1666a aVar;
            Executor executor;
            C1599f fVar = (C1599f) C1597d.m7053a(C1599f.class);
            synchronized (this.f5071a) {
                if (fVar == null) {
                    if (this.f5072b == null) {
                        surface = C1679c.m7241a();
                        this.f5072b = surface;
                    } else {
                        surface = null;
                    }
                    C1679c.m7242b(C1675x0.this.f5028f, this.f5072b);
                } else {
                    Surface surface2 = this.f5072b;
                    if (surface2 != null) {
                        this.f5073c.add(surface2);
                    }
                    surface = C1675x0.this.f5028f.createInputSurface();
                    this.f5072b = surface;
                }
                aVar = this.f5074d;
                executor = this.f5075e;
            }
            if (surface != null && aVar != null && executor != null) {
                m7286c(executor, aVar, surface);
            }
        }
    }

    public C1675x0(Executor executor, C1673w0 w0Var) {
        C1663s0 gVar;
        C1691b bVar = new C1691b();
        this.f5043u = bVar;
        C1177h.m4583e(executor);
        C1177h.m4583e(w0Var);
        this.f5030h = C0744a.m3050g(executor);
        if (w0Var instanceof C1644l0) {
            this.f5024b = "AudioEncoder";
            this.f5026d = false;
            gVar = new C1680d();
        } else if (w0Var instanceof C1625c1) {
            this.f5024b = "VideoEncoder";
            this.f5026d = true;
            gVar = new C1684g();
        } else {
            throw new C1619a1("Unknown encoder config type");
        }
        this.f5029g = gVar;
        MediaFormat a = w0Var.mo5793a();
        this.f5027e = a;
        String str = this.f5024b;
        C0949o2.m3688a(str, "mMediaFormat = " + a);
        MediaCodec a2 = bVar.mo5919a(a, new MediaCodecList(1));
        this.f5028f = a2;
        String str2 = this.f5024b;
        C0949o2.m3692e(str2, "Selected encoder: " + a2.getName());
        try {
            m7190N();
            m7191Q(C1681e.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new C1619a1((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void mo5860B() {
        C1681e eVar;
        switch (C1678b.f5046a[this.f5038p.ordinal()]) {
            case 1:
                long b = m7193b();
                String str = this.f5024b;
                C0949o2.m3688a(str, "Start on " + C1587k.m7036h(b));
                try {
                    if (this.f5041s) {
                        m7190N();
                    }
                    this.f5039q = Range.create(Long.valueOf(b), Long.MAX_VALUE);
                    this.f5028f.start();
                    C1663s0 s0Var = this.f5029g;
                    if (s0Var instanceof C1680d) {
                        ((C1680d) s0Var).mo5898w(true);
                        break;
                    }
                } catch (MediaCodec.CodecException e) {
                    mo5879e(e);
                    return;
                }
                break;
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                Range removeLast = this.f5035m.removeLast();
                C1177h.m4586h(removeLast != null && ((Long) removeLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                long longValue = ((Long) removeLast.getLower()).longValue();
                long b2 = m7193b();
                this.f5035m.addLast(Range.create(Long.valueOf(longValue), Long.valueOf(b2)));
                String str2 = this.f5024b;
                C0949o2.m3688a(str2, "Resume on " + C1587k.m7036h(b2) + "\nPaused duration = " + C1587k.m7036h(b2 - longValue));
                mo5870P(false);
                C1663s0 s0Var2 = this.f5029g;
                if (s0Var2 instanceof C1680d) {
                    ((C1680d) s0Var2).mo5898w(true);
                }
                if (this.f5026d) {
                    mo5868M();
                    break;
                }
                break;
            case 4:
            case 5:
                eVar = C1681e.PENDING_START;
                break;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f5038p);
        }
        eVar = C1681e.STARTED;
        m7191Q(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo5861D() {
        switch (C1678b.f5046a[this.f5038p.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return;
            case 2:
            case 3:
                m7191Q(C1681e.STOPPING);
                C1663s0 s0Var = this.f5029g;
                boolean z = false;
                if (s0Var instanceof C1680d) {
                    ((C1680d) s0Var).mo5898w(false);
                    ArrayList arrayList = new ArrayList();
                    for (C1686y0 a : this.f5033k) {
                        arrayList.add(a.mo5911a());
                    }
                    C0768f.m3087m(arrayList).mo2919e(new C1632f0(this), this.f5030h);
                } else if (s0Var instanceof C1684g) {
                    try {
                        this.f5028f.signalEndOfInputStream();
                    } catch (MediaCodec.CodecException e) {
                        mo5879e(e);
                        return;
                    }
                }
                long longValue = this.f5039q.getLower().longValue();
                if (longValue != Long.MAX_VALUE) {
                    z = true;
                }
                C1177h.m4586h(z, "There should be a \"start\" before \"stop\"");
                long b = m7193b();
                this.f5039q = Range.create(Long.valueOf(longValue), Long.valueOf(b));
                String str = this.f5024b;
                C0949o2.m3688a(str, "Stop on " + C1587k.m7036h(b));
                return;
            case 5:
            case 6:
                m7191Q(C1681e.CONFIGURED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f5038p);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo5862F(Runnable runnable) {
        if (!(this.f5029g instanceof C1684g) || this.f5042t) {
            this.f5028f.stop();
        } else {
            this.f5028f.flush();
            this.f5041s = true;
        }
        if (runnable != null) {
            runnable.run();
        }
        mo5880f();
    }

    /* renamed from: K */
    private void m7189K() {
        if (this.f5041s) {
            this.f5028f.stop();
            this.f5041s = false;
        }
        this.f5028f.release();
        C1663s0 s0Var = this.f5029g;
        if (s0Var instanceof C1684g) {
            ((C1684g) s0Var).mo5909d();
        }
        m7191Q(C1681e.RELEASED);
    }

    /* renamed from: N */
    private void m7190N() {
        this.f5039q = f5023a;
        this.f5040r = 0;
        this.f5035m.clear();
        this.f5031i.clear();
        for (C1814b.C1815a d : this.f5032j) {
            d.mo6309d();
        }
        this.f5032j.clear();
        this.f5028f.reset();
        this.f5041s = false;
        this.f5042t = false;
        this.f5028f.setCallback(new C1682f());
        this.f5028f.configure(this.f5027e, (Surface) null, (MediaCrypto) null, 1);
        C1663s0 s0Var = this.f5029g;
        if (s0Var instanceof C1684g) {
            ((C1684g) s0Var).mo5910e();
        }
    }

    /* renamed from: Q */
    private void m7191Q(C1681e eVar) {
        if (this.f5038p != eVar) {
            String str = this.f5024b;
            C0949o2.m3688a(str, "Transitioning encoder internal state: " + this.f5038p + " --> " + eVar);
            this.f5038p = eVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m7192R() {
        C0768f.m3075a(mo5876a(), new C1676a(), this.f5030h);
    }

    /* renamed from: b */
    static long m7193b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    /* renamed from: g */
    static boolean m7194g(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    /* renamed from: i */
    static boolean m7195i(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void mo5882k(C1814b.C1815a aVar) {
        this.f5032j.remove(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo5884q(C1688z0 z0Var) {
        this.f5033k.remove(z0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo5885t() {
        C1681e eVar;
        switch (C1678b.f5046a[this.f5038p.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                long b = m7193b();
                String str = this.f5024b;
                C0949o2.m3688a(str, "Pause on " + C1587k.m7036h(b));
                this.f5035m.addLast(Range.create(Long.valueOf(b), Long.MAX_VALUE));
                eVar = C1681e.PAUSED;
                break;
            case 6:
                eVar = C1681e.PENDING_START_PAUSED;
                break;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f5038p);
        }
        m7191Q(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo5886v() {
        switch (C1678b.f5046a[this.f5038p.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                m7189K();
                return;
            case 4:
            case 5:
            case 6:
                m7191Q(C1681e.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f5038p);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo5887x() {
        int i = C1678b.f5046a[this.f5038p.ordinal()];
        if (i == 2) {
            mo5868M();
        } else if (i == 7 || i == 9) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void mo5888z() {
        this.f5042t = true;
        if (this.f5041s) {
            this.f5028f.stop();
            m7190N();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo5863G() {
        while (!this.f5032j.isEmpty() && !this.f5031i.isEmpty()) {
            C1814b.C1815a poll = this.f5032j.poll();
            try {
                C1688z0 z0Var = new C1688z0(this.f5028f, this.f5031i.poll().intValue());
                if (poll.mo6308c(z0Var)) {
                    this.f5033k.add(z0Var);
                    z0Var.mo5911a().mo2919e(new C1638i0(this, z0Var), this.f5030h);
                } else {
                    z0Var.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                mo5879e(e);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void m7198m(int i, String str, Throwable th) {
        C1670v0 v0Var;
        Executor executor;
        synchronized (this.f5025c) {
            v0Var = this.f5036n;
            executor = this.f5037o;
        }
        try {
            executor.execute(new C1633g(v0Var, i, str, th));
        } catch (RejectedExecutionException e) {
            C0949o2.m3691d(this.f5024b, "Unable to post to the supplied executor.", e);
        }
    }

    /* renamed from: I */
    public void mo5865I() {
        this.f5030h.execute(new C1623c(this));
    }

    /* renamed from: J */
    public void mo5866J() {
        this.f5030h.execute(new C1627d(this));
    }

    /* renamed from: L */
    public void mo5867L() {
        this.f5030h.execute(new C1662s(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo5868M() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f5028f.setParameters(bundle);
    }

    /* renamed from: O */
    public void mo5869O(C1670v0 v0Var, Executor executor) {
        synchronized (this.f5025c) {
            this.f5036n = v0Var;
            this.f5037o = executor;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo5870P(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.f5028f.setParameters(bundle);
    }

    /* renamed from: S */
    public void mo5871S() {
        this.f5030h.execute(new C1634g0(this));
    }

    /* renamed from: T */
    public void mo5872T() {
        this.f5030h.execute(new C1630e0(this));
    }

    /* renamed from: U */
    public void mo5873U() {
        this.f5030h.execute(new C1629e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo5874V(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        for (C1659q0 a : this.f5034l) {
            arrayList.add(a.mo5852a());
        }
        for (C1686y0 a2 : this.f5033k) {
            arrayList.add(a2.mo5911a());
        }
        C0768f.m3087m(arrayList).mo2919e(new C1624c0(this, runnable), this.f5030h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo5875W(long j) {
        while (!this.f5035m.isEmpty()) {
            Range first = this.f5035m.getFirst();
            if (j > ((Long) first.getUpper()).longValue()) {
                this.f5035m.removeFirst();
                this.f5040r += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
                C0949o2.m3688a(this.f5024b, "Total paused duration = " + C1587k.m7036h(this.f5040r));
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9172b<C1686y0> mo5876a() {
        IllegalStateException illegalStateException;
        switch (C1678b.f5046a[this.f5038p.ordinal()]) {
            case 1:
                illegalStateException = new IllegalStateException("Encoder is not started yet.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                AtomicReference atomicReference = new AtomicReference();
                C9172b<C1686y0> a = C1814b.m7736a(new C1660r(atomicReference));
                C1814b.C1815a aVar = (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference.get());
                this.f5032j.offer(aVar);
                aVar.mo6306a(new C1636h0(this, aVar), this.f5030h);
                mo5863G();
                return a;
            case 8:
                illegalStateException = new IllegalStateException("Encoder is in error state.");
                break;
            case 9:
                illegalStateException = new IllegalStateException("Encoder is released.");
                break;
            default:
                throw new IllegalStateException("Unknown state: " + this.f5038p);
        }
        return C0768f.m3079e(illegalStateException);
    }

    /* renamed from: c */
    public C1663s0 mo5877c() {
        return this.f5029g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5878d(int i, String str, Throwable th) {
        switch (C1678b.f5046a[this.f5038p.ordinal()]) {
            case 1:
                m7198m(i, str, th);
                m7190N();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m7191Q(C1681e.ERROR);
                mo5874V(new C1631f(this, i, str, th));
                return;
            case 8:
                String str2 = this.f5024b;
                C0949o2.m3699l(str2, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5879e(MediaCodec.CodecException codecException) {
        mo5878d(1, codecException.getMessage(), codecException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5880f() {
        C1681e eVar = this.f5038p;
        if (eVar == C1681e.PENDING_RELEASE) {
            m7189K();
            return;
        }
        if (!this.f5041s) {
            m7190N();
        }
        m7191Q(C1681e.CONFIGURED);
        if (eVar == C1681e.PENDING_START || eVar == C1681e.PENDING_START_PAUSED) {
            mo5872T();
            if (eVar == C1681e.PENDING_START_PAUSED) {
                mo5865I();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5881h(long j) {
        for (Range next : this.f5035m) {
            if (!next.contains(Long.valueOf(j))) {
                if (j < ((Long) next.getLower()).longValue()) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
