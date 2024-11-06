package com.example.hf06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] currency;
    private String[] buy;
    private String[] sell;
    private int[] flags;

    public CustomAdapter(Context context, int[] flags, String[] sell, String[] buy, String[] currency) {
        this.context = context;
        this.flags = flags;
        this.sell = sell;
        this.buy = buy;
        this.currency = currency;
    }

    @Override
    public int getCount() {
        return currency.length;
    }

    @Override
    public Object getItem(int position) {
        return currency[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView flagImg = listItem.findViewById(R.id.flagID);
        TextView currencyName = listItem.findViewById(R.id.currencyID);
        TextView currencyInfo = listItem.findViewById(R.id.currencyInfoID);

        flagImg.setImageResource(flags[position]);
        currencyName.setText(currency[position]);
        currencyInfo.setText(getCurrencyName(position));

        return listItem;
    }

    private String getCurrencyName(int position) {
        String[] fullCurrencyNames = {"Euro", "Dolar american", "Lira sterlina", "Dolar australian",
                "Dolar canadian", "Franc elvetian", "Coroana daneza", "Forint maghiar"};
        return fullCurrencyNames[position];
    }
}