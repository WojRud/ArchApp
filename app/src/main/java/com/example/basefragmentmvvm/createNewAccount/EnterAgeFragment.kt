package com.example.basefragmentmvvm.createNewAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.basefragmentmvvm.R
import com.example.basefragmentmvvm.databinding.FragmentEnterageBinding

class EnterAgeFragment : Fragment() {
    private var _binding: FragmentEnterageBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnterageBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.ageBtn?.setOnClickListener {

            val viewModel = ViewModelProvider(requireActivity())[UserViewModel::class.java]
            viewModel.age = binding!!.enterAgeEditText.text.toString()

            Navigation.findNavController(view)
                .navigate(R.id.action_enterAgeFragment_to_showDataFragment)

        }
    }
}