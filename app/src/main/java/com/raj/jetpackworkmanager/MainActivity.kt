package com.raj.jetpackworkmanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.work.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var constrains=Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        var onetimeWorkRequst=OneTimeWorkRequest.Builder(WorkmanagerNormal::class.java)
            .setConstraints(constrains)
            .build()




//        var periodicWorkRequest = PeriodicWorkRequest.Builder(
//            WorkmanagerNormal::class.java, 15, TimeUnit.MINUTES
//        )
//            .setConstraints(constrains)
//            .build()





        WorkManager.getInstance()?.enqueue(onetimeWorkRequst)

    }
}
