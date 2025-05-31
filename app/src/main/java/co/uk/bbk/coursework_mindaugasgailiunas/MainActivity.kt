package co.uk.bbk.coursework_mindaugasgailiunas

import android.content.Intent
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

        /*
        TODO:
        - Add RecyclerView adapter and logic to load a list of Recipe items
        - Add Spinner adapter and logic to load a dropdown list of category elements
        - Add Intent to load RecipeViewActivity after clicking View button on Recipe item
        - Add Intent to load RecipeEditActivity after clicking Edit on Recipe Item and add new recipe button at the bottom of dashboard
         */
    }
}