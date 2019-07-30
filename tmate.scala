class Base{
	def foo(a:Int =1) = println(a)
}
class Derived extends Base{
	override def foo(a:Int = 1)=super.foo(a)
}
class User{
	def use(inst: Base)= inst.foo()
	def play()={
		use(new Base)
		use(new Derived)
	}
}
val user = new User
user.use(new Derived)