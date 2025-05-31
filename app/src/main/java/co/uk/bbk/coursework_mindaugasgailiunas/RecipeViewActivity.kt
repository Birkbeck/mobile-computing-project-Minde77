package co.uk.bbk.coursework_mindaugasgailiunas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.uk.bbk.coursework_mindaugasgailiunas.databinding.RecipeViewBinding

/**
 * A Recipe view class. The class displays recipe data such as recipe title,
 * category, ingredients, instructions and edit, back to dashboard and delete buttons.
 *
 * @author Mindaugas Gailiunas
 */
class RecipeViewActivity : AppCompatActivity() {

    // Bind all recipe_view activity elements
    private lateinit var binding: RecipeViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecipeViewBinding.inflate(layoutInflater)

        // Bind activity to view
        val view = binding.root
        setContentView(view) // Display bound elements on the screen
    }
}