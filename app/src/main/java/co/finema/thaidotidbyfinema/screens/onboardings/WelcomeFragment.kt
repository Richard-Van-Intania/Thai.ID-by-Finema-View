package co.finema.thaidotidbyfinema.screens.onboardings

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import co.finema.thaidotidbyfinema.R

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    requireActivity()
        .onBackPressedDispatcher
        .addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
              override fun handleOnBackPressed() {}
            })
    view.findViewById<Button>(R.id.btn_get_started).setOnClickListener {
      findNavController().navigate(R.id.action_welcomeFragment_to_onboardFragment)
    }
  }
}
