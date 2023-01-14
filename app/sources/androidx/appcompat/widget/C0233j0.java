package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0144p;
import androidx.core.widget.C1193h;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Method;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.j0 */
public class C0233j0 implements C0144p {

    /* renamed from: f */
    private static Method f1017f;

    /* renamed from: o */
    private static Method f1018o;

    /* renamed from: p */
    private static Method f1019p;

    /* renamed from: A */
    private boolean f1020A;

    /* renamed from: B */
    private int f1021B;

    /* renamed from: C */
    private boolean f1022C;

    /* renamed from: D */
    private boolean f1023D;

    /* renamed from: E */
    int f1024E;

    /* renamed from: F */
    private View f1025F;

    /* renamed from: G */
    private int f1026G;

    /* renamed from: H */
    private DataSetObserver f1027H;

    /* renamed from: I */
    private View f1028I;

    /* renamed from: J */
    private Drawable f1029J;

    /* renamed from: K */
    private AdapterView.OnItemClickListener f1030K;

    /* renamed from: L */
    private AdapterView.OnItemSelectedListener f1031L;

    /* renamed from: M */
    final C0240g f1032M;

    /* renamed from: N */
    private final C0239f f1033N;

    /* renamed from: O */
    private final C0238e f1034O;

    /* renamed from: P */
    private final C0236c f1035P;

    /* renamed from: Q */
    private Runnable f1036Q;

    /* renamed from: R */
    final Handler f1037R;

    /* renamed from: S */
    private final Rect f1038S;

    /* renamed from: T */
    private Rect f1039T;

    /* renamed from: U */
    private boolean f1040U;

    /* renamed from: V */
    PopupWindow f1041V;

    /* renamed from: q */
    private Context f1042q;

    /* renamed from: r */
    private ListAdapter f1043r;

    /* renamed from: s */
    C0218f0 f1044s;

    /* renamed from: t */
    private int f1045t;

    /* renamed from: u */
    private int f1046u;

    /* renamed from: v */
    private int f1047v;

    /* renamed from: w */
    private int f1048w;

    /* renamed from: x */
    private int f1049x;

    /* renamed from: y */
    private boolean f1050y;

    /* renamed from: z */
    private boolean f1051z;

    /* renamed from: androidx.appcompat.widget.j0$a */
    class C0234a implements Runnable {
        C0234a() {
        }

