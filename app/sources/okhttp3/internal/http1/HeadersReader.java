package okhttp3.internal.http1;

import okhttp3.Headers;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10615h;

public final class HeadersReader {
    public static final Companion Companion = new Companion((C10452g) null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = ((long) HEADER_LIMIT);
    private final C10615h source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    public HeadersReader(C10615h hVar) {
        C10457l.m35320e(hVar, "source");
        this.source = hVar;
    }

    public final C10615h getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String G = this.source.mo26315G(this.headerLimit);
        this.headerLimit -= (long) G.length();
        return G;
    }
}
