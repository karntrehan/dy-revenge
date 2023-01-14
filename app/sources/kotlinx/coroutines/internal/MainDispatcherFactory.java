package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C10850y1;

public interface MainDispatcherFactory {
    C10850y1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
