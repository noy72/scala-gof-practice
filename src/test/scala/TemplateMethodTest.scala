import TemplateMethod.{NumberBuilder, StringBuilder}
import org.scalatest.FunSuite

class TemplateMethodTest extends FunSuite {
  test("NumberBuilder.main") {
    val numberBuilder = new NumberBuilder()
    assert(numberBuilder.build("12,3456,7890") === "$1,234,567,890$")
  }

  test("StringBuilder.main") {
    val stringBuilder = new StringBuilder()
    assert(stringBuilder.build("HellO WOrLd!!") === "**Hello world!!**")
  }
}
