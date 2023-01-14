package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p113d0.C2706a;
import com.facebook.react.p113d0.C2709d;
import com.facebook.react.uimanager.C2931d0;
import com.facebook.yoga.C3314n;
import java.util.Map;

public abstract class ViewManager<T extends View, C extends C2931d0> extends BaseJavaModule {
    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public T createView(int i, C3031o0 o0Var, C2962f0 f0Var, C3025n0 n0Var, C2706a aVar) {
        T createViewInstance = createViewInstance(i, o0Var, f0Var, n0Var);
        if (createViewInstance instanceof C2709d) {
            ((C2709d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    /* access modifiers changed from: protected */
    public T createViewInstance(int i, C3031o0 o0Var, C2962f0 f0Var, C3025n0 n0Var) {
        Object updateState;
        T createViewInstance = createViewInstance(o0Var);
        createViewInstance.setId(i);
        addEventEmitters(o0Var, createViewInstance);
        if (f0Var != null) {
            updateProperties(createViewInstance, f0Var);
        }
        if (!(n0Var == null || (updateState = updateState(createViewInstance, f0Var, n0Var)) == null)) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    /* access modifiers changed from: protected */
    public abstract T createViewInstance(C3031o0 o0Var);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    /* access modifiers changed from: protected */
    public C2928c1<T> getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return C2932d1.m11577e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C3314n nVar, float f2, C3314n nVar2, float[] fArr) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public void updateProperties(T t, C2962f0 f0Var) {
        C2928c1 delegate = getDelegate();
        if (delegate != null) {
            C2932d1.m11580h(delegate, t, f0Var);
        } else {
            C2932d1.m11579g(this, t, f0Var);
        }
        onAfterUpdateTransaction(t);
    }

    public Object updateState(T t, C2962f0 f0Var, C3025n0 n0Var) {
        return null;
    }
}
