package ir.hosseinstar.viewpager2

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        Handler(Looper.getMainLooper()).postDelayed({
            if(onBoardFinished()){
                findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
            }
        },3000)
        return view
    }

    private fun onBoardFinished():Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onFinish",Context.MODE_PRIVATE)
        return sharedPref.getBoolean("finished",false)
    }
}