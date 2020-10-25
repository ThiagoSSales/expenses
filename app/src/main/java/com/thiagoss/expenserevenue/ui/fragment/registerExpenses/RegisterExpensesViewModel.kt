package com.thiagoss.expenserevenue.ui.fragment.registerExpenses

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.google.firebase.firestore.FirebaseFirestore

class RegisterExpensesViewModel(private val myApplication: Application) : AndroidViewModel(myApplication) {
    private val database = FirebaseFirestore.getInstance()
}