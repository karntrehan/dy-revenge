package p027c.p101w.p102a.p103a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p022d.C1163g;
import androidx.core.graphics.drawable.C1164a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p027c.p060f.C1788a;

/* renamed from: c.w.a.a.b */
public class C2229b extends C2238g implements Animatable {

    /* renamed from: o */
    private C2231b f6508o;

    /* renamed from: p */
    private Context f6509p;

    /* renamed from: q */
    private ArgbEvaluator f6510q;

    /* renamed from: r */
    private Animator.AnimatorListener f6511r;

    /* renamed from: s */
    ArrayList<?> f6512s;

    /* renamed from: t */
    final Drawable.Callback f6513t;

    /* renamed from: c.w.a.a.b$a */
    class C2230a implements Drawable.Callback {
        C2230a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C2229b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C2229b.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C2229b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: c.w.a.a.b$b */
    private static class C2231b extends Drawable.ConstantState {

        /* renamed from: a */
        int f6515a;

        /* renamed from: b */
        C2239h f6516b;

        /* renamed from: c */
        AnimatorSet f6517c;

        /* renamed from: d */
        ArrayList<Animator> f6518d;

        /* renamed from: e */
        C1788a<Animator, String> f6519e;

        public C2231b(Context context, C2231b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f6515a = bVar.f6515a;
                C2239h hVar = bVar.f6516b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f6516b = (C2239h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C2239h hVar2 = (C2239h) this.f6516b.mutate();
                    this.f6516b = hVar2;
                    hVar2.setCallback(callback);
                    this.f6516b.setBounds(bVar.f6516b.getBounds());
                    this.f6516b.mo7471h(false);
                }
                ArrayList<Animator> arrayList = bVar.f6518d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6518d = new ArrayList<>(size);
                    this.f6519e = new C1788a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f6518d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f6519e.get(animator);
                        clone.setTarget(this.f6516b.mo7462d(str));
                        this.f6518d.add(clone);
                        this.f6519e.put(clone, str);
                    }
                    mo7448a();
                }
            }
        }

        /* renamed from: a */
        public void mo7448a() {
            if (this.f6517c == null) {
                this.f6517c = new AnimatorSet();
            }
            this.f6517c.playTogether(this.f6518d);
        }

        public int getChangingConfigurations() {
            return this.f6515a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: c.w.a.a.b$c */
    private static class C2232c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f6520a;

        public C2232c(Drawable.ConstantState constantState) {
            this.f6520a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f6520a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f6520a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C2229b bVar = new C2229b();
            Drawable newDrawable = this.f6520a.newDrawable();
            bVar.f6525f = newDrawable;
            newDrawable.setCallback(bVar.f6513t);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            C2229b bVar = new C2229b();
            Drawable newDrawable = this.f6520a.newDrawable(resources);
            bVar.f6525f = newDrawable;
            newDrawable.setCallback(bVar.f6513t);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2229b bVar = new C2229b();
            Drawable newDrawable = this.f6520a.newDrawable(resources, theme);
            bVar.f6525f = newDrawable;
            newDrawable.setCallback(bVar.f6513t);
            return bVar;
        }
    }

    C2229b() {
        this((Context) null, (C2231b) null, (Resources) null);
    }

    private C2229b(Context context) {
        this(context, (C2231b) null, (Resources) null);
    }

    private C2229b(Context context, C2231b bVar, Resources resources) {
        this.f6510q = null;
        this.f6511r = null;
        this.f6512s = null;
        C2230a aVar = new C2230a();
        this.f6513t = aVar;
        this.f6509p = context;
        if (bVar != null) {
            this.f6508o = bVar;
        } else {
            this.f6508o = new C2231b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static C2229b m9421a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2229b bVar = new C2229b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    /* renamed from: b */
    private void m9422b(String str, Animator animator) {
        animator.setTarget(this.f6508o.f6516b.mo7462d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m9423c(animator);
        }
        C2231b bVar = this.f6508o;
        if (bVar.f6518d == null) {
            bVar.f6518d = new ArrayList<>();
            this.f6508o.f6519e = new C1788a<>();
        }
        this.f6508o.f6518d.add(animator);
        this.f6508o.f6519e.put(animator, str);
    }

    /* renamed from: c */
    private void m9423c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m9423c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f6510q == null) {
                    this.f6510q = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f6510q);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4537a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            return C1164a.m4538b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6508o.f6516b.draw(canvas);
        if (this.f6508o.f6517c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f6525f;
        return drawable != null ? C1164a.m4540d(drawable) : this.f6508o.f6516b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6508o.f6515a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6525f;
        return drawable != null ? C1164a.m4541e(drawable) : this.f6508o.f6516b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f6525f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C2232c(this.f6525f.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6508o.f6516b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6508o.f6516b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getOpacity() : this.f6508o.f6516b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4543g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C1163g.m4519k(resources, theme, attributeSet, C2228a.f6500e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2239h b = C2239h.m9453b(resources, resourceId, theme);
                        b.mo7471h(false);
                        b.setCallback(this.f6513t);
                        C2239h hVar = this.f6508o.f6516b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f6508o.f6516b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C2228a.f6501f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6509p;
                        if (context != null) {
                            m9422b(string, C2234d.m9435i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f6508o.mo7448a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f6525f;
        return drawable != null ? C1164a.m4544h(drawable) : this.f6508o.f6516b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f6525f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6508o.f6517c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.isStateful() : this.f6508o.f6516b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6508o.f6516b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.setLevel(i) : this.f6508o.f6516b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.setState(iArr) : this.f6508o.f6516b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f6508o.f6516b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4546j(drawable, z);
        } else {
            this.f6508o.f6516b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6508o.f6516b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4550n(drawable, i);
        } else {
            this.f6508o.f6516b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4551o(drawable, colorStateList);
        } else {
            this.f6508o.f6516b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4552p(drawable, mode);
        } else {
            this.f6508o.f6516b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f6508o.f6516b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f6508o.f6517c.isStarted()) {
            this.f6508o.f6517c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6508o.f6517c.end();
        }
    }
}
