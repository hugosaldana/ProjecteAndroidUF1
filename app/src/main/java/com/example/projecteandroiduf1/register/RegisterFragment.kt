package com.example.projecteandroiduf1.register

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.androiduf1.database.Userdatabase
import com.example.projecteandroiduf1.R
import com.example.projecteandroiduf1.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(inflater,
            R.layout.fragment_register,container,false)

        val application = requireNotNull(this.activity).application
        val database = Userdatabase.getInstance(application).LoginDatabaseDao
        val viewModelFactory = RegisterViewModelFactory(database, application)

        val viewModel: RegisterViewModel = ViewModelProvider(this,viewModelFactory).get(RegisterViewModel::class.java)


        binding.apply{

        registerregistrat.setOnClickListener { view: View ->
            Log.i("RegisterRegistratbutton", "RegisterResgistratbutton press")
            viewModel.insertar_usuari(binding.registernom.text.toString(),binding.registercognom.text.toString(),binding.registercontrasenya.text.toString(),binding.registerusuari.text.toString())

            if (viewModel.existeix(binding.registerusuari.text.toString(),binding.registercontrasenya.text.toString())) {
                Toast.makeText(context, "Insertat", Toast.LENGTH_LONG).show()
            }
        }
        }


        // Inflate the layout for this fragment
        return binding.root
    }


}