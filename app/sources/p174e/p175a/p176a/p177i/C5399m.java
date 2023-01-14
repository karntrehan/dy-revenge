package p174e.p175a.p176a.p177i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.p179j.C5413e;

/* renamed from: e.a.a.i.m */
class C5399m implements Comparable {

    /* renamed from: f */
    private String f15079f;

    /* renamed from: o */
    private String f15080o;

    /* renamed from: p */
    private C5399m f15081p;

    /* renamed from: q */
    private List f15082q;

    /* renamed from: r */
    private List f15083r;

    /* renamed from: s */
    private C5413e f15084s;

    /* renamed from: t */
    private boolean f15085t;

    /* renamed from: u */
    private boolean f15086u;

    /* renamed from: v */
    private boolean f15087v;

    /* renamed from: w */
    private boolean f15088w;

    /* renamed from: e.a.a.i.m$a */
    class C5400a implements Iterator {

        /* renamed from: f */
        final /* synthetic */ Iterator f15089f;

        C5400a(Iterator it) {
            this.f15089f = it;
        }

        public boolean hasNext() {
            return this.f15089f.hasNext();
        }

        public Object next() {
            return this.f15089f.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
        }
    }

    static {
        Class<C5399m> cls = C5399m.class;
    }

    public C5399m(String str, C5413e eVar) {
        this(str, (String) null, eVar);
    }

    public C5399m(String str, String str2, C5413e eVar) {
        this.f15082q = null;
        this.f15083r = null;
        this.f15084s = null;
        this.f15079f = str;
        this.f15080o = str2;
        this.f15084s = eVar;
    }

