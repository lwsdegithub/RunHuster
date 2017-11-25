package com.example.run.FragmentActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.run.R;

/**
 * Created by 李维升 on 2017/11/24.
 * 个人信息fragment
 */
public class PersonalInformationFragment extends Fragment implements View.OnClickListener {
    private TextView userName;
    private TextView encourageSentence;
    private TextView runTimes;
    private TextView theRecord;
    private TextView theRecordGrade;
    private TextView theWeakness;
    private TextView theWeaknessGrade;
    private TextView exerciseTime;
    private TextView exerciseTimeGrade;
    private Button startRunBtn;
    private ImageView doseRemindToSwipeCard;
    private View mainView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView=inflater.inflate(R.layout.personal_information_fragment_lay,container,false);
        initView();
        return mainView;
    }

    /**
     * 绑定控件
     */
    private void initView(){
        userName = (TextView) mainView.findViewById(R.id.userName);
        encourageSentence = (TextView) mainView.findViewById(R.id.encourageSentence);
        runTimes = (TextView)  mainView.findViewById(R.id.runTimes);
        theRecord = (TextView)  mainView.findViewById(R.id.theRecord);
        theRecordGrade = (TextView)  mainView.findViewById(R.id.theRecordGrade);
        theWeakness = (TextView)  mainView.findViewById(R.id.theWeakness);
        theWeaknessGrade = (TextView)  mainView.findViewById(R.id.theWeaknessGrade);
        exerciseTime = (TextView)  mainView.findViewById(R.id.exerciseTime);
        exerciseTimeGrade = (TextView)  mainView.findViewById(R.id.exerciseTimeGrade);
        startRunBtn = (Button)  mainView.findViewById(R.id.startRunBtn);
        doseRemindToSwipeCard = (ImageView)  mainView.findViewById(R.id.doseRemindToSwipeCard);
        startRunBtn.setOnClickListener(this);
        doseRemindToSwipeCard.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startRunBtn:
                break;
            case R.id.doseRemindToSwipeCard:
                break;
        }
    }
}
