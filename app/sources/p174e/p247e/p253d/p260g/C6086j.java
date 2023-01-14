package p174e.p247e.p253d.p260g;

import java.io.IOException;
import java.io.OutputStream;
import p174e.p247e.p253d.p257d.C6070p;

/* renamed from: e.e.d.g.j */
public abstract class C6086j extends OutputStream {
    /* renamed from: a */
    public abstract C6082g mo8174a();

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C6070p.m22850a(e);
        }
    }

    public abstract int size();
}
