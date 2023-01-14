package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C2360l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.facebook.hermes.intl.p */
public class C2365p {
    /* renamed from: a */
    public static HashMap<String, Object> m9803a(List<String> list, Object obj, List<String> list2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        C2360l.C2361a f = (Build.VERSION.SDK_INT < 24 || C2350g.m9721h(C2350g.m9714a(obj, "localeMatcher")).equals("lookup")) ? C2360l.m9769f((String[]) list.toArray(new String[list.size()])) : C2360l.m9766c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet<>();
        for (String next : list2) {
            Object b = C2350g.m9715b();
            if (!f.f7048b.isEmpty() && f.f7048b.containsKey(next)) {
                String str = f.f7048b.get(next);
                boolean isEmpty = str.isEmpty();
                String str2 = str;
                if (isEmpty) {
                    str2 = C2350g.m9731r("true");
                }
                hashSet.add(next);
                b = str2;
            }
            if (C2350g.m9720g(obj).containsKey(next)) {
                Object a = C2350g.m9714a(obj, next);
                if (C2350g.m9726m(a) && C2350g.m9721h(a).isEmpty()) {
                    a = C2350g.m9728o(true);
                }
                if (!C2350g.m9727n(a) && !a.equals(b)) {
                    hashSet.remove(next);
                    b = a;
                }
            }
            if (!C2350g.m9723j(b)) {
                b = C2382y.m9893f(next, b);
            }
            if (C2350g.m9726m(b) && !C2382y.m9890c(next, C2350g.m9721h(b), f.f7047a)) {
                b = C2350g.m9715b();
            }
            hashMap.put(next, b);
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String h = C2350g.m9721h(C2382y.m9893f(str3, C2350g.m9731r(f.f7048b.get(str3))));
            if (!C2350g.m9726m(h) || C2382y.m9890c(str3, C2350g.m9721h(h), f.f7047a)) {
                arrayList.add(h);
                f.f7047a.mo7938g(str3, arrayList);
            }
        }
        hashMap.put("locale", f.f7047a);
        return hashMap;
    }
}
