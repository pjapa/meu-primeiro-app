package com.example.meuprimeiroapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.meuprimeiroapp.databinding.FragmentFormularioBinding


class FormularioFragment : Fragment() {
    private var binding:FragmentFormularioBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormularioBinding.inflate(inflater, container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btsave).setOnClickListener {
            findNavController().navigate(R.id. action_formularioFragment_to_login_cadastroFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    

}



