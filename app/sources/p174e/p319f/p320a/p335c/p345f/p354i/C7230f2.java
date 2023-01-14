package p174e.p319f.p320a.p335c.p345f.p354i;

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

/* renamed from: e.f.a.c.f.i.f2 */
final class C7230f2 implements C4882e {

    /* renamed from: a */
    private static final Charset f19272a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C4878c f19273b;

    /* renamed from: c */
    private static final C4878c f19274c;

    /* renamed from: d */
    private static final C4881d<Map.Entry<Object, Object>> f19275d = C7215e2.f19255a;

    /* renamed from: e */
    private OutputStream f19276e;

    /* renamed from: f */
    private final Map<Class<?>, C4881d<?>> f19277f;

    /* renamed from: g */
    private final Map<Class<?>, C4883f<?>> f19278g;

    /* renamed from: h */
    private final C4881d<Object> f19279h;

    /* renamed from: i */
    private final C7289j2 f19280i = new C7289j2(this);

    static {
        C4878c.C4880b a = C4878c.m18654a("key");
        C7498y1 y1Var = new C7498y1();
        y1Var.mo21005a(1);
        f19273b = a.mo14853b(y1Var.mo21006b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("value");
        C7498y1 y1Var2 = new C7498y1();
        y1Var2.mo21005a(2);
        f19274c = a2.mo14853b(y1Var2.mo21006b()).mo14852a();
    }

    C7230f2(OutputStream outputStream, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f19276e = outputStream;
        this.f19277f = map;
        this.f19278g = map2;
        this.f19279h = dVar;
    }

    /* renamed from: k */
    static /* synthetic */ void m27229k(Map.Entry entry, C4882e eVar) {
        eVar.mo14857f(f19273b, entry.getKey());
        eVar.mo14857f(f19274c, entry.getValue());
    }

    /* renamed from: l */
    private static int m27230l(C4878c cVar) {
        C7200d2 d2Var = (C7200d2) cVar.mo14848c(C7200d2.class);
        if (d2Var != null) {
            return d2Var.zza();
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m27231m(C4881d<T> dVar, T t) {
        OutputStream outputStream;
        C7512z1 z1Var = new C7512z1();
        try {
            outputStream = this.f19276e;
            this.f19276e = z1Var;
            dVar.mo10875a(t, this);
            this.f19276e = outputStream;
            long a = z1Var.mo21017a();
            z1Var.close();
            return a;
        } catch (Throwable th) {
            try {
                z1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static C7200d2 m27232n(C4878c cVar) {
        C7200d2 d2Var = (C7200d2) cVar.mo14848c(C7200d2.class);
        if (d2Var != null) {
            return d2Var;
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C7230f2 m27233o(C4881d<T> dVar, C4878c cVar, T t, boolean z) {
        long m = m27231m(dVar, t);
        if (z && m == 0) {
            return this;
        }
        m27236r((m27230l(cVar) << 3) | 2);
        m27237s(m);
        dVar.mo10875a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C7230f2 m27234p(C4883f<T> fVar, C4878c cVar, T t, boolean z) {
        this.f19280i.mo20778a(cVar, z);
        fVar.mo14858a(t, this.f19280i);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m27235q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m27236r(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f19276e;
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
    private final void m27237s(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f19276e;
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
        mo20696h(cVar, z ? 1 : 0, true);
        return this;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C4882e mo14855b(C4878c cVar, long j) {
        mo20697i(cVar, j, true);
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4882e mo14856c(C4878c cVar, int i) {
        mo20696h(cVar, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4882e mo20693d(C4878c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m27236r((m27230l(cVar) << 3) | 1);
        this.f19276e.write(m27235q(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4882e mo20694e(C4878c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m27236r((m27230l(cVar) << 3) | 5);
        this.f19276e.write(m27235q(4).putFloat(f).array());
        return this;
    }

    /* renamed from: f */
    public final C4882e mo14857f(C4878c cVar, Object obj) {
        mo20695g(cVar, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4882e mo20695g(C4878c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m27236r((m27230l(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f19272a);
            m27236r(bytes.length);
            this.f19276e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo20695g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m27233o(f19275d, cVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo20693d(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo20694e(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo20697i(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo20696h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m27236r((m27230l(cVar) << 3) | 2);
            m27236r(bArr.length);
            this.f19276e.write(bArr);
            return this;
        } else {
            C4881d dVar = this.f19277f.get(obj.getClass());
            if (dVar != null) {
                m27233o(dVar, cVar, obj, z);
                return this;
            }
            C4883f fVar = this.f19278g.get(obj.getClass());
            if (fVar != null) {
                m27234p(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C7155a2) {
                mo20696h(cVar, ((C7155a2) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo20696h(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m27233o(this.f19279h, cVar, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C7230f2 mo20696h(C4878c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C7200d2 n = m27232n(cVar);
        C7170b2 b2Var = C7170b2.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m27236r(n.zza() << 3);
            m27236r(i);
        } else if (ordinal == 1) {
            m27236r(n.zza() << 3);
            m27236r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m27236r((n.zza() << 3) | 5);
            this.f19276e.write(m27235q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C7230f2 mo20697i(C4878c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C7200d2 n = m27232n(cVar);
        C7170b2 b2Var = C7170b2.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m27236r(n.zza() << 3);
            m27237s(j);
        } else if (ordinal == 1) {
            m27236r(n.zza() << 3);
            m27237s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m27236r((n.zza() << 3) | 1);
            this.f19276e.write(m27235q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C7230f2 mo20698j(Object obj) {
        if (obj == null) {
            return this;
        }
        C4881d dVar = this.f19277f.get(obj.getClass());
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
