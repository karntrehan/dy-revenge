package p027c.p092r.p093a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.util.C1171b;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.C1301n;
import androidx.lifecycle.C1306q;
import androidx.lifecycle.C1307r;
import androidx.lifecycle.C1311s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p027c.p060f.C1802h;
import p027c.p092r.p093a.C2068a;
import p027c.p092r.p094b.C2077b;

/* renamed from: c.r.a.b */
class C2070b extends C2068a {

    /* renamed from: a */
    static boolean f6027a = false;

    /* renamed from: b */
    private final C1291g f6028b;

    /* renamed from: c */
    private final C2073c f6029c;

    /* renamed from: c.r.a.b$a */
    public static class C2071a<D> extends C1300m<D> implements C2077b.C2079b<D> {

        /* renamed from: k */
        private final int f6030k;

        /* renamed from: l */
        private final Bundle f6031l;

        /* renamed from: m */
        private final C2077b<D> f6032m;

        /* renamed from: n */
        private C1291g f6033n;

        /* renamed from: o */
        private C2072b<D> f6034o;

        /* renamed from: p */
        private C2077b<D> f6035p;

        C2071a(int i, Bundle bundle, C2077b<D> bVar, C2077b<D> bVar2) {
            this.f6030k = i;
            this.f6031l = bundle;
            this.f6032m = bVar;
            this.f6035p = bVar2;
            bVar.mo7001r(i, this);
        }

