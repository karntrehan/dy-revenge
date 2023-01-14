package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import p027c.p028a.C1435a;
import p027c.p028a.C1438d;
import p027c.p028a.C1440f;
import p027c.p028a.C1441g;
import p027c.p028a.C1442h;
import p027c.p028a.C1444j;
import p027c.p028a.p035o.C1468c;
import p027c.p064i.p072j.C1988t;
import p027c.p075j.p076a.C2013a;
import p027c.p077k.p078a.C2019a;

public class SearchView extends C0229i0 implements C1468c {

    /* renamed from: C */
    static final C0176n f728C = (Build.VERSION.SDK_INT < 29 ? new C0176n() : null);

    /* renamed from: A0 */
    private final TextView.OnEditorActionListener f729A0;

    /* renamed from: B0 */
    private final AdapterView.OnItemClickListener f730B0;

    /* renamed from: C0 */
    private final AdapterView.OnItemSelectedListener f731C0;

    /* renamed from: D */
    final SearchAutoComplete f732D;

    /* renamed from: D0 */
    private TextWatcher f733D0;

    /* renamed from: E */
    private final View f734E;

    /* renamed from: F */
    private final View f735F;

    /* renamed from: G */
    private final View f736G;

    /* renamed from: H */
    final ImageView f737H;

    /* renamed from: I */
    final ImageView f738I;

    /* renamed from: J */
    final ImageView f739J;

    /* renamed from: K */
    final ImageView f740K;

    /* renamed from: L */
    private final View f741L;

    /* renamed from: M */
    private C0179p f742M;

    /* renamed from: N */
    private Rect f743N;

    /* renamed from: O */
    private Rect f744O;

    /* renamed from: P */
    private int[] f745P;

    /* renamed from: Q */
    private int[] f746Q;

    /* renamed from: R */
    private final ImageView f747R;

    /* renamed from: S */
    private final Drawable f748S;

    /* renamed from: T */
    private final int f749T;

    /* renamed from: U */
    private final int f750U;

    /* renamed from: V */
    private final Intent f751V;

    /* renamed from: W */
    private final Intent f752W;

    /* renamed from: a0 */
    private final CharSequence f753a0;

    /* renamed from: b0 */
    private C0174l f754b0;

    /* renamed from: c0 */
    private C0173k f755c0;

    /* renamed from: d0 */
    View.OnFocusChangeListener f756d0;

    /* renamed from: e0 */
    private C0175m f757e0;

    /* renamed from: f0 */
    private View.OnClickListener f758f0;

    /* renamed from: g0 */
    private boolean f759g0;

    /* renamed from: h0 */
    private boolean f760h0;

    /* renamed from: i0 */
    C2013a f761i0;

    /* renamed from: j0 */
    private boolean f762j0;

    /* renamed from: k0 */
    private CharSequence f763k0;

    /* renamed from: l0 */
    private boolean f764l0;

    /* renamed from: m0 */
    private boolean f765m0;

    /* renamed from: n0 */
    private int f766n0;

    /* renamed from: o0 */
    private boolean f767o0;

    /* renamed from: p0 */
    private CharSequence f768p0;

    /* renamed from: q0 */
    private CharSequence f769q0;

    /* renamed from: r0 */
    private boolean f770r0;

    /* renamed from: s0 */
    private int f771s0;

    /* renamed from: t0 */
    SearchableInfo f772t0;

    /* renamed from: u0 */
    private Bundle f773u0;

    /* renamed from: v0 */
    private final Runnable f774v0;

    /* renamed from: w0 */
    private Runnable f775w0;

    /* renamed from: x0 */
    private final WeakHashMap<String, Drawable.ConstantState> f776x0;

    /* renamed from: y0 */
    private final View.OnClickListener f777y0;

    /* renamed from: z0 */
    View.OnKeyListener f778z0;

    public static class SearchAutoComplete extends C0211d {

        /* renamed from: q */
        private int f779q;

        /* renamed from: r */
        private SearchView f780r;

        /* renamed from: s */
        private boolean f781s;

