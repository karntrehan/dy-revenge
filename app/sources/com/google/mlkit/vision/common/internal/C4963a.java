package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3675i;
import com.google.android.gms.common.internal.C3705r;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: com.google.mlkit.vision.common.internal.a */
public class C4963a {

    /* renamed from: a */
    private static final C3675i f13850a = new C3675i("StreamingFormatChecker", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b */
    private final LinkedList<Long> f13851b = new LinkedList<>();

    /* renamed from: c */
    private long f13852c = -1;

    /* renamed from: a */
    public void mo14974a(@RecentlyNonNull C9631a aVar) {
        if (aVar.mo24129f() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f13851b.add(Long.valueOf(elapsedRealtime));
            if (this.f13851b.size() > 5) {
                this.f13851b.removeFirst();
            }
            if (this.f13851b.size() == 5 && elapsedRealtime - ((Long) C3705r.m14346k(this.f13851b.peekFirst())).longValue() < 5000) {
                long j = this.f13852c;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5)) {
                    this.f13852c = elapsedRealtime;
                    f13850a.mo11613f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
