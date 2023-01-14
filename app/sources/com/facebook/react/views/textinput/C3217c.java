package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C0241k;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.C2929d;
import com.facebook.react.uimanager.C3046u;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.views.text.C3163a;
import com.facebook.react.views.text.C3164a0;
import com.facebook.react.views.text.C3165b;
import com.facebook.react.views.text.C3167c;
import com.facebook.react.views.text.C3168c0;
import com.facebook.react.views.text.C3176f;
import com.facebook.react.views.text.C3189m;
import com.facebook.react.views.text.C3196r;
import com.facebook.react.views.text.C3200u;
import com.facebook.react.views.text.C3205z;
import com.facebook.react.views.view.C3244f;
import java.util.ArrayList;
import java.util.Iterator;
import p027c.p064i.p072j.C1988t;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.textinput.c */
public class C3217c extends C0241k {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final KeyListener f9054q = QwertyKeyListener.getInstanceForFullKeyboard();

    /* renamed from: A */
    private int f9055A;

    /* renamed from: B */
    protected boolean f9056B;

    /* renamed from: C */
    private Boolean f9057C;

    /* renamed from: D */
    private boolean f9058D;

    /* renamed from: E */
    private String f9059E;

    /* renamed from: F */
    private C3233p f9060F;

    /* renamed from: G */
    private C3215a f9061G;

    /* renamed from: H */
    private C3232o f9062H;

    /* renamed from: I */
    private final C3219b f9063I;

    /* renamed from: J */
    private boolean f9064J = false;

    /* renamed from: K */
    private boolean f9065K = false;

    /* renamed from: L */
    private C3205z f9066L;

    /* renamed from: M */
    private boolean f9067M = false;

    /* renamed from: N */
    private String f9068N = null;

    /* renamed from: O */
    private int f9069O = -1;

    /* renamed from: P */
    private int f9070P = -1;

    /* renamed from: Q */
    private boolean f9071Q = false;

    /* renamed from: R */
    private boolean f9072R = false;

    /* renamed from: S */
    private C3244f f9073S;

    /* renamed from: T */
    private final C2929d f9074T = new C2929d();

    /* renamed from: U */
    protected boolean f9075U = false;

    /* renamed from: V */
    protected boolean f9076V = false;

    /* renamed from: W */
    private C2945d f9077W;

    /* renamed from: r */
    private final InputMethodManager f9078r;

    /* renamed from: s */
    private final String f9079s = C3217c.class.getSimpleName();

    /* renamed from: t */
    protected boolean f9080t;

    /* renamed from: u */
    protected boolean f9081u = false;

    /* renamed from: v */
    private int f9082v;

    /* renamed from: w */
    private int f9083w;

    /* renamed from: x */
    protected int f9084x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ArrayList<TextWatcher> f9085y;

    /* renamed from: z */
    private C3220c f9086z;

    /* renamed from: com.facebook.react.views.textinput.c$a */
    class C3218a extends C3046u {
        C3218a() {
        }

