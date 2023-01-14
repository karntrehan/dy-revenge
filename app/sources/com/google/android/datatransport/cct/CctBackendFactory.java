package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C3378d;
import com.google.android.datatransport.runtime.backends.C3384h;
import com.google.android.datatransport.runtime.backends.C3390m;

@Keep
public class CctBackendFactory implements C3378d {
    public C3390m create(C3384h hVar) {
        return new C3329d(hVar.mo10963b(), hVar.mo10966e(), hVar.mo10965d());
    }
}
