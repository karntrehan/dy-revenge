package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1289e;
import androidx.lifecycle.C1291g;

class FragmentStateAdapter$5 implements C1289e {

    /* renamed from: f */
    final /* synthetic */ Handler f4175f;

    /* renamed from: o */
    final /* synthetic */ Runnable f4176o;

    /* renamed from: h */
    public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
        if (aVar == C1286d.C1287a.ON_DESTROY) {
            this.f4175f.removeCallbacks(this.f4176o);
            gVar.getLifecycle().mo4340c(this);
        }
    }
}
