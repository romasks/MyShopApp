package com.romasks.myshopapp.presentation.basket

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.romasks.core.fragment.viewBinding
import com.romasks.myshopapp.R
import com.romasks.myshopapp.databinding.FragmentBasketBinding

class BasketFragment : Fragment(R.layout.fragment_basket) {

    private val binding by viewBinding(FragmentBasketBinding::bind)

    private val viewModel by viewModels<BasketViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.text.observe(viewLifecycleOwner) {
            binding.textBasket.text = it
        }
    }
}