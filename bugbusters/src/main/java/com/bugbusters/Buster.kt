package com.bugbusters

import android.content.Context

/**
 * @name bug-buster
 * Copyrights (c) 2019-09-13 Created By Ahmad Najar
 **/
class Buster constructor(private val builder: Builder) {


    class Builder(context: Context) {
        private var enableLogger: Boolean = false
        private lateinit var context: Context
        private var saveExceptionToFiles: Boolean = false
        private val buster: Buster by lazy { Buster(this) }

        private var bugs: List<Bug> = arrayListOf()


        fun enableLogger(enableLogger: Boolean): Builder {
            this.enableLogger = enableLogger
            return this
        }

        fun saveExceptionToFiles(saveExceptionToFiles: Boolean): Builder {
            this.saveExceptionToFiles = saveExceptionToFiles
            return this
        }

        fun onBugs(onBugs: (bugs: List<Bug>) -> Unit): Builder {
            onBugs.invoke(bugs)
            return this
        }

        fun build(): Buster {
            return buster
        }
    }

}