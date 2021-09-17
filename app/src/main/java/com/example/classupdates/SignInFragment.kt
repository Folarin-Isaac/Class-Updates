package com.example.classupdates

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class SignInFragment : Fragment() {
    private lateinit var mView: View
    private lateinit var signInButton: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.fragment_sign_in, container, false)

        return mView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signInButton = mView.findViewById(R.id.sign_in_button)

        signInButton.setOnClickListener {
            startActivity(Intent(activity, MainActivity::class.java))

        }

    }
}