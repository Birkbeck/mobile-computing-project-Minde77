package co.uk.bbk.coursework_mindaugasgailiunas

/**
 * A Recipe data class contains recipe title,
 * recipe instructions and ingredient list.
 *
 * @author Mindaugas Gailiunas
 * @property title a Recipe title
 * @property category a Recipe category
 * @property instructions Recipe instructions
 * @property ingredients a list of Recipe ingredients
 */
data class Recipe(
    val title: String,
    val category: String,
    val instructions: String,
    val ingredients: List<Ingredient>
)
