import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {

    @org.junit.jupiter.api.Test
    fun main() {

    }

    @Test
    fun stringPrint() {
        //checking that is not equal to zero
        assertNotNull(stringPrint("Vasja", 17))

        //checking what corresponds to the expected result
        assertEquals("My name is Vasja, I am 15 old year.", stringPrint("Vasja", 15))

        //checking that if incorrect data is entered, it does not match the desired result
        assertNotEquals(stringPrint("Vasja", 17), "My name is Vasja, I am 15 old year.")
    }

}
