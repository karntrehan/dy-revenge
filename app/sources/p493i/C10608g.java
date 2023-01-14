package p493i;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: i.g */
public interface C10608g extends C10590b0, WritableByteChannel {
    /* renamed from: C */
    C10608g mo26310C();

    /* renamed from: K */
    C10608g mo26320K(String str);

    /* renamed from: P */
    C10608g mo26328P(String str, int i, int i2);

    /* renamed from: Q */
    long mo26330Q(C10598d0 d0Var);

    /* renamed from: R */
    C10608g mo26332R(long j);

    /* renamed from: d */
    C10603f mo26350d();

    /* renamed from: d0 */
    C10608g mo26351d0(C10616i iVar);

    void flush();

    /* renamed from: m0 */
    C10608g mo26360m0(long j);

    /* renamed from: o0 */
    OutputStream mo26362o0();

    /* renamed from: s */
    C10608g mo26374s();

    C10608g write(byte[] bArr);

    C10608g write(byte[] bArr, int i, int i2);

    C10608g writeByte(int i);

    C10608g writeInt(int i);

    C10608g writeShort(int i);
}
