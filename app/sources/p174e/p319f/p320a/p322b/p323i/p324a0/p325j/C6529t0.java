package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: e.f.a.b.i.a0.j.t0 */
final class C6529t0 extends SQLiteOpenHelper {

    /* renamed from: f */
    private static final String f18104f = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: o */
    static int f18105o = 5;

    /* renamed from: p */
    private static final C6530a f18106p;

    /* renamed from: q */
    private static final C6530a f18107q;

    /* renamed from: r */
    private static final C6530a f18108r;

    /* renamed from: s */
    private static final C6530a f18109s;

    /* renamed from: t */
    private static final C6530a f18110t;

    /* renamed from: u */
    private static final List<C6530a> f18111u;

    /* renamed from: v */
    private final int f18112v;

    /* renamed from: w */
    private boolean f18113w = false;

    /* renamed from: e.f.a.b.i.a0.j.t0$a */
    public interface C6530a {
        /* renamed from: a */
        void mo19254a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C6485c0 c0Var = C6485c0.f18038a;
        f18106p = c0Var;
        C6537z zVar = C6537z.f18125a;
        f18107q = zVar;
        C6481a0 a0Var = C6481a0.f18034a;
        f18108r = a0Var;
        C6483b0 b0Var = C6483b0.f18036a;
        f18109s = b0Var;
        C6487d0 d0Var = C6487d0.f18041a;
        f18110t = d0Var;
        f18111u = Arrays.asList(new C6530a[]{c0Var, zVar, a0Var, b0Var, d0Var});
    }

    C6529t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f18112v = i;
    }

    /* renamed from: A */
    static /* synthetic */ void m25035A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f18104f);
    }

    /* renamed from: E */
    private void m25036E(SQLiteDatabase sQLiteDatabase, int i) {
        m25038a(sQLiteDatabase);
        m25037I(sQLiteDatabase, 0, i);
    }

    /* renamed from: I */
    private void m25037I(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C6530a> list = f18111u;
        if (i2 <= list.size()) {
            while (i < i2) {
                f18111u.get(i).mo19254a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: a */
    private void m25038a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f18113w) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m25039b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: h */
    static /* synthetic */ void m25040h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: r */
    static /* synthetic */ void m25042r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f18113w = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m25036E(sQLiteDatabase, this.f18112v);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m25036E(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m25038a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m25038a(sQLiteDatabase);
        m25037I(sQLiteDatabase, i, i2);
    }
}
