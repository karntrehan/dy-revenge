package p027c.p064i.p070h;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.core.util.C1177h;
import java.util.concurrent.Executor;

/* renamed from: c.i.h.f */
public class C1879f {

    /* renamed from: c.i.h.f$a */
    public static class C1880a {

        /* renamed from: a */
        private final int f5536a;

        /* renamed from: b */
        private final C1881b[] f5537b;

        @Deprecated
        public C1880a(int i, C1881b[] bVarArr) {
            this.f5536a = i;
            this.f5537b = bVarArr;
        }

        /* renamed from: a */
        static C1880a m7915a(int i, C1881b[] bVarArr) {
            return new C1880a(i, bVarArr);
        }

        /* renamed from: b */
        public C1881b[] mo6391b() {
            return this.f5537b;
        }

        /* renamed from: c */
        public int mo6392c() {
            return this.f5536a;
        }
    }

    /* renamed from: c.i.h.f$b */
    public static class C1881b {

        /* renamed from: a */
        private final Uri f5538a;

        /* renamed from: b */
        private final int f5539b;

        /* renamed from: c */
        private final int f5540c;

        /* renamed from: d */
        private final boolean f5541d;

        /* renamed from: e */
        private final int f5542e;

        @Deprecated
        public C1881b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f5538a = (Uri) C1177h.m4583e(uri);
            this.f5539b = i;
            this.f5540c = i2;
            this.f5541d = z;
            this.f5542e = i3;
        }

        /* renamed from: a */
        static C1881b m7918a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C1881b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo6393b() {
            return this.f5542e;
        }

        /* renamed from: c */
        public int mo6394c() {
            return this.f5539b;
        }

        /* renamed from: d */
        public Uri mo6395d() {
            return this.f5538a;
        }

        /* renamed from: e */
        public int mo6396e() {
            return this.f5540c;
        }

        /* renamed from: f */
        public boolean mo6397f() {
            return this.f5541d;
        }
    }

    /* renamed from: c.i.h.f$c */
    public static class C1882c {
        /* renamed from: a */
        public void mo6327a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo6328b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m7914a(Context context, C1872d dVar, int i, boolean z, int i2, Handler handler, C1882c cVar) {
        C1866a aVar = new C1866a(cVar, handler);
        return z ? C1873e.m7906e(context, dVar, aVar, i, i2) : C1873e.m7905d(context, dVar, i, (Executor) null, aVar);
    }
}
