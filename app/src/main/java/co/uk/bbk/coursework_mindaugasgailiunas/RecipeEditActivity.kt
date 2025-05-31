package co.uk.bbk.coursework_mindaugasgailiunas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.uk.bbk.coursework_mindaugasgailiunas.databinding.RecipeEditBinding

/**
 * A Recipe edit class. The class displays recipe edit data and input elements such as
 * recipe title label and input, category label and dropdown menu, ingredients label
 * and list elements with button to add ingredient, instruction label and text field
 * and save and cancel recipe buttons.
 *
 * @author Mindaugas Gailiunas
 */
class RecipeEditActivity : AppCompatActivity() {
    // Bind all edit activity elements
    private lateinit var binding: RecipeEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecipeEditBinding.inflate(layoutInflater)

        // Bind activity to view
        val view = binding.root
        setContentView(view) // Display bound elements on the screen
    }

    /*
        TODO:
        - Add logic to load recipe title input field
        - Add Spinner adapter and logic to handle category dropdown menu
        - Add RecyclerView adapter and logic to load Ingredient item input fields
        - Add logic to load add ingredient button that adds Ingredient input field
        - Add logic and instruction text input
        - Add logic to save current recipe
        - Add Intent to load MainActivity after clicking cancel button if new recipe or RecipeViewActivity if editing existing recipe
    */
}