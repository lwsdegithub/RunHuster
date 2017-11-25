package com.example.run;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.run.FragmentActivity.ChartFragment;
import com.example.run.FragmentActivity.GradeCalFragment;
import com.example.run.FragmentActivity.PersonalInformationFragment;
import com.example.run.FragmentActivity.RunFragment;
import com.example.run.R;
import com.heima.tabview.library.TabView;
import com.heima.tabview.library.TabViewChild;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李维升 on 2017/11/24.
 * 主界面
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private PersonalInformationFragment personalInformationFragment;
    private RunFragment runFragment;
    private GradeCalFragment gradeCalFragment;
    private ChartFragment chartFragment;
    private List<TabViewChild> tabViewChildList=new ArrayList<>();
    private TabView tabView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_lay);
        init();
    }

    /**
     * 这里初始化tabView，实现tabView绑定Fragment，具体样式设置在main_activity_lay.xml静态设置
     */
    private void init(){
        tabView=findViewById(R.id.tabView);
        personalInformationFragment=new PersonalInformationFragment();
        runFragment=new RunFragment();
        gradeCalFragment=new GradeCalFragment();
        chartFragment=new ChartFragment();
        TabViewChild tabViewChild01=new TabViewChild(R.drawable.personal_information_tab_image_sel,R.drawable.location_marker,"个人信息",personalInformationFragment);
        TabViewChild tabViewChild02=new TabViewChild(R.drawable.location_marker,R.drawable.run_tab_image_unsel,"锻炼界面",runFragment);
        TabViewChild tabViewChild03=new TabViewChild(R.drawable.location_marker,R.drawable.grade_cal_tab_image_unsel,"成绩计算",gradeCalFragment);
        TabViewChild tabViewChild04=new TabViewChild(R.drawable.location_marker,R.drawable.chart_tab_iamge_unsel,"变化曲线",chartFragment);
        tabViewChildList.add(tabViewChild01);
        tabViewChildList.add(tabViewChild02);
        tabViewChildList.add(tabViewChild03);
        tabViewChildList.add(tabViewChild04);
        tabView.setTabViewChild(tabViewChildList,getSupportFragmentManager());
    }
    @Override
    public void onClick(View view) {
    }
}
