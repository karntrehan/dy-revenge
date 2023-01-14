package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
class C1374b {

    /* renamed from: a */
    final C1376b f3999a;

    /* renamed from: b */
    final C1375a f4000b = new C1375a();

    /* renamed from: c */
    final List<View> f4001c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    static class C1375a {

        /* renamed from: a */
        long f4002a = 0;

        /* renamed from: b */
        C1375a f4003b;

        C1375a() {
        }

        /* renamed from: c */
        private void m6102c() {
            if (this.f4003b == null) {
                this.f4003b = new C1375a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5113a(int i) {
            if (i >= 64) {
                C1375a aVar = this.f4003b;
                if (aVar != null) {
                    aVar.mo5113a(i - 64);
                    return;
                }
                return;
            }
            this.f4002a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5114b(int i) {
            C1375a aVar = this.f4003b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f4002a) : Long.bitCount(this.f4002a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f4002a & ((1 << i) - 1)) : aVar.mo5114b(i - 64) + Long.bitCount(this.f4002a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5115d(int i) {
            if (i < 64) {
                return (this.f4002a & (1 << i)) != 0;
            }
            m6102c();
            return this.f4003b.mo5115d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5116e(int i, boolean z) {
            if (i >= 64) {
                m6102c();
                this.f4003b.mo5116e(i - 64, z);
                return;
            }
            long j = this.f4002a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4002a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo5119h(i);
            } else {
                mo5113a(i);
            }
            if (z2 || this.f4003b != null) {
                m6102c();
                this.f4003b.mo5116e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo5117f(int i) {
            if (i >= 64) {
                m6102c();
                return this.f4003b.mo5117f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4002a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f4002a = j3;
            long j4 = j - 1;
            this.f4002a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1375a aVar = this.f4003b;
            if (aVar != null) {
                if (aVar.mo5115d(0)) {
                    mo5119h(63);
                }
                this.f4003b.mo5117f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5118g() {
            this.f4002a = 0;
            C1375a aVar = this.f4003b;
            if (aVar != null) {
                aVar.mo5118g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5119h(int i) {
            if (i >= 64) {
                m6102c();
                this.f4003b.mo5119h(i - 64);
                return;
            }
            this.f4002a |= 1 << i;
        }

        public String toString() {
            if (this.f4003b == null) {
                return Long.toBinaryString(this.f4002a);
            }
            return this.f4003b.toString() + "xx" + Long.toBinaryString(this.f4002a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    interface C1376b {
        /* renamed from: a */
        View mo4738a(int i);

        /* renamed from: b */
        int mo4739b();

        /* renamed from: c */
        void mo4740c(View view);

        /* renamed from: d */
        void mo4741d();

        /* renamed from: e */
        int mo4742e(View view);

        /* renamed from: f */
        RecyclerView.C1328d0 mo4743f(View view);

        /* renamed from: g */
        void mo4744g(int i);

        /* renamed from: h */
        void mo4745h(View view);

        /* renamed from: i */
        void mo4746i(View view, int i);

        /* renamed from: j */
        void mo4747j(int i);

        /* renamed from: k */
        void mo4748k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    C1374b(C1376b bVar) {
        this.f3999a = bVar;
    }

    /* renamed from: h */
    private int m6082h(int i) {
        if (i < 0) {
            return -1;
        }
        int b = this.f3999a.mo4739b();
        int i2 = i;
        while (i2 < b) {
            int b2 = i - (i2 - this.f4000b.mo5114b(i2));
            if (b2 == 0) {
                while (this.f4000b.mo5115d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    /* renamed from: l */
    private void m6083l(View view) {
        this.f4001c.add(view);
        this.f3999a.mo4740c(view);
    }

    /* renamed from: t */
    private boolean m6084t(View view) {
        if (!this.f4001c.remove(view)) {
            return false;
        }
        this.f3999a.mo4745h(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5095a(View view, int i, boolean z) {
        int b = i < 0 ? this.f3999a.mo4739b() : m6082h(i);
        this.f4000b.mo5116e(b, z);
        if (z) {
            m6083l(view);
        }
        this.f3999a.mo4746i(view, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5096b(View view, boolean z) {
        mo5095a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5097c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b = i < 0 ? this.f3999a.mo4739b() : m6082h(i);
        this.f4000b.mo5116e(b, z);
        if (z) {
            m6083l(view);
        }
        this.f3999a.mo4748k(view, b, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5098d(int i) {
        int h = m6082h(i);
        this.f4000b.mo5117f(h);
        this.f3999a.mo4744g(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo5099e(int i) {
        int size = this.f4001c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4001c.get(i2);
            RecyclerView.C1328d0 f = this.f3999a.mo4743f(view);
            if (f.mo4723m() == i && !f.mo4730t() && !f.mo4733v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo5100f(int i) {
        return this.f3999a.mo4738a(m6082h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5101g() {
        return this.f3999a.mo4739b() - this.f4001c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo5102i(int i) {
        return this.f3999a.mo4738a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo5103j() {
        return this.f3999a.mo4739b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5104k(View view) {
        int e = this.f3999a.mo4742e(view);
        if (e >= 0) {
            this.f4000b.mo5119h(e);
            m6083l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5105m(View view) {
        int e = this.f3999a.mo4742e(view);
        if (e != -1 && !this.f4000b.mo5115d(e)) {
            return e - this.f4000b.mo5114b(e);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo5106n(View view) {
        return this.f4001c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5107o() {
        this.f4000b.mo5118g();
        for (int size = this.f4001c.size() - 1; size >= 0; size--) {
            this.f3999a.mo4745h(this.f4001c.get(size));
            this.f4001c.remove(size);
        }
        this.f3999a.mo4741d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5108p(View view) {
        int e = this.f3999a.mo4742e(view);
        if (e >= 0) {
            if (this.f4000b.mo5117f(e)) {
                m6084t(view);
            }
            this.f3999a.mo4747j(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5109q(int i) {
        int h = m6082h(i);
        View a = this.f3999a.mo4738a(h);
        if (a != null) {
            if (this.f4000b.mo5117f(h)) {
                m6084t(a);
            }
            this.f3999a.mo4747j(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5110r(View view) {
        int e = this.f3999a.mo4742e(view);
        if (e == -1) {
            m6084t(view);
            return true;
        } else if (!this.f4000b.mo5115d(e)) {
            return false;
        } else {
            this.f4000b.mo5117f(e);
            m6084t(view);
            this.f3999a.mo4747j(e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5111s(View view) {
        int e = this.f3999a.mo4742e(view);
        if (e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4000b.mo5115d(e)) {
            this.f4000b.mo5113a(e);
            m6084t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4000b.toString() + ", hidden list:" + this.f4001c.size();
    }
}
