package com.example.myapplication.views.views_list

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.StartApp
import com.example.myapplication.data.data_model.People
import com.example.myapplication.views.views_add.AddPeopleData
import com.example.myapplication.views.views_details.DetailAct
import kotlinx.android.synthetic.main.fragment_for_list_people.*

class ListPeopleFragment : Fragment(), ListPeopleAdapter.OnItemClickListener{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_for_list_people, container, false)

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addFab.setOnClickListener {
//            Toast.makeText(activity.applicationContext, "test click Contact List", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity.applicationContext, AddPeopleData::class.java)
            startActivity(intent)

        }
    }
    override fun onItemClick(people: People, itemView: View) {
//        Toast.makeText(activity.applicationContext, "test click Contact List", Toast.LENGTH_SHORT).show()
//        val intent = Intent(activity.applicationContext, DetailAct::class.java)
//        startActivity(intent)
        val detailIntent = Intent(activity.applicationContext, DetailAct::class.java)
        detailIntent.putExtra(getString(R.string.people_id), people.id)
        startActivity(detailIntent)

    }
    private  fun populatePeopleList(peoplelist : List<People>){
        peopleRecyclerView.adapter = ListPeopleAdapter(peoplelist, this)
    }

    override fun onResume() {
        super.onResume()
        val people = (activity?.application as StartApp).getPeopleRepo().getAllPeople()
        populatePeopleList(people)
    }
}