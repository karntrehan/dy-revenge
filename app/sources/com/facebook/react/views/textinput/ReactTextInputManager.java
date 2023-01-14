package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C1135a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p116f0.p118b.C2762c;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C2929d;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3025n0;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import com.facebook.react.views.scroll.C3146h;
import com.facebook.react.views.scroll.C3147i;
import com.facebook.react.views.text.C3164a0;
import com.facebook.react.views.text.C3168c0;
import com.facebook.react.views.text.C3170d;
import com.facebook.react.views.text.C3174e0;
import com.facebook.react.views.text.C3181h;
import com.facebook.react.views.text.C3196r;
import com.facebook.react.views.text.C3199t;
import com.facebook.react.views.text.C3204y;
import com.facebook.yoga.C3307g;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

@C2639a(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager<C3217c, C2987j> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final String[] DRAWABLE_FIELDS = {"mCursorDrawable", "mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    private static final String[] DRAWABLE_RESOURCES = {"mCursorDrawableRes", "mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new C3206a();
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    protected C3199t mReactTextViewManagerCallback;

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$a */
    static class C3206a extends HashMap<String, String> {
        C3206a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put("email", "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$b */
    class C3207b implements View.OnLongClickListener {

        /* renamed from: f */
        final /* synthetic */ boolean f9022f;

        C3207b(boolean z) {
            this.f9022f = z;
        }

        public boolean onLongClick(View view) {
            return this.f9022f;
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$c */
    class C3208c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3031o0 f9024a;

        /* renamed from: b */
        final /* synthetic */ C3217c f9025b;

        C3208c(C3031o0 o0Var, C3217c cVar) {
            this.f9024a = o0Var;
            this.f9025b = cVar;
        }

        public void onFocusChange(View view, boolean z) {
            C2944c cVar;
            int c = this.f9024a.mo9808c();
            C2945d access$000 = ReactTextInputManager.getEventDispatcher(this.f9024a, this.f9025b);
            if (z) {
                cVar = new C3226i(c, this.f9025b.getId());
            } else {
                access$000.mo9651c(new C3223f(c, this.f9025b.getId()));
                cVar = new C3224g(c, this.f9025b.getId(), this.f9025b.getText().toString());
            }
            access$000.mo9651c(cVar);
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$d */
    class C3209d implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C3217c f9027a;

        /* renamed from: b */
        final /* synthetic */ C3031o0 f9028b;

        C3209d(C3217c cVar, C3031o0 o0Var) {
            this.f9027a = cVar;
            this.f9028b = o0Var;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i & 255) == 0 && i != 0) {
                return true;
            }
            boolean blurOnSubmit = this.f9027a.getBlurOnSubmit();
            boolean n = this.f9027a.mo10520n();
            ReactTextInputManager.getEventDispatcher(this.f9028b, this.f9027a).mo9651c(new C3231n(this.f9028b.mo9808c(), this.f9027a.getId(), this.f9027a.getText().toString()));
            if (blurOnSubmit) {
                this.f9027a.clearFocus();
            }
            return blurOnSubmit || !n || i == 5 || i == 7;
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$e */
    private static class C3210e implements C3215a {

        /* renamed from: a */
        private C3217c f9030a;

        /* renamed from: b */
        private C2945d f9031b;

        /* renamed from: c */
        private int f9032c = 0;

        /* renamed from: d */
        private int f9033d = 0;

        /* renamed from: e */
        private int f9034e;

        public C3210e(C3217c cVar) {
            this.f9030a = cVar;
            ReactContext c = C3051u0.m12086c(cVar);
            this.f9031b = ReactTextInputManager.getEventDispatcher(c, cVar);
            this.f9034e = C3051u0.m12087d(c);
        }

        /* renamed from: a */
        public void mo10495a() {
            if (this.f9031b != null) {
                int width = this.f9030a.getWidth();
                int height = this.f9030a.getHeight();
                if (this.f9030a.getLayout() != null) {
                    width = this.f9030a.getCompoundPaddingLeft() + this.f9030a.getLayout().getWidth() + this.f9030a.getCompoundPaddingRight();
                    height = this.f9030a.getCompoundPaddingTop() + this.f9030a.getLayout().getHeight() + this.f9030a.getCompoundPaddingBottom();
                }
                if (width != this.f9032c || height != this.f9033d) {
                    this.f9033d = height;
                    this.f9032c = width;
                    this.f9031b.mo9651c(new C3216b(this.f9034e, this.f9030a.getId(), C3038r.m12004a((float) width), C3038r.m12004a((float) height)));
                }
            }
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$f */
    private static class C3211f implements C3232o {

        /* renamed from: a */
        private C3217c f9035a;

        /* renamed from: b */
        private C2945d f9036b;

        /* renamed from: c */
        private int f9037c;

        /* renamed from: d */
        private int f9038d;

        /* renamed from: e */
        private int f9039e;

        public C3211f(C3217c cVar) {
            this.f9035a = cVar;
            ReactContext c = C3051u0.m12086c(cVar);
            this.f9036b = ReactTextInputManager.getEventDispatcher(c, cVar);
            this.f9039e = C3051u0.m12087d(c);
        }

        /* renamed from: a */
        public void mo10496a(int i, int i2, int i3, int i4) {
            if (this.f9037c != i || this.f9038d != i2) {
                this.f9036b.mo9651c(C3146h.m12378v(this.f9039e, this.f9035a.getId(), C3147i.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.f9035a.getWidth(), this.f9035a.getHeight()));
                this.f9037c = i;
                this.f9038d = i2;
            }
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$g */
    private class C3212g implements C3233p {

        /* renamed from: a */
        private C3217c f9040a;

        /* renamed from: b */
        private C2945d f9041b;

        /* renamed from: c */
        private int f9042c;

        /* renamed from: d */
        private int f9043d;

        /* renamed from: e */
        private int f9044e;

        public C3212g(C3217c cVar) {
            this.f9040a = cVar;
            ReactContext c = C3051u0.m12086c(cVar);
            this.f9041b = ReactTextInputManager.getEventDispatcher(c, cVar);
            this.f9044e = C3051u0.m12087d(c);
        }

        /* renamed from: a */
        public void mo10497a(int i, int i2) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            if (this.f9042c != min || this.f9043d != max) {
                this.f9041b.mo9651c(new C3229l(this.f9044e, this.f9040a.getId(), min, max));
                this.f9042c = min;
                this.f9043d = max;
            }
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$h */
    private class C3213h implements TextWatcher {

        /* renamed from: f */
        private C2945d f9046f;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C3217c f9047o;

        /* renamed from: p */
        private String f9048p = null;

        /* renamed from: q */
        private int f9049q;

        /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$h$a */
        class C3214a implements C2929d.C2930a {
            C3214a() {
            }

            /* renamed from: a */
            public WritableMap mo9497a() {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", C3213h.this.f9047o.mo10519m());
                writableNativeMap.putInt("opaqueCacheId", C3213h.this.f9047o.getId());
                return writableNativeMap;
            }
        }

        public C3213h(ReactContext reactContext, C3217c cVar) {
            this.f9046f = ReactTextInputManager.getEventDispatcher(reactContext, cVar);
            this.f9047o = cVar;
            this.f9049q = C3051u0.m12087d(reactContext);
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f9048p = charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f9047o.f9075U) {
                if (i3 != 0 || i2 != 0) {
                    C6409a.m24521c(this.f9048p);
                    String substring = charSequence.toString().substring(i, i + i3);
                    int i4 = i + i2;
                    String substring2 = this.f9048p.substring(i, i4);
                    if (i3 != i2 || !substring.equals(substring2)) {
                        if (this.f9047o.getFabricViewStateManager().mo9494b()) {
                            this.f9047o.getFabricViewStateManager().mo9495c(new C3214a());
                        }
                        this.f9046f.mo9651c(new C3222e(this.f9049q, this.f9047o.getId(), charSequence.toString(), this.f9047o.mo10519m()));
                        this.f9046f.mo9651c(new C3225h(this.f9049q, this.f9047o.getId(), substring, substring2, i, i4));
                    }
                }
            }
        }
    }

    private static void checkPasswordType(C3217c cVar) {
        if ((cVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (cVar.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(cVar, 128, 16);
        }
    }

    /* access modifiers changed from: private */
    public static C2945d getEventDispatcher(ReactContext reactContext, C3217c cVar) {
        return C3051u0.m12085b(reactContext, cVar.getId());
    }

    private C3196r getReactTextUpdate(String str, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = str;
        spannableStringBuilder.append(C3174e0.m12453e(str, C3174e0.UNSET));
        return new C3196r(spannableStringBuilder, i, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, i2, i3);
    }

    private void setAutofillHints(C3217c cVar, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setAutofillHints(strArr);
        }
    }

    private void setImportantForAutofill(C3217c cVar, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setImportantForAutofill(i);
        }
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase().contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(C3217c cVar, int i, int i2) {
        cVar.setStagedInputType(((~i) & cVar.getStagedInputType()) | i2);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C3217c cVar) {
        cVar.setEventDispatcher(getEventDispatcher(o0Var, cVar));
        cVar.addTextChangedListener(new C3213h(o0Var, cVar));
        cVar.setOnFocusChangeListener(new C3208c(o0Var, cVar));
        cVar.setOnEditorActionListener(new C3209d(cVar, o0Var));
    }

    /* access modifiers changed from: protected */
    public EditText createInternalEditText(C3031o0 o0Var) {
        return new EditText(o0Var);
    }

    public C3181h createShadowNodeInstance() {
        return new C3230m();
    }

    public C3181h createShadowNodeInstance(C3199t tVar) {
        return new C3230m(tVar);
    }

    public C3217c createViewInstance(C3031o0 o0Var) {
        C3217c cVar = new C3217c(o0Var);
        cVar.setInputType(cVar.getInputType() & -131073);
        cVar.setReturnKeyType("done");
        return cVar;
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10915e("focusTextInput", 1, "blurTextInput", 2);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return C2693e.m10911a().mo8815b("topSubmitEditing", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).mo8815b("topEndEditing", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).mo8815b("topTextInput", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onTextInput", "captured", "onTextInputCapture"))).mo8815b("topFocus", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onFocus", "captured", "onFocusCapture"))).mo8815b("topBlur", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onBlur", "captured", "onBlurCapture"))).mo8815b("topKeyPress", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).mo8814a();
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b(C3147i.m12384e(C3147i.SCROLL), C2693e.m10914d("registrationName", "onScroll")).mo8814a();
    }

    public Map getExportedViewConstants() {
        return C2693e.m10914d("AutoCapitalizationType", C2693e.m10917g("none", 0, "characters", 4096, "words", 8192, "sentences", Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE)));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<? extends C2987j> getShadowNodeClass() {
        return C3230m.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C3217c cVar) {
        super.onAfterUpdateTransaction(cVar);
        cVar.mo10561u();
        cVar.mo10517k();
    }

    public void receiveCommand(C3217c cVar, int i, ReadableArray readableArray) {
        String str;
        if (i == 1) {
            str = "focus";
        } else if (i == 2) {
            str = "blur";
        } else if (i == 4) {
            str = "setTextAndSelection";
        } else {
            return;
        }
        receiveCommand(cVar, str, readableArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void receiveCommand(com.facebook.react.views.textinput.C3217c r7, java.lang.String r8, com.facebook.react.bridge.ReadableArray r9) {
        /*
            r6 = this;
            r8.hashCode()
            int r0 = r8.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = -1
            switch(r0) {
                case -1699362314: goto L_0x003d;
                case 3027047: goto L_0x0032;
                case 97604824: goto L_0x0027;
                case 1427010500: goto L_0x001c;
                case 1690703013: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r8 = -1
            goto L_0x0047
        L_0x0011:
            java.lang.String r0 = "focusTextInput"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r8 = 4
            goto L_0x0047
        L_0x001c:
            java.lang.String r0 = "setTextAndSelection"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0025
            goto L_0x000f
        L_0x0025:
            r8 = 3
            goto L_0x0047
        L_0x0027:
            java.lang.String r0 = "focus"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0030
            goto L_0x000f
        L_0x0030:
            r8 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r0 = "blur"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003b
            goto L_0x000f
        L_0x003b:
            r8 = 1
            goto L_0x0047
        L_0x003d:
            java.lang.String r0 = "blurTextInput"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0046
            goto L_0x000f
        L_0x0046:
            r8 = 0
        L_0x0047:
            switch(r8) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0070;
                case 2: goto L_0x006c;
                case 3: goto L_0x004b;
                case 4: goto L_0x006c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0073
        L_0x004b:
            int r8 = r9.getInt(r4)
            if (r8 != r5) goto L_0x0052
            return
        L_0x0052:
            java.lang.String r0 = r9.getString(r3)
            int r2 = r9.getInt(r2)
            int r9 = r9.getInt(r1)
            if (r9 != r5) goto L_0x0061
            r9 = r2
        L_0x0061:
            com.facebook.react.views.text.r r0 = r6.getReactTextUpdate(r0, r8, r2, r9)
            r7.mo10535s(r0)
            r7.mo10531q(r8, r2, r9)
            goto L_0x0073
        L_0x006c:
            r7.mo10563w()
            goto L_0x0073
        L_0x0070:
            r7.mo10516j()
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.receiveCommand(com.facebook.react.views.textinput.c, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    @C2991a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C3217c cVar, boolean z) {
        cVar.setAllowFontScaling(z);
    }

    @C2991a(name = "autoCapitalize")
    public void setAutoCapitalize(C3217c cVar, Dynamic dynamic) {
        ReadableType type = dynamic.getType();
        ReadableType readableType = ReadableType.Number;
        int i = Http2.INITIAL_MAX_FRAME_SIZE;
        if (type == readableType) {
            i = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals("none")) {
                i = 0;
            } else if (asString.equals("characters")) {
                i = 4096;
            } else if (asString.equals("words")) {
                i = 8192;
            } else {
                boolean equals = asString.equals("sentences");
            }
        }
        updateStagedInputTypeFlag(cVar, AUTOCAPITALIZE_FLAGS, i);
    }

    @C2991a(name = "autoCorrect")
    public void setAutoCorrect(C3217c cVar, Boolean bool) {
        updateStagedInputTypeFlag(cVar, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @C2991a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C3217c cVar, boolean z) {
        cVar.setAutoFocus(z);
    }

    @C2991a(name = "blurOnSubmit")
    public void setBlurOnSubmit(C3217c cVar, Boolean bool) {
        cVar.setBlurOnSubmit(bool);
    }

    @C2992b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C3217c cVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        cVar.mo10564z(SPACING_TYPES[i], intValue, f);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C3217c cVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        if (i == 0) {
            cVar.setBorderRadius(f);
        } else {
            cVar.mo10501A(f, i - 1);
        }
    }

    @C2991a(name = "borderStyle")
    public void setBorderStyle(C3217c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C3217c cVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        cVar.mo10502B(SPACING_TYPES[i], f);
    }

    @C2991a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C3217c cVar, boolean z) {
        if (cVar.getStagedInputType() != 32 || !shouldHideCursorForEmailTextInput()) {
            cVar.setCursorVisible(!z);
        }
    }

    @C2991a(customType = "Color", name = "color")
    public void setColor(C3217c cVar, Integer num) {
        if (num == null) {
            ColorStateList b = C3170d.m12444b(cVar.getContext());
            if (b != null) {
                cVar.setTextColor(b);
                return;
            }
            Context context = cVar.getContext();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get default text color from View Context: ");
            sb.append(context != null ? context.getClass().getCanonicalName() : "null");
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb.toString()));
            return;
        }
        cVar.setTextColor(num.intValue());
    }

    @C2991a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C3217c cVar, boolean z) {
        cVar.setOnLongClickListener(new C3207b(z));
    }

    @C2991a(customType = "Color", name = "cursorColor")
    public void setCursorColor(C3217c cVar, Integer num) {
        if (num != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Drawable textCursorDrawable = cVar.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
                    cVar.setTextCursorDrawable(textCursorDrawable);
                }
            } else if (i != 28) {
                int i2 = 0;
                while (true) {
                    String[] strArr = DRAWABLE_RESOURCES;
                    if (i2 < strArr.length) {
                        try {
                            Field declaredField = TextView.class.getDeclaredField(strArr[i2]);
                            declaredField.setAccessible(true);
                            int i3 = declaredField.getInt(cVar);
                            if (i3 != 0) {
                                Drawable mutate = C1135a.m4419e(cVar.getContext(), i3).mutate();
                                mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                                declaredField2.setAccessible(true);
                                Object obj = declaredField2.get(cVar);
                                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_FIELDS[i2]);
                                declaredField3.setAccessible(true);
                                if (strArr[i2] == "mCursorDrawableRes") {
                                    declaredField3.set(obj, new Drawable[]{mutate, mutate});
                                } else {
                                    declaredField3.set(obj, mutate);
                                }
                                i2++;
                            } else {
                                return;
                            }
                        } catch (IllegalAccessException | NoSuchFieldException unused) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @C2991a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C3217c cVar, boolean z) {
        cVar.setDisableFullscreenUI(z);
    }

    @C2991a(defaultBoolean = true, name = "editable")
    public void setEditable(C3217c cVar, boolean z) {
        cVar.setEnabled(z);
    }

    @C2991a(name = "fontFamily")
    public void setFontFamily(C3217c cVar, String str) {
        cVar.setFontFamily(str);
    }

    @C2991a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C3217c cVar, float f) {
        cVar.setFontSize(f);
    }

    @C2991a(name = "fontStyle")
    public void setFontStyle(C3217c cVar, String str) {
        cVar.setFontStyle(str);
    }

    @C2991a(name = "fontWeight")
    public void setFontWeight(C3217c cVar, String str) {
        cVar.setFontWeight(str);
    }

    @C2991a(name = "importantForAutofill")
    public void setImportantForAutofill(C3217c cVar, String str) {
        setImportantForAutofill(cVar, "no".equals(str) ? 2 : "noExcludeDescendants".equals(str) ? 8 : "yes".equals(str) ? 1 : "yesExcludeDescendants".equals(str) ? 4 : 0);
    }

    @C2991a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C3217c cVar, boolean z) {
        cVar.setIncludeFontPadding(z);
    }

    @C2991a(name = "inlineImageLeft")
    public void setInlineImageLeft(C3217c cVar, String str) {
        cVar.setCompoundDrawablesWithIntrinsicBounds(C2762c.m11073a().mo9028c(cVar.getContext(), str), 0, 0, 0);
    }

    @C2991a(name = "inlineImagePadding")
    public void setInlineImagePadding(C3217c cVar, int i) {
        cVar.setCompoundDrawablePadding(i);
    }

    @C2991a(name = "keyboardType")
    public void setKeyboardType(C3217c cVar, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
            if (shouldHideCursorForEmailTextInput()) {
                cVar.setCursorVisible(false);
            }
        } else {
            i = KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : KEYBOARD_TYPE_URI.equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(cVar, 15, i);
        checkPasswordType(cVar);
    }

    @C2991a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C3217c cVar, float f) {
        cVar.setLetterSpacingPt(f);
    }

    @C2991a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C3217c cVar, float f) {
        cVar.setMaxFontSizeMultiplier(f);
    }

    @C2991a(name = "maxLength")
    public void setMaxLength(C3217c cVar, Integer num) {
        InputFilter[] filters = cVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < filters.length; i++) {
                    if (!(filters[i] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof InputFilter.LengthFilter) {
                    filters[i2] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr2 = new InputFilter[(filters.length + 1)];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        cVar.setFilters(inputFilterArr);
    }

    @C2991a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C3217c cVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 131072;
        if (z) {
            i = 131072;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
    }

    @C2991a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C3217c cVar, int i) {
        cVar.setLines(i);
    }

    @C2991a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C3217c cVar, boolean z) {
        cVar.setContentSizeWatcher(z ? new C3210e(cVar) : null);
    }

    @C2991a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C3217c cVar, boolean z) {
        cVar.setOnKeyPress(z);
    }

    @C2991a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C3217c cVar, boolean z) {
        cVar.setScrollWatcher(z ? new C3211f(cVar) : null);
    }

    @C2991a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C3217c cVar, boolean z) {
        cVar.setSelectionWatcher(z ? new C3212g(cVar) : null);
    }

    public void setPadding(C3217c cVar, int i, int i2, int i3, int i4) {
        cVar.setPadding(i, i2, i3, i4);
    }

    @C2991a(name = "placeholder")
    public void setPlaceholder(C3217c cVar, String str) {
        cVar.setHint(str);
    }

    @C2991a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C3217c cVar, Integer num) {
        if (num == null) {
            cVar.setHintTextColor(C3170d.m12446d(cVar.getContext()));
        } else {
            cVar.setHintTextColor(num.intValue());
        }
    }

    @C2991a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C3217c cVar, String str) {
        cVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @C2991a(name = "returnKeyType")
    public void setReturnKeyType(C3217c cVar, String str) {
        cVar.setReturnKeyType(str);
    }

    @C2991a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C3217c cVar, boolean z) {
        updateStagedInputTypeFlag(cVar, 144, z ? 128 : 0);
        checkPasswordType(cVar);
    }

    @C2991a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C3217c cVar, boolean z) {
        cVar.setSelectAllOnFocus(z);
    }

    @C2991a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C3217c cVar, Integer num) {
        cVar.setHighlightColor(num == null ? C3170d.m12445c(cVar.getContext()) : num.intValue());
        setCursorColor(cVar, num);
    }

    @C2991a(name = "textAlign")
    public void setTextAlign(C3217c cVar, String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                cVar.setJustificationMode(0);
            }
            if (str == null || "auto".equals(str)) {
                cVar.setGravityHorizontal(0);
                return;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    cVar.setGravityHorizontal(5);
                    return;
                } else if ("center".equals(str)) {
                    cVar.setGravityHorizontal(1);
                    return;
                } else {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            cVar.setJustificationMode(1);
        }
        cVar.setGravityHorizontal(3);
    }

    @C2991a(name = "textAlignVertical")
    public void setTextAlignVertical(C3217c cVar, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else if ("center".equals(str)) {
            i = 16;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
        cVar.setGravityVertical(i);
    }

    @C2991a(name = "autoComplete")
    public void setTextContentType(C3217c cVar, String str) {
        if (str != null && !"off".equals(str)) {
            Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                setAutofillHints(cVar, map.get(str));
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid autoComplete: " + str);
        }
        setImportantForAutofill(cVar, 2);
    }

    @C2991a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C3217c cVar, Integer num) {
        Drawable background = cVar.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e) {
                C6071a.m22876j(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @C2991a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C3217c cVar, boolean z) {
        cVar.setShowSoftInputOnFocus(z);
    }

    public void updateExtraData(C3217c cVar, Object obj) {
        if (obj instanceof C3196r) {
            C3196r rVar = (C3196r) obj;
            int f = (int) rVar.mo10380f();
            int h = (int) rVar.mo10382h();
            int g = (int) rVar.mo10381g();
            int e = (int) rVar.mo10379e();
            if (!(f == -1 && h == -1 && g == -1 && e == -1)) {
                if (f == -1) {
                    f = cVar.getPaddingLeft();
                }
                if (h == -1) {
                    h = cVar.getPaddingTop();
                }
                if (g == -1) {
                    g = cVar.getPaddingRight();
                }
                if (e == -1) {
                    e = cVar.getPaddingBottom();
                }
                cVar.setPadding(f, h, g, e);
            }
            if (rVar.mo10376b()) {
                C3164a0.m12422g(rVar.mo10385k(), cVar);
            }
            int i = 0;
            boolean z = cVar.getSelectionStart() == cVar.getSelectionEnd();
            int j = rVar.mo10384j();
            int i2 = rVar.mo10383i();
            if ((j == -1 || i2 == -1) && z) {
                if (cVar.getText() != null) {
                    i = cVar.getText().length();
                }
                j = rVar.mo10385k().length() - (i - cVar.getSelectionStart());
                i2 = j;
            }
            cVar.mo10560t(rVar);
            cVar.mo10531q(rVar.mo10377c(), j, i2);
        }
    }

    public Object updateState(C3217c cVar, C2962f0 f0Var, C3025n0 n0Var) {
        ReadableNativeMap b;
        cVar.getFabricViewStateManager().mo9496e(n0Var);
        if (n0Var == null || (b = n0Var.mo9793b()) == null || !b.hasKey("attributedString")) {
            return null;
        }
        ReadableNativeMap map = b.getMap("attributedString");
        ReadableNativeMap map2 = b.getMap("paragraphAttributes");
        if (map == null || map2 == null) {
            throw new IllegalArgumentException("Invalid TextInput State was received as a parameters");
        }
        return C3196r.m12500a(C3168c0.m12438e(cVar.getContext(), map, this.mReactTextViewManagerCallback), b.getInt("mostRecentEventCount"), C3204y.m12543m(f0Var, C3168c0.m12439f(map)), C3204y.m12544n(map2.getString("textBreakStrategy")), C3204y.m12540i(f0Var), map.getArray("fragments").toArrayList().size() > 1);
    }
}
