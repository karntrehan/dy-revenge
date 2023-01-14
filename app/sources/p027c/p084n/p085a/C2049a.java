package p027c.p084n.p085a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.HttpUrl;
import p027c.p084n.p085a.C2057b;

/* renamed from: c.n.a.a */
public class C2049a {

    /* renamed from: A */
    private static SimpleDateFormat f5913A;

    /* renamed from: B */
    static final String[] f5914B = {HttpUrl.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: C */
    static final int[] f5915C = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: D */
    static final byte[] f5916D = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: E */
    private static final C2054e[] f5917E;

    /* renamed from: F */
    private static final C2054e[] f5918F;

    /* renamed from: G */
    private static final C2054e[] f5919G;

    /* renamed from: H */
    private static final C2054e[] f5920H;

    /* renamed from: I */
    private static final C2054e[] f5921I;

    /* renamed from: J */
    private static final C2054e f5922J = new C2054e("StripOffsets", 273, 3);

    /* renamed from: K */
    private static final C2054e[] f5923K;

    /* renamed from: L */
    private static final C2054e[] f5924L;

    /* renamed from: M */
    private static final C2054e[] f5925M;

    /* renamed from: N */
    private static final C2054e[] f5926N;

    /* renamed from: O */
    static final C2054e[][] f5927O;

    /* renamed from: P */
    private static final C2054e[] f5928P = {new C2054e("SubIFDPointer", 330, 4), new C2054e("ExifIFDPointer", 34665, 4), new C2054e("GPSInfoIFDPointer", 34853, 4), new C2054e("InteroperabilityIFDPointer", 40965, 4), new C2054e("CameraSettingsIFDPointer", 8224, 1), new C2054e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: Q */
    private static final HashMap<Integer, C2054e>[] f5929Q;

    /* renamed from: R */
    private static final HashMap<String, C2054e>[] f5930R;

    /* renamed from: S */
    private static final HashSet<String> f5931S = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: T */
    private static final HashMap<Integer, Integer> f5932T = new HashMap<>();

    /* renamed from: U */
    static final Charset f5933U;

    /* renamed from: V */
    static final byte[] f5934V;

    /* renamed from: W */
    private static final byte[] f5935W;

    /* renamed from: X */
    private static final Pattern f5936X = Pattern.compile(".*[1-9].*");

    /* renamed from: Y */
    private static final Pattern f5937Y = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: Z */
    private static final Pattern f5938Z = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: a */
    private static final boolean f5939a = Log.isLoggable("ExifInterface", 3);

    /* renamed from: a0 */
    private static final Pattern f5940a0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: b */
    private static final List<Integer> f5941b = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: c */
    private static final List<Integer> f5942c = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: d */
    public static final int[] f5943d = {8, 8, 8};

    /* renamed from: e */
    public static final int[] f5944e = {4};

    /* renamed from: f */
    public static final int[] f5945f = {8};

    /* renamed from: g */
    static final byte[] f5946g = {-1, -40, -1};

    /* renamed from: h */
    private static final byte[] f5947h = {102, 116, 121, 112};

    /* renamed from: i */
    private static final byte[] f5948i = {109, 105, 102, 49};

    /* renamed from: j */
    private static final byte[] f5949j = {104, 101, 105, 99};

    /* renamed from: k */
    private static final byte[] f5950k = {79, 76, 89, 77, 80, 0};

    /* renamed from: l */
    private static final byte[] f5951l = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: m */
    private static final byte[] f5952m = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: n */
    private static final byte[] f5953n = {101, 88, 73, 102};

    /* renamed from: o */
    private static final byte[] f5954o = {73, 72, 68, 82};

    /* renamed from: p */
    private static final byte[] f5955p = {73, 69, 78, 68};

    /* renamed from: q */
    private static final byte[] f5956q = {82, 73, 70, 70};

    /* renamed from: r */
    private static final byte[] f5957r = {87, 69, 66, 80};

    /* renamed from: s */
    private static final byte[] f5958s = {69, 88, 73, 70};

    /* renamed from: t */
    private static final byte[] f5959t = {-99, 1, 42};

    /* renamed from: u */
    private static final byte[] f5960u = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: v */
    private static final byte[] f5961v = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: w */
    private static final byte[] f5962w = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: x */
    private static final byte[] f5963x = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: y */
    private static final byte[] f5964y = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: z */
    private static SimpleDateFormat f5965z;

    /* renamed from: b0 */
    private String f5966b0;

    /* renamed from: c0 */
    private FileDescriptor f5967c0;

    /* renamed from: d0 */
    private AssetManager.AssetInputStream f5968d0;

    /* renamed from: e0 */
    private int f5969e0;

    /* renamed from: f0 */
    private boolean f5970f0;

    /* renamed from: g0 */
    private final HashMap<String, C2053d>[] f5971g0;

    /* renamed from: h0 */
    private Set<Integer> f5972h0;

    /* renamed from: i0 */
    private ByteOrder f5973i0;

    /* renamed from: j0 */
    private boolean f5974j0;

    /* renamed from: k0 */
    private boolean f5975k0;

    /* renamed from: l0 */
    private boolean f5976l0;

    /* renamed from: m0 */
    private int f5977m0;

    /* renamed from: n0 */
    private int f5978n0;

    /* renamed from: o0 */
    private byte[] f5979o0;

    /* renamed from: p0 */
    private int f5980p0;

    /* renamed from: q0 */
    private int f5981q0;

    /* renamed from: r0 */
    private int f5982r0;

    /* renamed from: s0 */
    private int f5983s0;

    /* renamed from: t0 */
    private int f5984t0;

    /* renamed from: u0 */
    private boolean f5985u0;

    /* renamed from: v0 */
    private boolean f5986v0;

    /* renamed from: c.n.a.a$a */
    class C2050a extends MediaDataSource {

        /* renamed from: f */
        long f5987f;

        /* renamed from: o */
        final /* synthetic */ C2056g f5988o;

        C2050a(C2056g gVar) {
            this.f5988o = gVar;
        }

        public void close() {
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f5987f;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f5988o.available())) {
                        return -1;
                    }
                    this.f5988o.mo6946r(j);
                    this.f5987f = j;
                }
                if (i2 > this.f5988o.available()) {
                    i2 = this.f5988o.available();
                }
                int read = this.f5988o.read(bArr, i, i2);
                if (read >= 0) {
                    this.f5987f += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f5987f = -1;
            return -1;
        }
    }

    /* renamed from: c.n.a.a$b */
    private static class C2051b extends InputStream implements DataInput {

        /* renamed from: f */
        private static final ByteOrder f5990f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: o */
        private static final ByteOrder f5991o = ByteOrder.BIG_ENDIAN;

        /* renamed from: p */
        final DataInputStream f5992p;

        /* renamed from: q */
        private ByteOrder f5993q;

        /* renamed from: r */
        int f5994r;

        /* renamed from: s */
        private byte[] f5995s;

        C2051b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        C2051b(InputStream inputStream, ByteOrder byteOrder) {
            this.f5993q = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f5992p = dataInputStream;
            dataInputStream.mark(0);
            this.f5994r = 0;
            this.f5993q = byteOrder;
        }

        C2051b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo6905a() {
            return this.f5994r;
        }

        public int available() {
            return this.f5992p.available();
        }

        /* renamed from: b */
        public long mo6907b() {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: h */
        public void mo6908h(ByteOrder byteOrder) {
            this.f5993q = byteOrder;
        }

        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* renamed from: o */
        public void mo6910o(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f5992p.skip((long) i3);
                if (skip <= 0) {
                    if (this.f5995s == null) {
                        this.f5995s = new byte[8192];
                    }
                    skip = this.f5992p.read(this.f5995s, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f5994r += i2;
        }

        public int read() {
            this.f5994r++;
            return this.f5992p.read();
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.f5992p.read(bArr, i, i2);
            this.f5994r += read;
            return read;
        }

        public boolean readBoolean() {
            this.f5994r++;
            return this.f5992p.readBoolean();
        }

        public byte readByte() {
            this.f5994r++;
            int read = this.f5992p.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f5994r += 2;
            return this.f5992p.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            this.f5994r += bArr.length;
            this.f5992p.readFully(bArr);
        }

        public void readFully(byte[] bArr, int i, int i2) {
            this.f5994r += i2;
            this.f5992p.readFully(bArr, i, i2);
        }

        public int readInt() {
            this.f5994r += 4;
            int read = this.f5992p.read();
            int read2 = this.f5992p.read();
            int read3 = this.f5992p.read();
            int read4 = this.f5992p.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f5993q;
                if (byteOrder == f5990f) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f5991o) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f5993q);
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            this.f5994r += 8;
            int read = this.f5992p.read();
            int read2 = this.f5992p.read();
            int read3 = this.f5992p.read();
            int read4 = this.f5992p.read();
            int read5 = this.f5992p.read();
            int read6 = this.f5992p.read();
            int read7 = this.f5992p.read();
            int read8 = this.f5992p.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f5993q;
                if (byteOrder == f5990f) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i = read2;
                if (byteOrder == f5991o) {
                    return (((long) read) << 56) + (((long) i) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f5993q);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f5994r += 2;
            int read = this.f5992p.read();
            int read2 = this.f5992p.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f5993q;
                if (byteOrder == f5990f) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f5991o) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f5993q);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f5994r += 2;
            return this.f5992p.readUTF();
        }

        public int readUnsignedByte() {
            this.f5994r++;
            return this.f5992p.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f5994r += 2;
            int read = this.f5992p.read();
            int read2 = this.f5992p.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f5993q;
                if (byteOrder == f5990f) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f5991o) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f5993q);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* renamed from: c.n.a.a$c */
    private static class C2052c extends FilterOutputStream {

        /* renamed from: f */
        final OutputStream f5996f;

        /* renamed from: o */
        private ByteOrder f5997o;

        public C2052c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f5996f = outputStream;
            this.f5997o = byteOrder;
        }

        /* renamed from: A */
        public void mo6929A(int i) {
            mo6933o((short) i);
        }

        /* renamed from: a */
        public void mo6930a(ByteOrder byteOrder) {
            this.f5997o = byteOrder;
        }

        /* renamed from: b */
        public void mo6931b(int i) {
            this.f5996f.write(i);
        }

