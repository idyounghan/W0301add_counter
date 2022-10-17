package kr.ac.kumoh.ce.s20181091.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kr.ac.kumoh.ce.s20181091.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val model: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.txtCount.text = model.count.toString()

        model.count.observe(this, Observer {
            binding.txtCount.text = it.toString()
        })
        binding.btnAdd.setOnClickListener {
            model.add()
            //binding.txtCount.text = model.count.toString()
        }
    }
}