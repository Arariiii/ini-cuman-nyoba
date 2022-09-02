class User(private val firstName: String, private val lastName: String) { //ini function member dari class user
    fun getFullName(): String {
        return "$firstName $lastName"
    }
}

fun main() {
    val user = User("Bill", "Gates") //bikin object didalam class
    println("Display Name: ${user.getFullName()}")//panggil member function
}

