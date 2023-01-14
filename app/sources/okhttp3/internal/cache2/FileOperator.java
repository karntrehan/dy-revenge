package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;

public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel2) {
        C10457l.m35320e(fileChannel2, "fileChannel");
        this.fileChannel = fileChannel2;
    }

    public final void read(long j, C10603f fVar, long j2) {
        C10457l.m35320e(fVar, "sink");
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, fVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, C10603f fVar, long j2) {
        C10457l.m35320e(fVar, "source");
        if (j2 < 0 || j2 > fVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(fVar, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
