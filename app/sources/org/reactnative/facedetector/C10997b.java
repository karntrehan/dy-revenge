package org.reactnative.facedetector;

import android.content.Context;
import java.util.List;
import org.reactnative.camera.p515h.C10988a;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p174e.p319f.p406d.p411b.p414c.C9635c;
import p174e.p319f.p406d.p411b.p414c.C9636d;
import p174e.p319f.p406d.p411b.p414c.C9637e;
import p497j.p502b.p504b.C10678a;

/* renamed from: org.reactnative.facedetector.b */
public class C10997b {

    /* renamed from: a */
    public static int f28817a = 2;

    /* renamed from: b */
    public static int f28818b = 1;

    /* renamed from: c */
    public static int f28819c = 2;

    /* renamed from: d */
    public static int f28820d = 1;

    /* renamed from: e */
    public static int f28821e = 2;

    /* renamed from: f */
    public static int f28822f = 1;

    /* renamed from: g */
    private C9636d f28823g = null;

    /* renamed from: h */
    private C10988a f28824h;

    /* renamed from: i */
    private C9637e.C9638a f28825i = null;

    /* renamed from: j */
    private int f28826j = f28818b;

    /* renamed from: k */
    private int f28827k = f28820d;

    /* renamed from: l */
    private float f28828l = 0.15f;

    /* renamed from: m */
    private int f28829m = f28822f;

    public C10997b(Context context) {
        C9637e.C9638a aVar = new C9637e.C9638a();
        this.f28825i = aVar;
        aVar.mo24171f(this.f28828l);
        this.f28825i.mo24172g(this.f28829m);
        this.f28825i.mo24170e(this.f28827k);
        this.f28825i.mo24168c(this.f28826j);
    }

    /* renamed from: a */
    private void m37308a() {
        this.f28823g = C9635c.m32778a(this.f28825i.mo24166a());
    }

    /* renamed from: e */
    private void m37309e() {
        C9636d dVar = this.f28823g;
        if (dVar != null) {
            dVar.close();
            this.f28823g = null;
        }
    }

    /* renamed from: b */
    public List<C9633a> mo29006b(C10678a aVar) {
        if (!aVar.mo26603a().equals(this.f28824h)) {
            m37309e();
        }
        if (this.f28823g == null) {
            m37308a();
            this.f28824h = aVar.mo26603a();
        }
        return this.f28823g.mo14990f(aVar.mo26604b()).mo22776l();
    }

    /* renamed from: c */
    public boolean mo29007c() {
        if (this.f28823g != null) {
            return true;
        }
        m37308a();
        return true;
    }

    /* renamed from: d */
    public void mo29008d() {
        m37309e();
        this.f28824h = null;
    }

    /* renamed from: f */
    public void mo29009f(int i) {
        if (i != this.f28826j) {
            mo29008d();
            this.f28825i.mo24168c(i);
            this.f28826j = i;
        }
    }

    /* renamed from: g */
    public void mo29010g(int i) {
        if (i != this.f28827k) {
            mo29008d();
            this.f28825i.mo24170e(i);
            this.f28827k = i;
        }
    }

    /* renamed from: h */
    public void mo29011h(int i) {
        if (i != this.f28829m) {
            mo29008d();
            this.f28825i.mo24172g(i);
            this.f28829m = i;
        }
    }

    /* renamed from: i */
    public void mo29012i(boolean z) {
        mo29008d();
        if (z) {
            this.f28825i.mo24167b();
        }
    }
}
