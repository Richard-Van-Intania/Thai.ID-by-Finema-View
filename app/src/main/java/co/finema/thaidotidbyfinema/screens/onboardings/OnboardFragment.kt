package co.finema.thaidotidbyfinema.screens.onboardings

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import co.finema.thaidotidbyfinema.R
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator

data class TipsData(val imageResource: Int, val head: Int, val body: Int)

val tipsList =
    listOf(
        TipsData(
            imageResource = R.drawable.welcome3,
            head = R.string.certified_true_copy,
            body = R.string.easily_make,
        ),
        TipsData(
            imageResource = R.drawable.welcome2,
            head = R.string.identity_wallet,
            body = R.string.securely_store,
        ),
        TipsData(
            imageResource = R.drawable.welcome4,
            head = R.string.conveniently_create,
            body = R.string.create_and_verify,
        ),
        TipsData(
            imageResource = R.drawable.welcome5,
            head = R.string.save_and_share,
            body = R.string.save_and_share_documents,
        ),
    )

class OnboardFragment : Fragment(R.layout.fragment_onboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btn_skip).setOnClickListener {
            findNavController().navigate(R.id.action_onboardFragment_to_termsScreenFragment)
        }

        val viewPager2 = view.findViewById<ViewPager2>(R.id.viewPager2)
        val adapter = OnboardPagerAdapter(tipsList)
        viewPager2.adapter = adapter

        val dotsIndicator = view.findViewById<SpringDotsIndicator>(R.id.dots_indicator)
        dotsIndicator.attachTo(viewPager2)

        view.findViewById<Button>(R.id.btn_log_in).setOnClickListener {
            findNavController().navigate(R.id.action_onboardFragment_to_termsScreenFragment)
        }
    }
}
