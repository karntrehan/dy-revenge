package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.C2945d;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.views.textinput.d */
class C3221d extends InputConnectionWrapper {

    /* renamed from: a */
    private C3217c f9090a;

    /* renamed from: b */
    private C2945d f9091b;

    /* renamed from: c */
    private boolean f9092c;

    /* renamed from: d */
    private String f9093d = null;

    public C3221d(InputConnection inputConnection, ReactContext reactContext, C3217c cVar, C2945d dVar) {
        super(inputConnection, false);
        this.f9091b = dVar;
        this.f9090a = cVar;
    }

    /* renamed from: a */
    private void m12620a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f9091b.mo9651c(new C3227j(this.f9090a.getId(), str));
    }

    /* renamed from: b */
    private void m12621b(String str) {
        if (this.f9092c) {
            this.f9093d = str;
        } else {
            m12620a(str);
        }
    }

    public boolean beginBatchEdit() {
        this.f9092c = true;
        return super.beginBatchEdit();
    }

    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                charSequence2 = "Backspace";
            }
            m12621b(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        m12620a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    public boolean endBatchEdit() {
        this.f9092c = false;
        String str = this.f9093d;
        if (str != null) {
            m12620a(str);
            this.f9093d = null;
        }
        return super.endBatchEdit();
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        String valueOf;
        if (keyEvent.getAction() == 0) {
            boolean z = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                valueOf = "Backspace";
            } else if (keyEvent.getKeyCode() == 66) {
                valueOf = "Enter";
            } else if (z) {
                valueOf = String.valueOf(keyEvent.getNumber());
            }
            m12620a(valueOf);
        }
        return super.sendKeyEvent(keyEvent);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.f9090a.getSelectionStart();
        int selectionEnd = this.f9090a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.f9090a.getSelectionStart();
        boolean z = false;
        boolean z2 = selectionStart == selectionEnd;
        boolean z3 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0) {
            z = true;
        }
        m12621b((z || (!z2 && z3)) ? "Backspace" : String.valueOf(this.f9090a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
