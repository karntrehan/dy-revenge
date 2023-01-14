package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;
import p174e.p319f.p320a.p382e.p383a.p385b.C9132p0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.j */
class C4391j<T> extends C9132p0 {

    /* renamed from: a */
    final C9165m<T> f12525a;

    /* renamed from: b */
    final /* synthetic */ C4411o f12526b;

    C4391j(C4411o oVar, C9165m<T> mVar) {
        this.f12526b = oVar;
        this.f12525a = mVar;
    }

    C4391j(C4411o oVar, C9165m mVar, byte[] bArr) {
        this(oVar, mVar);
    }

    C4391j(C4411o oVar, C9165m mVar, char[] cArr) {
        this(oVar, mVar);
    }

    C4391j(C4411o oVar, C9165m mVar, int[] iArr) {
        this(oVar, mVar);
    }

    /* renamed from: D0 */
    public void mo13872D0(Bundle bundle) {
        this.f12526b.f12597e.mo23100b();
        int i = bundle.getInt("error_code");
        C4411o.f12593a.mo23081b("onError(%d)", Integer.valueOf(i));
        this.f12525a.mo23142d(new C4355a(i));
    }

    /* renamed from: E0 */
    public void mo13873E0(Bundle bundle, Bundle bundle2) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: H0 */
    public void mo13874H0(List<Bundle> list) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: J0 */
    public void mo13875J0(Bundle bundle, Bundle bundle2) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: L */
    public void mo13876L(Bundle bundle) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: M */
    public final void mo13877M(int i) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: M0 */
    public void mo13878M0() {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: f0 */
    public final void mo13879f0(int i) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: h0 */
    public void mo13880h0(Bundle bundle) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: k0 */
    public void mo13881k0(int i, Bundle bundle) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: p0 */
    public void mo13882p0() {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onRemoveModule()", new Object[0]);
    }

    /* renamed from: t0 */
    public void mo13883t0(Bundle bundle) {
        this.f12526b.f12597e.mo23100b();
        C4411o.f12593a.mo23083d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: w0 */
    public void mo13884w0(Bundle bundle, Bundle bundle2) {
        this.f12526b.f12598f.mo23100b();
        C4411o.f12593a.mo23083d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }
}
