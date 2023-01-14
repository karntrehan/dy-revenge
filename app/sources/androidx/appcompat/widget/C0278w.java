package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0062b;
import androidx.appcompat.view.menu.C0144p;
import p027c.p028a.C1435a;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1987s;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.w */
public class C0278w extends Spinner implements C1987s {

    /* renamed from: f */
    private static final int[] f1212f = {16843505};

    /* renamed from: o */
    private final C0214e f1213o;

    /* renamed from: p */
    private final Context f1214p;

    /* renamed from: q */
    private C0225h0 f1215q;

    /* renamed from: r */
    private SpinnerAdapter f1216r;

    /* renamed from: s */
    private final boolean f1217s;

    /* renamed from: t */
    private C0289g f1218t;

    /* renamed from: u */
    int f1219u;

    /* renamed from: v */
    final Rect f1220v;

    /* renamed from: androidx.appcompat.widget.w$a */
    class C0279a extends C0225h0 {

        /* renamed from: w */
        final /* synthetic */ C0283e f1221w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0279a(View view, C0283e eVar) {
            super(view);
            this.f1221w = eVar;
        }

        /* renamed from: b */
        public C0144p mo445b() {
            return this.f1221w;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo446c() {
            if (C0278w.this.getInternalPopup().mo1744b()) {
                return true;
            }
            C0278w.this.mo1718b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    class C0280b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0280b() {
        }

        public void onGlobalLayout() {
            if (!C0278w.this.getInternalPopup().mo1744b()) {
                C0278w.this.mo1718b();
            }
            ViewTreeObserver viewTreeObserver = C0278w.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    class C0281c implements C0289g, DialogInterface.OnClickListener {

        /* renamed from: f */
        C0062b f1224f;

        /* renamed from: o */
        private ListAdapter f1225o;

        /* renamed from: p */
        private CharSequence f1226p;

        C0281c() {
        }

        /* renamed from: b */
        public boolean mo1744b() {
            C0062b bVar = this.f1224f;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public void mo1745c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: d */
        public int mo1746d() {
            return 0;
        }

        public void dismiss() {
            C0062b bVar = this.f1224f;
            if (bVar != null) {
                bVar.dismiss();
                this.f1224f = null;
            }
        }

        /* renamed from: f */
        public void mo1748f(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: g */
        public CharSequence mo1749g() {
            return this.f1226p;
        }

        /* renamed from: i */
        public Drawable mo1750i() {
            return null;
        }

        /* renamed from: k */
        public void mo1751k(CharSequence charSequence) {
            this.f1226p = charSequence;
        }

        /* renamed from: l */
        public void mo1752l(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo1753m(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: n */
        public void mo1754n(int i, int i2) {
            if (this.f1225o != null) {
                C0062b.C0063a aVar = new C0062b.C0063a(C0278w.this.getPopupContext());
                CharSequence charSequence = this.f1226p;
                if (charSequence != null) {
                    aVar.mo219h(charSequence);
                }
                C0062b a = aVar.mo218g(this.f1225o, C0278w.this.getSelectedItemPosition(), this).mo212a();
                this.f1224f = a;
                ListView g = a.mo207g();
                if (Build.VERSION.SDK_INT >= 17) {
                    g.setTextDirection(i);
                    g.setTextAlignment(i2);
                }
                this.f1224f.show();
            }
        }

        /* renamed from: o */
        public int mo1755o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0278w.this.setSelection(i);
            if (C0278w.this.getOnItemClickListener() != null) {
                C0278w.this.performItemClick((View) null, i, this.f1225o.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public void mo1757p(ListAdapter listAdapter) {
            this.f1225o = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    private static class C0282d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f1228f;

        /* renamed from: o */
        private ListAdapter f1229o;

        public C0282d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1228f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1229o = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0273t0) {
                C0273t0 t0Var = (C0273t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1229o;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1229o;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1228f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    class C0283e extends C0233j0 implements C0289g {

        /* renamed from: W */
        private CharSequence f1230W;

        /* renamed from: X */
        ListAdapter f1231X;

        /* renamed from: Y */
        private final Rect f1232Y = new Rect();

        /* renamed from: Z */
        private int f1233Z;

        /* renamed from: androidx.appcompat.widget.w$e$a */
        class C0284a implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ C0278w f1235f;

            C0284a(C0278w wVar) {
                this.f1235f = wVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0278w.this.setSelection(i);
                if (C0278w.this.getOnItemClickListener() != null) {
                    C0283e eVar = C0283e.this;
                    C0278w.this.performItemClick(view, i, eVar.f1231X.getItemId(i));
                }
                C0283e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$b */
        class C0285b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0285b() {
            }

            public void onGlobalLayout() {
                C0283e eVar = C0283e.this;
                if (!eVar.mo1773Q(C0278w.this)) {
                    C0283e.this.dismiss();
                    return;
                }
                C0283e.this.mo1771O();
                C0283e.super.mo543a();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$c */
        class C0286c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1238f;

            C0286c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1238f = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0278w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1238f);
                }
            }
        }

        public C0283e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1476z(C0278w.this);
            mo1456F(true);
            mo1460K(0);
            mo1458H(new C0284a(C0278w.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1771O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo1466i()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.C0278w.this
                android.graphics.Rect r1 = r1.f1220v
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0278w.this
                boolean r0 = androidx.appcompat.widget.C0213d1.m1104b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0278w.this
                android.graphics.Rect r0 = r0.f1220v
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0278w.this
                android.graphics.Rect r0 = r0.f1220v
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0278w.this
                android.graphics.Rect r0 = r0.f1220v
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0278w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.C0278w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.C0278w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.C0278w.this
                int r5 = r4.f1219u
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1231X
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo1466i()
                int r4 = r4.mo1717a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.C0278w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.C0278w.this
                android.graphics.Rect r6 = r6.f1220v
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo1452B(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo1452B(r5)
            L_0x0085:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.C0278w.this
                boolean r4 = androidx.appcompat.widget.C0213d1.m1104b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo1473v()
                int r3 = r3 - r0
                int r0 = r8.mo1772P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo1772P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo1465f(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0278w.C0283e.mo1771O():void");
        }

        /* renamed from: P */
        public int mo1772P() {
            return this.f1233Z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public boolean mo1773Q(View view) {
            return C1988t.m8359Q(view) && view.getGlobalVisibleRect(this.f1232Y);
        }

        /* renamed from: g */
        public CharSequence mo1749g() {
            return this.f1230W;
        }

        /* renamed from: k */
        public void mo1751k(CharSequence charSequence) {
            this.f1230W = charSequence;
        }

        /* renamed from: m */
        public void mo1753m(int i) {
            this.f1233Z = i;
        }

        /* renamed from: n */
        public void mo1754n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b = mo544b();
            mo1771O();
            mo1455E(2);
            super.mo543a();
            ListView j = mo547j();
            j.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                j.setTextDirection(i);
                j.setTextAlignment(i2);
            }
            mo1461L(C0278w.this.getSelectedItemPosition());
            if (!b && (viewTreeObserver = C0278w.this.getViewTreeObserver()) != null) {
                C0285b bVar = new C0285b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo1457G(new C0286c(bVar));
            }
        }

        /* renamed from: p */
        public void mo1469p(ListAdapter listAdapter) {
            super.mo1469p(listAdapter);
            this.f1231X = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$f */
    static class C0287f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0287f> CREATOR = new C0288a();

        /* renamed from: f */
        boolean f1240f;

        /* renamed from: androidx.appcompat.widget.w$f$a */
        class C0288a implements Parcelable.Creator<C0287f> {
            C0288a() {
            }

            /* renamed from: a */
            public C0287f createFromParcel(Parcel parcel) {
                return new C0287f(parcel);
            }

            /* renamed from: b */
            public C0287f[] newArray(int i) {
                return new C0287f[i];
            }
        }

        C0287f(Parcel parcel) {
            super(parcel);
            this.f1240f = parcel.readByte() != 0;
        }

        C0287f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1240f ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$g */
    interface C0289g {
        /* renamed from: b */
        boolean mo1744b();

        /* renamed from: c */
        void mo1745c(Drawable drawable);

        /* renamed from: d */
        int mo1746d();

        void dismiss();

        /* renamed from: f */
        void mo1748f(int i);

        /* renamed from: g */
        CharSequence mo1749g();

        /* renamed from: i */
        Drawable mo1750i();

        /* renamed from: k */
        void mo1751k(CharSequence charSequence);

        /* renamed from: l */
        void mo1752l(int i);

        /* renamed from: m */
        void mo1753m(int i);

        /* renamed from: n */
        void mo1754n(int i, int i2);

        /* renamed from: o */
        int mo1755o();

        /* renamed from: p */
        void mo1757p(ListAdapter listAdapter);
    }

    public C0278w(Context context, int i) {
        this(context, (AttributeSet) null, C1435a.spinnerStyle, i);
    }

    public C0278w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.spinnerStyle);
    }

    public C0278w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0278w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r11 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0278w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1220v = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0271s0.m1349a(r6, r0)
            int[] r0 = p027c.p028a.C1444j.f4203A2
            r1 = 0
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.C0292x0.m1407v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1213o = r2
            if (r11 == 0) goto L_0x0029
            c.a.o.d r2 = new c.a.o.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f1214p = r2
            goto L_0x0039
        L_0x0029:
            int r11 = p027c.p028a.C1444j.f4228F2
            int r11 = r0.mo1797n(r11, r1)
            if (r11 == 0) goto L_0x0037
            c.a.o.d r2 = new c.a.o.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f1214p = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0069
            int[] r11 = f1212f     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x004d:
            r11.recycle()
            goto L_0x0069
        L_0x0051:
            r3 = move-exception
            goto L_0x0057
        L_0x0053:
            r7 = move-exception
            goto L_0x0063
        L_0x0055:
            r3 = move-exception
            r11 = r2
        L_0x0057:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0061:
            r7 = move-exception
            r2 = r11
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.recycle()
        L_0x0068:
            throw r7
        L_0x0069:
            r11 = 1
            if (r10 == 0) goto L_0x00a6
            if (r10 == r11) goto L_0x006f
            goto L_0x00b6
        L_0x006f:
            androidx.appcompat.widget.w$e r10 = new androidx.appcompat.widget.w$e
            android.content.Context r3 = r6.f1214p
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1214p
            int[] r4 = p027c.p028a.C1444j.f4203A2
            androidx.appcompat.widget.x0 r1 = androidx.appcompat.widget.C0292x0.m1407v(r3, r8, r4, r9, r1)
            int r3 = p027c.p028a.C1444j.f4223E2
            r4 = -2
            int r3 = r1.mo1796m(r3, r4)
            r6.f1219u = r3
            int r3 = p027c.p028a.C1444j.f4213C2
            android.graphics.drawable.Drawable r3 = r1.mo1790g(r3)
            r10.mo1463c(r3)
            int r3 = p027c.p028a.C1444j.f4218D2
            java.lang.String r3 = r0.mo1798o(r3)
            r10.mo1751k(r3)
            r1.mo1803w()
            r6.f1218t = r10
            androidx.appcompat.widget.w$a r1 = new androidx.appcompat.widget.w$a
            r1.<init>(r6, r10)
            r6.f1215q = r1
            goto L_0x00b6
        L_0x00a6:
            androidx.appcompat.widget.w$c r10 = new androidx.appcompat.widget.w$c
            r10.<init>()
            r6.f1218t = r10
            int r1 = p027c.p028a.C1444j.f4218D2
            java.lang.String r1 = r0.mo1798o(r1)
            r10.mo1751k(r1)
        L_0x00b6:
            int r10 = p027c.p028a.C1444j.f4208B2
            java.lang.CharSequence[] r10 = r0.mo1800q(r10)
            if (r10 == 0) goto L_0x00ce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p027c.p028a.C1441g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00ce:
            r0.mo1803w()
            r6.f1217s = r11
            android.widget.SpinnerAdapter r7 = r6.f1216r
            if (r7 == 0) goto L_0x00dc
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1216r = r2
        L_0x00dc:
            androidx.appcompat.widget.e r7 = r6.f1213o
            r7.mo1321e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0278w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1717a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1220v);
        Rect rect = this.f1220v;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1718b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1218t.mo1754n(getTextDirection(), getTextAlignment());
        } else {
            this.f1218t.mo1754n(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            eVar.mo1318b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            return gVar.mo1746d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            return gVar.mo1755o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1218t != null) {
            return this.f1219u;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0289g getInternalPopup() {
        return this.f1218t;
    }

    public Drawable getPopupBackground() {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            return gVar.mo1750i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1214p;
    }

    public CharSequence getPrompt() {
        C0289g gVar = this.f1218t;
        return gVar != null ? gVar.mo1749g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0289g gVar = this.f1218t;
        if (gVar != null && gVar.mo1744b()) {
            this.f1218t.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1218t != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1717a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0287f fVar = (C0287f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1240f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0280b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0287f fVar = new C0287f(super.onSaveInstanceState());
        C0289g gVar = this.f1218t;
        fVar.f1240f = gVar != null && gVar.mo1744b();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0225h0 h0Var = this.f1215q;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0289g gVar = this.f1218t;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo1744b()) {
            return true;
        }
        mo1718b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1217s) {
            this.f1216r = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1218t != null) {
            Context context = this.f1214p;
            if (context == null) {
                context = getContext();
            }
            this.f1218t.mo1757p(new C0282d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            gVar.mo1753m(i);
            this.f1218t.mo1748f(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            gVar.mo1752l(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1218t != null) {
            this.f1219u = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            gVar.mo1745c(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1445a.m6446d(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0289g gVar = this.f1218t;
        if (gVar != null) {
            gVar.mo1751k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f1213o;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }
}
