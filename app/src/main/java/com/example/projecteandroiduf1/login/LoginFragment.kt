package com.example.projecteandroiduf1.login

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.androiduf1.database.Userdatabase
import com.example.projecteandroiduf1.R
import com.example.projecteandroiduf1.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LoginFragment", "Start")

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login,container,false)

        val application = requireNotNull(this.activity).application
        val database = Userdatabase.getInstance(application).LoginDatabaseDao
        val viewModelFactory = LoginViewModelFactory(database, application)

        val viewModel: LoginViewModel = ViewModelProvider(this,viewModelFactory).get(LoginViewModel::class.java)

        binding.apply {
            Loginbutton.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_LoginFragment_to_mainFragment)
                Log.i("Loginbutton", "Loginbutton press")

            }


            Registratboto.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
                Log.i("Registratbutton", "Resgistratbutton press")
            }
        }

            // Inflate the layout for this fragment
            return binding.root
        }

}

