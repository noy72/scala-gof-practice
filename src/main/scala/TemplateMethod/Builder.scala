package TemplateMethod

trait Builder {
  def arrange(string: String): String

  def decorate(string: String): String

  def build(string: String): String = {
    decorate(arrange(string))
  }
}
