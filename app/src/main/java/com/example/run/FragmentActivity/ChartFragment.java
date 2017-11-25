package com.example.run.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.run.R;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;

/**
 * Created by 李维升 on 2017/11/24.
 */

public class ChartFragment extends Fragment implements View.OnClickListener {
    private ImageView userHeadInCF;
    private ImageView stateImgInCF;
    private ImageView stateImg2InCF;
    private TextView theLongRunTimeInCF;
    private TextView theLongRunScoresInCF;
    private View mainView;

    //一些图表的变量元素声明
    private LineChartView lineChartView;
    private List<PointValue> pointValueList=new ArrayList<>();
    private List<Line> lineList=new ArrayList<>();
    private LineChartData lineChartData=new LineChartData();
    private Axis axisX=new Axis();//X轴
    private Axis axisYTime=new Axis();//时间Y轴
    private Axis axisYMileage=new Axis();//里程Y轴
    private List<AxisValue> axisXValueList=new ArrayList<>();//设置坐标值
    private List<AxisValue> axisYTimeValueList=new ArrayList<>();//设置时间Y轴坐标值
    private List<AxisValue> axisYMileageValueList=new ArrayList<>();//设置里程Y轴坐标值
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView=inflater.inflate(R.layout.chart_fragment,container,false);
        initView();
        return mainView;
    }
    private void initView(){
        userHeadInCF = (ImageView) mainView.findViewById(R.id.userHeadInCF);
        stateImgInCF = (ImageView) mainView.findViewById(R.id.stateImgInCF);
        stateImg2InCF = (ImageView) mainView.findViewById(R.id.stateImg2InCF);
        theLongRunTimeInCF = (TextView) mainView.findViewById(R.id.theLongRunTimeInCF);
        theLongRunScoresInCF = (TextView) mainView.findViewById(R.id.theLongRunScoresInCF);
        lineChartView = (LineChartView) mainView.findViewById(R.id.lineChartView);
        setUpLineChartView();
    }

    /**
     * 这里做一些图表的相关设置
     */
    private void setUpLineChartView(){
        lineChartView.setInteractive(true);//设置交互性
        lineChartView.setBackgroundColor(Color.TRANSPARENT);//设置背景为透明
        //设置X轴
        axisXValueList.add(new AxisValue(0).setLabel("Mon"));
        axisXValueList.add(new AxisValue(1).setLabel("Tue"));
        axisXValueList.add(new AxisValue(2).setLabel("Wed"));
        axisXValueList.add(new AxisValue(3).setLabel("Thu"));
        axisXValueList.add(new AxisValue(4).setLabel("Fri"));
        axisXValueList.add(new AxisValue(5).setLabel("Sat"));
        axisXValueList.add(new AxisValue(6).setLabel("Sun"));
        axisX.setValues(axisXValueList);
        lineChartData.setAxisXBottom(axisX);


        lineChartView.setLineChartData(lineChartData);
    }
    @Override
    public void onClick(View view) {

    }
}
