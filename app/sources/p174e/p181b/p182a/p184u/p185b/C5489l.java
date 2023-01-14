package p174e.p181b.p182a.p184u.p185b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p188w.p190k.C5555h;

@TargetApi(19)
/* renamed from: e.b.a.u.b.l */
public class C5489l implements C5491m, C5487j {

    /* renamed from: a */
    private final Path f15465a = new Path();

    /* renamed from: b */
    private final Path f15466b = new Path();

    /* renamed from: c */
    private final Path f15467c = new Path();

    /* renamed from: d */
    private final String f15468d;

    /* renamed from: e */
    private final List<C5491m> f15469e = new ArrayList();

    /* renamed from: f */
    private final C5555h f15470f;

    /* renamed from: e.b.a.u.b.l$a */
    static /* synthetic */ class C5490a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15471a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.b.a.w.k.h$a[] r0 = p174e.p181b.p182a.p188w.p190k.C5555h.C5556a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15471a = r0
                e.b.a.w.k.h$a r1 = p174e.p181b.p182a.p188w.p190k.C5555h.C5556a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15471a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.w.k.h$a r1 = p174e.p181b.p182a.p188w.p190k.C5555h.C5556a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15471a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.b.a.w.k.h$a r1 = p174e.p181b.p182a.p188w.p190k.C5555h.C5556a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15471a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.b.a.w.k.h$a r1 = p174e.p181b.p182a.p188w.p190k.C5555h.C5556a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15471a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.b.a.w.k.h$a r1 = p174e.p181b.p182a.p188w.p190k.C5555h.C5556a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p184u.p185b.C5489l.C5490a.<clinit>():void");
        }
    }

    public C5489l(C5555h hVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f15468d = hVar.mo16744c();
            this.f15470f = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: b */
    private void m20437b() {
        for (int i = 0; i < this.f15469e.size(); i++) {
            this.f15467c.addPath(this.f15469e.get(i).mo16596a());
        }
    }

    @TargetApi(19)
    /* renamed from: d */
    private void m20438d(Path.Op op) {
        this.f15466b.reset();
        this.f15465a.reset();
        for (int size = this.f15469e.size() - 1; size >= 1; size--) {
            C5491m mVar = this.f15469e.get(size);
            if (mVar instanceof C5481d) {
                C5481d dVar = (C5481d) mVar;
                List<C5491m> j = dVar.mo16597j();
                for (int size2 = j.size() - 1; size2 >= 0; size2--) {
                    Path a = j.get(size2).mo16596a();
                    a.transform(dVar.mo16598k());
                    this.f15466b.addPath(a);
                }
            } else {
                this.f15466b.addPath(mVar.mo16596a());
            }
        }
        C5491m mVar2 = this.f15469e.get(0);
        if (mVar2 instanceof C5481d) {
            C5481d dVar2 = (C5481d) mVar2;
            List<C5491m> j2 = dVar2.mo16597j();
            for (int i = 0; i < j2.size(); i++) {
                Path a2 = j2.get(i).mo16596a();
                a2.transform(dVar2.mo16598k());
                this.f15465a.addPath(a2);
            }
        } else {
            this.f15465a.set(mVar2.mo16596a());
        }
        this.f15467c.op(this.f15465a, this.f15466b, op);
    }

    /* renamed from: a */
    public Path mo16596a() {
        Path.Op op;
        this.f15467c.reset();
        if (this.f15470f.mo16745d()) {
            return this.f15467c;
        }
        int i = C5490a.f15471a[this.f15470f.mo16743b().ordinal()];
        if (i != 1) {
            if (i == 2) {
                op = Path.Op.UNION;
            } else if (i == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i == 4) {
                op = Path.Op.INTERSECT;
            } else if (i == 5) {
                op = Path.Op.XOR;
            }
            m20438d(op);
        } else {
            m20437b();
        }
        return this.f15467c;
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < this.f15469e.size(); i++) {
            this.f15469e.get(i).mo16588c(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16599f(java.util.ListIterator<p174e.p181b.p182a.p184u.p185b.C5480c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            e.b.a.u.b.c r0 = (p174e.p181b.p182a.p184u.p185b.C5480c) r0
            boolean r1 = r0 instanceof p174e.p181b.p182a.p184u.p185b.C5491m
            if (r1 == 0) goto L_0x000d
            java.util.List<e.b.a.u.b.m> r1 = r2.f15469e
            e.b.a.u.b.m r0 = (p174e.p181b.p182a.p184u.p185b.C5491m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p184u.p185b.C5489l.mo16599f(java.util.ListIterator):void");
    }
}
