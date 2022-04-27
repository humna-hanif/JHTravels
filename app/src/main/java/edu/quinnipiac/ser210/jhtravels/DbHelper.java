package edu.quinnipiac.ser210.jhtravels;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.Image;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "location"; // name of the database
    private static final int DB_VERSION = 2; // version of the database

    public DbHelper (Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE LOCATION (LOCATION, COUNTRY_INFO, COUNTRY_IMG);");
        insertLocation(db, "Tokyo, Japan", "JP", R.drawable.tokyo);
        insertLocation(db, "Los Angeles, California", "US", R.drawable.los_angeles);
        insertLocation(db, "Miami, Florida", "US", R.drawable.miami);
        insertLocation(db, "Sydney, Australia", "AUS", R.drawable.sydney);
        insertLocation(db,"London, England", "GBR", R.drawable.london);
        insertLocation(db,"Paris, France", "FRA", R.drawable.paris);
        insertLocation(db,"Dubai, UAE", "ARE", R.drawable.dubai);
        insertLocation(db,"Athens, Greece", "GRC", R.drawable.athens);
        insertLocation(db,"Cairo, Egypt", "EGY", R.drawable.cairo);
        insertLocation(db,"Boston, Massachusetts", "US", R.drawable.boston);
        insertLocation(db,"NYC, New York", "US", R.drawable.nyc);
        insertLocation(db,"Cancun, Mexico", "MEX", R.drawable.cancun);
        insertLocation(db, "Honolulu, Hawaii", "US", R.drawable.honolulu);
        insertLocation(db, "Addu City, Maldives", "MDV", R.drawable.addu_city);
        insertLocation(db,"Toronto, Canada", "CAN", R.drawable.toronto);
        insertLocation(db,"Montego Bay, Jamaica", "JAM", R.drawable.montego_bay);
        insertLocation(db, "Istanbul, Turkey", "TUR", R.drawable.istanbul);
        insertLocation(db,"Lahore, Pakistan", "PAK", R.drawable.lahore);
        insertLocation(db,"Nassau, Bahamas", "BHS", R.drawable.nassau);
        insertLocation(db,"San Jose, Costa Rica", "CRI", R.drawable.san_jose);
    }

    public static void insertLocation(SQLiteDatabase db, String loc, String countryInfo, int countryImg) {
        ContentValues locValues = new ContentValues();
        locValues.put("LOCATION", loc);
        locValues.put("COUNTRY_INFO", countryInfo);
        locValues.put("COUNTRY_IMG", countryImg);
        db.insert("LOCATION", null, locValues);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    public void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
