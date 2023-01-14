package p174e.p319f.p320a.p335c.p345f.p358m;

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

/* renamed from: e.f.a.c.f.m.u1 */
final class C8848u1 implements C4882e {

    /* renamed from: a */
    private static final Charset f24122a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C4878c f24123b;

    /* renamed from: c */
    private static final C4878c f24124c;

    /* renamed from: d */
    private static final C4881d<Map.Entry<Object, Object>> f24125d = C8835t1.f24102a;

    /* renamed from: e */
    private OutputStream f24126e;

    /* renamed from: f */
    private final Map<Class<?>, C4881d<?>> f24127f;

    /* renamed from: g */
    private final Map<Class<?>, C4883f<?>> f24128g;

    /* renamed from: h */
    private final C4881d<Object> f24129h;

    /* renamed from: i */
    private final C8898y1 f24130i = new C8898y1(this);

    static {
        C4878c.C4880b a = C4878c.m18654a("key");
        C8770o1 o1Var = new C8770o1();
        o1Var.mo22585a(1);
        f24123b = a.mo14853b(o1Var.mo22586b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("value");
        C8770o1 o1Var2 = new C8770o1();
        o1Var2.mo22585a(2);
        f24124c = a2.mo14853b(o1Var2.mo22586b()).mo14852a();
    }

    C8848u1(OutputStream outputStream, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f24126e = outputStream;
        this.f24127f = map;
        this.f24128g = map2;
        this.f24129h = dVar;
    }

    /* renamed from: k */
    static /* synthetic */ void m29705k(Map.Entry entry, C4882e eVar) {
        eVar.mo14857f(f24123b, entry.getKey());
        eVar.mo14857f(f24124c, entry.getValue());
    }

    /* renamed from: l */
    private static int m29706l(C4878c cVar) {
        C8822s1 s1Var = (C8822s1) cVar.mo14848c(C8822s1.class);
        if (s1Var != null) {
            return s1Var.zza();
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m29707m(C4881d<T> dVar, T t) {
        OutputStream outputStream;
        C8783p1 p1Var = new C8783p1();
        try {
            outputStream = this.f24126e;
            this.f24126e = p1Var;
            dVar.mo10875a(t, this);
            this.f24126e = outputStream;
            long a = p1Var.mo22595a();
            p1Var.close();
            return a;
        } catch (Throwable th) {
            try {
                p1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static C8822s1 m29708n(C4878c cVar) {
        C8822s1 s1Var = (C8822s1) cVar.mo14848c(C8822s1.class);
        if (s1Var != null) {
            return s1Var;
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C8848u1 m29709o(C4881d<T> dVar, C4878c cVar, T t, boolean z) {
        long m = m29707m(dVar, t);
        if (z && m == 0) {
            return this;
        }
        m29712r((m29706l(cVar) << 3) | 2);
        m29713s(m);
        dVar.mo10875a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C8848u1 m29710p(C4883f<T> fVar, C4878c cVar, T t, boolean z) {
        this.f24130i.mo22714a(cVar, z);
        fVar.mo14858a(t, this.f24130i);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m29711q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m29712r(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f24126e;
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
    private final void m29713s(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f24126e;
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
        mo22667h(cVar, z ? 1 : 0, true);
        return this;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C4882e mo14855b(C4878c cVar, long j) {
        mo22668i(cVar, j, true);
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4882e mo14856c(C4878c cVar, int i) {
        mo22667h(cVar, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4882e mo22664d(C4878c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m29712r((m29706l(cVar) << 3) | 1);
        this.f24126e.write(m29711q(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4882e mo22665e(C4878c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m29712r((m29706l(cVar) << 3) | 5);
        this.f24126e.write(m29711q(4).putFloat(f).array());
        return this;
    }

    /* renamed from: f */
    public final C4882e mo14857f(C4878c cVar, Object obj) {
        mo22666g(cVar, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4882e mo22666g(C4878c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m29712r((m29706l(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f24122a);
            m29712r(bytes.length);
            this.f24126e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo22666g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m29709o(f24125d, cVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo22664d(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo22665e(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo22668i(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo22667h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m29712r((m29706l(cVar) << 3) | 2);
            m29712r(bArr.length);
            this.f24126e.write(bArr);
            return this;
        } else {
            C4881d dVar = this.f24127f.get(obj.getClass());
            if (dVar != null) {
                m29709o(dVar, cVar, obj, z);
                return this;
            }
            C4883f fVar = this.f24128g.get(obj.getClass());
            if (fVar != null) {
                m29710p(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C8796q1) {
                mo22667h(cVar, ((C8796q1) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo22667h(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m29709o(this.f24129h, cVar, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C8848u1 mo22667h(C4878c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C8822s1 n = m29708n(cVar);
        C8809r1 r1Var = C8809r1.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m29712r(n.zza() << 3);
            m29712r(i);
        } else if (ordinal == 1) {
            m29712r(n.zza() << 3);
            m29712r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m29712r((n.zza() << 3) | 5);
            this.f24126e.write(m29711q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C8848u1 mo22668i(C4878c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C8822s1 n = m29708n(cVar);
        C8809r1 r1Var = C8809r1.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m29712r(n.zza() << 3);
            m29713s(j);
        } else if (ordinal == 1) {
            m29712r(n.zza() << 3);
            m29713s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m29712r((n.zza() << 3) | 1);
            this.f24126e.write(m29711q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C8848u1 mo22669j(Object obj) {
        if (obj == null) {
            return this;
        }
        C4881d dVar = this.f24127f.get(obj.getClass());
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
