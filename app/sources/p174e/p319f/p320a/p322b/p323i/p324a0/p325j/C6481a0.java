package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import android.database.sqlite.SQLiteDatabase;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6529t0;

/* renamed from: e.f.a.b.i.a0.j.a0 */
public final /* synthetic */ class C6481a0 implements C6529t0.C6530a {

    /* renamed from: a */
    public static final /* synthetic */ C6481a0 f18034a = new C6481a0();

    private /* synthetic */ C6481a0() {
    }

    /* renamed from: a */
    public final void mo19254a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
