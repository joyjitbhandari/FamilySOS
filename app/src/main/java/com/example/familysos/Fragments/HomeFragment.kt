package com.example.familysos.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.familysos.Adapter.MemberAdapter
import com.example.familysos.DataClasses.MemberModel
import com.example.familysos.R


class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listMembers = listOf<MemberModel>(
            MemberModel("Joyjit Bhandari","Lagapara, MTPS, Bankura, West Bengal, 722183",
            10.20,"60%","ON",4000) ,
            MemberModel("Avijit Bhandari","Lagapara, MTPS, Bankura, West Bengal, 722183",
            11.45,"20%","ON",2458),
            MemberModel("Amithraj","Lagapara, MTPS, Bankura, West Bengal, 722183",
            08.50,"30%","OFF",1000),
            MemberModel("Karishma","Lagapara, MTPS, Bankura, West Bengal, 722183",
            03.20,"10%","ON",4500),
            MemberModel("Nikita","Lagapara, MTPS, Bankura, West Bengal, 722183",
            01.30,"80%","OFF",8620),
            MemberModel("Bhajan Bhandari","Lagapara, MTPS, Bankura, West Bengal, 722183",
            05.10,"50%","ON",1230),
            MemberModel("Jaba Bhandari","Lagapara, MTPS, Bankura, West Bengal, 722183",
            06.50,"90%","OFF",4231),
            MemberModel("Shanhavaz","Lagapara, MTPS, Bankura, West Bengal, 722183",
            10.59,"70%","ON",2543)
        )

        val adapter = MemberAdapter(listMembers)
        val recyclerView = requireView().findViewById<RecyclerView>(R.id.homeRecycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

    }


    companion object {
        fun newInstance() = HomeFragment()
    }
}