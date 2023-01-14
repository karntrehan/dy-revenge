package com.facebook.react.common;

import androidx.core.util.C1175f;

/* renamed from: com.facebook.react.common.a */
public class C2689a<T> implements C1175f<T> {

    /* renamed from: a */
    private final Object[] f7776a;

    /* renamed from: b */
    private int f7777b = 0;

    public C2689a(int i) {
        this.f7776a = new Object[i];
    }

    /* renamed from: a */
    public synchronized boolean mo3701a(T t) {
        int i = this.f7777b;
        Object[] objArr = this.f7776a;
        if (i == objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f7777b = i + 1;
        return true;
    }

    /* renamed from: b */
    public synchronized T mo3702b() {
        int i = this.f7777b;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.f7777b = i2;
        T[] tArr = this.f7776a;
        T t = tArr[i2];
        tArr[i2] = null;
        return t;
    }

    /* renamed from: c */
    public synchronized void mo8807c() {
        for (int i = 0; i < this.f7777b; i++) {
            this.f7776a[i] = null;
        }
        this.f7777b = 0;
    }
}
