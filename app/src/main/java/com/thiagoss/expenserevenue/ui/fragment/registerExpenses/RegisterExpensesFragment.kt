package com.thiagoss.expenserevenue.ui.fragment.registerExpenses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.thiagoss.ui.fragment.onBoarding.walkthroughactivity.databinding.FragmentRegisterExpensesBinding

class RegisterExpensesFragment: Fragment() {
    private lateinit var binding: FragmentRegisterExpensesBinding
    private lateinit var viewModel: RegisterExpensesViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(RegisterExpensesViewModel::class.java)
        binding = FragmentRegisterExpensesBinding.inflate(inflater, container, false)
        binding.registerExpensesViewModel = viewModel
        binding.lifecycleOwner = this
        setupListeners()
        setupObservers()

        return binding.root
    }

    private fun setupListeners() {}

    private fun setupObservers() {}
}