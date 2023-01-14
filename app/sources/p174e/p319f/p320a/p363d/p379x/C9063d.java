package p174e.p319f.p320a.p363d.p379x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p022d.C1154f;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.f.a.d.x.d */
public class C9063d {

    /* renamed from: a */
    public final float f24881a;

    /* renamed from: b */
    public final ColorStateList f24882b;

    /* renamed from: c */
    public final ColorStateList f24883c;

    /* renamed from: d */
    public final ColorStateList f24884d;

    /* renamed from: e */
    public final int f24885e;

    /* renamed from: f */
    public final int f24886f;

    /* renamed from: g */
    public final String f24887g;

    /* renamed from: h */
    public final boolean f24888h;

    /* renamed from: i */
    public final ColorStateList f24889i;

    /* renamed from: j */
    public final float f24890j;

    /* renamed from: k */
    public final float f24891k;

    /* renamed from: l */
    public final float f24892l;

    /* renamed from: m */
    private final int f24893m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f24894n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Typeface f24895o;

    /* renamed from: e.f.a.d.x.d$a */
    class C9064a extends C1154f.C1157c {

        /* renamed from: a */
        final /* synthetic */ C9067f f24896a;

        C9064a(C9067f fVar) {
            this.f24896a = fVar;
        }

        /* renamed from: d */
        public void mo1826d(int i) {
            boolean unused = C9063d.this.f24894n = true;
            this.f24896a.mo12978a(i);
        }

        /* renamed from: e */
        public void mo1827e(Typeface typeface) {
            C9063d dVar = C9063d.this;
            Typeface unused = dVar.f24895o = Typeface.create(typeface, dVar.f24885e);
            boolean unused2 = C9063d.this.f24894n = true;
            this.f24896a.mo12979b(C9063d.this.f24895o, false);
        }
    }

    /* renamed from: e.f.a.d.x.d$b */
    class C9065b extends C9067f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f24898a;

        /* renamed from: b */
        final /* synthetic */ C9067f f24899b;

        C9065b(TextPaint textPaint, C9067f fVar) {
            this.f24898a = textPaint;
            this.f24899b = fVar;
        }

        /* renamed from: a */
        public void mo12978a(int i) {
            this.f24899b.mo12978a(i);
        }

        /* renamed from: b */
        public void mo12979b(Typeface typeface, boolean z) {
            C9063d.this.mo23018k(this.f24898a, typeface);
            this.f24899b.mo12979b(typeface, z);
        }
    }

    public C9063d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9024k.f24709h3);
        this.f24881a = obtainStyledAttributes.getDimension(C9024k.f24715i3, 0.0f);
        this.f24882b = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24733l3);
        this.f24883c = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24739m3);
        this.f24884d = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24745n3);
        this.f24885e = obtainStyledAttributes.getInt(C9024k.f24727k3, 0);
        this.f24886f = obtainStyledAttributes.getInt(C9024k.f24721j3, 1);
        int e = C9062c.m30201e(obtainStyledAttributes, C9024k.f24781t3, C9024k.f24775s3);
        this.f24893m = obtainStyledAttributes.getResourceId(e, 0);
        this.f24887g = obtainStyledAttributes.getString(e);
        this.f24888h = obtainStyledAttributes.getBoolean(C9024k.f24787u3, false);
        this.f24889i = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24751o3);
        this.f24890j = obtainStyledAttributes.getFloat(C9024k.f24757p3, 0.0f);
        this.f24891k = obtainStyledAttributes.getFloat(C9024k.f24763q3, 0.0f);
        this.f24892l = obtainStyledAttributes.getFloat(C9024k.f24769r3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m30206d() {
        String str;
        if (this.f24895o == null && (str = this.f24887g) != null) {
            this.f24895o = Typeface.create(str, this.f24885e);
        }
        if (this.f24895o == null) {
            int i = this.f24886f;
            this.f24895o = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f24895o = Typeface.create(this.f24895o, this.f24885e);
        }
    }

    /* renamed from: e */
    public Typeface mo23012e() {
        m30206d();
        return this.f24895o;
    }

    /* renamed from: f */
    public Typeface mo23013f(Context context) {
        if (this.f24894n) {
            return this.f24895o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface f = C1154f.m4493f(context, this.f24893m);
                this.f24895o = f;
                if (f != null) {
                    this.f24895o = Typeface.create(f, this.f24885e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f24887g, e);
            }
        }
        m30206d();
        this.f24894n = true;
        return this.f24895o;
    }

    /* renamed from: g */
    public void mo23014g(Context context, TextPaint textPaint, C9067f fVar) {
        mo23018k(textPaint, mo23012e());
        mo23015h(context, new C9065b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo23015h(Context context, C9067f fVar) {
        if (C9066e.m30218a()) {
            mo23013f(context);
        } else {
            m30206d();
        }
        int i = this.f24893m;
        if (i == 0) {
            this.f24894n = true;
        }
        if (this.f24894n) {
            fVar.mo12979b(this.f24895o, true);
            return;
        }
        try {
            C1154f.m4495h(context, i, new C9064a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f24894n = true;
            fVar.mo12978a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f24887g, e);
            this.f24894n = true;
            fVar.mo12978a(-3);
        }
    }

    /* renamed from: i */
    public void mo23016i(Context context, TextPaint textPaint, C9067f fVar) {
        mo23017j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f24882b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f24892l;
        float f2 = this.f24890j;
        float f3 = this.f24891k;
        ColorStateList colorStateList2 = this.f24889i;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void mo23017j(Context context, TextPaint textPaint, C9067f fVar) {
        if (C9066e.m30218a()) {
            mo23018k(textPaint, mo23013f(context));
        } else {
            mo23014g(context, textPaint, fVar);
        }
    }

    /* renamed from: k */
    public void mo23018k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f24885e;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f24881a);
    }
}
