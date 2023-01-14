package com.facebook.react.common;

import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.common.f */
public class C2696f {

    /* renamed from: a */
    private Thread f7784a = null;

    /* renamed from: a */
    public void mo8816a() {
        Thread currentThread = Thread.currentThread();
        if (this.f7784a == null) {
            this.f7784a = currentThread;
        }
        C6409a.m24519a(this.f7784a == currentThread);
    }
}
