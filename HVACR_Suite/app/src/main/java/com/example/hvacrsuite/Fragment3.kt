package com.example.hvacrsuite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.example.hvacrsuite.databinding.Fragment3Binding




class Fragment3 : Fragment(R.layout.fragment_1) {

    private  var _binding: Fragment3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {



        _binding = Fragment3Binding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeBtn.setOnClickListener{findNavController(view).navigate(R.id.action_fragment3_to_fragment1)}
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}