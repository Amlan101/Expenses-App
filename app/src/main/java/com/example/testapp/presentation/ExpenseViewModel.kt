package com.example.testapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.testapp.data.model.Expense
import com.example.testapp.data.ExpenseRepository
import com.example.testapp.data.database.ExpenseDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ExpenseViewModel(application: Application): AndroidViewModel(application) {
     val readAllData: LiveData<List<Expense>>
     private val repository: ExpenseRepository

     init{
         val expenseDao = ExpenseDatabase.getDatabase(application).expenseDao()
         repository = ExpenseRepository(expenseDao)
         readAllData = repository.readAllData
     }

    fun addExpense(expense: Expense){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addExpense(expense)
        }
    }
    fun deleteExpense(expense: Expense){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteExpense(expense)
        }
    }
}