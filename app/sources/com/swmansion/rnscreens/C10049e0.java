package com.swmansion.rnscreens;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import p027c.p028a.C1440f;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.e0 */
public final class C10049e0 {

    /* renamed from: a */
    private SearchView f26796a;

    /* renamed from: b */
    private Integer f26797b;

    /* renamed from: c */
    private Drawable f26798c;

    public C10049e0(SearchView searchView) {
        C10457l.m35320e(searchView, "searchView");
        this.f26796a = searchView;
    }

    /* renamed from: a */
    private final ImageView m34069a() {
        return (ImageView) this.f26796a.findViewById(C1440f.search_close_btn);
    }

    /* renamed from: b */
    private final EditText m34070b() {
        View findViewById = this.f26796a.findViewById(C1440f.search_src_text);
        if (findViewById instanceof EditText) {
            return (EditText) findViewById;
        }
        return null;
    }

    /* renamed from: c */
    private final ImageView m34071c() {
        return (ImageView) this.f26796a.findViewById(C1440f.search_button);
    }

    /* renamed from: d */
    private final View m34072d() {
        return this.f26796a.findViewById(C1440f.search_plate);
    }

    /* renamed from: e */
    public final void mo25031e(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            m34071c().setColorFilter(intValue);
            m34069a().setColorFilter(intValue);
        }
    }

    /* renamed from: f */
    public final void mo25032f(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            EditText b = m34070b();
            if (b != null) {
                b.setHintTextColor(intValue);
            }
        }
    }

    /* renamed from: g */
    public final void mo25033g(String str, boolean z) {
        C10457l.m35320e(str, "placeholder");
        if (z) {
            this.f26796a.setQueryHint(str);
            return;
        }
        EditText b = m34070b();
        if (b != null) {
            b.setHint(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r0 = r0.getTextColors();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25034h(java.lang.Integer r2) {
        /*
            r1 = this;
            java.lang.Integer r0 = r1.f26797b
            if (r2 == 0) goto L_0x002c
            if (r0 != 0) goto L_0x001e
            android.widget.EditText r0 = r1.m34070b()
            if (r0 == 0) goto L_0x001b
            android.content.res.ColorStateList r0 = r0.getTextColors()
            if (r0 == 0) goto L_0x001b
            int r0 = r0.getDefaultColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r1.f26797b = r0
        L_0x001e:
            android.widget.EditText r0 = r1.m34070b()
            if (r0 == 0) goto L_0x003b
            int r2 = r2.intValue()
            r0.setTextColor(r2)
            goto L_0x003b
        L_0x002c:
            if (r0 == 0) goto L_0x003b
            android.widget.EditText r2 = r1.m34070b()
            if (r2 == 0) goto L_0x003b
            int r0 = r0.intValue()
            r2.setTextColor(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10049e0.mo25034h(java.lang.Integer):void");
    }

    /* renamed from: i */
    public final void mo25035i(Integer num) {
        Drawable drawable = this.f26798c;
        if (num != null) {
            if (drawable == null) {
                this.f26798c = m34072d().getBackground();
            }
            m34072d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            m34072d().setBackground(drawable);
        }
    }
}