        /* renamed from: t */
        final Runnable f782t;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0162a implements Runnable {
            C0162a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1062c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1435a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f782t = new C0162a();
            this.f779q = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1060a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f728C.mo1095c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1061b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1062c() {
            if (this.f781s) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f781s = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f779q <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f781s) {
                removeCallbacks(this.f782t);
                post(this.f782t);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f780r.mo1026Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f780r.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f780r.hasFocus() && getVisibility() == 0) {
                this.f781s = true;
                if (SearchView.m866M(getContext())) {
                    mo1060a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f781s = false;
                removeCallbacks(this.f782t);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f781s = false;
                removeCallbacks(this.f782t);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f781s = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f780r = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f779q = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0163a implements TextWatcher {
        C0163a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1025Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0164b implements Runnable {
        C0164b() {
        }

        public void run() {
            SearchView.this.mo1030f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0165c implements Runnable {
        C0165c() {
        }

        public void run() {
            C2013a aVar = SearchView.this.f761i0;
            if (aVar instanceof C0265q0) {
                aVar.mo1625a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0166d implements View.OnFocusChangeListener {
        C0166d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f756d0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0167e implements View.OnLayoutChangeListener {
        C0167e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1014B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0168f implements View.OnClickListener {
        C0168f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f737H) {
                searchView.mo1022V();
            } else if (view == searchView.f739J) {
                searchView.mo1018R();
            } else if (view == searchView.f738I) {
                searchView.mo1023W();
            } else if (view == searchView.f740K) {
                searchView.mo1027a0();
            } else if (view == searchView.f732D) {
                searchView.mo1015H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0169g implements View.OnKeyListener {
        C0169g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f772t0 == null) {
                return false;
            }
            if (searchView.f732D.isPopupShowing() && SearchView.this.f732D.getListSelection() != -1) {
                return SearchView.this.mo1024X(view, i, keyEvent);
            }
            if (SearchView.this.f732D.mo1061b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1017P(0, (String) null, searchView2.f732D.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0170h implements TextView.OnEditorActionListener {
        C0170h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1023W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0171i implements AdapterView.OnItemClickListener {
        C0171i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1019S(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0172j implements AdapterView.OnItemSelectedListener {
        C0172j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1020T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0173k {
        /* renamed from: a */
        boolean mo1088a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0174l {
        /* renamed from: a */
        boolean mo1089a(String str);

        /* renamed from: b */
        boolean mo1090b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0175m {
        /* renamed from: a */
        boolean mo1091a(int i);

        /* renamed from: b */
        boolean mo1092b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0176n {

        /* renamed from: a */
        private Method f794a = null;

        /* renamed from: b */
        private Method f795b = null;

        /* renamed from: c */
        private Method f796c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0176n() {
            m905d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f794a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f795b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f796c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m905d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1093a(AutoCompleteTextView autoCompleteTextView) {
            m905d();
            Method method = this.f795b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1094b(AutoCompleteTextView autoCompleteTextView) {
            m905d();
            Method method = this.f794a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1095c(AutoCompleteTextView autoCompleteTextView) {
            m905d();
            Method method = this.f796c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    static class C0177o extends C2019a {
        public static final Parcelable.Creator<C0177o> CREATOR = new C0178a();

        /* renamed from: p */
        boolean f797p;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        class C0178a implements Parcelable.ClassLoaderCreator<C0177o> {
            C0178a() {
            }

            /* renamed from: a */
            public C0177o createFromParcel(Parcel parcel) {
                return new C0177o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0177o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0177o(parcel, classLoader);
            }

            /* renamed from: c */
            public C0177o[] newArray(int i) {
                return new C0177o[i];
            }
        }

        public C0177o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f797p = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0177o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f797p + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f797p));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0179p extends TouchDelegate {

        /* renamed from: a */
        private final View f798a;

        /* renamed from: b */
        private final Rect f799b = new Rect();

        /* renamed from: c */
        private final Rect f800c = new Rect();

        /* renamed from: d */
        private final Rect f801d = new Rect();

        /* renamed from: e */
        private final int f802e;

        /* renamed from: f */
        private boolean f803f;

        public C0179p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f802e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1104a(rect, rect2);
            this.f798a = view;
        }

        /* renamed from: a */
        public void mo1104a(Rect rect, Rect rect2) {
            this.f799b.set(rect);
            this.f801d.set(rect);
            Rect rect3 = this.f801d;
            int i = this.f802e;
            rect3.inset(-i, -i);
            this.f800c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f803f
                r7.f803f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f803f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f801d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f799b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f803f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f800c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f798a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f798a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f800c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f798a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0179p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f743N = new Rect();
        this.f744O = new Rect();
        this.f745P = new int[2];
        this.f746Q = new int[2];
        this.f774v0 = new C0164b();
        this.f775w0 = new C0165c();
        this.f776x0 = new WeakHashMap<>();
        C0168f fVar = new C0168f();
        this.f777y0 = fVar;
        this.f778z0 = new C0169g();
        C0170h hVar = new C0170h();
        this.f729A0 = hVar;
        C0171i iVar = new C0171i();
        this.f730B0 = iVar;
        C0172j jVar = new C0172j();
        this.f731C0 = jVar;
        this.f733D0 = new C0163a();
        C0292x0 v = C0292x0.m1407v(context, attributeSet, C1444j.f4372i2, i, 0);
        LayoutInflater.from(context).inflate(v.mo1797n(C1444j.f4422s2, C1441g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1440f.search_src_text);
        this.f732D = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f734E = findViewById(C1440f.search_edit_frame);
        View findViewById = findViewById(C1440f.search_plate);
        this.f735F = findViewById;
        View findViewById2 = findViewById(C1440f.submit_area);
        this.f736G = findViewById2;
        ImageView imageView = (ImageView) findViewById(C1440f.search_button);
        this.f737H = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1440f.search_go_btn);
        this.f738I = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1440f.search_close_btn);
        this.f739J = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C1440f.search_voice_btn);
        this.f740K = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C1440f.search_mag_icon);
        this.f747R = imageView5;
        C1988t.m8400p0(findViewById, v.mo1790g(C1444j.f4427t2));
        C1988t.m8400p0(findViewById2, v.mo1790g(C1444j.f4447x2));
        int i2 = C1444j.f4442w2;
        imageView.setImageDrawable(v.mo1790g(i2));
        imageView2.setImageDrawable(v.mo1790g(C1444j.f4412q2));
        imageView3.setImageDrawable(v.mo1790g(C1444j.f4397n2));
        imageView4.setImageDrawable(v.mo1790g(C1444j.f4457z2));
        imageView5.setImageDrawable(v.mo1790g(i2));
        this.f748S = v.mo1790g(C1444j.f4437v2);
        C0299z0.m1497a(imageView, getResources().getString(C1442h.abc_searchview_description_search));
        this.f749T = v.mo1797n(C1444j.f4452y2, C1441g.abc_search_dropdown_item_icons_2line);
        this.f750U = v.mo1797n(C1444j.f4402o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f733D0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f778z0);
        searchAutoComplete.setOnFocusChangeListener(new C0166d());
        setIconifiedByDefault(v.mo1784a(C1444j.f4417r2, true));
        int f = v.mo1789f(C1444j.f4382k2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f753a0 = v.mo1799p(C1444j.f4407p2);
        this.f763k0 = v.mo1799p(C1444j.f4432u2);
        int k = v.mo1794k(C1444j.f4392m2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo1794k(C1444j.f4387l2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo1784a(C1444j.f4377j2, true));
        v.mo1803w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f751V = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f752W = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f741L = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0167e());
        }
        m877k0(this.f759g0);
        m873g0();
    }

    /* renamed from: C */
    private Intent m858C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f769q0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f773u0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f772t0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m859D(Cursor cursor, int i, String str) {
        int i2;
        String o;
        try {
            String o2 = C0265q0.m1313o(cursor, "suggest_intent_action");
            if (o2 == null) {
                o2 = this.f772t0.getSuggestIntentAction();
            }
            if (o2 == null) {
                o2 = "android.intent.action.SEARCH";
            }
            String str2 = o2;
            String o3 = C0265q0.m1313o(cursor, "suggest_intent_data");
            if (o3 == null) {
                o3 = this.f772t0.getSuggestIntentData();
            }
            if (!(o3 == null || (o = C0265q0.m1313o(cursor, "suggest_intent_data_id")) == null)) {
                o3 = o3 + "/" + Uri.encode(o);
            }
            return m858C(str2, o3 == null ? null : Uri.parse(o3), C0265q0.m1313o(cursor, "suggest_intent_extra_data"), C0265q0.m1313o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m860E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f773u0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m861F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m862G() {
        this.f732D.dismissDropDown();
    }

    /* renamed from: I */
    private void m863I(View view, Rect rect) {
        view.getLocationInWindow(this.f745P);
        getLocationInWindow(this.f746Q);
        int[] iArr = this.f745P;
        int i = iArr[1];
        int[] iArr2 = this.f746Q;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m864J(CharSequence charSequence) {
        if (!this.f759g0 || this.f748S == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f732D.getTextSize()) * 1.25d);
        this.f748S.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f748S), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m865K() {
        SearchableInfo searchableInfo = this.f772t0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f772t0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f751V;
        } else if (this.f772t0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f752W;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m866M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m867N() {
        return (this.f762j0 || this.f767o0) && !mo1016L();
    }

    /* renamed from: O */
    private void m868O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m869Q(int i, int i2, String str) {
        Cursor b = this.f761i0.mo6710b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m868O(m859D(b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m870b0() {
        post(this.f774v0);
    }

    /* renamed from: c0 */
    private void m871c0(int i) {
        CharSequence c;
        Editable text = this.f732D.getText();
        Cursor b = this.f761i0.mo6710b();
        if (b != null) {
            if (!b.moveToPosition(i) || (c = this.f761i0.mo1626c(b)) == null) {
                setQuery(text);
            } else {
                setQuery(c);
            }
        }
    }

    /* renamed from: e0 */
    private void m872e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f732D.getText());
        int i = 0;
        if (!z2 && (!this.f759g0 || this.f770r0)) {
            z = false;
        }
        ImageView imageView = this.f739J;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f739J.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m873g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f732D;
        if (queryHint == null) {
            queryHint = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        searchAutoComplete.setHint(m864J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1438d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1438d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m874h0() {
        this.f732D.setThreshold(this.f772t0.getSuggestThreshold());
        this.f732D.setImeOptions(this.f772t0.getImeOptions());
        int inputType = this.f772t0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f772t0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f732D.setInputType(inputType);
        C2013a aVar = this.f761i0;
        if (aVar != null) {
            aVar.mo1625a((Cursor) null);
        }
        if (this.f772t0.getSuggestAuthority() != null) {
            C0265q0 q0Var = new C0265q0(getContext(), this, this.f772t0, this.f776x0);
            this.f761i0 = q0Var;
            this.f732D.setAdapter(q0Var);
            C0265q0 q0Var2 = (C0265q0) this.f761i0;
            if (this.f764l0) {
                i = 2;
            }
            q0Var2.mo1638x(i);
        }
    }

    /* renamed from: i0 */
    private void m875i0() {
        this.f736G.setVisibility((!m867N() || !(this.f738I.getVisibility() == 0 || this.f740K.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m876j0(boolean z) {
        this.f738I.setVisibility((!this.f762j0 || !m867N() || !hasFocus() || (!z && this.f767o0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m877k0(boolean z) {
        this.f760h0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f732D.getText());
        this.f737H.setVisibility(i2);
        m876j0(z2);
        this.f734E.setVisibility(z ? 8 : 0);
        if (this.f747R.getDrawable() == null || this.f759g0) {
            i = 8;
        }
        this.f747R.setVisibility(i);
        m872e0();
        m878l0(!z2);
        m875i0();
    }

    /* renamed from: l0 */
    private void m878l0(boolean z) {
        int i = 8;
        if (this.f767o0 && !mo1016L() && z) {
            this.f738I.setVisibility(8);
            i = 0;
        }
        this.f740K.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f732D.setText(charSequence);
        this.f732D.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1014B() {
        if (this.f741L.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f735F.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0213d1.m1104b(this);
            int dimensionPixelSize = this.f759g0 ? resources.getDimensionPixelSize(C1438d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C1438d.abc_dropdownitem_text_padding_left) : 0;
            this.f732D.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f732D.setDropDownHorizontalOffset(b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f732D.setDropDownWidth((((this.f741L.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1015H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f732D.refreshAutoCompleteResults();
            return;
        }
        C0176n nVar = f728C;
        nVar.mo1094b(this.f732D);
        nVar.mo1093a(this.f732D);
    }

    /* renamed from: L */
    public boolean mo1016L() {
        return this.f760h0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1017P(int i, String str, String str2) {
        getContext().startActivity(m858C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1018R() {
        if (!TextUtils.isEmpty(this.f732D.getText())) {
            this.f732D.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f732D.requestFocus();
            this.f732D.setImeVisibility(true);
        } else if (this.f759g0) {
            C0173k kVar = this.f755c0;
            if (kVar == null || !kVar.mo1088a()) {
                clearFocus();
                m877k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1019S(int i, int i2, String str) {
        C0175m mVar = this.f757e0;
        if (mVar != null && mVar.mo1092b(i)) {
            return false;
        }
        m869Q(i, 0, (String) null);
        this.f732D.setImeVisibility(false);
        m862G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1020T(int i) {
        C0175m mVar = this.f757e0;
        if (mVar != null && mVar.mo1091a(i)) {
            return false;
        }
        m871c0(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1021U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1022V() {
        m877k0(false);
        this.f732D.requestFocus();
        this.f732D.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f758f0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1023W() {
        Editable text = this.f732D.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0174l lVar = this.f754b0;
            if (lVar == null || !lVar.mo1090b(text.toString())) {
                if (this.f772t0 != null) {
                    mo1017P(0, (String) null, text.toString());
                }
                this.f732D.setImeVisibility(false);
                m862G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1024X(View view, int i, KeyEvent keyEvent) {
        if (this.f772t0 != null && this.f761i0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1019S(this.f732D.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f732D.setSelection(i == 21 ? 0 : this.f732D.length());
                this.f732D.setListSelection(0);
                this.f732D.clearListSelection();
                this.f732D.mo1060a();
                return true;
            } else if (i != 19 || this.f732D.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1025Y(CharSequence charSequence) {
        Editable text = this.f732D.getText();
        this.f769q0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m876j0(z);
        m878l0(!z);
        m872e0();
        m875i0();
        if (this.f754b0 != null && !TextUtils.equals(charSequence, this.f768p0)) {
            this.f754b0.mo1089a(charSequence.toString());
        }
        this.f768p0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1026Z() {
        m877k0(mo1016L());
        m870b0();
        if (this.f732D.hasFocus()) {
            mo1015H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1027a0() {
        Intent E;
        SearchableInfo searchableInfo = this.f772t0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    E = m861F(this.f751V, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    E = m860E(this.f752W, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(E);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: c */
    public void mo788c() {
        if (!this.f770r0) {
            this.f770r0 = true;
            int imeOptions = this.f732D.getImeOptions();
            this.f771s0 = imeOptions;
            this.f732D.setImeOptions(imeOptions | 33554432);
            this.f732D.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f765m0 = true;
        super.clearFocus();
        this.f732D.clearFocus();
        this.f732D.setImeVisibility(false);
        this.f765m0 = false;
    }

    /* renamed from: d0 */
    public void mo1029d0(CharSequence charSequence, boolean z) {
        this.f732D.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f732D;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f769q0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1023W();
        }
    }

    /* renamed from: f */
    public void mo789f() {
        mo1029d0(HttpUrl.FRAGMENT_ENCODE_SET, false);
        clearFocus();
        m877k0(true);
        this.f732D.setImeOptions(this.f771s0);
        this.f770r0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1030f0() {
        int[] iArr = this.f732D.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f735F.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f736G.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f732D.getImeOptions();
    }

    public int getInputType() {
        return this.f732D.getInputType();
    }

    public int getMaxWidth() {
        return this.f766n0;
    }

    public CharSequence getQuery() {
        return this.f732D.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f763k0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f772t0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f753a0 : getContext().getText(this.f772t0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f750U;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f749T;
    }

    public C2013a getSuggestionsAdapter() {
        return this.f761i0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f774v0);
        post(this.f775w0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m863I(this.f732D, this.f743N);
            Rect rect = this.f744O;
            Rect rect2 = this.f743N;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0179p pVar = this.f742M;
            if (pVar == null) {
                C0179p pVar2 = new C0179p(this.f744O, this.f743N, this.f732D);
                this.f742M = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo1104a(this.f744O, this.f743N);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo1016L()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f766n0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f766n0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f766n0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0177o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0177o oVar = (C0177o) parcelable;
        super.onRestoreInstanceState(oVar.mo6726a());
        m877k0(oVar.f797p);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0177o oVar = new C0177o(super.onSaveInstanceState());
        oVar.f797p = mo1016L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m870b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f765m0 || !isFocusable()) {
            return false;
        }
        if (mo1016L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f732D.requestFocus(i, rect);
        if (requestFocus) {
            m877k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f773u0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1018R();
        } else {
            mo1022V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f759g0 != z) {
            this.f759g0 = z;
            m877k0(z);
            m873g0();
        }
    }

    public void setImeOptions(int i) {
        this.f732D.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f732D.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f766n0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0173k kVar) {
        this.f755c0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f756d0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0174l lVar) {
        this.f754b0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f758f0 = onClickListener;
    }

    public void setOnSuggestionListener(C0175m mVar) {
        this.f757e0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f763k0 = charSequence;
        m873g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f764l0 = z;
        C2013a aVar = this.f761i0;
        if (aVar instanceof C0265q0) {
            ((C0265q0) aVar).mo1638x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f772t0 = searchableInfo;
        if (searchableInfo != null) {
            m874h0();
            m873g0();
        }
        boolean K = m865K();
        this.f767o0 = K;
        if (K) {
            this.f732D.setPrivateImeOptions("nm");
        }
        m877k0(mo1016L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f762j0 = z;
        m877k0(mo1016L());
    }

    public void setSuggestionsAdapter(C2013a aVar) {
        this.f761i0 = aVar;
        this.f732D.setAdapter(aVar);
    }
}
