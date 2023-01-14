package com.th3rdwave.safeareacontext;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2945d;
import java.util.Objects;

/* renamed from: com.th3rdwave.safeareacontext.j */
public final class C10113j {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m34209b(C10112i iVar, C10107e eVar, C10110g gVar) {
        Context context = iVar.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id = iVar.getId();
        C2945d b = C3051u0.m12085b(reactContext, id);
        if (b != null) {
            b.mo9651c(new C10108f(C10121r.m34240b(reactContext), id, eVar, gVar));
        }
    }
}
