interface PersonInfoProvider {
    //val providerInfo:String
    fun printInfo(person: Person)  {
        println("BasicInfoProvider")
      //  println(providerInfo)


    }      // 4)this causes a compiler error in the class below
}                                       // 1) {}not always needed



//abstract
class BasicInfoProvider : PersonInfoProvider{
    override fun printInfo(person: Person) {
        println("basicinforprovider printInfo")
        printInfo(person)
    }
    //9) must use override function here
}

// 2) creates new class with interface as shown

// 3) adding a method to this interface. ADd back {} at the interface

// 5)to address the compiler error:
// 6) one way is to use abstract class. this means it doesn't need to have all methods etc
fun main() {
    val provider = BasicInfoProvider()   // 7) this still gives an error as an instant of an abstract class can't be made
    // 8) removing abstract class


    // 10) Call on the below
    provider.printInfo(Person())
    println(provider)

}

//NEED MORE REVISION ON INTERFACES