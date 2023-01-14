package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p455g.p470y.p472d.C10452g;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public C10685a createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new C10685a(C10687c.m36369a(Looper.getMainLooper(), true), (String) null, 2, (C10452g) null);
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
