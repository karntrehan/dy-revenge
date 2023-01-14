package p027c.p043d.p044a.p046l1.p050o;

import android.media.MediaFormat;
import java.util.Objects;
import p027c.p043d.p044a.p046l1.p050o.C1647m0;

/* renamed from: c.d.a.l1.o.l0 */
public abstract class C1644l0 implements C1673w0 {

    /* renamed from: c.d.a.l1.o.l0$a */
    public static abstract class C1645a {
        C1645a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C1644l0 mo5829a();

        /* renamed from: b */
        public C1644l0 mo5830b() {
            C1644l0 a = mo5829a();
            if (!Objects.equals(a.mo5826e(), "audio/mp4a-latm") || a.mo5827f() != C1673w0.f5020a) {
                return a;
            }
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }

        /* renamed from: c */
        public abstract C1645a mo5831c(int i);

        /* renamed from: d */
        public abstract C1645a mo5832d(int i);

        /* renamed from: e */
        public abstract C1645a mo5833e(String str);

        /* renamed from: f */
        public abstract C1645a mo5834f(int i);

        /* renamed from: g */
        public abstract C1645a mo5835g(int i);
    }

    C1644l0() {
    }

    /* renamed from: b */
    public static C1645a m7116b() {
        return new C1647m0.C1649b().mo5834f(C1673w0.f5020a);
    }

    /* renamed from: a */
    public MediaFormat mo5793a() {
        String str;
        int i;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(mo5826e(), mo5828g(), mo5825d());
        createAudioFormat.setInteger("bitrate", mo5824c());
        if (mo5827f() != C1673w0.f5020a) {
            if (mo5826e().equals("audio/mp4a-latm")) {
                i = mo5827f();
                str = "aac-profile";
            } else {
                i = mo5827f();
                str = "profile";
            }
            createAudioFormat.setInteger(str, i);
        }
        return createAudioFormat;
    }

    /* renamed from: c */
    public abstract int mo5824c();

    /* renamed from: d */
    public abstract int mo5825d();

    /* renamed from: e */
    public abstract String mo5826e();

    /* renamed from: f */
    public abstract int mo5827f();

    /* renamed from: g */
    public abstract int mo5828g();
}
