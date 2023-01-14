package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;
import p174e.p319f.p320a.p382e.p383a.p389f.C9158f;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
final class C4364c0 {

    /* renamed from: a */
    private final C9147z<C4430s2> f12401a;

    C4364c0(C9147z<C4430s2> zVar) {
        this.f12401a = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo13827a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C9158f.m30458b(this.f12401a.mo13826a().mo13867e(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C4396k0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C4396k0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C4396k0("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
