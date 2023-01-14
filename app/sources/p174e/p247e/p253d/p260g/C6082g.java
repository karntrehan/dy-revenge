package p174e.p247e.p253d.p260g;

import java.io.Closeable;

/* renamed from: e.e.d.g.g */
public interface C6082g extends Closeable {

    /* renamed from: e.e.d.g.g$a */
    public static class C6083a extends RuntimeException {
        public C6083a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    boolean isClosed();

    /* renamed from: j */
    byte mo8160j(int i);

    /* renamed from: k */
    int mo8161k(int i, byte[] bArr, int i2, int i3);

    int size();
}
