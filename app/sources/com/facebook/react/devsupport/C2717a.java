package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.common.C2699i;
import com.facebook.react.devsupport.p114j.C2727a;
import com.facebook.react.devsupport.p114j.C2730d;
import java.util.Map;

/* renamed from: com.facebook.react.devsupport.a */
public class C2717a implements C2718b {
    /* renamed from: a */
    public C2730d mo8877a(Context context, C2724g gVar, String str, boolean z, C2725h hVar, C2727a aVar, int i, Map<String, ?> map, C2699i iVar) {
        if (!z) {
            return new C2719c();
        }
        try {
            return (C2730d) Class.forName("com.facebook.react.devsupport" + "." + "BridgeDevSupportManager").getConstructor(new Class[]{Context.class, C2724g.class, String.class, Boolean.TYPE, C2725h.class, C2727a.class, Integer.TYPE, Map.class, C2699i.class}).newInstance(new Object[]{context, gVar, str, Boolean.TRUE, hVar, aVar, Integer.valueOf(i), map, iVar});
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but BridgeDevSupportManager class was not found or could not be created", e);
        }
    }
}
