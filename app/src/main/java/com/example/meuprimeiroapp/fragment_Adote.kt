package com.example.meuprimeiroapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.meuprimeiroapp.databinding.FragmentAdoteBinding


class fragment_Adote  : Fragment() {
    private var binding: FragmentAdoteBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?


    {
        // Inflate the layout for this fragment
        binding = FragmentAdoteBinding.inflate(inflater, container,false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.cachorro).setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Adote_to_cachorroFragment)
        }
    }

}
