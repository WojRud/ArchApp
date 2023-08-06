package com.example.basefragmentmvvm.createNewAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.basefragmentmvvm.R
import com.example.basefragmentmvvm.databinding.FragmentEnterlastnameBinding


class EnterLastNameFragment : Fragment() {
    private var _binding: FragmentEnterlastnameBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnterlastnameBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.lastNameBtn?.setOnClickListener {

            val viewModel = ViewModelProvider(requireActivity())[UserViewModel::class.java]
            viewModel.lastName = binding!!.enterLastNameEditText.text.toString()

            Navigation.findNavController(view)
                .navigate(R.id.action_enterLastNameFragment_to_enterAgeFragment)
        }
    }
}