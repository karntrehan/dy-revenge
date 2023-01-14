package p027c.p043d.p044a;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.C0711a0;
import androidx.camera.core.impl.C0785b2;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.C0864q2;
import androidx.camera.core.impl.p014a3.C0717c;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1170a;
import androidx.core.util.C1177h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p043d.p044a.C1523d1;
import p027c.p043d.p044a.C1543h1;
import p027c.p043d.p044a.C1715t0;
import p027c.p043d.p044a.p046l1.C1572g;
import p027c.p043d.p044a.p046l1.C1581h;
import p027c.p043d.p044a.p046l1.C1588l;
import p027c.p043d.p044a.p046l1.p047m.C1590b;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1596c;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1597d;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1599f;
import p027c.p043d.p044a.p046l1.p049n.C1607e;
import p027c.p043d.p044a.p046l1.p049n.C1608f;
import p027c.p043d.p044a.p046l1.p049n.C1612h;
import p027c.p043d.p044a.p046l1.p049n.C1615j;
import p027c.p043d.p044a.p046l1.p049n.C1616k;
import p027c.p043d.p044a.p046l1.p050o.C1619a1;
import p027c.p043d.p044a.p046l1.p050o.C1622b1;
import p027c.p043d.p044a.p046l1.p050o.C1625c1;
import p027c.p043d.p044a.p046l1.p050o.C1655o0;
import p027c.p043d.p044a.p046l1.p050o.C1657p0;
import p027c.p043d.p044a.p046l1.p050o.C1661r0;
import p027c.p043d.p044a.p046l1.p050o.C1663s0;
import p027c.p043d.p044a.p046l1.p050o.C1665t0;
import p027c.p043d.p044a.p046l1.p050o.C1668u0;
import p027c.p043d.p044a.p046l1.p050o.C1670v0;
import p027c.p043d.p044a.p046l1.p050o.C1675x0;
import p027c.p043d.p044a.p046l1.p051p.C1689a;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.a.a1 */
public final class C1502a1 implements C1543h1 {

    /* renamed from: a */
    private static final Set<C1513j> f4673a = Collections.unmodifiableSet(EnumSet.of(C1513j.PENDING_RECORDING, C1513j.PENDING_PAUSED));

    /* renamed from: b */
    private static final Set<C1513j> f4674b = Collections.unmodifiableSet(EnumSet.of(C1513j.INITIALIZING, C1513j.IDLING, C1513j.RESETTING, C1513j.STOPPING));

    /* renamed from: c */
    public static final C1731z0 f4675c;

    /* renamed from: d */
    private static final C1559j1 f4676d;

    /* renamed from: e */
    private static final C1715t0 f4677e;

    /* renamed from: f */
    private static final Exception f4678f = new RuntimeException("The video frame producer became inactive before any data was received.");

    /* renamed from: A */
    Integer f4679A = null;

    /* renamed from: B */
    Surface f4680B = null;

    /* renamed from: C */
    MediaMuxer f4681C = null;

    /* renamed from: D */
    final C0785b2<C1715t0> f4682D;

    /* renamed from: E */
    C1572g f4683E = null;

    /* renamed from: F */
    C1675x0 f4684F = null;

    /* renamed from: G */
    C1622b1 f4685G = null;

    /* renamed from: H */
    C1675x0 f4686H = null;

    /* renamed from: I */
    C1622b1 f4687I = null;

    /* renamed from: J */
    C1509g f4688J = C1509g.INITIALIZING;

    /* renamed from: K */
    Uri f4689K = Uri.EMPTY;

    /* renamed from: L */
    long f4690L = 0;

    /* renamed from: M */
    long f4691M = 0;

    /* renamed from: N */
    long f4692N = 0;

    /* renamed from: O */
    long f4693O = 0;

    /* renamed from: P */
    int f4694P = 1;

    /* renamed from: Q */
    Throwable f4695Q = null;

    /* renamed from: R */
    C1657p0 f4696R = null;

    /* renamed from: S */
    C1657p0 f4697S = null;

    /* renamed from: T */
    Throwable f4698T = null;

    /* renamed from: U */
    boolean f4699U = false;

    /* renamed from: g */
    private final C0785b2<C1523d1> f4700g;

    /* renamed from: h */
    private final Executor f4701h;

    /* renamed from: i */
    private final Executor f4702i;

    /* renamed from: j */
    final Executor f4703j;

    /* renamed from: k */
    private final Object f4704k = new Object();

    /* renamed from: l */
    private C1513j f4705l = C1513j.INITIALIZING;

    /* renamed from: m */
    private C1513j f4706m = null;

    /* renamed from: n */
    C1511i f4707n = null;

    /* renamed from: o */
    C1511i f4708o = null;

    /* renamed from: p */
    private C1543h1.C1544a f4709p = C1543h1.C1544a.INACTIVE;

    /* renamed from: q */
    private Throwable f4710q;

    /* renamed from: r */
    private long f4711r = 0;

    /* renamed from: s */
    private C1814b.C1815a<Void> f4712s = null;

    /* renamed from: t */
    private C1511i f4713t = null;

    /* renamed from: u */
    private boolean f4714u;

    /* renamed from: v */
    boolean f4715v = false;

    /* renamed from: w */
    private C1011z2.C1018g f4716w = null;

    /* renamed from: x */
    private C0711a0 f4717x = null;

    /* renamed from: y */
    final List<C9172b<Void>> f4718y = new ArrayList();

    /* renamed from: z */
    Integer f4719z = null;

    /* renamed from: c.d.a.a1$a */
    class C1503a implements C1572g.C1577e {
        C1503a() {
        }

        /* renamed from: a */
        public void mo5596a(Throwable th) {
            if (th instanceof C1581h) {
                C1502a1.this.mo5585o0(C1509g.DISABLED);
                C1502a1.this.mo5562B0();
            }
        }

        /* renamed from: b */
        public void mo5597b(boolean z) {
            C1502a1 a1Var = C1502a1.this;
            if (a1Var.f4699U != z) {
                a1Var.f4699U = z;
                a1Var.f4698T = z ? new IllegalStateException("The audio source has been silenced.") : null;
                C1502a1.this.mo5562B0();
                return;
            }
            C0949o2.m3698k("Recorder", "Audio source silenced transitions to the same state " + z);
        }
    }

    /* renamed from: c.d.a.a1$b */
    class C1504b implements C1670v0 {

        /* renamed from: b */
        final /* synthetic */ C1814b.C1815a f4721b;

        /* renamed from: c */
        final /* synthetic */ C1511i f4722c;

        C1504b(C1814b.C1815a aVar, C1511i iVar) {
            this.f4721b = aVar;
            this.f4722c = iVar;
        }

        /* renamed from: a */
        public void mo5598a() {
        }

        /* renamed from: b */
        public void mo5599b(C1622b1 b1Var) {
            C1502a1.this.f4685G = b1Var;
        }

        /* renamed from: c */
        public void mo5600c(C1655o0 o0Var) {
            this.f4721b.mo6310f(o0Var);
        }

        /* renamed from: d */
        public void mo5601d() {
            this.f4721b.mo6308c(null);
        }

