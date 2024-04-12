package com.example.testapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "expense_table")
@Parcelize
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val amount: Float
): Parcelable
