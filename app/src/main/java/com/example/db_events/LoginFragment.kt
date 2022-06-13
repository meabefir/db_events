package com.example.db_events

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)
        binding.tryAgainButton.setOnClickListener{ view: View ->
//            view.findNavController().navigate(R.id.action_gameOverFragment2_to_gameFragment)
            view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragment2ToGameFragment())
        }
        return binding.root
    }

}