package co.uk.bbk.coursework_mindaugasgailiunas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import co.uk.bbk.coursework_mindaugasgailiunas.databinding.ActivityMainBinding

/**
 * Culinary Companion main activity class.
 * It acts as an entryway to the app and as a dashboard to display recipes
 *
 * @author Mindaugas Gailiunas
 */
class MainActivity : AppCompatActivity() {

    // Bind all activities
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Bind all activities to view
        val view = binding.root
        setContentView(view)

        binding.dashboardRecipeItemRV.layoutManager = LinearLayoutManager(this)
    }
}