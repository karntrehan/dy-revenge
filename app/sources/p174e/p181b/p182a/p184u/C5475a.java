package p174e.p181b.p182a.p184u;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: e.b.a.u.a */
public class C5475a extends Paint {
    public C5475a() {
    }

    public C5475a(int i) {
        super(i);
    }

    public C5475a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C5475a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public void setTextLocales(LocaleList localeList) {
    }
}
