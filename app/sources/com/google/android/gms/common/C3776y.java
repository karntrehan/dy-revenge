package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.y */
abstract class C3776y extends C3774w {

    /* renamed from: b */
    private static final WeakReference<byte[]> f10460b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<byte[]> f10461c = f10460b;

    C3776y(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public abstract byte[] mo11729P0();

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final byte[] mo11735Y() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f10461c.get();
            if (bArr == null) {
                bArr = mo11729P0();
                this.f10461c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
