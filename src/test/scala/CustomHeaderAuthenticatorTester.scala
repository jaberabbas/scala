
import org.scalatest.funsuite.AnyFunSuite
import com.eu.auth.CustomHeaderAuthenticator
import  com.eu.auth.ServerHttpRequest

class CustomHeaderAuthenticatorTester extends AnyFunSuite{

  test("extractUsername"){
    val request : ServerHttpRequest = ServerHttpRequest()
    assert(CustomHeaderAuthenticator().extractUsername(request).get === "super-admin")
  }
}
