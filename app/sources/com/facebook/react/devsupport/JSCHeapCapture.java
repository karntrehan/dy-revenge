package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p109b0.p110a.C2639a;
import java.io.File;

@C2639a(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    public static final String TAG = "JSCHeapCapture";
    private C2710a mCaptureInProgress = null;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$a */
    public interface C2710a {
        /* renamed from: a */
        void mo8866a(File file);

        /* renamed from: b */
        void mo8867b(C2711b bVar);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$b */
    public static class C2711b extends Exception {
        C2711b(String str) {
            super(str);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public synchronized void captureComplete(String str, String str2) {
        C2710a aVar = this.mCaptureInProgress;
        if (aVar != null) {
            if (str2 == null) {
                aVar.mo8866a(new File(str));
            } else {
                aVar.mo8867b(new C2711b(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void captureHeap(java.lang.String r3, com.facebook.react.devsupport.JSCHeapCapture.C2710a r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.react.devsupport.JSCHeapCapture$a r0 = r2.mCaptureInProgress     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0011
            com.facebook.react.devsupport.JSCHeapCapture$b r3 = new com.facebook.react.devsupport.JSCHeapCapture$b     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "Heap capture already in progress."
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            r4.mo8867b(r3)     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)
            return
        L_0x0011:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r1.<init>()     // Catch:{ all -> 0x0051 }
            r1.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "/capture.json"
            r1.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0051 }
            r0.<init>(r3)     // Catch:{ all -> 0x0051 }
            r0.delete()     // Catch:{ all -> 0x0051 }
            com.facebook.react.bridge.ReactApplicationContext r3 = r2.getReactApplicationContextIfActiveOrWarn()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x004f
            java.lang.Class<com.facebook.react.devsupport.JSCHeapCapture$HeapCapture> r1 = com.facebook.react.devsupport.JSCHeapCapture.HeapCapture.class
            com.facebook.react.bridge.JavaScriptModule r3 = r3.getJSModule(r1)     // Catch:{ all -> 0x0051 }
            com.facebook.react.devsupport.JSCHeapCapture$HeapCapture r3 = (com.facebook.react.devsupport.JSCHeapCapture.HeapCapture) r3     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0046
            com.facebook.react.devsupport.JSCHeapCapture$b r3 = new com.facebook.react.devsupport.JSCHeapCapture$b     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "Heap capture js module not registered."
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            r4.mo8867b(r3)     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)
            return
        L_0x0046:
            r2.mCaptureInProgress = r4     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = r0.getPath()     // Catch:{ all -> 0x0051 }
            r3.captureHeap(r4)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r2)
            return
        L_0x0051:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.JSCHeapCapture.captureHeap(java.lang.String, com.facebook.react.devsupport.JSCHeapCapture$a):void");
    }

    public String getName() {
        return TAG;
    }
}
