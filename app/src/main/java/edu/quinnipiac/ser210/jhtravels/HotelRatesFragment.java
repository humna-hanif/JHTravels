//Authors: Julia Woeste and Humna Hanif
//SER210
//May 4th 2022
//displays hotel name and rates in specific location
package edu.quinnipiac.ser210.jhtravels;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HotelRatesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelRatesFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HotelRatesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HotelRatesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HotelRatesFragment newInstance(String param1, String param2) {
        HotelRatesFragment fragment = new HotelRatesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //creates fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel_rates, container, false);
    }

    //fills the text view and image view with correct information from the database unique to location
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SQLiteOpenHelper dbHelper = new DbHelper(getContext());
        try {
            SQLiteDatabase db = dbHelper.getReadableDatabase();
            Cursor cursor = db.query("LOCATION", new String[]{"LOCATION","COUNTRY_INFO", "COUNTRY_IMG", "COUNTRY_HOTEL", "COUNTRY_RESTAURANT", "HOTEL_IMG1","HOTEL_IMG2", "HOTEL_IMG3", "R_IMG1", "R_IMG2", "R_IMG3"}, "LOCATION = ?", new String[]{getArguments().getString("spinnerValue")}, null, null, null);
            cursor.moveToFirst();
            TextView textView = (TextView) view.findViewById(R.id.hotelInfo);
            textView.setText(cursor.getString(3));
            ImageView img1 = (ImageView) view.findViewById(R.id.h1);
            int photoId1 = cursor.getInt(5);
            img1.setImageResource(photoId1);
            ImageView img2 = (ImageView) view.findViewById(R.id.h2);
            int photoId2 = cursor.getInt(6);
            img2.setImageResource(photoId2);
            ImageView img3 = (ImageView) view.findViewById(R.id.h3);
            int photoId3 = cursor.getInt(7);
            img3.setImageResource(photoId3);

        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(getContext(), "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}