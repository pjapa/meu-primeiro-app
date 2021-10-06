package com.example.meuprimeiroapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.meuprimeiroapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding?.bt "algo"?.setOnClickListener{}

        view.findViewById<Button>(R.id.cadastro).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_formularioFragment)
        }
        view.findViewById<Button>(R.id.Adocão).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragment_Adote)
        }
        view.findViewById<Button>(R.id.PetShop).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_petshopFragment)
        }
        view.findViewById<Button>(R.id.Veterinario).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_veterinarioFragment)
        }

        }



        }
//override fun onDestroyView() { super.onDestroyView()
          //binding = null -->duvida





        //no projeto cesar tem a splashActivity. O q é?
       // AboutFragment?
