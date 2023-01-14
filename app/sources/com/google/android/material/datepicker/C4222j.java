package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.material.datepicker.j */
class C4222j extends BaseAdapter {

    /* renamed from: f */
    static final int f11905f = C4230o.m16161k().getMaximum(4);

    /* renamed from: o */
    final C4220i f11906o;

    /* renamed from: p */
    final C4214d<?> f11907p;

    /* renamed from: q */
    C4213c f11908q;

    /* renamed from: r */
    final C4208a f11909r;

    C4222j(C4220i iVar, C4214d<?> dVar, C4208a aVar) {
        this.f11906o = iVar;
        this.f11907p = dVar;
        this.f11909r = aVar;
    }

    /* renamed from: e */
    private void m16126e(Context context) {
        if (this.f11908q == null) {
            this.f11908q = new C4213c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo13218a(int i) {
        return mo13219b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo13219b() {
        return this.f11906o.mo13202P();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f11906o.mo13202P() || i > mo13228h()) {
            return null;
        }
        return Long.valueOf(this.f11906o.mo13203Q(mo13230i(i)));
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m16126e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p174e.p319f.p320a.p363d.C9021h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo13219b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x005e
            com.google.android.material.datepicker.i r2 = r5.f11906o
            int r3 = r2.f11903s
            if (r7 < r3) goto L_0x002e
            goto L_0x005e
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.i r2 = r5.f11906o
            long r2 = r2.mo13203Q(r7)
            com.google.android.material.datepicker.i r7 = r5.f11906o
            int r7 = r7.f11901q
            com.google.android.material.datepicker.i r4 = com.google.android.material.datepicker.C4220i.m16116V()
            int r4 = r4.f11901q
            if (r7 != r4) goto L_0x0050
            java.lang.String r7 = com.google.android.material.datepicker.C4215e.m16103a(r2)
            goto L_0x0054
        L_0x0050:
            java.lang.String r7 = com.google.android.material.datepicker.C4215e.m16105c(r2)
        L_0x0054:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0066
        L_0x005e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0066:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006d
            return r0
        L_0x006d:
            com.google.android.material.datepicker.a r7 = r5.f11909r
            com.google.android.material.datepicker.a$c r7 = r7.mo13161e()
            long r2 = r6.longValue()
            boolean r7 = r7.mo13176A(r2)
            if (r7 == 0) goto L_0x00cc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f11907p
            java.util.Collection r7 = r7.mo13181D()
            java.util.Iterator r7 = r7.iterator()
        L_0x008a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C4230o.m16151a(r3)
            long r1 = com.google.android.material.datepicker.C4230o.m16151a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
            com.google.android.material.datepicker.c r6 = r5.f11908q
            com.google.android.material.datepicker.b r6 = r6.f11886b
        L_0x00ae:
            r6.mo13179d(r0)
            return r0
        L_0x00b2:
            java.util.Calendar r7 = com.google.android.material.datepicker.C4230o.m16159i()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00c7
            com.google.android.material.datepicker.c r6 = r5.f11908q
            com.google.android.material.datepicker.b r6 = r6.f11887c
            goto L_0x00ae
        L_0x00c7:
            com.google.android.material.datepicker.c r6 = r5.f11908q
            com.google.android.material.datepicker.b r6 = r6.f11885a
            goto L_0x00ae
        L_0x00cc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f11908q
            com.google.android.material.datepicker.b r6 = r6.f11891g
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C4222j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo13222f(int i) {
        return i % this.f11906o.f11902r == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo13223g(int i) {
        return (i + 1) % this.f11906o.f11902r == 0;
    }

    public int getCount() {
        return this.f11906o.f11903s + mo13219b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f11906o.f11902r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo13228h() {
        return (this.f11906o.mo13202P() + this.f11906o.f11903s) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13230i(int i) {
        return (i - this.f11906o.mo13202P()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo13231j(int i) {
        return i >= mo13219b() && i <= mo13228h();
    }
}
