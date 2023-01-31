package com.faimsoft.learnandroid.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.faimsoft.learnandroid.LoginActivity
import com.faimsoft.learnandroid.databinding.FragmentHomeBinding
import com.faimsoft.learnandroid.ui.MainViewModel

class HomeFragment : Fragment() {

    private val mainViewModel: MainViewModel by activityViewModels()

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profile.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment("Imran")
            findNavController().navigate(action)
        }

        binding.email.text = mainViewModel.appDataProvider.getEmail()

        binding.logout.setOnClickListener {
            mainViewModel.appDataProvider.logout()
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

    }



}