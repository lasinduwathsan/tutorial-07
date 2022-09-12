object Q4 extends App 
{
  val account1= new BankAccount1("sadun",20001991,13000.00)
  val account2= new BankAccount1("nimal",20003444,14000.00)
  val account3= new BankAccount1("sunil",20002323,3000.00)
  val account4= new BankAccount1("piyal",20000939,-3000.00)

  var bank:List[BankAccount1]=List(account1,account2,account3,account4)

  val negbalance = bank.filter(a=>a.balance<0)
  val totbalance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))
  val interest = (b:List[BankAccount1])=>b.map((a) => (a.ID,a.accountnumber,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

  print("\nAccounts with negative balance: ")
  println(negbalance)
  print("Sum of all account balances: ")
  println(totbalance)
  print("Final balances with interest: ")
  println(interest(bank))
}

class BankAccount1(id:String,n:Int,b:Double){

  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  override def toString = "["+ID+":"+accountnumber+":"+balance+"]"

}
