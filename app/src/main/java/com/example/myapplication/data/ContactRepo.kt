package com.example.myapplication.data

import android.app.Application
import com.example.myapplication.data.data_model.People
import com.example.myapplication.data.data_net.PeopleListInfo

class ContactRepo (application: Application){
    /***
     * Menampilkan Data tapi secara descanding
     * */
    fun getAllPeople() : List<People>{
        val allpeople = PeopleListInfo.peopleList
        return allpeople.reversed()
    }
    fun insertPeople(people: People){
        PeopleListInfo.peopleList.add(people)
    }
    fun findPeople(id : Int) : People?{
        for (people in PeopleListInfo.peopleList){
            if (people.id == id){
                return people
            }
        }
        return null
    }
}