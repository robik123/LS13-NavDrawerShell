package edu.quinnipiac.ser210.ls13_navcomponentdemo;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    NavController navController = null;
    public MainFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


  /*

}*/

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.view_transactions_btn:
                //navController.navigate(R.id.action_mainFragment_to_viewTransactionFragment);
                break;
            case R.id.send_money_btn:

                break;
            case R.id.view_balance_btn:

                break;
        }

    }
}
