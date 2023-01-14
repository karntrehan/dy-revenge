package p027c.p043d.p044a.p046l1;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.p046l1.C1582i;
import p027c.p043d.p044a.p046l1.C1585j;
import p027c.p043d.p044a.p046l1.p047m.C1589a;
import p027c.p043d.p044a.p046l1.p047m.C1592d;
import p027c.p043d.p044a.p046l1.p050o.C1686y0;

/* renamed from: c.d.a.l1.g */
public final class C1572g {

    /* renamed from: a */
    public static final List<Integer> f4862a = Collections.unmodifiableList(Arrays.asList(new Integer[]{48000, 44100, 22050, 11025, 8000, 4800}));

    /* renamed from: b */
    final Executor f4863b;

    /* renamed from: c */
    private AudioManager.AudioRecordingCallback f4864c;

    /* renamed from: d */
    AtomicBoolean f4865d = new AtomicBoolean(false);

    /* renamed from: e */
    final AudioRecord f4866e;

    /* renamed from: f */
    final int f4867f;

    /* renamed from: g */
    C1578f f4868g = C1578f.CONFIGURED;

    /* renamed from: h */
    C1585j.C1586a f4869h = C1585j.C1586a.INACTIVE;

    /* renamed from: i */
    boolean f4870i;

    /* renamed from: j */
    Executor f4871j;

    /* renamed from: k */
    C1577e f4872k;

    /* renamed from: l */
    C1585j<C1686y0> f4873l;

    /* renamed from: m */
    private C0765d<C1686y0> f4874m;

    /* renamed from: n */
    private C0796d2.C0797a<C1585j.C1586a> f4875n;

    /* renamed from: c.d.a.l1.g$a */
    class C1573a implements C0796d2.C0797a<C1585j.C1586a> {

        /* renamed from: a */
        final /* synthetic */ C1585j f4876a;

        C1573a(C1585j jVar) {
            this.f4876a = jVar;
        }

        /* renamed from: a */
        public void mo2977a(Throwable th) {
            C1572g gVar = C1572g.this;
            if (gVar.f4873l == this.f4876a) {
                gVar.mo5741o(th);
            }
        }

        /* renamed from: c */
        public void mo2978b(C1585j.C1586a aVar) {
            if (C1572g.this.f4873l == this.f4876a) {
                C0949o2.m3688a("AudioSource", "Receive BufferProvider state change: " + C1572g.this.f4869h + " to " + aVar);
                C1572g gVar = C1572g.this;
                gVar.f4869h = aVar;
                gVar.mo5748y();
            }
        }
    }

    /* renamed from: c.d.a.l1.g$b */
    class C1574b implements C0765d<C1686y0> {

        /* renamed from: a */
        final /* synthetic */ C1585j f4878a;

        C1574b(C1585j jVar) {
            this.f4878a = jVar;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            if (C1572g.this.f4873l != this.f4878a) {
                C0949o2.m3688a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                C1572g.this.mo5741o(th);
            }
        }

        /* renamed from: c */
        public void mo1980a(C1686y0 y0Var) {
            C1572g gVar = C1572g.this;
            if (!gVar.f4870i || gVar.f4873l != this.f4878a) {
                y0Var.cancel();
                return;
            }
            ByteBuffer g = y0Var.mo5916g();
            C1572g gVar2 = C1572g.this;
            int read = gVar2.f4866e.read(g, gVar2.f4867f);
            if (read > 0) {
                g.limit(read);
                y0Var.mo5915d(C1572g.this.mo5735b());
                y0Var.mo5913c();
            } else {
                C0949o2.m3698k("AudioSource", "Unable to read data from AudioRecord.");
                y0Var.cancel();
            }
            C1572g.this.mo5743r();
        }
    }

