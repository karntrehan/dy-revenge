package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.facebook.react.modules.storage.c */
public class C2877c extends SQLiteOpenHelper {

    /* renamed from: f */
    private static C2877c f8076f;

    /* renamed from: o */
    private Context f8077o;

    /* renamed from: p */
    private SQLiteDatabase f8078p;

    /* renamed from: q */
    private long f8079q = 6291456;

    private C2877c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f8077o = context;
    }

    /* renamed from: E */
    public static C2877c m11349E(Context context) {
        if (f8076f == null) {
            f8076f = new C2877c(context.getApplicationContext());
        }
        return f8076f;
    }

    /* renamed from: h */
    private synchronized void m11350h() {
        SQLiteDatabase sQLiteDatabase = this.f8078p;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f8078p.close();
            this.f8078p = null;
        }
    }

    /* renamed from: o */
    private synchronized boolean m11351o() {
        m11350h();
        return this.f8077o.deleteDatabase("RKStorage");
    }

    /* renamed from: A */
    public synchronized SQLiteDatabase mo9245A() {
        mo9250r();
        return this.f8078p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9246a() {
        mo9245A().delete("catalystLocalStorage", (String) null, (String[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw new java.lang.RuntimeException("Clearing and deleting database RKStorage failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (m11351o() != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p174e.p247e.p253d.p258e.C6071a.m22868b("ReactNative", "Deleted Local Database RKStorage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9247b() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.mo9246a()     // Catch:{ Exception -> 0x0012 }
            r2.m11350h()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Cleaned RKStorage"
            p174e.p247e.p253d.p258e.C6071a.m22868b(r0, r1)     // Catch:{ Exception -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            goto L_0x0029
        L_0x0012:
            boolean r0 = r2.m11351o()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Deleted Local Database RKStorage"
            p174e.p247e.p253d.p258e.C6071a.m22868b(r0, r1)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            return
        L_0x0021:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "Clearing and deleting database RKStorage failed"
            r0.<init>(r1)     // Catch:{ all -> 0x0010 }
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0029:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.C2877c.mo9247b():void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m11351o();
            onCreate(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|19|20|34|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x002d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0026 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo9250r() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r5.f8078p     // Catch:{ all -> 0x003c }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r5)
            return r1
        L_0x000e:
            r0 = 0
            r2 = 0
        L_0x0010:
            r3 = 2
            if (r2 >= r3) goto L_0x0030
            if (r2 <= 0) goto L_0x0018
            r5.m11351o()     // Catch:{ SQLiteException -> 0x001f }
        L_0x0018:
            android.database.sqlite.SQLiteDatabase r3 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x001f }
            r5.f8078p = r3     // Catch:{ SQLiteException -> 0x001f }
            goto L_0x0030
        L_0x001f:
            r0 = move-exception
            r3 = 30
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003c }
            r3.interrupt()     // Catch:{ all -> 0x003c }
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0030:
            android.database.sqlite.SQLiteDatabase r2 = r5.f8078p     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003b
            long r3 = r5.f8079q     // Catch:{ all -> 0x003c }
            r2.setMaximumSize(r3)     // Catch:{ all -> 0x003c }
            monitor-exit(r5)
            return r1
        L_0x003b:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.C2877c.mo9250r():boolean");
    }
}
