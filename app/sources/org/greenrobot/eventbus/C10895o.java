package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* renamed from: org.greenrobot.eventbus.o */
public class C10895o {

    /* renamed from: a */
    final Method f28499a;

    /* renamed from: b */
    final ThreadMode f28500b;

    /* renamed from: c */
    final Class<?> f28501c;

    /* renamed from: d */
    final int f28502d;

    /* renamed from: e */
    final boolean f28503e;

    /* renamed from: f */
    String f28504f;

    public C10895o(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f28499a = method;
        this.f28500b = threadMode;
        this.f28501c = cls;
        this.f28502d = i;
        this.f28503e = z;
    }

    /* renamed from: a */
    private synchronized void m37037a() {
        if (this.f28504f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f28499a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f28499a.getName());
            sb.append('(');
            sb.append(this.f28501c.getName());
            this.f28504f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10895o)) {
            return false;
        }
        m37037a();
        C10895o oVar = (C10895o) obj;
        oVar.m37037a();
        return this.f28504f.equals(oVar.f28504f);
    }

    public int hashCode() {
        return this.f28499a.hashCode();
    }
}
