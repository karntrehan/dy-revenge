package p174e.p175a.p176a.p177i;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5378c;
import p174e.p175a.p176a.p177i.p178q.C5406b;
import p174e.p175a.p176a.p177i.p178q.C5407c;
import p174e.p175a.p176a.p179j.C5410b;
import p174e.p175a.p176a.p179j.C5413e;
import p174e.p175a.p176a.p180k.C5415b;

/* renamed from: e.a.a.i.j */
public class C5393j implements C5378c {

    /* renamed from: f */
    private C5410b f15053f;

    /* renamed from: o */
    private String f15054o = null;

    /* renamed from: p */
    protected boolean f15055p = false;

    /* renamed from: q */
    protected boolean f15056q = false;

    /* renamed from: r */
    private Iterator f15057r = null;

    /* renamed from: e.a.a.i.j$a */
    private class C5394a implements Iterator {

        /* renamed from: f */
        private int f15058f = 0;

        /* renamed from: o */
        private C5399m f15059o;

        /* renamed from: p */
        private String f15060p;

        /* renamed from: q */
        private Iterator f15061q = null;

        /* renamed from: r */
        private int f15062r = 0;

        /* renamed from: s */
        private Iterator f15063s = Collections.EMPTY_LIST.iterator();

        /* renamed from: t */
        private C5415b f15064t = null;

        /* renamed from: e.a.a.i.j$a$a */
        class C5395a implements C5415b {

            /* renamed from: a */
            final /* synthetic */ C5399m f15066a;

            /* renamed from: b */
            final /* synthetic */ String f15067b;

            /* renamed from: c */
            final /* synthetic */ String f15068c;

            /* renamed from: d */
            final /* synthetic */ String f15069d;

            C5395a(C5399m mVar, String str, String str2, String str3) {
                this.f15066a = mVar;
                this.f15067b = str;
                this.f15068c = str2;
                this.f15069d = str3;
            }

            /* renamed from: a */
            public String mo16245a() {
                return this.f15068c;
            }

            public String getValue() {
                return this.f15069d;
            }
        }

        public C5394a() {
        }

        public C5394a(C5399m mVar, String str, int i) {
            this.f15059o = mVar;
            this.f15058f = 0;
            if (mVar.mo16259T().mo16347o()) {
                C5393j.this.mo16233d(mVar.mo16258S());
            }
            this.f15060p = mo16237b(mVar, str, i);
        }

