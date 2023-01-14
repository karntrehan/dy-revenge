package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p126z.C3257a;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C2964g;
import com.facebook.react.uimanager.C3025n0;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.yoga.C3314n;
import java.util.Map;

@C2639a(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager<C3197s, C3193q> implements C2964g {
    public static final String REACT_CLASS = "RCTText";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected C3199t mReactTextViewManagerCallback;

    private Object getReactTextUpdate(C3197s sVar, C2962f0 f0Var, ReadableMapBuffer readableMapBuffer) {
        ReadableMapBuffer E = readableMapBuffer.mo8833E(TX_STATE_KEY_ATTRIBUTED_STRING);
        ReadableMapBuffer E2 = readableMapBuffer.mo8833E(TX_STATE_KEY_PARAGRAPH_ATTRIBUTES);
        Spannable c = C3171d0.m12449c(sVar.getContext(), E, this.mReactTextViewManagerCallback);
        sVar.setSpanned(c);
        return new C3196r(c, -1, false, C3204y.m12543m(f0Var, C3171d0.m12450d(E)), C3204y.m12544n(E2.mo8834G(TX_STATE_KEY_HASH)), C3204y.m12540i(f0Var));
    }

    public C3193q createShadowNodeInstance() {
        return new C3193q();
    }

    public C3193q createShadowNodeInstance(C3199t tVar) {
        return new C3193q(tVar);
    }

    public C3197s createViewInstance(C3031o0 o0Var) {
        return new C3197s(o0Var);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10915e("topTextLayout", C2693e.m10914d("registrationName", "onTextLayout"), "topInlineViewLayout", C2693e.m10914d("registrationName", "onInlineViewLayout"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C3193q> getShadowNodeClass() {
        return C3193q.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C3314n nVar, float f2, C3314n nVar2, float[] fArr) {
        return C3168c0.m12440g(context, readableMap, readableMap2, f, nVar, f2, nVar2, this.mReactTextViewManagerCallback, fArr);
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C3197s sVar) {
        super.onAfterUpdateTransaction(sVar);
        sVar.mo10394l();
    }

    public void setPadding(C3197s sVar, int i, int i2, int i3, int i4) {
        sVar.setPadding(i, i2, i3, i4);
    }

    public void updateExtraData(C3197s sVar, Object obj) {
        C3196r rVar = (C3196r) obj;
        if (rVar.mo10376b()) {
            C3164a0.m12422g(rVar.mo10385k(), sVar);
        }
        sVar.setText(rVar);
    }

    public Object updateState(C3197s sVar, C2962f0 f0Var, C3025n0 n0Var) {
        ReadableMapBuffer c;
        if (n0Var == null) {
            return null;
        }
        if (C3257a.m12770a() && (c = n0Var.mo9794c()) != null) {
            return getReactTextUpdate(sVar, f0Var, c);
        }
        ReadableNativeMap b = n0Var.mo9793b();
        if (b == null) {
            return null;
        }
        ReadableNativeMap map = b.getMap("attributedString");
        ReadableNativeMap map2 = b.getMap("paragraphAttributes");
        Spannable e = C3168c0.m12438e(sVar.getContext(), map, this.mReactTextViewManagerCallback);
        sVar.setSpanned(e);
        return new C3196r(e, b.hasKey("mostRecentEventCount") ? b.getInt("mostRecentEventCount") : -1, false, C3204y.m12543m(f0Var, C3168c0.m12439f(map)), C3204y.m12544n(map2.getString("textBreakStrategy")), C3204y.m12540i(f0Var));
    }
}
