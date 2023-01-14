package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.p */
public final class C3697p {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static final class C3698a {

        /* renamed from: a */
        private final List<String> f10356a = new ArrayList();

        /* renamed from: b */
        private final Object f10357b;

        /* synthetic */ C3698a(Object obj, C3665e1 e1Var) {
            C3705r.m14346k(obj);
            this.f10357b = obj;
        }

        /* renamed from: a */
        public C3698a mo11646a(String str, Object obj) {
            List<String> list = this.f10356a;
            C3705r.m14346k(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f10357b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f10356a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f10356a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m14322a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m14323b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m14323b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static int m14324c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static C3698a m14325d(Object obj) {
        return new C3698a(obj, (C3665e1) null);
    }
}
