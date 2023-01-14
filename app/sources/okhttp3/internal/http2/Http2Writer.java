package okhttp3.internal.http2;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10608g;

public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion((C10452g) null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C10603f hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
    private final C10608g sink;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    public Http2Writer(C10608g gVar, boolean z) {
        C10457l.m35320e(gVar, "sink");
        this.sink = gVar;
        this.client = z;
        C10603f fVar = new C10603f();
        this.hpackBuffer = fVar;
        this.hpackWriter = new Hpack.Writer(0, false, fVar, 3, (C10452g) null);
    }

    private final void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.maxFrameSize, j);
            j -= min;
            frameHeader(i, (int) min, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) {
        C10457l.m35320e(settings, "peerSettings");
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.mo26262N(), new Object[0]));
            }
            this.sink.mo26351d0(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z, int i, C10603f fVar, int i2) {
        if (!this.closed) {
            int i3 = 0;
            if (z) {
                i3 = 1;
            }
            dataFrame(i, i3, fVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i, int i2, C10603f fVar, int i3) {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            C10608g gVar = this.sink;
            C10457l.m35317b(fVar);
            gVar.write(fVar, (long) i3);
        }
    }

    public final synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.maxFrameSize) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                Util.writeMedium(this.sink, i2);
                this.sink.writeByte(i3 & 255);
                this.sink.writeByte(i4 & 255);
                this.sink.writeInt(i & RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        C10457l.m35320e(errorCode, "errorCode");
        C10457l.m35320e(bArr, "debugData");
        if (!this.closed) {
            boolean z = false;
            if (errorCode.getHttpCode() != -1) {
                frameHeader(0, bArr.length + 8, 7, 0);
                this.sink.writeInt(i);
                this.sink.writeInt(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) {
        C10457l.m35320e(list, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            long min = Math.min((long) this.maxFrameSize, size);
            int i2 = (size > min ? 1 : (size == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            frameHeader(i, (int) min, 1, i3);
            this.sink.write(this.hpackBuffer, min);
            if (i2 > 0) {
                writeContinuationFrames(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) {
        if (!this.closed) {
            frameHeader(0, 8, 6, z ? 1 : 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) {
        C10457l.m35320e(list, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(((long) this.maxFrameSize) - 4, size);
            int i3 = min + 4;
            long j = (long) min;
            int i4 = (size > j ? 1 : (size == j ? 0 : -1));
            frameHeader(i, i3, 5, i4 == 0 ? 4 : 0);
            this.sink.writeInt(i2 & RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
            this.sink.write(this.hpackBuffer, j);
            if (i4 > 0) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) {
        C10457l.m35320e(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(i, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) {
        C10457l.m35320e(settings, "settings");
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.sink.writeInt(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i, long j) {
        if (!this.closed) {
            if (j != 0 && j <= 2147483647L) {
                frameHeader(i, 4, 8, 0);
                this.sink.writeInt((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
