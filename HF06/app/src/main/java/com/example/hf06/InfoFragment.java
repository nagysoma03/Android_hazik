package com.example.hf06;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class InfoFragment extends Fragment {

    private String selectedCurrency;
    private String buyRate;
    private String sellRate;

    public InfoFragment() {
        // Required empty public constructor
    }

    public static InfoFragment newInstance(String currency, String buyRate, String sellRate) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        args.putString("selected_currency", currency);
        args.putString("buy_rate", buyRate);
        args.putString("sell_rate", sellRate);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            selectedCurrency = getArguments().getString("selected_currency");
            buyRate = getArguments().getString("buy_rate");
            sellRate = getArguments().getString("sell_rate");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        TextView currencyTextView = view.findViewById(R.id.currencyName);
        TextView buyTextView = view.findViewById(R.id.buyRate);
        TextView sellTextView = view.findViewById(R.id.sellRate);

        currencyTextView.setText(selectedCurrency);
        buyTextView.setText("Buy Rate: " + buyRate + " RON");
        sellTextView.setText("Sell Rate: " + sellRate + " RON");

        Button back = view.findViewById(R.id.btnBack);
        back.setOnClickListener(v -> getActivity().getSupportFragmentManager().popBackStack());

        return view;
    }
}
