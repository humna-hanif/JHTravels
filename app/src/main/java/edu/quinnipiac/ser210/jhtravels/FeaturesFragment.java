//Authors: Julia Woeste and Humna Hanif
//SER210
//May 4th 2022
//implementation buttons on features screen
package edu.quinnipiac.ser210.jhtravels;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FeaturesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeaturesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private NavController navController;


    public FeaturesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FeaturesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FeaturesFragment newInstance(String param1, String param2) {
        FeaturesFragment fragment = new FeaturesFragment();
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
        return inflater.inflate(R.layout.fragment_features, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
    }


    //gets all three buttons on the features screen and sets an on click listener for the button
    @Override
    public void onStart() {
        super.onStart();
        getView().findViewById(R.id.locBtn).setOnClickListener(this::onClick);
        getView().findViewById(R.id.resturantBtn).setOnClickListener(this::onClick);
        getView().findViewById(R.id.hotelBtn).setOnClickListener(this::onClick);
    }

    //on click method, when the user clicked on the specific button the nav controller goes to specific fragment while getting location from spinner
    public void onClick(View view) {
        if (view.getId() == R.id.locBtn) {
            Bundle bundle = new Bundle();
            bundle.putString("spinnerValue", getArguments().getString("spinnerValue"));
            navController.navigate(R.id.action_featuresFragment_to_locationInfoFragment, bundle);
        } else if (view.getId() == R.id.resturantBtn) {
            Bundle bundle = new Bundle();
            bundle.putString("spinnerValue", getArguments().getString("spinnerValue"));
            navController.navigate(R.id.action_featuresFragment_to_restaurantsFragment, bundle);
        } else if (view.getId() == R.id.hotelBtn) {
            Bundle bundle = new Bundle();
            bundle.putString("spinnerValue", getArguments().getString("spinnerValue"));
            navController.navigate(R.id.action_featuresFragment_to_hotelRatesFragment, bundle);
        }
    }
}