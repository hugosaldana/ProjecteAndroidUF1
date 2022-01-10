package com.example.projecteandroiduf1.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.androiduf1.database.Userdatabase

import com.example.projecteandroiduf1.R
import com.example.projecteandroiduf1.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application
        val database = Userdatabase.getInstance(application).LoginDatabaseDao
        val viewModelFactory = LoginViewModelFactory(database, application)

        val viewModel: LoginViewModel = ViewModelProvider(this,viewModelFactory).get(LoginViewModel::class.java)

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login,container,false)

        binding.Loginbutton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_LoginFragment_to_mainFragment)
        }

        //binding.loginViewModel = viewModel
        binding.setLifecycleOwner(this)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

}