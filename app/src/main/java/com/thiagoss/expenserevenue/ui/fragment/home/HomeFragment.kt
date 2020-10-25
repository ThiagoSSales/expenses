package com.thiagoss.expenserevenue.ui.fragment.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.thiagoss.ui.fragment.onBoarding.walkthroughactivity.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.homeViewModel = viewModel
        binding.lifecycleOwner = this
        setupListeners()
        setupObservers()

        /*viewModel.navigateToRegisterExpenses().observe(this, Observer {
            if (it) {
                this.findNavController()
                        .navigate(HomeFragmentDirections.actionHomeFragmentToRegisterExpensesFragment())
                viewModel.doneNavigationToRegisterExpenses()
            }
        })
*/
        return binding.root
    }

    private fun setupListeners() {}

    private fun setupObservers() {}
}
