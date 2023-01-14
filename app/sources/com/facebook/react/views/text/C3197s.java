package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0275u0;
import androidx.appcompat.widget.C0298z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3056x;
import com.facebook.react.views.view.C3244f;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Comparator;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.views.text.s */
public class C3197s extends C0298z implements C3056x {

    /* renamed from: r */
    private static final ViewGroup.LayoutParams f8965r = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: A */
    private boolean f8966A;

    /* renamed from: B */
    private boolean f8967B = false;

    /* renamed from: C */
    private C3244f f8968C = new C3244f(this);

    /* renamed from: D */
    private Spannable f8969D;

    /* renamed from: s */
    private boolean f8970s;

    /* renamed from: t */
    private int f8971t = (getGravity() & 8388615);

    /* renamed from: u */
    private int f8972u = (getGravity() & 112);

    /* renamed from: v */
    private int f8973v = 0;

    /* renamed from: w */
    private int f8974w = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;

    /* renamed from: x */
    private TextUtils.TruncateAt f8975x = TextUtils.TruncateAt.END;

    /* renamed from: y */
    private boolean f8976y = false;

    /* renamed from: z */
    private int f8977z = 0;

    /* renamed from: com.facebook.react.views.text.s$a */
    class C3198a implements Comparator {
        C3198a() {
        }

        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public C3197s(Context context) {
        super(context);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof C0275u0) {
            context = ((C0275u0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* renamed from: h */
    private static WritableMap m12513h(int i, int i2, int i3, int i4, int i5, int i6) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (i == 8) {
            str = "gone";
        } else if (i == 0) {
            createMap.putString("visibility", "visible");
            createMap.putInt("index", i2);
            createMap.putDouble("left", (double) C3038r.m12004a((float) i3));
            createMap.putDouble("top", (double) C3038r.m12004a((float) i4));
            createMap.putDouble("right", (double) C3038r.m12004a((float) i5));
            createMap.putDouble("bottom", (double) C3038r.m12004a((float) i6));
            return createMap;
        } else {
            str = "unknown";
        }
        createMap.putString("visibility", str);
        createMap.putInt("index", i2);
        return createMap;
    }

    /* renamed from: c */
    public int mo9869c(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i2);
                C3191o[] oVarArr = (C3191o[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C3191o.class);
                if (oVarArr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < oVarArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(oVarArr[i4]);
                        int spanEnd = spanned.getSpanEnd(oVarArr[i4]);
                        if (spanEnd >= offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = oVarArr[i4].mo10373a();
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                C6071a.m22875i("ReactNative", "Crash in HorizontalMeasurementProvider: " + e.getMessage());
            }
        }
        return id;
    }

    public Spannable getSpanned() {
        return this.f8969D;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: i */
    public void mo10390i(int i, float f, float f2) {
        this.f8968C.mo10646c(i, f, f2);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f8970s && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C3164a0 a : (C3164a0[]) spanned.getSpans(0, spanned.length(), C3164a0.class)) {
                if (a.mo10311a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    /* renamed from: j */
    public void mo10392j(float f, int i) {
        this.f8968C.mo10648e(f, i);
    }

    /* renamed from: k */
    public void mo10393k(int i, float f) {
        this.f8968C.mo10650g(i, f);
    }

    /* renamed from: l */
    public void mo10394l() {
        setEllipsize((this.f8974w == Integer.MAX_VALUE || this.f8976y) ? null : this.f8975x);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f8967B);
        if (this.f8970s && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C3164a0 c : (C3164a0[]) spanned.getSpans(0, spanned.length(), C3164a0.class)) {
                c.mo10313c();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8970s && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C3164a0 d : (C3164a0[]) spanned.getSpans(0, spanned.length(), C3164a0.class)) {
                d.mo10314d();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f8970s && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C3164a0 e : (C3164a0[]) spanned.getSpans(0, spanned.length(), C3164a0.class)) {
                e.mo10315e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        if (r5 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0141 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r22.getId()
            java.lang.CharSequence r2 = r22.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x0184
            int r2 = com.facebook.react.uimanager.p121k1.C2996a.m11878a(r1)
            r3 = 2
            if (r2 != r3) goto L_0x0017
            goto L_0x0184
        L_0x0017:
            com.facebook.react.bridge.ReactContext r2 = r22.getReactContext()
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r3 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r2 = r2.getNativeModule(r3)
            java.lang.Object r2 = p174e.p247e.p315l.p316a.C6409a.m24521c(r2)
            com.facebook.react.uimanager.UIManagerModule r2 = (com.facebook.react.uimanager.UIManagerModule) r2
            java.lang.CharSequence r3 = r22.getText()
            android.text.Spanned r3 = (android.text.Spanned) r3
            android.text.Layout r4 = r22.getLayout()
            if (r4 != 0) goto L_0x0034
            return
        L_0x0034:
            int r5 = r3.length()
            java.lang.Class<com.facebook.react.views.text.b0> r6 = com.facebook.react.views.text.C3166b0.class
            r7 = 0
            java.lang.Object[] r5 = r3.getSpans(r7, r5, r6)
            com.facebook.react.views.text.b0[] r5 = (com.facebook.react.views.text.C3166b0[]) r5
            boolean r6 = r0.f8966A
            if (r6 == 0) goto L_0x004c
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r5.length
            r6.<init>(r8)
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            int r8 = r26 - r24
            int r9 = r27 - r25
            int r10 = r5.length
            r11 = 0
        L_0x0053:
            if (r11 >= r10) goto L_0x014c
            r12 = r5[r11]
            int r13 = r12.mo10320b()
            android.view.View r13 = r2.resolveView(r13)
            int r15 = r3.getSpanStart(r12)
            int r14 = r4.getLineForOffset(r15)
            int r16 = r4.getEllipsisCount(r14)
            r17 = 1
            if (r16 <= 0) goto L_0x0072
            r16 = 1
            goto L_0x0074
        L_0x0072:
            r16 = 0
        L_0x0074:
            if (r16 == 0) goto L_0x0082
            int r16 = r4.getLineStart(r14)
            int r18 = r4.getEllipsisStart(r14)
            int r7 = r16 + r18
            if (r15 >= r7) goto L_0x0121
        L_0x0082:
            int r7 = r0.f8974w
            if (r14 >= r7) goto L_0x0121
            int r7 = r4.getLineEnd(r14)
            if (r15 < r7) goto L_0x008e
            goto L_0x0121
        L_0x008e:
            int r7 = r12.mo10321c()
            int r12 = r12.mo10319a()
            r20 = r5
            boolean r5 = r4.isRtlCharAt(r15)
            r27 = r10
            int r10 = r4.getParagraphDirection(r14)
            r21 = r1
            r1 = -1
            if (r10 != r1) goto L_0x00a9
            r1 = 1
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            int r10 = r3.length()
            int r10 = r10 + -1
            if (r15 != r10) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            float r1 = r4.getLineWidth(r14)
            int r1 = (int) r1
            int r1 = r8 - r1
            goto L_0x00e2
        L_0x00bc:
            float r1 = r4.getLineRight(r14)
            int r1 = (int) r1
            goto L_0x00e1
        L_0x00c2:
            if (r1 != r5) goto L_0x00c6
            r10 = 1
            goto L_0x00c7
        L_0x00c6:
            r10 = 0
        L_0x00c7:
            if (r10 == 0) goto L_0x00ce
            float r10 = r4.getPrimaryHorizontal(r15)
            goto L_0x00d2
        L_0x00ce:
            float r10 = r4.getSecondaryHorizontal(r15)
        L_0x00d2:
            int r10 = (int) r10
            if (r1 == 0) goto L_0x00de
            float r1 = r4.getLineRight(r14)
            int r1 = (int) r1
            int r1 = r1 - r10
            int r1 = r8 - r1
            goto L_0x00df
        L_0x00de:
            r1 = r10
        L_0x00df:
            if (r5 == 0) goto L_0x00e2
        L_0x00e1:
            int r1 = r1 - r7
        L_0x00e2:
            if (r5 == 0) goto L_0x00e9
            int r5 = r22.getTotalPaddingRight()
            goto L_0x00ed
        L_0x00e9:
            int r5 = r22.getTotalPaddingLeft()
        L_0x00ed:
            int r1 = r1 + r5
            int r5 = r24 + r1
            int r10 = r22.getTotalPaddingTop()
            int r14 = r4.getLineBaseline(r14)
            int r10 = r10 + r14
            int r10 = r10 - r12
            int r14 = r25 + r10
            if (r8 <= r1) goto L_0x0103
            if (r9 > r10) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r17 = 0
        L_0x0103:
            if (r17 == 0) goto L_0x0108
            r1 = 8
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            int r7 = r7 + r5
            int r10 = r14 + r12
            r13.setVisibility(r1)
            r13.layout(r5, r14, r7, r10)
            boolean r12 = r0.f8966A
            if (r12 == 0) goto L_0x0141
            r12 = r14
            r14 = r1
            r16 = r5
            r17 = r12
            r18 = r7
            r19 = r10
            goto L_0x013a
        L_0x0121:
            r21 = r1
            r20 = r5
            r27 = r10
            r1 = 8
            r13.setVisibility(r1)
            boolean r1 = r0.f8966A
            if (r1 == 0) goto L_0x0141
            r14 = 8
            r16 = -1
            r17 = -1
            r18 = -1
            r19 = -1
        L_0x013a:
            com.facebook.react.bridge.WritableMap r1 = m12513h(r14, r15, r16, r17, r18, r19)
            r6.add(r1)
        L_0x0141:
            int r11 = r11 + 1
            r10 = r27
            r5 = r20
            r1 = r21
            r7 = 0
            goto L_0x0053
        L_0x014c:
            r21 = r1
            boolean r1 = r0.f8966A
            if (r1 == 0) goto L_0x0184
            com.facebook.react.views.text.s$a r1 = new com.facebook.react.views.text.s$a
            r1.<init>()
            java.util.Collections.sort(r6, r1)
            com.facebook.react.bridge.WritableArray r1 = com.facebook.react.bridge.Arguments.createArray()
            java.util.Iterator r3 = r6.iterator()
        L_0x0162:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0172
            java.lang.Object r4 = r3.next()
            com.facebook.react.bridge.WritableMap r4 = (com.facebook.react.bridge.WritableMap) r4
            r1.pushMap(r4)
            goto L_0x0162
        L_0x0172:
            com.facebook.react.bridge.WritableMap r3 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r4 = "inlineViews"
            r3.putArray(r4, r1)
            if (r2 == 0) goto L_0x0184
            java.lang.String r1 = "topInlineViewLayout"
            r4 = r21
            r2.receiveEvent(r4, r1, r3)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3197s.onLayout(boolean, int, int, int, int):void");
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f8970s && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C3164a0 f : (C3164a0[]) spanned.getSpans(0, spanned.length(), C3164a0.class)) {
                f.mo10316f();
            }
        }
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.f8976y = z;
    }

    public void setBackgroundColor(int i) {
        this.f8968C.mo10645b(i);
    }

    public void setBorderRadius(float f) {
        this.f8968C.mo10647d(f);
    }

    public void setBorderStyle(String str) {
        this.f8968C.mo10649f(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f8975x = truncateAt;
    }

    /* access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f8971t;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    /* access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f8972u;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setLinkifyMask(int i) {
        this.f8977z = i;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.f8966A = z;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        }
        this.f8974w = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.f8974w);
    }

    public void setSpanned(Spannable spannable) {
        this.f8969D = spannable;
    }

    public void setText(C3196r rVar) {
        int i;
        this.f8970s = rVar.mo10376b();
        if (getLayoutParams() == null) {
            setLayoutParams(f8965r);
        }
        Spannable k = rVar.mo10385k();
        int i2 = this.f8977z;
        if (i2 > 0) {
            Linkify.addLinks(k, i2);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(k);
        float f = rVar.mo10380f();
        float h = rVar.mo10382h();
        float g = rVar.mo10381g();
        float e = rVar.mo10379e();
        if (!(f == -1.0f || e == -1.0f || g == -1.0f || i == 0)) {
            setPadding((int) Math.floor((double) f), (int) Math.floor((double) h), (int) Math.floor((double) g), (int) Math.floor((double) e));
        }
        int l = rVar.mo10386l();
        if (this.f8973v != l) {
            this.f8973v = l;
        }
        setGravityHorizontal(this.f8973v);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23 && getBreakStrategy() != rVar.mo10387m()) {
            setBreakStrategy(rVar.mo10387m());
        }
        if (i3 >= 26 && getJustificationMode() != rVar.mo10378d()) {
            setJustificationMode(rVar.mo10378d());
        }
        requestLayout();
    }

    public void setTextIsSelectable(boolean z) {
        this.f8967B = z;
        super.setTextIsSelectable(z);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f8970s && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C3164a0 a : (C3164a0[]) spanned.getSpans(0, spanned.length(), C3164a0.class)) {
                if (a.mo10311a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
