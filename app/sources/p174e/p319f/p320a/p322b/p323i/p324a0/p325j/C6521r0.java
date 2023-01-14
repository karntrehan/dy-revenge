package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.p323i.C6572i;
import p174e.p319f.p320a.p322b.p323i.C6573j;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6546a;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p328d0.C6563a;
import p174e.p319f.p320a.p322b.p323i.p329w.C6592a;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6597a;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6599b;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6601c;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6604d;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6606e;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6608f;
import p174e.p319f.p320a.p322b.p323i.p333y.C6610a;

/* renamed from: e.f.a.b.i.a0.j.r0 */
public class C6521r0 implements C6501j0, C6547b, C6499i0 {

    /* renamed from: f */
    private static final C6463b f18087f = C6463b.m24863b("proto");

    /* renamed from: o */
    private final C6529t0 f18088o;

    /* renamed from: p */
    private final C6552a f18089p;

    /* renamed from: q */
    private final C6552a f18090q;

    /* renamed from: r */
    private final C6503k0 f18091r;

    /* renamed from: s */
    private final C6592a<String> f18092s;

    /* renamed from: e.f.a.b.i.a0.j.r0$b */
    interface C6523b<T, U> {
        U apply(T t);
    }

    /* renamed from: e.f.a.b.i.a0.j.r0$c */
    private static class C6524c {

        /* renamed from: a */
        final String f18093a;

        /* renamed from: b */
        final String f18094b;

        private C6524c(String str, String str2) {
            this.f18093a = str;
            this.f18094b = str2;
        }
    }

    /* renamed from: e.f.a.b.i.a0.j.r0$d */
    interface C6525d<T> {
        /* renamed from: a */
        T mo19255a();
    }

    C6521r0(C6552a aVar, C6552a aVar2, C6503k0 k0Var, C6529t0 t0Var, C6592a<String> aVar3) {
        this.f18088o = t0Var;
        this.f18089p = aVar;
        this.f18090q = aVar2;
        this.f18091r = k0Var;
        this.f18092s = aVar3;
    }

    /* renamed from: A */
    private void m24960A(SQLiteDatabase sQLiteDatabase) {
        m24994l1(new C6488e(sQLiteDatabase), C6482b.f18035a);
    }