        /* renamed from: e */
        private boolean m19985e(Iterator it) {
            C5393j jVar = C5393j.this;
            if (jVar.f15055p) {
                jVar.f15055p = false;
                this.f15063s = Collections.EMPTY_LIST.iterator();
            }
            if (!this.f15063s.hasNext() && it.hasNext()) {
                int i = this.f15062r + 1;
                this.f15062r = i;
                this.f15063s = new C5394a((C5399m) it.next(), this.f15060p, i);
            }
            if (!this.f15063s.hasNext()) {
                return false;
            }
            this.f15064t = (C5415b) this.f15063s.next();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo16237b(C5399m mVar, String str, int i) {
            String str2;
            String str3;
            if (mVar.mo16260U() == null || mVar.mo16259T().mo16347o()) {
                return null;
            }
            if (mVar.mo16260U().mo16259T().mo16341i()) {
                str3 = "[" + String.valueOf(i) + "]";
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str3 = mVar.mo16258S();
                str2 = "/";
            }
            if (str == null || str.length() == 0) {
                return str3;
            }
            if (C5393j.this.mo16232c().mo16320i()) {
                return !str3.startsWith("?") ? str3 : str3.substring(1);
            }
            return str + str2 + str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C5415b mo16238c(C5399m mVar, String str, String str2) {
            return new C5395a(mVar, str, str2, mVar.mo16259T().mo16347o() ? null : mVar.mo16264Z());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C5415b mo16239d() {
            return this.f15064t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public boolean mo16240f() {
            this.f15058f = 1;
            if (this.f15059o.mo16260U() == null || (C5393j.this.mo16232c().mo16321j() && this.f15059o.mo16265a0())) {
                return hasNext();
            }
            this.f15064t = mo16238c(this.f15059o, C5393j.this.mo16231b(), this.f15060p);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo16241g(C5415b bVar) {
            this.f15064t = bVar;
        }

        public boolean hasNext() {
            if (this.f15064t != null) {
                return true;
            }
            int i = this.f15058f;
            if (i == 0) {
                return mo16240f();
            }
            if (i == 1) {
                if (this.f15061q == null) {
                    this.f15061q = this.f15059o.mo16273g0();
                }
                boolean e = m19985e(this.f15061q);
                if (e || !this.f15059o.mo16266b0() || C5393j.this.mo16232c().mo16322k()) {
                    return e;
                }
                this.f15058f = 2;
                this.f15061q = null;
                return hasNext();
            }
            if (this.f15061q == null) {
                this.f15061q = this.f15059o.mo16275h0();
            }
            return m19985e(this.f15061q);
        }

        public Object next() {
            if (hasNext()) {
                C5415b bVar = this.f15064t;
                this.f15064t = null;
                return bVar;
            }
            throw new NoSuchElementException("There are no more nodes to return");
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.a.a.i.j$b */
    private class C5396b extends C5394a {

        /* renamed from: v */
        private String f15071v;

        /* renamed from: w */
        private Iterator f15072w;

        /* renamed from: x */
        private int f15073x = 0;

        public C5396b(C5399m mVar, String str) {
            super();
            if (mVar.mo16259T().mo16347o()) {
                C5393j.this.mo16233d(mVar.mo16258S());
            }
            this.f15071v = mo16237b(mVar, str, 1);
            this.f15072w = mVar.mo16273g0();
        }

        public boolean hasNext() {
            if (mo16239d() != null) {
                return true;
            }
            if (C5393j.this.f15055p || !this.f15072w.hasNext()) {
                return false;
            }
            C5399m mVar = (C5399m) this.f15072w.next();
            this.f15073x++;
            String str = null;
            if (mVar.mo16259T().mo16347o()) {
                C5393j.this.mo16233d(mVar.mo16258S());
            } else if (mVar.mo16260U() != null) {
                str = mo16237b(mVar, this.f15071v, this.f15073x);
            }
            if (C5393j.this.mo16232c().mo16321j() && mVar.mo16265a0()) {
                return hasNext();
            }
            mo16241g(mo16238c(mVar, C5393j.this.mo16231b(), str));
            return true;
        }
    }

    public C5393j(C5397k kVar, String str, String str2, C5410b bVar) {
        C5399m mVar;
        String str3 = null;
        this.f15053f = bVar == null ? new C5410b() : bVar;
        boolean z = str != null && str.length() > 0;
        boolean z2 = str2 != null && str2.length() > 0;
        if (!z && !z2) {
            mVar = kVar.mo16247c();
        } else if (z && z2) {
            C5406b a = C5407c.m20091a(str, str2);
            C5406b bVar2 = new C5406b();
            for (int i = 0; i < a.mo16301c() - 1; i++) {
                bVar2.mo16299a(a.mo16300b(i));
            }
            mVar = C5401n.m20055g(kVar.mo16247c(), a, false, (C5413e) null);
            this.f15054o = str;
            str3 = bVar2.toString();
        } else if (!z || z2) {
            throw new C5377b("Schema namespace URI is required", 101);
        } else {
            mVar = C5401n.m20058j(kVar.mo16247c(), str, false);
        }
        if (mVar != null) {
            this.f15057r = !this.f15053f.mo16319h() ? new C5394a(mVar, str3, 1) : new C5396b(mVar, str3);
        } else {
            this.f15057r = Collections.EMPTY_LIST.iterator();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo16231b() {
        return this.f15054o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C5410b mo16232c() {
        return this.f15053f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16233d(String str) {
        this.f15054o = str;
    }

    public boolean hasNext() {
        return this.f15057r.hasNext();
    }

    public Object next() {
        return this.f15057r.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
