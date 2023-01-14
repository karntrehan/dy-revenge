package p174e.p247e.p253d.p255b;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.e.d.b.e */
public abstract class C6040e<T> implements Runnable {

    /* renamed from: f */
    protected final AtomicInteger f16692f = new AtomicInteger(0);

    /* renamed from: a */
    public void mo18036a() {
        if (this.f16692f.compareAndSet(0, 2)) {
            mo8267d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8202b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo8203c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo8267d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo8268e(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo8269f(T t);

    public final void run() {
        if (this.f16692f.compareAndSet(0, 1)) {
            try {
                Object c = mo8203c();
                this.f16692f.set(3);
                try {
                    mo8269f(c);
                } finally {
                    mo8202b(c);
                }
            } catch (Exception e) {
                this.f16692f.set(4);
                mo8268e(e);
            }
        }
    }
}
