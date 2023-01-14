package com.google.firebase.crashlytics.p139h.p142j;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.h.j.m */
class C4576m {

    /* renamed from: a */
    private static final AtomicLong f12929a = new AtomicLong(0);

    /* renamed from: b */
    private static String f12930b;

    C4576m(C4554a0 a0Var) {
        byte[] bArr = new byte[10];
        m17368e(bArr);
        m17367d(bArr);
        m17366c(bArr);
        String B = C4577n.m17370B(a0Var.mo14117a());
        String v = C4577n.m17393v(bArr);
        Locale locale = Locale.US;
        f12930b = String.format(locale, "%s%s%s%s", new Object[]{v.substring(0, 12), v.substring(12, 16), v.subSequence(16, 20), B.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m17364a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m17365b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m17366c(byte[] bArr) {
        byte[] b = m17365b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    private void m17367d(byte[] bArr) {
        byte[] b = m17365b(f12929a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    private void m17368e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m17364a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m17365b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f12930b;
    }
}
