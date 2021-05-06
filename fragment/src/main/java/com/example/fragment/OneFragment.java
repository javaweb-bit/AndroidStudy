package com.example.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class OneFragment extends ListFragment {
    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState );
        String[] datas = {"김소현", "엄기준", "신은경", "윤정수"};
        ArrayAdapter<String> aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, datas);
        setListAdapter(aa);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Toast toast = Toast.makeText(getActivity(), (String)l.getAdapter().getItem(position), Toast.LENGTH_SHORT);
        toast.show();
    }
}