    /* renamed from: D */
    private C5399m m20004D(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5399m mVar = (C5399m) it.next();
            if (mVar.mo16258S().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    /* renamed from: O */
    private List m20005O() {
        if (this.f15082q == null) {
            this.f15082q = new ArrayList(0);
        }
        return this.f15082q;
    }

    /* renamed from: W */
    private List m20006W() {
        if (this.f15083r == null) {
            this.f15083r = new ArrayList(0);
        }
        return this.f15083r;
    }

    /* renamed from: e0 */
    private boolean m20007e0() {
        return "xml:lang".equals(this.f15079f);
    }

    /* renamed from: f0 */
    private boolean m20008f0() {
        return "rdf:type".equals(this.f15079f);
    }

    /* renamed from: v */
    private void m20009v(String str) {
        if (!HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) && mo16252F(str) != null) {
            throw new C5377b("Duplicate property or field node '" + str + "'", 203);
        }
    }

    /* renamed from: z */
    private void m20010z(String str) {
        if (!HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) && mo16253K(str) != null) {
            throw new C5377b("Duplicate '" + str + "' qualifier", 203);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo16250A() {
        if (this.f15082q.isEmpty()) {
            this.f15082q = null;
        }
    }

    /* renamed from: B */
    public void mo16251B(C5399m mVar) {
        try {
            Iterator g0 = mo16273g0();
            while (g0.hasNext()) {
                mVar.mo16272g((C5399m) ((C5399m) g0.next()).clone());
            }
            Iterator h0 = mo16275h0();
            while (h0.hasNext()) {
                mVar.mo16274h((C5399m) ((C5399m) h0.next()).clone());
            }
        } catch (C5377b unused) {
        }
    }

    /* renamed from: F */
    public C5399m mo16252F(String str) {
        return m20004D(m20005O(), str);
    }

    /* renamed from: K */
    public C5399m mo16253K(String str) {
        return m20004D(this.f15083r, str);
    }

    /* renamed from: N */
    public C5399m mo16254N(int i) {
        return (C5399m) m20005O().get(i - 1);
    }

    /* renamed from: P */
    public int mo16255P() {
        List list = this.f15082q;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: Q */
    public boolean mo16256Q() {
        return this.f15086u;
    }

    /* renamed from: R */
    public boolean mo16257R() {
        return this.f15088w;
    }

    /* renamed from: S */
    public String mo16258S() {
        return this.f15079f;
    }

    /* renamed from: T */
    public C5413e mo16259T() {
        if (this.f15084s == null) {
            this.f15084s = new C5413e();
        }
        return this.f15084s;
    }

    /* renamed from: U */
    public C5399m mo16260U() {
        return this.f15081p;
    }

    /* renamed from: V */
    public C5399m mo16261V(int i) {
        return (C5399m) m20006W().get(i - 1);
    }

    /* renamed from: X */
    public int mo16262X() {
        List list = this.f15083r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: Y */
    public List mo16263Y() {
        return Collections.unmodifiableList(new ArrayList(m20005O()));
    }

    /* renamed from: Z */
    public String mo16264Z() {
        return this.f15080o;
    }

    /* renamed from: a0 */
    public boolean mo16265a0() {
        List list = this.f15082q;
        return list != null && list.size() > 0;
    }

    /* renamed from: b0 */
    public boolean mo16266b0() {
        List list = this.f15083r;
        return list != null && list.size() > 0;
    }

    /* renamed from: c0 */
    public boolean mo16267c0() {
        return this.f15087v;
    }

    public Object clone() {
        C5413e eVar;
        try {
            eVar = new C5413e(mo16259T().mo16325d());
        } catch (C5377b unused) {
            eVar = new C5413e();
        }
        C5399m mVar = new C5399m(this.f15079f, this.f15080o, eVar);
        mo16251B(mVar);
        return mVar;
    }

    public int compareTo(Object obj) {
        String str;
        String S;
        if (mo16259T().mo16347o()) {
            str = this.f15080o;
            S = ((C5399m) obj).mo16264Z();
        } else {
            str = this.f15079f;
            S = ((C5399m) obj).mo16258S();
        }
        return str.compareTo(S);
    }

    /* renamed from: d0 */
    public boolean mo16270d0() {
        return this.f15085t;
    }

    /* renamed from: e */
    public void mo16271e(int i, C5399m mVar) {
        m20009v(mVar.mo16258S());
        mVar.mo16288u0(this);
        m20005O().add(i - 1, mVar);
    }

    /* renamed from: g */
    public void mo16272g(C5399m mVar) {
        m20009v(mVar.mo16258S());
        mVar.mo16288u0(this);
        m20005O().add(mVar);
    }

    /* renamed from: g0 */
    public Iterator mo16273g0() {
        return this.f15082q != null ? m20005O().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    /* renamed from: h */
    public void mo16274h(C5399m mVar) {
        List W;
        boolean h;
        m20010z(mVar.mo16258S());
        mVar.mo16288u0(this);
        mVar.mo16259T().mo16358z(true);
        mo16259T().mo16356x(true);
        if (mVar.m20007e0()) {
            this.f15084s.mo16355w(true);
            W = m20006W();
            h = false;
        } else if (mVar.m20008f0()) {
            this.f15084s.mo16357y(true);
            W = m20006W();
            h = this.f15084s.mo16340h();
        } else {
            m20006W().add(mVar);
            return;
        }
        W.add(h ? 1 : 0, mVar);
    }

    /* renamed from: h0 */
    public Iterator mo16275h0() {
        return this.f15083r != null ? new C5400a(m20006W().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    /* renamed from: i0 */
    public void mo16276i0(int i) {
        m20005O().remove(i - 1);
        mo16250A();
    }

    /* renamed from: j0 */
    public void mo16277j0(C5399m mVar) {
        m20005O().remove(mVar);
        mo16250A();
    }

    /* renamed from: k0 */
    public void mo16278k0() {
        this.f15082q = null;
    }

    /* renamed from: l0 */
    public void mo16279l0(C5399m mVar) {
        C5413e T = mo16259T();
        if (mVar.m20007e0()) {
            T.mo16355w(false);
        } else if (mVar.m20008f0()) {
            T.mo16357y(false);
        }
        m20006W().remove(mVar);
        if (this.f15083r.isEmpty()) {
            T.mo16356x(false);
            this.f15083r = null;
        }
    }

    /* renamed from: m0 */
    public void mo16280m0() {
        C5413e T = mo16259T();
        T.mo16356x(false);
        T.mo16355w(false);
        T.mo16357y(false);
        this.f15083r = null;
    }

    /* renamed from: n0 */
    public void mo16281n0(int i, C5399m mVar) {
        mVar.mo16288u0(this);
        m20005O().set(i - 1, mVar);
    }

    /* renamed from: o0 */
    public void mo16282o0(boolean z) {
        this.f15087v = z;
    }

    /* renamed from: p0 */
    public void mo16283p0(boolean z) {
        this.f15086u = z;
    }

    /* renamed from: q0 */
    public void mo16284q0(boolean z) {
        this.f15088w = z;
    }

    /* renamed from: r0 */
    public void mo16285r0(boolean z) {
        this.f15085t = z;
    }

    /* renamed from: s0 */
    public void mo16286s0(String str) {
        this.f15079f = str;
    }

    /* renamed from: t0 */
    public void mo16287t0(C5413e eVar) {
        this.f15084s = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo16288u0(C5399m mVar) {
        this.f15081p = mVar;
    }

    /* renamed from: v0 */
    public void mo16289v0(String str) {
        this.f15080o = str;
    }
}
