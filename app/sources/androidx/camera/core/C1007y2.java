package androidx.camera.core;

/* renamed from: androidx.camera.core.y2 */
final class C1007y2 extends C0627c2 {

    /* renamed from: p */
    private boolean f2846p = false;

    C1007y2(ImageProxy imageProxy) {
        super(imageProxy);
    }

    public synchronized void close() {
        if (!this.f2846p) {
            this.f2846p = true;
            super.close();
        }
    }
}
