package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.soloader.p127o.C3291a;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;

@C6052d
public class NativeMemoryChunk implements C2428u, Closeable {

    /* renamed from: f */
    private final long f7108f;

    /* renamed from: o */
    private final int f7109o;

    /* renamed from: p */
    private boolean f7110p;

    static {
        C3291a.m12875d("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.f7109o = 0;
        this.f7108f = 0;
        this.f7110p = true;
    }

    public NativeMemoryChunk(int i) {
        C6062k.m22834b(Boolean.valueOf(i > 0));
        this.f7109o = i;
        this.f7108f = nativeAllocate(i);
        this.f7110p = false;
    }

    /* renamed from: A */
    private void m9902A(int i, C2428u uVar, int i2, int i3) {
        if (uVar instanceof NativeMemoryChunk) {
            C6062k.m22841i(!isClosed());
            C6062k.m22841i(!uVar.isClosed());
            C2430w.m10111b(i, uVar.mo8054h(), i2, i3, this.f7109o);
            nativeMemcpy(uVar.mo8059r() + ((long) i2), this.f7108f + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @C6052d
    private static native long nativeAllocate(int i);

    @C6052d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @C6052d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @C6052d
    private static native void nativeFree(long j);

    @C6052d
    private static native void nativeMemcpy(long j, long j2, int i);

    @C6052d
    private static native byte nativeReadByte(long j);

    /* renamed from: a */
    public long mo8049a() {
        return this.f7108f;
    }

    /* renamed from: b */
    public void mo8050b(int i, C2428u uVar, int i2, int i3) {
        C6062k.m22839g(uVar);
        if (uVar.mo8049a() == mo8049a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(uVar)) + " which share the same address " + Long.toHexString(this.f7108f));
            C6062k.m22834b(Boolean.FALSE);
        }
        if (uVar.mo8049a() < mo8049a()) {
            synchronized (uVar) {
                synchronized (this) {
                    m9902A(i, uVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (uVar) {
                m9902A(i, uVar, i2, i3);
            }
        }
    }

    public synchronized void close() {
        if (!this.f7110p) {
            this.f7110p = true;
            nativeFree(this.f7108f);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    /* renamed from: g */
    public ByteBuffer mo8053g() {
        return null;
    }

    /* renamed from: h */
    public int mo8054h() {
        return this.f7109o;
    }

    public synchronized boolean isClosed() {
        return this.f7110p;
    }

    /* renamed from: j */
    public synchronized byte mo8056j(int i) {
        boolean z = true;
        C6062k.m22841i(!isClosed());
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= this.f7109o) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        return nativeReadByte(this.f7108f + ((long) i));
    }

    /* renamed from: k */
    public synchronized int mo8057k(int i, byte[] bArr, int i2, int i3) {
        int a;
        C6062k.m22839g(bArr);
        C6062k.m22841i(!isClosed());
        a = C2430w.m10110a(i, i3, this.f7109o);
        C2430w.m10111b(i, bArr.length, i2, a, this.f7109o);
        nativeCopyToByteArray(this.f7108f + ((long) i), bArr, i2, a);
        return a;
    }

    /* renamed from: o */
    public synchronized int mo8058o(int i, byte[] bArr, int i2, int i3) {
        int a;
        C6062k.m22839g(bArr);
        C6062k.m22841i(!isClosed());
        a = C2430w.m10110a(i, i3, this.f7109o);
        C2430w.m10111b(i, bArr.length, i2, a, this.f7109o);
        nativeCopyFromByteArray(this.f7108f + ((long) i), bArr, i2, a);
        return a;
    }

    /* renamed from: r */
    public long mo8059r() {
        return this.f7108f;
    }
}
