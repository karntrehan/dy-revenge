package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import java.util.Objects;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.r */
public final class C10121r {
    /* renamed from: a */
    public static final ReactContext m34239a(View view) {
        C10457l.m35320e(view, "view");
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    /* renamed from: b */
    public static final int m34240b(Context context) {
        C10457l.m35320e(context, "context");
        return -1;
    }
}
