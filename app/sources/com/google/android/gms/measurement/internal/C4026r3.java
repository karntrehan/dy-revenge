package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
final class C4026r3 extends SQLiteOpenHelper {

    /* renamed from: f */
    final /* synthetic */ C4038s3 f11225f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4026r3(C4038s3 s3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f11225f = s3Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f11225f.f10651a.mo11935b().mo12544r().mo12476a("Opening the local database failed, dropping and recreating it");
            this.f11225f.f10651a.mo12181z();
            if (!this.f11225f.f10651a.mo11938f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f11225f.f10651a.mo11935b().mo12544r().mo12477b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f11225f.f10651a.mo11935b().mo12544r().mo12477b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C3986o.m15104b(this.f11225f.f10651a.mo11935b(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C3986o.m15103a(this.f11225f.f10651a.mo11935b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
