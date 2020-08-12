package com.example.exercise_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [CounterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CounterFragment : Fragment(),View.OnClickListener {

    var value:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_counter, container, false)
        view.increment.setOnClickListener(this)
        view.decrement.setOnClickListener(this)
        return view
    }

    override fun onClick(view: View?) {
        val activity = activity as MainActivity
        when(view){
            increment -> {
                this.value += 1
                activity.sendData(this.value.toString())
            }
            decrement ->{
                this.value -= 1
                activity.sendData(this.value.toString())
            }
        }
    }
}
