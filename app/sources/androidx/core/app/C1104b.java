package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* renamed from: androidx.core.app.b */
public class C1104b {

    /* renamed from: androidx.core.app.b$a */
    private static class C1105a extends C1104b {

        /* renamed from: a */
        private final ActivityOptions f3075a;

        C1105a(ActivityOptions activityOptions) {
            this.f3075a = activityOptions;
        }

        /* renamed from: b */
        public Bundle mo3548b() {
            return this.f3075a.toBundle();
        }
    }

    protected C1104b() {
    }

    /* renamed from: a */
    public static C1104b m4304a(Context context, int i, int i2) {
        return Build.VERSION.SDK_INT >= 16 ? new C1105a(ActivityOptions.makeCustomAnimation(context, i, i2)) : new C1104b();
    }

    /* renamed from: b */
    public Bundle mo3548b() {
        return null;
    }
}
