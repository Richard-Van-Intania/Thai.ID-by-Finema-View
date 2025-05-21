package co.finema.thaidotidbyfinema.screens.onboardings

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import co.finema.thaidotidbyfinema.R

class TermsScreenFragment : Fragment(R.layout.fragment_terms_screen) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    view.findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
      findNavController().popBackStack()
    }
  }
}
