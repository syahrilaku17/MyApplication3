package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.ContactRepo

class StartApp : Application() {
    fun getPeopleRepo() = ContactRepo(this)
}