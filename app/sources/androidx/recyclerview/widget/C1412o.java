package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.o */
class C1412o {

    /* renamed from: a */
    final C1414b f4140a;

    /* renamed from: b */
    C1413a f4141b = new C1413a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    static class C1413a {

        /* renamed from: a */
        int f4142a = 0;

        /* renamed from: b */
        int f4143b;

        /* renamed from: c */
        int f4144c;

        /* renamed from: d */
        int f4145d;

        /* renamed from: e */
        int f4146e;

        C1413a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5237a(int i) {
            this.f4142a = i | this.f4142a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5238b() {
            int i = this.f4142a;
            if ((i & 7) != 0 && (i & (mo5239c(this.f4145d, this.f4143b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4142a;
            if ((i2 & 112) != 0 && (i2 & (mo5239c(this.f4145d, this.f4144c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4142a;
            if ((i3 & 1792) != 0 && (i3 & (mo5239c(this.f4146e, this.f4143b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4142a;
            return (i4 & 28672) == 0 || (i4 & (mo5239c(this.f4146e, this.f4144c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5239c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5240d() {
            this.f4142a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5241e(int i, int i2, int i3, int i4) {
            this.f4143b = i;
            this.f4144c = i2;
            this.f4145d = i3;
            this.f4146e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    interface C1414b {
        /* renamed from: a */
        View mo4907a(int i);

        /* renamed from: b */
        int mo4908b(View view);

        /* renamed from: c */
        int mo4909c();

        /* renamed from: d */
        int mo4910d();

        /* renamed from: e */
        int mo4911e(View view);
    }

    C1412o(C1414b bVar) {
        this.f4140a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5235a(int i, int i2, int i3, int i4) {
        int c = this.f4140a.mo4909c();
        int d = this.f4140a.mo4910d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f4140a.mo4907a(i);
            this.f4141b.mo5241e(c, d, this.f4140a.mo4908b(a), this.f4140a.mo4911e(a));
            if (i3 != 0) {
                this.f4141b.mo5240d();
                this.f4141b.mo5237a(i3);
                if (this.f4141b.mo5238b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f4141b.mo5240d();
                this.f4141b.mo5237a(i4);
                if (this.f4141b.mo5238b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5236b(View view, int i) {
        this.f4141b.mo5241e(this.f4140a.mo4909c(), this.f4140a.mo4910d(), this.f4140a.mo4908b(view), this.f4140a.mo4911e(view));
        if (i == 0) {
            return false;
        }
        this.f4141b.mo5240d();
        this.f4141b.mo5237a(i);
        return this.f4141b.mo5238b();
    }
}
