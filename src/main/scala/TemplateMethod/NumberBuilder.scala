package TemplateMethod

class NumberBuilder extends Builder {
  def make(string: String): String = {
    if (string.length <= 3)
      string.reverse
    else
      s"${make(string.slice(3, string.length))},${string.slice(0, 3).reverse}"
  }

  override def arrange(string: String): String = {
    make(string.replaceAll(",", "").reverse)
  }

  override def decorate(string: String): String = s"$$${string}$$"
}
