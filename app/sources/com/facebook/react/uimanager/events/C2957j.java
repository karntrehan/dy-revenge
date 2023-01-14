package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* renamed from: com.facebook.react.uimanager.events.j */
public class C2957j {

    /* renamed from: a */
    private final SparseIntArray f8279a = new SparseIntArray();

    /* renamed from: a */
    public void mo9666a(long j) {
        this.f8279a.put((int) j, 0);
    }

    /* renamed from: b */
    public short mo9667b(long j) {
        int i = this.f8279a.get((int) j, -1);
        if (i != -1) {
            return (short) (65535 & i);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    /* renamed from: c */
    public boolean mo9668c(long j) {
        return this.f8279a.get((int) j, -1) != -1;
    }

    /* renamed from: d */
    public void mo9669d(long j) {
        int i = (int) j;
        int i2 = this.f8279a.get(i, -1);
        if (i2 != -1) {
            this.f8279a.put(i, i2 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }

    /* renamed from: e */
    public void mo9670e(long j) {
        this.f8279a.delete((int) j);
    }
}
