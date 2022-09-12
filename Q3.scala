object Q3 extends App
{
  val account1= new BankAccount("lasindu",20001991,34000.00)
  val account2= new BankAccount("wathsan",20004994,67000.00)

  account1.transfer(account2,5000.00)
  println("Balances After money transfer")
  println(account1)
  println(account2)
}

class BankAccount(id:String,n:Int,b:Double)
{
  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  def withdraw(n:Double):Unit=
  {
    this.balance=this.balance-n
  }

  def deposit(n:Double):Unit=
  {
    this.balance=this.balance+n
  }

  def transfer(acc:BankAccount,n:Double):Unit=
  {
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+ID+":"+accountnumber+":"+balance+"]"

}