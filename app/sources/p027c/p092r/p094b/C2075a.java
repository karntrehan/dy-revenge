package p027c.p092r.p094b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.C1179j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p027c.p064i.p069g.C1860j;

/* renamed from: c.r.b.a */
public abstract class C2075a<D> extends C2077b<D> {

    /* renamed from: j */
    private final Executor f6042j;

    /* renamed from: k */
    volatile C2075a<D>.C0000a f6043k;

    /* renamed from: l */
    volatile C2075a<D>.C0000a f6044l;

    /* renamed from: m */
    long f6045m;

    /* renamed from: n */
    long f6046n;

    /* renamed from: o */
    Handler f6047o;

    /* renamed from: c.r.b.a$a */
    final class C2076a extends C2080c<Void, Void, D> implements Runnable {

        /* renamed from: x */
        private final CountDownLatch f6048x = new CountDownLatch(1);

        /* renamed from: y */
        boolean f6049y;

        C2076a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo6984h(D d) {
            try {
                C2075a.this.mo6981y(this, d);
            } finally {
                this.f6048x.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo6985i(D d) {
            try {
                C2075a.this.mo6982z(this, d);
            } finally {
                this.f6048x.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public D mo6983b(Void... voidArr) {
            try {
                return C2075a.this.mo6976D();
            } catch (C1860j e) {
                if (mo7012f()) {
                    return null;
                }
                throw e;
            }
        }

        public void run() {
            this.f6049y = false;
            C2075a.this.mo6973A();
        }
    }

    public C2075a(Context context) {
        this(context, C2080c.f6062p);
    }

    private C2075a(Context context, Executor executor) {
        super(context);
        this.f6046n = -10000;
        this.f6042j = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo6973A() {
        if (this.f6044l == null && this.f6043k != null) {
            if (this.f6043k.f6049y) {
                this.f6043k.f6049y = false;
                this.f6047o.removeCallbacks(this.f6043k);
            }
            if (this.f6045m <= 0 || SystemClock.uptimeMillis() >= this.f6046n + this.f6045m) {
                this.f6043k.mo7010c(this.f6042j, (Params[]) null);
                return;
            }
            this.f6043k.f6049y = true;
            this.f6047o.postAtTime(this.f6043k, this.f6046n + this.f6045m);
        }
    }

    /* renamed from: B */
    public abstract D mo6974B();

    /* renamed from: C */
    public void mo6975C(D d) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public D mo6976D() {
        return mo6974B();
    }

    @Deprecated
    /* renamed from: h */
    public void mo6977h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo6977h(str, fileDescriptor, printWriter, strArr);
        if (this.f6043k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f6043k);
            printWriter.print(" waiting=");
            printWriter.println(this.f6043k.f6049y);
        }
        if (this.f6044l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f6044l);
            printWriter.print(" waiting=");
            printWriter.println(this.f6044l.f6049y);
        }
        if (this.f6045m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C1179j.m4589c(this.f6045m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C1179j.m4588b(this.f6046n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo6978l() {
        if (this.f6043k == null) {
            return false;
        }
        if (!this.f6055e) {
            this.f6058h = true;
        }
        if (this.f6044l != null) {
            if (this.f6043k.f6049y) {
                this.f6043k.f6049y = false;
                this.f6047o.removeCallbacks(this.f6043k);
            }
            this.f6043k = null;
            return false;
        } else if (this.f6043k.f6049y) {
            this.f6043k.f6049y = false;
            this.f6047o.removeCallbacks(this.f6043k);
            this.f6043k = null;
            return false;
        } else {
            boolean a = this.f6043k.mo7009a(false);
            if (a) {
                this.f6044l = this.f6043k;
                mo6980x();
            }
            this.f6043k = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo6979n() {
        super.mo6979n();
        mo6989c();
        this.f6043k = new C2076a();
        mo6973A();
    }

    /* renamed from: x */
    public void mo6980x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo6981y(C2075a<D>.C0000a aVar, D d) {
        mo6975C(d);
        if (this.f6044l == aVar) {
            mo7003t();
            this.f6046n = SystemClock.uptimeMillis();
            this.f6044l = null;
            mo6992f();
            mo6973A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo6982z(C2075a<D>.C0000a aVar, D d) {
        if (this.f6043k != aVar) {
            mo6981y(aVar, d);
        } else if (mo6995j()) {
            mo6975C(d);
        } else {
            mo6990d();
            this.f6046n = SystemClock.uptimeMillis();
            this.f6043k = null;
            mo6993g(d);
        }
    }
}
