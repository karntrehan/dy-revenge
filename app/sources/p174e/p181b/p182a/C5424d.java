package p174e.p181b.p182a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0256o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1988t;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.d */
public class C5424d extends C0256o {

    /* renamed from: p */
    private static final String f15152p = C5424d.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C5459i<Throwable> f15153q = new C5425a();

    /* renamed from: A */
    private boolean f15154A = false;

    /* renamed from: B */
    private boolean f15155B = false;

    /* renamed from: C */
    private boolean f15156C = false;

    /* renamed from: D */
    private boolean f15157D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f15158E = true;

    /* renamed from: F */
    private C5472r f15159F = C5472r.AUTOMATIC;

    /* renamed from: G */
    private final Set<C5461k> f15160G = new HashSet();

    /* renamed from: H */
    private int f15161H = 0;

    /* renamed from: I */
    private C5464n<C5433e> f15162I;

    /* renamed from: J */
    private C5433e f15163J;

    /* renamed from: r */
    private final C5459i<C5433e> f15164r = new C5426b();

    /* renamed from: s */
    private final C5459i<Throwable> f15165s = new C5427c();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C5459i<Throwable> f15166t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f15167u = 0;

    /* renamed from: v */
    private final C5442g f15168v = new C5442g();

    /* renamed from: w */
    private boolean f15169w;

    /* renamed from: x */
    private String f15170x;

    /* renamed from: y */
    private int f15171y;

    /* renamed from: z */
    private boolean f15172z = false;

    /* renamed from: e.b.a.d$a */
    class C5425a implements C5459i<Throwable> {
        C5425a() {
        }

        /* renamed from: b */
        public void mo16442a(Throwable th) {
            if (C5647h.m21076k(th)) {
                C5643d.m21028d("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: e.b.a.d$b */
    class C5426b implements C5459i<C5433e> {
        C5426b() {
        }

        /* renamed from: b */
        public void mo16442a(C5433e eVar) {
            C5424d.this.setComposition(eVar);
        }
    }

    /* renamed from: e.b.a.d$c */
    class C5427c implements C5459i<Throwable> {
        C5427c() {
        }

        /* renamed from: b */
        public void mo16442a(Throwable th) {
            if (C5424d.this.f15167u != 0) {
                C5424d dVar = C5424d.this;
                dVar.setImageResource(dVar.f15167u);
            }
            (C5424d.this.f15166t == null ? C5424d.f15153q : C5424d.this.f15166t).mo16442a(th);
        }
    }

    /* renamed from: e.b.a.d$d */
    class C5428d implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ int f15175a;

        C5428d(int i) {
            this.f15175a = i;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            return C5424d.this.f15158E ? C5434f.m20253o(C5424d.this.getContext(), this.f15175a) : C5434f.m20254p(C5424d.this.getContext(), this.f15175a, (String) null);
        }
    }

    /* renamed from: e.b.a.d$e */
    class C5429e implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ String f15177a;

        C5429e(String str) {
            this.f15177a = str;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            return C5424d.this.f15158E ? C5434f.m20244f(C5424d.this.getContext(), this.f15177a) : C5434f.m20245g(C5424d.this.getContext(), this.f15177a, (String) null);
        }
    }

    /* renamed from: e.b.a.d$f */
    static /* synthetic */ class C5430f {

        /* renamed from: a */
        static final /* synthetic */ int[] f15179a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.b.a.r[] r0 = p174e.p181b.p182a.C5472r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15179a = r0
                e.b.a.r r1 = p174e.p181b.p182a.C5472r.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15179a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.r r1 = p174e.p181b.p182a.C5472r.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15179a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.b.a.r r1 = p174e.p181b.p182a.C5472r.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.C5424d.C5430f.<clinit>():void");
        }
    }

    /* renamed from: e.b.a.d$g */
    private static class C5431g extends View.BaseSavedState {
        public static final Parcelable.Creator<C5431g> CREATOR = new C5432a();

        /* renamed from: f */
        String f15180f;

        /* renamed from: o */
        int f15181o;

        /* renamed from: p */
        float f15182p;

        /* renamed from: q */
        boolean f15183q;

        /* renamed from: r */
        String f15184r;

        /* renamed from: s */
        int f15185s;

        /* renamed from: t */
        int f15186t;

        /* renamed from: e.b.a.d$g$a */
        class C5432a implements Parcelable.Creator<C5431g> {
            C5432a() {
            }

