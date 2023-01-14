package com.facebook.react.views.text;

import com.facebook.react.uimanager.C2940e0;
import com.facebook.react.uimanager.p120j1.C2991a;

/* renamed from: com.facebook.react.views.text.l */
public class C3188l extends C2940e0 {

    /* renamed from: y */
    private String f8943y = null;

    /* renamed from: p1 */
    public String mo10371p1() {
        return this.f8943y;
    }

    @C2991a(name = "text")
    public void setText(String str) {
        this.f8943y = str;
        mo9621x0();
    }

    public String toString() {
        return mo9512O() + " [text: " + this.f8943y + "]";
    }

    /* renamed from: w */
    public boolean mo9551w() {
        return true;
    }
}