        /* renamed from: j */
        public boolean mo3777j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.mo3777j(view, i, bundle);
            }
            int length = C3217c.this.getText().length();
            if (length > 0) {
                C3217c.this.setSelection(length);
            }
            return C3217c.this.m12599x();
        }
    }

    /* renamed from: com.facebook.react.views.textinput.c$b */
    private static class C3219b implements KeyListener {

        /* renamed from: a */
        private int f9088a = 0;

        /* renamed from: a */
        public void mo10565a(int i) {
            this.f9088a = i;
        }

        public void clearMetaKeyState(View view, Editable editable, int i) {
            C3217c.f9054q.clearMetaKeyState(view, editable, i);
        }

        public int getInputType() {
            return this.f9088a;
        }

        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return C3217c.f9054q.onKeyDown(view, editable, i, keyEvent);
        }

        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C3217c.f9054q.onKeyOther(view, editable, keyEvent);
        }

        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return C3217c.f9054q.onKeyUp(view, editable, i, keyEvent);
        }
    }

    /* renamed from: com.facebook.react.views.textinput.c$c */
    private class C3220c implements TextWatcher {
        private C3220c() {
        }

        /* synthetic */ C3220c(C3217c cVar, C3218a aVar) {
            this();
        }

        public void afterTextChanged(Editable editable) {
            C3217c cVar = C3217c.this;
            if (!cVar.f9081u && !cVar.f9080t && cVar.f9085y != null) {
                Iterator it = C3217c.this.f9085y.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).afterTextChanged(editable);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3217c cVar = C3217c.this;
            if (!cVar.f9081u && !cVar.f9080t && cVar.f9085y != null) {
                Iterator it = C3217c.this.f9085y.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3217c cVar = C3217c.this;
            if (!cVar.f9081u) {
                if (!cVar.f9080t && cVar.f9085y != null) {
                    Iterator it = C3217c.this.f9085y.iterator();
                    while (it.hasNext()) {
                        ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                    }
                }
                C3217c cVar2 = C3217c.this;
                cVar2.m12587E(!cVar2.f9080t && !cVar2.f9076V && i == 0 && i2 == 0);
            }
            C3217c.this.m12598v();
        }
    }

    public C3217c(Context context) {
        super(context);
        setFocusableInTouchMode(false);
        this.f9073S = new C3244f(this);
        this.f9078r = (InputMethodManager) C6409a.m24521c(context.getSystemService("input_method"));
        this.f9082v = getGravity() & 8388615;
        this.f9083w = getGravity() & 112;
        this.f9084x = 0;
        this.f9080t = false;
        this.f9057C = null;
        this.f9058D = false;
        this.f9085y = null;
        this.f9086z = null;
        this.f9055A = getInputType();
        this.f9063I = new C3219b();
        this.f9062H = null;
        this.f9066L = new C3205z();
        mo10507g();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27) {
            setLayerType(1, (Paint) null);
        }
        C1988t.m8394m0(this, new C3218a());
    }

    /* renamed from: C */
    private void m12586C() {
        ReactContext c = C3051u0.m12086c(this);
        if (!this.f9074T.mo9494b() && !c.isBridgeless()) {
            C3228k kVar = new C3228k(this);
            UIManagerModule uIManagerModule = (UIManagerModule) c.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), kVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m12587E(boolean z) {
        if (this.f9074T.mo9494b() && getId() != -1) {
            boolean z2 = true;
            if (z) {
                this.f9081u = true;
                m12594f(getText());
                this.f9081u = false;
            }
            Editable text = getText();
            if (text == null || text.length() <= 0) {
                z2 = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z2) {
                try {
                    spannableStringBuilder.append(text.subSequence(0, text.length()));
                } catch (IndexOutOfBoundsException e) {
                    ReactSoftExceptionLogger.logSoftException(this.f9079s, e);
                }
            }
            if (!z2) {
                spannableStringBuilder.append((getHint() == null || getHint().length() <= 0) ? "I" : getHint());
                m12594f(spannableStringBuilder);
            }
            C3168c0.m12441h(getId(), spannableStringBuilder);
        }
    }

    /* renamed from: F */
    private void m12588F() {
        String str = this.f9059E;
        int i = 5;
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        c = 0;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 2;
                    break;
                case 4:
                    break;
                case 5:
                    i = 1;
                    break;
                case 6:
                    i = 4;
                    break;
            }
        }
        i = 6;
        if (this.f9058D) {
            setImeOptions(33554432 | i);
        } else {
            setImeOptions(i);
        }
    }

    /* renamed from: f */
    private void m12594f(Spannable spannable) {
        if (this.f9074T.mo9494b()) {
            boolean z = this.f9075U;
            this.f9075U = true;
            int length = spannable.length();
            int i = 0;
            for (Object obj : spannable.getSpans(0, length(), Object.class)) {
                int spanFlags = spannable.getSpanFlags(obj);
                if (((spanFlags & 18) == 18 || (spanFlags & 17) == 17) && (obj instanceof C3189m) && spannable.getSpanStart(obj) == 0 && spannable.getSpanEnd(obj) == length) {
                    spannable.removeSpan(obj);
                }
            }
            ArrayList<C3168c0.C3169a> arrayList = new ArrayList<>();
            if (!Float.isNaN(this.f9066L.mo10426i())) {
                arrayList.add(new C3168c0.C3169a(0, length, new C3163a(this.f9066L.mo10426i())));
            }
            arrayList.add(new C3168c0.C3169a(0, length, new C3176f(this.f9066L.mo10420c())));
            if (!(this.f9070P == -1 && this.f9069O == -1 && this.f9068N == null)) {
                arrayList.add(new C3168c0.C3169a(0, length, new C3167c(this.f9070P, this.f9069O, (String) null, this.f9068N, C3051u0.m12086c(this).getAssets())));
            }
            if (!Float.isNaN(this.f9066L.mo10422e())) {
                arrayList.add(new C3168c0.C3169a(0, length, new C3165b(this.f9066L.mo10422e())));
            }
            for (C3168c0.C3169a a : arrayList) {
                a.mo10326a(spannable, i);
                i++;
            }
            this.f9075U = z;
        }
    }

    private C3220c getTextWatcherDelegator() {
        if (this.f9086z == null) {
            this.f9086z = new C3220c(this, (C3218a) null);
        }
        return this.f9086z;
    }

    /* renamed from: i */
    private int m12595i(int i) {
        return Math.max(0, Math.min(i, getText() == null ? 0 : getText().length()));
    }

    /* renamed from: o */
    private boolean m12596o() {
        return (getInputType() & 144) != 0;
    }

    /* renamed from: p */
    private void m12597p(SpannableStringBuilder spannableStringBuilder, boolean z) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (Object obj : spans) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z2 = (spanFlags & 33) == 33;
            if (obj instanceof C3189m) {
                getText().removeSpan(obj);
            }
            if (z2) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (m12600y(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        if (!z) {
            m12594f(getText());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m12598v() {
        C3215a aVar = this.f9061G;
        if (aVar != null) {
            aVar.mo10495a();
        }
        m12586C();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public boolean m12599x() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, (Rect) null);
        if (getShowSoftInputOnFocus()) {
            mo10503D();
        }
        return requestFocus;
    }

    /* renamed from: y */
    private static boolean m12600y(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: A */
    public void mo10501A(float f, int i) {
        this.f9073S.mo10648e(f, i);
    }

    /* renamed from: B */
    public void mo10502B(int i, float f) {
        this.f9073S.mo10650g(i, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo10503D() {
        return this.f9078r.showSoftInput(this, 0);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f9085y == null) {
            this.f9085y = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f9085y.add(textWatcher);
    }

    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        mo10518l();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        C3168c0.m12437d(getId());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo10507g() {
        setTextSize(0, (float) this.f9066L.mo10420c());
        float d = this.f9066L.mo10421d();
        if (!Float.isNaN(d)) {
            setLetterSpacing(d);
        }
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.f9057C;
        return bool == null ? !mo10520n() : bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.f9058D;
    }

    public C2929d getFabricViewStateManager() {
        return this.f9074T;
    }

    public String getReturnKeyType() {
        return this.f9059E;
    }

    /* access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.f9055A;
    }

    /* renamed from: h */
    public boolean mo10513h(int i) {
        return i >= this.f9084x;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f9056B) {
            Editable text = getText();
            for (C3164a0 a : (C3164a0[]) text.getSpans(0, text.length(), C3164a0.class)) {
                if (a.mo10311a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public boolean isLayoutRequested() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10516j() {
        clearFocus();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10517k() {
        if (getInputType() != this.f9055A) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f9055A);
            setSelection(selectionStart, selectionEnd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo10518l() {
        this.f9078r.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* renamed from: m */
    public int mo10519m() {
        int i = this.f9084x + 1;
        this.f9084x = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10520n() {
        return (getInputType() & 131072) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.f9056B) {
            Editable text = getText();
            for (C3164a0 c : (C3164a0[]) text.getSpans(0, text.length(), C3164a0.class)) {
                c.mo10313c();
            }
        }
        if (this.f9071Q && !this.f9072R) {
            m12599x();
        }
        this.f9072R = true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext c = C3051u0.m12086c(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f9065K) {
            onCreateInputConnection = new C3221d(onCreateInputConnection, c, this, this.f9077W);
        }
        if (mo10520n() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9056B) {
            Editable text = getText();
            for (C3164a0 d : (C3164a0[]) text.getSpans(0, text.length(), C3164a0.class)) {
                d.mo10314d();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f9056B) {
            Editable text = getText();
            for (C3164a0 e : (C3164a0[]) text.getSpans(0, text.length(), C3164a0.class)) {
                e.mo10315e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        C3233p pVar;
        super.onFocusChanged(z, i, rect);
        if (z && (pVar = this.f9060F) != null) {
            pVar.mo10497a(getSelectionStart(), getSelectionEnd());
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || mo10520n()) {
            return super.onKeyUp(i, keyEvent);
        }
        mo10518l();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m12598v();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C3232o oVar = this.f9062H;
        if (oVar != null) {
            oVar.mo10496a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (!this.f9081u && this.f9060F != null && hasFocus()) {
            this.f9060F.mo10497a(i, i2);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f9056B) {
            Editable text = getText();
            for (C3164a0 f : (C3164a0[]) text.getSpans(0, text.length(), C3164a0.class)) {
                f.mo10316f();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9064J = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f9064J) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f9064J = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: q */
    public void mo10531q(int i, int i2, int i3) {
        if (mo10513h(i) && i2 != -1 && i3 != -1) {
            setSelection(m12595i(i2), m12595i(i3));
        }
    }

    /* renamed from: r */
    public void mo10532r(C3196r rVar) {
        if ((!m12596o() || !TextUtils.equals(getText(), rVar.mo10385k())) && mo10513h(rVar.mo10377c())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.mo10385k());
            m12597p(spannableStringBuilder, rVar.f8964m);
            this.f9056B = rVar.mo10376b();
            this.f9075U = true;
            if (rVar.mo10385k().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.f9075U = false;
            if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != rVar.mo10387m()) {
                setBreakStrategy(rVar.mo10387m());
            }
            m12587E(false);
        }
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.f9085y;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f9085y.isEmpty()) {
                this.f9085y = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    /* renamed from: s */
    public void mo10535s(C3196r rVar) {
        this.f9080t = true;
        mo10532r(rVar);
        this.f9080t = false;
    }

    public void setAllowFontScaling(boolean z) {
        if (this.f9066L.mo10419b() != z) {
            this.f9066L.mo10430m(z);
            mo10507g();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f9071Q = z;
    }

    public void setBackgroundColor(int i) {
        this.f9073S.mo10645b(i);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.f9057C = bool;
    }

    public void setBorderRadius(float f) {
        this.f9073S.mo10647d(f);
    }

    public void setBorderStyle(String str) {
        this.f9073S.mo10649f(str);
    }

    public void setContentSizeWatcher(C3215a aVar) {
        this.f9061G = aVar;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.f9058D = z;
        m12588F();
    }

    /* access modifiers changed from: package-private */
    public void setEventDispatcher(C2945d dVar) {
        this.f9077W = dVar;
    }

    public void setFontFamily(String str) {
        this.f9068N = str;
        this.f9067M = true;
    }

    public void setFontSize(float f) {
        this.f9066L.mo10431n(f);
        mo10507g();
    }

    public void setFontStyle(String str) {
        int b = C3200u.m12521b(str);
        if (b != this.f9070P) {
            this.f9070P = b;
            this.f9067M = true;
        }
    }

    public void setFontWeight(String str) {
        int d = C3200u.m12523d(str);
        if (d != this.f9069O) {
            this.f9069O = d;
            this.f9067M = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f9082v;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    /* access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f9083w;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.f9055A = i;
        super.setTypeface(typeface);
        if (mo10520n()) {
            setSingleLine(false);
        }
        this.f9063I.mo10565a(i);
        setKeyListener(this.f9063I);
    }

    public void setLetterSpacingPt(float f) {
        this.f9066L.mo10433p(f);
        mo10507g();
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f9066L.mo10428k()) {
            this.f9066L.mo10435r(f);
            mo10507g();
        }
    }

    public void setOnKeyPress(boolean z) {
        this.f9065K = z;
    }

    public void setReturnKeyType(String str) {
        this.f9059E = str;
        m12588F();
    }

    public void setScrollWatcher(C3232o oVar) {
        this.f9062H = oVar;
    }

    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public void setSelectionWatcher(C3233p pVar) {
        this.f9060F = pVar;
    }

    /* access modifiers changed from: package-private */
    public void setStagedInputType(int i) {
        this.f9055A = i;
    }

    /* renamed from: t */
    public void mo10560t(C3196r rVar) {
        this.f9076V = true;
        mo10532r(rVar);
        this.f9076V = false;
    }

    /* renamed from: u */
    public void mo10561u() {
        if (this.f9067M) {
            this.f9067M = false;
            setTypeface(C3200u.m12520a(getTypeface(), this.f9070P, this.f9069O, this.f9068N, getContext().getAssets()));
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f9056B) {
            Editable text = getText();
            for (C3164a0 a : (C3164a0[]) text.getSpans(0, text.length(), C3164a0.class)) {
                if (a.mo10311a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* renamed from: w */
    public void mo10563w() {
        m12599x();
    }

    /* renamed from: z */
    public void mo10564z(int i, float f, float f2) {
        this.f9073S.mo10646c(i, f, f2);
    }
}
