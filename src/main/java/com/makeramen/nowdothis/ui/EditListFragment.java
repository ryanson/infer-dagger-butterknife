package com.makeramen.nowdothis.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

import com.makeramen.nowdothis.NowDoThisApp;
import com.makeramen.nowdothis.R;
import com.makeramen.nowdothis.data.TodoStorage;

import java.util.List;

import javax.inject.Inject;

public class EditListFragment extends Fragment implements InterfaceExample {

    //Dagger example.
    @Inject TodoStorage todoStorage;
    //ButterKnife example.
    @InjectView(R.id.editor) EditText editor;

    TodoStorage initExample;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
            @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editlist, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    public void init() {
        initExample = new TodoStorage();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        NowDoThisApp.getComponent(getActivity()).inject(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        todoStorage.saveTodos(editor.getText().toString());
    }

    @Override
    @Nullable
    public String returnNull() {
        return null;
    }
}
