fun main() {
  val number = ContactManager()
          number.addContact("Mikisa", "078990988")
          number.addContact("Priscilla","0948473839")
          number.addContact("Nabacwa","07736576888897")
          number.removeContact("Mikisa")
          number.editContact("Nabacwa", "1093769820")
          println(number.retrieveContact("Nabacwa"))
          println(number.getAllContacts())

  val recipeBook = RecipeBook()
    recipeBook.addRecipe("How to make Pork", listOf("Oil","onions","papper"), listOf("1.add oil", "2.make a fire", "3.add da meat"))
    recipeBook.addRecipe("How to make rice", listOf("Oil","onions","pepper","blueband"), listOf("1.add oil", "2.make a fire", "3.add da meat","4.Jolof"))

    recipeBook.searchRecipe("ric")


}
/*Write a programme that is able to enable a user to add a number
* edit it, remove it and display it
* PSEUDO CODE
* ADDING A PHONE NUMBER
* -1 Input the telephone number and name of the person.
* -2 add the number in a list of numbers stored in key, value pairs with names as keys and numbers as values.
* REMOVING
* -1 Input either a phone number, name or both name and phone number required to be removed.
* -2 Search for the phone number, name or both name and phone number to match the corresponding preference in the list of both contact and
* contacts and names.
* -3 if the searched item corresponds to any from the list, remove that particular contact from the list
* -4 If the searched item doesn't correspond to any from the searching requirements in step 2, out put "number is not in the phonebook"
* EDIT
* -1 Input the number needed to be edited,
* -2 If the number or name or both input match the ones in the list of contacts,
* -3 replace the old number with the new number.
* DISPLAYING
* -1 Input the number needed to be displayed.
* -2 Search for the number in the list by either name, phone number or both according to what the user has input
* -3 If all the information in step 2 above corresponds to the input contact info display the contact info from the list.*/

class RecipeBook {
    val recipes = mutableMapOf<String, Pair<List<String>, List<String>>>()
    fun addRecipe(name: String, ingredients: List<String>, instructions: List<String>) {
        recipes[name] = Pair(ingredients, instructions)
//        println(recipes)
    }
    fun searchRecipe(searchItem: String): List<Any>{
        var filtered = recipes.filter { it.key.contains(searchItem, ignoreCase = true) }.toList()

        println(filtered)
        return filtered
    }

    }

class ContactManager {
     val contacts = mutableMapOf<String, String>()
    fun addContact(name: String, phoneNumber: String){
        contacts[name] = phoneNumber
        println(contacts)

    }
    fun removeContact(searchItem: String) {
        contacts.remove(searchItem)
        println(contacts)
    }
    fun editContact(name: String, newPhoneNumber: String) {
        if (contacts.containsKey(name)) {
            contacts[name] = newPhoneNumber
            println(contacts)
        } else {
            println("Contact not found.")
        }
    }
    fun retrieveContact(name: String): String?{
        return contacts[name] ?: "Contact not found."
    }
    fun getAllContacts(): Map<String, String> {
        return contacts
    }
}










