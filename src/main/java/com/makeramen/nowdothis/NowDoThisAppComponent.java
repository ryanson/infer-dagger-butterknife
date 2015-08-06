package com.makeramen.nowdothis;

import android.app.Application;
import com.makeramen.nowdothis.dagger.PerApp;
import com.makeramen.nowdothis.ui.EditListFragment;
import com.makeramen.nowdothis.ui.NowDoThisActivity;
import dagger.Component;

@PerApp
@Component(
    modules = {
        NowDoThisModule.class,
    }
)
public interface NowDoThisAppComponent {

  public void inject(NowDoThisActivity nowDoThisActivity);

  public void inject(EditListFragment editListFragment);

  Application application();
}
