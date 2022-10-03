package com.example.k6hw6.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.k6hw6.databinding.FragmentHomeBinding
import com.example.k6hw6.ui.CountViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var vm :CountViewModel
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         vm = ViewModelProvider(requireActivity()).get(CountViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click()
    }
    private fun click() {

        binding.btnDecrement.setOnClickListener {
            vm.decrement()
            Log.e("ololo","decrement")

        }
        binding.btnIncrement.setOnClickListener {
            vm.increment()
            Log.e("ololo","increment")

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}