            /* renamed from: a */
            public C5431g createFromParcel(Parcel parcel) {
                return new C5431g(parcel, (C5425a) null);
            }

            /* renamed from: b */
            public C5431g[] newArray(int i) {
                return new C5431g[i];
            }
        }

        private C5431g(Parcel parcel) {
            super(parcel);
            this.f15180f = parcel.readString();
            this.f15182p = parcel.readFloat();
            this.f15183q = parcel.readInt() != 1 ? false : true;
            this.f15184r = parcel.readString();
            this.f15185s = parcel.readInt();
            this.f15186t = parcel.readInt();
        }

        /* synthetic */ C5431g(Parcel parcel, C5425a aVar) {
            this(parcel);
        }

        C5431g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f15180f);
            parcel.writeFloat(this.f15182p);
            parcel.writeInt(this.f15183q ? 1 : 0);
            parcel.writeString(this.f15184r);
            parcel.writeInt(this.f15185s);
            parcel.writeInt(this.f15186t);
        }
    }

    public C5424d(Context context) {
        super(context);
        m20193p((AttributeSet) null, C5470p.lottieAnimationViewStyle);
    }

    /* renamed from: j */
    private void m20188j() {
        C5464n<C5433e> nVar = this.f15162I;
        if (nVar != null) {
            nVar.mo16578k(this.f15164r);
            this.f15162I.mo16577j(this.f15165s);
        }
    }

    /* renamed from: k */
    private void m20189k() {
        this.f15163J = null;
        this.f15168v.mo16536j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r3 != false) goto L_0x0046;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20190m() {
        /*
            r5 = this;
            int[] r0 = p174e.p181b.p182a.C5424d.C5430f.f15179a
            e.b.a.r r1 = r5.f15159F
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0046
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x0046
        L_0x0015:
            e.b.a.e r0 = r5.f15163J
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo16471q()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x0044
        L_0x0027:
            e.b.a.e r0 = r5.f15163J
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo16467m()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x0044
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            r4 = 24
            if (r0 == r4) goto L_0x0044
            r4 = 25
            if (r0 != r4) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            if (r3 == 0) goto L_0x0013
        L_0x0046:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0050
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.C5424d.m20190m():void");
    }

    /* renamed from: n */
    private C5464n<C5433e> m20191n(String str) {
        return isInEditMode() ? new C5464n<>(new C5429e(str), true) : this.f15158E ? C5434f.m20242d(getContext(), str) : C5434f.m20243e(getContext(), str, (String) null);
    }

    /* renamed from: o */
    private C5464n<C5433e> m20192o(int i) {
        return isInEditMode() ? new C5464n<>(new C5428d(i), true) : this.f15158E ? C5434f.m20251m(getContext(), i) : C5434f.m20252n(getContext(), i, (String) null);
    }

    /* renamed from: p */
    private void m20193p(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5471q.f15326C, i, 0);
        this.f15158E = obtainStyledAttributes.getBoolean(C5471q.f15328E, true);
        int i2 = C5471q.f15337N;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C5471q.f15332I;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C5471q.f15343T;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C5471q.f15331H, 0));
            if (obtainStyledAttributes.getBoolean(C5471q.f15327D, false)) {
                this.f15155B = true;
                this.f15157D = true;
            }
            if (obtainStyledAttributes.getBoolean(C5471q.f15335L, false)) {
                this.f15168v.mo16530h0(-1);
            }
            int i5 = C5471q.f15340Q;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C5471q.f15339P;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C5471q.f15342S;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C5471q.f15334K));
            setProgress(obtainStyledAttributes.getFloat(C5471q.f15336M, 0.0f));
            mo16396l(obtainStyledAttributes.getBoolean(C5471q.f15330G, false));
            int i8 = C5471q.f15329F;
            if (obtainStyledAttributes.hasValue(i8)) {
                C5473s sVar = new C5473s(C1445a.m6445c(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor());
                mo16393h(new C5528e("**"), C5462l.f15280E, new C5419c(sVar));
            }
            int i9 = C5471q.f15341R;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.f15168v.mo16538k0(obtainStyledAttributes.getFloat(i9, 1.0f));
            }
            int i10 = C5471q.f15338O;
            if (obtainStyledAttributes.hasValue(i10)) {
                C5472r rVar = C5472r.AUTOMATIC;
                int i11 = obtainStyledAttributes.getInt(i10, rVar.ordinal());
                if (i11 >= C5472r.values().length) {
                    i11 = rVar.ordinal();
                }
                setRenderMode(C5472r.values()[i11]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C5471q.f15333J, false));
            obtainStyledAttributes.recycle();
            C5442g gVar = this.f15168v;
            if (C5647h.m21071f(getContext()) != 0.0f) {
                z = true;
            }
            gVar.mo16540m0(Boolean.valueOf(z));
            m20190m();
            this.f15169w = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(C5464n<C5433e> nVar) {
        m20189k();
        m20188j();
        this.f15162I = nVar.mo16576f(this.f15164r).mo16575e(this.f15165s);
    }

    /* renamed from: x */
    private void m20194x() {
        boolean q = mo16402q();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f15168v);
        if (q) {
            this.f15168v.mo16503N();
        }
    }

    public void buildDrawingCache(boolean z) {
        C5422c.m20179a("buildDrawingCache");
        this.f15161H++;
        super.buildDrawingCache(z);
        if (this.f15161H == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(C5472r.HARDWARE);
        }
        this.f15161H--;
        C5422c.m20180b("buildDrawingCache");
    }

    /* renamed from: g */
    public void mo16380g(Animator.AnimatorListener animatorListener) {
        this.f15168v.mo16518c(animatorListener);
    }

    public C5433e getComposition() {
        return this.f15163J;
    }

    public long getDuration() {
        C5433e eVar = this.f15163J;
        if (eVar != null) {
            return (long) eVar.mo16458d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f15168v.mo16552t();
    }

    public String getImageAssetsFolder() {
        return this.f15168v.mo16555w();
    }

    public float getMaxFrame() {
        return this.f15168v.mo16556x();
    }

    public float getMinFrame() {
        return this.f15168v.mo16557z();
    }

    public C5467o getPerformanceTracker() {
        return this.f15168v.mo16490A();
    }

    public float getProgress() {
        return this.f15168v.mo16491B();
    }

    public int getRepeatCount() {
        return this.f15168v.mo16492C();
    }

    public int getRepeatMode() {
        return this.f15168v.mo16493D();
    }

    public float getScale() {
        return this.f15168v.mo16494E();
    }

    public float getSpeed() {
        return this.f15168v.mo16495F();
    }

    /* renamed from: h */
    public <T> void mo16393h(C5528e eVar, T t, C5419c<T> cVar) {
        this.f15168v.mo16520d(eVar, t, cVar);
    }

    /* renamed from: i */
    public void mo16394i() {
        this.f15155B = false;
        this.f15154A = false;
        this.f15172z = false;
        this.f15168v.mo16531i();
        m20190m();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C5442g gVar = this.f15168v;
        if (drawable2 == gVar) {
            super.invalidateDrawable(gVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: l */
    public void mo16396l(boolean z) {
        this.f15168v.mo16541n(z);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f15157D || this.f15155B)) {
            mo16404s();
            this.f15157D = false;
            this.f15155B = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo16402q()) {
            mo16394i();
            this.f15155B = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5431g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5431g gVar = (C5431g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        String str = gVar.f15180f;
        this.f15170x = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f15170x);
        }
        int i = gVar.f15181o;
        this.f15171y = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(gVar.f15182p);
        if (gVar.f15183q) {
            mo16404s();
        }
        this.f15168v.mo16511V(gVar.f15184r);
        setRepeatMode(gVar.f15185s);
        setRepeatCount(gVar.f15186t);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C5431g gVar = new C5431g(super.onSaveInstanceState());
        gVar.f15180f = this.f15170x;
        gVar.f15181o = this.f15171y;
        gVar.f15182p = this.f15168v.mo16491B();
        gVar.f15183q = this.f15168v.mo16498I() || (!C1988t.m8359Q(this) && this.f15155B);
        gVar.f15184r = this.f15168v.mo16555w();
        gVar.f15185s = this.f15168v.mo16493D();
        gVar.f15186t = this.f15168v.mo16492C();
        return gVar;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (this.f15169w) {
            if (isShown()) {
                if (this.f15154A) {
                    mo16436t();
                } else if (this.f15172z) {
                    mo16404s();
                }
                this.f15154A = false;
                this.f15172z = false;
            } else if (mo16402q()) {
                mo16403r();
                this.f15154A = true;
            }
        }
    }

    /* renamed from: q */
    public boolean mo16402q() {
        return this.f15168v.mo16498I();
    }

    /* renamed from: r */
    public void mo16403r() {
        this.f15157D = false;
        this.f15155B = false;
        this.f15154A = false;
        this.f15172z = false;
        this.f15168v.mo16500K();
        m20190m();
    }

    /* renamed from: s */
    public void mo16404s() {
        if (isShown()) {
            this.f15168v.mo16501L();
            m20190m();
            return;
        }
        this.f15172z = true;
    }

    public void setAnimation(int i) {
        this.f15171y = i;
        this.f15170x = null;
        setCompositionTask(m20192o(i));
    }

    public void setAnimation(String str) {
        this.f15170x = str;
        this.f15171y = 0;
        setCompositionTask(m20191n(str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo16440w(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f15158E ? C5434f.m20255q(getContext(), str) : C5434f.m20256r(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f15168v.mo16505P(z);
    }

    public void setCacheComposition(boolean z) {
        this.f15158E = z;
    }

    public void setComposition(C5433e eVar) {
        if (C5422c.f15141a) {
            String str = f15152p;
            Log.v(str, "Set Composition \n" + eVar);
        }
        this.f15168v.setCallback(this);
        this.f15163J = eVar;
        this.f15156C = true;
        boolean Q = this.f15168v.mo16506Q(eVar);
        this.f15156C = false;
        m20190m();
        if (getDrawable() != this.f15168v || Q) {
            if (!Q) {
                m20194x();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (C5461k a : this.f15160G) {
                a.mo16570a(eVar);
            }
        }
    }

    public void setFailureListener(C5459i<Throwable> iVar) {
        this.f15166t = iVar;
    }

    public void setFallbackResource(int i) {
        this.f15167u = i;
    }

    public void setFontAssetDelegate(C5416a aVar) {
        this.f15168v.mo16507R(aVar);
    }

    public void setFrame(int i) {
        this.f15168v.mo16508S(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f15168v.mo16509T(z);
    }

    public void setImageAssetDelegate(C5421b bVar) {
        this.f15168v.mo16510U(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f15168v.mo16511V(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m20188j();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m20188j();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        m20188j();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f15168v.mo16512W(i);
    }

    public void setMaxFrame(String str) {
        this.f15168v.mo16513X(str);
    }

    public void setMaxProgress(float f) {
        this.f15168v.mo16514Y(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f15168v.mo16516a0(str);
    }

    public void setMinFrame(int i) {
        this.f15168v.mo16517b0(i);
    }

    public void setMinFrame(String str) {
        this.f15168v.mo16519c0(str);
    }

    public void setMinProgress(float f) {
        this.f15168v.mo16521d0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f15168v.mo16523e0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f15168v.mo16524f0(z);
    }

    public void setProgress(float f) {
        this.f15168v.mo16525g0(f);
    }

    public void setRenderMode(C5472r rVar) {
        this.f15159F = rVar;
        m20190m();
    }

    public void setRepeatCount(int i) {
        this.f15168v.mo16530h0(i);
    }

    public void setRepeatMode(int i) {
        this.f15168v.mo16532i0(i);
    }

    public void setSafeMode(boolean z) {
        this.f15168v.mo16537j0(z);
    }

    public void setScale(float f) {
        this.f15168v.mo16538k0(f);
        if (getDrawable() == this.f15168v) {
            m20194x();
        }
    }

    public void setSpeed(float f) {
        this.f15168v.mo16539l0(f);
    }

    public void setTextDelegate(C5474t tVar) {
        this.f15168v.mo16542n0(tVar);
    }

    /* renamed from: t */
    public void mo16436t() {
        if (isShown()) {
            this.f15168v.mo16503N();
            m20190m();
            return;
        }
        this.f15172z = false;
        this.f15154A = true;
    }

    /* renamed from: u */
    public void mo16437u() {
        this.f15168v.mo16504O();
    }

    public void unscheduleDrawable(Drawable drawable) {
        C5442g gVar;
        if (!this.f15156C && drawable == (gVar = this.f15168v) && gVar.mo16498I()) {
            mo16403r();
        } else if (!this.f15156C && (drawable instanceof C5442g)) {
            C5442g gVar2 = (C5442g) drawable;
            if (gVar2.mo16498I()) {
                gVar2.mo16500K();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: v */
    public void mo16439v(InputStream inputStream, String str) {
        setCompositionTask(C5434f.m20246h(inputStream, str));
    }

    /* renamed from: w */
    public void mo16440w(String str, String str2) {
        mo16439v(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* renamed from: y */
    public void mo16441y(int i, int i2) {
        this.f15168v.mo16515Z(i, i2);
    }
}
