package androidx.camera.core.p009e3;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0949o2;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.p014a3.C0731h;
import androidx.camera.core.p009e3.p010p.C0664a;
import androidx.core.util.C1177h;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: androidx.camera.core.e3.o */
public class C0662o implements C0795d1 {

    /* renamed from: a */
    private static final Rect f2119a = new Rect(0, 0, 0, 0);

    /* renamed from: b */
    private int f2120b;

    /* renamed from: c */
    private final int f2121c;

    /* renamed from: d */
    private final Object f2122d = new Object();

    /* renamed from: e */
    private boolean f2123e = false;

    /* renamed from: f */
    private int f2124f = 0;

    /* renamed from: g */
    private ImageWriter f2125g;

    /* renamed from: h */
    private Rect f2126h = f2119a;

    /* renamed from: androidx.camera.core.e3.o$a */
    private static final class C0663a extends OutputStream {

        /* renamed from: f */
        private final ByteBuffer f2127f;

        C0663a(ByteBuffer byteBuffer) {
            this.f2127f = byteBuffer;
        }

        public void write(int i) {
            if (this.f2127f.hasRemaining()) {
                this.f2127f.put((byte) i);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        public void write(byte[] bArr, int i, int i2) {
            int i3;
            Objects.requireNonNull(bArr);
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                if (this.f2127f.remaining() >= i2) {
                    this.f2127f.put(bArr, i, i2);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }

    public C0662o(int i, int i2) {
        this.f2120b = i;
        this.f2121c = i2;
    }

    /* renamed from: e */
    private static C0731h m2779e(ImageProxy imageProxy) {
        C0731h.C0733b a = C0731h.m3016a();
        imageProxy.mo2537U().mo2694d(a);
        return a.mo2858j(imageProxy.mo2541e()).mo2857i(imageProxy.mo2539c()).mo2852a();
    }

    /* renamed from: a */
    public void mo2708a(Surface surface, int i) {
        C1177h.m4586h(i == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f2122d) {
            if (this.f2123e) {
                C0949o2.m3698k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f2125g == null) {
                this.f2125g = C0664a.m2788d(surface, this.f2121c, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    /* renamed from: b */
    public void mo2709b(Size size) {
        synchronized (this.f2122d) {
            this.f2126h = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: c */
    public void mo2710c(androidx.camera.core.impl.C0885t1 r18) {
        /*
            r17 = this;
            r1 = r17
            java.util.List r0 = r18.mo3083b()
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Processing image bundle have single capture id, but found "
            r5.append(r6)
            int r6 = r0.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            androidx.core.util.C1177h.m4580b(r2, r5)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = r18
            e.f.b.a.a.b r0 = r2.mo3082a(r0)
            boolean r2 = r0.isDone()
            androidx.core.util.C1177h.m4579a(r2)
            java.lang.Object r2 = r1.f2122d
            monitor-enter(r2)
            android.media.ImageWriter r5 = r1.f2125g     // Catch:{ all -> 0x01ab }
            boolean r6 = r1.f2123e     // Catch:{ all -> 0x01ab }
            if (r6 != 0) goto L_0x004b
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            android.graphics.Rect r7 = r1.f2126h     // Catch:{ all -> 0x01ab }
            if (r6 == 0) goto L_0x0055
            int r8 = r1.f2124f     // Catch:{ all -> 0x01ab }
            int r8 = r8 + r4
            r1.f2124f = r8     // Catch:{ all -> 0x01ab }
        L_0x0055:
            monitor-exit(r2)     // Catch:{ all -> 0x01ab }
            r2 = 0
            java.lang.Object r8 = r0.get()     // Catch:{ Exception -> 0x012d, all -> 0x012a }
            androidx.camera.core.ImageProxy r8 = (androidx.camera.core.ImageProxy) r8     // Catch:{ Exception -> 0x012d, all -> 0x012a }
            if (r6 != 0) goto L_0x008e
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r7 = "Image enqueued for processing on closed processor."
            androidx.camera.core.C0949o2.m3698k(r0, r7)     // Catch:{ Exception -> 0x0126, all -> 0x0122 }
            r8.close()     // Catch:{ Exception -> 0x0126, all -> 0x0122 }
            java.lang.Object r7 = r1.f2122d
            monitor-enter(r7)
            if (r6 == 0) goto L_0x007e
            int r0 = r1.f2124f     // Catch:{ all -> 0x007c }
            int r2 = r0 + -1
            r1.f2124f = r2     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r1.f2123e     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x007e
            r3 = 1
            goto L_0x007e
        L_0x007c:
            r0 = move-exception
            goto L_0x008c
        L_0x007e:
            monitor-exit(r7)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x008b
            r5.close()
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            androidx.camera.core.C0949o2.m3688a(r0, r2)
        L_0x008b:
            return
        L_0x008c:
            monitor-exit(r7)     // Catch:{ all -> 0x007c }
            throw r0
        L_0x008e:
            android.media.Image r9 = r5.dequeueInputImage()     // Catch:{ Exception -> 0x0126, all -> 0x0122 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0120, all -> 0x011e }
            r10 = r0
            androidx.camera.core.ImageProxy r10 = (androidx.camera.core.ImageProxy) r10     // Catch:{ Exception -> 0x0120, all -> 0x011e }
            int r0 = r10.mo2543q0()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r8 = 35
            if (r0 != r8) goto L_0x00a3
            r0 = 1
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            java.lang.String r8 = "Input image is not expected YUV_420_888 image format"
            androidx.core.util.C1177h.m4586h(r0, r8)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            byte[] r12 = androidx.camera.core.p009e3.p013q.C0677a.m2818j(r10)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r13 = 17
            int r14 = r10.mo2541e()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            int r15 = r10.mo2539c()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            android.media.Image$Plane[] r8 = r9.getPlanes()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r8 = r8[r3]     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            java.nio.ByteBuffer r8 = r8.getBuffer()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            int r11 = r8.position()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            androidx.camera.core.impl.a3.i r12 = new androidx.camera.core.impl.a3.i     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            androidx.camera.core.e3.o$a r13 = new androidx.camera.core.e3.o$a     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r13.<init>(r8)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            androidx.camera.core.impl.a3.h r14 = m2779e(r10)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r12.<init>(r13, r14)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            int r13 = r1.f2120b     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r0.compressToJpeg(r7, r13, r12)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r10.close()     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            int r0 = r8.position()     // Catch:{ Exception -> 0x0116 }
            r8.limit(r0)     // Catch:{ Exception -> 0x0116 }
            r8.position(r11)     // Catch:{ Exception -> 0x0116 }
            r5.queueInputImage(r9)     // Catch:{ Exception -> 0x0116 }
            java.lang.Object r7 = r1.f2122d
            monitor-enter(r7)
            if (r6 == 0) goto L_0x0105
            int r0 = r1.f2124f     // Catch:{ all -> 0x0103 }
            int r2 = r0 + -1
            r1.f2124f = r2     // Catch:{ all -> 0x0103 }
            if (r0 != 0) goto L_0x0105
            boolean r0 = r1.f2123e     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x0105
            r3 = 1
            goto L_0x0105
        L_0x0103:
            r0 = move-exception
            goto L_0x0114
        L_0x0105:
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x01a8
        L_0x0108:
            r5.close()
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            androidx.camera.core.C0949o2.m3688a(r0, r2)
            goto L_0x01a8
        L_0x0114:
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            throw r0
        L_0x0116:
            r0 = move-exception
            goto L_0x012f
        L_0x0118:
            r0 = move-exception
            r2 = r10
            goto L_0x0155
        L_0x011b:
            r0 = move-exception
            r2 = r10
            goto L_0x012f
        L_0x011e:
            r0 = move-exception
            goto L_0x0124
        L_0x0120:
            r0 = move-exception
            goto L_0x0128
        L_0x0122:
            r0 = move-exception
            r9 = r2
        L_0x0124:
            r2 = r8
            goto L_0x0155
        L_0x0126:
            r0 = move-exception
            r9 = r2
        L_0x0128:
            r2 = r8
            goto L_0x012f
        L_0x012a:
            r0 = move-exception
            r9 = r2
            goto L_0x0155
        L_0x012d:
            r0 = move-exception
            r9 = r2
        L_0x012f:
            if (r6 == 0) goto L_0x0184
            java.lang.String r7 = "YuvToJpegProcessor"
            java.lang.String r8 = "Failed to process YUV -> JPEG"
            androidx.camera.core.C0949o2.m3691d(r7, r8, r0)     // Catch:{ all -> 0x0154 }
            android.media.Image r7 = r5.dequeueInputImage()     // Catch:{ all -> 0x0154 }
            android.media.Image$Plane[] r0 = r7.getPlanes()     // Catch:{ all -> 0x0151 }
            r0 = r0[r3]     // Catch:{ all -> 0x0151 }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x0151 }
            r0.rewind()     // Catch:{ all -> 0x0151 }
            r0.limit(r3)     // Catch:{ all -> 0x0151 }
            r5.queueInputImage(r7)     // Catch:{ all -> 0x0151 }
            r9 = r7
            goto L_0x0184
        L_0x0151:
            r0 = move-exception
            r9 = r7
            goto L_0x0155
        L_0x0154:
            r0 = move-exception
        L_0x0155:
            java.lang.Object r7 = r1.f2122d
            monitor-enter(r7)
            if (r6 == 0) goto L_0x016a
            int r6 = r1.f2124f     // Catch:{ all -> 0x0168 }
            int r8 = r6 + -1
            r1.f2124f = r8     // Catch:{ all -> 0x0168 }
            if (r6 != 0) goto L_0x016a
            boolean r6 = r1.f2123e     // Catch:{ all -> 0x0168 }
            if (r6 == 0) goto L_0x016a
            r3 = 1
            goto L_0x016a
        L_0x0168:
            r0 = move-exception
            goto L_0x0182
        L_0x016a:
            monitor-exit(r7)     // Catch:{ all -> 0x0168 }
            if (r9 == 0) goto L_0x0170
            r9.close()
        L_0x0170:
            if (r2 == 0) goto L_0x0175
            r2.close()
        L_0x0175:
            if (r3 == 0) goto L_0x0181
            r5.close()
            java.lang.String r2 = "YuvToJpegProcessor"
            java.lang.String r3 = "Closed after completion of last image processed."
            androidx.camera.core.C0949o2.m3688a(r2, r3)
        L_0x0181:
            throw r0
        L_0x0182:
            monitor-exit(r7)     // Catch:{ all -> 0x0168 }
            throw r0
        L_0x0184:
            java.lang.Object r7 = r1.f2122d
            monitor-enter(r7)
            if (r6 == 0) goto L_0x0199
            int r0 = r1.f2124f     // Catch:{ all -> 0x0197 }
            int r6 = r0 + -1
            r1.f2124f = r6     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0199
            boolean r0 = r1.f2123e     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0199
            r3 = 1
            goto L_0x0199
        L_0x0197:
            r0 = move-exception
            goto L_0x01a9
        L_0x0199:
            monitor-exit(r7)     // Catch:{ all -> 0x0197 }
            if (r9 == 0) goto L_0x019f
            r9.close()
        L_0x019f:
            if (r2 == 0) goto L_0x01a4
            r2.close()
        L_0x01a4:
            if (r3 == 0) goto L_0x01a8
            goto L_0x0108
        L_0x01a8:
            return
        L_0x01a9:
            monitor-exit(r7)     // Catch:{ all -> 0x0197 }
            throw r0
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ab }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p009e3.C0662o.mo2710c(androidx.camera.core.impl.t1):void");
    }

    /* renamed from: d */
    public void mo2711d() {
        synchronized (this.f2122d) {
            if (!this.f2123e) {
                this.f2123e = true;
                if (this.f2124f != 0 || this.f2125g == null) {
                    C0949o2.m3688a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                } else {
                    C0949o2.m3688a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.f2125g.close();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo2712f(int i) {
        this.f2120b = i;
    }
}
