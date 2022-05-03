package com.example.fragmentcycle.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentcycle.R
import com.example.fragmentcycle.presentor.MainActivity2


class BlankFragment2 : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragmentcycle","onAttach2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragmentcycle","onCreat2e")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragmentcycle","onCreateView2")
        return inflater.inflate(R.layout.fragment_blank2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(activity,"вы перешли на фрагмент 2",Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Log.d("Fragmentcycle","onStart2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragmentcycle","onResume2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragmentcycle","onPause2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragmentcycle","onStop2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragmentcycle","onDestroyView2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragmentcycle","onDestroy2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragmentcycle","onDetach2")
    }

    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment2()
    }
}