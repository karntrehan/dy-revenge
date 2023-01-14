package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;
import p455g.p470y.p472d.C10457l;

public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        C10457l.m35320e(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        C10457l.m35320e(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        C10457l.m35320e(route, "route");
        return this.failedRoutes.contains(route);
    }
}
