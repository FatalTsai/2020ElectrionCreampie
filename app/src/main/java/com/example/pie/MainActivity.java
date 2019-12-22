package com.example.pie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {

    PieChartView pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SliceValue> slices = new ArrayList<>();

        pieChart = findViewById(R.id.chart);
        slices.add(new SliceValue(50, Color.BLUE).setLabel("KMT:50"));
        slices.add(new SliceValue(20, Color.GREEN).setLabel("DDP:20"));
        slices.add(new SliceValue(10, Color.RED).setLabel("Communist :10"));
        slices.add(new SliceValue(20, Color.YELLOW).setLabel("New:20"));

        PieChartData chartData = new PieChartData(slices);
        chartData.setHasLabels(true).setValueLabelTextSize(14);
        chartData.setValueLabelBackgroundColor(Color.argb(255,0,0,0));
        chartData.setHasCenterCircle(true).setCenterText1("2020 Election")
                .setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChart.setPieChartData(chartData);
    }
}
