package org.reactnative.camera.p514g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import org.reactnative.camera.p515h.C10990c;

/* renamed from: org.reactnative.camera.g.h */
public class C10984h extends AsyncTask<Void, Void, WritableMap> {

    /* renamed from: a */
    private Promise f28786a;

    /* renamed from: b */
    private Bitmap f28787b;

    /* renamed from: c */
    private byte[] f28788c;

    /* renamed from: d */
    private ReadableMap f28789d;

    /* renamed from: e */
    private File f28790e;

    /* renamed from: f */
    private int f28791f;

    /* renamed from: g */
    private int f28792g;

    /* renamed from: h */
    private C10983g f28793h;

    /* renamed from: org.reactnative.camera.g.h$a */
    static /* synthetic */ class C10985a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28794a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28794a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28794a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.p514g.C10984h.C10985a.<clinit>():void");
        }
    }

    public C10984h(byte[] bArr, Promise promise, ReadableMap readableMap, File file, int i, int i2, C10983g gVar) {
        this.f28786a = promise;
        this.f28789d = readableMap;
        this.f28788c = bArr;
        this.f28790e = file;
        this.f28791f = i;
        this.f28792g = i2;
        this.f28793h = gVar;
    }

    /* renamed from: b */
    private Bitmap m37267b(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: c */
    private String m37268c() {
        return this.f28789d.hasKey("path") ? this.f28789d.getString("path") : C10990c.m37293b(this.f28790e, ".jpg");
    }

    /* renamed from: d */
    private int m37269d(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: e */
    private int m37270e() {
        return (int) (this.f28789d.getDouble("quality") * 100.0d);
    }

    /* renamed from: f */
    private void m37271f() {
        if (this.f28787b == null) {
            byte[] bArr = this.f28788c;
            this.f28787b = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        if (this.f28787b == null) {
            throw new IOException("Failed to decode Image Bitmap");
        }
    }

    /* renamed from: h */
    private Bitmap m37272h(Bitmap bitmap, int i) {
        return Bitmap.createScaledBitmap(bitmap, i, (int) (((float) bitmap.getHeight()) * (((float) i) / ((float) bitmap.getWidth()))), true);
    }

    /* renamed from: i */
    private Bitmap m37273i(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
        r0 = r0;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0036, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0026 A[SYNTHETIC, Splitter:B:21:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0031 A[SYNTHETIC, Splitter:B:29:0x0031] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m37274j(java.io.ByteArrayOutputStream r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.m37268c()     // Catch:{ IOException -> 0x001d, all -> 0x001b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0018, all -> 0x001b }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0018, all -> 0x001b }
            r4.writeTo(r2)     // Catch:{ IOException -> 0x0016 }
            r2.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0029
        L_0x0011:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0029
        L_0x0016:
            r4 = move-exception
            goto L_0x0020
        L_0x0018:
            r4 = move-exception
            r2 = r0
            goto L_0x0020
        L_0x001b:
            r4 = move-exception
            goto L_0x002f
        L_0x001d:
            r4 = move-exception
            r1 = r0
            r2 = r1
        L_0x0020:
            r0 = r4
            r0.printStackTrace()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ IOException -> 0x0011 }
        L_0x0029:
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            throw r0
        L_0x002d:
            r4 = move-exception
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0039:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.p514g.C10984h.m37274j(java.io.ByteArrayOutputStream):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x027a A[SYNTHETIC, Splitter:B:130:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x028c A[SYNTHETIC, Splitter:B:137:0x028c] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x029c A[SYNTHETIC, Splitter:B:144:0x029c] */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011e A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135 A[Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:134:0x0280=Splitter:B:134:0x0280, B:127:0x026e=Splitter:B:127:0x026e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.WritableMap doInBackground(java.lang.Void... r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "mirrorImage"
            java.lang.String r2 = "fixOrientation"
            java.lang.String r3 = "exif"
            java.lang.String r4 = "E_TAKING_PICTURE_FAILED"
            java.lang.String r5 = "writeExif"
            java.lang.String r6 = "width"
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()
            int r8 = r1.f28791f
            java.lang.String r9 = "deviceOrientation"
            r7.putInt(r9, r8)
            com.facebook.react.bridge.ReadableMap r8 = r1.f28789d
            java.lang.String r9 = "orientation"
            boolean r8 = r8.hasKey(r9)
            if (r8 == 0) goto L_0x002a
            com.facebook.react.bridge.ReadableMap r8 = r1.f28789d
            int r8 = r8.getInt(r9)
            goto L_0x002c
        L_0x002a:
            int r8 = r1.f28791f
        L_0x002c:
            java.lang.String r9 = "pictureOrientation"
            r7.putInt(r9, r8)
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ NotFoundException -> 0x027e, IOException -> 0x026c, all -> 0x0268 }
            byte[] r10 = r1.f28788c     // Catch:{ NotFoundException -> 0x027e, IOException -> 0x026c, all -> 0x0268 }
            r9.<init>(r10)     // Catch:{ NotFoundException -> 0x027e, IOException -> 0x026c, all -> 0x0268 }
            int r10 = r1.f28792g     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r10 == 0) goto L_0x0049
            r16.m37271f()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r10 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r11 = r1.f28792g     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r10 = r1.m37273i(r10, r11)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r1.f28787b = r10     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x0049:
            com.facebook.react.bridge.ReadableMap r10 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r10 = r10.hasKey(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r11 = "Orientation"
            r12 = 0
            r13 = 1
            if (r10 == 0) goto L_0x007f
            com.facebook.react.bridge.ReadableMap r10 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r2 = r10.getBoolean(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r2 == 0) goto L_0x007f
            c.n.a.a r2 = new c.n.a.a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.<init>((java.io.InputStream) r9)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r10 = r2.mo6897i(r11, r12)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r10 == 0) goto L_0x0080
            int r14 = r1.m37269d(r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r14 == 0) goto L_0x0080
            r16.m37271f()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r10 = r1.m37269d(r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r14 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r10 = r1.m37273i(r14, r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r1.f28787b = r10     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r10 = 1
            goto L_0x0081
        L_0x007f:
            r2 = 0
        L_0x0080:
            r10 = 0
        L_0x0081:
            com.facebook.react.bridge.ReadableMap r14 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r14 = r14.hasKey(r6)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r14 == 0) goto L_0x009a
            r16.m37271f()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r14 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            com.facebook.react.bridge.ReadableMap r15 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r15 = r15.getInt(r6)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r14 = r1.m37272h(r14, r15)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r1.f28787b = r14     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x009a:
            com.facebook.react.bridge.ReadableMap r14 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r14 = r14.hasKey(r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r14 == 0) goto L_0x00b5
            com.facebook.react.bridge.ReadableMap r14 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r14.getBoolean(r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 == 0) goto L_0x00b5
            r16.m37271f()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r0 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r0 = r1.m37267b(r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r1.f28787b = r0     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x00b5:
            com.facebook.react.bridge.ReadableMap r0 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r0.hasKey(r3)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 == 0) goto L_0x00c7
            com.facebook.react.bridge.ReadableMap r0 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r0.getBoolean(r3)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 == 0) goto L_0x00c7
            r0 = 1
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            com.facebook.react.bridge.ReadableMap r14 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r14 = r14.hasKey(r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r15 = 2
            if (r14 == 0) goto L_0x00f4
            int[] r14 = org.reactnative.camera.p514g.C10984h.C10985a.f28794a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            com.facebook.react.bridge.ReadableMap r8 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            com.facebook.react.bridge.ReadableType r8 = r8.getType(r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r8 = r8.ordinal()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r8 = r14[r8]     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r8 == r13) goto L_0x00eb
            if (r8 == r15) goto L_0x00e4
            goto L_0x00f4
        L_0x00e4:
            com.facebook.react.bridge.ReadableMap r8 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            com.facebook.react.bridge.ReadableMap r5 = r8.getMap(r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            goto L_0x00f5
        L_0x00eb:
            com.facebook.react.bridge.ReadableMap r8 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r5 = r8.getBoolean(r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r8 = r5
            r5 = 0
            goto L_0x00f6
        L_0x00f4:
            r5 = 0
        L_0x00f5:
            r8 = 1
        L_0x00f6:
            java.lang.String r14 = "height"
            if (r0 != 0) goto L_0x00ff
            if (r8 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r2 = 0
            goto L_0x013f
        L_0x00ff:
            android.graphics.Bitmap r15 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r15 != 0) goto L_0x010a
            if (r5 != 0) goto L_0x010a
            if (r0 == 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r2 = 0
            goto L_0x011a
        L_0x010a:
            if (r2 != 0) goto L_0x0111
            c.n.a.a r2 = new c.n.a.a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.<init>((java.io.InputStream) r9)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x0111:
            com.facebook.react.bridge.WritableMap r2 = org.reactnative.camera.C10950e.m37173r(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r5 == 0) goto L_0x011a
            r2.merge(r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x011a:
            android.graphics.Bitmap r15 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r15 == 0) goto L_0x0133
            int r15 = r15.getWidth()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.putInt(r6, r15)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r15 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r15 = r15.getHeight()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.putInt(r14, r15)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r10 == 0) goto L_0x0133
            r2.putInt(r11, r13)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x0133:
            if (r0 == 0) goto L_0x013f
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r0.merge(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putMap(r3, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x013f:
            android.graphics.Bitmap r0 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r3 = "uri"
            java.lang.String r10 = "doNotSave"
            java.lang.String r11 = "base64"
            if (r0 != 0) goto L_0x01d6
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r0.<init>()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r0.inJustDecodeBounds = r13     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            byte[] r2 = r1.f28788c     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r13 = r2.length     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.BitmapFactory.decodeByteArray(r2, r12, r13, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r2 = r0.outWidth     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putInt(r6, r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r0 = r0.outHeight     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putInt(r14, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            com.facebook.react.bridge.ReadableMap r0 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r0.hasKey(r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 == 0) goto L_0x0170
            com.facebook.react.bridge.ReadableMap r0 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r0.getBoolean(r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 != 0) goto L_0x01ba
        L_0x0170:
            java.io.File r0 = new java.io.File     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r2 = r16.m37268c()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r0.<init>(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r0.createNewFile()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.<init>(r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            byte[] r6 = r1.f28788c     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.write(r6)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.flush()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.close()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r8 == 0) goto L_0x01a0
            if (r5 == 0) goto L_0x01a0
            c.n.a.a r2 = new c.n.a.a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.<init>((java.lang.String) r6)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            org.reactnative.camera.C10950e.m37175t(r2, r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x019c:
            r2.mo6890X()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            goto L_0x01af
        L_0x01a0:
            if (r8 != 0) goto L_0x01af
            c.n.a.a r2 = new c.n.a.a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r5 = r0.getAbsolutePath()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.<init>((java.lang.String) r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            org.reactnative.camera.C10950e.m37156a(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            goto L_0x019c
        L_0x01af:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r0 = r0.toString()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putString(r3, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x01ba:
            com.facebook.react.bridge.ReadableMap r0 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r0.hasKey(r11)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 == 0) goto L_0x025a
            com.facebook.react.bridge.ReadableMap r0 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r0 = r0.getBoolean(r11)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r0 == 0) goto L_0x025a
            byte[] r0 = r1.f28788c     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x01d1:
            r7.putString(r11, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            goto L_0x025a
        L_0x01d6:
            int r0 = r0.getWidth()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putInt(r6, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r0 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r0 = r0.getHeight()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putInt(r14, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r0.<init>()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap r5 = r1.f28787b     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            int r12 = r16.m37270e()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r5 = r5.compress(r6, r12, r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r5 != 0) goto L_0x020c
            com.facebook.react.bridge.Promise r0 = r1.f28786a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r2 = "Could not compress image to JPEG"
            r0.reject((java.lang.String) r4, (java.lang.String) r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r9.close()     // Catch:{ IOException -> 0x0205 }
        L_0x0203:
            r2 = 0
            goto L_0x020b
        L_0x0205:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            goto L_0x0203
        L_0x020b:
            return r2
        L_0x020c:
            com.facebook.react.bridge.ReadableMap r5 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r5 = r5.hasKey(r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r5 == 0) goto L_0x021c
            com.facebook.react.bridge.ReadableMap r5 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r5 = r5.getBoolean(r10)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r5 != 0) goto L_0x023f
        L_0x021c:
            java.lang.String r5 = r1.m37274j(r0)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r8 == 0) goto L_0x022f
            if (r2 == 0) goto L_0x022f
            c.n.a.a r6 = new c.n.a.a     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r6.<init>((java.lang.String) r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            org.reactnative.camera.C10950e.m37175t(r6, r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r6.mo6890X()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x022f:
            java.io.File r2 = new java.io.File     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2.<init>(r5)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            java.lang.String r2 = r2.toString()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r7.putString(r3, r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
        L_0x023f:
            com.facebook.react.bridge.ReadableMap r2 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r2 = r2.hasKey(r11)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r2 == 0) goto L_0x025a
            com.facebook.react.bridge.ReadableMap r2 = r1.f28789d     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            boolean r2 = r2.getBoolean(r11)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            if (r2 == 0) goto L_0x025a
            byte[] r0 = r0.toByteArray()     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            r2 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ NotFoundException -> 0x0266, IOException -> 0x0264 }
            goto L_0x01d1
        L_0x025a:
            r9.close()     // Catch:{ IOException -> 0x025e }
            goto L_0x0263
        L_0x025e:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0263:
            return r7
        L_0x0264:
            r0 = move-exception
            goto L_0x026e
        L_0x0266:
            r0 = move-exception
            goto L_0x0280
        L_0x0268:
            r0 = move-exception
            r2 = r0
            r8 = 0
            goto L_0x029a
        L_0x026c:
            r0 = move-exception
            r9 = 0
        L_0x026e:
            com.facebook.react.bridge.Promise r2 = r1.f28786a     // Catch:{ all -> 0x0297 }
            java.lang.String r3 = "An unknown I/O exception has occurred."
            r2.reject((java.lang.String) r4, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0297 }
            r0.printStackTrace()     // Catch:{ all -> 0x0297 }
            if (r9 == 0) goto L_0x0295
            r9.close()     // Catch:{ IOException -> 0x0290 }
            goto L_0x0295
        L_0x027e:
            r0 = move-exception
            r9 = 0
        L_0x0280:
            com.facebook.react.bridge.Promise r2 = r1.f28786a     // Catch:{ all -> 0x0297 }
            java.lang.String r3 = "Documents directory of the app could not be found."
            r2.reject((java.lang.String) r4, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0297 }
            r0.printStackTrace()     // Catch:{ all -> 0x0297 }
            if (r9 == 0) goto L_0x0295
            r9.close()     // Catch:{ IOException -> 0x0290 }
            goto L_0x0295
        L_0x0290:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0295:
            r2 = 0
            return r2
        L_0x0297:
            r0 = move-exception
            r2 = r0
            r8 = r9
        L_0x029a:
            if (r8 == 0) goto L_0x02a5
            r8.close()     // Catch:{ IOException -> 0x02a0 }
            goto L_0x02a5
        L_0x02a0:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x02a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.p514g.C10984h.doInBackground(java.lang.Void[]):com.facebook.react.bridge.WritableMap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void onPostExecute(WritableMap writableMap) {
        super.onPostExecute(writableMap);
        if (writableMap == null) {
            return;
        }
        if (!this.f28789d.hasKey("fastMode") || !this.f28789d.getBoolean("fastMode")) {
            this.f28786a.resolve(writableMap);
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f28789d.getInt("id"));
        createMap.putMap("data", writableMap);
        this.f28793h.mo28930h(createMap);
    }
}