    /* renamed from: B0 */
    static /* synthetic */ Object m24962B0(Throwable th) {
        throw new C6546a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: C0 */
    static /* synthetic */ SQLiteDatabase m24963C0(Throwable th) {
        throw new C6546a("Timed out while trying to open db.", th);
    }

    /* renamed from: D0 */
    static /* synthetic */ Long m24964D0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* renamed from: E */
    private long m24965E(SQLiteDatabase sQLiteDatabase, C6583p pVar) {
        Long n0 = m24996n0(sQLiteDatabase, pVar);
        if (n0 != null) {
            return n0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.mo19356b());
        contentValues.put("priority", Integer.valueOf(C6563a.m25102a(pVar.mo19358d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.mo19357c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.mo19357c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* renamed from: F0 */
    static /* synthetic */ C6608f m24967F0(long j, SQLiteDatabase sQLiteDatabase) {
        return (C6608f) m24998o1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C6484c(j));
    }

    /* renamed from: G0 */
    static /* synthetic */ Long m24968G0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public /* synthetic */ Boolean mo19293I0(C6583p pVar, SQLiteDatabase sQLiteDatabase) {
        Long n0 = m24996n0(sQLiteDatabase, pVar);
        if (n0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m24998o1(mo19294L().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n0.toString()}), C6489e0.f18043a);
    }

    /* renamed from: J0 */
    static /* synthetic */ List m24970J0(SQLiteDatabase sQLiteDatabase) {
        return (List) m24998o1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C6496h.f18058a);
    }

    /* renamed from: K0 */
    static /* synthetic */ List m24971K0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C6583p.m25165a().mo19362b(cursor.getString(1)).mo19364d(C6563a.m25103b(cursor.getInt(2))).mo19363c(m24991i1(cursor.getString(3))).mo19361a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ List mo19295M0(C6583p pVar, SQLiteDatabase sQLiteDatabase) {
        List<C6519q0> g1 = m24988g1(sQLiteDatabase, pVar);
        return m25001v0(g1, m24989h1(sQLiteDatabase, g1));
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ C6597a mo19296O0(Map map, C6597a.C6598a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C6601c.C6603b r = m24999r(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C6601c.m25216c().mo19414c(r).mo19413b(j).mo19412a());
        }
        m24992j1(aVar, map);
        aVar.mo19406e(m24990i0());
        aVar.mo19405d(m24978W());
        aVar.mo19404c(this.f18092s.get());
        return aVar.mo19403b();
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ C6597a mo19297Q0(String str, Map map, C6597a.C6598a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C6597a) m24998o1(sQLiteDatabase.rawQuery(str, new String[0]), new C6531u(this, map, aVar));
    }

    /* renamed from: R0 */
    private /* synthetic */ Object m24975R0(List list, C6583p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C6573j.C6574a k = C6573j.m25122a().mo19337j(cursor.getString(1)).mo19336i(cursor.getLong(2)).mo19338k(cursor.getLong(3));
            k.mo19335h(z ? new C6572i(m24995m1(cursor.getString(4)), cursor.getBlob(5)) : new C6572i(m24995m1(cursor.getString(4)), m24993k1(j)));
            if (!cursor.isNull(6)) {
                k.mo19334g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C6519q0.m24956a(j, pVar, k.mo19331d()));
        }
        return null;
    }

    /* renamed from: T0 */
    static /* synthetic */ Object m24976T0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C6524c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ Long mo19299V0(C6573j jVar, C6583p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m25000u0()) {
            mo19278o(1, C6601c.C6603b.CACHE_FULL, jVar.mo19328j());
            return -1L;
        }
        long E = m24965E(sQLiteDatabase, pVar);
        int e = this.f18091r.mo19259e();
        byte[] a = jVar.mo19324e().mo19370a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(E));
        contentValues.put("transport_name", jVar.mo19328j());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.mo19326f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.mo19329k()));
        contentValues.put("payload_encoding", jVar.mo19324e().mo19371b().mo19239a());
        contentValues.put("code", jVar.mo19323d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : jVar.mo19378i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: W */
    private C6599b m24978W() {
        return C6599b.m25212b().mo19409b(C6606e.m25229c().mo19423b(mo19292I()).mo19424c(C6503k0.f18068a.mo19261f()).mo19422a()).mo19408a();
    }

    /* renamed from: W0 */
    static /* synthetic */ byte[] m24979W0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: X */
    private long m24980X() {
        return mo19294L().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: X0 */
    private /* synthetic */ Object m24981X0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo19278o((long) i, C6601c.C6603b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: Z0 */
    private /* synthetic */ Object m24982Z0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m24998o1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C6533v(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: b1 */
    static /* synthetic */ Boolean m24983b1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: c1 */
    static /* synthetic */ Object m24984c1(String str, C6601c.C6603b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m24998o1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo14892d())}), C6536y.f18124a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo14892d()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo14892d())});
        }
        return null;
    }

    /* renamed from: d1 */
    static /* synthetic */ Object m24985d1(long j, C6583p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.mo19356b(), String.valueOf(C6563a.m25102a(pVar.mo19358d()))}) < 1) {
            contentValues.put("backend_name", pVar.mo19356b());
            contentValues.put("priority", Integer.valueOf(C6563a.m25102a(pVar.mo19358d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: e0 */
    private long m24986e0() {
        return mo19294L().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: e1 */
    private /* synthetic */ Object m24987e1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f18089p.mo19339a()).execute();
        return null;
    }

    /* renamed from: g1 */
    private List<C6519q0> m24988g1(SQLiteDatabase sQLiteDatabase, C6583p pVar) {
        ArrayList arrayList = new ArrayList();
        Long n0 = m24996n0(sQLiteDatabase, pVar);
        if (n0 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m24998o1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{n0.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f18091r.mo19258d())), new C6512o(this, arrayList, pVar));
        return arrayList;
    }

    /* renamed from: h1 */
    private Map<Long, Set<C6524c>> m24989h1(SQLiteDatabase sQLiteDatabase, List<C6519q0> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo19271c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m24998o1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C6528t(hashMap));
        return hashMap;
    }

    /* renamed from: i0 */
    private C6608f m24990i0() {
        return (C6608f) mo19305s0(new C6505l(this.f18089p.mo19339a()));
    }

    /* renamed from: i1 */
    private static byte[] m24991i1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: j1 */
    private void m24992j1(C6597a.C6598a aVar, Map<String, List<C6601c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.mo19402a(C6604d.m25223c().mo19419c((String) next.getKey()).mo19418b((List) next.getValue()).mo19417a());
        }
    }

    /* renamed from: k1 */
    private byte[] m24993k1(long j) {
        return (byte[]) m24998o1(mo19294L().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C6492g.f18047a);
    }

    /* renamed from: l1 */
    private <T> T m24994l1(C6525d<T> dVar, C6523b<Throwable, T> bVar) {
        long a = this.f18090q.mo19339a();
        while (true) {
            try {
                return dVar.mo19255a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f18090q.mo19339a() >= ((long) this.f18091r.mo19256b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: m1 */
    private static C6463b m24995m1(String str) {
        return str == null ? f18087f : C6463b.m24863b(str);
    }

    /* renamed from: n0 */
    private Long m24996n0(SQLiteDatabase sQLiteDatabase, C6583p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.mo19356b(), String.valueOf(C6563a.m25102a(pVar.mo19358d()))}));
        if (pVar.mo19357c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.mo19357c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m24998o1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C6518q.f18083a);
    }

    /* renamed from: n1 */
    private static String m24997n1(Iterable<C6519q0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C6519q0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo19271c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: o1 */
    static <T> T m24998o1(Cursor cursor, C6523b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: r */
    private C6601c.C6603b m24999r(int i) {
        C6601c.C6603b bVar = C6601c.C6603b.REASON_UNKNOWN;
        if (i == bVar.mo14892d()) {
            return bVar;
        }
        C6601c.C6603b bVar2 = C6601c.C6603b.MESSAGE_TOO_OLD;
        if (i == bVar2.mo14892d()) {
            return bVar2;
        }
        C6601c.C6603b bVar3 = C6601c.C6603b.CACHE_FULL;
        if (i == bVar3.mo14892d()) {
            return bVar3;
        }
        C6601c.C6603b bVar4 = C6601c.C6603b.PAYLOAD_TOO_BIG;
        if (i == bVar4.mo14892d()) {
            return bVar4;
        }
        C6601c.C6603b bVar5 = C6601c.C6603b.MAX_RETRIES_REACHED;
        if (i == bVar5.mo14892d()) {
            return bVar5;
        }
        C6601c.C6603b bVar6 = C6601c.C6603b.INVALID_PAYLOD;
        if (i == bVar6.mo14892d()) {
            return bVar6;
        }
        C6601c.C6603b bVar7 = C6601c.C6603b.SERVER_ERROR;
        if (i == bVar7.mo14892d()) {
            return bVar7;
        }
        C6610a.m25242b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* renamed from: u0 */
    private boolean m25000u0() {
        return m24980X() * m24986e0() >= this.f18091r.mo19261f();
    }

    /* renamed from: v0 */
    private List<C6519q0> m25001v0(List<C6519q0> list, Map<Long, Set<C6524c>> map) {
        ListIterator<C6519q0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C6519q0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo19271c()))) {
                C6573j.C6574a l = next.mo19270b().mo19379l();
                for (C6524c cVar : map.get(Long.valueOf(next.mo19271c()))) {
                    l.mo19382c(cVar.f18093a, cVar.f18094b);
                }
                listIterator.set(C6519q0.m24956a(next.mo19271c(), next.mo19272d(), l.mo19331d()));
            }
        }
        return list;
    }

    /* renamed from: w0 */
    private /* synthetic */ Object m25002w0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo19278o((long) i, C6601c.C6603b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ Integer mo19307z0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m24998o1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C6500j(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public long mo19292I() {
        return m24980X() * m24986e0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public SQLiteDatabase mo19294L() {
        C6529t0 t0Var = this.f18088o;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) m24994l1(new C6491f0(t0Var), C6480a.f18033a);
    }

    /* renamed from: S0 */
    public /* synthetic */ Object mo19298S0(List list, C6583p pVar, Cursor cursor) {
        m24975R0(list, pVar, cursor);
        return null;
    }

    /* renamed from: Y0 */
    public /* synthetic */ Object mo19300Y0(Cursor cursor) {
        m24981X0(cursor);
        return null;
    }

    /* renamed from: a */
    public void mo19276a() {
        mo19305s0(new C6515p(this));
    }

    /* renamed from: a1 */
    public /* synthetic */ Object mo19301a1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m24982Z0(str, str2, sQLiteDatabase);
        return null;
    }

    /* renamed from: b */
    public <T> T mo19302b(C6547b.C6548a<T> aVar) {
        SQLiteDatabase L = mo19294L();
        m24960A(L);
        try {
            T execute = aVar.execute();
            L.setTransactionSuccessful();
            return execute;
        } finally {
            L.endTransaction();
        }
    }

    /* renamed from: c0 */
    public C6519q0 mo19279c0(C6583p pVar, C6573j jVar) {
        C6610a.m25243c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.mo19358d(), jVar.mo19328j(), pVar.mo19356b());
        long longValue = ((Long) mo19305s0(new C6526s(this, jVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C6519q0.m24956a(longValue, pVar, jVar);
    }

    public void close() {
        this.f18088o.close();
    }

    /* renamed from: f0 */
    public long mo19280f0(C6583p pVar) {
        return ((Long) m24998o1(mo19294L().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.mo19356b(), String.valueOf(C6563a.m25102a(pVar.mo19358d()))}), C6507m.f18070a)).longValue();
    }

    /* renamed from: f1 */
    public /* synthetic */ Object mo19304f1(SQLiteDatabase sQLiteDatabase) {
        m24987e1(sQLiteDatabase);
        return null;
    }

    /* renamed from: h */
    public C6597a mo19277h() {
        return (C6597a) mo19305s0(new C6510n(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C6597a.m25201e()));
    }

    /* renamed from: h0 */
    public boolean mo19281h0(C6583p pVar) {
        return ((Boolean) mo19305s0(new C6502k(this, pVar))).booleanValue();
    }

    /* renamed from: i */
    public int mo19282i() {
        return ((Integer) mo19305s0(new C6534w(this, this.f18089p.mo19339a() - this.f18091r.mo19257c()))).intValue();
    }

    /* renamed from: k0 */
    public void mo19283k0(Iterable<C6519q0> iterable) {
        if (iterable.iterator().hasNext()) {
            mo19305s0(new C6520r(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m24997n1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: n */
    public void mo19284n(Iterable<C6519q0> iterable) {
        if (iterable.iterator().hasNext()) {
            mo19294L().compileStatement("DELETE FROM events WHERE _id in " + m24997n1(iterable)).execute();
        }
    }

    /* renamed from: o */
    public void mo19278o(long j, C6601c.C6603b bVar, String str) {
        mo19305s0(new C6498i(str, bVar, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public <T> T mo19305s0(C6523b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase L = mo19294L();
        L.beginTransaction();
        try {
            T apply = bVar.apply(L);
            L.setTransactionSuccessful();
            return apply;
        } finally {
            L.endTransaction();
        }
    }

    /* renamed from: t */
    public Iterable<C6519q0> mo19285t(C6583p pVar) {
        return (Iterable) mo19305s0(new C6486d(this, pVar));
    }

    /* renamed from: v */
    public void mo19286v(C6583p pVar, long j) {
        mo19305s0(new C6490f(j, pVar));
    }

    /* renamed from: x0 */
    public /* synthetic */ Object mo19306x0(Cursor cursor) {
        m25002w0(cursor);
        return null;
    }

    /* renamed from: y */
    public Iterable<C6583p> mo19287y() {
        return (Iterable) mo19305s0(C6535x.f18123a);
    }
}
