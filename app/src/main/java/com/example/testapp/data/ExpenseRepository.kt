package com.example.testapp.data

import androidx.lifecycle.LiveData
import com.example.testapp.data.database.ExpenseDao
import com.example.testapp.data.model.Expense

class ExpenseRepository(private val expenseDao: ExpenseDao) {

    val readAllData: LiveData<List<Expense>> = expenseDao.readAllData()

    suspend fun addExpense(expense: Expense){
        expenseDao.addExpense(expense)
    }

    suspend fun deleteExpense(expense: Expense){
        expenseDao.deleteExpense(expense)
    }
}