        /* renamed from: h */
        public void mo6932h(int i) {
            OutputStream outputStream;
            int i2;
            ByteOrder byteOrder = this.f5997o;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f5996f.write((i >>> 0) & 255);
                this.f5996f.write((i >>> 8) & 255);
                this.f5996f.write((i >>> 16) & 255);
                outputStream = this.f5996f;
                i2 = i >>> 24;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f5996f.write((i >>> 24) & 255);
                this.f5996f.write((i >>> 16) & 255);
                this.f5996f.write((i >>> 8) & 255);
                outputStream = this.f5996f;
                i2 = i >>> 0;
            } else {
                return;
            }
            outputStream.write(i2 & 255);
        }

        /* renamed from: o */
        public void mo6933o(short s) {
            OutputStream outputStream;
            int i;
            ByteOrder byteOrder = this.f5997o;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f5996f.write((s >>> 0) & 255);
                outputStream = this.f5996f;
                i = s >>> 8;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f5996f.write((s >>> 8) & 255);
                outputStream = this.f5996f;
                i = s >>> 0;
            } else {
                return;
            }
            outputStream.write(i & 255);
        }

        /* renamed from: r */
        public void mo6934r(long j) {
            mo6932h((int) j);
        }

        public void write(byte[] bArr) {
            this.f5996f.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f5996f.write(bArr, i, i2);
        }
    }

    /* renamed from: c.n.a.a$d */
    private static class C2053d {

        /* renamed from: a */
        public final int f5998a;

        /* renamed from: b */
        public final int f5999b;

        /* renamed from: c */
        public final long f6000c;

        /* renamed from: d */
        public final byte[] f6001d;

        C2053d(int i, int i2, long j, byte[] bArr) {
            this.f5998a = i;
            this.f5999b = i2;
            this.f6000c = j;
            this.f6001d = bArr;
        }

        C2053d(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C2053d m8846a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(C2049a.f5933U);
                return new C2053d(1, bytes.length, bytes);
            }
            return new C2053d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        /* renamed from: b */
        public static C2053d m8847b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2049a.f5915C[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new C2053d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static C2053d m8848c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2049a.f5915C[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new C2053d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C2053d m8849d(C2055f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2049a.f5915C[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (C2055f fVar : fVarArr) {
                wrap.putInt((int) fVar.f6006a);
                wrap.putInt((int) fVar.f6007b);
            }
            return new C2053d(10, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static C2053d m8850e(String str) {
            byte[] bytes = (str + 0).getBytes(C2049a.f5933U);
            return new C2053d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static C2053d m8851f(long j, ByteOrder byteOrder) {
            return m8852g(new long[]{j}, byteOrder);
        }

        /* renamed from: g */
        public static C2053d m8852g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2049a.f5915C[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C2053d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C2053d m8853h(C2055f fVar, ByteOrder byteOrder) {
            return m8854i(new C2055f[]{fVar}, byteOrder);
        }

        /* renamed from: i */
        public static C2053d m8854i(C2055f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2049a.f5915C[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (C2055f fVar : fVarArr) {
                wrap.putInt((int) fVar.f6006a);
                wrap.putInt((int) fVar.f6007b);
            }
            return new C2053d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: j */
        public static C2053d m8855j(int i, ByteOrder byteOrder) {
            return m8856k(new int[]{i}, byteOrder);
        }

        /* renamed from: k */
        public static C2053d m8856k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2049a.f5915C[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C2053d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double mo6937l(ByteOrder byteOrder) {
            Object o = mo6940o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o instanceof String) {
                return Double.parseDouble((String) o);
            } else {
                if (o instanceof long[]) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof double[]) {
                    double[] dArr = (double[]) o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof C2055f[]) {
                    C2055f[] fVarArr = (C2055f[]) o;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].mo6944a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: m */
        public int mo6938m(ByteOrder byteOrder) {
            Object o = mo6940o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o instanceof String) {
                return Integer.parseInt((String) o);
            } else {
                if (o instanceof long[]) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: n */
        public String mo6939n(ByteOrder byteOrder) {
            Object o = mo6940o(byteOrder);
            if (o == null) {
                return null;
            }
            if (o instanceof String) {
                return (String) o;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (o instanceof long[]) {
                long[] jArr = (long[]) o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o instanceof double[]) {
                double[] dArr = (double[]) o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(o instanceof C2055f[])) {
                return null;
            } else {
                C2055f[] fVarArr = (C2055f[]) o;
                while (i < fVarArr.length) {
                    sb.append(fVarArr[i].f6006a);
                    sb.append('/');
                    sb.append(fVarArr[i].f6007b);
                    i++;
                    if (i != fVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a3 A[SYNTHETIC, Splitter:B:164:0x01a3] */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo6940o(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                c.n.a.a$b r3 = new c.n.a.a$b     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                byte[] r4 = r10.f6001d     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.mo6908h(r11)     // Catch:{ IOException -> 0x0189 }
                int r11 = r10.f5998a     // Catch:{ IOException -> 0x0189 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0189 }
            L_0x0016:
                goto L_0x0180
            L_0x0018:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x001c:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0036:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0189 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                c.n.a.a$f[] r11 = new p027c.p084n.p085a.C2049a.C2055f[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0051:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0189 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0189 }
                c.n.a.a$f r4 = new c.n.a.a$f     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0076:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0090:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                c.n.a.a$f[] r11 = new p027c.p084n.p085a.C2049a.C2055f[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00aa:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo6907b()     // Catch:{ IOException -> 0x0189 }
                long r8 = r3.mo6907b()     // Catch:{ IOException -> 0x0189 }
                c.n.a.a$f r4 = new c.n.a.a$f     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00cd:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo6907b()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00e7:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = p027c.p084n.p085a.C2049a.f5916D     // Catch:{ IOException -> 0x0189 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = p027c.p084n.p085a.C2049a.f5916D     // Catch:{ IOException -> 0x0189 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f6001d     // Catch:{ IOException -> 0x0189 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0189 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0189 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0189 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189 }
                r11.<init>()     // Catch:{ IOException -> 0x0189 }
            L_0x011f:
                int r4 = r10.f5999b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f6001d     // Catch:{ IOException -> 0x0189 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0189 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0189 }
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f6001d     // Catch:{ IOException -> 0x0189 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0189 }
                if (r6 != r4) goto L_0x016e
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r6 < 0) goto L_0x016e
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r11 > r4) goto L_0x016e
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = r10.f6001d     // Catch:{ IOException -> 0x0189 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0189 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0189 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0169 }
                goto L_0x016d
            L_0x0169:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016d:
                return r11
            L_0x016e:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                byte[] r4 = r10.f6001d     // Catch:{ IOException -> 0x0189 }
                java.nio.charset.Charset r5 = p027c.p084n.p085a.C2049a.f5933U     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x017b }
                goto L_0x017f
            L_0x017b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017f:
                return r11
            L_0x0180:
                r3.close()     // Catch:{ IOException -> 0x0184 }
                goto L_0x0188
            L_0x0184:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0188:
                return r2
            L_0x0189:
                r11 = move-exception
                goto L_0x018f
            L_0x018b:
                r11 = move-exception
                goto L_0x01a1
            L_0x018d:
                r11 = move-exception
                r3 = r2
            L_0x018f:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x019e
                r3.close()     // Catch:{ IOException -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019e:
                return r2
            L_0x019f:
                r11 = move-exception
                r2 = r3
            L_0x01a1:
                if (r2 == 0) goto L_0x01ab
                r2.close()     // Catch:{ IOException -> 0x01a7 }
                goto L_0x01ab
            L_0x01a7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ab:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.C2053d.mo6940o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int mo6941p() {
            return C2049a.f5915C[this.f5998a] * this.f5999b;
        }

        public String toString() {
            return "(" + C2049a.f5914B[this.f5998a] + ", data length:" + this.f6001d.length + ")";
        }
    }

    /* renamed from: c.n.a.a$e */
    static class C2054e {

        /* renamed from: a */
        public final int f6002a;

        /* renamed from: b */
        public final String f6003b;

        /* renamed from: c */
        public final int f6004c;

        /* renamed from: d */
        public final int f6005d;

        C2054e(String str, int i, int i2) {
            this.f6003b = str;
            this.f6002a = i;
            this.f6004c = i2;
            this.f6005d = -1;
        }

        C2054e(String str, int i, int i2, int i3) {
            this.f6003b = str;
            this.f6002a = i;
            this.f6004c = i2;
            this.f6005d = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6943a(int i) {
            int i2;
            int i3 = this.f6004c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f6005d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    /* renamed from: c.n.a.a$f */
    private static class C2055f {

        /* renamed from: a */
        public final long f6006a;

        /* renamed from: b */
        public final long f6007b;

        C2055f(double d) {
            this((long) (d * 10000.0d), 10000);
        }

        C2055f(long j, long j2) {
            if (j2 == 0) {
                this.f6006a = 0;
                this.f6007b = 1;
                return;
            }
            this.f6006a = j;
            this.f6007b = j2;
        }

        /* renamed from: a */
        public double mo6944a() {
            return ((double) this.f6006a) / ((double) this.f6007b);
        }

        public String toString() {
            return this.f6006a + "/" + this.f6007b;
        }
    }

    /* renamed from: c.n.a.a$g */
    private static class C2056g extends C2051b {
        C2056g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f5992p.mark(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }

        C2056g(byte[] bArr) {
            super(bArr);
            this.f5992p.mark(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        }

        /* renamed from: r */
        public void mo6946r(long j) {
            int i = this.f5994r;
            if (((long) i) > j) {
                this.f5994r = 0;
                this.f5992p.reset();
            } else {
                j -= (long) i;
            }
            mo6910o((int) j);
        }
    }

    static {
        C2054e[] eVarArr = {new C2054e("NewSubfileType", 254, 4), new C2054e("SubfileType", 255, 4), new C2054e("ImageWidth", 256, 3, 4), new C2054e("ImageLength", 257, 3, 4), new C2054e("BitsPerSample", 258, 3), new C2054e("Compression", 259, 3), new C2054e("PhotometricInterpretation", 262, 3), new C2054e("ImageDescription", 270, 2), new C2054e("Make", 271, 2), new C2054e("Model", 272, 2), new C2054e("StripOffsets", 273, 3, 4), new C2054e("Orientation", 274, 3), new C2054e("SamplesPerPixel", 277, 3), new C2054e("RowsPerStrip", 278, 3, 4), new C2054e("StripByteCounts", 279, 3, 4), new C2054e("XResolution", 282, 5), new C2054e("YResolution", 283, 5), new C2054e("PlanarConfiguration", 284, 3), new C2054e("ResolutionUnit", 296, 3), new C2054e("TransferFunction", 301, 3), new C2054e("Software", 305, 2), new C2054e("DateTime", 306, 2), new C2054e("Artist", 315, 2), new C2054e("WhitePoint", 318, 5), new C2054e("PrimaryChromaticities", 319, 5), new C2054e("SubIFDPointer", 330, 4), new C2054e("JPEGInterchangeFormat", 513, 4), new C2054e("JPEGInterchangeFormatLength", 514, 4), new C2054e("YCbCrCoefficients", 529, 5), new C2054e("YCbCrSubSampling", 530, 3), new C2054e("YCbCrPositioning", 531, 3), new C2054e("ReferenceBlackWhite", 532, 5), new C2054e("Copyright", 33432, 2), new C2054e("ExifIFDPointer", 34665, 4), new C2054e("GPSInfoIFDPointer", 34853, 4), new C2054e("SensorTopBorder", 4, 4), new C2054e("SensorLeftBorder", 5, 4), new C2054e("SensorBottomBorder", 6, 4), new C2054e("SensorRightBorder", 7, 4), new C2054e("ISO", 23, 3), new C2054e("JpgFromRaw", 46, 7), new C2054e("Xmp", 700, 1)};
        f5917E = eVarArr;
        C2054e[] eVarArr2 = {new C2054e("ExposureTime", 33434, 5), new C2054e("FNumber", 33437, 5), new C2054e("ExposureProgram", 34850, 3), new C2054e("SpectralSensitivity", 34852, 2), new C2054e("PhotographicSensitivity", 34855, 3), new C2054e("OECF", 34856, 7), new C2054e("SensitivityType", 34864, 3), new C2054e("StandardOutputSensitivity", 34865, 4), new C2054e("RecommendedExposureIndex", 34866, 4), new C2054e("ISOSpeed", 34867, 4), new C2054e("ISOSpeedLatitudeyyy", 34868, 4), new C2054e("ISOSpeedLatitudezzz", 34869, 4), new C2054e("ExifVersion", 36864, 2), new C2054e("DateTimeOriginal", 36867, 2), new C2054e("DateTimeDigitized", 36868, 2), new C2054e("OffsetTime", 36880, 2), new C2054e("OffsetTimeOriginal", 36881, 2), new C2054e("OffsetTimeDigitized", 36882, 2), new C2054e("ComponentsConfiguration", 37121, 7), new C2054e("CompressedBitsPerPixel", 37122, 5), new C2054e("ShutterSpeedValue", 37377, 10), new C2054e("ApertureValue", 37378, 5), new C2054e("BrightnessValue", 37379, 10), new C2054e("ExposureBiasValue", 37380, 10), new C2054e("MaxApertureValue", 37381, 5), new C2054e("SubjectDistance", 37382, 5), new C2054e("MeteringMode", 37383, 3), new C2054e("LightSource", 37384, 3), new C2054e("Flash", 37385, 3), new C2054e("FocalLength", 37386, 5), new C2054e("SubjectArea", 37396, 3), new C2054e("MakerNote", 37500, 7), new C2054e("UserComment", 37510, 7), new C2054e("SubSecTime", 37520, 2), new C2054e("SubSecTimeOriginal", 37521, 2), new C2054e("SubSecTimeDigitized", 37522, 2), new C2054e("FlashpixVersion", 40960, 7), new C2054e("ColorSpace", 40961, 3), new C2054e("PixelXDimension", 40962, 3, 4), new C2054e("PixelYDimension", 40963, 3, 4), new C2054e("RelatedSoundFile", 40964, 2), new C2054e("InteroperabilityIFDPointer", 40965, 4), new C2054e("FlashEnergy", 41483, 5), new C2054e("SpatialFrequencyResponse", 41484, 7), new C2054e("FocalPlaneXResolution", 41486, 5), new C2054e("FocalPlaneYResolution", 41487, 5), new C2054e("FocalPlaneResolutionUnit", 41488, 3), new C2054e("SubjectLocation", 41492, 3), new C2054e("ExposureIndex", 41493, 5), new C2054e("SensingMethod", 41495, 3), new C2054e("FileSource", 41728, 7), new C2054e("SceneType", 41729, 7), new C2054e("CFAPattern", 41730, 7), new C2054e("CustomRendered", 41985, 3), new C2054e("ExposureMode", 41986, 3), new C2054e("WhiteBalance", 41987, 3), new C2054e("DigitalZoomRatio", 41988, 5), new C2054e("FocalLengthIn35mmFilm", 41989, 3), new C2054e("SceneCaptureType", 41990, 3), new C2054e("GainControl", 41991, 3), new C2054e("Contrast", 41992, 3), new C2054e("Saturation", 41993, 3), new C2054e("Sharpness", 41994, 3), new C2054e("DeviceSettingDescription", 41995, 7), new C2054e("SubjectDistanceRange", 41996, 3), new C2054e("ImageUniqueID", 42016, 2), new C2054e("CameraOwnerName", 42032, 2), new C2054e("BodySerialNumber", 42033, 2), new C2054e("LensSpecification", 42034, 5), new C2054e("LensMake", 42035, 2), new C2054e("LensModel", 42036, 2), new C2054e("Gamma", 42240, 5), new C2054e("DNGVersion", 50706, 1), new C2054e("DefaultCropSize", 50720, 3, 4)};
        f5918F = eVarArr2;
        C2054e[] eVarArr3 = {new C2054e("GPSVersionID", 0, 1), new C2054e("GPSLatitudeRef", 1, 2), new C2054e("GPSLatitude", 2, 5, 10), new C2054e("GPSLongitudeRef", 3, 2), new C2054e("GPSLongitude", 4, 5, 10), new C2054e("GPSAltitudeRef", 5, 1), new C2054e("GPSAltitude", 6, 5), new C2054e("GPSTimeStamp", 7, 5), new C2054e("GPSSatellites", 8, 2), new C2054e("GPSStatus", 9, 2), new C2054e("GPSMeasureMode", 10, 2), new C2054e("GPSDOP", 11, 5), new C2054e("GPSSpeedRef", 12, 2), new C2054e("GPSSpeed", 13, 5), new C2054e("GPSTrackRef", 14, 2), new C2054e("GPSTrack", 15, 5), new C2054e("GPSImgDirectionRef", 16, 2), new C2054e("GPSImgDirection", 17, 5), new C2054e("GPSMapDatum", 18, 2), new C2054e("GPSDestLatitudeRef", 19, 2), new C2054e("GPSDestLatitude", 20, 5), new C2054e("GPSDestLongitudeRef", 21, 2), new C2054e("GPSDestLongitude", 22, 5), new C2054e("GPSDestBearingRef", 23, 2), new C2054e("GPSDestBearing", 24, 5), new C2054e("GPSDestDistanceRef", 25, 2), new C2054e("GPSDestDistance", 26, 5), new C2054e("GPSProcessingMethod", 27, 7), new C2054e("GPSAreaInformation", 28, 7), new C2054e("GPSDateStamp", 29, 2), new C2054e("GPSDifferential", 30, 3), new C2054e("GPSHPositioningError", 31, 5)};
        f5919G = eVarArr3;
        C2054e[] eVarArr4 = {new C2054e("InteroperabilityIndex", 1, 2)};
        f5920H = eVarArr4;
        C2054e[] eVarArr5 = {new C2054e("NewSubfileType", 254, 4), new C2054e("SubfileType", 255, 4), new C2054e("ThumbnailImageWidth", 256, 3, 4), new C2054e("ThumbnailImageLength", 257, 3, 4), new C2054e("BitsPerSample", 258, 3), new C2054e("Compression", 259, 3), new C2054e("PhotometricInterpretation", 262, 3), new C2054e("ImageDescription", 270, 2), new C2054e("Make", 271, 2), new C2054e("Model", 272, 2), new C2054e("StripOffsets", 273, 3, 4), new C2054e("ThumbnailOrientation", 274, 3), new C2054e("SamplesPerPixel", 277, 3), new C2054e("RowsPerStrip", 278, 3, 4), new C2054e("StripByteCounts", 279, 3, 4), new C2054e("XResolution", 282, 5), new C2054e("YResolution", 283, 5), new C2054e("PlanarConfiguration", 284, 3), new C2054e("ResolutionUnit", 296, 3), new C2054e("TransferFunction", 301, 3), new C2054e("Software", 305, 2), new C2054e("DateTime", 306, 2), new C2054e("Artist", 315, 2), new C2054e("WhitePoint", 318, 5), new C2054e("PrimaryChromaticities", 319, 5), new C2054e("SubIFDPointer", 330, 4), new C2054e("JPEGInterchangeFormat", 513, 4), new C2054e("JPEGInterchangeFormatLength", 514, 4), new C2054e("YCbCrCoefficients", 529, 5), new C2054e("YCbCrSubSampling", 530, 3), new C2054e("YCbCrPositioning", 531, 3), new C2054e("ReferenceBlackWhite", 532, 5), new C2054e("Xmp", 700, 1), new C2054e("Copyright", 33432, 2), new C2054e("ExifIFDPointer", 34665, 4), new C2054e("GPSInfoIFDPointer", 34853, 4), new C2054e("DNGVersion", 50706, 1), new C2054e("DefaultCropSize", 50720, 3, 4)};
        f5921I = eVarArr5;
        C2054e[] eVarArr6 = {new C2054e("ThumbnailImage", 256, 7), new C2054e("CameraSettingsIFDPointer", 8224, 4), new C2054e("ImageProcessingIFDPointer", 8256, 4)};
        f5923K = eVarArr6;
        C2054e[] eVarArr7 = {new C2054e("PreviewImageStart", 257, 4), new C2054e("PreviewImageLength", 258, 4)};
        f5924L = eVarArr7;
        C2054e[] eVarArr8 = {new C2054e("AspectFrame", 4371, 3)};
        f5925M = eVarArr8;
        C2054e[] eVarArr9 = {new C2054e("ColorSpace", 55, 3)};
        f5926N = eVarArr9;
        C2054e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f5927O = eVarArr10;
        f5929Q = new HashMap[eVarArr10.length];
        f5930R = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f5933U = forName;
        f5934V = "Exif\u0000\u0000".getBytes(forName);
        f5935W = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f5965z = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f5913A = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2054e[][] eVarArr11 = f5927O;
            if (i < eVarArr11.length) {
                f5929Q[i] = new HashMap<>();
                f5930R[i] = new HashMap<>();
                for (C2054e eVar : eVarArr11[i]) {
                    f5929Q[i].put(Integer.valueOf(eVar.f6002a), eVar);
                    f5930R[i].put(eVar.f6003b, eVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f5932T;
                C2054e[] eVarArr12 = f5928P;
                hashMap.put(Integer.valueOf(eVarArr12[0].f6002a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f6002a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f6002a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f6002a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f6002a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f6002a), 8);
                return;
            }
        }
    }

    public C2049a(File file) {
        C2054e[][] eVarArr = f5927O;
        this.f5971g0 = new HashMap[eVarArr.length];
        this.f5972h0 = new HashSet(eVarArr.length);
        this.f5973i0 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(file, "file cannot be null");
        m8775B(file.getAbsolutePath());
    }

    public C2049a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C2049a(InputStream inputStream, int i) {
        C2054e[][] eVarArr = f5927O;
        this.f5971g0 = new HashMap[eVarArr.length];
        this.f5972h0 = new HashSet(eVarArr.length);
        this.f5973i0 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f5966b0 = null;
        if (i == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f5934V.length);
            if (!m8776C(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f5970f0 = true;
            this.f5968d0 = null;
            this.f5967c0 = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f5968d0 = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m8783J(fileInputStream.getFD())) {
                        this.f5968d0 = null;
                        this.f5967c0 = fileInputStream.getFD();
                    }
                }
                this.f5968d0 = null;
            }
            this.f5967c0 = null;
        }
        m8788O(inputStream);
    }

    public C2049a(String str) {
        C2054e[][] eVarArr = f5927O;
        this.f5971g0 = new HashMap[eVarArr.length];
        this.f5972h0 = new HashSet(eVarArr.length);
        this.f5973i0 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        m8775B(str);
    }

    /* renamed from: A */
    private void m8774A(C2051b bVar, HashMap hashMap) {
        C2051b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C2053d dVar = (C2053d) hashMap2.get("StripOffsets");
        C2053d dVar2 = (C2053d) hashMap2.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] d = C2057b.m8868d(dVar.mo6940o(this.f5973i0));
            long[] d2 = C2057b.m8868d(dVar2.mo6940o(this.f5973i0));
            if (d == null || d.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d2 == null || d2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (d.length != d2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j = 0;
                for (long j2 : d2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 1;
                this.f5976l0 = true;
                this.f5975k0 = true;
                this.f5974j0 = true;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < d.length) {
                    int i6 = (int) d[i3];
                    int i7 = (int) d2[i3];
                    if (i3 < d.length - i2 && ((long) (i6 + i7)) != d[i3 + 1]) {
                        this.f5976l0 = false;
                    }
                    int i8 = i6 - i4;
                    if (i8 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = (long) i8;
                    if (bVar2.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i8 + " bytes.");
                        return;
                    }
                    int i9 = i4 + i8;
                    byte[] bArr2 = new byte[i7];
                    if (bVar2.read(bArr2) != i7) {
                        Log.d("ExifInterface", "Failed to read " + i7 + " bytes.");
                        return;
                    }
                    i4 = i9 + i7;
                    System.arraycopy(bArr2, 0, bArr, i5, i7);
                    i5 += i7;
                    i3++;
                    i2 = 1;
                }
                this.f5979o0 = bArr;
                if (this.f5976l0) {
                    this.f5977m0 = (int) d[0];
                    this.f5978n0 = i;
                }
            }
        }
    }

    /* renamed from: B */
    private void m8775B(String str) {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f5968d0 = null;
        this.f5966b0 = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (m8783J(fileInputStream2.getFD())) {
                    this.f5967c0 = fileInputStream2.getFD();
                } else {
                    this.f5967c0 = null;
                }
                m8788O(fileInputStream2);
                C2057b.m8867c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C2057b.m8867c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C2057b.m8867c(fileInputStream);
            throw th;
        }
    }

    /* renamed from: C */
    private static boolean m8776C(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f5934V;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f5934V;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8777D(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            c.n.a.a$b r2 = new c.n.a.a$b     // Catch:{ Exception -> 0x008d }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f5947h     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r5 = r7
        L_0x0035:
            int r11 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f5948i     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r7 = 1
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f5949j     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r8 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r5 = r5 + r9
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = f5939a     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8777D(byte[]):boolean");
    }

    /* renamed from: E */
    private static boolean m8778E(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f5946g;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8779F(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            c.n.a.a$b r2 = new c.n.a.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.m8791R(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f5973i0 = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo6908h(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8779F(byte[]):boolean");
    }

    /* renamed from: G */
    private boolean m8780G(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f5952m;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: H */
    private boolean m8781H(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8782I(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            c.n.a.a$b r2 = new c.n.a.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.m8791R(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f5973i0 = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo6908h(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8782I(byte[]):boolean");
    }

    /* renamed from: J */
    private static boolean m8783J(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C2057b.C2058a.m8874c(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f5939a) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: K */
    private boolean m8784K(HashMap hashMap) {
        C2053d dVar;
        int m;
        C2053d dVar2 = (C2053d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.mo6940o(this.f5973i0);
            int[] iArr2 = f5943d;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f5969e0 == 3 && (dVar = (C2053d) hashMap.get("PhotometricInterpretation")) != null && (((m = dVar.mo6938m(this.f5973i0)) == 1 && Arrays.equals(iArr, f5945f)) || (m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f5939a) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: L */
    private static boolean m8785L(int i) {
        return i == 4 || i == 13 || i == 14 || i == 3 || i == 0;
    }

    /* renamed from: M */
    private boolean m8786M(HashMap hashMap) {
        C2053d dVar = (C2053d) hashMap.get("ImageLength");
        C2053d dVar2 = (C2053d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.mo6938m(this.f5973i0) <= 512 && dVar2.mo6938m(this.f5973i0) <= 512;
    }

    /* renamed from: N */
    private boolean m8787N(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f5956q;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f5957r;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f5956q.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: O */
    private void m8788O(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i = 0;
        while (i < f5927O.length) {
            try {
                this.f5971g0[i] = new HashMap<>();
                i++;
            } catch (IOException | UnsupportedOperationException e) {
                boolean z = f5939a;
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m8799a();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                m8799a();
                if (f5939a) {
                    m8790Q();
                }
                throw th;
            }
        }
        if (!this.f5970f0) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f5969e0 = m8814o(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m8806f0(this.f5969e0)) {
            C2056g gVar = new C2056g(inputStream);
            if (this.f5970f0) {
                m8820u(gVar);
            } else {
                int i2 = this.f5969e0;
                if (i2 == 12) {
                    m8812l(gVar);
                } else if (i2 == 7) {
                    m8815p(gVar);
                } else if (i2 == 10) {
                    m8819t(gVar);
                } else {
                    m8818s(gVar);
                }
            }
            gVar.mo6946r((long) this.f5981q0);
            m8805e0(gVar);
        } else {
            C2051b bVar = new C2051b(inputStream);
            int i3 = this.f5969e0;
            if (i3 == 4) {
                m8813m(bVar, 0, 0);
            } else if (i3 == 13) {
                m8816q(bVar);
            } else if (i3 == 9) {
                m8817r(bVar);
            } else if (i3 == 14) {
                m8821x(bVar);
            }
        }
        m8799a();
        if (!f5939a) {
            return;
        }
        m8790Q();
    }

    /* renamed from: P */
    private void m8789P(C2051b bVar) {
        ByteOrder R = m8791R(bVar);
        this.f5973i0 = R;
        bVar.mo6908h(R);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f5969e0;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bVar.mo6910o(i2);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: Q */
    private void m8790Q() {
        for (int i = 0; i < this.f5971g0.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f5971g0[i].size());
            for (Map.Entry next : this.f5971g0[i].entrySet()) {
                C2053d dVar = (C2053d) next.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) next.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.mo6939n(this.f5973i0) + "'");
            }
        }
    }

    /* renamed from: R */
    private ByteOrder m8791R(C2051b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f5939a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f5939a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    /* renamed from: S */
    private void m8792S(byte[] bArr, int i) {
        C2056g gVar = new C2056g(bArr);
        m8789P(gVar);
        m8793T(gVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0279  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8793T(p027c.p084n.p085a.C2049a.C2056g r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.f5972h0
            int r4 = r1.f5994r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r30.readShort()
            boolean r4 = f5939a
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x002f:
            if (r3 > 0) goto L_0x0032
            return
        L_0x0032:
            r4 = 0
            r6 = 0
        L_0x0034:
            r7 = 5
            if (r6 >= r3) goto L_0x0317
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.mo6905a()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap<java.lang.Integer, c.n.a.a$e>[] r14 = f5929Q
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            c.n.a.a$e r11 = (p027c.p084n.p085a.C2049a.C2054e) r11
            boolean r14 = f5939a
            r10 = 3
            if (r14 == 0) goto L_0x0090
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r7[r4] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r21 = 1
            r7[r21] = r23
            if (r11 == 0) goto L_0x0074
            java.lang.String r4 = r11.f6003b
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            r22 = 2
            r7[r22] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L_0x0090:
            r4 = 7
            if (r11 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since tag number is not defined: "
            r7.append(r10)
            r7.append(r12)
        L_0x00a2:
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x00a9:
            r10 = r5
            r25 = r6
            goto L_0x0127
        L_0x00ae:
            if (r13 <= 0) goto L_0x010e
            int[] r7 = f5915C
            int r10 = r7.length
            if (r13 < r10) goto L_0x00b6
            goto L_0x010e
        L_0x00b6:
            boolean r10 = r11.mo6943a(r13)
            if (r10 != 0) goto L_0x00da
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r7.append(r10)
            java.lang.String[] r10 = f5914B
            r10 = r10[r13]
            r7.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r7.append(r10)
            java.lang.String r10 = r11.f6003b
            r7.append(r10)
            goto L_0x00a2
        L_0x00da:
            if (r13 != r4) goto L_0x00de
            int r13 = r11.f6004c
        L_0x00de:
            r10 = r5
            long r4 = (long) r15
            r7 = r7[r13]
            r25 = r6
            long r6 = (long) r7
            long r4 = r4 * r6
            r6 = 0
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 < 0) goto L_0x00f7
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 <= 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = 1
            goto L_0x012a
        L_0x00f7:
            if (r14 == 0) goto L_0x0129
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r10, r6)
            goto L_0x0129
        L_0x010e:
            r10 = r5
            r25 = r6
            if (r14 == 0) goto L_0x0127
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r10, r4)
        L_0x0127:
            r4 = 0
        L_0x0129:
            r6 = 0
        L_0x012a:
            if (r6 != 0) goto L_0x0134
            r1.mo6946r(r8)
            r26 = r3
            r8 = r10
            goto L_0x030e
        L_0x0134:
            java.lang.String r6 = "Compression"
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x01be
            int r7 = r30.readInt()
            r26 = r3
            if (r14 == 0) goto L_0x0159
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r27 = r8
            java.lang.String r8 = "seek to data offset: "
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r10, r3)
            goto L_0x015b
        L_0x0159:
            r27 = r8
        L_0x015b:
            int r3 = r0.f5969e0
            r8 = 7
            if (r3 != r8) goto L_0x01b5
            java.lang.String r3 = r11.f6003b
            java.lang.String r8 = "MakerNote"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x016d
            r0.f5982r0 = r7
            goto L_0x01b5
        L_0x016d:
            r3 = 6
            if (r2 != r3) goto L_0x01b5
            java.lang.String r8 = r11.f6003b
            java.lang.String r9 = "ThumbnailImage"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01b5
            r0.f5983s0 = r7
            r0.f5984t0 = r15
            java.nio.ByteOrder r8 = r0.f5973i0
            c.n.a.a$d r3 = p027c.p084n.p085a.C2049a.C2053d.m8855j(r3, r8)
            int r8 = r0.f5983s0
            long r8 = (long) r8
            r18 = r15
            java.nio.ByteOrder r15 = r0.f5973i0
            c.n.a.a$d r8 = p027c.p084n.p085a.C2049a.C2053d.m8851f(r8, r15)
            int r9 = r0.f5984t0
            r24 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r15 = r0.f5973i0
            c.n.a.a$d r9 = p027c.p084n.p085a.C2049a.C2053d.m8851f(r9, r15)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r10 = r0.f5971g0
            r15 = 4
            r10 = r10[r15]
            r10.put(r6, r3)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r15]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r3.put(r10, r8)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r15]
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r3.put(r8, r9)
            goto L_0x01b9
        L_0x01b5:
            r24 = r10
            r18 = r15
        L_0x01b9:
            long r7 = (long) r7
            r1.mo6946r(r7)
            goto L_0x01c6
        L_0x01be:
            r26 = r3
            r27 = r8
            r24 = r10
            r18 = r15
        L_0x01c6:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = f5932T
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x01f3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r8 = r24
            android.util.Log.d(r8, r7)
            goto L_0x01f5
        L_0x01f3:
            r8 = r24
        L_0x01f5:
            r7 = 8
            if (r3 == 0) goto L_0x0296
            r4 = -1
            r6 = 3
            if (r13 == r6) goto L_0x021b
            r6 = 4
            if (r13 == r6) goto L_0x0216
            if (r13 == r7) goto L_0x0211
            r6 = 9
            if (r13 == r6) goto L_0x020c
            r6 = 13
            if (r13 == r6) goto L_0x020c
            goto L_0x0220
        L_0x020c:
            int r4 = r30.readInt()
            goto L_0x021f
        L_0x0211:
            short r4 = r30.readShort()
            goto L_0x021f
        L_0x0216:
            long r4 = r30.mo6907b()
            goto L_0x0220
        L_0x021b:
            int r4 = r30.readUnsignedShort()
        L_0x021f:
            long r4 = (long) r4
        L_0x0220:
            if (r14 == 0) goto L_0x023a
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r9 = 0
            r6[r9] = r7
            java.lang.String r7 = r11.f6003b
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r8, r6)
        L_0x023a:
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0279
            java.util.Set<java.lang.Integer> r6 = r0.f5972h0
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0258
            r1.mo6946r(r4)
            int r3 = r3.intValue()
            r0.m8793T(r1, r3)
            goto L_0x028f
        L_0x0258:
            if (r14 == 0) goto L_0x028f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " (at "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            goto L_0x028c
        L_0x0279:
            if (r14 == 0) goto L_0x028f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x028c:
            android.util.Log.d(r8, r3)
        L_0x028f:
            r9 = r27
        L_0x0291:
            r1.mo6946r(r9)
            goto L_0x030e
        L_0x0296:
            r9 = r27
            int r3 = r30.mo6905a()
            int r12 = r0.f5981q0
            int r3 = r3 + r12
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r1.readFully(r4)
            c.n.a.a$d r5 = new c.n.a.a$d
            long r14 = (long) r3
            r19 = r14
            r14 = r5
            r3 = r18
            r15 = r13
            r16 = r3
            r17 = r19
            r19 = r4
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r2]
            java.lang.String r4 = r11.f6003b
            r3.put(r4, r5)
            java.lang.String r3 = r11.f6003b
            java.lang.String r4 = "DNGVersion"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02cd
            r3 = 3
            r0.f5969e0 = r3
        L_0x02cd:
            java.lang.String r3 = r11.f6003b
            java.lang.String r4 = "Make"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02e1
            java.lang.String r3 = r11.f6003b
            java.lang.String r4 = "Model"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02ef
        L_0x02e1:
            java.nio.ByteOrder r3 = r0.f5973i0
            java.lang.String r3 = r5.mo6939n(r3)
            java.lang.String r4 = "PENTAX"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0302
        L_0x02ef:
            java.lang.String r3 = r11.f6003b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0304
            java.nio.ByteOrder r3 = r0.f5973i0
            int r3 = r5.mo6938m(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x0304
        L_0x0302:
            r0.f5969e0 = r7
        L_0x0304:
            int r3 = r30.mo6905a()
            long r3 = (long) r3
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x030e
            goto L_0x0291
        L_0x030e:
            int r6 = r25 + 1
            short r6 = (short) r6
            r5 = r8
            r3 = r26
            r4 = 0
            goto L_0x0034
        L_0x0317:
            r8 = r5
            int r2 = r30.readInt()
            boolean r3 = f5939a
            if (r3 == 0) goto L_0x0333
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r8, r4)
        L_0x0333:
            long r4 = (long) r2
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0370
            java.util.Set<java.lang.Integer> r6 = r0.f5972h0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x0366
            r1.mo6946r(r4)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r2 = r0.f5971g0
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0358
            r0.m8793T(r1, r3)
            goto L_0x0386
        L_0x0358:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r2 = r0.f5971g0
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0386
            r0.m8793T(r1, r7)
            goto L_0x0386
        L_0x0366:
            if (r3 == 0) goto L_0x0386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x0379
        L_0x0370:
            if (r3 == 0) goto L_0x0386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x0379:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8793T(c.n.a.a$g, int):void");
    }

    /* renamed from: U */
    private void m8794U(String str) {
        for (int i = 0; i < f5927O.length; i++) {
            this.f5971g0[i].remove(str);
        }
    }

    /* renamed from: V */
    private void m8795V(int i, String str, String str2) {
        if (!this.f5971g0[i].isEmpty() && this.f5971g0[i].get(str) != null) {
            HashMap<String, C2053d>[] hashMapArr = this.f5971g0;
            hashMapArr[i].put(str2, hashMapArr[i].get(str));
            this.f5971g0[i].remove(str);
        }
    }

    /* renamed from: W */
    private void m8796W(C2056g gVar, int i) {
        C2053d dVar = this.f5971g0[i].get("ImageLength");
        C2053d dVar2 = this.f5971g0[i].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            C2053d dVar3 = this.f5971g0[i].get("JPEGInterchangeFormat");
            C2053d dVar4 = this.f5971g0[i].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m = dVar3.mo6938m(this.f5973i0);
                int m2 = dVar3.mo6938m(this.f5973i0);
                gVar.mo6946r((long) m);
                byte[] bArr = new byte[m2];
                gVar.read(bArr);
                m8813m(new C2051b(bArr), m, i);
            }
        }
    }

    /* renamed from: Y */
    private void m8797Y(InputStream inputStream, OutputStream outputStream) {
        if (f5939a) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C2051b bVar = new C2051b(inputStream);
        C2052c cVar = new C2052c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.mo6931b(-1);
            if (bVar.readByte() == -40) {
                cVar.mo6931b(-40);
                C2053d dVar = null;
                if (mo6895g("Xmp") != null && this.f5986v0) {
                    dVar = this.f5971g0[0].remove("Xmp");
                }
                cVar.mo6931b(-1);
                cVar.mo6931b(-31);
                m8810j0(cVar);
                if (dVar != null) {
                    this.f5971g0[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.mo6931b(-1);
                        cVar.mo6931b(readByte);
                        C2057b.m8869e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.mo6931b(-1);
                        cVar.mo6931b(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.mo6929A(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f5934V)) {
                                    bVar.mo6910o(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.mo6931b(-1);
                            cVar.mo6931b(readByte);
                            cVar.mo6929A(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: Z */
    private void m8798Z(InputStream inputStream, OutputStream outputStream) {
        if (f5939a) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C2051b bVar = new C2051b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C2052c cVar = new C2052c(outputStream, byteOrder);
        byte[] bArr = f5952m;
        C2057b.m8870f(bVar, cVar, bArr.length);
        int i = this.f5981q0;
        if (i == 0) {
            int readInt = bVar.readInt();
            cVar.mo6932h(readInt);
            C2057b.m8870f(bVar, cVar, readInt + 4 + 4);
        } else {
            C2057b.m8870f(bVar, cVar, ((i - bArr.length) - 4) - 4);
            bVar.mo6910o(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C2052c cVar2 = new C2052c(byteArrayOutputStream2, byteOrder);
                m8810j0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f5996f).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.mo6932h((int) crc32.getValue());
                C2057b.m8867c(byteArrayOutputStream2);
                C2057b.m8869e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                C2057b.m8867c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C2057b.m8867c(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private void m8799a() {
        String g = mo6895g("DateTimeOriginal");
        if (g != null && mo6895g("DateTime") == null) {
            this.f5971g0[0].put("DateTime", C2053d.m8850e(g));
        }
        if (mo6895g("ImageWidth") == null) {
            this.f5971g0[0].put("ImageWidth", C2053d.m8851f(0, this.f5973i0));
        }
        if (mo6895g("ImageLength") == null) {
            this.f5971g0[0].put("ImageLength", C2053d.m8851f(0, this.f5973i0));
        }
        if (mo6895g("Orientation") == null) {
            this.f5971g0[0].put("Orientation", C2053d.m8851f(0, this.f5973i0));
        }
        if (mo6895g("LightSource") == null) {
            this.f5971g0[1].put("LightSource", C2053d.m8851f(0, this.f5973i0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a3 A[Catch:{ Exception -> 0x01e5, all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01af A[Catch:{ Exception -> 0x01e5, all -> 0x01e2 }] */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8800a0(java.io.InputStream r21, java.io.OutputStream r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            boolean r3 = f5939a
            if (r3 == 0) goto L_0x002d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveWebpAttributes starting with (inputStream: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", outputStream: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ExifInterface"
            android.util.Log.d(r4, r3)
        L_0x002d:
            c.n.a.a$b r3 = new c.n.a.a$b
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r3.<init>(r0, r4)
            c.n.a.a$c r5 = new c.n.a.a$c
            r5.<init>(r2, r4)
            byte[] r2 = f5956q
            int r6 = r2.length
            p027c.p084n.p085a.C2057b.m8870f(r3, r5, r6)
            byte[] r6 = f5957r
            int r7 = r6.length
            r8 = 4
            int r7 = r7 + r8
            r3.mo6910o(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x01ea }
            r9.<init>()     // Catch:{ Exception -> 0x01ea }
            c.n.a.a$c r10 = new c.n.a.a$c     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.<init>(r9, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r4 = r1.f5981q0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r4 == 0) goto L_0x006f
            int r0 = r2.length     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r0 + r8
            int r2 = r6.length     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r0 + r2
            int r4 = r4 - r0
            int r4 = r4 - r8
            int r4 = r4 - r8
            p027c.p084n.p085a.C2057b.m8870f(r3, r10, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r3.mo6910o(r8)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r3.mo6910o(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x006a:
            r1.m8810j0(r10)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x01c2
        L_0x006f:
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r4 = r3.read(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r4 != r8) goto L_0x01da
            byte[] r4 = f5960u     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r6 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r11 = 8
            r12 = 1
            r13 = 0
            if (r6 == 0) goto L_0x00cc
            int r2 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r6 = r2 % 2
            if (r6 != r12) goto L_0x008e
            int r6 = r2 + 1
            goto L_0x008f
        L_0x008e:
            r6 = r2
        L_0x008f:
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r3.read(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r14 = r6[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r11 = r11 | r14
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r6[r13] = r11     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r11 = r6[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r11 = r11 >> r12
            r11 = r11 & r12
            if (r11 != r12) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            r10.write(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.mo6932h(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r12 == 0) goto L_0x00c4
            byte[] r2 = f5963x     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r1.m8803d(r3, r10, r2, r7)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x00b2:
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r0.read(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r4 = f5964y     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r4 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r4 != 0) goto L_0x00c0
            goto L_0x006a
        L_0x00c0:
            r1.m8804e(r3, r10, r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x00b2
        L_0x00c4:
            byte[] r0 = f5962w     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r2 = f5961v     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r1.m8803d(r3, r10, r0, r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x006a
        L_0x00cc:
            byte[] r0 = f5962w     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r6 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r6 != 0) goto L_0x00dc
            byte[] r6 = f5961v     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r6 = java.util.Arrays.equals(r2, r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r6 == 0) goto L_0x01c2
        L_0x00dc:
            int r6 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r7 = r6 % 2
            if (r7 != r12) goto L_0x00e7
            int r7 = r6 + 1
            goto L_0x00e8
        L_0x00e7:
            r7 = r6
        L_0x00e8:
            r14 = 3
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r16 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 47
            if (r16 == 0) goto L_0x011d
            r3.read(r15)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r12 = new byte[r14]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r11 = r3.read(r12)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 != r14) goto L_0x0115
            byte[] r11 = f5959t     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r11 = java.util.Arrays.equals(r11, r12)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 == 0) goto L_0x0115
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r12 = r11 << 18
            int r12 = r12 >> 18
            int r14 = r11 << 2
            int r14 = r14 >> 18
            int r7 = r7 + -10
            goto L_0x014f
        L_0x0115:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r2 = "Encountered error while checking VP8 signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            throw r0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x011d:
            byte[] r11 = f5961v     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r11 = java.util.Arrays.equals(r2, r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 == 0) goto L_0x014c
            byte r11 = r3.readByte()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 != r8) goto L_0x0144
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r14 = r11 << 18
            int r14 = r14 >> 18
            int r14 = r14 + r12
            int r17 = r11 << 4
            int r17 = r17 >> 18
            int r12 = r17 + 1
            r17 = r11 & 8
            int r7 = r7 + -5
            r19 = r14
            r14 = r12
            r12 = r19
            goto L_0x0151
        L_0x0144:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r2 = "Encountered error while checking VP8L signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            throw r0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x014c:
            r11 = 0
            r12 = 0
            r14 = 0
        L_0x014f:
            r17 = 0
        L_0x0151:
            r10.write(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4 = 10
            r10.mo6932h(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r18 = r4[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r16 = 8
            r8 = r18 | 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r13] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r8 = r4[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r18 = 4
            int r17 = r17 << 4
            r8 = r8 | r17
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r13] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r12 = r12 + -1
            int r14 = r14 + -1
            byte r8 = (byte) r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r18] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 5
            int r13 = r12 >> 8
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r13     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 6
            int r12 = r12 >> 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 7
            byte r12 = (byte) r14     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r8 = r14 >> 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r12 = 8
            r4[r12] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 9
            int r12 = r14 >> 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.mo6932h(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r0 == 0) goto L_0x01af
            r10.write(r15)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r0 = f5959t     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x01ab:
            r10.mo6932h(r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x01bd
        L_0x01af:
            byte[] r0 = f5961v     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r0 == 0) goto L_0x01bd
            r0 = 47
            r10.write(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x01ab
        L_0x01bd:
            p027c.p084n.p085a.C2057b.m8870f(r3, r10, r7)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x006a
        L_0x01c2:
            p027c.p084n.p085a.C2057b.m8869e(r3, r10)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r2 = f5957r     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r3 = r2.length     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r0 + r3
            r5.mo6932h(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r5.write(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r9.writeTo(r5)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            p027c.p084n.p085a.C2057b.m8867c(r9)
            return
        L_0x01da:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r2 = "Encountered invalid length while parsing WebP chunk type"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            throw r0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            r7 = r9
            goto L_0x01f3
        L_0x01e5:
            r0 = move-exception
            r7 = r9
            goto L_0x01eb
        L_0x01e8:
            r0 = move-exception
            goto L_0x01f3
        L_0x01ea:
            r0 = move-exception
        L_0x01eb:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x01e8 }
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01e8 }
            throw r2     // Catch:{ all -> 0x01e8 }
        L_0x01f3:
            p027c.p084n.p085a.C2057b.m8867c(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8800a0(java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: b */
    private String m8801b(double d) {
        long j = (long) d;
        double d2 = d - ((double) j);
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (((double) j2) / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    /* renamed from: c */
    private static double m8802c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    private void m8803d(C2051b bVar, C2052c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f5933U;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            m8804e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m8804e(C2051b bVar, C2052c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.mo6932h(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C2057b.m8870f(bVar, cVar, readInt);
    }

    /* renamed from: e0 */
    private void m8805e0(C2051b bVar) {
        HashMap<String, C2053d> hashMap = this.f5971g0[4];
        C2053d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m = dVar.mo6938m(this.f5973i0);
            this.f5980p0 = m;
            if (m != 1) {
                if (m != 6) {
                    if (m != 7) {
                        return;
                    }
                }
            }
            if (m8784K(hashMap)) {
                m8774A(bVar, hashMap);
                return;
            }
            return;
        }
        this.f5980p0 = 6;
        m8823z(bVar, hashMap);
    }

    /* renamed from: f0 */
    private static boolean m8806f0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: g0 */
    private void m8807g0(int i, int i2) {
        String str;
        if (!this.f5971g0[i].isEmpty() && !this.f5971g0[i2].isEmpty()) {
            C2053d dVar = this.f5971g0[i].get("ImageLength");
            C2053d dVar2 = this.f5971g0[i].get("ImageWidth");
            C2053d dVar3 = this.f5971g0[i2].get("ImageLength");
            C2053d dVar4 = this.f5971g0[i2].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f5939a) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m = dVar.mo6938m(this.f5973i0);
                int m2 = dVar2.mo6938m(this.f5973i0);
                int m3 = dVar3.mo6938m(this.f5973i0);
                int m4 = dVar4.mo6938m(this.f5973i0);
                if (m < m3 && m2 < m4) {
                    HashMap<String, C2053d>[] hashMapArr = this.f5971g0;
                    HashMap<String, C2053d> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                    return;
                }
                return;
            } else if (f5939a) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (f5939a) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: h0 */
    private void m8808h0(C2056g gVar, int i) {
        C2053d dVar;
        C2053d dVar2;
        StringBuilder sb;
        String arrays;
        C2053d dVar3 = this.f5971g0[i].get("DefaultCropSize");
        C2053d dVar4 = this.f5971g0[i].get("SensorTopBorder");
        C2053d dVar5 = this.f5971g0[i].get("SensorLeftBorder");
        C2053d dVar6 = this.f5971g0[i].get("SensorBottomBorder");
        C2053d dVar7 = this.f5971g0[i].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f5998a == 5) {
                C2055f[] fVarArr = (C2055f[]) dVar3.mo6940o(this.f5973i0);
                if (fVarArr == null || fVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(fVarArr);
                } else {
                    dVar2 = C2053d.m8853h(fVarArr[0], this.f5973i0);
                    dVar = C2053d.m8853h(fVarArr[1], this.f5973i0);
                    this.f5971g0[i].put("ImageWidth", dVar2);
                    this.f5971g0[i].put("ImageLength", dVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar3.mo6940o(this.f5973i0);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    dVar2 = C2053d.m8855j(iArr[0], this.f5973i0);
                    dVar = C2053d.m8855j(iArr[1], this.f5973i0);
                    this.f5971g0[i].put("ImageWidth", dVar2);
                    this.f5971g0[i].put("ImageLength", dVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            m8796W(gVar, i);
        } else {
            int m = dVar4.mo6938m(this.f5973i0);
            int m2 = dVar6.mo6938m(this.f5973i0);
            int m3 = dVar7.mo6938m(this.f5973i0);
            int m4 = dVar5.mo6938m(this.f5973i0);
            if (m2 > m && m3 > m4) {
                C2053d j = C2053d.m8855j(m2 - m, this.f5973i0);
                C2053d j2 = C2053d.m8855j(m3 - m4, this.f5973i0);
                this.f5971g0[i].put("ImageLength", j);
                this.f5971g0[i].put("ImageWidth", j2);
            }
        }
    }

    /* renamed from: i0 */
    private void m8809i0() {
        m8807g0(0, 5);
        m8807g0(0, 4);
        m8807g0(5, 4);
        C2053d dVar = this.f5971g0[1].get("PixelXDimension");
        C2053d dVar2 = this.f5971g0[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f5971g0[0].put("ImageWidth", dVar);
            this.f5971g0[0].put("ImageLength", dVar2);
        }
        if (this.f5971g0[4].isEmpty() && m8786M(this.f5971g0[5])) {
            HashMap<String, C2053d>[] hashMapArr = this.f5971g0;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m8786M(this.f5971g0[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m8795V(0, "ThumbnailOrientation", "Orientation");
        m8795V(0, "ThumbnailImageLength", "ImageLength");
        m8795V(0, "ThumbnailImageWidth", "ImageWidth");
        m8795V(5, "ThumbnailOrientation", "Orientation");
        m8795V(5, "ThumbnailImageLength", "ImageLength");
        m8795V(5, "ThumbnailImageWidth", "ImageWidth");
        m8795V(4, "Orientation", "ThumbnailOrientation");
        m8795V(4, "ImageLength", "ThumbnailImageLength");
        m8795V(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: j0 */
    private int m8810j0(C2052c cVar) {
        C2052c cVar2 = cVar;
        C2054e[][] eVarArr = f5927O;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (C2054e eVar : f5928P) {
            m8794U(eVar.f6003b);
        }
        if (this.f5974j0) {
            if (this.f5975k0) {
                m8794U("StripOffsets");
                m8794U("StripByteCounts");
            } else {
                m8794U("JPEGInterchangeFormat");
                m8794U("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < f5927O.length; i++) {
            for (Object obj : this.f5971g0[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f5971g0[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f5971g0[1].isEmpty()) {
            this.f5971g0[0].put(f5928P[1].f6003b, C2053d.m8851f(0, this.f5973i0));
        }
        if (!this.f5971g0[2].isEmpty()) {
            this.f5971g0[0].put(f5928P[2].f6003b, C2053d.m8851f(0, this.f5973i0));
        }
        if (!this.f5971g0[3].isEmpty()) {
            this.f5971g0[1].put(f5928P[3].f6003b, C2053d.m8851f(0, this.f5973i0));
        }
        if (this.f5974j0) {
            if (this.f5975k0) {
                this.f5971g0[4].put("StripOffsets", C2053d.m8855j(0, this.f5973i0));
                this.f5971g0[4].put("StripByteCounts", C2053d.m8855j(this.f5978n0, this.f5973i0));
            } else {
                this.f5971g0[4].put("JPEGInterchangeFormat", C2053d.m8851f(0, this.f5973i0));
                this.f5971g0[4].put("JPEGInterchangeFormatLength", C2053d.m8851f((long) this.f5978n0, this.f5973i0));
            }
        }
        for (int i2 = 0; i2 < f5927O.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C2053d> value : this.f5971g0[i2].entrySet()) {
                int p = ((C2053d) value.getValue()).mo6941p();
                if (p > 4) {
                    i3 += p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f5927O.length; i5++) {
            if (!this.f5971g0[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f5971g0[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f5974j0) {
            if (this.f5975k0) {
                this.f5971g0[4].put("StripOffsets", C2053d.m8855j(i4, this.f5973i0));
            } else {
                this.f5971g0[4].put("JPEGInterchangeFormat", C2053d.m8851f((long) i4, this.f5973i0));
            }
            this.f5977m0 = i4;
            i4 += this.f5978n0;
        }
        if (this.f5969e0 == 4) {
            i4 += 8;
        }
        if (f5939a) {
            for (int i6 = 0; i6 < f5927O.length; i6++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f5971g0[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)}));
            }
        }
        if (!this.f5971g0[1].isEmpty()) {
            this.f5971g0[0].put(f5928P[1].f6003b, C2053d.m8851f((long) iArr[1], this.f5973i0));
        }
        if (!this.f5971g0[2].isEmpty()) {
            this.f5971g0[0].put(f5928P[2].f6003b, C2053d.m8851f((long) iArr[2], this.f5973i0));
        }
        if (!this.f5971g0[3].isEmpty()) {
            this.f5971g0[1].put(f5928P[3].f6003b, C2053d.m8851f((long) iArr[3], this.f5973i0));
        }
        int i7 = this.f5969e0;
        if (i7 == 4) {
            cVar2.mo6929A(i4);
            cVar2.write(f5934V);
        } else if (i7 == 13) {
            cVar2.mo6932h(i4);
            cVar2.write(f5953n);
        } else if (i7 == 14) {
            cVar2.write(f5958s);
            cVar2.mo6932h(i4);
        }
        cVar2.mo6933o(this.f5973i0 == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar2.mo6930a(this.f5973i0);
        cVar2.mo6929A(42);
        cVar2.mo6934r(8);
        for (int i8 = 0; i8 < f5927O.length; i8++) {
            if (!this.f5971g0[i8].isEmpty()) {
                cVar2.mo6929A(this.f5971g0[i8].size());
                int size = iArr[i8] + 2 + (this.f5971g0[i8].size() * 12) + 4;
                for (Map.Entry next : this.f5971g0[i8].entrySet()) {
                    int i9 = f5930R[i8].get(next.getKey()).f6002a;
                    C2053d dVar = (C2053d) next.getValue();
                    int p2 = dVar.mo6941p();
                    cVar2.mo6929A(i9);
                    cVar2.mo6929A(dVar.f5998a);
                    cVar2.mo6932h(dVar.f5999b);
                    if (p2 > 4) {
                        cVar2.mo6934r((long) size);
                        size += p2;
                    } else {
                        cVar2.write(dVar.f6001d);
                        if (p2 < 4) {
                            while (p2 < 4) {
                                cVar2.mo6931b(0);
                                p2++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f5971g0[4].isEmpty()) {
                    cVar2.mo6934r(0);
                } else {
                    cVar2.mo6934r((long) iArr[4]);
                }
                for (Map.Entry<String, C2053d> value2 : this.f5971g0[i8].entrySet()) {
                    byte[] bArr = ((C2053d) value2.getValue()).f6001d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f5974j0) {
            cVar2.write(mo6901w());
        }
        if (this.f5969e0 == 14 && i4 % 2 == 1) {
            cVar2.mo6931b(0);
        }
        cVar2.mo6930a(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    /* renamed from: k */
    private C2053d m8811k(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f5939a) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f5927O.length; i++) {
            C2053d dVar = this.f5971g0[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x013a */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8812l(p027c.p084n.p085a.C2049a.C2056g r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0146
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            c.n.a.a$a r2 = new c.n.a.a$a     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x013a }
            p027c.p084n.p085a.C2057b.C2059b.m8875a(r1, r2)     // Catch:{ RuntimeException -> 0x013a }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x013a }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x013a }
            r6 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0047:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x013a }
            if (r0 == 0) goto L_0x0060
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0060:
            r0 = r6
            r4 = r0
        L_0x0062:
            r5 = 0
            if (r6 == 0) goto L_0x0078
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r12.f5971g0     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f5973i0     // Catch:{ RuntimeException -> 0x013a }
            c.n.a.a$d r9 = p027c.p084n.p085a.C2049a.C2053d.m8855j(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0078:
            if (r0 == 0) goto L_0x008d
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r12.f5971g0     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f5973i0     // Catch:{ RuntimeException -> 0x013a }
            c.n.a.a$d r9 = p027c.p084n.p085a.C2049a.C2053d.m8855j(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x008d:
            r7 = 6
            if (r4 == 0) goto L_0x00b7
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x013a }
            r10 = 90
            if (r9 == r10) goto L_0x00a7
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto L_0x00a5
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r8 = 8
            goto L_0x00a8
        L_0x00a5:
            r8 = 3
            goto L_0x00a8
        L_0x00a7:
            r8 = 6
        L_0x00a8:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r9 = r12.f5971g0     // Catch:{ RuntimeException -> 0x013a }
            r9 = r9[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f5973i0     // Catch:{ RuntimeException -> 0x013a }
            c.n.a.a$d r8 = p027c.p084n.p085a.C2049a.C2053d.m8855j(r8, r11)     // Catch:{ RuntimeException -> 0x013a }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x013a }
        L_0x00b7:
            if (r2 == 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x013a }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x013a }
            if (r3 <= r7) goto L_0x0102
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x013a }
            r13.mo6946r(r8)     // Catch:{ RuntimeException -> 0x013a }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x013a }
            int r9 = r13.read(r8)     // Catch:{ RuntimeException -> 0x013a }
            if (r9 != r7) goto L_0x00fa
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = f5934V     // Catch:{ RuntimeException -> 0x013a }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r7 == 0) goto L_0x00f2
            byte[] r7 = new byte[r3]     // Catch:{ RuntimeException -> 0x013a }
            int r13 = r13.read(r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r13 != r3) goto L_0x00ea
            r12.f5981q0 = r2     // Catch:{ RuntimeException -> 0x013a }
            r12.m8792S(r7, r5)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x010a
        L_0x00ea:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00f2:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00fa:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x0102:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x010a:
            boolean r13 = f5939a     // Catch:{ RuntimeException -> 0x013a }
            if (r13 == 0) goto L_0x0134
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>()     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x013a }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0134:
            r1.release()
            return
        L_0x0138:
            r13 = move-exception
            goto L_0x0142
        L_0x013a:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r13     // Catch:{ all -> 0x0138 }
        L_0x0142:
            r1.release()
            throw r13
        L_0x0146:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8812l(c.n.a.a$g):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184 A[LOOP:0: B:8:0x0038->B:60:0x0184, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8813m(p027c.p084n.p085a.C2049a.C2051b r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = f5939a
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo6908h(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01d8
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01bd
            r3 = 2
            r5 = 2
        L_0x0038:
            byte r7 = r22.readByte()
            if (r7 != r6) goto L_0x01a0
            r7 = 1
            int r5 = r5 + r7
            byte r8 = r22.readByte()
            boolean r9 = f5939a
            if (r9 == 0) goto L_0x0062
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L_0x0062:
            int r5 = r5 + r7
            r10 = -39
            if (r8 == r10) goto L_0x019a
            r10 = -38
            if (r8 != r10) goto L_0x006d
            goto L_0x019a
        L_0x006d:
            int r10 = r22.readUnsignedShort()
            int r10 = r10 - r3
            int r5 = r5 + r3
            if (r9 == 0) goto L_0x009e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "JPEG segment: "
            r9.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r9.append(r11)
            java.lang.String r11 = " (length: "
            r9.append(r11)
            int r11 = r10 + 2
            r9.append(r11)
            java.lang.String r11 = ")"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L_0x009e:
            java.lang.String r9 = "Invalid length"
            if (r10 < 0) goto L_0x0194
            r11 = -31
            r12 = 0
            if (r8 == r11) goto L_0x0121
            r11 = -2
            if (r8 == r11) goto L_0x00f3
            switch(r8) {
                case -64: goto L_0x00ba;
                case -63: goto L_0x00ba;
                case -62: goto L_0x00ba;
                case -61: goto L_0x00ba;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r8) {
                case -59: goto L_0x00ba;
                case -58: goto L_0x00ba;
                case -57: goto L_0x00ba;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r8) {
                case -55: goto L_0x00ba;
                case -54: goto L_0x00ba;
                case -53: goto L_0x00ba;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            switch(r8) {
                case -51: goto L_0x00ba;
                case -50: goto L_0x00ba;
                case -49: goto L_0x00ba;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r20 = r4
            goto L_0x0182
        L_0x00ba:
            r1.mo6910o(r7)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r0.f5971g0
            r7 = r7[r2]
            r8 = 4
            if (r2 == r8) goto L_0x00c7
            java.lang.String r11 = "ImageLength"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r11 = "ThumbnailImageLength"
        L_0x00c9:
            int r12 = r22.readUnsignedShort()
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f5973i0
            c.n.a.a$d r12 = p027c.p084n.p085a.C2049a.C2053d.m8851f(r12, r14)
            r7.put(r11, r12)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r0.f5971g0
            r7 = r7[r2]
            if (r2 == r8) goto L_0x00e0
            java.lang.String r8 = "ImageWidth"
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00e2:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f5973i0
            c.n.a.a$d r11 = p027c.p084n.p085a.C2049a.C2053d.m8851f(r11, r13)
            r7.put(r8, r11)
            int r10 = r10 + -5
            goto L_0x00b6
        L_0x00f3:
            byte[] r8 = new byte[r10]
            int r11 = r1.read(r8)
            if (r11 != r10) goto L_0x0119
            java.lang.String r10 = "UserComment"
            java.lang.String r11 = r0.mo6895g(r10)
            if (r11 != 0) goto L_0x0115
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r11 = r0.f5971g0
            r7 = r11[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r13 = f5933U
            r11.<init>(r8, r13)
            c.n.a.a$d r8 = p027c.p084n.p085a.C2049a.C2053d.m8850e(r11)
            r7.put(r10, r8)
        L_0x0115:
            r20 = r4
            goto L_0x0181
        L_0x0119:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r11 = r5 + r10
            byte[] r13 = f5934V
            boolean r14 = p027c.p084n.p085a.C2057b.m8871g(r8, r13)
            if (r14 == 0) goto L_0x0147
            int r7 = r13.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r5 = r23 + r5
            int r8 = r13.length
            int r5 = r5 + r8
            r0.f5981q0 = r5
            r0.m8792S(r7, r2)
            c.n.a.a$b r5 = new c.n.a.a$b
            r5.<init>((byte[]) r7)
            r0.m8805e0(r5)
            goto L_0x017e
        L_0x0147:
            byte[] r13 = f5935W
            boolean r14 = p027c.p084n.p085a.C2057b.m8871g(r8, r13)
            if (r14 == 0) goto L_0x017e
            int r14 = r13.length
            int r5 = r5 + r14
            int r13 = r13.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r13, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r13 = r0.mo6895g(r10)
            if (r13 != 0) goto L_0x017e
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r13 = r0.f5971g0
            r13 = r13[r12]
            c.n.a.a$d r15 = new c.n.a.a$d
            r16 = 1
            int r14 = r8.length
            r20 = r4
            long r3 = (long) r5
            r5 = r14
            r14 = r15
            r6 = r15
            r15 = r16
            r16 = r5
            r17 = r3
            r19 = r8
            r14.<init>(r15, r16, r17, r19)
            r13.put(r10, r6)
            r0.f5986v0 = r7
            goto L_0x0180
        L_0x017e:
            r20 = r4
        L_0x0180:
            r5 = r11
        L_0x0181:
            r10 = 0
        L_0x0182:
            if (r10 < 0) goto L_0x018e
            r1.mo6910o(r10)
            int r5 = r5 + r10
            r4 = r20
            r3 = 2
            r6 = -1
            goto L_0x0038
        L_0x018e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x0194:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x019a:
            java.nio.ByteOrder r2 = r0.f5973i0
            r1.mo6908h(r2)
            return
        L_0x01a0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8813m(c.n.a.a$b, int, int):void");
    }

    /* renamed from: o */
    private int m8814o(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m8778E(bArr)) {
            return 4;
        }
        if (m8781H(bArr)) {
            return 9;
        }
        if (m8777D(bArr)) {
            return 12;
        }
        if (m8779F(bArr)) {
            return 7;
        }
        if (m8782I(bArr)) {
            return 10;
        }
        if (m8780G(bArr)) {
            return 13;
        }
        return m8787N(bArr) ? 14 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8815p(p027c.p084n.p085a.C2049a.C2056g r7) {
        /*
            r6 = this;
            r6.m8818s(r7)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r6.f5971g0
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            c.n.a.a$d r7 = (p027c.p084n.p085a.C2049a.C2053d) r7
            if (r7 == 0) goto L_0x00f5
            c.n.a.a$g r1 = new c.n.a.a$g
            byte[] r7 = r7.f6001d
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f5973i0
            r1.mo6908h(r7)
            byte[] r7 = f5950k
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.mo6946r(r3)
            byte[] r3 = f5951l
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x003f
            r2 = 8
        L_0x003b:
            r1.mo6946r(r2)
            goto L_0x0048
        L_0x003f:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L_0x0048
            r2 = 12
            goto L_0x003b
        L_0x0048:
            r7 = 6
            r6.m8793T(r1, r7)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r6.f5971g0
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            c.n.a.a$d r7 = (p027c.p084n.p085a.C2049a.C2053d) r7
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r2 = r6.f5971g0
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            c.n.a.a$d r1 = (p027c.p084n.p085a.C2049a.C2053d) r1
            if (r7 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r2 = r6.f5971g0
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r6.f5971g0
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x007c:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r6.f5971g0
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            c.n.a.a$d r7 = (p027c.p084n.p085a.C2049a.C2053d) r7
            if (r7 == 0) goto L_0x00f5
            java.nio.ByteOrder r1 = r6.f5973i0
            java.lang.Object r7 = r7.mo6940o(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00db
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009b
            goto L_0x00db
        L_0x009b:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f5
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f5
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00bc
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00bc:
            java.nio.ByteOrder r7 = r6.f5973i0
            c.n.a.a$d r7 = p027c.p084n.p085a.C2049a.C2053d.m8855j(r1, r7)
            java.nio.ByteOrder r0 = r6.f5973i0
            c.n.a.a$d r0 = p027c.p084n.p085a.C2049a.C2053d.m8855j(r2, r0)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r1 = r6.f5971g0
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r7 = r6.f5971g0
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f5
        L_0x00db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8815p(c.n.a.a$g):void");
    }

    /* renamed from: q */
    private void m8816q(C2051b bVar) {
        if (f5939a) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mo6908h(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f5952m;
        bVar.mo6910o(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f5954o)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f5955p)) {
                        if (Arrays.equals(bArr2, f5953n)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f5981q0 = i2;
                                    m8792S(bArr3, 0);
                                    m8809i0();
                                    m8805e0(new C2051b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + C2057b.m8865a(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.mo6910o(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: r */
    private void m8817r(C2051b bVar) {
        boolean z = f5939a;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mo6910o(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.mo6910o(i - bVar.mo6905a());
        bVar.read(bArr4);
        m8813m(new C2051b(bArr4), i, 5);
        bVar.mo6910o(i3 - bVar.mo6905a());
        bVar.mo6908h(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f5922J.f6002a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C2053d j = C2053d.m8855j(readShort, this.f5973i0);
                C2053d j2 = C2053d.m8855j(readShort2, this.f5973i0);
                this.f5971g0[0].put("ImageLength", j);
                this.f5971g0[0].put("ImageWidth", j2);
                if (f5939a) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.mo6910o(readUnsignedShort2);
        }
    }

    /* renamed from: s */
    private void m8818s(C2056g gVar) {
        C2053d dVar;
        m8789P(gVar);
        m8793T(gVar, 0);
        m8808h0(gVar, 0);
        m8808h0(gVar, 5);
        m8808h0(gVar, 4);
        m8809i0();
        if (this.f5969e0 == 8 && (dVar = this.f5971g0[1].get("MakerNote")) != null) {
            C2056g gVar2 = new C2056g(dVar.f6001d);
            gVar2.mo6908h(this.f5973i0);
            gVar2.mo6910o(6);
            m8793T(gVar2, 9);
            C2053d dVar2 = this.f5971g0[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f5971g0[1].put("ColorSpace", dVar2);
            }
        }
    }

    /* renamed from: t */
    private void m8819t(C2056g gVar) {
        if (f5939a) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m8818s(gVar);
        C2053d dVar = this.f5971g0[0].get("JpgFromRaw");
        if (dVar != null) {
            m8813m(new C2051b(dVar.f6001d), (int) dVar.f6000c, 5);
        }
        C2053d dVar2 = this.f5971g0[0].get("ISO");
        C2053d dVar3 = this.f5971g0[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f5971g0[1].put("PhotographicSensitivity", dVar2);
        }
    }

    /* renamed from: u */
    private void m8820u(C2056g gVar) {
        byte[] bArr = f5934V;
        gVar.mo6910o(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f5981q0 = bArr.length;
        m8792S(bArr2, 0);
    }

    /* renamed from: x */
    private void m8821x(C2051b bVar) {
        if (f5939a) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mo6908h(ByteOrder.LITTLE_ENDIAN);
        bVar.mo6910o(f5956q.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f5957r;
        bVar.mo6910o(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f5958s, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f5981q0 = i;
                            m8792S(bArr3, 0);
                            m8805e0(new C2051b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C2057b.m8865a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.mo6910o(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m8822y(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = m8822y(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = m8822y(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = -1
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = -1
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r1)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.m8822y(java.lang.String):android.util.Pair");
    }

    /* renamed from: z */
    private void m8823z(C2051b bVar, HashMap hashMap) {
        C2053d dVar = (C2053d) hashMap.get("JPEGInterchangeFormat");
        C2053d dVar2 = (C2053d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m = dVar.mo6938m(this.f5973i0);
            int m2 = dVar2.mo6938m(this.f5973i0);
            if (this.f5969e0 == 7) {
                m += this.f5982r0;
            }
            if (m > 0 && m2 > 0) {
                this.f5974j0 = true;
                if (this.f5966b0 == null && this.f5968d0 == null && this.f5967c0 == null) {
                    byte[] bArr = new byte[m2];
                    bVar.skip((long) m);
                    bVar.read(bArr);
                    this.f5979o0 = bArr;
                }
                this.f5977m0 = m;
                this.f5978n0 = m2;
            }
            if (f5939a) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m + ", length: " + m2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0168, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e5, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e6, code lost:
        r10 = null;
        r1 = r7;
        r7 = r9;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00eb, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        r9 = null;
        r10 = null;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f1, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0104, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0106, code lost:
        p027c.p084n.p085a.C2057b.C2058a.m8874c(r14.f5967c0, 0, android.system.OsConstants.SEEK_SET);
        r1 = new java.io.FileOutputStream(r14.f5967c0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0115, code lost:
        r1 = new java.io.FileOutputStream(r14.f5966b0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:30:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0102 A[Catch:{ Exception -> 0x0131, all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0115 A[Catch:{ Exception -> 0x0131, all -> 0x012e }] */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6890X() {
        /*
            r14 = this;
            int r0 = r14.f5969e0
            boolean r0 = m8785L(r0)
            if (r0 == 0) goto L_0x018d
            java.io.FileDescriptor r0 = r14.f5967c0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r14.f5966b0
            if (r0 == 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0019:
            boolean r0 = r14.f5974j0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r14.f5975k0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r14.f5976l0
            if (r0 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            r0 = 1
            r14.f5985u0 = r0
            byte[] r1 = r14.mo6900v()
            r14.f5979o0 = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            java.lang.String r3 = r14.f5966b0     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            r4 = 0
            r6 = 21
            if (r3 == 0) goto L_0x0050
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            java.lang.String r7 = r14.f5966b0     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            goto L_0x0064
        L_0x0050:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            if (r3 < r6) goto L_0x0063
            java.io.FileDescriptor r3 = r14.f5967c0     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            p027c.p084n.p085a.C2057b.C2058a.m8874c(r3, r4, r7)     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            java.io.FileDescriptor r7 = r14.f5967c0     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x017b, all -> 0x0178 }
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0174, all -> 0x0170 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0174, all -> 0x0170 }
            p027c.p084n.p085a.C2057b.m8869e(r3, r7)     // Catch:{ Exception -> 0x016e, all -> 0x016c }
            p027c.p084n.p085a.C2057b.m8867c(r3)
            p027c.p084n.p085a.C2057b.m8867c(r7)
            r3 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00f4, all -> 0x00f0 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x00f4, all -> 0x00f0 }
            java.lang.String r8 = r14.f5966b0     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            if (r8 == 0) goto L_0x0084
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            java.lang.String r9 = r14.f5966b0     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            goto L_0x0098
        L_0x0084:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            if (r8 < r6) goto L_0x0097
            java.io.FileDescriptor r8 = r14.f5967c0     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            int r9 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            p027c.p084n.p085a.C2057b.C2058a.m8874c(r8, r4, r9)     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            java.io.FileDescriptor r9 = r14.f5967c0     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00eb, all -> 0x00f0 }
            goto L_0x0098
        L_0x0097:
            r8 = r1
        L_0x0098:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e5, all -> 0x00f0 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00e5, all -> 0x00f0 }
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00df, all -> 0x00db }
            r10.<init>(r8)     // Catch:{ Exception -> 0x00df, all -> 0x00db }
            int r11 = r14.f5969e0     // Catch:{ Exception -> 0x00d6 }
            r12 = 4
            if (r11 != r12) goto L_0x00ab
            r14.m8797Y(r9, r10)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00ca
        L_0x00ab:
            r12 = 13
            if (r11 != r12) goto L_0x00b3
            r14.m8798Z(r9, r10)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00ca
        L_0x00b3:
            r12 = 14
            if (r11 != r12) goto L_0x00bb
            r14.m8800a0(r9, r10)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00ca
        L_0x00bb:
            r12 = 3
            if (r11 == r12) goto L_0x00c0
            if (r11 != 0) goto L_0x00ca
        L_0x00c0:
            c.n.a.a$c r11 = new c.n.a.a$c     // Catch:{ Exception -> 0x00d6 }
            java.nio.ByteOrder r12 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x00d6 }
            r11.<init>(r10, r12)     // Catch:{ Exception -> 0x00d6 }
            r14.m8810j0(r11)     // Catch:{ Exception -> 0x00d6 }
        L_0x00ca:
            p027c.p084n.p085a.C2057b.m8867c(r9)
            p027c.p084n.p085a.C2057b.m8867c(r10)
            r2.delete()
            r14.f5979o0 = r1
            return
        L_0x00d6:
            r1 = move-exception
            r13 = r7
            r7 = r1
            r1 = r13
            goto L_0x00f9
        L_0x00db:
            r0 = move-exception
            r10 = r1
            goto L_0x015f
        L_0x00df:
            r10 = move-exception
            r13 = r10
            r10 = r1
            r1 = r7
            r7 = r13
            goto L_0x00f9
        L_0x00e5:
            r9 = move-exception
            r10 = r1
            r1 = r7
            r7 = r9
            r9 = r10
            goto L_0x00f9
        L_0x00eb:
            r8 = move-exception
            r9 = r1
            r10 = r9
            r1 = r7
            goto L_0x00f7
        L_0x00f0:
            r0 = move-exception
            r10 = r1
            goto L_0x0160
        L_0x00f4:
            r8 = move-exception
            r9 = r1
            r10 = r9
        L_0x00f7:
            r7 = r8
            r8 = r10
        L_0x00f9:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0135, all -> 0x0133 }
            r11.<init>(r2)     // Catch:{ Exception -> 0x0135, all -> 0x0133 }
            java.lang.String r1 = r14.f5966b0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            if (r1 != 0) goto L_0x0115
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            if (r1 < r6) goto L_0x011d
            java.io.FileDescriptor r1 = r14.f5967c0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            p027c.p084n.p085a.C2057b.C2058a.m8874c(r1, r4, r6)     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            java.io.FileDescriptor r4 = r14.f5967c0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            goto L_0x011c
        L_0x0115:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            java.lang.String r4 = r14.f5966b0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0131, all -> 0x012e }
        L_0x011c:
            r8 = r1
        L_0x011d:
            p027c.p084n.p085a.C2057b.m8869e(r11, r8)     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            p027c.p084n.p085a.C2057b.m8867c(r11)     // Catch:{ all -> 0x015e }
            p027c.p084n.p085a.C2057b.m8867c(r8)     // Catch:{ all -> 0x015e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015e }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r7)     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ all -> 0x015e }
        L_0x012e:
            r0 = move-exception
            r1 = r11
            goto L_0x0157
        L_0x0131:
            r1 = move-exception
            goto L_0x0138
        L_0x0133:
            r0 = move-exception
            goto L_0x0157
        L_0x0135:
            r3 = move-exception
            r11 = r1
            r1 = r3
        L_0x0138:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0153 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0153 }
            r4.<init>()     // Catch:{ all -> 0x0153 }
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch:{ all -> 0x0153 }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ all -> 0x0153 }
            r4.append(r5)     // Catch:{ all -> 0x0153 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0153 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0153 }
            throw r3     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r1 = move-exception
            r0 = r1
            r1 = r11
            r3 = 1
        L_0x0157:
            p027c.p084n.p085a.C2057b.m8867c(r1)     // Catch:{ all -> 0x015e }
            p027c.p084n.p085a.C2057b.m8867c(r8)     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
        L_0x015f:
            r1 = r9
        L_0x0160:
            p027c.p084n.p085a.C2057b.m8867c(r1)
            p027c.p084n.p085a.C2057b.m8867c(r10)
            if (r3 != 0) goto L_0x016b
            r2.delete()
        L_0x016b:
            throw r0
        L_0x016c:
            r0 = move-exception
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            goto L_0x0176
        L_0x0170:
            r0 = move-exception
            r7 = r1
        L_0x0172:
            r1 = r3
            goto L_0x0186
        L_0x0174:
            r0 = move-exception
            r7 = r1
        L_0x0176:
            r1 = r3
            goto L_0x017d
        L_0x0178:
            r0 = move-exception
            r7 = r1
            goto L_0x0186
        L_0x017b:
            r0 = move-exception
            r7 = r1
        L_0x017d:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0185 }
            throw r2     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r0 = move-exception
        L_0x0186:
            p027c.p084n.p085a.C2057b.m8867c(r1)
            p027c.p084n.p085a.C2057b.m8867c(r7)
            throw r0
        L_0x018d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.mo6890X():void");
    }

    /* renamed from: b0 */
    public void mo6891b0(double d) {
        String str = d >= 0.0d ? "0" : "1";
        mo6892c0("GPSAltitude", new C2055f(Math.abs(d)).toString());
        mo6892c0("GPSAltitudeRef", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0328, code lost:
        r3.put(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0292, code lost:
        r3.put(r1, r4);
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6892c0(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = " : "
            java.lang.String r5 = "Invalid value for "
            java.lang.String r6 = "ExifInterface"
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0070
        L_0x0029:
            if (r2 == 0) goto L_0x0070
            java.util.regex.Pattern r3 = f5938Z
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r7 = f5940a0
            java.util.regex.Matcher r7 = r7.matcher(r2)
            boolean r7 = r7.find()
            int r8 = r19.length()
            r9 = 19
            if (r8 != r9) goto L_0x0057
            if (r3 != 0) goto L_0x004c
            if (r7 != 0) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r7 == 0) goto L_0x0070
            java.lang.String r3 = "-"
            java.lang.String r7 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r7)
            goto L_0x0070
        L_0x0057:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x005c:
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r6, r1)
            return
        L_0x0070:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0083
            boolean r1 = f5939a
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r6, r1)
        L_0x0081:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0083:
            r3 = 2
            r7 = 1
            if (r2 == 0) goto L_0x00f7
            java.util.HashSet<java.lang.String> r8 = f5931S
            boolean r8 = r8.contains(r1)
            if (r8 == 0) goto L_0x00f7
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00e2
            java.util.regex.Pattern r8 = f5937Y
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r9 = r8.find()
            if (r9 != 0) goto L_0x00a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x005c
        L_0x00a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r8.group(r7)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1,"
            r2.append(r4)
            java.lang.String r5 = r8.group(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            r2.append(r4)
            r4 = 3
            java.lang.String r4 = r8.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x00f7
        L_0x00e2:
            double r8 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00f0 }
            c.n.a.a$f r10 = new c.n.a.a$f     // Catch:{ NumberFormatException -> 0x00f0 }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x00f0 }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x00f0 }
            goto L_0x00f7
        L_0x00f0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x005c
        L_0x00f7:
            r4 = 0
            r5 = 0
        L_0x00f9:
            c.n.a.a$e[][] r8 = f5927O
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0334
            r8 = 4
            if (r5 != r8) goto L_0x0107
            boolean r8 = r0.f5974j0
            if (r8 != 0) goto L_0x0107
            goto L_0x032c
        L_0x0107:
            java.util.HashMap<java.lang.String, c.n.a.a$e>[] r8 = f5930R
            r8 = r8[r5]
            java.lang.Object r8 = r8.get(r1)
            c.n.a.a$e r8 = (p027c.p084n.p085a.C2049a.C2054e) r8
            if (r8 == 0) goto L_0x032c
            if (r2 != 0) goto L_0x011e
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r8 = r0.f5971g0
            r8 = r8[r5]
            r8.remove(r1)
            goto L_0x032c
        L_0x011e:
            android.util.Pair r9 = m8822y(r2)
            int r10 = r8.f6004c
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = -1
            if (r10 == r11) goto L_0x01ee
            int r10 = r8.f6004c
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x013d
            goto L_0x01ee
        L_0x013d:
            int r10 = r8.f6005d
            if (r10 == r12) goto L_0x015b
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x0157
            int r10 = r8.f6005d
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x015b
        L_0x0157:
            int r8 = r8.f6005d
            goto L_0x01f0
        L_0x015b:
            int r10 = r8.f6004c
            if (r10 == r7) goto L_0x01ec
            r11 = 7
            if (r10 == r11) goto L_0x01ec
            if (r10 != r3) goto L_0x0166
            goto L_0x01ec
        L_0x0166:
            boolean r10 = f5939a
            if (r10 == 0) goto L_0x032c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Given tag ("
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ") value didn't match with one of expected formats: "
            r10.append(r11)
            java.lang.String[] r11 = f5914B
            int r13 = r8.f6004c
            r13 = r11[r13]
            r10.append(r13)
            int r13 = r8.f6005d
            java.lang.String r14 = ""
            java.lang.String r15 = ", "
            if (r13 != r12) goto L_0x018f
            r8 = r14
            goto L_0x01a2
        L_0x018f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            int r8 = r8.f6005d
            r8 = r11[r8]
            r13.append(r8)
            java.lang.String r8 = r13.toString()
        L_0x01a2:
            r10.append(r8)
            java.lang.String r8 = " (guess: "
            r10.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r11[r8]
            r10.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x01c2
            goto L_0x01db
        L_0x01c2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r11[r9]
            r8.append(r9)
            java.lang.String r14 = r8.toString()
        L_0x01db:
            r10.append(r14)
            java.lang.String r8 = ")"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.d(r6, r8)
            goto L_0x032c
        L_0x01ec:
            r8 = r10
            goto L_0x01f0
        L_0x01ee:
            int r8 = r8.f6004c
        L_0x01f0:
            java.lang.String r9 = "/"
            java.lang.String r10 = ","
            switch(r8) {
                case 1: goto L_0x031f;
                case 2: goto L_0x0315;
                case 3: goto L_0x02f2;
                case 4: goto L_0x02cf;
                case 5: goto L_0x0297;
                case 6: goto L_0x01f7;
                case 7: goto L_0x0315;
                case 8: goto L_0x01f7;
                case 9: goto L_0x0272;
                case 10: goto L_0x0237;
                case 11: goto L_0x01f7;
                case 12: goto L_0x0212;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            r15 = 1
            boolean r3 = f5939a
            if (r3 == 0) goto L_0x032d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Data format isn't one of expected formats: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r6, r3)
            goto L_0x032d
        L_0x0212:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r10 = 0
        L_0x021a:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x0228
            r11 = r8[r10]
            double r11 = java.lang.Double.parseDouble(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x021a
        L_0x0228:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r8 = r0.f5971g0
            r8 = r8[r5]
            java.nio.ByteOrder r10 = r0.f5973i0
            c.n.a.a$d r9 = p027c.p084n.p085a.C2049a.C2053d.m8847b(r9, r10)
            r8.put(r1, r9)
            goto L_0x032c
        L_0x0237:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r10 = r8.length
            c.n.a.a$f[] r10 = new p027c.p084n.p085a.C2049a.C2055f[r10]
            r11 = 0
        L_0x023f:
            int r13 = r8.length
            if (r11 >= r13) goto L_0x0267
            r13 = r8[r11]
            java.lang.String[] r13 = r13.split(r9, r12)
            c.n.a.a$f r14 = new c.n.a.a$f
            r15 = r13[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r13 = r13[r7]
            r16 = r8
            double r7 = java.lang.Double.parseDouble(r13)
            long r7 = (long) r7
            r14.<init>(r3, r7)
            r10[r11] = r14
            int r11 = r11 + 1
            r8 = r16
            r3 = 2
            r4 = 0
            r7 = 1
            goto L_0x023f
        L_0x0267:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            java.nio.ByteOrder r4 = r0.f5973i0
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8849d(r10, r4)
            goto L_0x0292
        L_0x0272:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x027a:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x0288
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x027a
        L_0x0288:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f5973i0
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8848c(r4, r7)
        L_0x0292:
            r3.put(r1, r4)
            goto L_0x032c
        L_0x0297:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            c.n.a.a$f[] r4 = new p027c.p084n.p085a.C2049a.C2055f[r4]
            r7 = 0
        L_0x029f:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02c3
            r8 = r3[r7]
            java.lang.String[] r8 = r8.split(r9, r12)
            c.n.a.a$f r10 = new c.n.a.a$f
            r11 = 0
            r13 = r8[r11]
            double r13 = java.lang.Double.parseDouble(r13)
            long r13 = (long) r13
            r15 = 1
            r8 = r8[r15]
            double r11 = java.lang.Double.parseDouble(r8)
            long r11 = (long) r11
            r10.<init>(r13, r11)
            r4[r7] = r10
            int r7 = r7 + 1
            r12 = -1
            goto L_0x029f
        L_0x02c3:
            r15 = 1
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f5973i0
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8854i(r4, r7)
            goto L_0x0328
        L_0x02cf:
            r3 = -1
            r15 = 1
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r7 = 0
        L_0x02d9:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02e7
            r8 = r3[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02d9
        L_0x02e7:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f5973i0
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8852g(r4, r7)
            goto L_0x0328
        L_0x02f2:
            r3 = -1
            r15 = 1
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x02fc:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x030a
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02fc
        L_0x030a:
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f5973i0
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8856k(r4, r7)
            goto L_0x0328
        L_0x0315:
            r15 = 1
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8850e(r2)
            goto L_0x0328
        L_0x031f:
            r15 = 1
            java.util.HashMap<java.lang.String, c.n.a.a$d>[] r3 = r0.f5971g0
            r3 = r3[r5]
            c.n.a.a$d r4 = p027c.p084n.p085a.C2049a.C2053d.m8846a(r2)
        L_0x0328:
            r3.put(r1, r4)
            goto L_0x032d
        L_0x032c:
            r15 = 1
        L_0x032d:
            int r5 = r5 + 1
            r3 = 2
            r4 = 0
            r7 = 1
            goto L_0x00f9
        L_0x0334:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.mo6892c0(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d0 */
    public void mo6893d0(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            mo6892c0("GPSLatitudeRef", d >= 0.0d ? "N" : "S");
            mo6892c0("GPSLatitude", m8801b(Math.abs(d)));
            mo6892c0("GPSLongitudeRef", d2 >= 0.0d ? "E" : "W");
            mo6892c0("GPSLongitude", m8801b(Math.abs(d2)));
        }
    }

    /* renamed from: f */
    public double mo6894f(double d) {
        double h = mo6896h("GPSAltitude", -1.0d);
        int i = -1;
        int i2 = mo6897i("GPSAltitudeRef", -1);
        if (h < 0.0d || i2 < 0) {
            return d;
        }
        if (i2 != 1) {
            i = 1;
        }
        return h * ((double) i);
    }

    /* renamed from: g */
    public String mo6895g(String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2053d k = m8811k(str);
        if (k != null) {
            if (!f5931S.contains(str)) {
                return k.mo6939n(this.f5973i0);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = k.f5998a;
                if (i == 5 || i == 10) {
                    C2055f[] fVarArr = (C2055f[]) k.mo6940o(this.f5973i0);
                    if (fVarArr == null || fVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) fVarArr[0].f6006a) / ((float) fVarArr[0].f6007b))), Integer.valueOf((int) (((float) fVarArr[1].f6006a) / ((float) fVarArr[1].f6007b))), Integer.valueOf((int) (((float) fVarArr[2].f6006a) / ((float) fVarArr[2].f6007b)))});
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + k.f5998a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(k.mo6937l(this.f5973i0));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    public double mo6896h(String str, double d) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2053d k = m8811k(str);
        if (k == null) {
            return d;
        }
        try {
            return k.mo6937l(this.f5973i0);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: i */
    public int mo6897i(String str, int i) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2053d k = m8811k(str);
        if (k == null) {
            return i;
        }
        try {
            return k.mo6938m(this.f5973i0);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: j */
    public long[] mo6898j(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (!this.f5985u0) {
            C2053d k = m8811k(str);
            if (k == null) {
                return null;
            }
            return new long[]{k.f6000c, (long) k.f6001d.length};
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    /* renamed from: n */
    public double[] mo6899n() {
        String g = mo6895g("GPSLatitude");
        String g2 = mo6895g("GPSLatitudeRef");
        String g3 = mo6895g("GPSLongitude");
        String g4 = mo6895g("GPSLongitudeRef");
        if (g == null || g2 == null || g3 == null || g4 == null) {
            return null;
        }
        try {
            return new double[]{m8802c(g, g2), m8802c(g3, g4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{g, g2, g3, g4}));
            return null;
        }
    }

    /* renamed from: v */
    public byte[] mo6900v() {
        int i = this.f5980p0;
        if (i == 6 || i == 7) {
            return mo6901w();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063 A[SYNTHETIC, Splitter:B:38:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e A[Catch:{ Exception -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c0  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo6901w() {
        /*
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.f5974j0
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r11.f5979o0
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r11.f5968d0     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r1 == 0) goto L_0x002e
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            if (r3 == 0) goto L_0x001c
            r1.reset()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
        L_0x001a:
            r3 = r2
            goto L_0x0061
        L_0x001c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            p027c.p084n.p085a.C2057b.m8867c(r1)
            return r2
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x00ba
        L_0x0029:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x00ab
        L_0x002e:
            java.lang.String r1 = r11.f5966b0     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r1 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r3 = r11.f5966b0     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            goto L_0x001a
        L_0x003a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r3 = 21
            if (r1 < r3) goto L_0x005f
            java.io.FileDescriptor r1 = r11.f5967c0     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.io.FileDescriptor r1 = p027c.p084n.p085a.C2057b.C2058a.m8873b(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            p027c.p084n.p085a.C2057b.C2058a.m8874c(r1, r3, r5)     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            r10 = r3
            r3 = r1
            r1 = r10
            goto L_0x0061
        L_0x0056:
            r0 = move-exception
            r3 = r1
            goto L_0x00bb
        L_0x005a:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L_0x00ab
        L_0x005f:
            r1 = r2
            r3 = r1
        L_0x0061:
            if (r1 == 0) goto L_0x009e
            int r4 = r11.f5977m0     // Catch:{ Exception -> 0x009c }
            int r5 = r11.f5981q0     // Catch:{ Exception -> 0x009c }
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch:{ Exception -> 0x009c }
            long r4 = r1.skip(r4)     // Catch:{ Exception -> 0x009c }
            int r6 = r11.f5977m0     // Catch:{ Exception -> 0x009c }
            int r7 = r11.f5981q0     // Catch:{ Exception -> 0x009c }
            int r6 = r6 + r7
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0096
            int r4 = r11.f5978n0     // Catch:{ Exception -> 0x009c }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x009c }
            int r5 = r1.read(r4)     // Catch:{ Exception -> 0x009c }
            int r6 = r11.f5978n0     // Catch:{ Exception -> 0x009c }
            if (r5 != r6) goto L_0x0090
            r11.f5979o0 = r4     // Catch:{ Exception -> 0x009c }
            p027c.p084n.p085a.C2057b.m8867c(r1)
            if (r3 == 0) goto L_0x008f
            p027c.p084n.p085a.C2057b.m8866b(r3)
        L_0x008f:
            return r4
        L_0x0090:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x009c }
            r4.<init>(r8)     // Catch:{ Exception -> 0x009c }
            throw r4     // Catch:{ Exception -> 0x009c }
        L_0x0096:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x009c }
            r4.<init>(r8)     // Catch:{ Exception -> 0x009c }
            throw r4     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            r4 = move-exception
            goto L_0x00ab
        L_0x009e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x009c }
            r4.<init>()     // Catch:{ Exception -> 0x009c }
            throw r4     // Catch:{ Exception -> 0x009c }
        L_0x00a4:
            r0 = move-exception
            r3 = r2
            goto L_0x00bb
        L_0x00a7:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L_0x00ab:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x00b9 }
            p027c.p084n.p085a.C2057b.m8867c(r1)
            if (r3 == 0) goto L_0x00b8
            p027c.p084n.p085a.C2057b.m8866b(r3)
        L_0x00b8:
            return r2
        L_0x00b9:
            r0 = move-exception
        L_0x00ba:
            r2 = r1
        L_0x00bb:
            p027c.p084n.p085a.C2057b.m8867c(r2)
            if (r3 == 0) goto L_0x00c3
            p027c.p084n.p085a.C2057b.m8866b(r3)
        L_0x00c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p084n.p085a.C2049a.mo6901w():byte[]");
    }
}
