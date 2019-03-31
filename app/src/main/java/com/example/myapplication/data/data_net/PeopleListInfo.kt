package com.example.myapplication.data.data_net

import com.example.myapplication.data.data_model.People

class PeopleListInfo {
    companion object {
        var peopleList = initPeopleList()

        private  fun initPeopleList() : MutableList<People>{
            var po_peoples = mutableListOf<People>()
            po_peoples.add(
                People(
                "Syahril",
                "Brebes",
                "089629169017",
                "syahrilaku17@gmail.com",
                "fb.me/syahril",
                "twitter.com/syahril",
                1
            ))
            po_peoples.add(
                People(
                    "Syahril",
                    "Brebes",
                    "089629169017",
                    "syahrilaku17@gmail.com",
                    "fb.me/syahril",
                    "twitter.com/syahril",
                    2
                ))
            po_peoples.add(
                People(
                    "Syahril",
                    "Brebes",
                    "089629169017",
                    "syahrilaku17@gmail.com",
                    "fb.me/syahril",
                    "twitter.com/syahril",
                    3
                ))
            po_peoples.add(
                People(
                    "Syahril",
                    "Brebes",
                    "089629169017",
                    "syahrilaku17@gmail.com",
                    "fb.me/syahril",
                    "twitter.com/syahril",
                    4
                ))
            return po_peoples;
        }
    }
}
