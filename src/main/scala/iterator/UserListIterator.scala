package iterator

class UserListIterator(userList: UserList) extends Iterator[User] {
  private var index = 0

  override def hasNext: Boolean = index < userList.size()

  override def next(): User = {
    val user = userList.at(index)
    index += 1
    user
  }
}
