package co.finema.thaidotidbyfinema.screens.onboardings

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
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
  }
}
