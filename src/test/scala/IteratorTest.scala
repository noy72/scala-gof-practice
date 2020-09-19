import iterator.{User, UserList}
import org.scalatest.FunSuite

class IteratorTest extends FunSuite {
  test("iterator") {
    val it = Iterator("user_1", "user_2", "user_3")
    it foreach println
  }

  test("Iterator.main") {
    val users: List[String] = List("user_1", "user_2", "user_3")
    val userList = new UserList()
    users foreach userList.add

    var actual: List[User] = List()
    val userListIterator = userList.iterator()
    while (userListIterator.hasNext) {
      actual :+= userListIterator.next()
    }

    val expect = users.map(User)
    assert(actual === expect)
  }
}
