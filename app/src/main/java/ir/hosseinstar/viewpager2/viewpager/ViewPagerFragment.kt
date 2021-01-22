package ir.hosseinstar.viewpager2.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import ir.hosseinstar.viewpager2.R
import ir.hosseinstar.viewpager2.viewpager.screens.FirstScreenFragment
import ir.hosseinstar.viewpager2.viewpager.screens.SecondScreenFragment
import ir.hosseinstar.viewpager2.viewpager.screens.ThirdScreenFragment

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),SecondScreenFragment(),ThirdScreenFragment()
        )

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,this.lifecycle)
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        viewPager.adapter = adapter
        return view
    }
}