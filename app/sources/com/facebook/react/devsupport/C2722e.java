package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.facebook.react.C2768i;

/* renamed from: com.facebook.react.devsupport.e */
public class C2722e extends Dialog {
    public C2722e(Activity activity, View view) {
        super(activity, C2768i.Theme_Catalyst_LogBox);
        requestWindowFeature(1);
        setContentView(view);
    }
}
