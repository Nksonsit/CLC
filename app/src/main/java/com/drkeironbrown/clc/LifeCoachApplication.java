package com.drkeironbrown.clc;

import android.app.Application;

import com.drkeironbrown.clc.api.RestClient;
import com.drkeironbrown.clc.db.DBOpenHelper;
import com.drkeironbrown.clc.db.DatabaseManager;
import com.facebook.stetho.Stetho;

public class LifeCoachApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RestClient.setupRestClient();
        initDataBase();
        initStetho();
    }

    private void initDataBase() {
        DatabaseManager.initialize(DBOpenHelper.getInstance((this)));
        DBOpenHelper.getInstance((this)).createDataBase(this);
    }

    private void initStetho() {

        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build());
    }
}
