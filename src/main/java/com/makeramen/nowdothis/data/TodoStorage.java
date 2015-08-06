package com.makeramen.nowdothis.data;

import android.support.annotation.NonNull;
import com.makeramen.nowdothis.dagger.PerApp;
import javax.inject.Inject;

@PerApp
/**
 * Stub class, used to be injected and look for false positives of NPE.
 */
public class TodoStorage {

  @Inject
  public TodoStorage() {

  }

  public void saveTodos(@NonNull String string) {

  }
}
