package okhttp3.internal.http2;

import java.util.List;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10615h;

public interface PushObserver {
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();
    public static final Companion Companion = new Companion((C10452g) null);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class PushObserverCancel implements PushObserver {
            public boolean onData(int i, C10615h hVar, int i2, boolean z) {
                C10457l.m35320e(hVar, "source");
                hVar.mo26358l((long) i2);
                return true;
            }

            public boolean onHeaders(int i, List<Header> list, boolean z) {
                C10457l.m35320e(list, "responseHeaders");
                return true;
            }

            public boolean onRequest(int i, List<Header> list) {
                C10457l.m35320e(list, "requestHeaders");
                return true;
            }

            public void onReset(int i, ErrorCode errorCode) {
                C10457l.m35320e(errorCode, "errorCode");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    boolean onData(int i, C10615h hVar, int i2, boolean z);

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
