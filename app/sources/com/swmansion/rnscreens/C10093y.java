package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2945d;
import com.swmansion.rnscreens.C10084w;
import com.swmansion.rnscreens.p442f0.C10065h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p455g.p470y.p472d.C10443a0;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.y */
public final class C10093y extends C10091x<ScreenStackFragment> {

    /* renamed from: u */
    public static final C10094a f26892u = new C10094a((C10452g) null);

    /* renamed from: A */
    private boolean f26893A;

    /* renamed from: B */
    private boolean f26894B;

    /* renamed from: C */
    private boolean f26895C;

    /* renamed from: D */
    private int f26896D;

    /* renamed from: E */
    private boolean f26897E;

    /* renamed from: v */
    private final ArrayList<ScreenStackFragment> f26898v = new ArrayList<>();

    /* renamed from: w */
    private final Set<ScreenStackFragment> f26899w = new HashSet();

    /* renamed from: x */
    private final List<C10095b> f26900x = new ArrayList();

    /* renamed from: y */
    private List<C10095b> f26901y = new ArrayList();

    /* renamed from: z */
    private ScreenStackFragment f26902z;

    /* renamed from: com.swmansion.rnscreens.y$a */
    public static final class C10094a {
        private C10094a() {
        }

        public /* synthetic */ C10094a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m34171c(ScreenStackFragment screenStackFragment) {
            return screenStackFragment.mo24892I1().getStackPresentation() == C10084w.C10088d.TRANSPARENT_MODAL;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m34172d(ScreenStackFragment screenStackFragment) {
            return screenStackFragment.mo24892I1().getStackAnimation() == C10084w.C10087c.SLIDE_FROM_BOTTOM || screenStackFragment.mo24892I1().getStackAnimation() == C10084w.C10087c.FADE_FROM_BOTTOM;
        }
    }

    /* renamed from: com.swmansion.rnscreens.y$b */
    private final class C10095b {

        /* renamed from: a */
        private Canvas f26903a;

        /* renamed from: b */
        private View f26904b;

        /* renamed from: c */
        private long f26905c;

        public C10095b() {
        }

        /* renamed from: a */
        public final void mo25120a() {
            C10093y.this.m34156F(this);
            this.f26903a = null;
            this.f26904b = null;
            this.f26905c = 0;
        }

        /* renamed from: b */
        public final Canvas mo25121b() {
            return this.f26903a;
        }

        /* renamed from: c */
        public final View mo25122c() {
            return this.f26904b;
        }

        /* renamed from: d */
        public final long mo25123d() {
            return this.f26905c;
        }

        /* renamed from: e */
        public final C10095b mo25124e(Canvas canvas, View view, long j) {
            this.f26903a = canvas;
            this.f26904b = view;
            this.f26905c = j;
            return this;
        }
    }

    /* renamed from: com.swmansion.rnscreens.y$c */
    public /* synthetic */ class C10096c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26907a;

        static {
            int[] iArr = new int[C10084w.C10087c.values().length];
            iArr[C10084w.C10087c.DEFAULT.ordinal()] = 1;
            iArr[C10084w.C10087c.NONE.ordinal()] = 2;
            iArr[C10084w.C10087c.FADE.ordinal()] = 3;
            iArr[C10084w.C10087c.SLIDE_FROM_RIGHT.ordinal()] = 4;
            iArr[C10084w.C10087c.SLIDE_FROM_LEFT.ordinal()] = 5;
            iArr[C10084w.C10087c.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            iArr[C10084w.C10087c.FADE_FROM_BOTTOM.ordinal()] = 7;
            f26907a = iArr;
        }
    }

    public C10093y(Context context) {
        super(context);
    }

    /* renamed from: A */
    private final void m34152A() {
        List<C10095b> list = this.f26901y;
        this.f26901y = new ArrayList();
        for (C10095b next : list) {
            next.mo25120a();
            this.f26900x.add(next);
        }
    }

