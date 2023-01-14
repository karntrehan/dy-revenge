package p027c.p043d.p044a;

import java.io.File;
import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.C1710s0;

/* renamed from: c.d.a.i0 */
final class C1546i0 extends C1710s0.C1712b {

    /* renamed from: a */
    private final File f4824a;

    /* renamed from: b */
    private final long f4825b;

    /* renamed from: c.d.a.i0$b */
    static final class C1548b extends C1710s0.C1712b.C1713a {

        /* renamed from: a */
        private File f4826a;

        /* renamed from: b */
        private Long f4827b;

        C1548b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1710s0.C1712b mo5688a() {
            File file = this.f4826a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (file == null) {
                str = str + " file";
            }
            if (this.f4827b == null) {
                str = str + " fileSizeLimit";
            }
            if (str.isEmpty()) {
                return new C1546i0(this.f4826a, this.f4827b.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1710s0.C1712b.C1713a mo5689b(File file) {
            Objects.requireNonNull(file, "Null file");
            this.f4826a = file;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1710s0.C1712b.C1713a mo5690c(long j) {
            this.f4827b = Long.valueOf(j);
            return this;
        }
    }

    private C1546i0(File file, long j) {
        this.f4824a = file;
        this.f4825b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo5683a() {
        return this.f4824a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo5684b() {
        return this.f4825b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1710s0.C1712b)) {
            return false;
        }
        C1710s0.C1712b bVar = (C1710s0.C1712b) obj;
        return this.f4824a.equals(bVar.mo5683a()) && this.f4825b == bVar.mo5684b();
    }

    public int hashCode() {
        long j = this.f4825b;
        return ((this.f4824a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FileOutputOptionsInternal{file=" + this.f4824a + ", fileSizeLimit=" + this.f4825b + "}";
    }
}
