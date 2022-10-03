package com.example.k6hw6.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.k6hw6.databinding.FragmentNotificationsBinding
import com.example.k6hw6.ui.Adapter
import com.example.k6hw6.ui.CountViewModel

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private lateinit var vm :CountViewModel
private var adapter :Adapter? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         vm =
            ViewModelProvider(requireActivity()).get(CountViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return  binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycle()
    }

    private fun recycle() {
adapter = Adapter()
        vm.resultAdapter.observe(viewLifecycleOwner){
            binding.text.text = it
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}