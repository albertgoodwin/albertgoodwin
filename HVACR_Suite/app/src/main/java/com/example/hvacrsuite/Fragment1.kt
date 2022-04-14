package com.example.hvacrsuite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.example.hvacrsuite.databinding.Fragment1Binding




class Fragment1 : Fragment(R.layout.fragment_1) {

    private  var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_1, )
        _binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.yesBtn.setOnClickListener{findNavController(view).navigate(R.id.action_fragment1_to_fragment3)}
        binding.noBtn.setOnClickListener{findNavController(view).navigate(R.id.action_fragment1_to_fragment2)}
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}