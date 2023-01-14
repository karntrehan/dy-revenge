package com.swmansion.reanimated;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class CopiedEvent {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f26453a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f26454b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WritableMap f26455c;

    CopiedEvent(C2944c cVar) {
        cVar.mo9633c(new RCTEventEmitter() {
            public void receiveEvent(int i, String str, WritableMap writableMap) {
                int unused = CopiedEvent.this.f26453a = i;
                String unused2 = CopiedEvent.this.f26454b = str;
                WritableMap unused3 = CopiedEvent.this.f26455c = writableMap.copy();
            }

            public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
            }
        });
    }

    /* renamed from: d */
    public String mo24753d() {
        return this.f26454b;
    }

    /* renamed from: e */
    public WritableMap mo24754e() {
        return this.f26455c;
    }

    /* renamed from: f */
    public int mo24755f() {
        return this.f26453a;
    }
}
