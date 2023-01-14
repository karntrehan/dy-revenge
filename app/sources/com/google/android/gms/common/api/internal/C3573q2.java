package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.internal.C3705r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.q2 */
public final class C3573q2 extends C3594v2 {

    /* renamed from: s */
    private final SparseArray<C3569p2> f10062s = new SparseArray<>();

    private C3573q2(C3531h hVar) {
        super(hVar, C3629e.m14086q());
        this.f9888f.mo11348a("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static C3573q2 m13893t(C3526g gVar) {
        C3531h d = LifecycleCallback.m13594d(gVar);
        C3573q2 q2Var = (C3573q2) d.mo11349c("AutoManageHelper", C3573q2.class);
        return q2Var != null ? q2Var : new C3573q2(d);
    }

    /* renamed from: w */
    private final C3569p2 m13894w(int i) {
        if (this.f10062s.size() <= i) {
            return null;
        }
        SparseArray<C3569p2> sparseArray = this.f10062s;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo11248a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f10062s.size(); i++) {
            C3569p2 w = m13894w(i);
            if (w != null) {
                printWriter.append(str).append("GoogleApiClient #").print(w.f10057a);
                printWriter.println(":");
                w.f10058b.mo11218f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo11255j() {
        super.mo11255j();
        boolean z = this.f10139o;
        String valueOf = String.valueOf(this.f10062s);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f10140p.get() == null) {
            for (int i = 0; i < this.f10062s.size(); i++) {
                C3569p2 w = m13894w(i);
                if (w != null) {
                    w.f10058b.mo11216d();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo11256k() {
        super.mo11256k();
        for (int i = 0; i < this.f10062s.size(); i++) {
            C3569p2 w = m13894w(i);
            if (w != null) {
                w.f10058b.mo11217e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11400m(C3623b bVar, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C3569p2 p2Var = this.f10062s.get(i);
        if (p2Var != null) {
            mo11403v(i);
            C3486f.C3489c cVar = p2Var.f10059c;
            if (cVar != null) {
                cVar.mo11295k(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11401n() {
        for (int i = 0; i < this.f10062s.size(); i++) {
            C3569p2 w = m13894w(i);
            if (w != null) {
                w.f10058b.mo11216d();
            }
        }
    }

    /* renamed from: u */
    public final void mo11402u(int i, C3486f fVar, C3486f.C3489c cVar) {
        C3705r.m14347l(fVar, "GoogleApiClient instance cannot be null");
        boolean z = this.f10062s.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C3705r.m14350o(z, sb.toString());
        C3582s2 s2Var = this.f10140p.get();
        boolean z2 = this.f10139o;
        String valueOf = String.valueOf(s2Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        C3569p2 p2Var = new C3569p2(this, i, fVar, cVar);
        fVar.mo11225n(p2Var);
        this.f10062s.put(i, p2Var);
        if (this.f10139o && s2Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(fVar.toString()));
            fVar.mo11216d();
        }
    }

    /* renamed from: v */
    public final void mo11403v(int i) {
        C3569p2 p2Var = this.f10062s.get(i);
        this.f10062s.remove(i);
        if (p2Var != null) {
            p2Var.f10058b.mo11226o(p2Var);
            p2Var.f10058b.mo11217e();
        }
    }
}
