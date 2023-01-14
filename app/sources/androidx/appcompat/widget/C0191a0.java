package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.a0 */
class C0191a0 {

    /* renamed from: a */
    private static final RectF f870a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f871b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, Field> f872c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private int f873d = 0;

    /* renamed from: e */
    private boolean f874e = false;

    /* renamed from: f */
    private float f875f = -1.0f;

    /* renamed from: g */
    private float f876g = -1.0f;

    /* renamed from: h */
    private float f877h = -1.0f;

    /* renamed from: i */
    private int[] f878i = new int[0];

    /* renamed from: j */
    private boolean f879j = false;

    /* renamed from: k */
    private TextPaint f880k;

    /* renamed from: l */
    private final TextView f881l;

    /* renamed from: m */
    private final Context f882m;

    /* renamed from: n */
    private final C0194c f883n;

    /* renamed from: androidx.appcompat.widget.a0$a */
    private static class C0192a extends C0194c {
        C0192a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1240a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0191a0.m991r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$b */
    private static class C0193b extends C0192a {
        C0193b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1240a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1241b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$c */
    private static class C0194c {
        C0194c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1240a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1241b(TextView textView) {
            return ((Boolean) C0191a0.m991r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0191a0(TextView textView) {
        this.f881l = textView;
        this.f882m = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f883n = i >= 29 ? new C0193b() : i >= 23 ? new C0192a() : new C0194c();
    }

    /* renamed from: A */
    private void m977A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f878i = m983c(iArr);
            m978B();
        }
    }

    /* renamed from: B */
    private boolean m978B() {
        int[] iArr = this.f878i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f879j = z;
        if (z) {
            this.f873d = 1;
            this.f876g = (float) iArr[0];
            this.f877h = (float) iArr[length - 1];
            this.f875f = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m979C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f881l.getText();
        TransformationMethod transformationMethod = this.f881l.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f881l)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f881l.getMaxLines() : -1;
        mo1233q(i);
        StaticLayout e = mo1227e(text, (Layout.Alignment) m991r(this.f881l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m980D() {
        return !(this.f881l instanceof C0241k);
    }

    /* renamed from: E */
    private void m981E(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f873d = 1;
            this.f876g = f;
            this.f877h = f2;
            this.f875f = f3;
            this.f879j = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m982a(Object obj, String str, T t) {
        try {
            Field o = m989o(str);
            return o == null ? t : o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m983c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m984d() {
        this.f873d = 0;
        this.f876g = -1.0f;
        this.f877h = -1.0f;
        this.f875f = -1.0f;
        this.f878i = new int[0];
        this.f874e = false;
    }

    /* renamed from: f */
    private StaticLayout m985f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f880k, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f881l.getLineSpacingExtra(), this.f881l.getLineSpacingMultiplier()).setIncludePad(this.f881l.getIncludeFontPadding()).setBreakStrategy(this.f881l.getBreakStrategy()).setHyphenationFrequency(this.f881l.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f883n.mo1240a(obtain, this.f881l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m986g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f880k, i, alignment, ((Float) m982a(this.f881l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m982a(this.f881l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m982a(this.f881l, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m987h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f880k, i, alignment, this.f881l.getLineSpacingMultiplier(), this.f881l.getLineSpacingExtra(), this.f881l.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m988i(RectF rectF) {
        int length = this.f878i.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m979C(this.f878i[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f878i[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m989o(String str) {
        try {
            Field field = f872c.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f872c.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m990p(String str) {
        try {
            Method method = f871b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f871b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m991r(Object obj, String str, T t) {
        try {
            return m990p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m992x(float f) {
        if (f != this.f881l.getPaint().getTextSize()) {
            this.f881l.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f881l.isInLayout() : false;
            if (this.f881l.getLayout() != null) {
                this.f874e = false;
                try {
                    Method p = m990p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f881l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f881l.requestLayout();
                } else {
                    this.f881l.forceLayout();
                }
                this.f881l.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m993z() {
        if (!m980D() || this.f873d != 1) {
            this.f874e = false;
        } else {
            if (!this.f879j || this.f878i.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f877h - this.f876g) / this.f875f))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f876g + (((float) i) * this.f875f));
                }
                this.f878i = m983c(iArr);
            }
            this.f874e = true;
        }
        return this.f874e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1226b() {
        if (mo1234s()) {
            if (this.f874e) {
                if (this.f881l.getMeasuredHeight() > 0 && this.f881l.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f883n.mo1241b(this.f881l) ? 1048576 : (this.f881l.getMeasuredWidth() - this.f881l.getTotalPaddingLeft()) - this.f881l.getTotalPaddingRight();
                    int height = (this.f881l.getHeight() - this.f881l.getCompoundPaddingBottom()) - this.f881l.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f870a;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float i = (float) m988i(rectF);
                            if (i != this.f881l.getTextSize()) {
                                mo1239y(0, i);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f874e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo1227e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? m985f(charSequence, alignment, i, i2) : i3 >= 16 ? m987h(charSequence, alignment, i) : m986g(charSequence, alignment, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo1228j() {
        return Math.round(this.f877h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo1229k() {
        return Math.round(this.f876g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo1230l() {
        return Math.round(this.f875f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] mo1231m() {
        return this.f878i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo1232n() {
        return this.f873d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1233q(int i) {
        TextPaint textPaint = this.f880k;
        if (textPaint == null) {
            this.f880k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f880k.set(this.f881l.getPaint());
        this.f880k.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo1234s() {
        return m980D() && this.f873d != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1235t(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f882m;
        int[] iArr = C1444j.f4370i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f881l;
        C1988t.m8390k0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C1444j.f4395n0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f873d = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C1444j.f4390m0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C1444j.f4380k0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C1444j.f4375j0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C1444j.f4385l0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m977A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m980D()) {
            this.f873d = 0;
        } else if (this.f873d == 1) {
            if (!this.f879j) {
                DisplayMetrics displayMetrics = this.f882m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m981E(dimension2, dimension3, dimension);
            }
            m993z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1236u(int i, int i2, int i3, int i4) {
        if (m980D()) {
            DisplayMetrics displayMetrics = this.f882m.getResources().getDisplayMetrics();
            m981E(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m993z()) {
                mo1226b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1237v(int[] iArr, int i) {
        if (m980D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f882m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f878i = m983c(iArr2);
                if (!m978B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f879j = false;
            }
            if (m993z()) {
                mo1226b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1238w(int i) {
        if (!m980D()) {
            return;
        }
        if (i == 0) {
            m984d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f882m.getResources().getDisplayMetrics();
            m981E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m993z()) {
                mo1226b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo1239y(int i, float f) {
        Context context = this.f882m;
        m992x(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
