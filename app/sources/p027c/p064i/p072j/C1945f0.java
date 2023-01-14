package p027c.p064i.p072j;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import p027c.p060f.C1801g;

/* renamed from: c.i.j.f0 */
public final class C1945f0 {

    /* renamed from: a */
    private final C1951e f5675a;

    /* renamed from: c.i.j.f0$a */
    private static class C1946a extends C1951e {

        /* renamed from: a */
        protected final Window f5676a;

        /* renamed from: b */
        private final View f5677b;

        /* renamed from: c.i.j.f0$a$a */
        class C1947a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ View f5678f;

            C1947a(View view) {
                this.f5678f = view;
            }

            public void run() {
                ((InputMethodManager) this.f5678f.getContext().getSystemService("input_method")).showSoftInput(this.f5678f, 0);
            }
        }

        C1946a(Window window, View view) {
            this.f5676a = window;
            this.f5677b = view;
        }

        /* renamed from: f */
        private void m8162f(int i) {
            if (i == 1) {
                mo6543g(4);
            } else if (i == 2) {
                mo6543g(2);
            } else if (i == 8) {
                ((InputMethodManager) this.f5676a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f5676a.getDecorView().getWindowToken(), 0);
            }
        }

        /* renamed from: i */
        private void m8163i(int i) {
            if (i == 1) {
                mo6545j(4);
                mo6546k(1024);
            } else if (i == 2) {
                mo6545j(2);
            } else if (i == 8) {
                View view = this.f5677b;
                if (view == null || (!view.isInEditMode() && !view.onCheckIsTextEditor())) {
                    view = this.f5676a.getCurrentFocus();
                } else {
                    view.requestFocus();
                }
                if (view == null) {
                    view = this.f5676a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new C1947a(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6540a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m8162f(i2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6541d(int i) {
            if (i == 0) {
                mo6545j(6144);
            } else if (i == 1) {
                mo6545j(4096);
                mo6543g(2048);
            } else if (i == 2) {
                mo6545j(2048);
                mo6543g(4096);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6542e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m8163i(i2);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo6543g(int i) {
            View decorView = this.f5676a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo6544h(int i) {
            this.f5676a.addFlags(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo6545j(int i) {
            View decorView = this.f5676a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo6546k(int i) {
            this.f5676a.clearFlags(i);
        }
    }

    /* renamed from: c.i.j.f0$b */
    private static class C1948b extends C1946a {
        C1948b(Window window, View view) {
            super(window, view);
        }

        /* renamed from: c */
        public void mo6548c(boolean z) {
            if (z) {
                mo6546k(67108864);
                mo6544h(RecyclerView.UNDEFINED_DURATION);
                mo6543g(8192);
                return;
            }
            mo6545j(8192);
        }
    }

    /* renamed from: c.i.j.f0$c */
    private static class C1949c extends C1948b {
        C1949c(Window window, View view) {
            super(window, view);
        }

        /* renamed from: b */
        public void mo6549b(boolean z) {
            if (z) {
                mo6546k(134217728);
                mo6544h(RecyclerView.UNDEFINED_DURATION);
                mo6543g(16);
                return;
            }
            mo6545j(16);
        }
    }

    /* renamed from: c.i.j.f0$d */
    private static class C1950d extends C1951e {

        /* renamed from: a */
        final C1945f0 f5680a;

        /* renamed from: b */
        final WindowInsetsController f5681b;

        /* renamed from: c */
        private final C1801g<?, WindowInsetsController.OnControllableInsetsChangedListener> f5682c;

        C1950d(Window window, C1945f0 f0Var) {
            this(window.getInsetsController(), f0Var);
        }

        C1950d(WindowInsetsController windowInsetsController, C1945f0 f0Var) {
            this.f5682c = new C1801g<>();
            this.f5681b = windowInsetsController;
            this.f5680a = f0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6540a(int i) {
            this.f5681b.hide(i);
        }

        /* renamed from: b */
        public void mo6549b(boolean z) {
            if (z) {
                this.f5681b.setSystemBarsAppearance(16, 16);
            } else {
                this.f5681b.setSystemBarsAppearance(0, 16);
            }
        }

        /* renamed from: c */
        public void mo6548c(boolean z) {
            if (z) {
                this.f5681b.setSystemBarsAppearance(8, 8);
            } else {
                this.f5681b.setSystemBarsAppearance(0, 8);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6541d(int i) {
            this.f5681b.setSystemBarsBehavior(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6542e(int i) {
            this.f5681b.show(i);
        }
    }

    /* renamed from: c.i.j.f0$e */
    private static class C1951e {
        C1951e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6540a(int i) {
        }

        /* renamed from: b */
        public void mo6549b(boolean z) {
        }

        /* renamed from: c */
        public void mo6548c(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6541d(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6542e(int i) {
        }
    }

    public C1945f0(Window window, View view) {
        C1951e aVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5675a = new C1950d(window, this);
            return;
        }
        if (i >= 26) {
            aVar = new C1949c(window, view);
        } else if (i >= 23) {
            aVar = new C1948b(window, view);
        } else if (i >= 20) {
            aVar = new C1946a(window, view);
        } else {
            this.f5675a = new C1951e();
            return;
        }
        this.f5675a = aVar;
    }

    /* renamed from: a */
    public void mo6535a(int i) {
        this.f5675a.mo6540a(i);
    }

    /* renamed from: b */
    public void mo6536b(boolean z) {
        this.f5675a.mo6549b(z);
    }

    /* renamed from: c */
    public void mo6537c(boolean z) {
        this.f5675a.mo6548c(z);
    }

    /* renamed from: d */
    public void mo6538d(int i) {
        this.f5675a.mo6541d(i);
    }

    /* renamed from: e */
    public void mo6539e(int i) {
        this.f5675a.mo6542e(i);
    }
}
