package com.reactnativecommunity.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0275u0;
import androidx.core.widget.C1188c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.p120j1.C2991a;

public class ReactCheckBoxManager extends SimpleViewManager<C5247a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C5246a();
    private static final String REACT_CLASS = "AndroidCheckBox";

    /* renamed from: com.reactnativecommunity.checkbox.ReactCheckBoxManager$a */
    class C5246a implements CompoundButton.OnCheckedChangeListener {
        C5246a() {
        }

        /* renamed from: a */
        private ReactContext m19587a(CompoundButton compoundButton) {
            Context context = compoundButton.getContext();
            return (ReactContext) (context instanceof C0275u0 ? ((C0275u0) context).getBaseContext() : compoundButton.getContext());
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) m19587a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(new C5248b(compoundButton.getId(), z));
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static int getThemeColor(Context context, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(getIdentifier(context, str), typedValue, true);
        return typedValue.data;
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C5247a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* access modifiers changed from: protected */
    public C5247a createViewInstance(C3031o0 o0Var) {
        return new C5247a(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C2991a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C5247a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @C2991a(name = "on")
    public void setOn(C5247a aVar, boolean z) {
        aVar.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        aVar.mo15866b(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @C2991a(name = "tintColors")
    public void setTintColors(C5247a aVar, ReadableMap readableMap) {
        C1188c.m4679c(aVar, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{(readableMap == null || !readableMap.hasKey("true")) ? getThemeColor(aVar.getContext(), "colorAccent") : readableMap.getInt("true"), (readableMap == null || !readableMap.hasKey("false")) ? getThemeColor(aVar.getContext(), "colorPrimaryDark") : readableMap.getInt("false")}));
    }
}
