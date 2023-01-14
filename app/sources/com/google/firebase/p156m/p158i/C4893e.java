package com.google.firebase.p156m.p158i;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.C4884g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: com.google.firebase.m.i.e */
final class C4893e implements C4882e, C4884g {

    /* renamed from: a */
    private C4893e f13725a = null;

    /* renamed from: b */
    private boolean f13726b = true;

    /* renamed from: c */
    private final JsonWriter f13727c;

    /* renamed from: d */
    private final Map<Class<?>, C4881d<?>> f13728d;

    /* renamed from: e */
    private final Map<Class<?>, C4883f<?>> f13729e;

    /* renamed from: f */
    private final C4881d<Object> f13730f;

    /* renamed from: g */
    private final boolean f13731g;

    C4893e(Writer writer, Map<Class<?>, C4881d<?>> map, Map<Class<?>, C4883f<?>> map2, C4881d<Object> dVar, boolean z) {
        this.f13727c = new JsonWriter(writer);
        this.f13728d = map;
        this.f13729e = map2;
        this.f13730f = dVar;
        this.f13731g = z;
    }

    /* renamed from: q */
    private boolean m18690q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private C4893e m18691t(String str, Object obj) {
        m18693v();
        this.f13727c.name(str);
        if (obj != null) {
            return mo14870i(obj, false);
        }
        this.f13727c.nullValue();
        return this;
    }

    /* renamed from: u */
    private C4893e m18692u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m18693v();
        this.f13727c.name(str);
        return mo14870i(obj, false);
    }

    /* renamed from: v */
    private void m18693v() {
        if (this.f13726b) {
            C4893e eVar = this.f13725a;
            if (eVar != null) {
                eVar.m18693v();
                this.f13725a.f13726b = false;
                this.f13725a = null;
                this.f13727c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public C4882e mo14854a(C4878c cVar, boolean z) {
        return mo14875n(cVar.mo14847b(), z);
    }

    /* renamed from: b */
    public C4882e mo14855b(C4878c cVar, long j) {
        return mo14873l(cVar.mo14847b(), j);
    }

    /* renamed from: c */
    public C4882e mo14856c(C4878c cVar, int i) {
        return mo14872k(cVar.mo14847b(), i);
    }

    /* renamed from: f */
    public C4882e mo14857f(C4878c cVar, Object obj) {
        return mo14874m(cVar.mo14847b(), obj);
    }

    /* renamed from: g */
    public C4893e mo14868g(int i) {
        m18693v();
        this.f13727c.value((long) i);
        return this;
    }

    /* renamed from: h */
    public C4893e mo14869h(long j) {
        m18693v();
        this.f13727c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C4893e mo14870i(Object obj, boolean z) {
        int i = 0;
        if (z && m18690q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C4877b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f13727c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f13727c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo14877p((byte[]) obj);
            }
            this.f13727c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f13727c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo14869h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f13727c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f13727c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo14870i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo14870i(i3, false);
                }
            }
            this.f13727c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f13727c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo14870i(i4, false);
            }
            this.f13727c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f13727c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo14874m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C4877b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f13727c.endObject();
            return this;
        } else {
            C4881d dVar = this.f13728d.get(obj.getClass());
            if (dVar != null) {
                return mo14879s(dVar, obj, z);
            }
            C4883f fVar = this.f13729e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo14858a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo14879s(this.f13730f, obj, z);
            } else {
                mo14859d(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: j */
    public C4893e mo14859d(String str) {
        m18693v();
        this.f13727c.value(str);
        return this;
    }

    /* renamed from: k */
    public C4893e mo14872k(String str, int i) {
        m18693v();
        this.f13727c.name(str);
        return mo14868g(i);
    }

    /* renamed from: l */
    public C4893e mo14873l(String str, long j) {
        m18693v();
        this.f13727c.name(str);
        return mo14869h(j);
    }

    /* renamed from: m */
    public C4893e mo14874m(String str, Object obj) {
        return this.f13731g ? m18692u(str, obj) : m18691t(str, obj);
    }

    /* renamed from: n */
    public C4893e mo14875n(String str, boolean z) {
        m18693v();
        this.f13727c.name(str);
        return mo14860e(z);
    }

    /* renamed from: o */
    public C4893e mo14860e(boolean z) {
        m18693v();
        this.f13727c.value(z);
        return this;
    }

    /* renamed from: p */
    public C4893e mo14877p(byte[] bArr) {
        m18693v();
        if (bArr == null) {
            this.f13727c.nullValue();
        } else {
            this.f13727c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo14878r() {
        m18693v();
        this.f13727c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C4893e mo14879s(C4881d<Object> dVar, Object obj, boolean z) {
        if (!z) {
            this.f13727c.beginObject();
        }
        dVar.mo10875a(obj, this);
        if (!z) {
            this.f13727c.endObject();
        }
        return this;
    }
}
