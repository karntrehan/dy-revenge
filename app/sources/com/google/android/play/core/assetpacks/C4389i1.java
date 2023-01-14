package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.common.C4456b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9108d0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9125m;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;
import p174e.p319f.p320a.p382e.p383a.p389f.C9156d;
import p174e.p319f.p320a.p382e.p383a.p389f.C9158f;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.i1 */
final class C4389i1 implements C4430s2 {

    /* renamed from: a */
    private static final C9101a f12507a = new C9101a("FakeAssetPackService");

    /* renamed from: b */
    private static final AtomicInteger f12508b = new AtomicInteger(1);

    /* renamed from: c */
    private final String f12509c;

    /* renamed from: d */
    private final C4427s f12510d;

    /* renamed from: e */
    private final C4412o0 f12511e;

    /* renamed from: f */
    private final Context f12512f;

    /* renamed from: g */
    private final C4437u1 f12513g;

    /* renamed from: h */
    private final C9147z<Executor> f12514h;

    /* renamed from: i */
    private final Handler f12515i = new Handler(Looper.getMainLooper());

    C4389i1(File file, C4427s sVar, C4412o0 o0Var, Context context, C4437u1 u1Var, C9147z<Executor> zVar) {
        this.f12509c = file.getAbsolutePath();
        this.f12510d = sVar;
        this.f12511e = o0Var;
        this.f12512f = context;
        this.f12513g = u1Var;
        this.f12514h = zVar;
    }

    /* renamed from: h */
    static long m16836h(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: k */
    private final File[] m16837k(String str) {
        File file = new File(this.f12509c);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C4381g1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a : listFiles) {
                        if (C9125m.m30375a(a).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new C4456b(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new C4456b(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new C4456b(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new C4456b(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: l */
    private static String m16838l(File file) {
        try {
            return C4393j1.m16865a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new C4456b("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new C4456b(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: m */
    private final void m16839m(int i, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f12513g.mo13920a());
        bundle.putInt("session_id", i);
        File[] k = m16837k(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : k) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a = C9125m.m30375a(file);
            bundle.putParcelableArrayList(C9108d0.m30337b("chunk_intents", str, a), arrayList2);
            bundle.putString(C9108d0.m30337b("uncompressed_hash_sha256", str, a), m16838l(file));
            bundle.putLong(C9108d0.m30337b("uncompressed_size", str, a), file.length());
            arrayList.add(a);
        }
        bundle.putStringArrayList(C9108d0.m30336a("slice_ids", str), arrayList);
        bundle.putLong(C9108d0.m30336a("pack_version", str), (long) this.f12513g.mo13920a());
        bundle.putInt(C9108d0.m30336a("status", str), i2);
        bundle.putInt(C9108d0.m30336a("error_code", str), 0);
        bundle.putLong(C9108d0.m30336a("bytes_downloaded", str), m16836h(i2, j));
        bundle.putLong(C9108d0.m30336a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m16836h(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f12515i.post(new C4385h1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* renamed from: a */
    public final void mo13863a() {
        f12507a.mo23083d("keepAlive", new Object[0]);
    }

    /* renamed from: b */
    public final void mo13864b(int i) {
        f12507a.mo23083d("notifySessionFailed", new Object[0]);
    }

    /* renamed from: c */
    public final void mo13865c(int i, String str, String str2, int i2) {
        f12507a.mo23083d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: d */
    public final void mo13866d(int i, String str) {
        f12507a.mo23083d("notifyModuleCompleted", new Object[0]);
        this.f12514h.mo13826a().execute(new C4377f1(this, i, str));
    }

    /* renamed from: e */
    public final C9156d<ParcelFileDescriptor> mo13867e(int i, String str, String str2, int i2) {
        f12507a.mo23083d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C9165m mVar = new C9165m();
        try {
            for (File file : m16837k(str)) {
                if (C9125m.m30375a(file).equals(str2)) {
                    mVar.mo23139a(ParcelFileDescriptor.open(file, 268435456));
                    return mVar.mo23141c();
                }
            }
            throw new C4456b(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f12507a.mo23084e("getChunkFileDescriptor failed", e);
            mVar.mo23140b(new C4456b("Asset Slice file not found.", e));
        } catch (C4456b e2) {
            f12507a.mo23084e("getChunkFileDescriptor failed", e2);
            mVar.mo23140b(e2);
        }
    }

    /* renamed from: f */
    public final C9156d<List<String>> mo13868f(Map<String, Long> map) {
        f12507a.mo23083d("syncPacks()", new Object[0]);
        return C9158f.m30457a(new ArrayList());
    }

    /* renamed from: g */
    public final void mo13869g(List<String> list) {
        f12507a.mo23083d("cancelDownload(%s)", list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo13870i(Intent intent) {
        this.f12510d.mo13911a(this.f12512f, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo13871j(int i, String str) {
        try {
            m16839m(i, str, 4);
        } catch (C4456b e) {
            f12507a.mo23084e("notifyModuleCompleted failed", e);
        }
    }
}
