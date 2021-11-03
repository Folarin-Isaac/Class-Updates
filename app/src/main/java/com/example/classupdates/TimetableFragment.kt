package com.example.classupdates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.classupdates.databinding.FragmentTimetableBinding

class TimetableFragment : Fragment() {
    private var _binding: FragmentTimetableBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTimetableBinding.inflate(inflater, container, false)
        return binding.root
    }
}