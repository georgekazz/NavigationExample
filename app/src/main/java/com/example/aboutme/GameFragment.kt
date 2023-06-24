package com.example.aboutme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.aboutme.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    lateinit var binding: FragmentGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater, container, false)

        binding.trueBt.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_gameFragment_to_trueFragment)
        }
        binding.falseBt.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_gameFragment_to_falseFragment)
        }

        return binding.root
    }
}