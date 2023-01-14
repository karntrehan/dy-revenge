package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p174e.p319f.p320a.p363d.p379x.C9063d;
import p174e.p319f.p320a.p363d.p379x.C9067f;

/* renamed from: com.google.android.material.internal.f */
public class C4270f {

    /* renamed from: a */
    private final TextPaint f12110a = new TextPaint(1);

    /* renamed from: b */
    private final C9067f f12111b = new C4271a();

    /* renamed from: c */
    private float f12112c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12113d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C4272b> f12114e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C9063d f12115f;

    /* renamed from: com.google.android.material.internal.f$a */
    class C4271a extends C9067f {
        C4271a() {
        }

        /* renamed from: a */
        public void mo12978a(int i) {
            boolean unused = C4270f.this.f12113d = true;
            C4272b bVar = (C4272b) C4270f.this.f12114e.get();
            if (bVar != null) {
                bVar.mo13066a();
            }
        }

        /* renamed from: b */
        public void mo12979b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C4270f.this.f12113d = true;
                C4272b bVar = (C4272b) C4270f.this.f12114e.get();
                if (bVar != null) {
                    bVar.mo13066a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    public interface C4272b {
        /* renamed from: a */
        void mo13066a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C4270f(C4272b bVar) {
        mo13508g(bVar);
    }

    /* renamed from: c */
    private float m16408c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f12110a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C9063d mo13505d() {
        return this.f12115f;
    }

    /* renamed from: e */
    public TextPaint mo13506e() {
        return this.f12110a;
    }

    /* renamed from: f */
    public float mo13507f(String str) {
        if (!this.f12113d) {
            return this.f12112c;
        }
        float c = m16408c(str);
        this.f12112c = c;
        this.f12113d = false;
        return c;
    }

    /* renamed from: g */
    public void mo13508g(C4272b bVar) {
        this.f12114e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo13509h(C9063d dVar, Context context) {
        if (this.f12115f != dVar) {
            this.f12115f = dVar;
            if (dVar != null) {
                dVar.mo23017j(context, this.f12110a, this.f12111b);
                C4272b bVar = (C4272b) this.f12114e.get();
                if (bVar != null) {
                    this.f12110a.drawableState = bVar.getState();
                }
                dVar.mo23016i(context, this.f12110a, this.f12111b);
                this.f12113d = true;
            }
            C4272b bVar2 = (C4272b) this.f12114e.get();
            if (bVar2 != null) {
                bVar2.mo13066a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo13510i(boolean z) {
        this.f12113d = z;
    }

    /* renamed from: j */
    public void mo13511j(Context context) {
        this.f12115f.mo23016i(context, this.f12110a, this.f12111b);
    }
}
