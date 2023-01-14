package p174e.p247e.p294k.p313q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import java.io.OutputStream;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: e.e.k.q.g */
public class C6405g implements C6401c {

    /* renamed from: a */
    private final boolean f17843a;

    /* renamed from: b */
    private final int f17844b;

    public C6405g(boolean z, int i) {
        this.f17843a = z;
        this.f17844b = i;
    }

    /* renamed from: e */
    private static Bitmap.CompressFormat m24510e(C6253c cVar) {
        return cVar == null ? Bitmap.CompressFormat.JPEG : cVar == C6252b.f17318a ? Bitmap.CompressFormat.JPEG : cVar == C6252b.f17319b ? Bitmap.CompressFormat.PNG : (Build.VERSION.SDK_INT < 14 || !C6252b.m23708a(cVar)) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP;
    }

    /* renamed from: f */
    private int m24511f(C6369d dVar, C6317f fVar, C6316e eVar) {
        if (!this.f17843a) {
            return 1;
        }
        return C6399a.m24485b(fVar, eVar, dVar, this.f17844b);
    }

    /* renamed from: a */
    public String mo8187a() {
        return "SimpleImageTranscoder";
    }

    /* renamed from: b */
    public boolean mo8188b(C6369d dVar, C6317f fVar, C6316e eVar) {
        if (fVar == null) {
            fVar = C6317f.m23927a();
        }
        return this.f17843a && C6399a.m24485b(fVar, eVar, dVar, this.f17844b) > 1;
    }

    /* renamed from: c */
    public C6400b mo8189c(C6369d dVar, OutputStream outputStream, C6317f fVar, C6316e eVar, C6253c cVar, Integer num) {
        C6405g gVar;
        C6317f fVar2;
        Bitmap bitmap;
        C6369d dVar2 = dVar;
        Integer num2 = num == null ? 85 : num;
        if (fVar == null) {
            fVar2 = C6317f.m23927a();
            gVar = this;
        } else {
            gVar = this;
            fVar2 = fVar;
        }
        int f = gVar.m24511f(dVar2, fVar2, eVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = f;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(dVar.mo18892X(), (Rect) null, options);
            if (decodeStream == null) {
                C6071a.m22875i("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C6400b(2);
            }
            Matrix g = C6403e.m24501g(dVar2, fVar2);
            if (g != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        C6071a.m22876j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        C6400b bVar = new C6400b(2);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return bVar;
                    } catch (Throwable th) {
                        th = th;
                        bitmap.recycle();
                        decodeStream.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(m24510e(cVar), num2.intValue(), outputStream);
                int i = 1;
                if (f > 1) {
                    i = 0;
                }
                C6400b bVar2 = new C6400b(i);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar2;
            } catch (OutOfMemoryError e2) {
                e = e2;
                C6071a.m22876j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                C6400b bVar3 = new C6400b(2);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar3;
            }
        } catch (OutOfMemoryError e3) {
            C6071a.m22876j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new C6400b(2);
        }
    }

    /* renamed from: d */
    public boolean mo8190d(C6253c cVar) {
        return cVar == C6252b.f17328k || cVar == C6252b.f17318a;
    }
}
