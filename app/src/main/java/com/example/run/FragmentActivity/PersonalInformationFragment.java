package com.example.run.FragmentActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.run.R;

/**
 * Created by 李维升 on 2017/11/24.
 */

public class PersonalInformationFragment extends Fragment implements View.OnClickListener {
    private View mainView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView=inflater.inflate(R.layout.personal_information_fragment_lay,container,false);
        return mainView;
    }
    @Override
    public void onClick(View view) {
    }
}
