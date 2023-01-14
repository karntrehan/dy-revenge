package okhttp3.internal.p510ws;

import java.io.Closeable;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import p455g.p470y.p472d.C10457l;
import p493i.C10598d0;
import p493i.C10603f;
import p493i.C10623o;

/* renamed from: okhttp3.internal.ws.MessageInflater */
public final class MessageInflater implements Closeable {
    private final C10603f deflatedBytes;
    private final Inflater inflater;
    private final C10623o inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C10603f fVar = new C10603f();
        this.deflatedBytes = fVar;
        Inflater inflater2 = new Inflater(true);
        this.inflater = inflater2;
        this.inflaterSource = new C10623o((C10598d0) fVar, inflater2);
    }

    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(C10603f fVar) {
        C10457l.m35320e(fVar, "buffer");
        if (this.deflatedBytes.size() == 0) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.mo26330Q(fVar);
            this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.size();
            do {
                this.inflaterSource.mo26441a(fVar, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
