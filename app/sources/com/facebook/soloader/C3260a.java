package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.C3270f;
import com.facebook.soloader.C3284n;
import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
public class C3260a extends C3270f {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f9252i;

    /* renamed from: com.facebook.soloader.a$a */
    protected class C3261a extends C3270f.C3273c {

        /* renamed from: r */
        private File f9253r;

        /* renamed from: s */
        private final int f9254s;

        C3261a(C3270f fVar) {
            super(fVar);
            this.f9253r = new File(C3260a.this.f9286c.getApplicationInfo().nativeLibraryDir);
            this.f9254s = C3260a.this.f9252i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public boolean mo10725A(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = false;
            if (str.equals(C3260a.this.f9287d)) {
                C3260a.this.f9287d = null;
                str2 = String.format("allowing consideration of corrupted lib %s", new Object[]{str});
            } else if ((this.f9254s & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.f9253r, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    } else {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        Log.d("ApkSoSource", str2);
                        return z;
                    }
                }
            }
            z = true;
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public C3260a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f9252i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public byte[] mo10723k() {
        File canonicalFile = this.f9266g.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.m12800g(this.f9286c));
            if ((this.f9252i & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f9286c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C3284n.C3290f mo10724n() {
        return new C3261a(this);
    }
}
