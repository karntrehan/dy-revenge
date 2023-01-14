package com.mrousavy.camera;

import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.g */
public abstract class C5152g extends Throwable {

    /* renamed from: f */
    private final String f14645f;

    /* renamed from: o */
    private final String f14646o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5152g(String str, String str2, String str3, Throwable th) {
        super('[' + str + '/' + str2 + "] " + str3, th);
        C10457l.m35320e(str, "domain");
        C10457l.m35320e(str2, "id");
        C10457l.m35320e(str3, "message");
        this.f14645f = str;
        this.f14646o = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5152g(String str, String str2, String str3, Throwable th, int i, C10452g gVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : th);
    }

    /* renamed from: a */
    public final String mo15772a() {
        return this.f14645f;
    }

    /* renamed from: b */
    public final String mo15773b() {
        return this.f14646o;
    }
}
