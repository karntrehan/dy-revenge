package androidx.camera.core;

import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0805f1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0894v1;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0922z1;
import androidx.camera.core.impl.C0923z2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.p009e3.C0656i;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.b3 */
public final class C0617b3 extends C0608a3 {

    /* renamed from: l */
    public static final C0621d f1999l = new C0621d();

    /* renamed from: m */
    private static final int[] f2000m = {8, 6, 5, 4};

    /* renamed from: A */
    Surface f2001A;

    /* renamed from: B */
    private volatile AudioRecord f2002B;

    /* renamed from: C */
    private volatile int f2003C;

    /* renamed from: D */
    private volatile boolean f2004D;

    /* renamed from: E */
    private int f2005E;

    /* renamed from: F */
    private int f2006F;

    /* renamed from: G */
    private int f2007G;

    /* renamed from: H */
    private C0820i1 f2008H;

    /* renamed from: I */
    private final AtomicBoolean f2009I;

    /* renamed from: J */
    private C0622e f2010J;

    /* renamed from: K */
    private Throwable f2011K;

    /* renamed from: n */
    private final Object f2012n;

    /* renamed from: o */
    private final AtomicBoolean f2013o;

    /* renamed from: p */
    private final AtomicBoolean f2014p;

    /* renamed from: q */
    private HandlerThread f2015q;

    /* renamed from: r */
    private Handler f2016r;

    /* renamed from: s */
    private HandlerThread f2017s;

    /* renamed from: t */
    private Handler f2018t;

    /* renamed from: u */
    MediaCodec f2019u;

    /* renamed from: v */
    private MediaCodec f2020v;

    /* renamed from: w */
    private C9172b<Void> f2021w;

    /* renamed from: x */
    private C0840m2.C0842b f2022x;

    /* renamed from: y */
    private int f2023y;

    /* renamed from: z */
    private int f2024z;

    /* renamed from: androidx.camera.core.b3$a */
    class C0618a implements C0840m2.C0843c {

        /* renamed from: a */
        final /* synthetic */ String f2025a;

        /* renamed from: b */
        final /* synthetic */ Size f2026b;

        C0618a(String str, Size size) {
            this.f2025a = str;
            this.f2026b = size;
        }

        /* renamed from: a */
        public void mo2601a(C0840m2 m2Var, C0840m2.C0845e eVar) {
            if (C0617b3.this.mo2580o(this.f2025a)) {
                C0617b3.this.mo2599W(this.f2025a, this.f2026b);
                C0617b3.this.mo2584s();
            }
        }
    }

    /* renamed from: androidx.camera.core.b3$b */
    private static class C0619b {
        /* renamed from: a */
        static int m2583a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    /* renamed from: androidx.camera.core.b3$c */
    public static final class C0620c implements C0908x2.C0909a<C0617b3, C0923z2, C0620c>, C0877s1.C0878a<C0620c> {

        /* renamed from: a */
        private final C0714a2 f2028a;

        public C0620c() {
            this(C0714a2.m2954J());
        }

