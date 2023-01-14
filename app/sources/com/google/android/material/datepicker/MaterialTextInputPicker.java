package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class MaterialTextInputPicker<S> extends C4227m<S> {

    /* renamed from: l0 */
    private C4214d<S> f11864l0;

    /* renamed from: m0 */
    private C4208a f11865m0;

    /* renamed from: com.google.android.material.datepicker.MaterialTextInputPicker$a */
    class C4207a implements C4226l<S> {
        C4207a() {
        }

        /* renamed from: a */
        public void mo13158a(S s) {
            Iterator it = MaterialTextInputPicker.this.f11918k0.iterator();
            while (it.hasNext()) {
                ((C4226l) it.next()).mo13158a(s);
            }
        }
    }

    /* renamed from: y1 */
    static <T> MaterialTextInputPicker<T> m16071y1(C4214d<T> dVar, C4208a aVar) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        materialTextInputPicker.mo3917n1(bundle);
        return materialTextInputPicker;
    }

    /* renamed from: D0 */
    public void mo3818D0(Bundle bundle) {
        super.mo3818D0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f11864l0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11865m0);
    }

    /* renamed from: h0 */
    public void mo3825h0(Bundle bundle) {
        super.mo3825h0(bundle);
        if (bundle == null) {
            bundle = mo3925q();
        }
        this.f11864l0 = (C4214d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f11865m0 = (C4208a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f11864l0.mo13186v(layoutInflater, viewGroup, bundle, this.f11865m0, new C4207a());
    }
}
