package co.finema.thaidotidbyfinema.screens

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import co.finema.thaidotidbyfinema.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoadingFragment : Fragment(R.layout.fragment_loading) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    requireActivity()
        .onBackPressedDispatcher
        .addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
              override fun handleOnBackPressed() {}
            })
    viewLifecycleOwner.lifecycleScope.launch {
      delay(3000)
      findNavController().navigate(R.id.action_loadingFragment_to_welcomeFragment)
    }
  }
}
