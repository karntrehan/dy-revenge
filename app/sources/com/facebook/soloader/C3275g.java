package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.g */
public final class C3275g implements Closeable {

    /* renamed from: f */
    private final FileOutputStream f9276f;

    /* renamed from: o */
    private final FileLock f9277o;

    private C3275g(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f9276f = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f9277o = lock;
        } catch (Throwable th) {
            this.f9276f.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static C3275g m12834a(File file) {
        return new C3275g(file);
    }

    public void close() {
        try {
            FileLock fileLock = this.f9277o;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f9276f.close();
        }
    }
}
