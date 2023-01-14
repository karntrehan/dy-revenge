package com.google.android.gms.measurement.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
final class C4086w3 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ int f11355f;

    /* renamed from: o */
    final /* synthetic */ String f11356o;

    /* renamed from: p */
    final /* synthetic */ Object f11357p;

    /* renamed from: q */
    final /* synthetic */ Object f11358q;

    /* renamed from: r */
    final /* synthetic */ Object f11359r;

    /* renamed from: s */
    final /* synthetic */ C4122z3 f11360s;

    C4086w3(C4122z3 z3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f11360s = z3Var;
        this.f11355f = i;
        this.f11356o = str;
        this.f11357p = obj;
        this.f11358q = obj2;
        this.f11359r = obj3;
    }

    public final void run() {
        char c;
        C4122z3 z3Var;
        C4003p4 F = this.f11360s.f10651a.mo12154F();
        if (F.mo11962n()) {
            C4122z3 z3Var2 = this.f11360s;
            if (z3Var2.f11448c == 0) {
                if (z3Var2.f10651a.mo12181z().mo12016H()) {
                    z3Var = this.f11360s;
                    z3Var.f10651a.mo11937d();
                    c = 'C';
                } else {
                    z3Var = this.f11360s;
                    z3Var.f10651a.mo11937d();
                    c = 'c';
                }
                z3Var.f11448c = c;
            }
            C4122z3 z3Var3 = this.f11360s;
            if (z3Var3.f11449d < 0) {
                z3Var3.f10651a.mo12181z().mo12023q();
                z3Var3.f11449d = 68000;
            }
            char charAt = "01VDIWEA?".charAt(this.f11355f);
            C4122z3 z3Var4 = this.f11360s;
            String str = "2" + charAt + z3Var4.f11448c + z3Var4.f11449d + ":" + C4122z3.m15462A(true, this.f11356o, this.f11357p, this.f11358q, this.f11359r);
            if (str.length() > 1024) {
                str = this.f11356o.substring(0, 1024);
            }
            C3979n4 n4Var = F.f11109e;
            if (n4Var != null) {
                n4Var.mo12233b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f11360s.mo12541C(), "Persisted config not initialized. Not logging error/warn");
    }
}
