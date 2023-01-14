package com.facebook.react;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;

public class ReactFragment extends Fragment implements C2802e {

    /* renamed from: k0 */
    private C2885n f7565k0;

    /* renamed from: l0 */
    private C2803f f7566l0;

    /* renamed from: B0 */
    public void mo3841B0(int i, String[] strArr, int[] iArr) {
        super.mo3841B0(i, strArr, iArr);
        C2803f fVar = this.f7566l0;
        if (fVar != null && fVar.onRequestPermissionsResult(i, strArr, iArr)) {
            this.f7566l0 = null;
        }
    }

    /* renamed from: C0 */
    public void mo3843C0() {
        super.mo3843C0();
        this.f7565k0.mo9270k();
    }

    /* renamed from: c0 */
    public void mo3888c0(int i, int i2, Intent intent) {
        super.mo3888c0(i, i2, intent);
        this.f7565k0.mo9266g(i, i2, intent, false);
    }

    /* renamed from: h0 */
    public void mo3825h0(Bundle bundle) {
        Bundle bundle2;
        super.mo3825h0(bundle);
        String str = null;
        if (mo3925q() != null) {
            str = mo3925q().getString("arg_component_name");
            bundle2 = mo3925q().getBundle("arg_launch_options");
        } else {
            bundle2 = null;
        }
        if (str != null) {
            this.f7565k0 = new C2885n(mo3909l(), mo8379w1(), str, bundle2);
            return;
        }
        throw new IllegalStateException("Cannot loadApp if component name is null");
    }

    @TargetApi(23)
    /* renamed from: i */
    public void mo8378i(String[] strArr, int i, C2803f fVar) {
        this.f7566l0 = fVar;
        mo3897f1(strArr, i);
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7565k0.mo9264e();
        return this.f7565k0.mo9263d();
    }

    /* renamed from: m0 */
    public void mo3913m0() {
        super.mo3913m0();
        this.f7565k0.mo9268i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public C2904r mo8379w1() {
        return ((C2775m) mo3909l().getApplication()).mo9081a();
    }

    /* renamed from: x0 */
    public void mo3948x0() {
        super.mo3948x0();
        this.f7565k0.mo9269j();
    }
}
