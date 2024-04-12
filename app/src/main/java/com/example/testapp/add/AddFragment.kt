package com.example.testapp.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.testapp.R
import com.example.testapp.presentation.ExpenseViewModel


class AddFragment : Fragment() {

    private lateinit var mExpenseViewHolder : ExpenseViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        mExpenseViewHolder = ViewModelProvider(this).get(ExpenseViewModel::class.java)

        val addBtn = view.findViewById<Button>(R.id.addExpenseButton)
        addBtn.setOnClickListener{
             insertToDatabase()
        }


        return view
    }

    private fun insertToDatabase() {

    }

}