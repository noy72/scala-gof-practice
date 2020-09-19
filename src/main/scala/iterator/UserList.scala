package iterator

class UserList extends Aggregate[User] {
  private var users: List[User] = List()

  override def iterator(): Iterator[User] = new UserListIterator(this)

  def size(): Int = users.size

  def add(user: String): Unit = users :+= User(user)

  def at(index: Int): User = users(index)
}
