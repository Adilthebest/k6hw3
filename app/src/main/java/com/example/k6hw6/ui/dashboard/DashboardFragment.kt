package com.example.k6hw6.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.k6hw6.databinding.FragmentDashboardBinding
import com.example.k6hw6.ui.CountViewModel
import kotlin.math.log

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private lateinit var vm :CountViewModel

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         vm =
            ViewModelProvider(requireActivity()  ).get(CountViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.result.observe(viewLifecycleOwner){
            binding.gettext.text = it.toString()
            Log.e("ololo","result")
        }
    }

}