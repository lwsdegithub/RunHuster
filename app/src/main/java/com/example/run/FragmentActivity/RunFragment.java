package com.example.run.FragmentActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.run.R;

/**
 * Created by 李维升 on 2017/11/24.
 */

public class RunFragment extends Fragment implements View.OnClickListener {
    private TextView exercisePlace;
    private ImageView progressImage;
    private TextView runMileage;
    private TextView runTimeInRunFragment;
    private TextView speed;
    private TextView calorie;
    private TextView expectedGrade;
    private TextView projectIsDoing;
    private TextView historyGrade;
    private TextView saveRecord;
    private View mainView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView=inflater.inflate(R.layout.run_fragment_lay,container,false);
        initView();
        return mainView;
    }
    private void initView(){
        exercisePlace = (TextView) mainView.findViewById(R.id.exercisePlace);
        progressImage = (ImageView) mainView.findViewById(R.id.progressImage);
        runMileage = (TextView)mainView.findViewById(R.id.runMileage);
        runTimeInRunFragment = (TextView) mainView.findViewById(R.id.runTimeInRunFragment);
        speed = (TextView) mainView.findViewById(R.id.speed);
        calorie = (TextView)mainView.findViewById(R.id.calorie);
        expectedGrade = (TextView) mainView.findViewById(R.id.expectedGrade);
        projectIsDoing = (TextView) mainView.findViewById(R.id.projectIsDoing);
        historyGrade = (TextView) mainView.findViewById(R.id.historyGrade);
        saveRecord = (TextView)mainView.findViewById(R.id.saveRecord);

    }
    @Override
    public void onClick(View view) {

    }
}
