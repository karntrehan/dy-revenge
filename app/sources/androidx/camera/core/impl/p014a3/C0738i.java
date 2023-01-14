package androidx.camera.core.impl.p014a3;

import androidx.camera.core.impl.p014a3.C0731h;
import androidx.core.util.C1177h;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.a3.i */
public final class C0738i extends FilterOutputStream {

    /* renamed from: f */
    private static final byte[] f2272f = "Exif\u0000\u0000".getBytes(C0730g.f2238a);

    /* renamed from: o */
    private final C0731h f2273o;

    /* renamed from: p */
    private final byte[] f2274p = new byte[1];

    /* renamed from: q */
    private final ByteBuffer f2275q = ByteBuffer.allocate(4);

    /* renamed from: r */
    private int f2276r = 0;

    /* renamed from: s */
    private int f2277s;

    /* renamed from: t */
    private int f2278t;

    /* renamed from: androidx.camera.core.impl.a3.i$a */
    static final class C0739a {
        /* renamed from: a */
        public static boolean m3038a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public C0738i(OutputStream outputStream, C0731h hVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f2273o = hVar;
    }

    /* renamed from: a */
    private int m3036a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f2275q.position());
        this.f2275q.put(bArr, i2, min);
        return min;
    }

    /* renamed from: b */
    private void m3037b(C0715a aVar) {
        C0740j[][] jVarArr = C0731h.f2252g;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (C0740j jVar : C0731h.f2250e) {
            for (int i = 0; i < C0731h.f2252g.length; i++) {
                this.f2273o.mo2850b(i).remove(jVar.f2280b);
            }
        }
        if (!this.f2273o.mo2850b(1).isEmpty()) {
            this.f2273o.mo2850b(0).put(C0731h.f2250e[1].f2280b, C0730g.m3011f(0, this.f2273o.mo2851c()));
        }
        if (!this.f2273o.mo2850b(2).isEmpty()) {
            this.f2273o.mo2850b(0).put(C0731h.f2250e[2].f2280b, C0730g.m3011f(0, this.f2273o.mo2851c()));
        }
        if (!this.f2273o.mo2850b(3).isEmpty()) {
            this.f2273o.mo2850b(1).put(C0731h.f2250e[3].f2280b, C0730g.m3011f(0, this.f2273o.mo2851c()));
        }
        for (int i2 = 0; i2 < C0731h.f2252g.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C0730g> value : this.f2273o.mo2850b(i2).entrySet()) {
                int j = ((C0730g) value.getValue()).mo2848j();
                if (j > 4) {
                    i3 += j;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < C0731h.f2252g.length; i5++) {
            if (!this.f2273o.mo2850b(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f2273o.mo2850b(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f2273o.mo2850b(1).isEmpty()) {
            this.f2273o.mo2850b(0).put(C0731h.f2250e[1].f2280b, C0730g.m3011f((long) iArr[1], this.f2273o.mo2851c()));
        }
        if (!this.f2273o.mo2850b(2).isEmpty()) {
            this.f2273o.mo2850b(0).put(C0731h.f2250e[2].f2280b, C0730g.m3011f((long) iArr[2], this.f2273o.mo2851c()));
        }
        if (!this.f2273o.mo2850b(3).isEmpty()) {
            this.f2273o.mo2850b(1).put(C0731h.f2250e[3].f2280b, C0730g.m3011f((long) iArr[3], this.f2273o.mo2851c()));
        }
        aVar.mo2815A(i6);
        aVar.write(f2272f);
        aVar.mo2819o(this.f2273o.mo2851c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        aVar.mo2816a(this.f2273o.mo2851c());
        aVar.mo2815A(42);
        aVar.mo2820r(8);
        for (int i7 = 0; i7 < C0731h.f2252g.length; i7++) {
            if (!this.f2273o.mo2850b(i7).isEmpty()) {
                aVar.mo2815A(this.f2273o.mo2850b(i7).size());
                int size = iArr[i7] + 2 + (this.f2273o.mo2850b(i7).size() * 12) + 4;
                for (Map.Entry next : this.f2273o.mo2850b(i7).entrySet()) {
                    int i8 = ((C0740j) C1177h.m4584f((C0740j) C0731h.C0733b.f2261d.get(i7).get(next.getKey()), "Tag not supported: " + ((String) next.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f2279a;
                    C0730g gVar = (C0730g) next.getValue();
                    int j2 = gVar.mo2848j();
                    aVar.mo2815A(i8);
                    aVar.mo2815A(gVar.f2242e);
                    aVar.mo2818h(gVar.f2243f);
                    if (j2 > 4) {
                        aVar.mo2820r((long) size);
                        size += j2;
                    } else {
                        aVar.write(gVar.f2245h);
                        if (j2 < 4) {
                            while (j2 < 4) {
                                aVar.mo2817b(0);
                                j2++;
                            }
                        }
                    }
                }
                aVar.mo2820r(0);
                for (Map.Entry<String, C0730g> value2 : this.f2273o.mo2850b(i7).entrySet()) {
                    byte[] bArr = ((C0730g) value2.getValue()).f2245h;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        aVar.mo2816a(ByteOrder.BIG_ENDIAN);
    }

    public void write(int i) {
        byte[] bArr = this.f2274p;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int i3 = this.f2277s;
            if ((i3 > 0 || this.f2278t > 0 || this.f2276r != 2) && i2 > 0) {
                if (i3 > 0) {
                    int min = Math.min(i2, i3);
                    i2 -= min;
                    this.f2277s -= min;
                    i += min;
                }
                int i4 = this.f2278t;
                if (i4 > 0) {
                    int min2 = Math.min(i2, i4);
                    this.out.write(bArr, i, min2);
                    i2 -= min2;
                    this.f2278t -= min2;
                    i += min2;
                }
                if (i2 != 0) {
                    int i5 = this.f2276r;
                    if (i5 == 0) {
                        int a = m3036a(2, bArr, i, i2);
                        i += a;
                        i2 -= a;
                        if (this.f2275q.position() >= 2) {
                            this.f2275q.rewind();
                            if (this.f2275q.getShort() == -40) {
                                this.out.write(this.f2275q.array(), 0, 2);
                                this.f2276r = 1;
                                this.f2275q.rewind();
                                C0715a aVar = new C0715a(this.out, ByteOrder.BIG_ENDIAN);
                                aVar.mo2819o(-31);
                                m3037b(aVar);
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    } else if (i5 != 1) {
                        continue;
                    } else {
                        int a2 = m3036a(4, bArr, i, i2);
                        i += a2;
                        i2 -= a2;
                        if (this.f2275q.position() == 2 && this.f2275q.getShort() == -39) {
                            this.out.write(this.f2275q.array(), 0, 2);
                            this.f2275q.rewind();
                        }
                        if (this.f2275q.position() >= 4) {
                            this.f2275q.rewind();
                            short s = this.f2275q.getShort();
                            if (s == -31) {
                                this.f2277s = (this.f2275q.getShort() & 65535) - 2;
                            } else if (!C0739a.m3038a(s)) {
                                this.out.write(this.f2275q.array(), 0, 4);
                                this.f2278t = (this.f2275q.getShort() & 65535) - 2;
                                this.f2275q.rewind();
                            } else {
                                this.out.write(this.f2275q.array(), 0, 4);
                            }
                            this.f2276r = 2;
                            this.f2275q.rewind();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (i2 > 0) {
            this.out.write(bArr, i, i2);
        }
    }
}
