package p027c.p064i.p072j.p073g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: c.i.j.g0.a */
public final class C1953a extends ClickableSpan {

    /* renamed from: f */
    private final int f5683f;

    /* renamed from: o */
    private final C1955c f5684o;

    /* renamed from: p */
    private final int f5685p;

    public C1953a(int i, C1955c cVar, int i2) {
        this.f5683f = i;
        this.f5684o = cVar;
        this.f5685p = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5683f);
        this.f5684o.mo6569Q(this.f5685p, bundle);
    }
}
