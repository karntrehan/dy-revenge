package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.C0093h;
import androidx.appcompat.widget.C0217f;
import androidx.appcompat.widget.C0221g;
import androidx.appcompat.widget.C0270s;
import androidx.appcompat.widget.C0298z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p174e.p319f.p320a.p363d.p369o.C9040a;
import p174e.p319f.p320a.p363d.p378w.C9058a;

@Keep
public class MaterialComponentsViewInflater extends C0093h {
    private static int floatingToolbarItemBackgroundResId = -1;

    /* access modifiers changed from: protected */
    public C0217f createButton(Context context, AttributeSet attributeSet) {
        return shouldInflateAppCompatButton(context, attributeSet) ? new C0217f(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0221g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C9040a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0270s createRadioButton(Context context, AttributeSet attributeSet) {
        return new C9058a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0298z createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i2 = floatingToolbarItemBackgroundResId;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964 && floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i3, (String[]) null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
