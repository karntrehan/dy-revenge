package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1286d;

/* renamed from: androidx.lifecycle.p */
public class C1303p extends Fragment {

    /* renamed from: f */
    private C1304a f3739f;

    /* renamed from: androidx.lifecycle.p$a */
    interface C1304a {
        /* renamed from: a */
        void mo4357a();

        /* renamed from: b */
        void mo4358b();

        /* renamed from: c */
        void mo4359c();
    }

    /* renamed from: androidx.lifecycle.p$b */
    static class C1305b implements Application.ActivityLifecycleCallbacks {
        C1305b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C1303p.m5338a(activity, C1286d.C1287a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C1303p.m5338a(activity, C1286d.C1287a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C1303p.m5338a(activity, C1286d.C1287a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C1303p.m5338a(activity, C1286d.C1287a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C1303p.m5338a(activity, C1286d.C1287a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C1303p.m5338a(activity, C1286d.C1287a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m5338a(Activity activity, C1286d.C1287a aVar) {
        if (activity instanceof C1295i) {
            ((C1295i) activity).getLifecycle().mo4342i(aVar);
        } else if (activity instanceof C1291g) {
            C1286d lifecycle = ((C1291g) activity).getLifecycle();
            if (lifecycle instanceof C1292h) {
                ((C1292h) lifecycle).mo4342i(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m5339b(C1286d.C1287a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m5338a(getActivity(), aVar);
        }
    }

    /* renamed from: c */
    private void m5340c(C1304a aVar) {
        if (aVar != null) {
            aVar.mo4357a();
        }
    }

    /* renamed from: d */
    private void m5341d(C1304a aVar) {
        if (aVar != null) {
            aVar.mo4358b();
        }
    }

    /* renamed from: e */
    private void m5342e(C1304a aVar) {
        if (aVar != null) {
            aVar.mo4359c();
        }
    }

    /* renamed from: f */
    public static void m5343f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C1305b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C1303p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5340c(this.f3739f);
        m5339b(C1286d.C1287a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m5339b(C1286d.C1287a.ON_DESTROY);
        this.f3739f = null;
    }

    public void onPause() {
        super.onPause();
        m5339b(C1286d.C1287a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m5341d(this.f3739f);
        m5339b(C1286d.C1287a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m5342e(this.f3739f);
        m5339b(C1286d.C1287a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m5339b(C1286d.C1287a.ON_STOP);
    }
}
