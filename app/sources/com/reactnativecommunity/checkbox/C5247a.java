package com.reactnativecommunity.checkbox;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0221g;

/* renamed from: com.reactnativecommunity.checkbox.a */
class C5247a extends C0221g {

    /* renamed from: q */
    private CompoundButton.OnCheckedChangeListener f14776q = null;

    public C5247a(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15866b(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f14776q;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f14776q = onCheckedChangeListener;
    }
}
