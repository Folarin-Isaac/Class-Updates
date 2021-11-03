package com.example.classupdates

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classupdates.databinding.FragmentAuthOtpBinding

class AuthOtpFragment : Fragment() {
    private var _binding: FragmentAuthOtpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAuthOtpBinding.inflate(inflater, container,false)
        return binding.root
    }

}