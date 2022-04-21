package edu.quinnipiac.ser210.jhtravels;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    NavController navController = null;
    private Spinner s;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        String[] arraySpinner = new String[]{
                "Tokyo, Japan", "Los Angeles, California", "Miami, Florida", "Sydney, Australia", "London, England", "Paris, France", "Dubai, UAE", "Athens, Greece", "Cairo, Egypt", "Boston, Massachusetts", "NYC, New York", "Cancun, Mexico", "Honolulu, Hawaii", "Addu City, Maldives", "Toronto, Canada", "Montego Bay, Jamaica", "Istanbul, Turkey", "Lahore, Pakistan", "Nassau, Bahamas", "San Jose, Costa Rica"
        };
        s = (Spinner) getView().findViewById(R.id.locSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        getView().findViewById(R.id.enterBtn).setOnClickListener(this::onClick);
        getView().findViewById(R.id.backBtn1).setOnClickListener(this::onClick);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.enterBtn) {
            navController.navigate(R.id.action_mainFragment_to_featuresFragment);
            //String text = s.getSelectedItem().toString();
        } else if (view.getId() == R.id.backBtn1) {
            navController.navigate(R.id.action_mainFragment_to_splashScreenFragment);
        }
    }
}