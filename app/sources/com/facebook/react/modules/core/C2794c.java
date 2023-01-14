package com.facebook.react.modules.core;

import com.facebook.react.bridge.WritableArray;

/* renamed from: com.facebook.react.modules.core.c */
public interface C2794c {
    void callIdleCallbacks(double d);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
