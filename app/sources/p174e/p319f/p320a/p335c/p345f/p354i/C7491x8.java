package p174e.p319f.p320a.p335c.p345f.p354i;

/* renamed from: e.f.a.c.f.i.x8 */
public enum C7491x8 implements C7155a2 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);
    

    /* renamed from: C */
    private final int f20140C;

    private C7491x8(int i) {
        this.f20140C = i;
    }

    public final int zza() {
        return this.f20140C;
    }
}
