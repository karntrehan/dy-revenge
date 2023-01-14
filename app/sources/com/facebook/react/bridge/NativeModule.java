package com.facebook.react.bridge;

import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public interface NativeModule {

    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void invalidate();

    void onCatalystInstanceDestroy();
}
