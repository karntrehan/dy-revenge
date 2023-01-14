package p174e.p319f.p320a.p335c.p345f.p357l;

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

/* renamed from: e.f.a.c.f.l.b2 */
final class C8129b2 implements C4882e {

    /* renamed from: a */
    private static final Charset f22084a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C4878c f22085b;

    /* renamed from: c */
    private static final C4878c f22086c;

    /* renamed from: d */
    private static final C4881d<Map.Entry<Object, Object>> f22087d = C8110a2.f22033a;

    /* renamed from: e */
    private OutputStream f22088e;

    /* renamed from: f */
    private final Map<Class<?>, C4881d<?>> f22089f;

    /* renamed from: g */
    private final Map<Class<?>, C4883f<?>> f22090g;

    /* renamed from: h */
    private final C4881d<Object> f22091h;

    /* renamed from: i */
    private final C8224g2 f22092i = new C8224g2(this);

    static {
        C4878c.C4880b a = C4878c.m18654a("key");
        C8498v1 v1Var = new C8498v1();
        v1Var.mo22177a(1);
        f22085b = a.mo14853b(v1Var.mo22178b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("value");
        C8498v1 v1Var2 = new C8498v1();
        v1Var2.mo22177a(2);
        f22086c = a2.mo14853b(v1Var2.mo22178b()).mo14852a();
    }

    C8129b2(OutputStream outputStream, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f22088e = outputStream;
        this.f22089f = map;
        this.f22090g = map2;
        this.f22091h = dVar;
    }

    /* renamed from: k */
    static /* synthetic */ void m28332k(Map.Entry entry, C4882e eVar) {
        eVar.mo14857f(f22085b, entry.getKey());
        eVar.mo14857f(f22086c, entry.getValue());
    }

    /* renamed from: l */
    private static int m28333l(C4878c cVar) {
        C8570z1 z1Var = (C8570z1) cVar.mo14848c(C8570z1.class);
        if (z1Var != null) {
            return z1Var.zza();
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m28334m(C4881d<T> dVar, T t) {
        OutputStream outputStream;
        C8516w1 w1Var = new C8516w1();
        try {
            outputStream = this.f22088e;
            this.f22088e = w1Var;
            dVar.mo10875a(t, this);
            this.f22088e = outputStream;
            long a = w1Var.mo22220a();
            w1Var.close();
            return a;
        } catch (Throwable th) {
            try {
                w1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static C8570z1 m28335n(C4878c cVar) {
        C8570z1 z1Var = (C8570z1) cVar.mo14848c(C8570z1.class);
        if (z1Var != null) {
            return z1Var;
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C8129b2 m28336o(C4881d<T> dVar, C4878c cVar, T t, boolean z) {
        long m = m28334m(dVar, t);
        if (z && m == 0) {
            return this;
        }
        m28339r((m28333l(cVar) << 3) | 2);
        m28340s(m);
        dVar.mo10875a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C8129b2 m28337p(C4883f<T> fVar, C4878c cVar, T t, boolean z) {
        this.f22092i.mo21824a(cVar, z);
        fVar.mo14858a(t, this.f22092i);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m28338q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m28339r(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f22088e;
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
    private final void m28340s(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f22088e;
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
        mo21680h(cVar, z ? 1 : 0, true);
        return this;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C4882e mo14855b(C4878c cVar, long j) {
        mo21681i(cVar, j, true);
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4882e mo14856c(C4878c cVar, int i) {
        mo21680h(cVar, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4882e mo21677d(C4878c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m28339r((m28333l(cVar) << 3) | 1);
        this.f22088e.write(m28338q(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4882e mo21678e(C4878c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m28339r((m28333l(cVar) << 3) | 5);
        this.f22088e.write(m28338q(4).putFloat(f).array());
        return this;
    }

    /* renamed from: f */
    public final C4882e mo14857f(C4878c cVar, Object obj) {
        mo21679g(cVar, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4882e mo21679g(C4878c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m28339r((m28333l(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f22084a);
            m28339r(bytes.length);
            this.f22088e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo21679g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m28336o(f22087d, cVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo21677d(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo21678e(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo21681i(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo21680h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m28339r((m28333l(cVar) << 3) | 2);
            m28339r(bArr.length);
            this.f22088e.write(bArr);
            return this;
        } else {
            C4881d dVar = this.f22089f.get(obj.getClass());
            if (dVar != null) {
                m28336o(dVar, cVar, obj, z);
                return this;
            }
            C4883f fVar = this.f22090g.get(obj.getClass());
            if (fVar != null) {
                m28337p(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C8534x1) {
                mo21680h(cVar, ((C8534x1) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo21680h(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m28336o(this.f22091h, cVar, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C8129b2 mo21680h(C4878c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C8570z1 n = m28335n(cVar);
        C8552y1 y1Var = C8552y1.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m28339r(n.zza() << 3);
            m28339r(i);
        } else if (ordinal == 1) {
            m28339r(n.zza() << 3);
            m28339r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m28339r((n.zza() << 3) | 5);
            this.f22088e.write(m28338q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C8129b2 mo21681i(C4878c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C8570z1 n = m28335n(cVar);
        C8552y1 y1Var = C8552y1.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m28339r(n.zza() << 3);
            m28340s(j);
        } else if (ordinal == 1) {
            m28339r(n.zza() << 3);
            m28340s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m28339r((n.zza() << 3) | 1);
            this.f22088e.write(m28338q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C8129b2 mo21682j(Object obj) {
        if (obj == null) {
            return this;
        }
        C4881d dVar = this.f22089f.get(obj.getClass());
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
