package com.reactnativeotpautofill;

import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p174e.p319f.p320a.p335c.p338b.p339a.p340d.C6624a;
import p174e.p319f.p320a.p335c.p362h.C8963l;

/* renamed from: com.reactnativeotpautofill.e */
public class C5344e extends LinearLayout {

    /* renamed from: f */
    private String f14968f = "com.reactnativeotpautofill";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3031o0 f14969o;

    /* renamed from: p */
    private EditText f14970p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f14971q;

    /* renamed from: com.reactnativeotpautofill.e$a */
    class C5345a implements TextWatcher {
        C5345a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() >= C5344e.this.f14971q) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("code", charSequence.toString());
                ((RCTEventEmitter) C5344e.this.f14969o.getJSModule(RCTEventEmitter.class)).receiveEvent(C5344e.this.getId(), "complete", createMap);
            }
        }
    }

    public C5344e(C3031o0 o0Var) {
        super(o0Var);
        this.f14969o = o0Var;
        m19801g();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo16118d(Void voidR) {
        Log.d(this.f14968f, "start retriever");
        C5342c cVar = new C5342c(this.f14969o);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", cVar.mo16117a().get(0));
        ((RCTEventEmitter) this.f14969o.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "androidSignature", createMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo16119f(Exception exc) {
        Log.d(this.f14968f, "unable to start retriever");
    }

    /* renamed from: g */
    private void m19801g() {
        LinearLayout.inflate(this.f14969o, C5347g.otp_view_layout, this);
        this.f14970p = (EditText) findViewById(C5346f.numberText);
        setOtpTextColor("#000000");
        setOtpTextSpace(1.0f);
        setOtpTextFontSize(24.0f);
        setOtpTextLength(4);
        this.f14970p.addTextChangedListener(new C5345a());
        m19802h();
        new OtpBroadcastReceiver().mo16114a(this.f14970p);
    }

    /* renamed from: h */
    private void m19802h() {
        C8963l<Void> p = C6624a.m25268a(this.f14969o).mo19447p();
        p.mo22770f(new C5340a(this));
        p.mo22768d(new C5341b(this));
    }

    public void setOtpTextColor(String str) {
        this.f14970p.setTextColor(Color.parseColor(str));
    }

    public void setOtpTextFontSize(float f) {
        this.f14970p.setTextSize(f);
    }

    public void setOtpTextLength(int i) {
        this.f14970p.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        this.f14971q = i;
    }

    public void setOtpTextSpace(float f) {
        this.f14970p.setLetterSpacing(f);
    }
}
