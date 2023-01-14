package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import p455g.p470y.p472d.C10457l;

public final class ConnectionPool {
    private final RealConnectionPool delegate;

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.INSTANCE, i, j, timeUnit));
        C10457l.m35320e(timeUnit, "timeUnit");
    }

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        C10457l.m35320e(realConnectionPool, "delegate");
        this.delegate = realConnectionPool;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }
}
