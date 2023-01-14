package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
public final class C4062u3 {

    /* renamed from: a */
    protected static final AtomicReference f11313a = new AtomicReference();

    /* renamed from: b */
    protected static final AtomicReference f11314b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f11315c = new AtomicReference();

    /* renamed from: d */
    private final C4050t3 f11316d;

    public C4062u3(C4050t3 t3Var) {
        this.f11316d = t3Var;
    }

    /* renamed from: g */
    private static final String m15348g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C3705r.m14346k(strArr);
        C3705r.m14346k(strArr2);
        C3705r.m14346k(atomicReference);
        C3705r.m14336a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo12435a(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String b = bundle instanceof Bundle ? mo12436b(bundle) : String.valueOf(bundle);
            if (b != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo12436b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f11316d.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo12439e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? mo12435a(new Object[]{obj}) : obj instanceof Object[] ? mo12435a((Object[]) obj) : obj instanceof ArrayList ? mo12435a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo12437c(C4094x xVar) {
        if (!this.f11316d.zza()) {
            return xVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(xVar.f11383p);
        sb.append(",name=");
        sb.append(mo12438d(xVar.f11381f));
        sb.append(",params=");
        C4070v vVar = xVar.f11382o;
        sb.append(vVar == null ? null : !this.f11316d.zza() ? vVar.toString() : mo12436b(vVar.mo12453r()));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo12438d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11316d.zza() ? str : m15348g(str, C3930j6.f10825c, C3930j6.f10823a, f11313a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo12439e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f11316d.zza() ? str : m15348g(str, C3943k6.f10856b, C3943k6.f10855a, f11314b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo12440f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f11316d.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m15348g(str, C3956l6.f10929b, C3956l6.f10928a, f11315c);
        }
        return "experiment_id(" + str + ")";
    }
}
