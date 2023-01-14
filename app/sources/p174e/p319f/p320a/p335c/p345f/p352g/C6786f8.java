package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.IOException;

/* renamed from: e.f.a.c.f.g.f8 */
public final class C6786f8 extends IOException {
    C6786f8(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    C6786f8(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
