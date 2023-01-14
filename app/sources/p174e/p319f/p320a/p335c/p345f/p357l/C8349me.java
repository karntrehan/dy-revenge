package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.me */
final class C8349me<T> implements C8511ve<T> {

    /* renamed from: a */
    private final C8274ie f22799a;

    /* renamed from: b */
    private final C8294jf<?, ?> f22800b;

    /* renamed from: c */
    private final boolean f22801c;

    /* renamed from: d */
    private final C8437rc<?> f22802d;

    private C8349me(C8294jf<?, ?> jfVar, C8437rc<?> rcVar, C8274ie ieVar) {
        this.f22800b = jfVar;
        this.f22801c = rcVar.mo22114f(ieVar);
        this.f22802d = rcVar;
        this.f22799a = ieVar;
    }

    /* renamed from: j */
    static <T> C8349me<T> m28846j(C8294jf<?, ?> jfVar, C8437rc<?> rcVar, C8274ie ieVar) {
        return new C8349me<>(jfVar, rcVar, ieVar);
    }

    /* renamed from: a */
    public final int mo21975a(T t) {
        C8294jf<?, ?> jfVar = this.f22800b;
        int b = jfVar.mo21896b(jfVar.mo21897c(t));
        return this.f22801c ? b + this.f22802d.mo22110b(t).mo22204b() : b;
    }

    /* renamed from: b */
    public final void mo21976b(T t) {
        this.f22800b.mo21901g(t);
        this.f22802d.mo22113e(t);
    }

    /* renamed from: c */
    public final T mo21977c() {
        return this.f22799a.mo21766n().mo21660o();
    }

    /* renamed from: d */
    public final int mo21978d(T t) {
        int hashCode = this.f22800b.mo21897c(t).hashCode();
        return this.f22801c ? (hashCode * 53) + this.f22802d.mo22110b(t).f23187b.hashCode() : hashCode;
    }

    /* renamed from: e */
    public final void mo21979e(T t, T t2) {
        C8547xe.m29286f(this.f22800b, t, t2);
        if (this.f22801c) {
            C8547xe.m29285e(this.f22802d, t, t2);
        }
    }

    /* renamed from: f */
    public final void mo21980f(T t, C8329lc lcVar) {
        Iterator<Map.Entry<?, Object>> f = this.f22802d.mo22110b(t).mo22209f();
        if (f.hasNext()) {
            C8491uc ucVar = (C8491uc) f.next().getKey();
            if (ucVar.mo21712a() == C8143bg.MESSAGE) {
                ucVar.mo21714c();
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        C8294jf<?, ?> jfVar = this.f22800b;
        jfVar.mo21903i(jfVar.mo21897c(t), lcVar);
    }

    /* renamed from: g */
    public final void mo21981g(T t, byte[] bArr, int i, int i2, C8418qb qbVar) {
        C8197ed edVar = (C8197ed) t;
        C8313kf kfVar = edVar.zzc;
        if (kfVar == C8313kf.m28711c()) {
            kfVar = C8313kf.m28713e();
            edVar.zzc = kfVar;
        }
        C8509vc<C8159cd> w = ((C8140bd) t).mo21698w();
        Object obj = null;
        while (i < i2) {
            int j = C8436rb.m28991j(bArr, i, qbVar);
            int i3 = qbVar.f22953a;
            if (i3 == 11) {
                int i4 = 0;
                C8177dc dcVar = null;
                while (j < i2) {
                    j = C8436rb.m28991j(bArr, j, qbVar);
                    int i5 = qbVar.f22953a;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                C8178dd ddVar = (C8178dd) obj;
                                j = C8436rb.m28985d(C8457se.m29041a().mo22144b(ddVar.f22205c.getClass()), bArr, j, i2, qbVar);
                                w.mo22214j(ddVar.f22206d, qbVar.f22955c);
                            } else if (i6 == 2) {
                                j = C8436rb.m28982a(bArr, j, qbVar);
                                dcVar = (C8177dc) qbVar.f22955c;
                            }
                        }
                    } else if (i6 == 0) {
                        j = C8436rb.m28991j(bArr, j, qbVar);
                        i4 = qbVar.f22953a;
                        obj = this.f22802d.mo22112d(qbVar.f22956d, this.f22799a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    j = C8436rb.m28995n(i5, bArr, j, i2, qbVar);
                }
                if (dcVar != null) {
                    kfVar.mo21933h((i4 << 3) | 2, dcVar);
                }
                i = j;
            } else if ((i3 & 7) == 2) {
                Object d = this.f22802d.mo22112d(qbVar.f22956d, this.f22799a, i3 >>> 3);
                if (d != null) {
                    C8178dd ddVar2 = (C8178dd) d;
                    i = C8436rb.m28985d(C8457se.m29041a().mo22144b(ddVar2.f22205c.getClass()), bArr, j, i2, qbVar);
                    w.mo22214j(ddVar2.f22206d, qbVar.f22955c);
                } else {
                    i = C8436rb.m28990i(i3, bArr, j, i2, kfVar, qbVar);
                }
                obj = d;
            } else {
                i = C8436rb.m28995n(i3, bArr, j, i2, qbVar);
            }
        }
        if (i != i2) {
            throw C8366nd.m28888e();
        }
    }

    /* renamed from: h */
    public final boolean mo21982h(T t) {
        return this.f22802d.mo22110b(t).mo22216l();
    }

    /* renamed from: i */
    public final boolean mo21983i(T t, T t2) {
        if (!this.f22800b.mo21897c(t).equals(this.f22800b.mo21897c(t2))) {
            return false;
        }
        if (this.f22801c) {
            return this.f22802d.mo22110b(t).equals(this.f22802d.mo22110b(t2));
        }
        return true;
    }
}