        /* renamed from: a */
        public void mo6955a(C2077b<D> bVar, D d) {
            if (C2070b.f6027a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4316n(d);
                return;
            }
            if (C2070b.f6027a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo4314l(d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4312j() {
            if (C2070b.f6027a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f6032m.mo7005u();
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo4313k() {
            if (C2070b.f6027a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f6032m.mo7006v();
        }

        /* renamed from: m */
        public void mo4315m(C1301n<? super D> nVar) {
            super.mo4315m(nVar);
            this.f6033n = null;
            this.f6034o = null;
        }

        /* renamed from: n */
        public void mo4316n(D d) {
            super.mo4316n(d);
            C2077b<D> bVar = this.f6035p;
            if (bVar != null) {
                bVar.mo7002s();
                this.f6035p = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C2077b<D> mo6956o(boolean z) {
            if (C2070b.f6027a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f6032m.mo6989c();
            this.f6032m.mo6988b();
            C2072b<D> bVar = this.f6034o;
            if (bVar != null) {
                mo4315m(bVar);
                if (z) {
                    bVar.mo6964d();
                }
            }
            this.f6032m.mo7007w(this);
            if ((bVar == null || bVar.mo6963c()) && !z) {
                return this.f6032m;
            }
            this.f6032m.mo7002s();
            return this.f6035p;
        }

        /* renamed from: p */
        public void mo6957p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f6030k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f6031l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f6032m);
            C2077b<D> bVar = this.f6032m;
            bVar.mo6977h(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f6034o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f6034o);
                C2072b<D> bVar2 = this.f6034o;
                bVar2.mo6962b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo6958q().mo6991e(mo2469e()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo4309g());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C2077b<D> mo6958q() {
            return this.f6032m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6959r() {
            C1291g gVar = this.f6033n;
            C2072b<D> bVar = this.f6034o;
            if (gVar != null && bVar != null) {
                super.mo4315m(bVar);
                mo4310h(gVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C2077b<D> mo6960s(C1291g gVar, C2068a.C2069a<D> aVar) {
            C2072b<D> bVar = new C2072b<>(this.f6032m, aVar);
            mo4310h(gVar, bVar);
            C2072b<D> bVar2 = this.f6034o;
            if (bVar2 != null) {
                mo4315m(bVar2);
            }
            this.f6033n = gVar;
            this.f6034o = bVar;
            return this.f6032m;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f6030k);
            sb.append(" : ");
            C1171b.m4570a(this.f6032m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: c.r.a.b$b */
    static class C2072b<D> implements C1301n<D> {

        /* renamed from: a */
        private final C2077b<D> f6036a;

        /* renamed from: b */
        private final C2068a.C2069a<D> f6037b;

        /* renamed from: c */
        private boolean f6038c = false;

        C2072b(C2077b<D> bVar, C2068a.C2069a<D> aVar) {
            this.f6036a = bVar;
            this.f6037b = aVar;
        }

        /* renamed from: a */
        public void mo2369a(D d) {
            if (C2070b.f6027a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f6036a + ": " + this.f6036a.mo6991e(d));
            }
            this.f6037b.mo6951a(this.f6036a, d);
            this.f6038c = true;
        }

        /* renamed from: b */
        public void mo6962b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f6038c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6963c() {
            return this.f6038c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6964d() {
            if (this.f6038c) {
                if (C2070b.f6027a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f6036a);
                }
                this.f6037b.mo6953c(this.f6036a);
            }
        }

        public String toString() {
            return this.f6037b.toString();
        }
    }

    /* renamed from: c.r.a.b$c */
    static class C2073c extends C1306q {

        /* renamed from: c */
        private static final C1307r.C1308a f6039c = new C2074a();

        /* renamed from: d */
        private C1802h<C2071a> f6040d = new C1802h<>();

        /* renamed from: e */
        private boolean f6041e = false;

        /* renamed from: c.r.a.b$c$a */
        static class C2074a implements C1307r.C1308a {
            C2074a() {
            }

            /* renamed from: a */
            public <T extends C1306q> T mo4196a(Class<T> cls) {
                return new C2073c();
            }
        }

        C2073c() {
        }

        /* renamed from: g */
        static C2073c m8903g(C1311s sVar) {
            return (C2073c) new C1307r(sVar, f6039c).mo4375a(C2073c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4183d() {
            super.mo4183d();
            int p = this.f6040d.mo6283p();
            for (int i = 0; i < p; i++) {
                this.f6040d.mo6284q(i).mo6956o(true);
            }
            this.f6040d.mo6274d();
        }

        /* renamed from: e */
        public void mo6966e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f6040d.mo6283p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f6040d.mo6283p(); i++) {
                    C2071a q = this.f6040d.mo6284q(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f6040d.mo6280l(i));
                    printWriter.print(": ");
                    printWriter.println(q.toString());
                    q.mo6957p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6967f() {
            this.f6041e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public <D> C2071a<D> mo6968h(int i) {
            return this.f6040d.mo6276g(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo6969i() {
            return this.f6041e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6970j() {
            int p = this.f6040d.mo6283p();
            for (int i = 0; i < p; i++) {
                this.f6040d.mo6284q(i).mo6959r();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo6971k(int i, C2071a aVar) {
            this.f6040d.mo6281m(i, aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo6972l() {
            this.f6041e = true;
        }
    }

    C2070b(C1291g gVar, C1311s sVar) {
        this.f6028b = gVar;
        this.f6029c = C2073c.m8903g(sVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private <D> C2077b<D> m8885e(int i, Bundle bundle, C2068a.C2069a<D> aVar, C2077b<D> bVar) {
        try {
            this.f6029c.mo6972l();
            C2077b<D> b = aVar.mo6952b(i, bundle);
            if (b != null) {
                if (b.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(b.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b);
                    }
                }
                C2071a aVar2 = new C2071a(i, bundle, b, bVar);
                if (f6027a) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f6029c.mo6971k(i, aVar2);
                this.f6029c.mo6967f();
                return aVar2.mo6960s(this.f6028b, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f6029c.mo6967f();
            throw th;
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo6948a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f6029c.mo6966e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public <D> C2077b<D> mo6949c(int i, Bundle bundle, C2068a.C2069a<D> aVar) {
        if (this.f6029c.mo6969i()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C2071a h = this.f6029c.mo6968h(i);
            if (f6027a) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (h == null) {
                return m8885e(i, bundle, aVar, (C2077b) null);
            }
            if (f6027a) {
                Log.v("LoaderManager", "  Re-using existing loader " + h);
            }
            return h.mo6960s(this.f6028b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: d */
    public void mo6950d() {
        this.f6029c.mo6970j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1171b.m4570a(this.f6028b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
