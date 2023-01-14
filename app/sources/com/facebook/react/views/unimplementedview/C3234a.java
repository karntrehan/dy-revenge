package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0298z;

/* renamed from: com.facebook.react.views.unimplementedview.a */
public class C3234a extends LinearLayout {

    /* renamed from: f */
    private C0298z f9119f;

    public C3234a(Context context) {
        super(context);
        C0298z zVar = new C0298z(context);
        this.f9119f = zVar;
        zVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.f9119f.setGravity(17);
        this.f9119f.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(this.f9119f);
    }

    public void setName(String str) {
        C0298z zVar = this.f9119f;
        zVar.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
