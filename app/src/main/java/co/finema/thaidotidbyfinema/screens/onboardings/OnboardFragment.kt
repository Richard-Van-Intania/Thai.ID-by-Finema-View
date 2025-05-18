package co.finema.thaidotidbyfinema.screens.onboardings

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import co.finema.thaidotidbyfinema.R

class OnboardFragment : Fragment(R.layout.fragment_onboard) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val button = view.findViewById<Button>(R.id.button)
    button.setOnClickListener { findNavController().navigate(R.id.termsScreenFragment) }
  }
}
