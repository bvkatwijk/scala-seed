package $package$

class MainSpec extends BaseSpec {
  "message" should {
    "work" in {
      Main.message(Array("arg1", "arg2")) shouldBe "main called with args [arg1, arg2]"
    }
  }
}
