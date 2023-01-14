package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    static final PorterDuff.Mode f3231a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f3232b = -1;

    /* renamed from: c */
    Object f3233c;

    /* renamed from: d */
    public byte[] f3234d = null;

    /* renamed from: e */
    public Parcelable f3235e = null;

    /* renamed from: f */
    public int f3236f = 0;

    /* renamed from: g */
    public int f3237g = 0;

    /* renamed from: h */
    public ColorStateList f3238h = null;

    /* renamed from: i */
    PorterDuff.Mode f3239i = f3231a;

    /* renamed from: j */
    public String f3240j = null;

    /* renamed from: k */
    public String f3241k;

    public IconCompat() {
    }

    private IconCompat(int i) {
        this.f3232b = i;
    }

    /* renamed from: a */
    static Bitmap m4521a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m4522b(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3236f = i;
            if (resources != null) {
                try {
                    iconCompat.f3233c = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3233c = str;
            }
            iconCompat.f3241k = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: d */
    private static int m4523d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: f */
    private static String m4524f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: h */
    private static int m4525h(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    /* renamed from: j */
    private static Uri m4526j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: p */
    private static String m4527p(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public int mo3645c() {
        int i = this.f3232b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m4523d((Icon) this.f3233c);
        }
        if (i == 2) {
            return this.f3236f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: e */
    public String mo3646e() {
        int i = this.f3232b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m4524f((Icon) this.f3233c);
        }
        if (i == 2) {
            return TextUtils.isEmpty(this.f3241k) ? ((String) this.f3233c).split(":", -1)[0] : this.f3241k;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: g */
    public int mo3647g() {
        int i = this.f3232b;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : m4525h((Icon) this.f3233c);
    }

    /* renamed from: i */
    public Uri mo3648i() {
        int i = this.f3232b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m4526j((Icon) this.f3233c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3233c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: k */
    public InputStream mo3649k(Context context) {
        String str;
        StringBuilder sb;
        Uri i = mo3648i();
        String scheme = i.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(i);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(i);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3233c));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(i);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    /* renamed from: l */
    public void mo3650l() {
        Parcelable parcelable;
        this.f3239i = PorterDuff.Mode.valueOf(this.f3240j);
        switch (this.f3232b) {
            case -1:
                parcelable = this.f3235e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f3235e;
                if (parcelable == null) {
                    byte[] bArr = this.f3234d;
                    this.f3233c = bArr;
                    this.f3232b = 3;
                    this.f3236f = 0;
                    this.f3237g = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3234d, Charset.forName("UTF-16"));
                this.f3233c = str;
                if (this.f3232b == 2 && this.f3241k == null) {
                    this.f3241k = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3233c = this.f3234d;
                return;
            default:
                return;
        }
        this.f3233c = parcelable;
    }

    /* renamed from: m */
    public void mo3651m(boolean z) {
        this.f3240j = this.f3239i.name();
        switch (this.f3232b) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3233c).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3234d = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3234d = ((String) this.f3233c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3234d = (byte[]) this.f3233c;
                return;
            case 4:
            case 6:
                this.f3234d = this.f3233c.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f3235e = (Parcelable) this.f3233c;
    }

    @Deprecated
    /* renamed from: n */
    public Icon mo3652n() {
        return mo3653o((Context) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r0 >= 26) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        r5 = m4521a(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r0 = r4.f3238h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        if (r0 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        r5.setTintList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r0 = r4.f3239i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        if (r0 == f3231a) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        r5.setTintMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        return r5;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo3653o(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = r4.f3232b
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x00b5;
                case 0: goto L_0x0008;
                case 1: goto L_0x009c;
                case 2: goto L_0x0091;
                case 3: goto L_0x0084;
                case 4: goto L_0x007b;
                case 5: goto L_0x0065;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L_0x0020
            android.net.Uri r5 = r4.mo3648i()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto L_0x00a4
        L_0x0020:
            if (r5 == 0) goto L_0x004a
            java.io.InputStream r5 = r4.mo3649k(r5)
            if (r5 == 0) goto L_0x002f
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r2) goto L_0x0076
            goto L_0x006d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r4.mo3648i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r4.mo3648i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0065:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L_0x0072
            java.lang.Object r5 = r4.f3233c
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x006d:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00a4
        L_0x0072:
            java.lang.Object r5 = r4.f3233c
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x0076:
            android.graphics.Bitmap r5 = m4521a(r5, r1)
            goto L_0x00a0
        L_0x007b:
            java.lang.Object r5 = r4.f3233c
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L_0x00a4
        L_0x0084:
            java.lang.Object r5 = r4.f3233c
            byte[] r5 = (byte[]) r5
            int r0 = r4.f3236f
            int r1 = r4.f3237g
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L_0x00a4
        L_0x0091:
            java.lang.String r5 = r4.mo3646e()
            int r0 = r4.f3236f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L_0x00a4
        L_0x009c:
            java.lang.Object r5 = r4.f3233c
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x00a0:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L_0x00a4:
            android.content.res.ColorStateList r0 = r4.f3238h
            if (r0 == 0) goto L_0x00ab
            r5.setTintList(r0)
        L_0x00ab:
            android.graphics.PorterDuff$Mode r0 = r4.f3239i
            android.graphics.PorterDuff$Mode r1 = f3231a
            if (r0 == r1) goto L_0x00b4
            r5.setTintMode(r0)
        L_0x00b4:
            return r5
        L_0x00b5:
            java.lang.Object r5 = r4.f3233c
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo3653o(android.content.Context):android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f3232b
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f3233c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f3232b
            java.lang.String r1 = m4527p(r1)
            r0.append(r1)
            int r1 = r4.f3232b
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f3233c
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f3236f
            r0.append(r1)
            int r1 = r4.f3237g
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f3237g
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f3241k
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo3645c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f3233c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f3233c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f3238h
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f3238h
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f3239i
            android.graphics.PorterDuff$Mode r2 = f3231a
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f3239i
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
