package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import okhttp3.HttpUrl;
import p497j.p498a.p499a.p500a.p501a.C10675a;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
public final class C4122z3 extends C3878f6 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f11448c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f11449d = -1;

    /* renamed from: e */
    private String f11450e;

    /* renamed from: f */
    private final C4098x3 f11451f = new C4098x3(this, 6, false, false);

    /* renamed from: g */
    private final C4098x3 f11452g = new C4098x3(this, 6, true, false);

    /* renamed from: h */
    private final C4098x3 f11453h = new C4098x3(this, 6, false, true);

    /* renamed from: i */
    private final C4098x3 f11454i = new C4098x3(this, 5, false, false);

    /* renamed from: j */
    private final C4098x3 f11455j = new C4098x3(this, 5, true, false);

    /* renamed from: k */
    private final C4098x3 f11456k = new C4098x3(this, 5, false, true);

    /* renamed from: l */
    private final C4098x3 f11457l = new C4098x3(this, 4, false, false);

    /* renamed from: m */
    private final C4098x3 f11458m = new C4098x3(this, 3, false, false);

    /* renamed from: n */
    private final C4098x3 f11459n = new C4098x3(this, 2, false, false);

    C4122z3(C3955l5 l5Var) {
        super(l5Var);
    }

    /* renamed from: A */
    static String m15462A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = str2;
        }
        String B = m15463B(z, obj);
        String B2 = m15463B(z, obj2);
        String B3 = m15463B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    static String m15463B(boolean z, Object obj) {
        String className;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C4110y3 ? ((C4110y3) obj).f11420a : z ? "-" : obj.toString();
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String G = m15466G(C3955l5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m15466G(className).equals(G)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
    }

    /* renamed from: G */
    private static String m15466G(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    protected static Object m15469z(String str) {
        if (str == null) {
            return null;
        }
        return new C4110y3(str);
    }

    /* access modifiers changed from: protected */
    @C10675a
    /* renamed from: C */
    public final String mo12541C() {
        String str;
        synchronized (this) {
            if (this.f11450e == null) {
                this.f11450e = this.f10651a.mo12164Q() != null ? this.f10651a.mo12164Q() : this.f10651a.mo12181z().mo12029w();
            }
            C3705r.m14346k(this.f11450e);
            str = this.f11450e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo12542F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo12541C(), i)) {
            Log.println(i, mo12541C(), m15462A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C3705r.m14346k(str);
            C3916i5 G = this.f10651a.mo12155G();
            if (G == null) {
                Log.println(6, mo12541C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo11962n()) {
                Log.println(6, mo12541C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.mo12110z(new C4086w3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11958j() {
        return false;
    }

    /* renamed from: q */
    public final C4098x3 mo12543q() {
        return this.f11458m;
    }

    /* renamed from: r */
    public final C4098x3 mo12544r() {
        return this.f11451f;
    }

    /* renamed from: s */
    public final C4098x3 mo12545s() {
        return this.f11453h;
    }

    /* renamed from: t */
    public final C4098x3 mo12546t() {
        return this.f11452g;
    }

    /* renamed from: u */
    public final C4098x3 mo12547u() {
        return this.f11457l;
    }

    /* renamed from: v */
    public final C4098x3 mo12548v() {
        return this.f11459n;
    }

    /* renamed from: w */
    public final C4098x3 mo12549w() {
        return this.f11454i;
    }

    /* renamed from: x */
    public final C4098x3 mo12550x() {
        return this.f11456k;
    }

    /* renamed from: y */
    public final C4098x3 mo12551y() {
        return this.f11455j;
    }
}
