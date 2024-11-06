package com.example.hf06;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ListFragment extends Fragment {

    String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    String[] buyArray = {"4.4100", "3.9750", "6.1250", "2.9600", "3.0950", "4.2300", "0.5850", "0.0136"};
    String[] sellArray = {"4.5500", "4.1450", "6.3550", "3.0600", "3.2650", "4.3300", "0.6150", "0.0146"};
    int[] flagsArray = {R.drawable.eur, R.drawable.usd, R.drawable.gbp, R.drawable.aud, R.drawable.cad, R.drawable.chf, R.drawable.dkk, R.drawable.huf};

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = view.findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getContext(), flagsArray, sellArray, buyArray, nameArray);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            String selectedCurrency = nameArray[position];
            String buyRate = buyArray[position];
            String sellRate = sellArray[position];

            InfoFragment fragment2 = InfoFragment.newInstance(selectedCurrency, buyRate, sellRate);

            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.listFragment, fragment2);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        });

        return view;
    }
}
