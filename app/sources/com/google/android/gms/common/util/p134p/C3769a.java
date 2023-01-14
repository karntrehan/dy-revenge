package com.google.android.gms.common.util.p134p;

import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.p.a */
public class C3769a implements ThreadFactory {

    /* renamed from: a */
    private final String f10454a;

    /* renamed from: b */
    private final AtomicInteger f10455b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f10456c = Executors.defaultThreadFactory();

    public C3769a(String str) {
        C3705r.m14347l(str, "Name must not be null");
        this.f10454a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f10456c.newThread(new C3770b(runnable, 0));
        String str = this.f10454a;
        int andIncrement = this.f10455b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
