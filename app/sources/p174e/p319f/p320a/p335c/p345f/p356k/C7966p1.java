package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;
import com.google.firebase.p156m.C4883f;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: e.f.a.c.f.k.p1 */
final class C7966p1 implements C4882e {

    /* renamed from: a */
    private static final Charset f21665a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C4878c f21666b;

    /* renamed from: c */
    private static final C4878c f21667c;

    /* renamed from: d */
    private static final C4881d<Map.Entry<Object, Object>> f21668d = C7953o1.f21648a;

    /* renamed from: e */
    private OutputStream f21669e;

    /* renamed from: f */
    private final Map<Class<?>, C4881d<?>> f21670f;

    /* renamed from: g */
    private final Map<Class<?>, C4883f<?>> f21671g;

    /* renamed from: h */
    private final C4881d<Object> f21672h;

    /* renamed from: i */
    private final C8018t1 f21673i = new C8018t1(this);

    static {
        C4878c.C4880b a = C4878c.m18654a("key");
        C7888j1 j1Var = new C7888j1();
        j1Var.mo21417a(1);
        f21666b = a.mo14853b(j1Var.mo21418b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("value");
        C7888j1 j1Var2 = new C7888j1();
        j1Var2.mo21417a(2);
        f21667c = a2.mo14853b(j1Var2.mo21418b()).mo14852a();
    }

    C7966p1(OutputStream outputStream, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f21669e = outputStream;
        this.f21670f = map;
        this.f21671g = map2;
        this.f21672h = dVar;
    }

    /* renamed from: k */
    static /* synthetic */ void m28120k(Map.Entry entry, C4882e eVar) {
        eVar.mo14857f(f21666b, entry.getKey());
        eVar.mo14857f(f21667c, entry.getValue());
    }

    /* renamed from: l */
    private static int m28121l(C4878c cVar) {
        C7940n1 n1Var = (C7940n1) cVar.mo14848c(C7940n1.class);
        if (n1Var != null) {
            return n1Var.zza();
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m28122m(C4881d<T> dVar, T t) {
        OutputStream outputStream;
        C7901k1 k1Var = new C7901k1();
        try {
            outputStream = this.f21669e;
            this.f21669e = k1Var;
            dVar.mo10875a(t, this);
            this.f21669e = outputStream;
            long a = k1Var.mo21431a();
            k1Var.close();
            return a;
        } catch (Throwable th) {
            try {
                k1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static C7940n1 m28123n(C4878c cVar) {
        C7940n1 n1Var = (C7940n1) cVar.mo14848c(C7940n1.class);
        if (n1Var != null) {
            return n1Var;
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C7966p1 m28124o(C4881d<T> dVar, C4878c cVar, T t, boolean z) {
        long m = m28122m(dVar, t);
        if (z && m == 0) {
            return this;
        }
        m28127r((m28121l(cVar) << 3) | 2);
        m28128s(m);
        dVar.mo10875a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C7966p1 m28125p(C4883f<T> fVar, C4878c cVar, T t, boolean z) {
        this.f21673i.mo21576a(cVar, z);
        fVar.mo14858a(t, this.f21673i);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m28126q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m28127r(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f21669e;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    /* renamed from: s */
    private final void m28128s(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f21669e;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4882e mo14854a(C4878c cVar, boolean z) {
        mo21530h(cVar, z ? 1 : 0, true);
        return this;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C4882e mo14855b(C4878c cVar, long j) {
        mo21531i(cVar, j, true);
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4882e mo14856c(C4878c cVar, int i) {
        mo21530h(cVar, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4882e mo21527d(C4878c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m28127r((m28121l(cVar) << 3) | 1);
        this.f21669e.write(m28126q(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4882e mo21528e(C4878c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m28127r((m28121l(cVar) << 3) | 5);
        this.f21669e.write(m28126q(4).putFloat(f).array());
        return this;
    }

    /* renamed from: f */
    public final C4882e mo14857f(C4878c cVar, Object obj) {
        mo21529g(cVar, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4882e mo21529g(C4878c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m28127r((m28121l(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f21665a);
            m28127r(bytes.length);
            this.f21669e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo21529g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m28124o(f21668d, cVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo21527d(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo21528e(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo21531i(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo21530h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m28127r((m28121l(cVar) << 3) | 2);
            m28127r(bArr.length);
            this.f21669e.write(bArr);
            return this;
        } else {
            C4881d dVar = this.f21670f.get(obj.getClass());
            if (dVar != null) {
                m28124o(dVar, cVar, obj, z);
                return this;
            }
            C4883f fVar = this.f21671g.get(obj.getClass());
            if (fVar != null) {
                m28125p(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C7914l1) {
                mo21530h(cVar, ((C7914l1) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo21530h(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m28124o(this.f21672h, cVar, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C7966p1 mo21530h(C4878c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C7940n1 n = m28123n(cVar);
        C7927m1 m1Var = C7927m1.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m28127r(n.zza() << 3);
            m28127r(i);
        } else if (ordinal == 1) {
            m28127r(n.zza() << 3);
            m28127r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m28127r((n.zza() << 3) | 5);
            this.f21669e.write(m28126q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C7966p1 mo21531i(C4878c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C7940n1 n = m28123n(cVar);
        C7927m1 m1Var = C7927m1.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m28127r(n.zza() << 3);
            m28128s(j);
        } else if (ordinal == 1) {
            m28127r(n.zza() << 3);
            m28128s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m28127r((n.zza() << 3) | 1);
            this.f21669e.write(m28126q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C7966p1 mo21532j(Object obj) {
        if (obj == null) {
            return this;
        }
        C4881d dVar = this.f21670f.get(obj.getClass());
        if (dVar != null) {
            dVar.mo10875a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append("No encoder for ");
        sb.append(valueOf);
        throw new C4877b(sb.toString());
    }
}
