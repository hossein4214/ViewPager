package ir.hosseinstar.viewpager2.viewpager.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import ir.hosseinstar.viewpager2.R

class SecondScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)

        val viewpager = requireActivity().findViewById<ViewPager2>(R.id.view_pager)

        view.findViewById<TextView>(R.id.second_screen).setOnClickListener {
            viewpager.currentItem = 2
        }

        return view
    }
}