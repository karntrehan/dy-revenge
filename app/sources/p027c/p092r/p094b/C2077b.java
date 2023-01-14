package p027c.p092r.p094b;

import android.content.Context;
import androidx.core.util.C1171b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: c.r.b.b */
public class C2077b<D> {

    /* renamed from: a */
    int f6051a;

    /* renamed from: b */
    C2079b<D> f6052b;

    /* renamed from: c */
    C2078a<D> f6053c;

    /* renamed from: d */
    Context f6054d;

    /* renamed from: e */
    boolean f6055e = false;

    /* renamed from: f */
    boolean f6056f = false;

    /* renamed from: g */
    boolean f6057g = true;

    /* renamed from: h */
    boolean f6058h = false;

    /* renamed from: i */
    boolean f6059i = false;

    /* renamed from: c.r.b.b$a */
    public interface C2078a<D> {
        /* renamed from: a */
        void mo7008a(C2077b<D> bVar);
    }

    /* renamed from: c.r.b.b$b */
    public interface C2079b<D> {
        /* renamed from: a */
        void mo6955a(C2077b<D> bVar, D d);
    }

    public C2077b(Context context) {
        this.f6054d = context.getApplicationContext();
    }

    /* renamed from: b */
    public void mo6988b() {
        this.f6056f = true;
        mo6996k();
    }

    /* renamed from: c */
    public boolean mo6989c() {
        return mo6978l();
    }

    /* renamed from: d */
    public void mo6990d() {
        this.f6059i = false;
    }

    /* renamed from: e */
    public String mo6991e(D d) {
        StringBuilder sb = new StringBuilder(64);
        C1171b.m4570a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: f */
    public void mo6992f() {
        C2078a<D> aVar = this.f6053c;
        if (aVar != null) {
            aVar.mo7008a(this);
        }
    }

    /* renamed from: g */
    public void mo6993g(D d) {
        C2079b<D> bVar = this.f6052b;
        if (bVar != null) {
            bVar.mo6955a(this, d);
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo6977h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f6051a);
        printWriter.print(" mListener=");
        printWriter.println(this.f6052b);
        if (this.f6055e || this.f6058h || this.f6059i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f6055e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f6058h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f6059i);
        }
        if (this.f6056f || this.f6057g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f6056f);
            printWriter.print(" mReset=");
            printWriter.println(this.f6057g);
        }
    }

    /* renamed from: i */
    public void mo6994i() {
        mo6979n();
    }

    /* renamed from: j */
    public boolean mo6995j() {
        return this.f6056f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6996k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo6978l() {
        throw null;
    }

    /* renamed from: m */
    public void mo6997m() {
        if (this.f6055e) {
            mo6994i();
        } else {
            this.f6058h = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo6979n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo6998o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo6999p() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo7000q() {
    }

    /* renamed from: r */
    public void mo7001r(int i, C2079b<D> bVar) {
        if (this.f6052b == null) {
            this.f6052b = bVar;
            this.f6051a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: s */
    public void mo7002s() {
        mo6998o();
        this.f6057g = true;
        this.f6055e = false;
        this.f6056f = false;
        this.f6058h = false;
        this.f6059i = false;
    }

    /* renamed from: t */
    public void mo7003t() {
        if (this.f6059i) {
            mo6997m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C1171b.m4570a(this, sb);
        sb.append(" id=");
        sb.append(this.f6051a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo7005u() {
        this.f6055e = true;
        this.f6057g = false;
        this.f6056f = false;
        mo6999p();
    }

    /* renamed from: v */
    public void mo7006v() {
        this.f6055e = false;
        mo7000q();
    }

    /* renamed from: w */
    public void mo7007w(C2079b<D> bVar) {
        C2079b<D> bVar2 = this.f6052b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f6052b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
