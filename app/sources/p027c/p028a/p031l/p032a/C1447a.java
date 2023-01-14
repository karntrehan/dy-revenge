package p027c.p028a.p031l.p032a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0247m0;
import androidx.core.content.p022d.C1163g;
import androidx.core.graphics.drawable.C1165b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p027c.p028a.p031l.p032a.C1455b;
import p027c.p028a.p031l.p032a.C1460d;
import p027c.p028a.p033m.C1463b;
import p027c.p060f.C1793d;
import p027c.p060f.C1802h;
import p027c.p101w.p102a.p103a.C2229b;
import p027c.p101w.p102a.p103a.C2239h;

@SuppressLint({"RestrictedAPI"})
/* renamed from: c.a.l.a.a */
public class C1447a extends C1460d implements C1165b {

    /* renamed from: B */
    private static final String f4464B = C1447a.class.getSimpleName();

    /* renamed from: C */
    private C1450c f4465C;

    /* renamed from: D */
    private C1454g f4466D;

    /* renamed from: E */
    private int f4467E;

    /* renamed from: F */
    private int f4468F;

    /* renamed from: G */
    private boolean f4469G;

    /* renamed from: c.a.l.a.a$b */
    private static class C1449b extends C1454g {

        /* renamed from: a */
        private final Animatable f4470a;

        C1449b(Animatable animatable) {
            super();
            this.f4470a = animatable;
        }

        /* renamed from: c */
        public void mo5356c() {
            this.f4470a.start();
        }

        /* renamed from: d */
        public void mo5357d() {
            this.f4470a.stop();
        }
    }

    /* renamed from: c.a.l.a.a$c */
    static class C1450c extends C1460d.C1461a {

        /* renamed from: K */
        C1793d<Long> f4471K;

        /* renamed from: L */
        C1802h<Integer> f4472L;

        C1450c(C1450c cVar, C1447a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C1802h<Integer> hVar;
            if (cVar != null) {
                this.f4471K = cVar.f4471K;
                hVar = cVar.f4472L;
            } else {
                this.f4471K = new C1793d<>();
                hVar = new C1802h<>();
            }
            this.f4472L = hVar;
        }

