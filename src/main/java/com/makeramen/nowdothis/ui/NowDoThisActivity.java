package com.makeramen.nowdothis.ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import com.makeramen.nowdothis.NowDoThisApp;

public class NowDoThisActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    NowDoThisApp.getComponent(this).inject(this);

    if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
      Fragment fragment = new EditListFragment();
      getFragmentManager().beginTransaction()
          .replace(android.R.id.content, fragment)
          .commit();
    }
  }
}
