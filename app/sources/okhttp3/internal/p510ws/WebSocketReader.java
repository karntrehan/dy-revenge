package okhttp3.internal.p510ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10616i;

/* renamed from: okhttp3.internal.ws.WebSocketReader */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final C10603f controlFrameBuffer = new C10603f();
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final C10603f.C10604a maskCursor;
    private final byte[] maskKey;
    private final C10603f messageFrameBuffer = new C10603f();
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final C10615h source;

    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(C10616i iVar);

        void onReadMessage(String str);

        void onReadPing(C10616i iVar);

        void onReadPong(C10616i iVar);
    }

    public WebSocketReader(boolean z, C10615h hVar, FrameCallback frameCallback2, boolean z2, boolean z3) {
        C10457l.m35320e(hVar, "source");
        C10457l.m35320e(frameCallback2, "frameCallback");
        this.isClient = z;
        this.source = hVar;
        this.frameCallback = frameCallback2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        C10603f.C10604a aVar = null;
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = !z ? new C10603f.C10604a() : aVar;
    }

    private final void readControlFrame() {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo26393z(this.controlFrameBuffer, j);
            if (!this.isClient) {
                C10603f fVar = this.controlFrameBuffer;
                C10603f.C10604a aVar = this.maskCursor;
                C10457l.m35317b(aVar);
                fVar.mo26314E0(aVar);
                this.maskCursor.mo26398h(0);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                C10603f.C10604a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                C10457l.m35317b(bArr);
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.mo26319J0();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.mo26335T());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.mo26335T());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    /* JADX INFO: finally extract failed */
    private final void readHeader() {
        boolean z;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i = and & 15;
                this.opcode = i;
                boolean z2 = false;
                boolean z3 = (and & 128) != 0;
                this.isFinalFrame = z3;
                boolean z4 = (and & 8) != 0;
                this.isControlFrame = z4;
                if (!z4 || z3) {
                    boolean z5 = (and & 64) != 0;
                    if (i == 1 || i == 2) {
                        if (!z5) {
                            z = false;
                        } else if (this.perMessageDeflate) {
                            z = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.readingCompressedMessage = z;
                    } else if (z5) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if (!((and & 32) != 0)) {
                        if (!((and & 16) != 0)) {
                            int and2 = Util.and(this.source.readByte(), 255);
                            if ((and2 & 128) != 0) {
                                z2 = true;
                            }
                            if (z2 == this.isClient) {
                                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                            }
                            long j = (long) (and2 & 127);
                            this.frameLength = j;
                            if (j == ((long) WebSocketProtocol.PAYLOAD_SHORT)) {
                                this.frameLength = (long) Util.and(this.source.readShort(), (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            } else if (j == ((long) 127)) {
                                long readLong = this.source.readLong();
                                this.frameLength = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.isControlFrame && this.frameLength > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z2) {
                                C10615h hVar = this.source;
                                byte[] bArr = this.maskKey;
                                C10457l.m35317b(bArr);
                                hVar.readFully(bArr);
                            }
                        } else {
                            throw new ProtocolException("Unexpected rsv3 flag");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private final void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo26393z(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    C10603f fVar = this.messageFrameBuffer;
                    C10603f.C10604a aVar = this.maskCursor;
                    C10457l.m35317b(aVar);
                    fVar.mo26314E0(aVar);
                    this.maskCursor.mo26398h(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    C10603f.C10604a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    C10457l.m35317b(bArr);
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (this.readingCompressedMessage) {
                MessageInflater messageInflater2 = this.messageInflater;
                if (messageInflater2 == null) {
                    messageInflater2 = new MessageInflater(this.noContextTakeover);
                    this.messageInflater = messageInflater2;
                }
                messageInflater2.inflate(this.messageFrameBuffer);
            }
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo26319J0());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo26335T());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i));
        }
    }

    private final void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void close() {
        MessageInflater messageInflater2 = this.messageInflater;
        if (messageInflater2 != null) {
            messageInflater2.close();
        }
    }

    public final C10615h getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
