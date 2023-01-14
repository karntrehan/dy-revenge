package p174e.p319f.p320a.p363d.p366l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: e.f.a.d.l.f */
public class C9030f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f24828a = new Matrix();

    public C9030f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f24828a.set(imageView.getImageMatrix());
        return this.f24828a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
