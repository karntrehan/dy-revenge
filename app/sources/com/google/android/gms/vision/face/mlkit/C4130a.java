package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C3675i;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p357l.C8125ah;
import p174e.p319f.p320a.p335c.p345f.p357l.C8138bb;
import p174e.p319f.p320a.p335c.p345f.p357l.C8146c0;
import p174e.p319f.p320a.p335c.p345f.p357l.C8176db;
import p174e.p319f.p320a.p335c.p345f.p357l.C8184e0;
import p174e.p319f.p320a.p335c.p345f.p357l.C8221g;
import p174e.p319f.p320a.p335c.p345f.p357l.C8259i;
import p174e.p319f.p320a.p335c.p345f.p357l.C8278j;
import p174e.p319f.p320a.p335c.p345f.p357l.C8334m;
import p174e.p319f.p320a.p335c.p345f.p357l.C8363na;
import p174e.p319f.p320a.p335c.p345f.p357l.C8507va;
import p174e.p319f.p320a.p335c.p345f.p357l.C8579za;

/* renamed from: com.google.android.gms.vision.face.mlkit.a */
final class C4130a extends C8176db {

    /* renamed from: a */
    private static final C3675i f11476a = new C3675i("FaceDetector", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b */
    private final Context f11477b;

    /* renamed from: c */
    private final C8579za f11478c;

    /* renamed from: d */
    private final C8184e0 f11479d;

    /* renamed from: e */
    private final FaceDetectorV2Jni f11480e;

    /* renamed from: f */
    private final C4131b f11481f;

    /* renamed from: g */
    private final C8363na f11482g;

    /* renamed from: h */
    private long f11483h = -1;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C4130a(android.content.Context r8, p174e.p319f.p320a.p335c.p345f.p357l.C8579za r9, com.google.android.gms.vision.face.FaceDetectorV2Jni r10, com.google.android.gms.vision.face.mlkit.C4131b r11) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f11483h = r0
            r7.f11477b = r8
            r7.f11478c = r9
            int r0 = r9.mo22289r()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            e.f.a.c.f.l.p0 r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8407q0.m28937w()
            java.lang.String r5 = "models"
            r4.mo22061m(r5)
            e.f.a.c.f.l.ed r4 = r4.mo22294j()
            e.f.a.c.f.l.q0 r4 = (p174e.p319f.p320a.p335c.p345f.p357l.C8407q0) r4
            e.f.a.c.f.l.d0 r5 = p174e.p319f.p320a.p335c.p345f.p357l.C8184e0.m28446x()
            e.f.a.c.f.l.f0 r6 = p174e.p319f.p320a.p335c.p345f.p357l.C8222g0.m28522w()
            r6.mo21780p(r4)
            r6.mo21779m(r4)
            r6.mo21781q(r4)
            r5.mo21742v(r6)
            e.f.a.c.f.l.o r6 = p174e.p319f.p320a.p335c.p345f.p357l.C8388p.m28917w()
            r6.mo22038m(r4)
            r6.mo22039p(r4)
            r5.mo21739m(r6)
            e.f.a.c.f.l.k0 r6 = p174e.p319f.p320a.p335c.p345f.p357l.C8317l0.m28726w()
            r6.mo21912p(r4)
            r6.mo21913q(r4)
            r6.mo21914v(r4)
            r6.mo21911m(r4)
            r5.mo21744x(r6)
            r5.mo21737B(r0)
            if (r0 != 0) goto L_0x0066
            boolean r4 = r9.mo22286G()
            if (r4 == 0) goto L_0x0066
            r1 = 1
        L_0x0066:
            r5.mo21741q(r1)
            float r1 = r9.mo22287o()
            r5.mo21745y(r1)
            r5.mo21738C(r3)
            if (r0 == 0) goto L_0x0080
            e.f.a.c.f.l.o0 r9 = p174e.p319f.p320a.p335c.p345f.p357l.C8371o0.SELFIE
            r5.mo21746z(r9)
            e.f.a.c.f.l.j0 r9 = p174e.p319f.p320a.p335c.p345f.p357l.C8279j0.CONTOUR_LANDMARKS
            r5.mo21743w(r9)
            goto L_0x00b3
        L_0x0080:
            int r0 = r9.mo22285E()
            if (r0 == r3) goto L_0x008c
            if (r0 == r2) goto L_0x0089
            goto L_0x0091
        L_0x0089:
            e.f.a.c.f.l.o0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8371o0.ACCURATE
            goto L_0x008e
        L_0x008c:
            e.f.a.c.f.l.o0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8371o0.FAST
        L_0x008e:
            r5.mo21746z(r0)
        L_0x0091:
            int r0 = r9.mo22284C()
            if (r0 == r3) goto L_0x009d
            if (r0 == r2) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            e.f.a.c.f.l.j0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8279j0.ALL_LANDMARKS
            goto L_0x009f
        L_0x009d:
            e.f.a.c.f.l.j0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8279j0.NO_LANDMARK
        L_0x009f:
            r5.mo21743w(r0)
        L_0x00a2:
            int r9 = r9.mo22288p()
            if (r9 == r3) goto L_0x00ae
            if (r9 == r2) goto L_0x00ab
            goto L_0x00b3
        L_0x00ab:
            e.f.a.c.f.l.s r9 = p174e.p319f.p320a.p335c.p345f.p357l.C8442s.ALL_CLASSIFICATIONS
            goto L_0x00b0
        L_0x00ae:
            e.f.a.c.f.l.s r9 = p174e.p319f.p320a.p335c.p345f.p357l.C8442s.NO_CLASSIFICATION
        L_0x00b0:
            r5.mo21740p(r9)
        L_0x00b3:
            e.f.a.c.f.l.ed r9 = r5.mo22294j()
            e.f.a.c.f.l.e0 r9 = (p174e.p319f.p320a.p335c.p345f.p357l.C8184e0) r9
            r7.f11479d = r9
            r7.f11480e = r10
            r7.f11481f = r11
            e.f.a.c.f.l.na r9 = p174e.p319f.p320a.p335c.p345f.p357l.C8363na.m28872a(r8)
            r7.f11482g = r9
            p174e.p319f.p320a.p335c.p345f.p357l.C8126b.m28324e(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.mlkit.C4130a.<init>(android.content.Context, e.f.a.c.f.l.za, com.google.android.gms.vision.face.FaceDetectorV2Jni, com.google.android.gms.vision.face.mlkit.b):void");
    }

    /* renamed from: P0 */
    private final List<C8138bb> m15491P0(ByteBuffer byteBuffer, C8507va vaVar, C8221g gVar) {
        C8146c0 c0Var;
        C8259i w = C8278j.m28604w();
        w.mo21848w(vaVar.mo22198C());
        w.mo21845p(vaVar.mo22200o());
        w.mo21846q(m15494m(vaVar.mo22202r()));
        w.mo21844m(gVar);
        if (vaVar.mo22199E() > 0) {
            w.mo21847v(vaVar.mo22199E() * 1000);
        }
        C8278j jVar = (C8278j) w.mo22294j();
        if (byteBuffer.isDirect()) {
            c0Var = this.f11480e.mo12559d(this.f11483h, byteBuffer, jVar);
        } else if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            c0Var = this.f11480e.mo12557b(this.f11483h, bArr, jVar);
        } else {
            c0Var = this.f11480e.mo12557b(this.f11483h, byteBuffer.array(), jVar);
        }
        return c0Var != null ? m15492Y(c0Var) : new ArrayList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<p174e.p319f.p320a.p335c.p345f.p357l.C8138bb> m15492Y(p174e.p319f.p320a.p335c.p345f.p357l.C8146c0 r27) {
        /*
            r26 = this;
            r0 = r26
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            e.f.a.c.f.l.zg r2 = r27.mo21703y()
            java.util.List r2 = r2.mo22298y()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x025b
            java.lang.Object r3 = r2.next()
            e.f.a.c.f.l.wg r3 = (p174e.p319f.p320a.p335c.p345f.p357l.C8531wg) r3
            e.f.a.c.f.l.e0 r4 = r0.f11479d
            e.f.a.c.f.l.s r4 = r4.mo21756w()
            e.f.a.c.f.l.s r5 = p174e.p319f.p320a.p335c.p345f.p357l.C8442s.ALL_CLASSIFICATIONS
            r7 = 2
            r8 = -1
            r9 = 1
            if (r4 != r5) goto L_0x00a0
            java.util.List r4 = r3.mo22250J()
            java.util.Iterator r4 = r4.iterator()
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003a:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0099
            java.lang.Object r13 = r4.next()
            e.f.a.c.f.l.hg r13 = (p174e.p319f.p320a.p335c.p345f.p357l.C8257hg) r13
            java.lang.String r14 = r13.mo21843y()
            int r15 = r14.hashCode()
            r6 = -1940789646(0xffffffff8c51e672, float:-1.6170121E-31)
            if (r15 == r6) goto L_0x0072
            r6 = -1837755075(0xffffffff9276153d, float:-7.765009E-28)
            if (r15 == r6) goto L_0x0068
            r6 = 105428(0x19bd4, float:1.47736E-40)
            if (r15 == r6) goto L_0x005e
            goto L_0x007c
        L_0x005e:
            java.lang.String r6 = "joy"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007d
        L_0x0068:
            java.lang.String r6 = "right_eye_closed"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x007c
            r6 = 2
            goto L_0x007d
        L_0x0072:
            java.lang.String r6 = "left_eye_closed"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x007c
            r6 = 1
            goto L_0x007d
        L_0x007c:
            r6 = -1
        L_0x007d:
            if (r6 == 0) goto L_0x0094
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r6 == r9) goto L_0x008d
            if (r6 == r7) goto L_0x0086
            goto L_0x003a
        L_0x0086:
            float r5 = r13.mo21842w()
            float r5 = r14 - r5
            goto L_0x003a
        L_0x008d:
            float r6 = r13.mo21842w()
            float r12 = r14 - r6
            goto L_0x003a
        L_0x0094:
            float r11 = r13.mo21842w()
            goto L_0x003a
        L_0x0099:
            r20 = r5
            r21 = r11
            r19 = r12
            goto L_0x00a6
        L_0x00a0:
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00a6:
            e.f.a.c.f.l.e0 r4 = r0.f11479d
            e.f.a.c.f.l.j0 r4 = r4.mo21757z()
            e.f.a.c.f.l.j0 r5 = p174e.p319f.p320a.p335c.p345f.p357l.C8279j0.ALL_LANDMARKS
            java.lang.String r6 = "FaceDetector"
            r13 = 3
            r14 = 11
            r15 = 5
            r16 = 6
            r17 = 10
            r18 = 4
            r7 = 7
            if (r4 != r5) goto L_0x0151
            java.util.List r4 = r3.mo22251y()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ca:
            boolean r23 = r4.hasNext()
            if (r23 == 0) goto L_0x014e
            java.lang.Object r23 = r4.next()
            e.f.a.c.f.l.vg r23 = (p174e.p319f.p320a.p335c.p345f.p357l.C8513vg) r23
            e.f.a.c.f.l.rg r24 = r23.mo22219y()
            e.f.a.c.f.l.y r25 = p174e.p319f.p320a.p335c.p345f.p357l.C8550y.CONTOUR_UNKNOWN
            e.f.a.c.f.l.rg r25 = p174e.p319f.p320a.p335c.p345f.p357l.C8441rg.LEFT_EYE
            int r10 = r24.ordinal()
            if (r10 == 0) goto L_0x0132
            if (r10 == r9) goto L_0x012f
            if (r10 == r7) goto L_0x012d
            r7 = 26
            if (r10 == r7) goto L_0x012b
            r7 = 27
            if (r10 == r7) goto L_0x0128
            switch(r10) {
                case 9: goto L_0x0126;
                case 10: goto L_0x0124;
                case 11: goto L_0x0121;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            switch(r10) {
                case 34: goto L_0x011f;
                case 35: goto L_0x011d;
                case 36: goto L_0x011b;
                case 37: goto L_0x0118;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            com.google.android.gms.common.internal.i r7 = f11476a
            java.lang.String r10 = java.lang.String.valueOf(r24)
            int r24 = r10.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r11 = r24 + 23
            r9.<init>(r11)
            java.lang.String r11 = "Unknown landmark type: "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r7.mo11609b(r6, r9)
            r7 = -1
            goto L_0x0133
        L_0x0118:
            r7 = 8
            goto L_0x0133
        L_0x011b:
            r7 = 2
            goto L_0x0133
        L_0x011d:
            r7 = 7
            goto L_0x0133
        L_0x011f:
            r7 = 1
            goto L_0x0133
        L_0x0121:
            r7 = 11
            goto L_0x0133
        L_0x0124:
            r7 = 5
            goto L_0x0133
        L_0x0126:
            r7 = 0
            goto L_0x0133
        L_0x0128:
            r7 = 9
            goto L_0x0133
        L_0x012b:
            r7 = 3
            goto L_0x0133
        L_0x012d:
            r7 = 6
            goto L_0x0133
        L_0x012f:
            r7 = 10
            goto L_0x0133
        L_0x0132:
            r7 = 4
        L_0x0133:
            if (r7 < 0) goto L_0x014a
            e.f.a.c.f.l.ib r9 = new e.f.a.c.f.l.ib
            android.graphics.PointF r10 = new android.graphics.PointF
            float r11 = r23.mo22217w()
            float r12 = r23.mo22218x()
            r10.<init>(r11, r12)
            r9.<init>(r7, r10)
            r5.add(r9)
        L_0x014a:
            r7 = 7
            r9 = 1
            goto L_0x00ca
        L_0x014e:
            r23 = r5
            goto L_0x0158
        L_0x0151:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r23 = r4
        L_0x0158:
            e.f.a.c.f.l.e0 r4 = r0.f11479d
            e.f.a.c.f.l.j0 r4 = r4.mo21757z()
            e.f.a.c.f.l.j0 r5 = p174e.p319f.p320a.p335c.p345f.p357l.C8279j0.CONTOUR_LANDMARKS
            if (r4 != r5) goto L_0x020c
            e.f.a.c.f.l.dd<e.f.a.c.f.l.wg, java.util.List<e.f.a.c.f.l.z>> r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8425r0.f22967a
            java.lang.Object r4 = r3.mo21699x(r4)
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0173:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0209
            java.lang.Object r7 = r4.next()
            e.f.a.c.f.l.z r7 = (p174e.p319f.p320a.p335c.p345f.p357l.C8568z) r7
            e.f.a.c.f.l.y r9 = r7.mo22280w()
            e.f.a.c.f.l.y r10 = p174e.p319f.p320a.p335c.p345f.p357l.C8550y.CONTOUR_UNKNOWN
            e.f.a.c.f.l.rg r10 = p174e.p319f.p320a.p335c.p345f.p357l.C8441rg.LEFT_EYE
            int r10 = r9.ordinal()
            switch(r10) {
                case 1: goto L_0x01d0;
                case 2: goto L_0x01ce;
                case 3: goto L_0x01cc;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01c8;
                case 6: goto L_0x01c6;
                case 7: goto L_0x01c4;
                case 8: goto L_0x01c1;
                case 9: goto L_0x01be;
                case 10: goto L_0x01bb;
                case 11: goto L_0x01b8;
                case 12: goto L_0x01b5;
                case 13: goto L_0x01b2;
                case 14: goto L_0x01af;
                case 15: goto L_0x01ac;
                default: goto L_0x018e;
            }
        L_0x018e:
            com.google.android.gms.common.internal.i r10 = f11476a
            int r9 = r9.zza()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r12 = 33
            r11.<init>(r12)
            java.lang.String r12 = "Unknown contour type: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.mo11609b(r6, r9)
            r9 = -1
            goto L_0x01d1
        L_0x01ac:
            r9 = 15
            goto L_0x01d1
        L_0x01af:
            r9 = 14
            goto L_0x01d1
        L_0x01b2:
            r9 = 13
            goto L_0x01d1
        L_0x01b5:
            r9 = 12
            goto L_0x01d1
        L_0x01b8:
            r9 = 11
            goto L_0x01d1
        L_0x01bb:
            r9 = 10
            goto L_0x01d1
        L_0x01be:
            r9 = 9
            goto L_0x01d1
        L_0x01c1:
            r9 = 8
            goto L_0x01d1
        L_0x01c4:
            r9 = 7
            goto L_0x01d1
        L_0x01c6:
            r9 = 6
            goto L_0x01d1
        L_0x01c8:
            r9 = 5
            goto L_0x01d1
        L_0x01ca:
            r9 = 4
            goto L_0x01d1
        L_0x01cc:
            r9 = 3
            goto L_0x01d1
        L_0x01ce:
            r9 = 2
            goto L_0x01d1
        L_0x01d0:
            r9 = 1
        L_0x01d1:
            if (r9 == r8) goto L_0x0173
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r7 = r7.mo22281z()
            java.util.Iterator r7 = r7.iterator()
        L_0x01e0:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x01fe
            java.lang.Object r11 = r7.next()
            e.f.a.c.f.l.v r11 = (p174e.p319f.p320a.p335c.p345f.p357l.C8496v) r11
            android.graphics.PointF r12 = new android.graphics.PointF
            float r8 = r11.mo22175w()
            float r11 = r11.mo22176x()
            r12.<init>(r8, r11)
            r10.add(r12)
            r8 = -1
            goto L_0x01e0
        L_0x01fe:
            e.f.a.c.f.l.xa r7 = new e.f.a.c.f.l.xa
            r7.<init>(r9, r10)
            r5.add(r7)
            r8 = -1
            goto L_0x0173
        L_0x0209:
            r24 = r5
            goto L_0x0213
        L_0x020c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r24 = r4
        L_0x0213:
            e.f.a.c.f.l.jg r4 = r3.mo22249F()
            e.f.a.c.f.l.bb r5 = new e.f.a.c.f.l.bb
            long r6 = r3.mo22248E()
            int r14 = (int) r6
            android.graphics.Rect r15 = new android.graphics.Rect
            float r6 = r4.mo21905w()
            int r6 = (int) r6
            float r7 = r4.mo21907y()
            int r7 = (int) r7
            float r8 = r4.mo21906x()
            int r8 = (int) r8
            float r4 = r4.mo21908z()
            int r4 = (int) r4
            r15.<init>(r6, r7, r8, r4)
            float r16 = r3.mo22246C()
            float r17 = r3.mo22245B()
            float r18 = r3.mo22247D()
            boolean r4 = r3.mo22252z()
            if (r4 == 0) goto L_0x0250
            float r10 = r3.mo22244A()
            r22 = r10
            goto L_0x0252
        L_0x0250:
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0252:
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.add(r5)
            goto L_0x0013
        L_0x025b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.mlkit.C4130a.m15492Y(e.f.a.c.f.l.c0):java.util.List");
    }

    /* renamed from: k */
    static void m15493k(C8363na naVar, int i, long j, long j2) {
        if (C8125ah.m28321b()) {
            naVar.mo22022c(25503, i, j, j2);
        }
    }

    /* renamed from: m */
    private static C8334m m15494m(int i) {
        if (i == 0) {
            return C8334m.ROTATION_0;
        }
        if (i == 1) {
            return C8334m.ROTATION_270;
        }
        if (i == 2) {
            return C8334m.ROTATION_180;
        }
        if (i == 3) {
            return C8334m.ROTATION_90;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Unsupported rotation degree: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo12563a() {
        this.f11483h = this.f11480e.mo12556a(this.f11479d, this.f11477b.getAssets());
        this.f11481f.mo12568c(this.f11478c);
    }

    /* renamed from: c */
    public final void mo12564c() {
        long j = this.f11483h;
        if (j > 0) {
            this.f11480e.mo12561f(j);
            this.f11483h = -1;
        }
    }

    /* renamed from: y */
    public final List<C8138bb> mo12565y(C6634a aVar, C8507va vaVar) {
        long j;
        List<C8138bb> list;
        List<C8138bb> list2;
        C8221g gVar;
        ByteBuffer byteBuffer;
        C8146c0 c0Var;
        C8507va vaVar2 = vaVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        int p = vaVar.mo22201p();
        if (p != -1) {
            if (p != 17) {
                if (p != 35) {
                    if (p == 842094169) {
                        byteBuffer = (ByteBuffer) C6636b.m25277m(aVar);
                        gVar = C8221g.YV12;
                    }
                } else if (Build.VERSION.SDK_INT >= 19) {
                    Image.Plane[] planes = ((Image) C6636b.m25277m(aVar)).getPlanes();
                    ByteBuffer buffer = planes[0].getBuffer();
                    ByteBuffer buffer2 = planes[1].getBuffer();
                    ByteBuffer buffer3 = planes[2].getBuffer();
                    C8259i w = C8278j.m28604w();
                    w.mo21848w(vaVar.mo22198C());
                    w.mo21845p(vaVar.mo22200o());
                    w.mo21846q(m15494m(vaVar.mo22202r()));
                    if (vaVar.mo22199E() > 0) {
                        w.mo21847v(vaVar.mo22199E() * 1000);
                    }
                    C8278j jVar = (C8278j) w.mo22294j();
                    if (buffer.isDirect()) {
                        c0Var = this.f11480e.mo12560e(this.f11483h, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), jVar);
                    } else {
                        ByteBuffer byteBuffer2 = buffer;
                        if (!byteBuffer2.hasArray() || byteBuffer2.arrayOffset() != 0) {
                            byte[] bArr = new byte[byteBuffer2.remaining()];
                            byteBuffer2.get(bArr);
                            byteBuffer2.get(bArr);
                            byteBuffer2.get(bArr);
                            c0Var = this.f11480e.mo12558c(this.f11483h, bArr, new byte[buffer2.remaining()], new byte[buffer3.remaining()], planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), jVar);
                        } else {
                            c0Var = this.f11480e.mo12558c(this.f11483h, byteBuffer2.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), jVar);
                        }
                    }
                    list2 = c0Var != null ? m15492Y(c0Var) : new ArrayList<>();
                    list = list2;
                    j = currentTimeMillis;
                }
                int p2 = vaVar.mo22201p();
                int i = Build.VERSION.SDK_INT;
                StringBuilder sb = new StringBuilder(55);
                sb.append("Unsupported image format ");
                sb.append(p2);
                sb.append(" at API ");
                sb.append(i);
                String sb2 = sb.toString();
                Log.e("FaceDetector", sb2);
                m15493k(this.f11482g, 1, currentTimeMillis, System.currentTimeMillis());
                throw C4134e.m15502a(sb2);
            }
            byteBuffer = (ByteBuffer) C6636b.m25277m(aVar);
            gVar = C8221g.NV21;
            list2 = m15491P0(byteBuffer, vaVar2, gVar);
            list = list2;
            j = currentTimeMillis;
        } else {
            Bitmap bitmap = (Bitmap) C6636b.m25277m(aVar);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i2 = width * height;
            int[] iArr = new int[i2];
            int[] iArr2 = iArr;
            int i3 = i2;
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(((double) height) / 2.0d);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 + ((ceil + ceil) * ((int) Math.ceil(((double) width) / 2.0d))));
            int i4 = i3;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < height) {
                int i8 = i7;
                int i9 = i6;
                int i10 = 0;
                while (i10 < width) {
                    int i11 = iArr2[i9];
                    int i12 = width;
                    int i13 = (i11 >> 16) & 255;
                    int i14 = height;
                    int i15 = (i11 >> 8) & 255;
                    int i16 = i11 & 255;
                    int i17 = (((((i13 * -38) - (i15 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                    long j2 = currentTimeMillis;
                    int i18 = (((((i13 * 112) - (i15 * 94)) - (i16 * 18)) + 128) >> 8) + 128;
                    int i19 = i8 + 1;
                    allocateDirect.put(i8, (byte) Math.min(255, (((((i13 * 66) + (i15 * 129)) + (i16 * 25)) + 128) >> 8) + 16));
                    if (i5 % 2 == 0 && i9 % 2 == 0) {
                        int i20 = i4 + 1;
                        allocateDirect.put(i4, (byte) Math.min(255, i18));
                        i4 = i20 + 1;
                        allocateDirect.put(i20, (byte) Math.min(255, i17));
                    }
                    i9++;
                    i10++;
                    width = i12;
                    i8 = i19;
                    height = i14;
                    currentTimeMillis = j2;
                }
                int i21 = width;
                int i22 = height;
                long j3 = currentTimeMillis;
                i5++;
                i6 = i9;
                i7 = i8;
            }
            j = currentTimeMillis;
            list = m15491P0(allocateDirect, vaVar2, C8221g.NV21);
        }
        this.f11481f.mo12566a(this.f11478c, vaVar, list, SystemClock.elapsedRealtime() - elapsedRealtime);
        m15493k(this.f11482g, 0, j, System.currentTimeMillis());
        return list;
    }
}
