object Q2 extends App
{
    val r1 =new Rational(2,3)
    val r2 =new Rational(4,7)
    val r3 =new Rational(4,8)

    val r=r1-r2-r3

    println(r)
}

class Rational(n:Int,d:Int)
{
    require(denominator > 0, "Denominator must be greater than 0")
    def numerator = n
    def denominator = d

    def neg = new Rational(-this.numerator,this.denominator)
    def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)
    
    def -(r:Rational) = this.add(r.neg)

    override def toString(): String = numerator + "/" + denominator
}