package com.example.fragmentcycle.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentcycle.databinding.FragmentBlankBinding
import com.example.fragmentcycle.presentor.MainActivity2


class BlankFragment : Fragment() {
    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragmentcycle","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragmentcycle","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragmentcycle","onCreateView")
         _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFrag.setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragmentcycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragmentcycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragmentcycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragmentcycle","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragmentcycle","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragmentcycle","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragmentcycle","onDetach")
    }
}