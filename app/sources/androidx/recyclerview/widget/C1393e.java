package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p027c.p064i.p069g.C1864m;

/* renamed from: androidx.recyclerview.widget.e */
final class C1393e implements Runnable {

    /* renamed from: f */
    static final ThreadLocal<C1393e> f4091f = new ThreadLocal<>();

    /* renamed from: o */
    static Comparator<C1396c> f4092o = new C1394a();

    /* renamed from: p */
    ArrayList<RecyclerView> f4093p = new ArrayList<>();

    /* renamed from: q */
    long f4094q;

    /* renamed from: r */
    long f4095r;

    /* renamed from: s */
    private ArrayList<C1396c> f4096s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    static class C1394a implements Comparator<C1396c> {
        C1394a() {
        }

        /* renamed from: a */
        public int compare(C1396c cVar, C1396c cVar2) {
            RecyclerView recyclerView = cVar.f4104d;
            if ((recyclerView == null) != (cVar2.f4104d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f4101a;
            if (z != cVar2.f4101a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f4102b - cVar.f4102b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f4103c - cVar2.f4103c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    static class C1395b implements RecyclerView.C1342o.C1345c {

        /* renamed from: a */
        int f4097a;

        /* renamed from: b */
        int f4098b;

        /* renamed from: c */
        int[] f4099c;

        /* renamed from: d */
        int f4100d;

        C1395b() {
        }

        /* renamed from: a */
        public void mo4912a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4100d * 2;
                int[] iArr = this.f4099c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4099c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4099c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4099c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4100d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5165b() {
            int[] iArr = this.f4099c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4100d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5166c(RecyclerView recyclerView, boolean z) {
            this.f4100d = 0;
            int[] iArr = this.f4099c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1342o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.mo4897u0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo5086p()) {
                        oVar.mo4463p(recyclerView.mAdapter.mo4760c(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo4461o(this.f4097a, this.f4098b, recyclerView.mState, this);
                }
                int i = this.f4100d;
                if (i > oVar.f3883m) {
                    oVar.f3883m = i;
                    oVar.f3884n = z;
                    recyclerView.mRecycler.mo4945K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5167d(int i) {
            if (this.f4099c != null) {
                int i2 = this.f4100d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4099c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5168e(int i, int i2) {
            this.f4097a = i;
            this.f4098b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    static class C1396c {

        /* renamed from: a */
        public boolean f4101a;

        /* renamed from: b */
        public int f4102b;

        /* renamed from: c */
        public int f4103c;

        /* renamed from: d */
        public RecyclerView f4104d;

        /* renamed from: e */
        public int f4105e;

        C1396c() {
        }

        /* renamed from: a */
        public void mo5169a() {
            this.f4101a = false;
            this.f4102b = 0;
            this.f4103c = 0;
            this.f4104d = null;
            this.f4105e = 0;
        }
    }

    C1393e() {
    }

    /* renamed from: b */
    private void m6165b() {
        C1396c cVar;
        int size = this.f4093p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4093p.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo5166c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4100d;
            }
        }
        this.f4096s.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4093p.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1395b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f4097a) + Math.abs(bVar.f4098b);
                for (int i5 = 0; i5 < bVar.f4100d * 2; i5 += 2) {
                    if (i3 >= this.f4096s.size()) {
                        cVar = new C1396c();
                        this.f4096s.add(cVar);
                    } else {
                        cVar = this.f4096s.get(i3);
                    }
                    int[] iArr = bVar.f4099c;
                    int i6 = iArr[i5 + 1];
                    cVar.f4101a = i6 <= abs;
                    cVar.f4102b = abs;
                    cVar.f4103c = i6;
                    cVar.f4104d = recyclerView2;
                    cVar.f4105e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4096s, f4092o);
    }

    /* renamed from: c */
    private void m6166c(C1396c cVar, long j) {
        RecyclerView.C1328d0 i = m6170i(cVar.f4104d, cVar.f4105e, cVar.f4101a ? Long.MAX_VALUE : j);
        if (i != null && i.f3839c != null && i.mo4729s() && !i.mo4730t()) {
            m6169h((RecyclerView) i.f3839c.get(), j);
        }
    }

    /* renamed from: d */
    private void m6167d(long j) {
        int i = 0;
        while (i < this.f4096s.size()) {
            C1396c cVar = this.f4096s.get(i);
            if (cVar.f4104d != null) {
                m6166c(cVar, j);
                cVar.mo5169a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m6168e(RecyclerView recyclerView, int i) {
        int j = recyclerView.mChildHelper.mo5103j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo5102i(i2));
            if (childViewHolderInt.f3840d == i && !childViewHolderInt.mo4730t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m6169h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo5103j() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C1395b bVar = recyclerView.mPrefetchRegistry;
            bVar.mo5166c(recyclerView, true);
            if (bVar.f4100d != 0) {
                try {
                    C1864m.m7881a("RV Nested Prefetch");
                    recyclerView.mState.mo4686f(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.f4100d * 2; i += 2) {
                        m6170i(recyclerView, bVar.f4099c[i], j);
                    }
                } finally {
                    C1864m.m7882b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C1328d0 m6170i(RecyclerView recyclerView, int i, long j) {
        if (m6168e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1354v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C1328d0 I = vVar.mo4943I(i, false, j);
            if (I != null) {
                if (!I.mo4729s() || I.mo4730t()) {
                    vVar.mo4948a(I, false);
                } else {
                    vVar.mo4937B(I.f3838b);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void mo5158a(RecyclerView recyclerView) {
        this.f4093p.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5159f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4094q == 0) {
            this.f4094q = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo5168e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5160g(long j) {
        m6165b();
        m6167d(j);
    }

    /* renamed from: j */
    public void mo5161j(RecyclerView recyclerView) {
        this.f4093p.remove(recyclerView);
    }

    public void run() {
        try {
            C1864m.m7881a("RV Prefetch");
            if (!this.f4093p.isEmpty()) {
                int size = this.f4093p.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4093p.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5160g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4095r);
                    this.f4094q = 0;
                    C1864m.m7882b();
                }
            }
        } finally {
            this.f4094q = 0;
            C1864m.m7882b();
        }
    }
}
