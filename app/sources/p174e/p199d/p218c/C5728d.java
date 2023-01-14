package p174e.p199d.p218c;

/* renamed from: e.d.c.d */
public class C5728d {

    /* renamed from: a */
    private final int f16200a;

    /* renamed from: b */
    private final int f16201b;

    /* renamed from: c */
    private final int f16202c;

    /* renamed from: d */
    private final int f16203d;

    /* renamed from: e */
    private final String f16204e;

    /* renamed from: f */
    private final C5718a f16205f;

    public C5728d(int i, int i2, int i3, int i4, String str, C5718a aVar) {
        this.f16200a = i;
        this.f16201b = i2;
        this.f16202c = i3;
        this.f16203d = i4;
        this.f16204e = str;
        this.f16205f = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5728d.class != obj.getClass()) {
            return false;
        }
        C5728d dVar = (C5728d) obj;
        if (this.f16203d != dVar.f16203d || this.f16202c != dVar.f16202c || this.f16200a != dVar.f16200a || this.f16201b != dVar.f16201b) {
            return false;
        }
        C5718a aVar = this.f16205f;
        if (aVar == null ? dVar.f16205f != null : !aVar.equals(dVar.f16205f)) {
            return false;
        }
        String str = this.f16204e;
        String str2 = dVar.f16204e;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        int i = ((((((this.f16200a * 31) + this.f16201b) * 31) + this.f16202c) * 31) + this.f16203d) * 31;
        String str = this.f16204e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C5718a aVar = this.f16205f;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("x: ");
        sb.append(this.f16200a);
        sb.append(" y: ");
        sb.append(this.f16201b);
        sb.append(" width: ");
        sb.append(this.f16202c);
        sb.append(" height: ");
        sb.append(this.f16203d);
        if (this.f16204e != null) {
            sb.append(" name: ");
            sb.append(this.f16204e);
        }
        if (this.f16205f != null) {
            sb.append(" age: ");
            sb.append(this.f16205f.mo17100c());
        }
        return sb.toString();
    }
}
