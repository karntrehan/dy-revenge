package p174e.p319f.p406d.p411b.p414c;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p174e.p319f.p320a.p335c.p345f.p356k.C7781ab;
import p174e.p319f.p320a.p335c.p345f.p356k.C7798c2;
import p174e.p319f.p320a.p335c.p345f.p356k.C7826e4;
import p174e.p319f.p320a.p335c.p345f.p356k.C7833eb;
import p174e.p319f.p320a.p335c.p345f.p356k.C7924lb;
import p174e.p319f.p320a.p335c.p345f.p356k.C7950nb;
import p174e.p319f.p320a.p335c.p345f.p356k.C8054vb;
import p174e.p319f.p320a.p335c.p345f.p356k.C8067wb;

/* renamed from: e.f.d.b.c.a */
public class C9633a {

    /* renamed from: a */
    private final Rect f25753a;

    /* renamed from: b */
    private int f25754b;

    /* renamed from: c */
    private final float f25755c;

    /* renamed from: d */
    private final float f25756d;

    /* renamed from: e */
    private final float f25757e;

    /* renamed from: f */
    private final float f25758f;

    /* renamed from: g */
    private final float f25759g;

    /* renamed from: h */
    private final float f25760h;

    /* renamed from: i */
    private final SparseArray<C9639f> f25761i = new SparseArray<>();

    /* renamed from: j */
    private final SparseArray<C9634b> f25762j = new SparseArray<>();

    public C9633a(C7826e4 e4Var) {
        float f = e4Var.f21350p;
        float f2 = e4Var.f21352r / 2.0f;
        float f3 = e4Var.f21351q;
        float f4 = e4Var.f21353s / 2.0f;
        this.f25753a = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.f25754b = e4Var.f21349o;
        for (C7950nb nbVar : e4Var.f21357w) {
            if (m32761p(nbVar.f21645q)) {
                SparseArray<C9639f> sparseArray = this.f25761i;
                int i = nbVar.f21645q;
                sparseArray.put(i, new C9639f(i, new PointF(nbVar.f21643o, nbVar.f21644p)));
            }
        }
        for (C7798c2 c2Var : e4Var.f21346A) {
            int i2 = c2Var.f21260o;
            if (m32760o(i2)) {
                SparseArray<C9634b> sparseArray2 = this.f25762j;
                PointF[] pointFArr = c2Var.f21259f;
                Objects.requireNonNull(pointFArr);
                int length = pointFArr.length;
                long j = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j > 2147483647L ? RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO : (int) j);
                Collections.addAll(arrayList, pointFArr);
                sparseArray2.put(i2, new C9634b(i2, arrayList));
            }
        }
        this.f25758f = e4Var.f21356v;
        this.f25759g = e4Var.f21354t;
        this.f25760h = e4Var.f21355u;
        this.f25757e = e4Var.f21360z;
        this.f25756d = e4Var.f21358x;
        this.f25755c = e4Var.f21359y;
    }

    public C9633a(C7833eb ebVar) {
        this.f25753a = ebVar.mo21325I();
        this.f25754b = ebVar.mo21324H();
        for (C7924lb next : ebVar.mo21327L()) {
            if (m32761p(next.mo21446o())) {
                this.f25761i.put(next.mo21446o(), new C9639f(next.mo21446o(), next.mo21447p()));
            }
        }
        for (C7781ab next2 : ebVar.mo21326J()) {
            int o = next2.mo21228o();
            if (m32760o(o)) {
                this.f25762j.put(o, new C9634b(o, next2.mo21229p()));
            }
        }
        this.f25758f = ebVar.mo21323G();
        this.f25759g = ebVar.mo21329p();
        this.f25760h = -ebVar.mo21321C();
        this.f25757e = ebVar.mo21322E();
        this.f25756d = ebVar.mo21328o();
        this.f25755c = ebVar.mo21330r();
    }

    /* renamed from: o */
    private static boolean m32760o(int i) {
        return i <= 15 && i > 0;
    }

    /* renamed from: p */
    private static boolean m32761p(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    /* renamed from: a */
    public List<C9639f> mo24137a() {
        ArrayList arrayList = new ArrayList();
        int size = this.f25761i.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(this.f25761i.valueAt(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public Rect mo24138b() {
        return this.f25753a;
    }

    @RecentlyNullable
    /* renamed from: c */
    public C9634b mo24139c(int i) {
        return this.f25762j.get(i);
    }

    /* renamed from: d */
    public float mo24140d() {
        return this.f25758f;
    }

    /* renamed from: e */
    public float mo24141e() {
        return this.f25759g;
    }

    /* renamed from: f */
    public float mo24142f() {
        return this.f25760h;
    }

    @RecentlyNullable
    /* renamed from: g */
    public C9639f mo24143g(int i) {
        return this.f25761i.get(i);
    }

    @RecentlyNullable
    /* renamed from: h */
    public Float mo24144h() {
        float f = this.f25757e;
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        return Float.valueOf(this.f25756d);
    }

    @RecentlyNullable
    /* renamed from: i */
    public Float mo24145i() {
        float f = this.f25755c;
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        return Float.valueOf(f);
    }

    @RecentlyNullable
    /* renamed from: j */
    public Float mo24146j() {
        float f = this.f25757e;
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        return Float.valueOf(f);
    }

    @RecentlyNullable
    /* renamed from: k */
    public Integer mo24147k() {
        int i = this.f25754b;
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    @RecentlyNonNull
    /* renamed from: l */
    public final SparseArray<C9634b> mo24148l() {
        return this.f25762j;
    }

    /* renamed from: m */
    public final void mo24149m(@RecentlyNonNull SparseArray<C9634b> sparseArray) {
        this.f25762j.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f25762j.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    /* renamed from: n */
    public final void mo24150n(int i) {
        this.f25754b = -1;
    }

    @RecentlyNonNull
    public String toString() {
        C8054vb a = C8067wb.m28281a("Face");
        a.mo21627c("boundingBox", this.f25753a);
        a.mo21626b("trackingId", this.f25754b);
        a.mo21625a("rightEyeOpenProbability", this.f25755c);
        a.mo21625a("leftEyeOpenProbability", this.f25756d);
        a.mo21625a("smileProbability", this.f25757e);
        a.mo21625a("eulerX", this.f25758f);
        a.mo21625a("eulerY", this.f25759g);
        a.mo21625a("eulerZ", this.f25760h);
        C8054vb a2 = C8067wb.m28281a("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (m32761p(i)) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("landmark_");
                sb.append(i);
                a2.mo21627c(sb.toString(), mo24143g(i));
            }
        }
        a.mo21627c("landmarks", a2.toString());
        C8054vb a3 = C8067wb.m28281a("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Contour_");
            sb2.append(i2);
            a3.mo21627c(sb2.toString(), mo24139c(i2));
        }
        a.mo21627c("contours", a3.toString());
        return a.toString();
    }
}
