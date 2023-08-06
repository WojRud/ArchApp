package com.example.basefragmentmvvm.createNewAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.basefragmentmvvm.R
import com.example.basefragmentmvvm.databinding.FragmentShowdataBinding

class ShowDataFragment : Fragment() {
    private var _binding: FragmentShowdataBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShowdataBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(requireActivity())[UserViewModel::class.java]
        binding?.nameTextView?.text = viewModel.firstName
        binding?.lastNameTextView?.text = viewModel.lastName
        binding?.ageTextView?.text = viewModel.age

        binding?.homeBtn?.setOnClickListener {

            Navigation.findNavController(view)
                .navigate(R.id.action_showDataFragment_to_enterNameFragment)

        }
    }
}