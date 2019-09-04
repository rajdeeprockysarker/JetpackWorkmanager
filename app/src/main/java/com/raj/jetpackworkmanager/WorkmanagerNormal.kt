package com.raj.jetpackworkmanager

import android.util.Log
import androidx.work.Worker
import android.support.annotation.NonNull




class WorkmanagerNormal : Worker() {

    override fun doWork(): Worker.Result {

        val number1 = 23
        val number2 = 26

        Log.e("TAGGGGGGGGGGGGGGG", "doWork: addition of two number " + (number1 + number2).toString())

        return Worker.Result.SUCCESS


    }
}