        /* renamed from: e */
        public void mo5602e(C1657p0 p0Var) {
            C1502a1 a1Var = C1502a1.this;
            if (a1Var.f4681C != null) {
                try {
                    a1Var.mo5565E0(p0Var, this.f4722c);
                    if (p0Var == null) {
                        return;
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else if (!a1Var.f4715v) {
                boolean z = false;
                C1657p0 p0Var2 = a1Var.f4696R;
                if (p0Var2 != null) {
                    z = true;
                    p0Var2.close();
                    C1502a1.this.f4696R = null;
                }
                if (p0Var.mo5847H()) {
                    C1502a1 a1Var2 = C1502a1.this;
                    a1Var2.f4696R = p0Var;
                    if (!a1Var2.mo5584o() || C1502a1.this.f4697S != null) {
                        C0949o2.m3688a("Recorder", "Received video keyframe. Starting muxer...");
                        C1502a1.this.mo5588q0(this.f4722c);
                        return;
                    }
                    C0949o2.m3688a("Recorder", z ? "Replaced cached video keyframe with newer keyframe." : "Cached video keyframe while we wait for first audio sample before starting muxer.");
                    return;
                }
                if (z) {
                    C0949o2.m3688a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                C0949o2.m3688a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                C1502a1.this.f4684F.mo5867L();
            } else {
                C0949o2.m3688a("Recorder", "Drop video data since recording is stopping.");
            }
            p0Var.close();
            return;
            throw th;
        }

        /* renamed from: f */
        public /* synthetic */ void mo5603f() {
            C1668u0.m7172a(this);
        }
    }

    /* renamed from: c.d.a.a1$c */
    class C1505c implements C1670v0 {

        /* renamed from: b */
        final /* synthetic */ C1814b.C1815a f4724b;

        /* renamed from: c */
        final /* synthetic */ C1511i f4725c;

        C1505c(C1814b.C1815a aVar, C1511i iVar) {
            this.f4724b = aVar;
            this.f4725c = iVar;
        }

        /* renamed from: a */
        public void mo5598a() {
        }

        /* renamed from: b */
        public void mo5599b(C1622b1 b1Var) {
            C1502a1.this.f4687I = b1Var;
        }

        /* renamed from: c */
        public void mo5600c(C1655o0 o0Var) {
            C1502a1.this.mo5585o0(C1509g.ERROR);
            C1502a1 a1Var = C1502a1.this;
            a1Var.f4698T = o0Var;
            a1Var.mo5562B0();
            this.f4724b.mo6308c(null);
        }

        /* renamed from: d */
        public void mo5601d() {
            this.f4724b.mo6308c(null);
        }

        /* renamed from: e */
        public void mo5602e(C1657p0 p0Var) {
            C1502a1 a1Var = C1502a1.this;
            if (a1Var.f4688J != C1509g.DISABLED) {
                if (a1Var.f4681C != null) {
                    try {
                        a1Var.mo5564D0(p0Var, this.f4725c);
                        if (p0Var == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else if (!a1Var.f4715v) {
                    boolean z = false;
                    C1657p0 p0Var2 = a1Var.f4697S;
                    if (p0Var2 != null) {
                        z = true;
                        p0Var2.close();
                        C1502a1.this.f4697S = null;
                    }
                    C1502a1 a1Var2 = C1502a1.this;
                    a1Var2.f4697S = p0Var;
                    if (a1Var2.f4696R != null) {
                        C0949o2.m3688a("Recorder", "Received audio data. Starting muxer...");
                        C1502a1.this.mo5588q0(this.f4725c);
                        return;
                    }
                    C0949o2.m3688a("Recorder", z ? "Replaced cached audio data with newer data." : "Cached audio data while we wait for video keyframe before starting muxer.");
                    return;
                } else {
                    C0949o2.m3688a("Recorder", "Drop audio data since recording is stopping.");
                }
                p0Var.close();
                return;
            }
            throw new AssertionError("Audio is not enabled but audio encoded data is produced.");
            throw th;
        }

        /* renamed from: f */
        public /* synthetic */ void mo5603f() {
            C1668u0.m7172a(this);
        }
    }

    /* renamed from: c.d.a.a1$d */
    class C1506d implements C0765d<List<Void>> {
        C1506d() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C0949o2.m3688a("Recorder", "Encodings end with error: " + th);
            C1502a1.this.mo5580f(6, th);
        }

        /* renamed from: c */
        public void mo1980a(List<Void> list) {
            C0949o2.m3688a("Recorder", "Encodings end successfully.");
            C1502a1 a1Var = C1502a1.this;
            a1Var.mo5580f(a1Var.f4694P, a1Var.f4695Q);
        }
    }

    /* renamed from: c.d.a.a1$e */
    class C1507e implements C0765d<Void> {
        C1507e() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C0949o2.m3689b("Recorder", "The source didn't become non-streaming with error.", th);
            if (C1597d.m7053a(C1596c.class) != null) {
                C1502a1.this.f4684F.mo5871S();
            }
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            C1502a1.this.f4684F.mo5871S();
        }
    }

    /* renamed from: c.d.a.a1$f */
    static /* synthetic */ class C1508f {

        /* renamed from: a */
        static final /* synthetic */ int[] f4729a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4730b;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        static {
            /*
                c.d.a.a1$g[] r0 = p027c.p043d.p044a.C1502a1.C1509g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4730b = r0
                r1 = 1
                c.d.a.a1$g r2 = p027c.p043d.p044a.C1502a1.C1509g.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4730b     // Catch:{ NoSuchFieldError -> 0x001d }
                c.d.a.a1$g r3 = p027c.p043d.p044a.C1502a1.C1509g.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4730b     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.d.a.a1$g r4 = p027c.p043d.p044a.C1502a1.C1509g.DISABLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f4730b     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.d.a.a1$g r5 = p027c.p043d.p044a.C1502a1.C1509g.IDLING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f4730b     // Catch:{ NoSuchFieldError -> 0x003e }
                c.d.a.a1$g r6 = p027c.p043d.p044a.C1502a1.C1509g.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                c.d.a.a1$j[] r5 = p027c.p043d.p044a.C1502a1.C1513j.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4729a = r5
                c.d.a.a1$j r6 = p027c.p043d.p044a.C1502a1.C1513j.STOPPING     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f4729a     // Catch:{ NoSuchFieldError -> 0x0059 }
                c.d.a.a1$j r5 = p027c.p043d.p044a.C1502a1.C1513j.RESETTING     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x0063 }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.PENDING_RECORDING     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x006d }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.PENDING_PAUSED     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x0077 }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x0082 }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.IDLING     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x008d }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.RECORDING     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x0099 }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.PAUSED     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f4729a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.ERROR     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.C1508f.<clinit>():void");
        }
    }

    /* renamed from: c.d.a.a1$g */
    enum C1509g {
        INITIALIZING,
        IDLING,
        DISABLED,
        ACTIVE,
        ERROR
    }

    /* renamed from: c.d.a.a1$h */
    public static final class C1510h {

        /* renamed from: a */
        private final C1715t0.C1716a f4737a = C1715t0.m7347a();

        /* renamed from: b */
        private Executor f4738b = null;

        /* renamed from: a */
        public C1502a1 mo5606a() {
            return new C1502a1(this.f4738b, this.f4737a.mo5704a());
        }

        /* renamed from: c */
        public C1510h mo5607c(Executor executor) {
            C1177h.m4584f(executor, "The specified executor can't be null.");
            this.f4738b = executor;
            return this;
        }

        /* renamed from: d */
        public C1510h mo5608d(C1731z0 z0Var) {
            C1177h.m4584f(z0Var, "The specified quality selector can't be null.");
            this.f4737a.mo5946b(new C1517c(z0Var));
            return this;
        }
    }

    /* renamed from: c.d.a.a1$i */
    static abstract class C1511i implements AutoCloseable {

        /* renamed from: f */
        private final C0717c f4739f = C0717c.m2967b();

        /* renamed from: o */
        private final AtomicBoolean f4740o = new AtomicBoolean(false);

        /* renamed from: p */
        private final AtomicReference<C1512a> f4741p = new AtomicReference<>((Object) null);

        /* renamed from: q */
        private final AtomicReference<C1170a<Uri>> f4742q = new AtomicReference<>(C1698p.f5105a);

        /* renamed from: c.d.a.a1$i$a */
        private interface C1512a {
            /* renamed from: a */
            MediaMuxer mo5621a(int i, C1170a<Uri> aVar);
        }

        C1511i() {
        }

        /* renamed from: W */
        static /* synthetic */ MediaMuxer m6768W(C1721v0 v0Var, ParcelFileDescriptor parcelFileDescriptor, int i, C1170a aVar) {
            MediaMuxer mediaMuxer;
            MediaMuxer mediaMuxer2;
            Uri uri = Uri.EMPTY;
            if (v0Var instanceof C1710s0) {
                File b = ((C1710s0) v0Var).mo5940b();
                if (!C1689a.m7303a(b)) {
                    C0949o2.m3698k("Recorder", "Failed to create folder for " + b.getAbsolutePath());
                }
                mediaMuxer = new MediaMuxer(b.getAbsolutePath(), i);
                uri = Uri.fromFile(b);
            } else if (v0Var instanceof C1707r0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaMuxer = C1590b.m7040a(parcelFileDescriptor.getFileDescriptor(), i);
                } else {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
            } else if (v0Var instanceof C1718u0) {
                C1718u0 u0Var = (C1718u0) v0Var;
                ContentValues contentValues = new ContentValues(u0Var.mo5950d());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    contentValues.put("is_pending", 1);
                }
                Uri insert = u0Var.mo5949c().insert(u0Var.mo5948b(), contentValues);
                if (insert != null) {
                    ContentResolver c = u0Var.mo5949c();
                    if (i2 < 26) {
                        String b2 = C1689a.m7304b(c, insert, "_data");
                        if (b2 != null) {
                            if (!C1689a.m7303a(new File(b2))) {
                                C0949o2.m3698k("Recorder", "Failed to create folder for " + b2);
                            }
                            mediaMuxer2 = new MediaMuxer(b2, i);
                        } else {
                            throw new IOException("Unable to get path from uri " + insert);
                        }
                    } else {
                        ParcelFileDescriptor openFileDescriptor = c.openFileDescriptor(insert, "rw");
                        mediaMuxer2 = C1590b.m7040a(openFileDescriptor.getFileDescriptor(), i);
                        openFileDescriptor.close();
                    }
                    uri = insert;
                    mediaMuxer = mediaMuxer2;
                } else {
                    throw new IOException("Unable to create MediaStore entry.");
                }
            } else {
                throw new AssertionError("Invalid output options type: " + v0Var.getClass().getSimpleName());
            }
            aVar.mo2687a(uri);
            return mediaMuxer;
        }

        /* renamed from: X */
        static /* synthetic */ void m6769X(C1718u0 u0Var, Uri uri) {
            if (!uri.equals(Uri.EMPTY)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_pending", 0);
                u0Var.mo5949c().update(uri, contentValues, (String) null, (String[]) null);
            }
        }

        /* renamed from: b */
        private void m6770b(C1170a<Uri> aVar, Uri uri) {
            if (aVar != null) {
                this.f4739f.mo2823a();
                aVar.mo2687a(uri);
                return;
            }
            throw new AssertionError("Recording " + this + " has already been finalized");
        }

        /* renamed from: e0 */
        static /* synthetic */ void m6771e0(String str, Uri uri) {
            if (uri == null) {
                C0949o2.m3690c("Recorder", String.format("File scanning operation failed [path: %s]", new Object[]{str}));
                return;
            }
            C0949o2.m3688a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", new Object[]{str, uri}));
        }

        /* renamed from: h */
        static C1511i m6772h(C1725x0 x0Var, long j) {
            return new C1693m0(x0Var.mo5957d(), x0Var.mo5956c(), x0Var.mo5955b(), x0Var.mo5959f(), j);
        }

        /* renamed from: i0 */
        static /* synthetic */ void m6773i0(C1718u0 u0Var, Context context, Uri uri) {
            if (!uri.equals(Uri.EMPTY)) {
                String b = C1689a.m7304b(u0Var.mo5949c(), uri, "_data");
                if (b != null) {
                    MediaScannerConnection.scanFile(context, new String[]{b}, (String[]) null, C1694n.f5097a);
                    return;
                }
                C0949o2.m3688a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
            }
        }

        /* renamed from: n0 */
        static /* synthetic */ void m6774n0(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                C0949o2.m3691d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e);
            }
        }

        /* renamed from: s0 */
        static /* synthetic */ void m6775s0(Uri uri) {
        }

        /* access modifiers changed from: private */
        /* renamed from: u0 */
        public /* synthetic */ void mo5618v0(C1549i1 i1Var) {
            mo5617r().mo2687a(i1Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public abstract C1721v0 mo5609A();

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public abstract long mo5610E();

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public abstract boolean mo5611I();

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public void mo5612L(Context context) {
            if (!this.f4740o.getAndSet(true)) {
                C1721v0 A = mo5609A();
                boolean z = A instanceof C1707r0;
                Object obj = null;
                ParcelFileDescriptor dup = z ? ((C1707r0) A).mo5935b().dup() : null;
                this.f4739f.mo2824c("finalizeRecording");
                this.f4741p.set(new C1692m(A, dup));
                if (A instanceof C1718u0) {
                    C1718u0 u0Var = (C1718u0) A;
                    obj = Build.VERSION.SDK_INT >= 29 ? new C1555j(u0Var) : new C1561k(u0Var, context);
                } else if (z) {
                    obj = new C1564l(dup);
                }
                if (obj != null) {
                    this.f4742q.set(obj);
                    return;
                }
                return;
            }
            throw new AssertionError("Recording " + this + " has already been initialized");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5613a(Uri uri) {
            if (this.f4740o.get()) {
                m6770b(this.f4742q.getAndSet((Object) null), uri);
            }
        }

        public void close() {
            mo5613a(Uri.EMPTY);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                this.f4739f.mo2825d();
                C1170a andSet = this.f4742q.getAndSet((Object) null);
                if (andSet != null) {
                    m6770b(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public abstract Executor mo5616o();

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract C1170a<C1549i1> mo5617r();

        /* access modifiers changed from: package-private */
        /* renamed from: w0 */
        public MediaMuxer mo5619w0(int i, C1170a<Uri> aVar) {
            if (this.f4740o.get()) {
                C1512a andSet = this.f4741p.getAndSet((Object) null);
                if (andSet != null) {
                    return andSet.mo5621a(i, aVar);
                }
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording " + this + " has not been initialized");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x0 */
        public void mo5620x0(C1549i1 i1Var) {
            boolean equals = Objects.equals(i1Var.mo5691c(), mo5609A());
            C1177h.m4586h(equals, "Attempted to update event listener with event from incorrect recording [Recording: " + i1Var.mo5691c() + ", Expected: " + mo5609A() + "]");
            if (mo5616o() != null && mo5617r() != null) {
                try {
                    C0949o2.m3688a("Recorder", "Sent VideoRecordEvent " + i1Var.getClass());
                    mo5616o().execute(new C1696o(this, i1Var));
                } catch (RejectedExecutionException e) {
                    C0949o2.m3691d("Recorder", "The callback executor is invalid.", e);
                }
            }
        }
    }

    /* renamed from: c.d.a.a1$j */
    enum C1513j {
        INITIALIZING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C1727y0 y0Var = C1727y0.f5142c;
        C1731z0 f = C1731z0.m7390f(Arrays.asList(new C1727y0[]{y0Var, C1727y0.f5141b, C1727y0.f5140a}), C1703q0.m7333a(y0Var));
        f4675c = f;
        C1559j1 a = C1559j1.m6930a().mo5718e(f).mo5715b(1).mo5714a();
        f4676d = a;
        f4677e = C1715t0.m7347a().mo5707e(-1).mo5708f(a).mo5704a();
    }

    C1502a1(Executor executor, C1715t0 t0Var) {
        this.f4701h = executor;
        executor = executor == null ? C0744a.m3046c() : executor;
        this.f4702i = executor;
        this.f4703j = C0744a.m3050g(executor);
        this.f4682D = C0785b2.m3106i(m6681e(t0Var));
        this.f4700g = C0785b2.m3106i(C1523d1.m6816c(m6685h(), m6694n(this.f4705l)));
    }

    /* renamed from: C0 */
    private void m6663C0(C1513j jVar) {
        if (!f4673a.contains(this.f4705l)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f4705l);
        } else if (!f4674b.contains(jVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + jVar);
        } else if (this.f4706m != jVar) {
            this.f4706m = jVar;
            this.f4700g.mo2948h(C1523d1.m6816c(m6685h(), m6694n(jVar)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void mo5567H(Uri uri) {
        this.f4689K = uri;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void mo5568J(C1011z2 z2Var, Surface surface) {
        C0949o2.m3688a("Recorder", "Encoder surface updated: " + surface.hashCode() + ", Current surface: " + m6685h());
        synchronized (this.f4704k) {
            switch (C1508f.f4729a[this.f4705l.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                    m6675V(surface, z2Var);
                    break;
                case 7:
                case 8:
                    throw new AssertionError("Unexpected state on update of encoder surface " + this.f4705l);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void mo5569L(C1511i iVar) {
        mo5594y0(iVar, 0, (Throwable) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ Object mo5570N(AtomicReference atomicReference, C1814b.C1815a aVar) {
        synchronized (this.f4704k) {
            atomicReference.set(aVar);
            this.f4712s = aVar;
        }
        return "sourceInactive";
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void mo5571Q(C1814b.C1815a aVar) {
        this.f4703j.execute(new C1726y(aVar));
    }

    /* renamed from: T */
    private C1511i m6673T(C1513j jVar) {
        boolean z;
        if (jVar == C1513j.PENDING_PAUSED) {
            z = true;
        } else if (jVar == C1513j.PENDING_RECORDING) {
            z = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.f4707n == null) {
            C1511i iVar = this.f4708o;
            if (iVar != null) {
                this.f4707n = iVar;
                this.f4708o = null;
                mo5587p0(z ? C1513j.PAUSED : C1513j.RECORDING);
                return iVar;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    /* renamed from: U */
    private void m6674U(Throwable th) {
        C1511i iVar;
        synchronized (this.f4704k) {
            iVar = null;
            switch (C1508f.f4729a[this.f4705l.ordinal()]) {
                case 1:
                case 2:
                case 6:
                case 7:
                case 8:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f4705l + ": " + th);
                case 3:
                case 4:
                    C1511i iVar2 = this.f4708o;
                    this.f4708o = null;
                    iVar = iVar2;
                    break;
                case 5:
                    break;
            }
            mo5587p0(C1513j.ERROR);
            this.f4710q = th;
        }
        if (iVar != null) {
            m6683g(iVar, 7, th);
        }
    }

    /* renamed from: V */
    private void m6675V(Surface surface, C1011z2 z2Var) {
        Surface surface2 = this.f4680B;
        if (surface2 != surface) {
            this.f4680B = surface;
            if (surface2 == null) {
                z2Var.mo3298o(surface, this.f4703j, new C1722w(this));
                m6676X();
                return;
            }
            synchronized (this.f4704k) {
                this.f4700g.mo2948h(C1523d1.m6816c(m6685h(), m6694n(this.f4705l)));
            }
            return;
        }
        C0949o2.m3688a("Recorder", "Video encoder provides the same surface.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r1 = m6673T(r5.f4705l);
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6676X() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4704k
            monitor-enter(r0)
            int[] r1 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x0069 }
            c.d.a.a1$j r2 = r5.f4705l     // Catch:{ all -> 0x0069 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0069 }
            r1 = r1[r2]     // Catch:{ all -> 0x0069 }
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0052;
                case 2: goto L_0x0039;
                case 3: goto L_0x0032;
                case 4: goto L_0x0031;
                case 5: goto L_0x002b;
                case 6: goto L_0x0039;
                case 7: goto L_0x0039;
                case 8: goto L_0x0039;
                case 9: goto L_0x0012;
                default: goto L_0x0011;
            }     // Catch:{ all -> 0x0069 }
        L_0x0011:
            goto L_0x0061
        L_0x0012:
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r3.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = "onInitialized() was invoked when the Recorder had encountered error "
            r3.append(r4)     // Catch:{ all -> 0x0069 }
            java.lang.Throwable r4 = r5.f4710q     // Catch:{ all -> 0x0069 }
            r3.append(r4)     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0069 }
            androidx.camera.core.C0949o2.m3690c(r1, r3)     // Catch:{ all -> 0x0069 }
            goto L_0x0061
        L_0x002b:
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.IDLING     // Catch:{ all -> 0x0069 }
            r5.mo5587p0(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x0061
        L_0x0031:
            r2 = 1
        L_0x0032:
            c.d.a.a1$j r1 = r5.f4705l     // Catch:{ all -> 0x0069 }
            c.d.a.a1$i r1 = r5.m6673T(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x0062
        L_0x0039:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r2.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "Incorrectly invoke onInitialized() in state "
            r2.append(r3)     // Catch:{ all -> 0x0069 }
            c.d.a.a1$j r3 = r5.f4705l     // Catch:{ all -> 0x0069 }
            r2.append(r3)     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0069 }
            r1.<init>(r2)     // Catch:{ all -> 0x0069 }
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0052:
            boolean r1 = r5.f4714u     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0059
            r5.f4714u = r2     // Catch:{ all -> 0x0069 }
            goto L_0x0061
        L_0x0059:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = "Unexpectedly invoke onInitialized() in a STOPPING state when it's not waiting for a new surface."
            r1.<init>(r2)     // Catch:{ all -> 0x0069 }
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0061:
            r1 = 0
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0068
            r5.m6705w0(r1, r2)
        L_0x0068:
            return
        L_0x0069:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.m6676X():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r5.f4714u == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        androidx.camera.core.C0949o2.m3688a("Recorder", "Waiting for a new surface to start the pending recording.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r6 = m6673T(r5.f4705l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r2 = false;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6677Y(p027c.p043d.p044a.C1502a1.C1511i r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4704k
            monitor-enter(r0)
            c.d.a.a1$i r1 = r5.f4707n     // Catch:{ all -> 0x007e }
            if (r1 != r6) goto L_0x0076
            r6 = 0
            r5.f4707n = r6     // Catch:{ all -> 0x007e }
            int[] r1 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x007e }
            c.d.a.a1$j r2 = r5.f4705l     // Catch:{ all -> 0x007e }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x007e }
            r1 = r1[r2]     // Catch:{ all -> 0x007e }
            r2 = 1
            r3 = 0
            switch(r1) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0048;
                case 3: goto L_0x0033;
                case 4: goto L_0x0034;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x004e;
                case 8: goto L_0x004e;
                default: goto L_0x0019;
            }     // Catch:{ all -> 0x007e }
        L_0x0019:
            goto L_0x005b
        L_0x001a:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r2 = "Unexpected state on finalize of recording: "
            r1.append(r2)     // Catch:{ all -> 0x007e }
            c.d.a.a1$j r2 = r5.f4705l     // Catch:{ all -> 0x007e }
            r1.append(r2)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007e }
            r6.<init>(r1)     // Catch:{ all -> 0x007e }
            throw r6     // Catch:{ all -> 0x007e }
        L_0x0033:
            r2 = 0
        L_0x0034:
            boolean r1 = r5.f4714u     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = "Recorder"
            java.lang.String r4 = "Waiting for a new surface to start the pending recording."
            androidx.camera.core.C0949o2.m3688a(r1, r4)     // Catch:{ all -> 0x007e }
            goto L_0x0046
        L_0x0040:
            c.d.a.a1$j r6 = r5.f4705l     // Catch:{ all -> 0x007e }
            c.d.a.a1$i r6 = r5.m6673T(r6)     // Catch:{ all -> 0x007e }
        L_0x0046:
            r3 = r2
            goto L_0x005b
        L_0x0048:
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.INITIALIZING     // Catch:{ all -> 0x007e }
            r5.mo5587p0(r1)     // Catch:{ all -> 0x007e }
            goto L_0x005c
        L_0x004e:
            boolean r1 = r5.f4714u     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0058
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.INITIALIZING     // Catch:{ all -> 0x007e }
        L_0x0054:
            r5.mo5587p0(r1)     // Catch:{ all -> 0x007e }
            goto L_0x005b
        L_0x0058:
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.IDLING     // Catch:{ all -> 0x007e }
            goto L_0x0054
        L_0x005b:
            r2 = 0
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0063
            r5.m6682f0()
            goto L_0x0075
        L_0x0063:
            if (r6 == 0) goto L_0x0075
            boolean r0 = r5.f4714u
            if (r0 != 0) goto L_0x006d
            r5.m6705w0(r6, r3)
            goto L_0x0075
        L_0x006d:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = "Attempt to start a pending recording while the Recorder is waiting for a new surface request."
            r6.<init>(r0)
            throw r6
        L_0x0075:
            return
        L_0x0076:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "Active recording did not match finalized recording on finalize."
            r6.<init>(r1)     // Catch:{ all -> 0x007e }
            throw r6     // Catch:{ all -> 0x007e }
        L_0x007e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.m6677Y(c.d.a.a1$i):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m6678Z(C1011z2.C1017f fVar) {
        C0949o2.m3688a("Recorder", "Surface closed: " + fVar.mo2790b().hashCode() + ", Current surface: " + m6685h());
        Surface b = fVar.mo2790b();
        if (this.f4680B != b) {
            b.release();
            return;
        }
        mo5579e0();
        this.f4680B = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m6662C(C1511i iVar) {
        if (this.f4713t == iVar && !this.f4715v) {
            if (mo5584o()) {
                this.f4686H.mo5865I();
            }
            this.f4684F.mo5865I();
            C1511i iVar2 = this.f4713t;
            iVar2.mo5620x0(C1549i1.m6910e(iVar2.mo5609A(), mo5581i()));
        }
    }

    /* renamed from: d0 */
    private C1725x0 m6680d0(Context context, C1721v0 v0Var) {
        C1177h.m4584f(v0Var, "The OutputOptions cannot be null.");
        return new C1725x0(context, this, v0Var);
    }

    /* renamed from: e */
    private C1715t0 m6681e(C1715t0 t0Var) {
        C1715t0.C1716a i = t0Var.mo5702i();
        if (t0Var.mo5699d().mo5709b() == -1) {
            i.mo5946b(C1538g.f4811a);
        }
        return i.mo5704a();
    }

    /* renamed from: f0 */
    private void m6682f0() {
        C1675x0 x0Var = this.f4686H;
        if (x0Var != null) {
            x0Var.mo5866J();
            this.f4686H = null;
            this.f4687I = null;
        }
        C1675x0 x0Var2 = this.f4684F;
        if (x0Var2 != null) {
            x0Var2.mo5866J();
            this.f4684F = null;
            this.f4685G = null;
        }
        C1572g gVar = this.f4683E;
        if (gVar != null) {
            gVar.mo5742p();
            this.f4683E = null;
        }
        mo5585o0(C1509g.INITIALIZING);
    }

    /* renamed from: g */
    private void m6683g(C1511i iVar, int i, Throwable th) {
        iVar.mo5613a(Uri.EMPTY);
        iVar.mo5620x0(C1549i1.m6909b(iVar.mo5609A(), C1519c1.m6801d(0, 0, C1526e0.m6820c(1, this.f4698T)), C1723w0.m7369b(Uri.EMPTY), i, th));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: c.d.a.l1.n.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: c.d.a.l1.n.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: c.d.a.l1.n.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: c.d.a.l1.n.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p027c.p043d.p044a.p046l1.p050o.C1644l0 m6684g0(p027c.p043d.p044a.p046l1.p049n.C1612h r7, p027c.p043d.p044a.p046l1.C1572g.C1579g r8, p027c.p043d.p044a.C1521d0 r9) {
        /*
            androidx.camera.core.impl.a0 r0 = r7.mo5775b()
            if (r0 == 0) goto L_0x001b
            c.d.a.l1.n.c r0 = new c.d.a.l1.n.c
            java.lang.String r2 = r7.mo5776c()
            int r3 = r7.mo5777d()
            androidx.camera.core.impl.a0 r6 = r7.mo5775b()
            r1 = r0
            r4 = r9
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0028
        L_0x001b:
            c.d.a.l1.n.d r0 = new c.d.a.l1.n.d
            java.lang.String r1 = r7.mo5776c()
            int r7 = r7.mo5777d()
            r0.<init>(r1, r7, r9, r8)
        L_0x0028:
            java.lang.Object r7 = r0.get()
            c.d.a.l1.o.l0 r7 = (p027c.p043d.p044a.p046l1.p050o.C1644l0) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.m6684g0(c.d.a.l1.n.h, c.d.a.l1.g$g, c.d.a.d0):c.d.a.l1.o.l0");
    }

    /* renamed from: h */
    private Integer m6685h() {
        Surface surface = this.f4680B;
        return Integer.valueOf(surface == null ? C1523d1.f4770a.intValue() : surface.hashCode());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p027c.p043d.p044a.p046l1.p049n.C1612h m6686h0(p027c.p043d.p044a.C1715t0 r10) {
        /*
            r9 = this;
            int r0 = r10.mo5698c()
            java.lang.String r0 = p027c.p043d.p044a.C1715t0.m7348e(r0)
            int r1 = r10.mo5698c()
            int r1 = p027c.p043d.p044a.C1715t0.m7349f(r1)
            androidx.camera.core.impl.a0 r2 = r9.f4717x
            r3 = 1
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r2.mo2800e()
            androidx.camera.core.impl.a0 r4 = r9.f4717x
            int r4 = r4.mo2805j()
            java.lang.String r5 = ")]"
            java.lang.String r6 = "Recorder"
            java.lang.String r7 = "(profile: "
            if (r2 != 0) goto L_0x0045
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "CamcorderProfile contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
        L_0x002e:
            r10.append(r2)
            r10.append(r0)
            r10.append(r7)
            r10.append(r1)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.C0949o2.m3688a(r6, r10)
            goto L_0x0092
        L_0x0045:
            int r10 = r10.mo5698c()
            r8 = -1
            if (r10 != r8) goto L_0x006c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive AUDIO settings [mime type: "
        L_0x0053:
            r10.append(r0)
            r10.append(r2)
            r10.append(r7)
            r10.append(r4)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.C0949o2.m3688a(r6, r10)
            r0 = r2
            r1 = r4
            goto L_0x0093
        L_0x006c:
            boolean r10 = java.util.Objects.equals(r0, r2)
            if (r10 == 0) goto L_0x007c
            if (r1 != r4) goto L_0x007c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "MediaSpec audio mime/profile matches CamcorderProfile. Using CamcorderProfile to derive AUDIO settings [mime type: "
            goto L_0x0053
        L_0x007c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "MediaSpec audio mime or profile does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive AUDIO settings [CamcorderProfile mime type: "
            r10.append(r3)
            r10.append(r2)
            r10.append(r7)
            r10.append(r4)
            java.lang.String r2 = "), chosen mime type: "
            goto L_0x002e
        L_0x0092:
            r3 = 0
        L_0x0093:
            c.d.a.l1.n.h$a r10 = p027c.p043d.p044a.p046l1.p049n.C1612h.m7086a(r0)
            c.d.a.l1.n.h$a r10 = r10.mo5783c(r1)
            if (r3 == 0) goto L_0x00a2
            androidx.camera.core.impl.a0 r0 = r9.f4717x
            r10.mo5782b(r0)
        L_0x00a2:
            c.d.a.l1.n.h r10 = r10.mo5781a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.m6686h0(c.d.a.t0):c.d.a.l1.n.h");
    }

    /* renamed from: i0 */
    private static C1572g.C1579g m6687i0(C1612h hVar, C1521d0 d0Var) {
        return (C1572g.C1579g) (hVar.mo5775b() != null ? new C1607e(d0Var, hVar.mo5775b()) : new C1608f(d0Var)).get();
    }

    /* renamed from: j0 */
    private static C1625c1 m6688j0(C1612h hVar, C1559j1 j1Var, Size size) {
        return (C1625c1) (hVar.mo5775b() != null ? new C1615j(hVar.mo5776c(), j1Var, size, hVar.mo5775b()) : new C1616k(hVar.mo5776c(), j1Var, size)).get();
    }

    /* renamed from: k */
    private void m6689k(C1511i iVar) {
        this.f4718y.add(C1814b.m7736a(new C1528f(this, iVar)));
        if (mo5584o()) {
            this.f4718y.add(C1814b.m7736a(new C1720v(this, iVar)));
        }
        C0768f.m3075a(C0768f.m3076b(this.f4718y), new C1506d(), C0744a.m3044a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p027c.p043d.p044a.p046l1.p049n.C1612h m6690k0(p027c.p043d.p044a.C1715t0 r8) {
        /*
            r7 = this;
            int r0 = r8.mo5698c()
            java.lang.String r0 = p027c.p043d.p044a.C1715t0.m7351h(r0)
            androidx.camera.core.impl.a0 r1 = r7.f4717x
            java.lang.String r2 = "]"
            java.lang.String r3 = "Recorder"
            r4 = 0
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r1.mo2808m()
            r5 = 1
            if (r1 != 0) goto L_0x0020
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "CamcorderProfile contains undefined VIDEO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            goto L_0x0066
        L_0x0020:
            int r8 = r8.mo5698c()
            r6 = -1
            if (r8 != r6) goto L_0x0041
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: "
        L_0x002e:
            r8.append(r0)
            r8.append(r1)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.C0949o2.m3688a(r3, r8)
            r0 = r1
            r4 = 1
            goto L_0x0076
        L_0x0041:
            boolean r8 = java.util.Objects.equals(r0, r1)
            if (r8 == 0) goto L_0x004f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec video mime matches CamcorderProfile. Using CamcorderProfile to derive VIDEO settings [mime type: "
            goto L_0x002e
        L_0x004f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = "MediaSpec video mime does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive VIDEO settings [CamcorderProfile mime type: "
            r8.append(r5)
            r8.append(r1)
            java.lang.String r1 = ", chosen mime type: "
            goto L_0x0066
        L_0x005f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "No CamcorderProfile present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: "
        L_0x0066:
            r8.append(r1)
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.C0949o2.m3688a(r3, r8)
        L_0x0076:
            c.d.a.l1.n.h$a r8 = p027c.p043d.p044a.p046l1.p049n.C1612h.m7086a(r0)
            if (r4 == 0) goto L_0x0081
            androidx.camera.core.impl.a0 r0 = r7.f4717x
            r8.mo5782b(r0)
        L_0x0081:
            c.d.a.l1.n.h r8 = r8.mo5781a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.m6690k0(c.d.a.t0):c.d.a.l1.n.h");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m6661A(C1011z2 z2Var) {
        Surface surface = this.f4680B;
        if (surface != null) {
            z2Var.mo3298o(surface, this.f4703j, new C1722w(this));
            m6676X();
            return;
        }
        z2Var.mo3299p(this.f4703j, new C1706r(this));
        Size d = z2Var.mo3295d();
        C1527e1 c = C1527e1.m6824c(z2Var.mo3293b().mo2380a());
        C1727y0 b = c.mo5649b(d);
        C0949o2.m3688a("Recorder", "Using supported quality of " + b + " for surface size " + d);
        if (b != C1727y0.f5146g) {
            C0711a0 d2 = c.mo5650d(b);
            this.f4717x = d2;
            if (d2 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce CamcorderProfile for advertised quality.");
            }
        }
        m6701t0(z2Var);
    }

    /* renamed from: l0 */
    private void m6692l0() {
        if (f4673a.contains(this.f4705l)) {
            mo5587p0(this.f4706m);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f4705l);
    }

    /* renamed from: m */
    private int m6693m(C1509g gVar) {
        int i = C1508f.f4730b[gVar.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return this.f4699U ? 2 : 0;
        }
        if (i == 3 || i == 5) {
            return 1;
        }
        throw new AssertionError("Invalid internal audio state: " + gVar);
    }

    /* renamed from: n */
    private C1523d1.C1524a m6694n(C1513j jVar) {
        return (jVar == C1513j.RECORDING || (jVar == C1513j.STOPPING && ((C1596c) C1597d.m7053a(C1596c.class)) == null)) ? C1523d1.C1524a.ACTIVE : C1523d1.C1524a.INACTIVE;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m6664E(C1511i iVar) {
        if (this.f4713t == iVar && !this.f4715v) {
            if (mo5584o()) {
                this.f4686H.mo5872T();
            }
            this.f4684F.mo5872T();
            C1511i iVar2 = this.f4713t;
            iVar2.mo5620x0(C1549i1.m6911f(iVar2.mo5609A(), mo5581i()));
        }
    }

    /* renamed from: q */
    private static boolean m6696q(C1516b1 b1Var, C1511i iVar) {
        return iVar != null && b1Var.mo5628o() == iVar.mo5610E();
    }

    /* renamed from: r0 */
    private void m6698r0() {
        C1715t0 t0Var = (C1715t0) mo5582j(this.f4682D);
        C1612h h0 = m6686h0(t0Var);
        C1572g.C1579g i0 = m6687i0(h0, t0Var.mo5697b());
        try {
            this.f4683E = m6700s0(i0);
            try {
                C1675x0 x0Var = new C1675x0(this.f4702i, m6684g0(h0, i0, t0Var.mo5697b()));
                this.f4686H = x0Var;
                C1663s0 c = x0Var.mo5877c();
                if (c instanceof C1661r0) {
                    this.f4683E.mo5745t((C1661r0) c);
                    return;
                }
                throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
            } catch (C1619a1 e) {
                throw new C1588l(e);
            }
        } catch (C1581h e2) {
            throw new C1588l(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object mo5589t(C1511i iVar, C1814b.C1815a aVar) {
        this.f4686H.mo5869O(new C1505c(aVar, iVar), this.f4703j);
        return "audioEncodingFuture";
    }

    /* renamed from: s0 */
    private C1572g m6700s0(C1572g.C1579g gVar) {
        C1572g gVar2 = new C1572g(gVar, C0744a.m3046c());
        gVar2.mo5744s(this.f4703j, new C1503a());
        return gVar2;
    }

    /* renamed from: t0 */
    private void m6701t0(C1011z2 z2Var) {
        C1715t0 t0Var = (C1715t0) mo5582j(this.f4682D);
        try {
            C1675x0 x0Var = new C1675x0(this.f4702i, m6688j0(m6690k0(t0Var), t0Var.mo5699d(), z2Var.mo3295d()));
            this.f4684F = x0Var;
            C1663s0 c = x0Var.mo5877c();
            if (c instanceof C1665t0) {
                ((C1665t0) c).mo5855b(this.f4703j, new C1525e(this, z2Var));
                return;
            }
            throw new AssertionError("The EncoderInput of video isn't a SurfaceInput.");
        } catch (C1619a1 e) {
            z2Var.mo3301r();
            C0949o2.m3691d("Recorder", "Unable to initialize video encoder.", e);
            m6674U(new C1588l(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Object mo5591v(C1511i iVar, C1814b.C1815a aVar) {
        this.f4684F.mo5869O(new C1504b(aVar, iVar), this.f4703j);
        return "videoEncodingFuture";
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: v0 */
    private void m6703v0(C1511i iVar) {
        if (this.f4713t == null) {
            if (iVar.mo5609A().mo5934a() > 0) {
                this.f4693O = Math.round(((double) iVar.mo5609A().mo5934a()) * 0.95d);
                C0949o2.m3688a("Recorder", "File size limit in bytes: " + this.f4693O);
            } else {
                this.f4693O = 0;
            }
            this.f4713t = iVar;
            int i = C1508f.f4730b[this.f4688J.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f4688J);
            }
            if (i == 4) {
                mo5585o0(iVar.mo5611I() ? C1509g.ACTIVE : C1509g.DISABLED);
            } else if (i == 5 && iVar.mo5611I()) {
                if (mo5586p()) {
                    try {
                        m6698r0();
                        mo5585o0(C1509g.ACTIVE);
                    } catch (C1588l e) {
                        C0949o2.m3691d("Recorder", "Unable to create audio resource with error: ", e);
                        mo5585o0(C1509g.ERROR);
                        this.f4698T = e;
                    }
                } else {
                    throw new AssertionError("The Recorder doesn't support recording with audio");
                }
            }
            m6689k(iVar);
            if (mo5584o()) {
                this.f4683E.mo5747v();
                this.f4686H.mo5872T();
            }
            this.f4684F.mo5872T();
            C1511i iVar2 = this.f4713t;
            iVar2.mo5620x0(C1549i1.m6912g(iVar2.mo5609A(), mo5581i()));
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo5592x(C1011z2.C1018g gVar) {
        this.f4716w = gVar;
    }

    /* renamed from: w0 */
    private void m6705w0(C1511i iVar, boolean z) {
        m6703v0(iVar);
        if (z) {
            m6662C(iVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void mo5595z(C1511i iVar) {
        mo5594y0(iVar, 4, (Throwable) null);
    }

    /* renamed from: z0 */
    private static int m6707z0(C0711a0 a0Var, int i) {
        if (a0Var != null) {
            int h = a0Var.mo2803h();
            if (h == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (h == 2) {
                return 0;
            }
            if (h != 9) {
                return i;
            }
            return 1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo5560A0() {
        boolean z;
        C1511i iVar;
        synchronized (this.f4704k) {
            int i = C1508f.f4729a[this.f4705l.ordinal()];
            z = false;
            iVar = null;
            if (i != 3) {
                if (i == 4) {
                    z = true;
                }
            }
            if (this.f4707n == null) {
                iVar = m6673T(this.f4705l);
            }
        }
        if (iVar != null) {
            m6705w0(iVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo5562B0() {
        C1511i iVar = this.f4713t;
        if (iVar != null) {
            iVar.mo5620x0(C1549i1.m6913h(iVar.mo5609A(), mo5581i()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo5564D0(C1657p0 p0Var, C1511i iVar) {
        long size = this.f4690L + p0Var.size();
        long j = this.f4693O;
        if (j == 0 || size <= j) {
            this.f4681C.writeSampleData(this.f4719z.intValue(), p0Var.mo5850g(), p0Var.mo5846F());
            this.f4690L = size;
            return;
        }
        C0949o2.m3688a("Recorder", String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.f4693O)}));
        mo5572W(iVar, 2, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo5565E0(C1657p0 p0Var, C1511i iVar) {
        if (this.f4679A != null) {
            long size = this.f4690L + p0Var.size();
            long j = this.f4693O;
            if (j == 0 || size <= j) {
                this.f4681C.writeSampleData(this.f4679A.intValue(), p0Var.mo5850g(), p0Var.mo5846F());
                this.f4690L = size;
                if (this.f4692N == 0) {
                    this.f4692N = p0Var.mo5848a0();
                }
                this.f4691M = TimeUnit.MICROSECONDS.toNanos(p0Var.mo5848a0() - this.f4692N);
                mo5562B0();
                return;
            }
            C0949o2.m3688a("Recorder", String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.f4693O)}));
            mo5572W(iVar, 2, (Throwable) null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo5572W(C1511i iVar, int i, Throwable th) {
        if (iVar == this.f4713t) {
            boolean z = false;
            synchronized (this.f4704k) {
                switch (C1508f.f4729a[this.f4705l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 9:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f4705l);
                    case 7:
                    case 8:
                        mo5587p0(C1513j.STOPPING);
                        z = true;
                        break;
                }
                if (iVar != this.f4707n) {
                    throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                }
            }
            if (z) {
                mo5594y0(iVar, i, th);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    /* renamed from: a */
    public void mo5573a(C1011z2 z2Var) {
        synchronized (this.f4704k) {
            C0949o2.m3688a("Recorder", "Surface is requested in state: " + this.f4705l + ", Current surface: " + m6685h());
            switch (C1508f.f4729a[this.f4705l.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.f4703j.execute(new C1717u(this, z2Var));
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Surface was requested when the Recorder had been initialized with state " + this.f4705l);
                case 9:
                    throw new IllegalStateException("Surface was requested when the Recorder had encountered error " + this.f4710q);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        return;
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5574a0(p027c.p043d.p044a.C1516b1 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4704k
            monitor-enter(r0)
            c.d.a.a1$i r1 = r4.f4708o     // Catch:{ all -> 0x0078 }
            boolean r1 = m6696q(r5, r1)     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x002f
            c.d.a.a1$i r1 = r4.f4707n     // Catch:{ all -> 0x0078 }
            boolean r1 = m6696q(r5, r1)     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r2.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = "pause() called on a recording that is no longer active: "
            r2.append(r3)     // Catch:{ all -> 0x0078 }
            c.d.a.v0 r5 = r5.mo5627h()     // Catch:{ all -> 0x0078 }
            r2.append(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0078 }
            androidx.camera.core.C0949o2.m3688a(r1, r5)     // Catch:{ all -> 0x0078 }
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x002f:
            int[] r5 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x0078 }
            c.d.a.a1$j r1 = r4.f4705l     // Catch:{ all -> 0x0078 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0078 }
            r5 = r5[r1]     // Catch:{ all -> 0x0078 }
            r1 = 3
            if (r5 == r1) goto L_0x0071
            r1 = 5
            if (r5 == r1) goto L_0x0058
            r1 = 6
            if (r5 == r1) goto L_0x0058
            r1 = 7
            if (r5 == r1) goto L_0x0046
            goto L_0x0076
        L_0x0046:
            c.d.a.a1$j r5 = p027c.p043d.p044a.C1502a1.C1513j.PAUSED     // Catch:{ all -> 0x0078 }
            r4.mo5587p0(r5)     // Catch:{ all -> 0x0078 }
            c.d.a.a1$i r5 = r4.f4707n     // Catch:{ all -> 0x0078 }
            java.util.concurrent.Executor r1 = r4.f4703j     // Catch:{ all -> 0x0078 }
            c.d.a.s r2 = new c.d.a.s     // Catch:{ all -> 0x0078 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0078 }
            r1.execute(r2)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x0058:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r1.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "Called pause() from invalid state: "
            r1.append(r2)     // Catch:{ all -> 0x0078 }
            c.d.a.a1$j r2 = r4.f4705l     // Catch:{ all -> 0x0078 }
            r1.append(r2)     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0078 }
            r5.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x0078 }
        L_0x0071:
            c.d.a.a1$j r5 = p027c.p043d.p044a.C1502a1.C1513j.PENDING_PAUSED     // Catch:{ all -> 0x0078 }
            r4.mo5587p0(r5)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.mo5574a0(c.d.a.b1):void");
    }

    /* renamed from: b */
    public C0796d2<C1715t0> mo5575b() {
        return this.f4682D;
    }

    /* renamed from: c */
    public C0796d2<C1523d1> mo5576c() {
        return this.f4700g;
    }

    /* renamed from: c0 */
    public C1725x0 mo5577c0(Context context, C1710s0 s0Var) {
        return m6680d0(context, s0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0088, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        m6683g(r4, 4, f4678f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5578d(p027c.p043d.p044a.C1543h1.C1544a r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4704k
            monitor-enter(r0)
            c.d.a.h1$a r1 = r5.f4709p     // Catch:{ all -> 0x00a8 }
            r5.f4709p = r6     // Catch:{ all -> 0x00a8 }
            if (r1 == r6) goto L_0x0090
            java.lang.String r2 = "Recorder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r3.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = "Video source has transitioned to state: "
            r3.append(r4)     // Catch:{ all -> 0x00a8 }
            r3.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a8 }
            androidx.camera.core.C0949o2.m3688a(r2, r3)     // Catch:{ all -> 0x00a8 }
            c.d.a.h1$a r2 = p027c.p043d.p044a.C1543h1.C1544a.ACTIVE_STREAMING     // Catch:{ all -> 0x00a8 }
            r3 = 4
            r4 = 0
            if (r1 != r2) goto L_0x0087
            c.d.a.h1$a r1 = p027c.p043d.p044a.C1543h1.C1544a.INACTIVE     // Catch:{ all -> 0x00a8 }
            if (r6 != r1) goto L_0x0072
            int[] r6 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x00a8 }
            c.d.a.a1$j r1 = r5.f4705l     // Catch:{ all -> 0x00a8 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x00a8 }
            r6 = r6[r1]     // Catch:{ all -> 0x00a8 }
            r1 = 1
            if (r6 == r1) goto L_0x0061
            r1 = 2
            if (r6 == r1) goto L_0x0061
            r1 = 3
            if (r6 == r1) goto L_0x0058
            if (r6 == r3) goto L_0x0058
            r1 = 7
            if (r6 == r1) goto L_0x0046
            r1 = 8
            if (r6 == r1) goto L_0x0046
            goto L_0x0087
        L_0x0046:
            c.d.a.a1$j r6 = p027c.p043d.p044a.C1502a1.C1513j.STOPPING     // Catch:{ all -> 0x00a8 }
            r5.mo5587p0(r6)     // Catch:{ all -> 0x00a8 }
            c.d.a.a1$i r6 = r5.f4707n     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.Executor r1 = r5.f4703j     // Catch:{ all -> 0x00a8 }
            c.d.a.i r2 = new c.d.a.i     // Catch:{ all -> 0x00a8 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x00a8 }
            r1.execute(r2)     // Catch:{ all -> 0x00a8 }
            goto L_0x0087
        L_0x0058:
            c.d.a.a1$i r6 = r5.f4708o     // Catch:{ all -> 0x00a8 }
            r5.f4708o = r4     // Catch:{ all -> 0x00a8 }
            r5.m6692l0()     // Catch:{ all -> 0x00a8 }
            r4 = r6
            goto L_0x0087
        L_0x0061:
            java.lang.Object r6 = r5.f4704k     // Catch:{ all -> 0x00a8 }
            monitor-enter(r6)     // Catch:{ all -> 0x00a8 }
            c.g.a.b$a<java.lang.Void> r1 = r5.f4712s     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006d
            r1.mo6308c(r4)     // Catch:{ all -> 0x006f }
            r5.f4712s = r4     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x0087
        L_0x006f:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x0072:
            c.d.a.h1$a r1 = p027c.p043d.p044a.C1543h1.C1544a.ACTIVE_NON_STREAMING     // Catch:{ all -> 0x00a8 }
            if (r6 != r1) goto L_0x0087
            java.lang.Object r6 = r5.f4704k     // Catch:{ all -> 0x00a8 }
            monitor-enter(r6)     // Catch:{ all -> 0x00a8 }
            c.g.a.b$a<java.lang.Void> r1 = r5.f4712s     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0082
            r1.mo6308c(r4)     // Catch:{ all -> 0x0084 }
            r5.f4712s = r4     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x0087:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x008f
            java.lang.Exception r6 = f4678f
            r5.m6683g(r4, r3, r6)
        L_0x008f:
            return
        L_0x0090:
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r2.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "Video source transitions to the same state: "
            r2.append(r3)     // Catch:{ all -> 0x00a8 }
            r2.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00a8 }
            androidx.camera.core.C0949o2.m3688a(r1, r6)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a8:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.mo5578d(c.d.a.h1$a):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r2 = false;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5579e0() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4704k
            monitor-enter(r0)
            int[] r1 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x004c }
            c.d.a.a1$j r2 = r5.f4705l     // Catch:{ all -> 0x004c }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x004c }
            r1 = r1[r2]     // Catch:{ all -> 0x004c }
            r2 = 1
            r3 = 0
            switch(r1) {
                case 1: goto L_0x0035;
                case 2: goto L_0x0012;
                case 3: goto L_0x002f;
                case 4: goto L_0x002f;
                case 5: goto L_0x002d;
                case 6: goto L_0x0028;
                case 7: goto L_0x0013;
                case 8: goto L_0x0013;
                case 9: goto L_0x0028;
                default: goto L_0x0012;
            }     // Catch:{ all -> 0x004c }
        L_0x0012:
            goto L_0x003a
        L_0x0013:
            c.d.a.a1$i r1 = r5.f4707n     // Catch:{ all -> 0x004c }
            c.d.a.a1$i r4 = r5.f4713t     // Catch:{ all -> 0x004c }
            if (r1 != r4) goto L_0x0020
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.RESETTING     // Catch:{ all -> 0x004c }
            r5.mo5587p0(r1)     // Catch:{ all -> 0x004c }
            r1 = 1
            goto L_0x003b
        L_0x0020:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "In-progress recording does not match the active recording. Unable to reset encoder."
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            throw r1     // Catch:{ all -> 0x004c }
        L_0x0028:
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.INITIALIZING     // Catch:{ all -> 0x004c }
            r5.mo5587p0(r1)     // Catch:{ all -> 0x004c }
        L_0x002d:
            r1 = 0
            goto L_0x003c
        L_0x002f:
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.RESETTING     // Catch:{ all -> 0x004c }
            r5.m6663C0(r1)     // Catch:{ all -> 0x004c }
            goto L_0x002d
        L_0x0035:
            c.d.a.a1$j r1 = p027c.p043d.p044a.C1502a1.C1513j.RESETTING     // Catch:{ all -> 0x004c }
            r5.mo5587p0(r1)     // Catch:{ all -> 0x004c }
        L_0x003a:
            r1 = 0
        L_0x003b:
            r2 = 0
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0043
            r5.m6682f0()
            goto L_0x004b
        L_0x0043:
            if (r1 == 0) goto L_0x004b
            c.d.a.a1$i r0 = r5.f4713t
            r1 = 0
            r5.mo5594y0(r0, r3, r1)
        L_0x004b:
            return
        L_0x004c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.mo5579e0():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5580f(int i, Throwable th) {
        C1509g gVar;
        if (this.f4713t != null) {
            MediaMuxer mediaMuxer = this.f4681C;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.stop();
                    this.f4681C.release();
                } catch (IllegalStateException e) {
                    C0949o2.m3690c("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage());
                    if (i == 0) {
                        i = 1;
                    }
                }
                this.f4681C = null;
            } else if (i == 0) {
                i = 8;
            }
            this.f4713t.mo5613a(this.f4689K);
            C1721v0 A = this.f4713t.mo5609A();
            C1519c1 i2 = mo5581i();
            C1723w0 b = C1723w0.m7369b(this.f4689K);
            this.f4713t.mo5620x0(i == 0 ? C1549i1.m6908a(A, i2, b) : C1549i1.m6909b(A, i2, b, i, th));
            C1511i iVar = this.f4713t;
            this.f4713t = null;
            this.f4715v = false;
            this.f4719z = null;
            this.f4679A = null;
            this.f4718y.clear();
            this.f4689K = Uri.EMPTY;
            this.f4690L = 0;
            this.f4691M = 0;
            this.f4692N = 0;
            this.f4694P = 1;
            this.f4695Q = null;
            this.f4698T = null;
            int i3 = C1508f.f4730b[this.f4688J.ordinal()];
            if (i3 == 1) {
                gVar = C1509g.INITIALIZING;
            } else if (i3 == 2 || i3 == 3) {
                gVar = C1509g.IDLING;
            } else {
                if (i3 == 4) {
                    throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
                }
                m6677Y(iVar);
                return;
            }
            mo5585o0(gVar);
            m6677Y(iVar);
            return;
        }
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1519c1 mo5581i() {
        return C1519c1.m6801d(this.f4691M, this.f4690L, C1526e0.m6820c(m6693m(this.f4688J), this.f4698T));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public <T> T mo5582j(C0864q2<T> q2Var) {
        try {
            return q2Var.mo2975d().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        return;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5583m0(p027c.p043d.p044a.C1516b1 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4704k
            monitor-enter(r0)
            c.d.a.a1$i r1 = r4.f4708o     // Catch:{ all -> 0x0079 }
            boolean r1 = m6696q(r5, r1)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x002f
            c.d.a.a1$i r1 = r4.f4707n     // Catch:{ all -> 0x0079 }
            boolean r1 = m6696q(r5, r1)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r2.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "resume() called on a recording that is no longer active: "
            r2.append(r3)     // Catch:{ all -> 0x0079 }
            c.d.a.v0 r5 = r5.mo5627h()     // Catch:{ all -> 0x0079 }
            r2.append(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0079 }
            androidx.camera.core.C0949o2.m3688a(r1, r5)     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return
        L_0x002f:
            int[] r5 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x0079 }
            c.d.a.a1$j r1 = r4.f4705l     // Catch:{ all -> 0x0079 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0079 }
            r5 = r5[r1]     // Catch:{ all -> 0x0079 }
            r1 = 4
            if (r5 == r1) goto L_0x0072
            r1 = 5
            if (r5 == r1) goto L_0x0059
            r1 = 6
            if (r5 == r1) goto L_0x0059
            r1 = 8
            if (r5 == r1) goto L_0x0047
            goto L_0x0077
        L_0x0047:
            c.d.a.a1$j r5 = p027c.p043d.p044a.C1502a1.C1513j.RECORDING     // Catch:{ all -> 0x0079 }
            r4.mo5587p0(r5)     // Catch:{ all -> 0x0079 }
            c.d.a.a1$i r5 = r4.f4707n     // Catch:{ all -> 0x0079 }
            java.util.concurrent.Executor r1 = r4.f4703j     // Catch:{ all -> 0x0079 }
            c.d.a.t r2 = new c.d.a.t     // Catch:{ all -> 0x0079 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0079 }
            r1.execute(r2)     // Catch:{ all -> 0x0079 }
            goto L_0x0077
        L_0x0059:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "Called resume() from invalid state: "
            r1.append(r2)     // Catch:{ all -> 0x0079 }
            c.d.a.a1$j r2 = r4.f4705l     // Catch:{ all -> 0x0079 }
            r1.append(r2)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0079 }
            r5.<init>(r1)     // Catch:{ all -> 0x0079 }
            throw r5     // Catch:{ all -> 0x0079 }
        L_0x0072:
            c.d.a.a1$j r5 = p027c.p043d.p044a.C1502a1.C1513j.PENDING_RECORDING     // Catch:{ all -> 0x0079 }
            r4.mo5587p0(r5)     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return
        L_0x0079:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.mo5583m0(c.d.a.b1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5584o() {
        return this.f4688J == C1509g.ACTIVE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo5585o0(C1509g gVar) {
        C0949o2.m3688a("Recorder", "Transitioning audio state: " + this.f4688J + " --> " + gVar);
        this.f4688J = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5586p() {
        return ((C1715t0) mo5582j(this.f4682D)).mo5697b().mo5635c() != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo5587p0(C1513j jVar) {
        if (this.f4705l != jVar) {
            C0949o2.m3688a("Recorder", "Transitioning Recorder internal state: " + this.f4705l + " --> " + jVar);
            Set<C1513j> set = f4673a;
            C1523d1.C1524a aVar = null;
            if (set.contains(jVar)) {
                if (!set.contains(this.f4705l)) {
                    if (f4674b.contains(this.f4705l)) {
                        C1513j jVar2 = this.f4705l;
                        this.f4706m = jVar2;
                        aVar = m6694n(jVar2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f4705l);
                    }
                }
            } else if (this.f4706m != null) {
                this.f4706m = null;
            }
            this.f4705l = jVar;
            if (aVar == null) {
                aVar = m6694n(jVar);
            }
            this.f4700g.mo2948h(C1523d1.m6816c(m6685h(), aVar));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + jVar + ", but Recorder is already in state " + jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo5588q0(C1511i iVar) {
        C1657p0 p0Var;
        if (this.f4681C != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        } else if (!mo5584o() || this.f4697S != null) {
            C1657p0 p0Var2 = this.f4696R;
            if (p0Var2 != null) {
                try {
                    p0Var = this.f4697S;
                    this.f4696R = null;
                    this.f4697S = null;
                    long size = p0Var2.size();
                    if (p0Var != null) {
                        size += p0Var.size();
                    }
                    long j = this.f4693O;
                    if (j == 0 || size <= j) {
                        C1715t0 t0Var = (C1715t0) mo5582j(this.f4682D);
                        MediaMuxer w0 = iVar.mo5619w0(t0Var.mo5698c() == -1 ? m6707z0(this.f4717x, C1715t0.m7350g(f4677e.mo5698c())) : C1715t0.m7350g(t0Var.mo5698c()), new C1724x(this));
                        this.f4681C = w0;
                        C1011z2.C1018g gVar = this.f4716w;
                        if (gVar != null) {
                            w0.setOrientationHint(gVar.mo3180b());
                        }
                        this.f4679A = Integer.valueOf(this.f4681C.addTrack(this.f4685G.mo5790a()));
                        if (mo5584o()) {
                            this.f4719z = Integer.valueOf(this.f4681C.addTrack(this.f4687I.mo5790a()));
                        }
                        this.f4681C.start();
                        mo5565E0(p0Var2, iVar);
                        if (p0Var != null) {
                            mo5564D0(p0Var, iVar);
                        }
                        if (p0Var != null) {
                            p0Var.close();
                        }
                        p0Var2.close();
                        return;
                    }
                    C0949o2.m3688a("Recorder", String.format("Initial data exceeds file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.f4693O)}));
                    mo5572W(iVar, 2, (Throwable) null);
                    if (p0Var != null) {
                        p0Var.close();
                    }
                    p0Var2.close();
                    return;
                } catch (IOException e) {
                    mo5572W(iVar, 5, e);
                    if (p0Var != null) {
                        p0Var.close();
                    }
                    p0Var2.close();
                    return;
                } catch (Throwable th) {
                    if (p0Var2 != null) {
                        try {
                            p0Var2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
            }
        } else {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r6 = r3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        r3 = null;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p027c.p043d.p044a.C1516b1 mo5590u0(p027c.p043d.p044a.C1725x0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "The given PendingRecording cannot be null."
            androidx.core.util.C1177h.m4584f(r10, r0)
            java.lang.Object r0 = r9.f4704k
            monitor-enter(r0)
            long r1 = r9.f4711r     // Catch:{ all -> 0x00b2 }
            r3 = 1
            long r1 = r1 + r3
            r9.f4711r = r1     // Catch:{ all -> 0x00b2 }
            c.d.a.h1$a r3 = r9.f4709p     // Catch:{ all -> 0x00b2 }
            c.d.a.h1$a r4 = p027c.p043d.p044a.C1543h1.C1544a.INACTIVE     // Catch:{ all -> 0x00b2 }
            r5 = 0
            r6 = 0
            if (r3 != r4) goto L_0x001c
            r5 = 4
            java.lang.Exception r3 = f4678f     // Catch:{ all -> 0x00b2 }
            goto L_0x007e
        L_0x001c:
            int[] r3 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x00b2 }
            c.d.a.a1$j r4 = r9.f4705l     // Catch:{ all -> 0x00b2 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x00b2 }
            r3 = r3[r4]     // Catch:{ all -> 0x00b2 }
            switch(r3) {
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                case 3: goto L_0x0034;
                case 4: goto L_0x0034;
                case 5: goto L_0x003d;
                case 6: goto L_0x003d;
                case 7: goto L_0x002e;
                case 8: goto L_0x002e;
                case 9: goto L_0x002a;
                default: goto L_0x0029;
            }     // Catch:{ all -> 0x00b2 }
        L_0x0029:
            goto L_0x007d
        L_0x002a:
            r5 = 7
            java.lang.Throwable r3 = r9.f4710q     // Catch:{ all -> 0x00b2 }
            goto L_0x007e
        L_0x002e:
            c.d.a.a1$i r3 = r9.f4707n     // Catch:{ all -> 0x00b2 }
        L_0x0030:
            r8 = r6
            r6 = r3
            r3 = r8
            goto L_0x007e
        L_0x0034:
            c.d.a.a1$i r3 = r9.f4708o     // Catch:{ all -> 0x00b2 }
            java.lang.Object r3 = androidx.core.util.C1177h.m4583e(r3)     // Catch:{ all -> 0x00b2 }
            c.d.a.a1$i r3 = (p027c.p043d.p044a.C1502a1.C1511i) r3     // Catch:{ all -> 0x00b2 }
            goto L_0x0030
        L_0x003d:
            c.d.a.a1$j r3 = r9.f4705l     // Catch:{ all -> 0x00b2 }
            c.d.a.a1$j r4 = p027c.p043d.p044a.C1502a1.C1513j.IDLING     // Catch:{ all -> 0x00b2 }
            if (r3 != r4) goto L_0x0053
            c.d.a.a1$i r3 = r9.f4707n     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x004d
            c.d.a.a1$i r3 = r9.f4708o     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            java.lang.String r7 = "Expected recorder to be idle but a recording is either pending or in progress."
            androidx.core.util.C1177h.m4586h(r3, r7)     // Catch:{ all -> 0x00b2 }
        L_0x0053:
            c.d.a.a1$i r3 = p027c.p043d.p044a.C1502a1.C1511i.m6772h(r10, r1)     // Catch:{ IOException -> 0x007a }
            android.content.Context r7 = r10.mo5954a()     // Catch:{ IOException -> 0x007a }
            r3.mo5612L(r7)     // Catch:{ IOException -> 0x007a }
            r9.f4708o = r3     // Catch:{ IOException -> 0x007a }
            c.d.a.a1$j r3 = r9.f4705l     // Catch:{ IOException -> 0x007a }
            if (r3 != r4) goto L_0x0074
            c.d.a.a1$j r3 = p027c.p043d.p044a.C1502a1.C1513j.PENDING_RECORDING     // Catch:{ IOException -> 0x007a }
            r9.mo5587p0(r3)     // Catch:{ IOException -> 0x007a }
            java.util.concurrent.Executor r3 = r9.f4703j     // Catch:{ IOException -> 0x007a }
            c.d.a.a r4 = new c.d.a.a     // Catch:{ IOException -> 0x007a }
            r4.<init>(r9)     // Catch:{ IOException -> 0x007a }
            r3.execute(r4)     // Catch:{ IOException -> 0x007a }
            goto L_0x007d
        L_0x0074:
            c.d.a.a1$j r3 = p027c.p043d.p044a.C1502a1.C1513j.PENDING_RECORDING     // Catch:{ IOException -> 0x007a }
            r9.mo5587p0(r3)     // Catch:{ IOException -> 0x007a }
            goto L_0x007d
        L_0x007a:
            r3 = move-exception
            r5 = 5
            goto L_0x007e
        L_0x007d:
            r3 = r6
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00a5
            java.lang.String r0 = "Recorder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Recording was started when the Recorder had encountered error "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            androidx.camera.core.C0949o2.m3690c(r0, r4)
            c.d.a.a1$i r0 = p027c.p043d.p044a.C1502a1.C1511i.m6772h(r10, r1)
            r9.m6683g(r0, r5, r3)
            c.d.a.b1 r10 = p027c.p043d.p044a.C1516b1.m6789a(r10, r1)
            return r10
        L_0x00a5:
            c.d.a.b1 r10 = p027c.p043d.p044a.C1516b1.m6790b(r10, r1)
            return r10
        L_0x00aa:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."
            r10.<init>(r0)
            throw r10
        L_0x00b2:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.mo5590u0(c.d.a.x0):c.d.a.b1");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        m6683g(r2, 8, new java.lang.RuntimeException("Recording was stopped before any data could be produced."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5593x0(p027c.p043d.p044a.C1516b1 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4704k
            monitor-enter(r0)
            c.d.a.a1$i r1 = r4.f4708o     // Catch:{ all -> 0x0083 }
            boolean r1 = m6696q(r5, r1)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x002f
            c.d.a.a1$i r1 = r4.f4707n     // Catch:{ all -> 0x0083 }
            boolean r1 = m6696q(r5, r1)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "Recorder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "stop() called on a recording that is no longer active: "
            r2.append(r3)     // Catch:{ all -> 0x0083 }
            c.d.a.v0 r5 = r5.mo5627h()     // Catch:{ all -> 0x0083 }
            r2.append(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0083 }
            androidx.camera.core.C0949o2.m3688a(r1, r5)     // Catch:{ all -> 0x0083 }
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            return
        L_0x002f:
            int[] r1 = p027c.p043d.p044a.C1502a1.C1508f.f4729a     // Catch:{ all -> 0x0083 }
            c.d.a.a1$j r2 = r4.f4705l     // Catch:{ all -> 0x0083 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0083 }
            r1 = r1[r2]     // Catch:{ all -> 0x0083 }
            r2 = 0
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x006a;
                case 3: goto L_0x0058;
                case 4: goto L_0x0058;
                case 5: goto L_0x0050;
                case 6: goto L_0x0050;
                case 7: goto L_0x003e;
                case 8: goto L_0x003e;
                default: goto L_0x003d;
            }     // Catch:{ all -> 0x0083 }
        L_0x003d:
            goto L_0x0073
        L_0x003e:
            c.d.a.a1$j r5 = p027c.p043d.p044a.C1502a1.C1513j.STOPPING     // Catch:{ all -> 0x0083 }
            r4.mo5587p0(r5)     // Catch:{ all -> 0x0083 }
            c.d.a.a1$i r5 = r4.f4707n     // Catch:{ all -> 0x0083 }
            java.util.concurrent.Executor r1 = r4.f4703j     // Catch:{ all -> 0x0083 }
            c.d.a.h r3 = new c.d.a.h     // Catch:{ all -> 0x0083 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0083 }
            r1.execute(r3)     // Catch:{ all -> 0x0083 }
            goto L_0x0073
        L_0x0050:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "Calling stop() while idling or initializing is invalid."
            r5.<init>(r1)     // Catch:{ all -> 0x0083 }
            throw r5     // Catch:{ all -> 0x0083 }
        L_0x0058:
            c.d.a.a1$i r1 = r4.f4708o     // Catch:{ all -> 0x0083 }
            boolean r5 = m6696q(r5, r1)     // Catch:{ all -> 0x0083 }
            androidx.core.util.C1177h.m4585g(r5)     // Catch:{ all -> 0x0083 }
            c.d.a.a1$i r5 = r4.f4708o     // Catch:{ all -> 0x0083 }
            r4.f4708o = r2     // Catch:{ all -> 0x0083 }
            r4.m6692l0()     // Catch:{ all -> 0x0083 }
            r2 = r5
            goto L_0x0073
        L_0x006a:
            c.d.a.a1$i r1 = r4.f4707n     // Catch:{ all -> 0x0083 }
            boolean r5 = m6696q(r5, r1)     // Catch:{ all -> 0x0083 }
            androidx.core.util.C1177h.m4585g(r5)     // Catch:{ all -> 0x0083 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0082
            r5 = 8
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Recording was stopped before any data could be produced."
            r0.<init>(r1)
            r4.m6683g(r2, r5, r0)
        L_0x0082:
            return
        L_0x0083:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1502a1.mo5593x0(c.d.a.b1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo5594y0(C1511i iVar, int i, Throwable th) {
        C9172b bVar;
        if (this.f4713t == iVar && !this.f4715v) {
            this.f4714u = C1597d.m7053a(C1599f.class) != null;
            this.f4715v = true;
            this.f4694P = i;
            this.f4695Q = th;
            C1814b.C1815a aVar = null;
            if (mo5584o()) {
                C1657p0 p0Var = this.f4697S;
                if (p0Var != null) {
                    p0Var.close();
                    this.f4697S = null;
                }
                this.f4686H.mo5873U();
            }
            C1657p0 p0Var2 = this.f4696R;
            if (p0Var2 != null) {
                p0Var2.close();
                this.f4696R = null;
            }
            synchronized (this.f4704k) {
                if (this.f4709p == C1543h1.C1544a.ACTIVE_STREAMING) {
                    AtomicReference atomicReference = new AtomicReference();
                    bVar = C1814b.m7736a(new C1702q(this, atomicReference));
                    aVar = (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference.get());
                } else {
                    bVar = C0768f.m3081g(null);
                }
            }
            if (aVar != null) {
                bVar.mo2919e(new C1520d(C0744a.m3047d().schedule(new C1514b(this, aVar), 1000, TimeUnit.MILLISECONDS)), this.f4703j);
            }
            this.f4684F.mo5873U();
            C0768f.m3075a(bVar, new C1507e(), this.f4703j);
        }
    }
}
