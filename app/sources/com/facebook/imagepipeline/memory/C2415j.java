package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.memory.j */
public class C2415j implements C2428u, Closeable {

    /* renamed from: f */
    private ByteBuffer f7191f;

    /* renamed from: o */
    private final int f7192o;

    /* renamed from: p */
    private final long f7193p = ((long) System.identityHashCode(this));

    public C2415j(int i) {
        this.f7191f = ByteBuffer.allocateDirect(i);
        this.f7192o = i;
    }

    /* renamed from: A */
    private void m10047A(int i, C2428u uVar, int i2, int i3) {
        if (uVar instanceof C2415j) {
            C6062k.m22841i(!isClosed());
            C6062k.m22841i(!uVar.isClosed());
            C2430w.m10111b(i, uVar.mo8054h(), i2, i3, this.f7192o);
            this.f7191f.position(i);
            uVar.mo8053g().position(i2);
            byte[] bArr = new byte[i3];
            this.f7191f.get(bArr, 0, i3);
            uVar.mo8053g().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    /* renamed from: a */
    public long mo8049a() {
        return this.f7193p;
    }

    /* renamed from: b */
    public void mo8050b(int i, C2428u uVar, int i2, int i3) {
        C6062k.m22839g(uVar);
        if (uVar.mo8049a() == mo8049a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(mo8049a()) + " to BufferMemoryChunk " + Long.toHexString(uVar.mo8049a()) + " which are the same ");
            C6062k.m22834b(Boolean.FALSE);
        }
        if (uVar.mo8049a() < mo8049a()) {
            synchronized (uVar) {
                synchronized (this) {
                    m10047A(i, uVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (uVar) {
                m10047A(i, uVar, i2, i3);
            }
        }
    }

    public synchronized void close() {
        this.f7191f = null;
    }

    /* renamed from: g */
    public synchronized ByteBuffer mo8053g() {
        return this.f7191f;
    }

    /* renamed from: h */
    public int mo8054h() {
        return this.f7192o;
    }

    public synchronized boolean isClosed() {
        return this.f7191f == null;
    }

    /* renamed from: j */
    public synchronized byte mo8056j(int i) {
        boolean z = true;
        C6062k.m22841i(!isClosed());
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= this.f7192o) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        return this.f7191f.get(i);
    }

    /* renamed from: k */
    public synchronized int mo8057k(int i, byte[] bArr, int i2, int i3) {
        int a;
        C6062k.m22839g(bArr);
        C6062k.m22841i(!isClosed());
        a = C2430w.m10110a(i, i3, this.f7192o);
        C2430w.m10111b(i, bArr.length, i2, a, this.f7192o);
        this.f7191f.position(i);
        this.f7191f.get(bArr, i2, a);
        return a;
    }

    /* renamed from: o */
    public synchronized int mo8058o(int i, byte[] bArr, int i2, int i3) {
        int a;
        C6062k.m22839g(bArr);
        C6062k.m22841i(!isClosed());
        a = C2430w.m10110a(i, i3, this.f7192o);
        C2430w.m10111b(i, bArr.length, i2, a, this.f7192o);
        this.f7191f.position(i);
        this.f7191f.put(bArr, i2, a);
        return a;
    }

    /* renamed from: r */
    public long mo8059r() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }
}
