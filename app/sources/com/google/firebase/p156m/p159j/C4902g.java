package com.google.firebase.p156m.p159j;

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

/* renamed from: com.google.firebase.m.j.g */
final class C4902g implements C4882e {

    /* renamed from: a */
    private static final Charset f13743a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C4878c f13744b = C4878c.m18654a("key").mo14853b(C4896c.m18714b().mo14881c(1).mo14880a()).mo14852a();

    /* renamed from: c */
    private static final C4878c f13745c = C4878c.m18654a("value").mo14853b(C4896c.m18714b().mo14881c(2).mo14880a()).mo14852a();

    /* renamed from: d */
    private static final C4881d<Map.Entry<Object, Object>> f13746d = C4894a.f13732a;

    /* renamed from: e */
    private OutputStream f13747e;

    /* renamed from: f */
    private final Map<Class<?>, C4881d<?>> f13748f;

    /* renamed from: g */
    private final Map<Class<?>, C4883f<?>> f13749g;

    /* renamed from: h */
    private final C4881d<Object> f13750h;

    /* renamed from: i */
    private final C4906i f13751i = new C4906i(this);

    /* renamed from: com.google.firebase.m.j.g$a */
    static /* synthetic */ class C4903a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13752a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.m.j.f$a[] r0 = com.google.firebase.p156m.p159j.C4900f.C4901a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13752a = r0
                com.google.firebase.m.j.f$a r1 = com.google.firebase.p156m.p159j.C4900f.C4901a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13752a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.m.j.f$a r1 = com.google.firebase.p156m.p159j.C4900f.C4901a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13752a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.m.j.f$a r1 = com.google.firebase.p156m.p159j.C4900f.C4901a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p156m.p159j.C4902g.C4903a.<clinit>():void");
        }
    }

    C4902g(OutputStream outputStream, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar) {
        this.f13747e = outputStream;
        this.f13748f = map;
        this.f13749g = map2;
        this.f13750h = dVar;
    }

    /* renamed from: n */
    private static ByteBuffer m18719n(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: o */
    private <T> long m18720o(C4881d<T> dVar, T t) {
        OutputStream outputStream;
        C4898d dVar2 = new C4898d();
        try {
            outputStream = this.f13747e;
            this.f13747e = dVar2;
            dVar.mo10875a(t, this);
            this.f13747e = outputStream;
            long a = dVar2.mo14888a();
            dVar2.close();
            return a;
        } catch (Throwable th) {
            try {
                dVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: p */
    private <T> C4902g m18721p(C4881d<T> dVar, C4878c cVar, T t, boolean z) {
        long o = m18720o(dVar, t);
        if (z && o == 0) {
            return this;
        }
        m18726v((m18724t(cVar) << 3) | 2);
        m18727w(o);
        dVar.mo10875a(t, this);
        return this;
    }

    /* renamed from: q */
    private <T> C4902g m18722q(C4883f<T> fVar, C4878c cVar, T t, boolean z) {
        this.f13751i.mo14908b(cVar, z);
        fVar.mo14858a(t, this.f13751i);
        return this;
    }

    /* renamed from: s */
    private static C4900f m18723s(C4878c cVar) {
        C4900f fVar = (C4900f) cVar.mo14848c(C4900f.class);
        if (fVar != null) {
            return fVar;
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: t */
    private static int m18724t(C4878c cVar) {
        C4900f fVar = (C4900f) cVar.mo14848c(C4900f.class);
        if (fVar != null) {
            return fVar.tag();
        }
        throw new C4877b("Field has no @Protobuf config");
    }

    /* renamed from: u */
    static /* synthetic */ void m18725u(Map.Entry entry, C4882e eVar) {
        eVar.mo14857f(f13744b, entry.getKey());
        eVar.mo14857f(f13745c, entry.getValue());
    }

    /* renamed from: v */
    private void m18726v(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f13747e;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    /* renamed from: w */
    private void m18727w(long j) {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f13747e;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4882e mo14893d(C4878c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m18726v((m18724t(cVar) << 3) | 1);
        this.f13747e.write(m18719n(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C4882e mo14894e(C4878c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m18726v((m18724t(cVar) << 3) | 5);
        this.f13747e.write(m18719n(4).putFloat(f).array());
        return this;
    }

    /* renamed from: f */
    public C4882e mo14857f(C4878c cVar, Object obj) {
        return mo14895g(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4882e mo14895g(C4878c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m18726v((m18724t(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f13743a);
            m18726v(bytes.length);
            this.f13747e.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo14895g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry p : ((Map) obj).entrySet()) {
                m18721p(f13746d, cVar, p, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo14893d(cVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo14894e(cVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo14899k(cVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo14901m(cVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m18726v((m18724t(cVar) << 3) | 2);
                m18726v(bArr.length);
                this.f13747e.write(bArr);
                return this;
            }
            C4881d dVar = this.f13748f.get(obj.getClass());
            if (dVar != null) {
                return m18721p(dVar, cVar, obj, z);
            }
            C4883f fVar = this.f13749g.get(obj.getClass());
            return fVar != null ? m18722q(fVar, cVar, obj, z) : obj instanceof C4899e ? mo14856c(cVar, ((C4899e) obj).mo14892d()) : obj instanceof Enum ? mo14856c(cVar, ((Enum) obj).ordinal()) : m18721p(this.f13750h, cVar, obj, z);
        }
    }

    /* renamed from: h */
    public C4902g mo14856c(C4878c cVar, int i) {
        return mo14897i(cVar, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C4902g mo14897i(C4878c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C4900f s = m18723s(cVar);
        int i2 = C4903a.f13752a[s.intEncoding().ordinal()];
        if (i2 == 1) {
            m18726v(s.tag() << 3);
            m18726v(i);
        } else if (i2 == 2) {
            m18726v(s.tag() << 3);
            m18726v((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m18726v((s.tag() << 3) | 5);
            this.f13747e.write(m18719n(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: j */
    public C4902g mo14855b(C4878c cVar, long j) {
        return mo14899k(cVar, j, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C4902g mo14899k(C4878c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C4900f s = m18723s(cVar);
        int i = C4903a.f13752a[s.intEncoding().ordinal()];
        if (i == 1) {
            m18726v(s.tag() << 3);
            m18727w(j);
        } else if (i == 2) {
            m18726v(s.tag() << 3);
            m18727w((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m18726v((s.tag() << 3) | 1);
            this.f13747e.write(m18719n(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: l */
    public C4902g mo14854a(C4878c cVar, boolean z) {
        return mo14901m(cVar, z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C4902g mo14901m(C4878c cVar, boolean z, boolean z2) {
        return mo14897i(cVar, z ? 1 : 0, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C4902g mo14902r(Object obj) {
        if (obj == null) {
            return this;
        }
        C4881d dVar = this.f13748f.get(obj.getClass());
        if (dVar != null) {
            dVar.mo10875a(obj, this);
            return this;
        }
        throw new C4877b("No encoder for " + obj.getClass());
    }
}
