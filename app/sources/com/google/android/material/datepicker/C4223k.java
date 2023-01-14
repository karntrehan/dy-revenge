package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9021h;

/* renamed from: com.google.android.material.datepicker.k */
class C4223k extends RecyclerView.C1331g<C4225b> {

    /* renamed from: c */
    private final C4208a f11910c;

    /* renamed from: d */
    private final C4214d<?> f11911d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final MaterialCalendar.C4201l f11912e;

    /* renamed from: f */
    private final int f11913f;

    /* renamed from: com.google.android.material.datepicker.k$a */
    class C4224a implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f11914f;

        C4224a(MaterialCalendarGridView materialCalendarGridView) {
            this.f11914f = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f11914f.getAdapter().mo13231j(i)) {
                C4223k.this.f11912e.mo13141a(this.f11914f.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$b */
    public static class C4225b extends RecyclerView.C1328d0 {

        /* renamed from: t */
        final TextView f11916t;

        /* renamed from: u */
        final MaterialCalendarGridView f11917u;

        C4225b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C9019f.month_title);
            this.f11916t = textView;
            C1988t.m8396n0(textView, true);
            this.f11917u = (MaterialCalendarGridView) linearLayout.findViewById(C9019f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    C4223k(Context context, C4214d<?> dVar, C4208a aVar, MaterialCalendar.C4201l lVar) {
        C4220i k = aVar.mo13167k();
        C4220i f = aVar.mo13163f();
        C4220i j = aVar.mo13166j();
        if (k.compareTo(j) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (j.compareTo(f) <= 0) {
            this.f11913f = (C4222j.f11905f * MaterialCalendar.m16015L1(context)) + (MaterialDatePicker.m16057V1(context) ? MaterialCalendar.m16015L1(context) : 0);
            this.f11910c = aVar;
            this.f11911d = dVar;
            this.f11912e = lVar;
            mo4776s(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: c */
    public int mo4760c() {
        return this.f11910c.mo13165i();
    }

    /* renamed from: d */
    public long mo4761d(int i) {
        return this.f11910c.mo13167k().mo13206T(i).mo13205S();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C4220i mo13232v(int i) {
        return this.f11910c.mo13167k().mo13206T(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public CharSequence mo13233w(int i) {
        return mo13232v(i).mo13204R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo13234x(C4220i iVar) {
        return this.f11910c.mo13167k().mo13207U(iVar);
    }

    /* renamed from: y */
    public void mo4767j(C4225b bVar, int i) {
        C4220i T = this.f11910c.mo13167k().mo13206T(i);
        bVar.f11916t.setText(T.mo13204R());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f11917u.findViewById(C9019f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !T.equals(materialCalendarGridView.getAdapter().f11906o)) {
            C4222j jVar = new C4222j(T, this.f11911d, this.f11910c);
            materialCalendarGridView.setNumColumns(T.f11902r);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C4224a(materialCalendarGridView));
    }

    /* renamed from: z */
    public C4225b mo4769l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C9021h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.m16057V1(viewGroup.getContext())) {
            return new C4225b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1347p(-1, this.f11913f));
        return new C4225b(linearLayout, true);
    }
}
