package okhttp3.internal.p510ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10616i;

/* renamed from: okhttp3.internal.ws.WebSocketWriter */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C10603f.C10604a maskCursor;
    private final byte[] maskKey;
    private final C10603f messageBuffer = new C10603f();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final C10608g sink;
    private final C10603f sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, C10608g gVar, Random random2, boolean z2, boolean z3, long j) {
        C10457l.m35320e(gVar, "sink");
        C10457l.m35320e(random2, "random");
        this.isClient = z;
        this.sink = gVar;
        this.random = random2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = gVar.mo26350d();
        C10603f.C10604a aVar = null;
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C10603f.C10604a() : aVar;
    }

    private final void writeControlFrame(int i, C10616i iVar) {
        if (!this.writerClosed) {
            int Y = iVar.mo26420Y();
            if (((long) Y) <= 125) {
                this.sinkBuffer.writeByte(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(Y | 128);
                    Random random2 = this.random;
                    byte[] bArr = this.maskKey;
                    C10457l.m35317b(bArr);
                    random2.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (Y > 0) {
                        long size = this.sinkBuffer.size();
                        this.sinkBuffer.mo26351d0(iVar);
                        C10603f fVar = this.sinkBuffer;
                        C10603f.C10604a aVar = this.maskCursor;
                        C10457l.m35317b(aVar);
                        fVar.mo26314E0(aVar);
                        this.maskCursor.mo26398h(size);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(Y);
                    this.sinkBuffer.mo26351d0(iVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public void close() {
        MessageDeflater messageDeflater2 = this.messageDeflater;
        if (messageDeflater2 != null) {
            messageDeflater2.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final C10608g getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C10616i iVar) {
        C10616i iVar2 = C10616i.f28049f;
        if (!(i == 0 && iVar == null)) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C10603f fVar = new C10603f();
            fVar.writeShort(i);
            if (iVar != null) {
                fVar.mo26351d0(iVar);
            }
            iVar2 = fVar.mo26335T();
        }
        try {
            writeControlFrame(8, iVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C10616i iVar) {
        C10457l.m35320e(iVar, "data");
        if (!this.writerClosed) {
            this.messageBuffer.mo26351d0(iVar);
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && ((long) iVar.mo26420Y()) >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater2 = this.messageDeflater;
                if (messageDeflater2 == null) {
                    messageDeflater2 = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater2;
                }
                messageDeflater2.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long size = this.messageBuffer.size();
            this.sinkBuffer.writeByte(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (size <= 125) {
                this.sinkBuffer.writeByte(((int) size) | i2);
            } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.writeByte(i2 | WebSocketProtocol.PAYLOAD_SHORT);
                this.sinkBuffer.writeShort((int) size);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.mo26341X0(size);
            }
            if (this.isClient) {
                Random random2 = this.random;
                byte[] bArr = this.maskKey;
                C10457l.m35317b(bArr);
                random2.nextBytes(bArr);
                this.sinkBuffer.write(this.maskKey);
                if (size > 0) {
                    C10603f fVar = this.messageBuffer;
                    C10603f.C10604a aVar = this.maskCursor;
                    C10457l.m35317b(aVar);
                    fVar.mo26314E0(aVar);
                    this.maskCursor.mo26398h(0);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, size);
            this.sink.mo26374s();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(C10616i iVar) {
        C10457l.m35320e(iVar, "payload");
        writeControlFrame(9, iVar);
    }

    public final void writePong(C10616i iVar) {
        C10457l.m35320e(iVar, "payload");
        writeControlFrame(10, iVar);
    }
}
