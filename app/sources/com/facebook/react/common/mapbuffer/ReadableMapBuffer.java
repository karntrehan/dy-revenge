package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p174e.p247e.p317m.p318a.C6410a;

public class ReadableMapBuffer implements Iterable<C2703b> {

    /* renamed from: f */
    ByteBuffer f7792f = null;
    @C6410a
    private HybridData mHybridData;

    /* renamed from: o */
    private int f7793o = 0;

    /* renamed from: p */
    private short f7794p = 0;

    /* renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$a */
    class C2702a implements Iterator<C2703b> {

        /* renamed from: f */
        short f7795f = 0;

        /* renamed from: o */
        short f7796o;

        C2702a() {
            this.f7796o = (short) (ReadableMapBuffer.this.mo8830A() - 1);
        }

        /* renamed from: b */
        public C2703b next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            short s = this.f7795f;
            this.f7795f = (short) (s + 1);
            return new C2703b(readableMapBuffer, readableMapBuffer.m10936D(s), (C2702a) null);
        }

        public boolean hasNext() {
            return this.f7795f <= this.f7796o;
        }
    }

    /* renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$b */
    public class C2703b {

        /* renamed from: a */
        private final int f7798a;

        private C2703b(int i) {
            this.f7798a = i;
        }

        /* synthetic */ C2703b(ReadableMapBuffer readableMapBuffer, int i, C2702a aVar) {
            this(i);
        }

        /* renamed from: a */
        public boolean mo8844a(boolean z) {
            return ReadableMapBuffer.this.m10940K(this.f7798a + 2);
        }

        /* renamed from: b */
        public double mo8845b(double d) {
            return ReadableMapBuffer.this.m10941L(this.f7798a + 2);
        }

        /* renamed from: c */
        public int mo8846c(int i) {
            return ReadableMapBuffer.this.m10943N(this.f7798a + 2);
        }

        /* renamed from: d */
        public short mo8847d() {
            return ReadableMapBuffer.this.m10944O(this.f7798a);
        }

        /* renamed from: e */
        public ReadableMapBuffer mo8848e() {
            return ReadableMapBuffer.this.m10945P(this.f7798a + 2);
        }

        /* renamed from: f */
        public String mo8849f() {
            return ReadableMapBuffer.this.m10946Q(this.f7798a + 2);
        }
    }

    static {
        C2704a.m10970a();
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.f7792f = byteBuffer;
        m10942M();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public int m10936D(int i) {
        return (i * 10) + 8;
    }

    /* renamed from: F */
    private int m10937F() {
        return m10936D(this.f7794p);
    }

    /* renamed from: H */
    private int m10938H(short s) {
        m10939J();
        int z = m10955z(s);
        if (z != -1) {
            m10954r(s, z);
            return m10936D(z) + 2;
        }
        throw new IllegalArgumentException("Unable to find key: " + s);
    }

    /* renamed from: J */
    private ByteBuffer m10939J() {
        ByteBuffer byteBuffer = this.f7792f;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        this.f7792f = importByteBuffer();
        m10942M();
        return this.f7792f;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public boolean m10940K(int i) {
        return m10943N(i) == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public double m10941L(int i) {
        return this.f7792f.getDouble(i);
    }

    /* renamed from: M */
    private void m10942M() {
        if (this.f7792f.getShort() != 254) {
            this.f7792f.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f7794p = this.f7792f.getShort();
        this.f7793o = this.f7792f.getInt();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public int m10943N(int i) {
        return this.f7792f.getInt(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public short m10944O(int i) {
        return this.f7792f.getShort(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public ReadableMapBuffer m10945P(int i) {
        int F = m10937F() + this.f7792f.getInt(i);
        int i2 = this.f7792f.getInt(F);
        byte[] bArr = new byte[i2];
        this.f7792f.position(F + 4);
        this.f7792f.get(bArr, 0, i2);
        return new ReadableMapBuffer(ByteBuffer.wrap(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public String m10946Q(int i) {
        int F = m10937F() + this.f7792f.getInt(i);
        int i2 = this.f7792f.getInt(F);
        byte[] bArr = new byte[i2];
        this.f7792f.position(F + 4);
        this.f7792f.get(bArr, 0, i2);
        return new String(bArr);
    }

    private native ByteBuffer importByteBuffer();

    private native ByteBuffer importByteBufferAllocateDirect();

    /* renamed from: r */
    private void m10954r(short s, int i) {
        short s2 = this.f7792f.getShort(m10936D(i));
        if (s2 != s) {
            throw new IllegalStateException("Stored key doesn't match parameter - expected: " + s + " - found: " + s2);
        }
    }

    /* renamed from: z */
    private int m10955z(short s) {
        short A = (short) (mo8830A() - 1);
        short s2 = 0;
        while (s2 <= A) {
            short s3 = (short) ((s2 + A) >>> 1);
            short O = m10944O(m10936D(s3));
            if (O < s) {
                s2 = (short) (s3 + 1);
            } else if (O <= s) {
                return s3;
            } else {
                A = (short) (s3 - 1);
            }
        }
        return -1;
    }

    /* renamed from: A */
    public short mo8830A() {
        m10939J();
        return this.f7794p;
    }

    /* renamed from: B */
    public double mo8831B(short s) {
        return m10941L(m10938H(s));
    }

    /* renamed from: C */
    public int mo8832C(short s) {
        return m10943N(m10938H(s));
    }

    /* renamed from: E */
    public ReadableMapBuffer mo8833E(short s) {
        return m10945P(m10938H(s));
    }

    /* renamed from: G */
    public String mo8834G(short s) {
        return m10946Q(m10938H(s));
    }

    /* renamed from: I */
    public boolean mo8835I(short s) {
        return m10955z(s) != -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer J = m10939J();
        ByteBuffer J2 = ((ReadableMapBuffer) obj).m10939J();
        if (J == J2) {
            return true;
        }
        J.rewind();
        J2.rewind();
        return J.equals(J2);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }

    public int hashCode() {
        ByteBuffer J = m10939J();
        J.rewind();
        return J.hashCode();
    }

    public Iterator<C2703b> iterator() {
        return new C2702a();
    }

    /* renamed from: v */
    public boolean mo8840v(short s) {
        return m10940K(m10938H(s));
    }
}
