package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p174e.p247e.p253d.p257d.C6062k;

@TargetApi(27)
/* renamed from: com.facebook.imagepipeline.memory.a */
public class C2391a implements C2428u, Closeable {

    /* renamed from: f */
    private SharedMemory f7111f;

    /* renamed from: o */
    private ByteBuffer f7112o;

    /* renamed from: p */
    private final long f7113p;

    public C2391a(int i) {
        C6062k.m22834b(Boolean.valueOf(i > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.f7111f = create;
            this.f7112o = create.mapReadWrite();
            this.f7113p = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    /* renamed from: A */
    private void m9914A(int i, C2428u uVar, int i2, int i3) {
        if (uVar instanceof C2391a) {
            C6062k.m22841i(!isClosed());
            C6062k.m22841i(!uVar.isClosed());
            C2430w.m10111b(i, uVar.mo8054h(), i2, i3, mo8054h());
            this.f7112o.position(i);
            uVar.mo8053g().position(i2);
            byte[] bArr = new byte[i3];
            this.f7112o.get(bArr, 0, i3);
            uVar.mo8053g().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    /* renamed from: a */
    public long mo8049a() {
        return this.f7113p;
    }

    /* renamed from: b */
    public void mo8050b(int i, C2428u uVar, int i2, int i3) {
        C6062k.m22839g(uVar);
        if (uVar.mo8049a() == mo8049a()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(mo8049a()) + " to AshmemMemoryChunk " + Long.toHexString(uVar.mo8049a()) + " which are the same ");
            C6062k.m22834b(Boolean.FALSE);
        }
        if (uVar.mo8049a() < mo8049a()) {
            synchronized (uVar) {
                synchronized (this) {
                    m9914A(i, uVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (uVar) {
                m9914A(i, uVar, i2, i3);
            }
        }
    }

    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.f7112o);
            this.f7111f.close();
            this.f7112o = null;
            this.f7111f = null;
        }
    }

    /* renamed from: g */
    public ByteBuffer mo8053g() {
        return this.f7112o;
    }

    /* renamed from: h */
    public int mo8054h() {
        C6062k.m22841i(!isClosed());
        return this.f7111f.getSize();
    }

    public synchronized boolean isClosed() {
        return this.f7112o == null || this.f7111f == null;
    }

    /* renamed from: j */
    public synchronized byte mo8056j(int i) {
        boolean z = true;
        C6062k.m22841i(!isClosed());
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= mo8054h()) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        return this.f7112o.get(i);
    }

    /* renamed from: k */
    public synchronized int mo8057k(int i, byte[] bArr, int i2, int i3) {
        int a;
        C6062k.m22839g(bArr);
        C6062k.m22841i(!isClosed());
        a = C2430w.m10110a(i, i3, mo8054h());
        C2430w.m10111b(i, bArr.length, i2, a, mo8054h());
        this.f7112o.position(i);
        this.f7112o.get(bArr, i2, a);
        return a;
    }

    /* renamed from: o */
    public synchronized int mo8058o(int i, byte[] bArr, int i2, int i3) {
        int a;
        C6062k.m22839g(bArr);
        C6062k.m22841i(!isClosed());
        a = C2430w.m10110a(i, i3, mo8054h());
        C2430w.m10111b(i, bArr.length, i2, a, mo8054h());
        this.f7112o.position(i);
        this.f7112o.put(bArr, i2, a);
        return a;
    }

    /* renamed from: r */
    public long mo8059r() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }
}
