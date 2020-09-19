package TemplateMethod

class StringBuilder extends Builder {
  override def arrange(string: String): String = {
    string.slice(0, 1).toUpperCase() + string.slice(1, string.length).toLowerCase()
  }

  override def decorate(string: String): String = s"**${string}**"
}
