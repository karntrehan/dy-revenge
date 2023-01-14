package p495in.sriraman.sharedpreferences;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: in.sriraman.sharedpreferences.a */
public class C10649a implements C2906s {
    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNSharedPreferencesModule(reactApplicationContext));
        return arrayList;
    }
}
