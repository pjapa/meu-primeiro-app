package com.example.meuprimeiroapp.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meuprimeiroapp.R


class CachorroFragment : Fragment() {
    private lateinit var CachorroFragmentView: View
    private lateinit var recyclerView: RecyclerView

    private val listCachorro = arrayListOf(
       Cachorro(
            R.drawable.cachorro1,
            name = "chaves",
            date = "18 minutes ago"
        ),Cachorro(
            R.drawable.cachorro2,
            name = "kiko",
            date = "14 minutes ago"
        ), Cachorro(
            R.drawable.cachorro3,
            name = "seu madruga",
            date = "30 minutes ago"
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        CachorroFragmentView = inflater.inflate(R.layout.fragment_cachorro,container, false)
        return CachorroFragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = CachorroFragmentView.findViewById(R.id.action_fragment_Adote_to_cachorroFragment)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = CachorroAdapter(listCachorro)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))}
    }

}

