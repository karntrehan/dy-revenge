package okhttp3.internal.p509io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10590b0;
import p493i.C10598d0;
import p493i.C10625q;

/* renamed from: okhttp3.internal.io.FileSystem */
public interface FileSystem {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* renamed from: okhttp3.internal.io.FileSystem$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* renamed from: okhttp3.internal.io.FileSystem$Companion$SystemFileSystem */
        private static final class SystemFileSystem implements FileSystem {
            public C10590b0 appendingSink(File file) {
                C10457l.m35320e(file, "file");
                try {
                    return C10625q.m36153a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C10625q.m36153a(file);
                }
            }

            public void delete(File file) {
                C10457l.m35320e(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public void deleteContents(File file) {
                C10457l.m35320e(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        C10457l.m35319d(file2, "file");
                        if (file2.isDirectory()) {
                            deleteContents(file2);
                        }
                        if (file2.delete()) {
                            i++;
                        } else {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            public boolean exists(File file) {
                C10457l.m35320e(file, "file");
                return file.exists();
            }

            public void rename(File file, File file2) {
                C10457l.m35320e(file, "from");
                C10457l.m35320e(file2, "to");
                delete(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            public C10590b0 sink(File file) {
                C10457l.m35320e(file, "file");
                try {
                    return C10626r.m36171g(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C10626r.m36171g(file, false, 1, (Object) null);
                }
            }

            public long size(File file) {
                C10457l.m35320e(file, "file");
                return file.length();
            }

            public C10598d0 source(File file) {
                C10457l.m35320e(file, "file");
                return C10625q.m36162j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    C10590b0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    C10590b0 sink(File file);

    long size(File file);

    C10598d0 source(File file);
}
