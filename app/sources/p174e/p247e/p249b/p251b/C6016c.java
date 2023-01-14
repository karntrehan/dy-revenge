package p174e.p247e.p249b.p251b;

import android.content.Context;
import java.io.File;
import p174e.p247e.p249b.p250a.C5994a;
import p174e.p247e.p249b.p250a.C5997c;
import p174e.p247e.p249b.p250a.C6002g;
import p174e.p247e.p249b.p250a.C6003h;
import p174e.p247e.p253d.p254a.C6034b;
import p174e.p247e.p253d.p254a.C6035c;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;

/* renamed from: e.e.b.b.c */
public class C6016c {

    /* renamed from: a */
    private final int f16616a;

    /* renamed from: b */
    private final String f16617b;

    /* renamed from: c */
    private final C6065n<File> f16618c;

    /* renamed from: d */
    private final long f16619d;

    /* renamed from: e */
    private final long f16620e;

    /* renamed from: f */
    private final long f16621f;

    /* renamed from: g */
    private final C6029h f16622g;

    /* renamed from: h */
    private final C5994a f16623h;

    /* renamed from: i */
    private final C5997c f16624i;

    /* renamed from: j */
    private final C6034b f16625j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f16626k;

    /* renamed from: l */
    private final boolean f16627l;

    /* renamed from: e.e.b.b.c$a */
    class C6017a implements C6065n<File> {
        C6017a() {
        }

        /* renamed from: a */
        public File get() {
            C6062k.m22839g(C6016c.this.f16626k);
            return C6016c.this.f16626k.getApplicationContext().getCacheDir();
        }
    }

    /* renamed from: e.e.b.b.c$b */
    public static class C6018b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f16629a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f16630b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C6065n<File> f16631c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f16632d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f16633e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f16634f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C6029h f16635g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C5994a f16636h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C5997c f16637i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C6034b f16638j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f16639k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final Context f16640l;

        private C6018b(Context context) {
            this.f16629a = 1;
            this.f16630b = "image_cache";
            this.f16632d = 41943040;
            this.f16633e = 10485760;
            this.f16634f = 2097152;
            this.f16635g = new C6014b();
            this.f16640l = context;
        }

        /* synthetic */ C6018b(Context context, C6017a aVar) {
            this(context);
        }

        /* renamed from: n */
        public C6016c mo17972n() {
            return new C6016c(this);
        }
    }

    protected C6016c(C6018b bVar) {
        Context a = bVar.f16640l;
        this.f16626k = a;
        C6062k.m22842j((bVar.f16631c == null && a == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f16631c == null && a != null) {
            C6065n unused = bVar.f16631c = new C6017a();
        }
        this.f16616a = bVar.f16629a;
        this.f16617b = (String) C6062k.m22839g(bVar.f16630b);
        this.f16618c = (C6065n) C6062k.m22839g(bVar.f16631c);
        this.f16619d = bVar.f16632d;
        this.f16620e = bVar.f16633e;
        this.f16621f = bVar.f16634f;
        this.f16622g = (C6029h) C6062k.m22839g(bVar.f16635g);
        this.f16623h = bVar.f16636h == null ? C6002g.m22623b() : bVar.f16636h;
        this.f16624i = bVar.f16637i == null ? C6003h.m22625i() : bVar.f16637i;
        this.f16625j = bVar.f16638j == null ? C6035c.m22789b() : bVar.f16638j;
        this.f16627l = bVar.f16639k;
    }

    /* renamed from: m */
    public static C6018b m22689m(Context context) {
        return new C6018b(context, (C6017a) null);
    }

    /* renamed from: b */
    public String mo17959b() {
        return this.f16617b;
    }

    /* renamed from: c */
    public C6065n<File> mo17960c() {
        return this.f16618c;
    }

    /* renamed from: d */
    public C5994a mo17961d() {
        return this.f16623h;
    }

    /* renamed from: e */
    public C5997c mo17962e() {
        return this.f16624i;
    }

    /* renamed from: f */
    public long mo17963f() {
        return this.f16619d;
    }

    /* renamed from: g */
    public C6034b mo17964g() {
        return this.f16625j;
    }

    /* renamed from: h */
    public C6029h mo17965h() {
        return this.f16622g;
    }

    /* renamed from: i */
    public boolean mo17966i() {
        return this.f16627l;
    }

    /* renamed from: j */
    public long mo17967j() {
        return this.f16620e;
    }

    /* renamed from: k */
    public long mo17968k() {
        return this.f16621f;
    }

    /* renamed from: l */
    public int mo17969l() {
        return this.f16616a;
    }
}
