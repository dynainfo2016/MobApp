package Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import Model.Data.User;

/**
 * Created by MACHINE on 07/02/2016.
 */
public class dbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MobApp.db";

    public dbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_MobApp());
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_MobApp());
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    private String SQL_CREATE_MobApp()
    {
        String SQL_CREATE_MobApp="";
        SQL_CREATE_MobApp+= User.SQL_CREATE_USER;
        return SQL_CREATE_MobApp;
    }

    private String SQL_DELETE_MobApp()
    {
        String SQL_CREATE_MobApp="";
        SQL_CREATE_MobApp+= User.SQL_DELETE_USER;
        return SQL_CREATE_MobApp;
    }
}
