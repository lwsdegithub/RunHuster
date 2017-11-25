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

public class GradeCalFragment extends Fragment implements View.OnClickListener {
    private TextView congratulationsSentence;
    private TextView theScoreIsGoodOrBad;
    private TextView thePhysicalSCF;
    private TextView theGradeInSCF;
    private ImageView theUpArrow;
    private TextView theLongRunTimeInSCF;
    private TextView theLongRunScoresInSCF;
    private TextView theShortRunTimeInSCF;
    private TextView theShortRunScoresInSCF;
    private TextView theJumpInSCF;
    private TextView theJumpScoresInSCF;
    private TextView theLungInSCF;
    private TextView theLungScoresInSCF;
    private TextView theChinningInSCF;
    private TextView theChinningScoresInSCF;
    private TextView theSitAndReachInSCF;
    private TextView theSitAndReachScoresInSCF;
    private TextView theBMIInSCF;
    private TextView theBMIScoresInSCF;
    private TextView saveScoreInSCF;
    private TextView shareMeInSCF;
    private View mainView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.grade_cal_fragment_lay, container, false);
        initView();
        return mainView;
    }
    private void initView(){
        congratulationsSentence = (TextView)mainView.findViewById(R.id.congratulationsSentence);
        theScoreIsGoodOrBad = (TextView) mainView.findViewById(R.id.theScoreIsGoodOrBad);
        thePhysicalSCF = (TextView) mainView.findViewById(R.id.thePhysicalSCF);
        theGradeInSCF = (TextView) mainView.findViewById(R.id.theGradeInSCF);
        theUpArrow = (ImageView) mainView.findViewById(R.id.theUpArrow);
        theLongRunTimeInSCF = (TextView) mainView.findViewById(R.id.theLongRunTimeInSCF);
        theLongRunScoresInSCF = (TextView) mainView.findViewById(R.id.theLongRunScoresInSCF);
        theShortRunTimeInSCF = (TextView) mainView.findViewById(R.id.theShortRunTimeInSCF);
        theShortRunScoresInSCF = (TextView) mainView.findViewById(R.id.theShortRunScoresInSCF);
        theJumpInSCF = (TextView) mainView.findViewById(R.id.theJumpInSCF);
        theJumpScoresInSCF = (TextView) mainView.findViewById(R.id.theJumpScoresInSCF);
        theLungInSCF = (TextView) mainView.findViewById(R.id.theLungInSCF);
        theLungScoresInSCF = (TextView) mainView.findViewById(R.id.theLungScoresInSCF);
        theChinningInSCF = (TextView) mainView.findViewById(R.id.theChinningInSCF);
        theChinningScoresInSCF = (TextView) mainView.findViewById(R.id.theChinningScoresInSCF);
        theSitAndReachInSCF = (TextView) mainView.findViewById(R.id.theSitAndReachInSCF);
        theSitAndReachScoresInSCF = (TextView) mainView.findViewById(R.id.theSitAndReachScoresInSCF);
        theBMIInSCF = (TextView) mainView.findViewById(R.id.theBMIInSCF);
        theBMIScoresInSCF = (TextView) mainView.findViewById(R.id.theBMIScoresInSCF);
        saveScoreInSCF = (TextView) mainView.findViewById(R.id.saveScoreInSCF);
        shareMeInSCF = (TextView) mainView.findViewById(R.id.shareMeInSCF);
    }
    @Override
    public void onClick(View view) {

    }
}
