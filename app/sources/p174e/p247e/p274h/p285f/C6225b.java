package p174e.p247e.p274h.p285f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.List;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p274h.p284e.C6205q;

/* renamed from: e.e.h.f.b */
public class C6225b {

    /* renamed from: a */
    public static final C6205q.C6207b f17227a = C6205q.C6207b.f17206h;

    /* renamed from: b */
    public static final C6205q.C6207b f17228b = C6205q.C6207b.f17207i;

    /* renamed from: c */
    private Resources f17229c;

    /* renamed from: d */
    private int f17230d;

    /* renamed from: e */
    private float f17231e;

    /* renamed from: f */
    private Drawable f17232f;

    /* renamed from: g */
    private C6205q.C6207b f17233g;

    /* renamed from: h */
    private Drawable f17234h;

    /* renamed from: i */
    private C6205q.C6207b f17235i;

    /* renamed from: j */
    private Drawable f17236j;

    /* renamed from: k */
    private C6205q.C6207b f17237k;

    /* renamed from: l */
    private Drawable f17238l;

    /* renamed from: m */
    private C6205q.C6207b f17239m;

    /* renamed from: n */
    private C6205q.C6207b f17240n;

    /* renamed from: o */
    private Matrix f17241o;

    /* renamed from: p */
    private PointF f17242p;

    /* renamed from: q */
    private ColorFilter f17243q;

    /* renamed from: r */
    private Drawable f17244r;

    /* renamed from: s */
    private List<Drawable> f17245s;

    /* renamed from: t */
    private Drawable f17246t;

    /* renamed from: u */
    private C6227d f17247u;

    public C6225b(Resources resources) {
        this.f17229c = resources;
        m23565s();
    }

    /* renamed from: s */
    private void m23565s() {
        this.f17230d = 300;
        this.f17231e = 0.0f;
        this.f17232f = null;
        C6205q.C6207b bVar = f17227a;
        this.f17233g = bVar;
        this.f17234h = null;
        this.f17235i = bVar;
        this.f17236j = null;
        this.f17237k = bVar;
        this.f17238l = null;
        this.f17239m = bVar;
        this.f17240n = f17228b;
        this.f17241o = null;
        this.f17242p = null;
        this.f17243q = null;
        this.f17244r = null;
        this.f17245s = null;
        this.f17246t = null;
        this.f17247u = null;
    }

    /* renamed from: t */
    public static C6225b m23566t(Resources resources) {
        return new C6225b(resources);
    }

    /* renamed from: x */
    private void m23567x() {
        List<Drawable> list = this.f17245s;
        if (list != null) {
            for (Drawable g : list) {
                C6062k.m22839g(g);
            }
        }
    }

    /* renamed from: a */
    public C6224a mo18473a() {
        m23567x();
        return new C6224a(this);
    }

    /* renamed from: b */
    public ColorFilter mo18474b() {
        return this.f17243q;
    }

    /* renamed from: c */
    public PointF mo18475c() {
        return this.f17242p;
    }

    /* renamed from: d */
    public C6205q.C6207b mo18476d() {
        return this.f17240n;
    }

    /* renamed from: e */
    public Drawable mo18477e() {
        return this.f17244r;
    }

    /* renamed from: f */
    public int mo18478f() {
        return this.f17230d;
    }

    /* renamed from: g */
    public Drawable mo18479g() {
        return this.f17236j;
    }

    /* renamed from: h */
    public C6205q.C6207b mo18480h() {
        return this.f17237k;
    }

    /* renamed from: i */
    public List<Drawable> mo18481i() {
        return this.f17245s;
    }

    /* renamed from: j */
    public Drawable mo18482j() {
        return this.f17232f;
    }

    /* renamed from: k */
    public C6205q.C6207b mo18483k() {
        return this.f17233g;
    }

    /* renamed from: l */
    public Drawable mo18484l() {
        return this.f17246t;
    }

    /* renamed from: m */
    public Drawable mo18485m() {
        return this.f17238l;
    }

    /* renamed from: n */
    public C6205q.C6207b mo18486n() {
        return this.f17239m;
    }

    /* renamed from: o */
    public Resources mo18487o() {
        return this.f17229c;
    }

    /* renamed from: p */
    public Drawable mo18488p() {
        return this.f17234h;
    }

    /* renamed from: q */
    public C6205q.C6207b mo18489q() {
        return this.f17235i;
    }

    /* renamed from: r */
    public C6227d mo18490r() {
        return this.f17247u;
    }

    /* renamed from: u */
    public C6225b mo18491u(C6205q.C6207b bVar) {
        this.f17240n = bVar;
        this.f17241o = null;
        return this;
    }

    /* renamed from: v */
    public C6225b mo18492v(int i) {
        this.f17230d = i;
        return this;
    }

    /* renamed from: w */
    public C6225b mo18493w(C6227d dVar) {
        this.f17247u = dVar;
        return this;
    }
}
