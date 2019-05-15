package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mArrayData;

    ForecastAdapter() {
        super();
    }

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final Context context = viewGroup.getContext();
        final View viewItem = LayoutInflater.from(context)
                .inflate(R.layout.forecast_list_item, viewGroup, false);

        return new ForecastAdapterViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {
        forecastAdapterViewHolder.mWeatherTextView.setText(mArrayData[i]);
    }

    @Override
    public int getItemCount() {
        if (mArrayData == null) {
            return 0;
        }

        return mArrayData.length;
    }

    void setWeatherData(String[] mArrayData) {
        this.mArrayData = mArrayData;
        notifyDataSetChanged();
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        private final TextView mWeatherTextView;

        ForecastAdapterViewHolder(View itemView) {
            super(itemView);

            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }
}
