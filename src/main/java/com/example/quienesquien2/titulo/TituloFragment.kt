package com.example.quienesquien2.titulo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

import com.example.quienesquien2.R
import com.example.quienesquien2.databinding.FragmentTituloBinding


class TituloFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentTituloBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_titulo, container, false)

       binding.playButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_tituloFragment_to_juegoFragment2)
        }
        return binding.root
    }


}
