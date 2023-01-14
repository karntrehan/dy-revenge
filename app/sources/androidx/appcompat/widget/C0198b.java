package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0198b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f897a;

    public C0198b(ActionBarContainer actionBarContainer) {
        this.f897a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f897a;
        if (actionBarContainer.f644u) {
            Drawable drawable = actionBarContainer.f643t;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f641r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f897a;
        Drawable drawable3 = actionBarContainer2.f642s;
        if (drawable3 != null && actionBarContainer2.f645v) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f897a;
        if (actionBarContainer.f644u) {
            drawable = actionBarContainer.f643t;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f641r;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