    /* renamed from: c.d.a.l1.g$c */
    static /* synthetic */ class C1575c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4880a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                c.d.a.l1.g$f[] r0 = p027c.p043d.p044a.p046l1.C1572g.C1578f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4880a = r0
                c.d.a.l1.g$f r1 = p027c.p043d.p044a.p046l1.C1572g.C1578f.CONFIGURED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4880a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.d.a.l1.g$f r1 = p027c.p043d.p044a.p046l1.C1572g.C1578f.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4880a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.d.a.l1.g$f r1 = p027c.p043d.p044a.p046l1.C1572g.C1578f.RELEASED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.p046l1.C1572g.C1575c.<clinit>():void");
        }
    }

    /* renamed from: c.d.a.l1.g$d */
    class C1576d extends AudioManager.AudioRecordingCallback {
        C1576d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo5751b(boolean z) {
            C1572g.this.f4872k.mo5597b(z);
        }

        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            C1572g gVar = C1572g.this;
            if (gVar.f4871j != null && gVar.f4872k != null) {
                for (AudioRecordingConfiguration next : list) {
                    if (C1589a.m7038a(next) == C1572g.this.f4866e.getAudioSessionId()) {
                        boolean a = C1592d.m7042a(next);
                        if (C1572g.this.f4865d.getAndSet(a) != a) {
                            C1572g.this.f4871j.execute(new C1566a(this, a));
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: c.d.a.l1.g$e */
    public interface C1577e {
        /* renamed from: a */
        void mo5596a(Throwable th);

        /* renamed from: b */
        void mo5597b(boolean z);
    }

    /* renamed from: c.d.a.l1.g$f */
    enum C1578f {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    /* renamed from: c.d.a.l1.g$g */
    public static abstract class C1579g {

        /* renamed from: c.d.a.l1.g$g$a */
        public static abstract class C1580a {
            C1580a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public abstract C1579g mo5757a();

            /* renamed from: b */
            public final C1579g mo5758b() {
                C1579g a = mo5757a();
                int c = a.mo5754c();
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (c == -1) {
                    str = str + " audioSource";
                }
                if (a.mo5756e() <= 0) {
                    str = str + " sampleRate";
                }
                if (a.mo5755d() <= 0) {
                    str = str + " channelCount";
                }
                if (a.mo5753b() == -1) {
                    str = str + " audioFormat";
                }
                if (str.isEmpty()) {
                    return a;
                }
                throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
            }

            /* renamed from: c */
            public abstract C1580a mo5759c(int i);

            /* renamed from: d */
            public abstract C1580a mo5760d(int i);

            /* renamed from: e */
            public abstract C1580a mo5761e(int i);

            /* renamed from: f */
            public abstract C1580a mo5762f(int i);
        }

        C1579g() {
        }

        @SuppressLint({"Range"})
        /* renamed from: a */
        public static C1580a m7008a() {
            return new C1582i.C1584b().mo5760d(-1).mo5762f(-1).mo5761e(-1).mo5759c(-1);
        }

        /* renamed from: b */
        public abstract int mo5753b();

        /* renamed from: c */
        public abstract int mo5754c();

        /* renamed from: d */
        public abstract int mo5755d();

        /* renamed from: e */
        public abstract int mo5756e();
    }

    public C1572g(C1579g gVar, Executor executor) {
        boolean z = false;
        if (m6975d(gVar.mo5756e(), gVar.mo5755d(), gVar.mo5753b())) {
            int c = m6974c(gVar.mo5756e(), gVar.mo5755d(), gVar.mo5753b());
            C1177h.m4585g(c > 0 ? true : z);
            Executor g = C0744a.m3050g(executor);
            this.f4863b = g;
            int i = c * 2;
            this.f4867f = i;
            try {
                AudioRecord audioRecord = new AudioRecord(gVar.mo5754c(), gVar.mo5756e(), m6973a(gVar.mo5755d()), gVar.mo5753b(), i);
                this.f4866e = audioRecord;
                if (audioRecord.getState() != 1) {
                    audioRecord.release();
                    throw new C1581h("Unable to initialize AudioRecord");
                } else if (Build.VERSION.SDK_INT >= 29) {
                    C1576d dVar = new C1576d();
                    this.f4864c = dVar;
                    C1592d.m7043b(audioRecord, g, dVar);
                }
            } catch (IllegalArgumentException e) {
                throw new C1581h("Unable to create AudioRecord", e);
            }
        } else {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", new Object[]{Integer.valueOf(gVar.mo5756e()), Integer.valueOf(gVar.mo5755d()), Integer.valueOf(gVar.mo5753b())}));
        }
    }

    /* renamed from: a */
    private static int m6973a(int i) {
        return i == 1 ? 16 : 12;
    }

    /* renamed from: c */
    private static int m6974c(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, m6973a(i2), i3);
    }

    /* renamed from: d */
    public static boolean m6975d(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && m6974c(i, i2, i3) > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo5736f(Throwable th) {
        this.f4872k.mo5596a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void mo5737h() {
        int i = C1575c.f4880a[this.f4868g.ordinal()];
        if (i == 1 || i == 2) {
            m6981q((C1585j<C1686y0>) null);
            if (Build.VERSION.SDK_INT >= 29) {
                C1592d.m7044c(this.f4866e, this.f4864c);
            }
            this.f4866e.release();
            m6983x();
            mo5746u(C1578f.RELEASED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void mo5738j(Executor executor, C1577e eVar) {
        int i = C1575c.f4880a[this.f4868g.ordinal()];
        if (i == 1) {
            this.f4871j = executor;
            this.f4872k = eVar;
        } else if (i == 2 || i == 3) {
            throw new IllegalStateException("The audio recording callback must be registered before the audio source is started.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo5739l(C1585j jVar) {
        int i = C1575c.f4880a[this.f4868g.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f4873l != jVar) {
                m6981q(jVar);
            }
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void mo5740n() {
        int i = C1575c.f4880a[this.f4868g.ordinal()];
        if (i == 1) {
            mo5746u(C1578f.STARTED);
            mo5748y();
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    /* renamed from: q */
    private void m6981q(C1585j<C1686y0> jVar) {
        C1585j<C1686y0> jVar2 = this.f4873l;
        if (jVar2 != null) {
            jVar2.mo2974a(this.f4875n);
            this.f4873l = null;
            this.f4875n = null;
            this.f4874m = null;
        }
        this.f4869h = C1585j.C1586a.INACTIVE;
        mo5748y();
        if (jVar != null) {
            this.f4873l = jVar;
            this.f4875n = new C1573a(jVar);
            this.f4874m = new C1574b(jVar);
            this.f4873l.mo2976e(this.f4863b, this.f4875n);
        }
    }

    /* renamed from: w */
    private void m6982w() {
        if (!this.f4870i) {
            try {
                C0949o2.m3688a("AudioSource", "startSendingAudio");
                this.f4866e.startRecording();
                if (this.f4866e.getRecordingState() == 3) {
                    this.f4870i = true;
                    mo5743r();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord with state: " + this.f4866e.getRecordingState());
            } catch (IllegalStateException e) {
                C0949o2.m3699l("AudioSource", "Failed to start AudioRecord", e);
                mo5746u(C1578f.CONFIGURED);
                mo5741o(new C1581h("Unable to start the audio record.", e));
            }
        }
    }

    /* renamed from: x */
    private void m6983x() {
        if (this.f4870i) {
            this.f4870i = false;
            try {
                C0949o2.m3688a("AudioSource", "stopSendingAudio");
                this.f4866e.stop();
                if (this.f4866e.getRecordingState() != 1) {
                    throw new IllegalStateException("Unable to stop AudioRecord with state: " + this.f4866e.getRecordingState());
                }
            } catch (IllegalStateException e) {
                C0949o2.m3699l("AudioSource", "Failed to stop AudioRecord", e);
                mo5741o(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo5735b() {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 24
            if (r0 < r3) goto L_0x0026
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r3 = r6.f4866e
            r4 = 0
            int r3 = p027c.p043d.p044a.p046l1.p047m.C1589a.m7039b(r3, r0, r4)
            if (r3 != 0) goto L_0x001f
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = r0.nanoTime
            long r3 = r3.toMicros(r4)
            goto L_0x0027
        L_0x001f:
            java.lang.String r0 = "AudioSource"
            java.lang.String r3 = "Unable to get audio timestamp"
            androidx.camera.core.C0949o2.m3698k(r0, r3)
        L_0x0026:
            r3 = r1
        L_0x0027:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r3 = r0.toMicros(r1)
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.p046l1.C1572g.mo5735b():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5741o(Throwable th) {
        Executor executor = this.f4871j;
        if (executor != null && this.f4872k != null) {
            executor.execute(new C1569d(this, th));
        }
    }

    /* renamed from: p */
    public void mo5742p() {
        this.f4863b.execute(new C1568c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5743r() {
        C0768f.m3075a(this.f4873l.mo5766c(), this.f4874m, this.f4863b);
    }

    /* renamed from: s */
    public void mo5744s(Executor executor, C1577e eVar) {
        this.f4863b.execute(new C1571f(this, executor, eVar));
    }

    /* renamed from: t */
    public void mo5745t(C1585j<C1686y0> jVar) {
        this.f4863b.execute(new C1567b(this, jVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo5746u(C1578f fVar) {
        C0949o2.m3688a("AudioSource", "Transitioning internal state: " + this.f4868g + " --> " + fVar);
        this.f4868g = fVar;
    }

    /* renamed from: v */
    public void mo5747v() {
        this.f4863b.execute(new C1570e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5748y() {
        if (this.f4868g == C1578f.STARTED && this.f4869h == C1585j.C1586a.ACTIVE) {
            m6982w();
        } else {
            m6983x();
        }
    }
}