        private C0620c(C0714a2 a2Var) {
            Class<C0617b3> cls = C0617b3.class;
            this.f2028a = a2Var;
            Class cls2 = (Class) a2Var.mo2497d(C0656i.f2116t, null);
            if (cls2 == null || cls2.equals(cls)) {
                mo2615p(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        /* renamed from: e */
        static C0620c m2584e(C0809g1 g1Var) {
            return new C0620c(C0714a2.m2955K(g1Var));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f2028a;
        }

        /* renamed from: f */
        public C0923z2 mo2603c() {
            return new C0923z2(C0802e2.m3155H(this.f2028a));
        }

        /* renamed from: g */
        public C0620c mo2606g(int i) {
            mo1887b().mo2814q(C0923z2.f2632z, Integer.valueOf(i));
            return this;
        }

        /* renamed from: h */
        public C0620c mo2607h(int i) {
            mo1887b().mo2814q(C0923z2.f2627B, Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public C0620c mo2608i(int i) {
            mo1887b().mo2814q(C0923z2.f2628C, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C0620c mo2609j(int i) {
            mo1887b().mo2814q(C0923z2.f2626A, Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public C0620c mo2610k(int i) {
            mo1887b().mo2814q(C0923z2.f2630x, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C0620c mo2611l(int i) {
            mo1887b().mo2814q(C0923z2.f2631y, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C0620c mo2612m(Size size) {
            mo1887b().mo2814q(C0877s1.f2549j, size);
            return this;
        }

        /* renamed from: n */
        public C0620c mo2613n(int i) {
            mo1887b().mo2814q(C0908x2.f2605p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: o */
        public C0620c mo2614o(int i) {
            mo1887b().mo2814q(C0877s1.f2545f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: p */
        public C0620c mo2615p(Class<C0617b3> cls) {
            mo1887b().mo2814q(C0656i.f2116t, cls);
            if (mo1887b().mo2497d(C0656i.f2115s, null) == null) {
                mo2616q(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: q */
        public C0620c mo2616q(String str) {
            mo1887b().mo2814q(C0656i.f2115s, str);
            return this;
        }

        /* renamed from: r */
        public C0620c mo2602a(Size size) {
            mo1887b().mo2814q(C0877s1.f2547h, size);
            return this;
        }

        /* renamed from: s */
        public C0620c mo2604d(int i) {
            mo1887b().mo2814q(C0877s1.f2546g, Integer.valueOf(i));
            return this;
        }

        /* renamed from: t */
        public C0620c mo2619t(int i) {
            mo1887b().mo2814q(C0923z2.f2629w, Integer.valueOf(i));
            return this;
        }
    }

    /* renamed from: androidx.camera.core.b3$d */
    public static final class C0621d {

        /* renamed from: a */
        private static final Size f2029a;

        /* renamed from: b */
        private static final C0923z2 f2030b;

        static {
            Size size = new Size(1920, 1080);
            f2029a = size;
            f2030b = new C0620c().mo2619t(30).mo2610k(8388608).mo2611l(1).mo2606g(64000).mo2609j(8000).mo2607h(1).mo2608i(1024).mo2612m(size).mo2613n(3).mo2614o(1).mo2603c();
        }

        /* renamed from: a */
        public C0923z2 mo2620a() {
            return f2030b;
        }
    }

    /* renamed from: androidx.camera.core.b3$e */
    enum C0622e {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    /* renamed from: K */
    private AudioRecord m2562K(C0923z2 z2Var) {
        int i = this.f2005E == 1 ? 16 : 12;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.f2006F, i, 2);
            if (minBufferSize <= 0) {
                minBufferSize = z2Var.mo3173I();
            }
            int i2 = minBufferSize;
            AudioRecord audioRecord = new AudioRecord(5, this.f2006F, i, 2, i2 * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.f2003C = i2;
            C0949o2.m3692e("VideoCapture", "source: 5 audioSampleRate: " + this.f2006F + " channelConfig: " + i + " audioFormat: " + 2 + " bufferSize: " + i2);
            return audioRecord;
        } catch (Exception e) {
            C0949o2.m3691d("VideoCapture", "Exception, keep trying.", e);
            return null;
        }
    }

    /* renamed from: L */
    private MediaFormat m2563L() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f2006F, this.f2005E);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.f2007G);
        return createAudioFormat;
    }

    /* renamed from: M */
    private static MediaFormat m2564M(C0923z2 z2Var, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", z2Var.mo3175K());
        createVideoFormat.setInteger("frame-rate", z2Var.mo3177M());
        createVideoFormat.setInteger("i-frame-interval", z2Var.mo3176L());
        return createVideoFormat;
    }

    /* renamed from: P */
    static /* synthetic */ void m2566P(boolean z, MediaCodec mediaCodec) {
        if (z && mediaCodec != null) {
            mediaCodec.release();
        }
    }

    /* renamed from: S */
    private void m2568S() {
        this.f2017s.quitSafely();
        MediaCodec mediaCodec = this.f2020v;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f2020v = null;
        }
        if (this.f2002B != null) {
            this.f2002B.release();
            this.f2002B = null;
        }
    }

    /* renamed from: T */
    private void m2569T(boolean z) {
        C0820i1 i1Var = this.f2008H;
        if (i1Var != null) {
            MediaCodec mediaCodec = this.f2019u;
            i1Var.mo3001a();
            this.f2008H.mo3007g().mo2919e(new C1005y0(z, mediaCodec), C0744a.m3047d());
            if (z) {
                this.f2019u = null;
            }
            this.f2001A = null;
            this.f2008H = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m2565N() {
        this.f2015q.quitSafely();
        m2568S();
        if (this.f2001A != null) {
            m2569T(true);
        }
    }

    /* renamed from: V */
    private void m2571V(Size size, String str) {
        boolean z = false;
        try {
            int[] iArr = f2000m;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int i2 = iArr[i];
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i2)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i2);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        this.f2005E = camcorderProfile.audioChannels;
                        this.f2006F = camcorderProfile.audioSampleRate;
                        this.f2007G = camcorderProfile.audioBitRate;
                        z = true;
                        break;
                    }
                }
                i++;
            }
        } catch (NumberFormatException unused) {
            C0949o2.m3692e("VideoCapture", "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings.");
        }
        if (!z) {
            C0923z2 z2Var = (C0923z2) mo2571f();
            this.f2005E = z2Var.mo3172H();
            this.f2006F = z2Var.mo3174J();
            this.f2007G = z2Var.mo3171G();
        }
    }

    /* renamed from: C */
    public void mo2560C() {
        m2567Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Size mo2561D(Size size) {
        if (this.f2001A != null) {
            this.f2019u.stop();
            this.f2019u.release();
            this.f2020v.stop();
            this.f2020v.release();
            m2569T(false);
        }
        try {
            this.f2019u = MediaCodec.createEncoderByType("video/avc");
            this.f2020v = MediaCodec.createEncoderByType("audio/mp4a-latm");
            mo2599W(mo2570e(), size);
            mo2582q();
            return size;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e.getCause());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo2599W(String str, Size size) {
        C0622e eVar;
        C0923z2 z2Var = (C0923z2) mo2571f();
        this.f2019u.reset();
        this.f2010J = C0622e.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.f2019u.configure(m2564M(z2Var, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f2001A != null) {
                m2569T(false);
            }
            Surface createInputSurface = this.f2019u.createInputSurface();
            this.f2001A = createInputSurface;
            this.f2022x = C0840m2.C0842b.m3318o(z2Var);
            C0820i1 i1Var = this.f2008H;
            if (i1Var != null) {
                i1Var.mo3001a();
            }
            C0894v1 v1Var = new C0894v1(this.f2001A, size, mo2573h());
            this.f2008H = v1Var;
            C9172b<Void> g = v1Var.mo3007g();
            Objects.requireNonNull(createInputSurface);
            g.mo2919e(new C0691h0(createInputSurface), C0744a.m3047d());
            this.f2022x.mo3043h(this.f2008H);
            this.f2022x.mo3041f(new C0618a(str, size));
            mo2565I(this.f2022x.mo3048m());
            this.f2009I.set(true);
            m2571V(size, str);
            this.f2020v.reset();
            this.f2020v.configure(m2563L(), (Surface) null, (MediaCrypto) null, 1);
            if (this.f2002B != null) {
                this.f2002B.release();
            }
            this.f2002B = m2562K(z2Var);
            if (this.f2002B == null) {
                C0949o2.m3690c("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.f2009I.set(false);
            }
            synchronized (this.f2012n) {
                this.f2023y = -1;
                this.f2024z = -1;
            }
            this.f2004D = false;
        } catch (MediaCodec.CodecException e) {
            if (Build.VERSION.SDK_INT >= 23) {
                int a = C0619b.m2583a(e);
                String diagnosticInfo = e.getDiagnosticInfo();
                if (a == 1100) {
                    C0949o2.m3692e("VideoCapture", "CodecException: code: " + a + " diagnostic: " + diagnosticInfo);
                    eVar = C0622e.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
                } else {
                    if (a == 1101) {
                        C0949o2.m3692e("VideoCapture", "CodecException: code: " + a + " diagnostic: " + diagnosticInfo);
                        eVar = C0622e.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
                    }
                    this.f2011K = e;
                }
            } else {
                eVar = C0622e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            }
            this.f2010J = eVar;
            this.f2011K = e;
        } catch (IllegalArgumentException | IllegalStateException e2) {
            this.f2010J = C0622e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.f2011K = e2;
        }
    }

    /* renamed from: X */
    public void m2567Q() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C0744a.m3047d().execute(new C1009z0(this));
            return;
        }
        C0949o2.m3692e("VideoCapture", "stopRecording");
        this.f2022x.mo3049n();
        this.f2022x.mo3043h(this.f2008H);
        mo2565I(this.f2022x.mo3048m());
        mo2586u();
        if (this.f2004D) {
            (this.f2009I.get() ? this.f2014p : this.f2013o).set(true);
        }
    }

    /* renamed from: g */
    public C0908x2<?> mo2572g(boolean z, C0915y2 y2Var) {
        C0809g1 a = y2Var.mo2009a(C0915y2.C0917b.VIDEO_CAPTURE);
        if (z) {
            a = C0805f1.m3166b(a, f1999l.mo2620a());
        }
        if (a == null) {
            return null;
        }
        return mo2578m(a).mo2603c();
    }

    /* renamed from: m */
    public C0908x2.C0909a<?, ?, ?> mo2578m(C0809g1 g1Var) {
        return C0620c.m2584e(g1Var);
    }

    /* renamed from: w */
    public void mo2588w() {
        this.f2015q = new HandlerThread("CameraX-video encoding thread");
        this.f2017s = new HandlerThread("CameraX-audio encoding thread");
        this.f2015q.start();
        this.f2016r = new Handler(this.f2015q.getLooper());
        this.f2017s.start();
        this.f2018t = new Handler(this.f2017s.getLooper());
    }

    /* renamed from: z */
    public void mo2591z() {
        m2567Q();
        C9172b<Void> bVar = this.f2021w;
        if (bVar != null) {
            bVar.mo2919e(new C0605a1(this), C0744a.m3047d());
        } else {
            m2565N();
        }
    }
}
