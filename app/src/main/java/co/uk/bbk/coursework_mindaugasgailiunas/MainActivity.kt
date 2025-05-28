package co.uk.bbk.coursework_mindaugasgailiunas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import co.uk.bbk.coursework_mindaugasgailiunas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Bind all activities
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Bind all activities to view
        val view = binding.root
        setContentView(view)
    }
}