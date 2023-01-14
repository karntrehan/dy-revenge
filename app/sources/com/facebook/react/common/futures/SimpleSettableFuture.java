package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: f */
    private final CountDownLatch f7785f = new CountDownLatch(1);

    /* renamed from: o */
    private T f7786o;

    /* renamed from: p */
    private Exception f7787p;

    /* renamed from: a */
    private void m10923a() {
        if (this.f7785f.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    /* renamed from: b */
    public T mo8817b() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void mo8818c(T t) {
        m10923a();
        this.f7786o = t;
        this.f7785f.countDown();
    }

    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo8820d(Exception exc) {
        m10923a();
        this.f7787p = exc;
        this.f7785f.countDown();
    }

    public T get() {
        this.f7785f.await();
        if (this.f7787p == null) {
            return this.f7786o;
        }
        throw new ExecutionException(this.f7787p);
    }

    public T get(long j, TimeUnit timeUnit) {
        if (!this.f7785f.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        } else if (this.f7787p == null) {
            return this.f7786o;
        } else {
            throw new ExecutionException(this.f7787p);
        }
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.f7785f.getCount() == 0;
    }
}
