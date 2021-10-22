package com.example.classupdates

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
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
//        val navController = Navigation.findNavController(view)


        signInButton.setOnClickListener {
           // startActivity(Intent(activity, MainActivity::class.java))
           // childFragmentManager.beginTransaction().replace(R.id.frame_container, AuthOtpFragment()).commit()
           // val authOtpFragment = AuthOtpFragment()
            //val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
            //transaction.replace(R.id.frame_container, authOtpFragment)
            //transaction.commit()
            //view.findNavController().navigate(R.id.authOtpFragment)
          //  navController.navigate(R.id.action_signInFragment_to_authOtpFragment)

        }
    }
}