    /* renamed from: C */
    private final C10095b m34154C() {
        if (this.f26900x.isEmpty()) {
            return new C10095b();
        }
        List<C10095b> list = this.f26900x;
        return list.remove(list.size() - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final void m34155D(ScreenStackFragment screenStackFragment) {
        C10084w I1;
        if (screenStackFragment != null && (I1 = screenStackFragment.mo24892I1()) != null) {
            I1.bringToFront();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m34156F(C10095b bVar) {
        super.drawChild(bVar.mo25121b(), bVar.mo25122c(), bVar.mo25123d());
    }

    /* renamed from: G */
    private final void m34157G(ScreenStackFragment screenStackFragment) {
        ScreenStackFragment screenStackFragment2;
        if (this.f26884f.size() > 1 && screenStackFragment != null && (screenStackFragment2 = this.f26902z) != null && f26892u.m34171c(screenStackFragment2)) {
            ArrayList<T> arrayList = this.f26884f;
            for (T t : C10356r.m35152u(C10358t.m35168O(arrayList, C10247f.m34833i(0, arrayList.size() - 1)))) {
                t.mo24892I1().mo25052a(4);
                if (C10457l.m35316a(t, screenStackFragment)) {
                    break;
                }
            }
        }
        C10084w topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.mo25052a(0);
        }
    }

    /* renamed from: z */
    private final void m34159z() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        C2945d b = C3051u0.m12085b((ReactContext) context, getId());
        if (b != null) {
            b.mo9651c(new C10065h(getId()));
        }
    }

    /* renamed from: E */
    public final void mo25110E() {
        if (!this.f26893A) {
            m34159z();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C10457l.m35320e(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f26901y.size() < this.f26896D) {
            this.f26895C = false;
        }
        this.f26896D = this.f26901y.size();
        if (this.f26895C && this.f26901y.size() >= 2) {
            List<C10095b> list = this.f26901y;
            Collections.swap(list, list.size() - 1, this.f26901y.size() - 2);
        }
        m34152A();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C10457l.m35320e(canvas, "canvas");
        C10457l.m35320e(view, "child");
        this.f26901y.add(m34154C().mo25124e(canvas, view, j));
        return true;
    }

    public void endViewTransition(View view) {
        C10457l.m35320e(view, "view");
        super.endViewTransition(view);
        if (this.f26893A) {
            this.f26893A = false;
            m34159z();
        }
    }

    public final boolean getGoingForward() {
        return this.f26897E;
    }

    public final C10084w getRootScreen() {
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            C10084w i2 = mo25095i(i);
            if (!C10358t.m35177y(this.f26899w, i2.getFragment())) {
                return i2;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    public C10084w getTopScreen() {
        ScreenStackFragment screenStackFragment = this.f26902z;
        if (screenStackFragment != null) {
            return screenStackFragment.mo24892I1();
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo25096j(ScreenFragment screenFragment) {
        return super.mo25096j(screenFragment) && !C10358t.m35177y(this.f26899w, screenFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo25098m() {
        for (ScreenStackFragment K1 : this.f26898v) {
            K1.mo24893K1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e4, code lost:
        r2 = com.swmansion.rnscreens.C10081t.rns_slide_in_from_left;
        r7 = com.swmansion.rnscreens.C10081t.rns_slide_out_to_right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e9, code lost:
        r2 = com.swmansion.rnscreens.C10081t.rns_fade_in;
        r7 = com.swmansion.rnscreens.C10081t.rns_fade_out;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ee, code lost:
        r2 = com.swmansion.rnscreens.C10081t.rns_no_animation_20;
        r6.mo4251q(r2, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25103p() {
        /*
            r8 = this;
            r0 = 0
            r8.f26894B = r0
            java.util.ArrayList<T> r1 = r8.f26884f
            int r1 = r1.size()
            int r1 = r1 + -1
            r2 = 0
            r3 = r2
            r4 = r3
            if (r1 < 0) goto L_0x003a
        L_0x0010:
            int r5 = r1 + -1
            java.util.ArrayList<T> r6 = r8.f26884f
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r6 = "mScreenFragments[i]"
            p455g.p470y.p472d.C10457l.m35319d(r1, r6)
            com.swmansion.rnscreens.ScreenStackFragment r1 = (com.swmansion.rnscreens.ScreenStackFragment) r1
            java.util.Set<com.swmansion.rnscreens.ScreenStackFragment> r6 = r8.f26899w
            boolean r6 = r6.contains(r1)
            if (r6 != 0) goto L_0x0035
            if (r3 != 0) goto L_0x002b
            r3 = r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            com.swmansion.rnscreens.y$a r6 = f26892u
            boolean r1 = r6.m34171c(r1)
            if (r1 != 0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            if (r5 >= 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r1 = r5
            goto L_0x0010
        L_0x003a:
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r1 = r8.f26898v
            boolean r1 = p455g.p460t.C10358t.m35177y(r1, r3)
            r5 = 1
            if (r1 != 0) goto L_0x0090
            com.swmansion.rnscreens.ScreenStackFragment r1 = r8.f26902z
            if (r1 == 0) goto L_0x0087
            if (r3 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0055
            java.util.ArrayList<T> r6 = r8.f26884f
            boolean r1 = r6.contains(r1)
            if (r1 != r5) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            com.swmansion.rnscreens.w r6 = r3.mo24892I1()
            com.swmansion.rnscreens.w$b r6 = r6.getReplaceAnimation()
            com.swmansion.rnscreens.w$b r7 = com.swmansion.rnscreens.C10084w.C10086b.PUSH
            if (r6 != r7) goto L_0x0064
            r6 = 1
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r1 != 0) goto L_0x006c
            if (r6 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r1 = 0
            goto L_0x006d
        L_0x006c:
            r1 = 1
        L_0x006d:
            if (r1 == 0) goto L_0x0078
            com.swmansion.rnscreens.w r2 = r3.mo24892I1()
            com.swmansion.rnscreens.w$c r2 = r2.getStackAnimation()
            goto L_0x00ac
        L_0x0078:
            com.swmansion.rnscreens.ScreenStackFragment r6 = r8.f26902z
            if (r6 == 0) goto L_0x00ac
            com.swmansion.rnscreens.w r6 = r6.mo24892I1()
            if (r6 == 0) goto L_0x00ac
            com.swmansion.rnscreens.w$c r2 = r6.getStackAnimation()
            goto L_0x00ac
        L_0x0087:
            if (r1 != 0) goto L_0x00ab
            if (r3 == 0) goto L_0x00ab
            com.swmansion.rnscreens.w$c r2 = com.swmansion.rnscreens.C10084w.C10087c.NONE
            r8.f26897E = r5
            goto L_0x00ab
        L_0x0090:
            com.swmansion.rnscreens.ScreenStackFragment r1 = r8.f26902z
            if (r1 == 0) goto L_0x00ab
            boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r3)
            if (r1 != 0) goto L_0x00ab
            com.swmansion.rnscreens.ScreenStackFragment r1 = r8.f26902z
            if (r1 == 0) goto L_0x00a9
            com.swmansion.rnscreens.w r1 = r1.mo24892I1()
            if (r1 == 0) goto L_0x00a9
            com.swmansion.rnscreens.w$c r1 = r1.getStackAnimation()
            r2 = r1
        L_0x00a9:
            r1 = 0
            goto L_0x00ac
        L_0x00ab:
            r1 = 1
        L_0x00ac:
            androidx.fragment.app.s r6 = r8.mo25092e()
            if (r2 == 0) goto L_0x00fb
            int[] r7 = com.swmansion.rnscreens.C10093y.C10096c.f26907a
            int r2 = r2.ordinal()
            if (r1 == 0) goto L_0x00cf
            r2 = r7[r2]
            switch(r2) {
                case 1: goto L_0x00ca;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00df;
                case 5: goto L_0x00e4;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x00fb
        L_0x00c0:
            int r2 = com.swmansion.rnscreens.C10081t.rns_fade_from_bottom
            int r7 = com.swmansion.rnscreens.C10081t.rns_no_animation_350
            goto L_0x00f8
        L_0x00c5:
            int r2 = com.swmansion.rnscreens.C10081t.rns_slide_in_from_bottom
            int r7 = com.swmansion.rnscreens.C10081t.rns_no_animation_medium
            goto L_0x00f8
        L_0x00ca:
            int r2 = com.swmansion.rnscreens.C10081t.rns_default_enter_in
            int r7 = com.swmansion.rnscreens.C10081t.rns_default_enter_out
            goto L_0x00f8
        L_0x00cf:
            r2 = r7[r2]
            switch(r2) {
                case 1: goto L_0x00f4;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00df;
                case 6: goto L_0x00da;
                case 7: goto L_0x00d5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x00fb
        L_0x00d5:
            int r2 = com.swmansion.rnscreens.C10081t.rns_no_animation_250
            int r7 = com.swmansion.rnscreens.C10081t.rns_fade_to_bottom
            goto L_0x00f8
        L_0x00da:
            int r2 = com.swmansion.rnscreens.C10081t.rns_no_animation_medium
            int r7 = com.swmansion.rnscreens.C10081t.rns_slide_out_to_bottom
            goto L_0x00f8
        L_0x00df:
            int r2 = com.swmansion.rnscreens.C10081t.rns_slide_in_from_right
            int r7 = com.swmansion.rnscreens.C10081t.rns_slide_out_to_left
            goto L_0x00f8
        L_0x00e4:
            int r2 = com.swmansion.rnscreens.C10081t.rns_slide_in_from_left
            int r7 = com.swmansion.rnscreens.C10081t.rns_slide_out_to_right
            goto L_0x00f8
        L_0x00e9:
            int r2 = com.swmansion.rnscreens.C10081t.rns_fade_in
            int r7 = com.swmansion.rnscreens.C10081t.rns_fade_out
            goto L_0x00f8
        L_0x00ee:
            int r2 = com.swmansion.rnscreens.C10081t.rns_no_animation_20
            r6.mo4251q(r2, r2)
            goto L_0x00fb
        L_0x00f4:
            int r2 = com.swmansion.rnscreens.C10081t.rns_default_exit_in
            int r7 = com.swmansion.rnscreens.C10081t.rns_default_exit_out
        L_0x00f8:
            r6.mo4251q(r2, r7)
        L_0x00fb:
            r8.f26897E = r1
            if (r1 == 0) goto L_0x010d
            if (r3 == 0) goto L_0x010d
            com.swmansion.rnscreens.y$a r1 = f26892u
            boolean r1 = r1.m34172d(r3)
            if (r1 == 0) goto L_0x010d
            if (r4 != 0) goto L_0x010d
            r8.f26894B = r5
        L_0x010d:
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r1 = r8.f26898v
            java.util.Iterator r1 = r1.iterator()
        L_0x0113:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0133
            java.lang.Object r2 = r1.next()
            com.swmansion.rnscreens.ScreenStackFragment r2 = (com.swmansion.rnscreens.ScreenStackFragment) r2
            java.util.ArrayList<T> r7 = r8.f26884f
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L_0x012f
            java.util.Set<com.swmansion.rnscreens.ScreenStackFragment> r7 = r8.f26899w
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L_0x0113
        L_0x012f:
            r6.mo3976m(r2)
            goto L_0x0113
        L_0x0133:
            java.util.ArrayList<T> r1 = r8.f26884f
            java.util.Iterator r1 = r1.iterator()
        L_0x0139:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0156
            java.lang.Object r2 = r1.next()
            com.swmansion.rnscreens.ScreenStackFragment r2 = (com.swmansion.rnscreens.ScreenStackFragment) r2
            if (r2 != r4) goto L_0x0148
            goto L_0x0156
        L_0x0148:
            if (r2 == r3) goto L_0x0139
            java.util.Set<com.swmansion.rnscreens.ScreenStackFragment> r7 = r8.f26899w
            boolean r7 = r7.contains(r2)
            if (r7 != 0) goto L_0x0139
            r6.mo3976m(r2)
            goto L_0x0139
        L_0x0156:
            if (r4 == 0) goto L_0x0186
            boolean r1 = r4.mo3867R()
            if (r1 != 0) goto L_0x0186
            java.util.ArrayList<T> r1 = r8.f26884f
            java.util.Iterator r1 = r1.iterator()
        L_0x0164:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0195
            java.lang.Object r2 = r1.next()
            com.swmansion.rnscreens.ScreenStackFragment r2 = (com.swmansion.rnscreens.ScreenStackFragment) r2
            if (r5 == 0) goto L_0x0175
            if (r2 != r4) goto L_0x0164
            r5 = 0
        L_0x0175:
            int r7 = r8.getId()
            androidx.fragment.app.s r2 = r6.mo4242b(r7, r2)
            com.swmansion.rnscreens.e r7 = new com.swmansion.rnscreens.e
            r7.<init>(r3)
            r2.mo4250p(r7)
            goto L_0x0164
        L_0x0186:
            if (r3 == 0) goto L_0x0195
            boolean r0 = r3.mo3867R()
            if (r0 != 0) goto L_0x0195
            int r0 = r8.getId()
            r6.mo4242b(r0, r3)
        L_0x0195:
            r8.f26902z = r3
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r0 = r8.f26898v
            r0.clear()
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r0 = r8.f26898v
            java.util.ArrayList<T> r1 = r8.f26884f
            r0.addAll(r1)
            r8.m34157G(r4)
            r6.mo3974j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10093y.mo25103p():void");
    }

    public void removeView(View view) {
        C10457l.m35320e(view, "view");
        if (this.f26894B) {
            this.f26894B = false;
            this.f26895C = true;
        }
        super.removeView(view);
    }

    /* renamed from: s */
    public void mo25108s() {
        this.f26899w.clear();
        super.mo25108s();
    }

    public final void setGoingForward(boolean z) {
        this.f26897E = z;
    }

    public void startViewTransition(View view) {
        C10457l.m35320e(view, "view");
        super.startViewTransition(view);
        this.f26893A = true;
    }

    /* renamed from: u */
    public void mo25109u(int i) {
        Set<ScreenStackFragment> set = this.f26899w;
        C10443a0.m35293a(set).remove(mo25095i(i).getFragment());
        super.mo25109u(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public ScreenStackFragment mo25090b(C10084w wVar) {
        C10457l.m35320e(wVar, "screen");
        return new ScreenStackFragment(wVar);
    }

    /* renamed from: y */
    public final void mo25119y(ScreenStackFragment screenStackFragment) {
        C10457l.m35320e(screenStackFragment, "screenFragment");
        this.f26899w.add(screenStackFragment);
        mo25105r();
    }
}
