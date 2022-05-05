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
        db.execSQL("CREATE TABLE LOCATION (LOCATION, COUNTRY_INFO, COUNTRY_IMG, COUNTRY_HOTEL, COUNTRY_RESTAURANT, HOTEL_IMG1,HOTEL_IMG2, HOTEL_IMG3, R_IMG1, R_IMG2, R_IMG3);");
        insertLocation(db, "Tokyo, Japan", "Currency: Japanese yen \n" +
                "\n" +
                "Population: 13,960,000 (2021) \n" +
                "\n" +
                "Language: Japanese  \n" +
                "\n" +
                "Time Zone: Japan Standard Time \n" +
                "\n" +
                "Continent: Asia \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Edo-Tokyo Museum \n" +
                "\n" +
                "\t\t2. Tokyo National Museum ", R.drawable.tokyo, "Hotel 1: Tokyo Prince Hotel \n" +
                "\n" +
                "$63/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Hilton Tokyo \n" +
                "\n" +
                "$139/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: HOSHINOYA Tokyo \n" +
                "\n" +
                "$687/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Mugi no Oto \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Teppan Baby Shinjuku \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Itamae Sushi Akasaka \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.tokyo_h_1, R.drawable.tokyo_h_2, R.drawable.tokyo_h_3, R.drawable.tokyo_r_1, R.drawable.tokyo_r_2, R.drawable.tokyo_r_3);
        insertLocation(db, "Los Angeles, California", "Currency: U.S dollar \n" +
                "\n" +
                "Population: 3,967,000 (2019) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Pacific Daylight Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Official Hollywood Sign Hike: Walk to the Hollywood Sign on this LA Tour \n" +
                "\n" +
                "\t\t2. Warner Bros. Studio Tour Hollywood ", R.drawable.los_angeles, "Hotel 1: Freehand Los Angeles \n" +
                "\n" +
                "$39/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Holiday Inn Los Angeles \n" +
                "\n" +
                "$122/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Hampton Inn & Suites \n" +
                "\n" +
                "$375/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Tocaya-Venice \n" +
                "\n" +
                "$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Raffaello Ristorante \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Providence \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.la_h_1, R.drawable.la_h_2, R.drawable.la_h_3, R.drawable.la_r_1, R.drawable.la_r_2, R.drawable.la_r_3);
        insertLocation(db, "Miami, Florida", "Currency: U.S dollar \n" +
                "\n" +
                "Population: 454,279 (2019)  \n" +
                "\n" +
                "Language: English and Spanish \n" +
                "\n" +
                "Time Zone: Eastern Daylight Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "Speedboat Sightseeing Tour of Miami \n" +
                "\n" +
                "\t\t2. Key West Day Trip from Miami with Activities ", R.drawable.miami, "Hotel 1: Embassy Suites by Hilton \n" +
                "\n" +
                "$143/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Hyatt Regency Miami \n" +
                "\n" +
                "$205/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Four Seasons Hotel \n" +
                "\n" +
                "$1,485/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Monty’s Coconut Grove \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: The Capital Grille \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Edge Steak & Bar \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.miami_h_1, R.drawable.miami_h_2, R.drawable.miami_h_3, R.drawable.miami_r_1, R.drawable.miami_r_2, R.drawable.miami_r_3);
        insertLocation(db, "Sydney, Australia", "Currency: Australian dollar (AUD) \n" +
                "\n" +
                "Population: 5,361,466 (2021) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Australian Eastern Standard Time \n" +
                "\n" +
                "Continent: Australia  \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. St. Mary's Cathedral \n" +
                "\n" +
                "\t\t2. Sydney Harbour ", R.drawable.sydney, "Hotel 1: Sydney Boutique Hotel \n" +
                "\n" +
                "$81/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Hilton Sydney \n" +
                "\n" +
                "$194/night \n" +
                "\n" +
                "5-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Park Hyatt Sydney \n" +
                "\n" +
                "$763/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Aria Restaurant Sydney \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Restaurant Hubert \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Bistro Papillon \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.sydney_h_1, R.drawable.sydney_h_2, R.drawable.sydney_h_3, R.drawable.sydney_r_1, R.drawable.sydney_r_2, R.drawable.sydney_r_3);
        insertLocation(db, "London, England", "Currency: pound sterling \n" +
                "\n" +
                "Population: 9,002,488 (2021) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: British Summer Time \n" +
                "\n" +
                "Continent: Europe  \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Stonehenge, Windsor Castle and Bath with Pub Lunch in Lacock \n" +
                "\n" +
                "\t\t2. Warner Bros. Studio Harry Potter Tour with Superior Transport from London ", R.drawable.london, "Hotel 1: The Tower Hotel \n" +
                "\n" +
                "$105/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Hilton London Paddington  \n" +
                "\n" +
                "$138/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Great Scotland Yard Hotel by Hyatt \n" +
                "\n" +
                "$323/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Twist Connubio \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Dinner by Heston Blumenthal \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Restaurant Story \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.london_h_1, R.drawable.london_h_2, R.drawable.london_h_3, R.drawable.london_r_1, R.drawable.london_r_2, R.drawable.london_r_3);
        insertLocation(db, "Paris, France", "Currency: Euro \n" +
                "\n" +
                "Population: 11,078,546 (2021) \n" +
                "\n" +
                "Language: French \n" +
                "\n" +
                "Time Zone: Central European Summer Time \n" +
                "\n" +
                "Continent: Europe \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Eiffel Tower Skip the Line and Small Group Tour with Summit Access by elevator \n" +
                "\n" +
                "\t\t2. Bateaux Parisiens Seine River Gourmet Dinner & Sightseeing Cruise ", R.drawable.paris, "Hotel 1: Best Western Premier Opera Faubourg \n" +
                "\n" +
                "$109/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Warwick Paris \n" +
                "\n" +
                "$217/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Hotel Maison Colbert Member of Melia Collection \n" +
                "\n" +
                "$472/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Le Cinq \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Foyer de la Madeleine \n" +
                "\n" +
                "$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Boutary \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.paris_h_1, R.drawable.paris_h_2, R.drawable.paris_h_3, R.drawable.paris_r_1, R.drawable.paris_r_2, R.drawable.paris_r_3);
        insertLocation(db, "Dubai, UAE", "Currency: UAE Dirham \n" +
                "\n" +
                "Population: 3,430,000 (2021) \n" +
                "\n" +
                "Language: Arabic \n" +
                "\n" +
                "Time Zone: Gulf Standard Time \n" +
                "\n" +
                "Continent: Asia \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Red Dunes Quad Bike, Sandsurf, Camels & BBQ at Al Khayma Camp from Dubai \n" +
                "\n" +
                "\t\t2. Atlantis Aquaventure & Lost Chambers Ticket, Dubai ", R.drawable.dubai, "Hotel 1: Le Meridien Dubai Hotel \n" +
                "\n" +
                "$46/night \n" +
                "\n" +
                "5-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Hilton Dubai The Walk \n" +
                "\n" +
                "$135/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Raffles The Palm Dubai \n" +
                "\n" +
                "$288/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Dinner In The Sky \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Tong Thai \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: The GrillShack \n" +
                "\n" +
                "$$  \n" +
                "\n" +
                "4-star restaurant", R.drawable.dubai_h_1, R.drawable.dubai_h_2, R.drawable.dubai_h_3, R.drawable.dubai_r_1, R.drawable.dubai_r_2, R.drawable.dubai_r_3);
        insertLocation(db, "Athens, Greece", "Currency: Euro \n" +
                "\n" +
                "Population: 3,153,000 (2021) \n" +
                "\n" +
                "Language: Greek \n" +
                "\n" +
                "Time Zone: Eastern European Summer Time \n" +
                "\n" +
                "Continent: Europe \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Full-Day Meteora Tour from Athens by Train \n" +
                "\n" +
                "\t\t2. All Day Cruise -3 Islands to Agistri, Moni, Aegina with lunch and drinks included ", R.drawable.athens, "Hotel 1: Cecil Hotel \n" +
                "\n" +
                "$49/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Grand Hyatt Athens \n" +
                "\n" +
                "$159/night \n" +
                "\n" +
                "5-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: xenodocheio Milos \n" +
                "\n" +
                "$249/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Hytra Restaurant & bar \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Maiandros Restaurant \n" +
                "\n" +
                "$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Arcadua Restaurant \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.athens_h_1, R.drawable.athens_h_2, R.drawable.athens_h_3, R.drawable.athens_r_1, R.drawable.athens_r_2, R.drawable.athens_r_3);
        insertLocation(db, "Cairo, Egypt", "Currency: pound (EGP) \n" +
                "\n" +
                "Population: 21,323,000 (2021) \n" +
                "\n" +
                "Language: Arabic \n" +
                "\n" +
                "Time Zone: Eastern European Standard Time \n" +
                "\n" +
                "Continent: Africa \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. 2-Hour Nile River Night Dinner Cruise From Cairo \n" +
                "\n" +
                "\t\t2. Day Trip To Luxor From Cairo By Plane with Lunch ", R.drawable.cairo, "Hotel 1: Ramses Hilton \n" +
                "\n" +
                "$81/night \n" +
                "\n" +
                "5-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Four Seasons Hotel Cairo \n" +
                "\n" +
                "$140/night \n" +
                "\n" +
                "5-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: The Nile Ritz-Carlton Cairo \n" +
                "\n" +
                "$210/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: The Grill \n" +
                "\n" +
                "$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Abou El Sid Restaurant \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "3-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Le Pacha 1901 \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.cairo_h_1, R.drawable.cairo_h_2, R.drawable.cairo_h_3, R.drawable.cairo_r_1, R.drawable.cairo_r_2, R.drawable.cairo_r_3);
        insertLocation(db, "Boston, Massachusetts", "Currency: U.S dollar \n" +
                "\n" +
                "Population: 4,315,000 (2021) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Eastern Daylight Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Martha's Vineyard Daytrip from Boston with Round-Trip Ferry & Island Tour Option \n" +
                "\n" +
                "\t\t2. Boston Hop-On Hop-Off Trolley Tour with 15 Stops ", R.drawable.boston, "Hotel 1: The Bostonian Boston \n" +
                "\n" +
                "$134/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: DoubleTree Suites by Hilton \n" +
                "\n" +
                "$204/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Mandarin Oriental Boston \n" +
                "\n" +
                "$587/night \n" +
                "\n" +
                "5-star hotel", "Restaurant 1: Blackmoor Bar and Kitchen \n" +
                "\n" +
                "$$  \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Toro \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Saltie Girl \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.boston_h_1, R.drawable.boston_h_2, R.drawable.boston_h_3, R.drawable.boston_r_1, R.drawable.boston_r_2, R.drawable.boston_r_3);
        insertLocation(db, "NYC, New York", "Currency: U.S dollar \n" +
                "\n" +
                "Population: 8,804,190 (2020) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Eastern Daylight Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. New York Dinner Cruise \n" +
                "\n" +
                "\t\t2. New York Manhattan Scenic Helicopter Tour ", R.drawable.nyc, "Hotel 1: The Baltic Hotel \n" +
                "\n" +
                "$85/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: W New York Downtown \n" +
                "\n" +
                "$194/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Embassy Suites by Hilton \n" +
                "\n" +
                "$240/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Gabriel Kreuther \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Hortus NYC \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Scarpetta \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.nyc_h_1, R.drawable.nyc_h_2, R.drawable.nyc_h_3, R.drawable.ny_r_1, R.drawable.ny_r_2, R.drawable.ny_r_3);
        insertLocation(db, "Cancun, Mexico", "Currency: Peso \n" +
                "\n" +
                "Population: 888,797 (2020) \n" +
                "\n" +
                "Language: Spanish \n" +
                "\n" +
                "Time Zone: Eastern Standard Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Best ATV Tour, Ziplines and Cenote Swim with Lunch and Transport Included \n" +
                "\n" +
                "\t\t2. Sailing Experience to Isla Mujeres in a Catamaran with Open Bar ", R.drawable.cancun, "Hotel 1: Hotel Caribe Internacional Cancun \n" +
                "\n" +
                "$31/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Canopy by Hilton Cancun La Isla \n" +
                "\n" +
                "$157/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Marriott Cancun Resort \n" +
                "\n" +
                "$208/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Lorenziollo’s \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Puerto Madero Cancun \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Cambalache \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.cancun_h_1, R.drawable.cancun_h_2, R.drawable.cancun_h_3, R.drawable.cancun_r_1, R.drawable.cancun_r_2, R.drawable.cancun_r_3);
        insertLocation(db, "Honolulu, Hawaii", "Currency: U.S dollar \n" +
                "\n" +
                "Population: 348,985 (2019) \n" +
                "\n" +
                "Language: Hawaiian and English \n" +
                "\n" +
                "Time Zone: Hawaii-Aleutian Standard Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Dolphin Watch and Snorkeling with Hula and Water Activities \n" +
                "\n" +
                "\t\t2. Turtle Canyons Snorkel Excursion from Waikiki, Hawaii ", R.drawable.honolulu, "Hotel 1: Waikiki Monarch Hotel \n" +
                "\n" +
                "$92/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Waikiki Resort Hotel \n" +
                "\n" +
                "$142/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Hilton Waikiki Beach \n" +
                "\n" +
                "$229/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: L&L Hawaiian Barbecue \n" +
                "\n" +
                "$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Fete \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: The Pig and The Lady \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.honolulu_h_1, R.drawable.honolulu_h_2, R.drawable.honolulu_h_3, R.drawable.hawaii_r_1, R.drawable.hawaii_r_2, R.drawable.hawaii_r_3);
        insertLocation(db, "Addu City, Maldives", "Addu City, Maldives \n" +
                "\n" +
                "Currency: Rufiyaa \n" +
                "\n" +
                "Population: 33,694 (2013) \n" +
                "\n" +
                "Language: Dhivehi \n" +
                "\n" +
                "Time Zone: UTC +5 \n" +
                "\n" +
                "Continent: Asia \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Skydive Maldives \n" +
                "\n" +
                "\t\t2. Addu Dive ", R.drawable.addu_city, "Hotel 1: Clovebeach \n" +
                "\n" +
                "$21/night \n" +
                "\n" +
                "5-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Pebbles Inn \n" +
                "\n" +
                "$64/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: South Palm Resort Maldives \n" +
                "\n" +
                "$171/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Palm Village \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Suvadive Cafe \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: South Land Restaurant \n" +
                "\n" +
                "$$  \n" +
                "\n" +
                "3-star restaurant", R.drawable.adducity_h_1, R.drawable.adducity_h_2, R.drawable.adducity_h_3, R.drawable.maldives_r_1, R.drawable.maldives_r_2, R.drawable.maldives_r_3 );
        insertLocation(db, "Toronto, Canada", "Currency: Canadian dollar \n" +
                "\n" +
                "Population: 6,255,000 (2021) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Eastern Daylight Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Niagara Falls Day Tour from Toronto \n" +
                "\n" +
                "\t\t2. 7-Minute Helicopter Tour over Toronto ", R.drawable.toronto, "Hotel 1: Park Inn by Radisson Toronto-Markham \n" +
                "\n" +
                "$68/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Pan Pacific Toronto \n" +
                "\n" +
                "$127/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Sheraton Centre Toronto Hotel \n" +
                "\n" +
                "$231/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Canoe \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Richmond Station \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Michael’s On Simcoe \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.toronto_h_1, R.drawable.toronto_h_2, R.drawable.toronto_h_3, R.drawable.toronto_r_1, R.drawable.toronto_r_2, R.drawable.toronto_r_3);
        insertLocation(db, "Montego Bay, Jamaica", "Currency: Jamaican dollar \n" +
                "\n" +
                "Population: 427,891 (2018) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Eastern Standard Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Chukka Zipline, Tube, & Horse Ride & Swim With Access Pass To Ocean Outpost Park \n" +
                "\n" +
                "\t\t2. Reggae & Snorkeling Catamaran Cruise from Montego Bay ", R.drawable.montego_bay, "Hotel 1: The Blue Orchid \n" +
                "\n" +
                "$75/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Holiday Inn Resort Montego Bay All-Inclusive \n" +
                "\n" +
                "$173/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: S Hotel Jamaica \n" +
                "\n" +
                "$389/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: House Boat Grill Restaurant \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: The Pelican Grill \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Peppa’s Cool Spot \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.jamaica_h_1, R.drawable.jamaica_h_2, R.drawable.jamaica_h_3, R.drawable.jamaica_r_1, R.drawable.jamaica_r_2, R.drawable.jamaica_r_3);
        insertLocation(db, "Istanbul, Turkey", "Currency: Turkish lira \n" +
                "\n" +
                "Population: 15,600,000 (2020) \n" +
                "\n" +
                "Language: Turkish \n" +
                "\n" +
                "Time Zone: GMT+03:00 \n" +
                "\n" +
                "Continent: Europe/Asia \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Bosphorus Sunset Cruise on Luxury Yacht \n" +
                "\n" +
                "\t\t2. Cappadocia Dream - 2 Days Cappadocia Travel with Balloon Ride from/to Istanbul ", R.drawable.istanbul, "Hotel 1: Cheers Lighthouse \n" +
                "\n" +
                "$26/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: The Artisan Istanbul MGallery \n" +
                "\n" +
                "$86/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Skalion Hotel & Spa \n" +
                "\n" +
                "$105/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Toro Latin Gastro Bar \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Resto Han \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "5-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Bitlisli \n" +
                "\n" +
                "$$ - $$$ \n" +
                "\n" +
                "5-star restaurant", R.drawable.turkey_h_1, R.drawable.turkey_h_2, R.drawable.turkey_h_3, R.drawable.turkey_r_1, R.drawable.turkey_r_2, R.drawable.turkey_r_3);
        insertLocation(db, "Lahore, Pakistan", "Lahore, Pakistan \n" +
                "\n" +
                "Currency: Pakistani rupee \n" +
                "\n" +
                "Population: 12,642,000 (2020) \n" +
                "\n" +
                "Language: Urdu \n" +
                "\n" +
                "Time Zone: Pakistan Standard Time \n" +
                "\n" +
                "Continent: Asia \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Lahore One Day Sightseeing Tour  \n" +
                "\n" +
                "\t\t2. Lahore Walled City Walking Tour  ", R.drawable.lahore, "Hotel 1: Second Home Hotel Lahore \n" +
                "\n" +
                "$9/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: The Nashat Hotel \n" +
                "\n" +
                "$78/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Pearl Continental Hotel \n" +
                "\n" +
                "$110/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Haveli Restaurant \n" +
                "\n" +
                "$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Andaaz Restaurant \n" +
                "\n" +
                "$$$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Monal Restaurant \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.lahore_h_1, R.drawable.lahore_h_2, R.drawable.lahore_h_3, R.drawable.lahore_r_1, R.drawable.lahore_r_2, R.drawable.lahore_r_3);
        insertLocation(db, "Nassau, Bahamas", "Currency: Bahamian dollar \n" +
                "\n" +
                "Population: 266,100 (2016) \n" +
                "\n" +
                "Language: English \n" +
                "\n" +
                "Time Zone: Eastern Daylight Time \n" +
                "\n" +
                "Continent: North America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Pearl Island Escape incl. Snorkeling Experience with Lunch \n" +
                "\n" +
                "\t\t2. Swimming Pigs Full Day Exuma Boat Tour ", R.drawable.nassau, "Hotel 1: Hibiscus Inn Hotel \n" +
                "\n" +
                "$94/night \n" +
                "\n" +
                "3-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Courtyard by Marriott Nassau Downtown/Junkanoo Beach \n" +
                "\n" +
                "$176/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: The Cove at Atlantis \n" +
                "\n" +
                "$600/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: Bahamian Cookin’ Restaurant and Bar \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: La Caverna \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Meze Grill \n" +
                "\n" +
                "$$  \n" +
                "\n" +
                "4-star restaurant", R.drawable.bahamas_h_1, R.drawable.bahamas_h_2, R.drawable.bahamas_h_3, R.drawable.bahamas_r_1, R.drawable.bahamas_r_2, R.drawable.bahamas_r_3);
        insertLocation(db, "San Jose, Costa Rica", "Currency: Colon \n" +
                "\n" +
                "Population: 339,581 (2017) \n" +
                "\n" +
                "Language: Spanish \n" +
                "\n" +
                "Time Zone: Central Standard Time \n" +
                "\n" +
                "Continent: Central America \n" +
                "\n" +
                "Tourist Attractions: \n" +
                "\n" +
                "\t\t1. Tamarindo Snorkel & Sunset Cruise with Lunch \n" +
                "\n" +
                "\t\t2. Full Day Jaco Jungle Adventure Pass", R.drawable.san_jose, "Hotel 1: Hotel Colonial CR \n" +
                "\n" +
                "$47/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 2: Hotel Barcelo San Jose \n" +
                "\n" +
                "$65/night \n" +
                "\n" +
                "4-star hotel \n" +
                "\n" +
                "\n" +
                "\n" +
                "Hotel 3: Hotel Presidente- San Jose, Costa Rica \n" +
                "\n" +
                "$104/night \n" +
                "\n" +
                "4-star hotel", "Restaurant 1: La Criollita \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 2: Tenedor Argentino \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant \n" +
                "\n" +
                " \n" +
                "\n" +
                "Restaurant 3: Lubnan \n" +
                "\n" +
                "$$ \n" +
                "\n" +
                "4-star restaurant", R.drawable.sanjose_h_1, R.drawable.sanjose_h_2, R.drawable.sanjose_h_3, R.drawable.cr_r_1, R.drawable.cr_r_2, R.drawable.cr_r_3);
    }

    public static void insertLocation(SQLiteDatabase db, String loc, String countryInfo, int countryImg, String countryHotel, String countryRestaurant, int hotelImg1, int hotelImg2, int hotelImg3, int rImg1, int rImg2, int rImg3) {
        ContentValues locValues = new ContentValues();
        locValues.put("LOCATION", loc);
        locValues.put("COUNTRY_INFO", countryInfo);
        locValues.put("COUNTRY_IMG", countryImg);
        locValues.put("COUNTRY_HOTEL", countryHotel);
        locValues.put("COUNTRY_RESTAURANT", countryRestaurant);
        locValues.put("HOTEL_IMG1", hotelImg1);
        locValues.put("HOTEL_IMG2", hotelImg2);
        locValues.put("HOTEL_IMG3", hotelImg3);
        locValues.put("R_IMG1", rImg1);
        locValues.put("R_IMG2", rImg2);
        locValues.put("R_IMG3", rImg3);
        db.insert("LOCATION", null, locValues);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    public void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
