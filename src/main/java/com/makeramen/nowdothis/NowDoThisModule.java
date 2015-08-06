package com.makeramen.nowdothis;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.makeramen.nowdothis.dagger.PerApp;
import com.makeramen.nowdothis.data.TodoStorage;

import dagger.Module;
import dagger.Provides;

@Module
public class NowDoThisModule {

  final NowDoThisApp app;

  public NowDoThisModule(NowDoThisApp app) {
    this.app = app;
  }

  @Provides @PerApp NowDoThisApp provideNowDoThisApp() {
    return app;
  }

  @Provides @PerApp Application provideApplication(NowDoThisApp app) {
    return app;
  }
}
