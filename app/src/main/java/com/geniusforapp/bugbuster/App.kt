package com.geniusforapp.bugbuster

import android.app.Application
import com.bugbusters.Buster

/**
 * @name bug-buster
 * Copyrights (c) 2019-09-13 Created By Ahmad Najar
 **/
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val buster: Buster = Buster.Builder(this)
            .saveExceptionToFiles(true)
            .enableLogger(true)
            .onBugs {

            }
            .build()
    }

}