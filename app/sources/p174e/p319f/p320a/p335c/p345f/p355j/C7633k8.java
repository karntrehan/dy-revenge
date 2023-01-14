package p174e.p319f.p320a.p335c.p345f.p355j;

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

/* renamed from: e.f.a.c.f.j.k8 */
final class C7633k8 implements C4882e {

    /* renamed from: a */
    private static final Charset f20548a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C4878c f20549b;

    /* renamed from: c */
    private static final C4878c f20550c;

    /* renamed from: d */
    private static final C4881d<Map.Entry<Object, Object>> f20551d = C7623j8.f20529a;

    /* renamed from: e */
    private OutputStream f20552e;

    /* renamed from: f */
    private final Map<Class<?>, C4881d<?>> f20553f;

    /* renamed from: g */
    private final Map<Class<?>, C4883f<?>> f20554g;

    /* renamed from: h */
    private final C4881d<Object> f20555h;

    /* renamed from: i */
    private final C7564e f20556i = new C7564e(this);

    static {
        C4878c.C4880b a = C4878c.m18654a("key");
        C7573e8 e8Var = new C7573e8();
        e8Var.mo21078a(1);
        f20549b = a.mo14853b(e8Var.mo21079b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("value");
        C7573e8 e8Var2 = new C7573e8();
        e8Var2.mo21078a(2);
        f20550c = a2.mo14853b(e8Var2.mo21079b()).mo14852a();
    }

    C7633k8(OutputStream outputStream, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f20552e = outputStream;
        this.f20553f = map;
        this.f20554g = map2;
        this.f20555h = dVar;
    }

    /* renamed from: k */
    static /* synthetic */ void m27672k(Map.Entry entry, C4882e eVar) {
        eVar.mo14857f(f20549b, entry.getKey());
        eVar.mo14857f(f20550c, entry.getValue());
    }

    /* renamed from: l */
    private static int m27673l(C4878c cVar) {
        C7613i8 i8Var = (C7613i8) cVar.mo14848c(C7613i8.class);
        if (i8Var != null) {
            return i8Var.zza();
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m27674m(C4881d<T> dVar, T t) {
        OutputStream outputStream;
        C7583f8 f8Var = new C7583f8();
        try {
            outputStream = this.f20552e;
            this.f20552e = f8Var;
            dVar.mo10875a(t, this);
            this.f20552e = outputStream;
            long a = f8Var.mo21084a();
            f8Var.close();
            return a;
        } catch (Throwable th) {
            try {
                f8Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static C7613i8 m27675n(C4878c cVar) {
        C7613i8 i8Var = (C7613i8) cVar.mo14848c(C7613i8.class);
        if (i8Var != null) {
            return i8Var;
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C7633k8 m27676o(C4881d<T> dVar, C4878c cVar, T t, boolean z) {
        long m = m27674m(dVar, t);
        if (z && m == 0) {
            return this;
        }
        m27679r((m27673l(cVar) << 3) | 2);
        m27680s(m);
        dVar.mo10875a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C7633k8 m27677p(C4883f<T> fVar, C4878c cVar, T t, boolean z) {
        this.f20556i.mo21073a(cVar, z);
        fVar.mo14858a(t, this.f20556i);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m27678q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m27679r(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f20552e;
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
    private final void m27680s(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f20552e;
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
        mo21110h(cVar, z ? 1 : 0, true);
        return this;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C4882e mo14855b(C4878c cVar, long j) {
        mo21111i(cVar, j, true);
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4882e mo14856c(C4878c cVar, int i) {
        mo21110h(cVar, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4882e mo21107d(C4878c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m27679r((m27673l(cVar) << 3) | 1);
        this.f20552e.write(m27678q(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4882e mo21108e(C4878c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m27679r((m27673l(cVar) << 3) | 5);
        this.f20552e.write(m27678q(4).putFloat(f).array());
        return this;
    }

    /* renamed from: f */
    public final C4882e mo14857f(C4878c cVar, Object obj) {
        mo21109g(cVar, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4882e mo21109g(C4878c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m27679r((m27673l(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20548a);
            m27679r(bytes.length);
            this.f20552e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo21109g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m27676o(f20551d, cVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo21107d(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo21108e(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo21111i(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo21110h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m27679r((m27673l(cVar) << 3) | 2);
            m27679r(bArr.length);
            this.f20552e.write(bArr);
            return this;
        } else {
            C4881d dVar = this.f20553f.get(obj.getClass());
            if (dVar != null) {
                m27676o(dVar, cVar, obj, z);
                return this;
            }
            C4883f fVar = this.f20554g.get(obj.getClass());
            if (fVar != null) {
                m27677p(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C7593g8) {
                mo21110h(cVar, ((C7593g8) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo21110h(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m27676o(this.f20555h, cVar, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C7633k8 mo21110h(C4878c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C7613i8 n = m27675n(cVar);
        C7603h8 h8Var = C7603h8.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m27679r(n.zza() << 3);
            m27679r(i);
        } else if (ordinal == 1) {
            m27679r(n.zza() << 3);
            m27679r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m27679r((n.zza() << 3) | 5);
            this.f20552e.write(m27678q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C7633k8 mo21111i(C4878c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C7613i8 n = m27675n(cVar);
        C7603h8 h8Var = C7603h8.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m27679r(n.zza() << 3);
            m27680s(j);
        } else if (ordinal == 1) {
            m27679r(n.zza() << 3);
            m27680s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m27679r((n.zza() << 3) | 1);
            this.f20552e.write(m27678q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C7633k8 mo21112j(Object obj) {
        if (obj == null) {
            return this;
        }
        C4881d dVar = this.f20553f.get(obj.getClass());
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
