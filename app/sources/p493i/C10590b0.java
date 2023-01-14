package p493i;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: i.b0 */
public interface C10590b0 extends Closeable, Flushable {
    void close();

    void flush();

    C10600e0 timeout();

    void write(C10603f fVar, long j);
}
