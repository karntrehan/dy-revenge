package p027c.p043d.p044a.p046l1.p052q;

import android.media.MediaCodec;
import android.os.SystemClock;
import androidx.camera.core.C0949o2;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c.d.a.l1.q.a */
public class C1690a {

    /* renamed from: a */
    private AtomicBoolean f5088a = null;

    /* renamed from: a */
    public void mo5918a(MediaCodec.BufferInfo bufferInfo) {
        if (this.f5088a == null) {
            if (bufferInfo.size > 0 && bufferInfo.presentationTimeUs > 0 && (bufferInfo.flags & 2) == 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                boolean z = Math.abs(bufferInfo.presentationTimeUs - timeUnit.toMicros(SystemClock.elapsedRealtime())) < Math.abs(bufferInfo.presentationTimeUs - timeUnit.toMicros(SystemClock.uptimeMillis()));
                if (z) {
                    C0949o2.m3698k("CorrectVideoTimeByTimebase", "Detected video buffer timestamp is close to real time.");
                }
                this.f5088a = new AtomicBoolean(z);
            } else {
                return;
            }
        }
        if (this.f5088a.get()) {
            bufferInfo.presentationTimeUs -= TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - SystemClock.uptimeMillis());
        }
    }
}
