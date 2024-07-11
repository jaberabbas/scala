import com.learn.classes.Calculator
import org.scalatest.funsuite.AnyFunSuite

class CalculatorTester extends AnyFunSuite:
  test("test age"){
  assert(Calculator.add(5, 6) === 11)
}
