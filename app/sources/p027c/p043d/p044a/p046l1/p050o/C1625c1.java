package p027c.p043d.p044a.p046l1.p050o;

import android.media.MediaFormat;
import android.util.Size;
import p027c.p043d.p044a.p046l1.p050o.C1651n0;

/* renamed from: c.d.a.l1.o.c1 */
public abstract class C1625c1 implements C1673w0 {

    /* renamed from: c.d.a.l1.o.c1$a */
    public static abstract class C1626a {
        C1626a() {
        }

        /* renamed from: a */
        public abstract C1625c1 mo5801a();

        /* renamed from: b */
        public abstract C1626a mo5802b(int i);

        /* renamed from: c */
        public abstract C1626a mo5803c(int i);

        /* renamed from: d */
        public abstract C1626a mo5804d(int i);

        /* renamed from: e */
        public abstract C1626a mo5805e(int i);

        /* renamed from: f */
        public abstract C1626a mo5806f(String str);

        /* renamed from: g */
        public abstract C1626a mo5807g(Size size);
    }

    C1625c1() {
    }

    /* renamed from: b */
    public static C1626a m7099b() {
        return new C1651n0.C1653b().mo5843h(C1673w0.f5020a).mo5805e(1).mo5803c(2130708361);
    }

    /* renamed from: a */
    public MediaFormat mo5793a() {
        Size i = mo5800i();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(mo5798g(), i.getWidth(), i.getHeight());
        createVideoFormat.setInteger("color-format", mo5795d());
        createVideoFormat.setInteger("bitrate", mo5794c());
        createVideoFormat.setInteger("frame-rate", mo5796e());
        createVideoFormat.setInteger("i-frame-interval", mo5797f());
        if (mo5799h() != C1673w0.f5020a) {
            createVideoFormat.setInteger("profile", mo5799h());
        }
        return createVideoFormat;
    }

    /* renamed from: c */
    public abstract int mo5794c();

    /* renamed from: d */
    public abstract int mo5795d();

    /* renamed from: e */
    public abstract int mo5796e();

    /* renamed from: f */
    public abstract int mo5797f();

    /* renamed from: g */
    public abstract String mo5798g();

    /* renamed from: h */
    public abstract int mo5799h();

    /* renamed from: i */
    public abstract Size mo5800i();
}
