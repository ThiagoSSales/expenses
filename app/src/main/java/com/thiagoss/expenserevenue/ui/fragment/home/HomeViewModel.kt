package com.thiagoss.expenserevenue.ui.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore

class HomeViewModel: ViewModel() {
    private val database = FirebaseFirestore.getInstance()

    private val _navigateToRegisterExpenses = MutableLiveData<Boolean>().apply { value = false }
    val navigateToSignUp: LiveData<Boolean>
        get() = _navigateToRegisterExpenses

    fun navigateToRegisterExpenses() {
        _navigateToRegisterExpenses.value = true
    }

    fun doneNavigationToRegisterExpenses() {
        _navigateToRegisterExpenses.value = false
    }

}