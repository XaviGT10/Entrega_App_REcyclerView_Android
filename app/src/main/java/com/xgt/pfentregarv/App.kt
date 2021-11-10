package com.xgt.pfentregarv

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.xgt.pfentregarv.model.Base
import com.xgt.pfentregarv.model.FakeData

class App: Application() {
    val repo: MutableList<Base> = mutableListOf()
    override fun onCreate() {
        super.onCreate()
        repo+=Gson().fromJson(FakeData.repositoriesJson, Array<Base>::class.java)
    }
}
val AppCompatActivity.app: App
get() = this.application as App