        public void run() {
            View t = C0233j0.this.mo1472t();
            if (t != null && t.getWindowToken() != null) {
                C0233j0.this.mo543a();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    class C0235b implements AdapterView.OnItemSelectedListener {
        C0235b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0218f0 f0Var;
            if (i != -1 && (f0Var = C0233j0.this.f1044s) != null) {
                f0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$c */
    private class C0236c implements Runnable {
        C0236c() {
        }

        public void run() {
            C0233j0.this.mo1470r();
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    private class C0237d extends DataSetObserver {
        C0237d() {
        }

        public void onChanged() {
            if (C0233j0.this.mo544b()) {
                C0233j0.this.mo543a();
            }
        }

        public void onInvalidated() {
            C0233j0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$e */
    private class C0238e implements AbsListView.OnScrollListener {
        C0238e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0233j0.this.mo1474w() && C0233j0.this.f1041V.getContentView() != null) {
                C0233j0 j0Var = C0233j0.this;
                j0Var.f1037R.removeCallbacks(j0Var.f1032M);
                C0233j0.this.f1032M.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$f */
    private class C0239f implements View.OnTouchListener {
        C0239f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0233j0.this.f1041V) != null && popupWindow.isShowing() && x >= 0 && x < C0233j0.this.f1041V.getWidth() && y >= 0 && y < C0233j0.this.f1041V.getHeight()) {
                C0233j0 j0Var = C0233j0.this;
                j0Var.f1037R.postDelayed(j0Var.f1032M, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0233j0 j0Var2 = C0233j0.this;
                j0Var2.f1037R.removeCallbacks(j0Var2.f1032M);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$g */
    private class C0240g implements Runnable {
        C0240g() {
        }

        public void run() {
            C0218f0 f0Var = C0233j0.this.f1044s;
            if (f0Var != null && C1988t.m8359Q(f0Var) && C0233j0.this.f1044s.getCount() > C0233j0.this.f1044s.getChildCount()) {
                int childCount = C0233j0.this.f1044s.getChildCount();
                C0233j0 j0Var = C0233j0.this;
                if (childCount <= j0Var.f1024E) {
                    j0Var.f1041V.setInputMethodMode(2);
                    C0233j0.this.mo543a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1017f = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1019p = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1018o = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0233j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0233j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1045t = -2;
        this.f1046u = -2;
        this.f1049x = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        this.f1021B = 0;
        this.f1022C = false;
        this.f1023D = false;
        this.f1024E = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        this.f1026G = 0;
        this.f1032M = new C0240g();
        this.f1033N = new C0239f();
        this.f1034O = new C0238e();
        this.f1035P = new C0236c();
        this.f1038S = new Rect();
        this.f1042q = context;
        this.f1037R = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4401o1, i, i2);
        this.f1047v = obtainStyledAttributes.getDimensionPixelOffset(C1444j.f4406p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C1444j.f4411q1, 0);
        this.f1048w = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1050y = true;
        }
        obtainStyledAttributes.recycle();
        C0264q qVar = new C0264q(context, attributeSet, i, i2);
        this.f1041V = qVar;
        qVar.setInputMethodMode(1);
    }

    /* renamed from: J */
    private void m1198J(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1017f;
            if (method != null) {
                try {
                    method.invoke(this.f1041V, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1041V.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0151  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1199q() {
        /*
            r12 = this;
            androidx.appcompat.widget.f0 r0 = r12.f1044s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f1042q
            androidx.appcompat.widget.j0$a r5 = new androidx.appcompat.widget.j0$a
            r5.<init>()
            r12.f1036Q = r5
            boolean r5 = r12.f1040U
            r5 = r5 ^ r3
            androidx.appcompat.widget.f0 r5 = r12.mo1471s(r0, r5)
            r12.f1044s = r5
            android.graphics.drawable.Drawable r6 = r12.f1029J
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            android.widget.ListAdapter r6 = r12.f1043r
            r5.setAdapter(r6)
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1030K
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            r5.setFocusable(r3)
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            androidx.appcompat.widget.j0$b r6 = new androidx.appcompat.widget.j0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            androidx.appcompat.widget.j0$e r6 = r12.f1034O
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1031L
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.f0 r6 = r12.f1044s
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.f0 r5 = r12.f1044s
            android.view.View r6 = r12.f1025F
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1026G
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1026G
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1046u
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.f1041V
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.f1041V
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1025F
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.f1041V
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.f1038S
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1038S
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1050y
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f1048w = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.f1038S
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.f1041V
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.mo1472t()
            int r6 = r12.f1048w
            int r3 = r12.m1200u(r4, r6, r3)
            boolean r4 = r12.f1022C
            if (r4 != 0) goto L_0x0162
            int r4 = r12.f1045t
            if (r4 != r2) goto L_0x011d
            goto L_0x0162
        L_0x011d:
            int r4 = r12.f1046u
            r6 = -2
            if (r4 == r6) goto L_0x012b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0143
        L_0x012b:
            android.content.Context r2 = r12.f1042q
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1038S
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0143:
            r7 = r1
            androidx.appcompat.widget.f0 r6 = r12.f1044s
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo1351d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0160
            androidx.appcompat.widget.f0 r2 = r12.f1044s
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.f0 r3 = r12.f1044s
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0160:
            int r1 = r1 + r0
            return r1
        L_0x0162:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0233j0.m1199q():int");
    }

    /* renamed from: u */
    private int m1200u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1041V.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1018o;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1041V, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1041V.getMaxAvailableHeight(view, i);
    }

    /* renamed from: y */
    private void m1201y() {
        View view = this.f1025F;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1025F);
            }
        }
    }

    /* renamed from: A */
    public void mo1451A(int i) {
        this.f1041V.setAnimationStyle(i);
    }

    /* renamed from: B */
    public void mo1452B(int i) {
        Drawable background = this.f1041V.getBackground();
        if (background != null) {
            background.getPadding(this.f1038S);
            Rect rect = this.f1038S;
            this.f1046u = rect.left + rect.right + i;
            return;
        }
        mo1462M(i);
    }

    /* renamed from: C */
    public void mo1453C(int i) {
        this.f1021B = i;
    }

    /* renamed from: D */
    public void mo1454D(Rect rect) {
        this.f1039T = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: E */
    public void mo1455E(int i) {
        this.f1041V.setInputMethodMode(i);
    }

    /* renamed from: F */
    public void mo1456F(boolean z) {
        this.f1040U = z;
        this.f1041V.setFocusable(z);
    }

    /* renamed from: G */
    public void mo1457G(PopupWindow.OnDismissListener onDismissListener) {
        this.f1041V.setOnDismissListener(onDismissListener);
    }

    /* renamed from: H */
    public void mo1458H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1030K = onItemClickListener;
    }

    /* renamed from: I */
    public void mo1459I(boolean z) {
        this.f1020A = true;
        this.f1051z = z;
    }

    /* renamed from: K */
    public void mo1460K(int i) {
        this.f1026G = i;
    }

    /* renamed from: L */
    public void mo1461L(int i) {
        C0218f0 f0Var = this.f1044s;
        if (mo544b() && f0Var != null) {
            f0Var.setListSelectionHidden(false);
            f0Var.setSelection(i);
            if (f0Var.getChoiceMode() != 0) {
                f0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: M */
    public void mo1462M(int i) {
        this.f1046u = i;
    }

    /* renamed from: a */
    public void mo543a() {
        int q = m1199q();
        boolean w = mo1474w();
        C1193h.m4692b(this.f1041V, this.f1049x);
        boolean z = true;
        if (!this.f1041V.isShowing()) {
            int i = this.f1046u;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1472t().getWidth();
            }
            int i2 = this.f1045t;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f1041V.setWidth(i);
            this.f1041V.setHeight(q);
            m1198J(true);
            this.f1041V.setOutsideTouchable(!this.f1023D && !this.f1022C);
            this.f1041V.setTouchInterceptor(this.f1033N);
            if (this.f1020A) {
                C1193h.m4691a(this.f1041V, this.f1051z);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1019p;
                if (method != null) {
                    try {
                        method.invoke(this.f1041V, new Object[]{this.f1039T});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1041V.setEpicenterBounds(this.f1039T);
            }
            C1193h.m4693c(this.f1041V, mo1472t(), this.f1047v, this.f1048w, this.f1021B);
            this.f1044s.setSelection(-1);
            if (!this.f1040U || this.f1044s.isInTouchMode()) {
                mo1470r();
            }
            if (!this.f1040U) {
                this.f1037R.post(this.f1035P);
            }
        } else if (C1988t.m8359Q(mo1472t())) {
            int i3 = this.f1046u;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1472t().getWidth();
            }
            int i4 = this.f1045t;
            if (i4 == -1) {
                if (!w) {
                    q = -1;
                }
                if (w) {
                    this.f1041V.setWidth(this.f1046u == -1 ? -1 : 0);
                    this.f1041V.setHeight(0);
                } else {
                    this.f1041V.setWidth(this.f1046u == -1 ? -1 : 0);
                    this.f1041V.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f1041V;
            if (this.f1023D || this.f1022C) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1041V.update(mo1472t(), this.f1047v, this.f1048w, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: b */
    public boolean mo544b() {
        return this.f1041V.isShowing();
    }

    /* renamed from: c */
    public void mo1463c(Drawable drawable) {
        this.f1041V.setBackgroundDrawable(drawable);
    }

    /* renamed from: d */
    public int mo1464d() {
        return this.f1047v;
    }

    public void dismiss() {
        this.f1041V.dismiss();
        m1201y();
        this.f1041V.setContentView((View) null);
        this.f1044s = null;
        this.f1037R.removeCallbacks(this.f1032M);
    }

    /* renamed from: f */
    public void mo1465f(int i) {
        this.f1047v = i;
    }

    /* renamed from: i */
    public Drawable mo1466i() {
        return this.f1041V.getBackground();
    }

    /* renamed from: j */
    public ListView mo547j() {
        return this.f1044s;
    }

    /* renamed from: l */
    public void mo1467l(int i) {
        this.f1048w = i;
        this.f1050y = true;
    }

    /* renamed from: o */
    public int mo1468o() {
        if (!this.f1050y) {
            return 0;
        }
        return this.f1048w;
    }

    /* renamed from: p */
    public void mo1469p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1027H;
        if (dataSetObserver == null) {
            this.f1027H = new C0237d();
        } else {
            ListAdapter listAdapter2 = this.f1043r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1043r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1027H);
        }
        C0218f0 f0Var = this.f1044s;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1043r);
        }
    }

    /* renamed from: r */
    public void mo1470r() {
        C0218f0 f0Var = this.f1044s;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0218f0 mo1471s(Context context, boolean z) {
        return new C0218f0(context, z);
    }

    /* renamed from: t */
    public View mo1472t() {
        return this.f1028I;
    }

    /* renamed from: v */
    public int mo1473v() {
        return this.f1046u;
    }

    /* renamed from: w */
    public boolean mo1474w() {
        return this.f1041V.getInputMethodMode() == 2;
    }

    /* renamed from: x */
    public boolean mo1475x() {
        return this.f1040U;
    }

    /* renamed from: z */
    public void mo1476z(View view) {
        this.f1028I = view;
    }
}
