package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;
import p174e.p319f.p320a.p363d.C9021h;
import p174e.p319f.p320a.p363d.C9022i;

/* renamed from: com.google.android.material.datepicker.p */
class C4231p extends RecyclerView.C1331g<C4233b> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaterialCalendar<?> f11920c;

    /* renamed from: com.google.android.material.datepicker.p$a */
    class C4232a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f11921f;

        C4232a(int i) {
            this.f11921f = i;
        }

        public void onClick(View view) {
            C4231p.this.f11920c.mo13137P1(C4220i.m16114N(this.f11921f, C4231p.this.f11920c.mo13134J1().f11900p));
            C4231p.this.f11920c.mo13138Q1(MaterialCalendar.C4200k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.p$b */
    public static class C4233b extends RecyclerView.C1328d0 {

        /* renamed from: t */
        final TextView f11923t;

        C4233b(TextView textView) {
            super(textView);
            this.f11923t = textView;
        }
    }

    C4231p(MaterialCalendar<?> materialCalendar) {
        this.f11920c = materialCalendar;
    }

    /* renamed from: v */
    private View.OnClickListener m16167v(int i) {
        return new C4232a(i);
    }

    /* renamed from: c */
    public int mo4760c() {
        return this.f11920c.mo13132H1().mo13168l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public int mo13240w(int i) {
        return i - this.f11920c.mo13132H1().mo13167k().f11901q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo13241x(int i) {
        return this.f11920c.mo13132H1().mo13167k().f11901q + i;
    }

    /* renamed from: y */
    public void mo4767j(C4233b bVar, int i) {
        int x = mo13241x(i);
        String string = bVar.f11923t.getContext().getString(C9022i.mtrl_picker_navigate_to_year_description);
        bVar.f11923t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(x)}));
        bVar.f11923t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(x)}));
        C4213c I1 = this.f11920c.mo13133I1();
        Calendar i2 = C4230o.m16159i();
        C4212b bVar2 = i2.get(1) == x ? I1.f11890f : I1.f11888d;
        for (Long longValue : this.f11920c.mo13135K1().mo13181D()) {
            i2.setTimeInMillis(longValue.longValue());
            if (i2.get(1) == x) {
                bVar2 = I1.f11889e;
            }
        }
        bVar2.mo13179d(bVar.f11923t);
        bVar.f11923t.setOnClickListener(m16167v(x));
    }

    /* renamed from: z */
    public C4233b mo4769l(ViewGroup viewGroup, int i) {
        return new C4233b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C9021h.mtrl_calendar_year, viewGroup, false));
    }
}
