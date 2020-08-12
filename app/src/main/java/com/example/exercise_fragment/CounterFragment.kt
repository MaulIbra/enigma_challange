package com.example.exercise_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_counter.*

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
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        increment.setOnClickListener(this)
        decrement.setOnClickListener(this)
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
