package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.react.uimanager.b0 */
public interface C2923b0 {
    /* renamed from: a */
    void mo9472a(int i);

    /* renamed from: b */
    void mo9473b();

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getInitialUITemplate();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    AtomicInteger getState();

    @Deprecated
    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i);

    void setShouldLogContentAppeared(boolean z);
}
