package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: com.facebook.react.views.textinput.k */
public final class C3228k {

    /* renamed from: a */
    private final SpannableStringBuilder f9102a;

    /* renamed from: b */
    private final float f9103b;

    /* renamed from: c */
    private final int f9104c;

    /* renamed from: d */
    private final int f9105d;

    /* renamed from: e */
    private final int f9106e;

    /* renamed from: f */
    private final int f9107f;

    /* renamed from: g */
    private final CharSequence f9108g;

    public C3228k(EditText editText) {
        this.f9102a = new SpannableStringBuilder(editText.getText());
        this.f9103b = editText.getTextSize();
        this.f9106e = editText.getInputType();
        this.f9108g = editText.getHint();
        this.f9104c = editText.getMinLines();
        this.f9105d = editText.getMaxLines();
        this.f9107f = Build.VERSION.SDK_INT >= 23 ? editText.getBreakStrategy() : 0;
    }

    /* renamed from: a */
    public void mo10580a(EditText editText) {
        editText.setText(this.f9102a);
        editText.setTextSize(0, this.f9103b);
        editText.setMinLines(this.f9104c);
        editText.setMaxLines(this.f9105d);
        editText.setInputType(this.f9106e);
        editText.setHint(this.f9108g);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f9107f);
        }
    }
}
