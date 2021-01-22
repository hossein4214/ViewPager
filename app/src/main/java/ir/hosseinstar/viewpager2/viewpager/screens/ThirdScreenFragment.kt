package ir.hosseinstar.viewpager2.viewpager.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import ir.hosseinstar.viewpager2.R

class ThirdScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)

        val viewpager = requireActivity().findViewById<ViewPager2>(R.id.view_pager)

        view.findViewById<TextView>(R.id.third_screen).setOnClickListener {
            onFinished()
            findNavController().navigate(R.id.action_viewPagerFragment_to_mainFragment)
        }

        return view
    }

    private fun onFinished(){
        val sharePref = requireActivity().getSharedPreferences("onFinish", Context.MODE_PRIVATE)
        val editor = sharePref.edit()
        editor.putBoolean("finished",true)
        editor.apply()

    }

}