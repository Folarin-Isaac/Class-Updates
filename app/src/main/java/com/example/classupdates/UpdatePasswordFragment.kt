package com.example.classupdates

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classupdates.databinding.FragmentUpdatePasswordBinding

class UpdatePasswordFragment : Fragment() {
    private var _binding: FragmentUpdatePasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUpdatePasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

}