        /* renamed from: D */
        private static long m6464D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo5358B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo5441z(iArr, drawable);
            this.f4472L.mo6281m(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo5359C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo5386a(drawable);
            long D = m6464D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f4471K.mo6160c(D, Long.valueOf(j2 | j));
            if (z) {
                this.f4471K.mo6160c(m6464D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo5360E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f4472L.mo6277i(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo5361F(int[] iArr) {
            int A = super.mo5440A(iArr);
            return A >= 0 ? A : super.mo5440A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo5362G(int i, int i2) {
            return (int) this.f4471K.mo6166j(m6464D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo5363H(int i, int i2) {
            return (this.f4471K.mo6166j(m6464D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo5364I(int i, int i2) {
            return (this.f4471K.mo6166j(m6464D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C1447a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1447a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5367r() {
            this.f4471K = this.f4471K.clone();
            this.f4472L = this.f4472L.clone();
        }
    }

    /* renamed from: c.a.l.a.a$d */
    private static class C1451d extends C1454g {

        /* renamed from: a */
        private final C2229b f4473a;

        C1451d(C2229b bVar) {
            super();
            this.f4473a = bVar;
        }

        /* renamed from: c */
        public void mo5356c() {
            this.f4473a.start();
        }

        /* renamed from: d */
        public void mo5357d() {
            this.f4473a.stop();
        }
    }

    /* renamed from: c.a.l.a.a$e */
    private static class C1452e extends C1454g {

        /* renamed from: a */
        private final ObjectAnimator f4474a;

        /* renamed from: b */
        private final boolean f4475b;

        C1452e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1453f fVar = new C1453f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo5370a());
            ofInt.setInterpolator(fVar);
            this.f4475b = z2;
            this.f4474a = ofInt;
        }

        /* renamed from: a */
        public boolean mo5368a() {
            return this.f4475b;
        }

        /* renamed from: b */
        public void mo5369b() {
            this.f4474a.reverse();
        }

        /* renamed from: c */
        public void mo5356c() {
            this.f4474a.start();
        }

        /* renamed from: d */
        public void mo5357d() {
            this.f4474a.cancel();
        }
    }

    /* renamed from: c.a.l.a.a$f */
    private static class C1453f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f4476a;

        /* renamed from: b */
        private int f4477b;

        /* renamed from: c */
        private int f4478c;

        C1453f(AnimationDrawable animationDrawable, boolean z) {
            mo5371b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5370a() {
            return this.f4478c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5371b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f4477b = numberOfFrames;
            int[] iArr = this.f4476a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f4476a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f4476a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f4478c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f4478c)) + 0.5f);
            int i2 = this.f4477b;
            int[] iArr = this.f4476a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f4478c) : 0.0f);
        }
    }

    /* renamed from: c.a.l.a.a$g */
    private static abstract class C1454g {
        private C1454g() {
        }

        /* renamed from: a */
        public boolean mo5368a() {
            return false;
        }

        /* renamed from: b */
        public void mo5369b() {
        }

        /* renamed from: c */
        public abstract void mo5356c();

        /* renamed from: d */
        public abstract void mo5357d();
    }

    public C1447a() {
        this((C1450c) null, (Resources) null);
    }

    C1447a(C1450c cVar, Resources resources) {
        super((C1460d.C1461a) null);
        this.f4467E = -1;
        this.f4468F = -1;
        mo5336h(new C1450c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C1447a m6450m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1447a aVar = new C1447a();
            aVar.mo5344n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m6451o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m6453q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m6454r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m6452p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m6453q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C1463b.f4539h);
        int resourceId = k.getResourceId(C1463b.f4540i, 0);
        int resourceId2 = k.getResourceId(C1463b.f4541j, -1);
        Drawable j = resourceId2 > 0 ? C0247m0.m1250h().mo1514j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = mo5439k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("vector") ? C2239h.m9454c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j != null) {
            return this.f4465C.mo5358B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m6454r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C1463b.f4542k);
        int resourceId = k.getResourceId(C1463b.f4545n, -1);
        int resourceId2 = k.getResourceId(C1463b.f4544m, -1);
        int resourceId3 = k.getResourceId(C1463b.f4543l, -1);
        Drawable j = resourceId3 > 0 ? C0247m0.m1250h().mo1514j(context, resourceId3) : null;
        boolean z = k.getBoolean(C1463b.f4546o, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("animated-vector") ? C2229b.m9421a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f4465C.mo5359C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m6455s(int i) {
        int i2;
        int G;
        C1454g gVar;
        C1454g gVar2 = this.f4466D;
        if (gVar2 == null) {
            i2 = mo5374c();
        } else if (i == this.f4467E) {
            return true;
        } else {
            if (i != this.f4468F || !gVar2.mo5368a()) {
                i2 = this.f4467E;
                gVar2.mo5357d();
            } else {
                gVar2.mo5369b();
                this.f4467E = this.f4468F;
                this.f4468F = i;
                return true;
            }
        }
        this.f4466D = null;
        this.f4468F = -1;
        this.f4467E = -1;
        C1450c cVar = this.f4465C;
        int E = cVar.mo5360E(i2);
        int E2 = cVar.mo5360E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo5362G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo5364I(E, E2);
        mo5375g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C1452e((AnimationDrawable) current, cVar.mo5363H(E, E2), I);
        } else if (current instanceof C2229b) {
            gVar = new C1451d((C2229b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C1449b((Animatable) current);
            }
            return false;
        }
        gVar.mo5356c();
        this.f4466D = gVar;
        this.f4468F = i2;
        this.f4467E = i;
        return true;
    }

    /* renamed from: t */
    private void m6456t(TypedArray typedArray) {
        C1450c cVar = this.f4465C;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f4505d |= typedArray.getChangingConfigurations();
        }
        cVar.mo5408x(typedArray.getBoolean(C1463b.f4535d, cVar.f4510i));
        cVar.mo5404t(typedArray.getBoolean(C1463b.f4536e, cVar.f4513l));
        cVar.mo5405u(typedArray.getInt(C1463b.f4537f, cVar.f4493A));
        cVar.mo5406v(typedArray.getInt(C1463b.f4538g, cVar.f4494B));
        setDither(typedArray.getBoolean(C1463b.f4533b, cVar.f4525x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5336h(C1455b.C1458c cVar) {
        super.mo5336h(cVar);
        if (cVar instanceof C1450c) {
            this.f4465C = (C1450c) cVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C1454g gVar = this.f4466D;
        if (gVar != null) {
            gVar.mo5357d();
            this.f4466D = null;
            mo5375g(this.f4467E);
            this.f4467E = -1;
            this.f4468F = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1450c mo5340j() {
        return new C1450c(this.f4465C, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f4469G && super.mutate() == this) {
            this.f4465C.mo5367r();
            this.f4469G = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo5344n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C1463b.f4532a);
        setVisible(k.getBoolean(C1463b.f4534c, true), true);
        m6456t(k);
        mo5377i(resources);
        k.recycle();
        m6451o(context, resources, xmlPullParser, attributeSet, theme);
        m6452p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f4465C.mo5361F(iArr);
        boolean z = F != mo5374c() && (m6455s(F) || mo5375g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C1454g gVar = this.f4466D;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo5356c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
