package p027c.p064i.p072j;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: c.i.j.o */
public class C1983o {

    /* renamed from: a */
    private int f5746a;

    /* renamed from: b */
    private int f5747b;

    public C1983o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo6657a() {
        return this.f5746a | this.f5747b;
    }

    /* renamed from: b */
    public void mo6658b(View view, View view2, int i) {
        mo6659c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo6659c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f5747b = i;
        } else {
            this.f5746a = i;
        }
    }

    /* renamed from: d */
    public void mo6660d(View view) {
        mo6661e(view, 0);
    }

    /* renamed from: e */
    public void mo6661e(View view, int i) {
        if (i == 1) {
            this.f5747b = 0;
        } else {
            this.f5746a = 0;
        }
    }
}
