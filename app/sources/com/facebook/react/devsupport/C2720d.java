package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.facebook.react.devsupport.d */
public class C2720d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f7810a = false;

    /* renamed from: com.facebook.react.devsupport.d$a */
    class C2721a implements Runnable {
        C2721a() {
        }

        public void run() {
            boolean unused = C2720d.this.f7810a = false;
        }
    }

    /* renamed from: b */
    public boolean mo8902b(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.f7810a) {
                this.f7810a = false;
                return true;
            }
            this.f7810a = true;
            new Handler().postDelayed(new C2721a(), 200);
        }
        return false;
    }
}
