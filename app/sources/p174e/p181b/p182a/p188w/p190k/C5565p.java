package p174e.p181b.p182a.p188w.p190k;

import android.graphics.Paint;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5497r;
import p174e.p181b.p182a.p188w.p189j.C5533a;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.w.k.p */
public class C5565p implements C5548b {

    /* renamed from: a */
    private final String f15735a;

    /* renamed from: b */
    private final C5534b f15736b;

    /* renamed from: c */
    private final List<C5534b> f15737c;

    /* renamed from: d */
    private final C5533a f15738d;

    /* renamed from: e */
    private final C5536d f15739e;

    /* renamed from: f */
    private final C5534b f15740f;

    /* renamed from: g */
    private final C5567b f15741g;

    /* renamed from: h */
    private final C5568c f15742h;

    /* renamed from: i */
    private final float f15743i;

    /* renamed from: j */
    private final boolean f15744j;

    /* renamed from: e.b.a.w.k.p$a */
    static /* synthetic */ class C5566a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15745a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15746b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                e.b.a.w.k.p$c[] r0 = p174e.p181b.p182a.p188w.p190k.C5565p.C5568c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15746b = r0
                r1 = 1
                e.b.a.w.k.p$c r2 = p174e.p181b.p182a.p188w.p190k.C5565p.C5568c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15746b     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.w.k.p$c r3 = p174e.p181b.p182a.p188w.p190k.C5565p.C5568c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f15746b     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.b.a.w.k.p$c r4 = p174e.p181b.p182a.p188w.p190k.C5565p.C5568c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                e.b.a.w.k.p$b[] r3 = p174e.p181b.p182a.p188w.p190k.C5565p.C5567b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f15745a = r3
                e.b.a.w.k.p$b r4 = p174e.p181b.p182a.p188w.p190k.C5565p.C5567b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f15745a     // Catch:{ NoSuchFieldError -> 0x0043 }
                e.b.a.w.k.p$b r3 = p174e.p181b.p182a.p188w.p190k.C5565p.C5567b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f15745a     // Catch:{ NoSuchFieldError -> 0x004d }
                e.b.a.w.k.p$b r1 = p174e.p181b.p182a.p188w.p190k.C5565p.C5567b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p188w.p190k.C5565p.C5566a.<clinit>():void");
        }
    }

    /* renamed from: e.b.a.w.k.p$b */
    public enum C5567b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: e */
        public Paint.Cap mo16797e() {
            int i = C5566a.f15745a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* renamed from: e.b.a.w.k.p$c */
    public enum C5568c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: e */
        public Paint.Join mo16798e() {
            int i = C5566a.f15746b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C5565p(String str, C5534b bVar, List<C5534b> list, C5533a aVar, C5536d dVar, C5534b bVar2, C5567b bVar3, C5568c cVar, float f, boolean z) {
        this.f15735a = str;
        this.f15736b = bVar;
        this.f15737c = list;
        this.f15738d = aVar;
        this.f15739e = dVar;
        this.f15740f = bVar2;
        this.f15741g = bVar3;
        this.f15742h = cVar;
        this.f15743i = f;
        this.f15744j = z;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        return new C5497r(gVar, aVar, this);
    }

    /* renamed from: b */
    public C5567b mo16787b() {
        return this.f15741g;
    }

    /* renamed from: c */
    public C5533a mo16788c() {
        return this.f15738d;
    }

    /* renamed from: d */
    public C5534b mo16789d() {
        return this.f15736b;
    }

    /* renamed from: e */
    public C5568c mo16790e() {
        return this.f15742h;
    }

    /* renamed from: f */
    public List<C5534b> mo16791f() {
        return this.f15737c;
    }

    /* renamed from: g */
    public float mo16792g() {
        return this.f15743i;
    }

    /* renamed from: h */
    public String mo16793h() {
        return this.f15735a;
    }

    /* renamed from: i */
    public C5536d mo16794i() {
        return this.f15739e;
    }

    /* renamed from: j */
    public C5534b mo16795j() {
        return this.f15740f;
    }

    /* renamed from: k */
    public boolean mo16796k() {
        return this.f15744j;
    }
}
