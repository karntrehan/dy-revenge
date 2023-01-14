package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p027c.p028a.p029k.p030a.C1445a;
import p174e.p319f.p320a.p363d.C9018e;
import p174e.p319f.p320a.p363d.C9022i;

/* renamed from: com.google.android.material.textfield.h */
class C4340h extends C4336e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f12333d = new C4341a();

    /* renamed from: e */
    private final TextInputLayout.C4311f f12334e = new C4342b();

    /* renamed from: f */
    private final TextInputLayout.C4312g f12335f = new C4343c();

    /* renamed from: com.google.android.material.textfield.h$a */
    class C4341a implements TextWatcher {
        C4341a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4340h hVar = C4340h.this;
            hVar.f12306c.setChecked(!hVar.m16692f());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    class C4342b implements TextInputLayout.C4311f {
        C4342b() {
        }

        /* renamed from: a */
        public void mo13710a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C4340h hVar = C4340h.this;
            hVar.f12306c.setChecked(!hVar.m16692f());
            editText.removeTextChangedListener(C4340h.this.f12333d);
            editText.addTextChangedListener(C4340h.this.f12333d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    class C4343c implements TextInputLayout.C4312g {
        C4343c() {
        }

        /* renamed from: a */
        public void mo13711a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    class C4344d implements View.OnClickListener {
        C4344d() {
        }

        public void onClick(View view) {
            EditText editText = C4340h.this.f12304a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C4340h.this.m16692f() ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    C4340h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m16692f() {
        EditText editText = this.f12304a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13719a() {
        this.f12304a.setEndIconDrawable(C1445a.m6446d(this.f12305b, C9018e.design_password_eye));
        TextInputLayout textInputLayout = this.f12304a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C9022i.password_toggle_content_description));
        this.f12304a.setEndIconOnClickListener(new C4344d());
        this.f12304a.mo13597c(this.f12334e);
        this.f12304a.mo13599d(this.f12335f);
    }
}
