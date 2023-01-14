package p497j.p502b.p503a;

import android.content.Context;
import java.util.List;
import org.reactnative.camera.p515h.C10988a;
import p174e.p319f.p406d.p411b.p412a.C9625a;
import p174e.p319f.p406d.p411b.p412a.C9626b;
import p174e.p319f.p406d.p411b.p412a.C9627c;
import p174e.p319f.p406d.p411b.p412a.C9629d;
import p497j.p502b.p504b.C10678a;

/* renamed from: j.b.a.b */
public class C10677b {

    /* renamed from: a */
    public static int f28155a = 0;

    /* renamed from: b */
    public static int f28156b = 1;

    /* renamed from: c */
    public static int f28157c = 2;

    /* renamed from: d */
    public static int f28158d;

    /* renamed from: e */
    private C9626b f28159e = null;

    /* renamed from: f */
    private C10988a f28160f;

    /* renamed from: g */
    private int f28161g = 0;

    /* renamed from: h */
    private C9627c.C9628a f28162h = new C9627c.C9628a().mo24126b(this.f28161g, new int[0]);

    public C10677b(Context context) {
    }

    /* renamed from: a */
    private void m36342a() {
        this.f28159e = C9629d.m32745a(this.f28162h.mo24125a());
    }

    /* renamed from: e */
    private void m36343e() {
        C9626b bVar = this.f28159e;
        if (bVar != null) {
            bVar.close();
            this.f28159e = null;
        }
    }

    /* renamed from: b */
    public List<C9625a> mo26599b(C10678a aVar) {
        if (!aVar.mo26603a().equals(this.f28160f)) {
            m36343e();
        }
        if (this.f28159e == null) {
            m36342a();
            this.f28160f = aVar.mo26603a();
        }
        return this.f28159e.mo14952f(aVar.mo26604b()).mo22776l();
    }

    /* renamed from: c */
    public boolean mo26600c() {
        if (this.f28159e != null) {
            return true;
        }
        m36342a();
        return true;
    }

    /* renamed from: d */
    public void mo26601d() {
        m36343e();
        this.f28160f = null;
    }

    /* renamed from: f */
    public void mo26602f(int i) {
        if (i != this.f28161g) {
            mo26601d();
            this.f28162h.mo24126b(i, new int[0]);
            this.f28161g = i;
        }
    }
}
