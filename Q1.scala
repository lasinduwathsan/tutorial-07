object Q1 extends App
{
    val r1 = new Rational(3,5)
    val r2 = new Rational(8,9)

    println(r1.neg)

    val r = r1.add(r2)
    println(r)
}

class Rational(n:Int,d:Int)
{ 
    require(denominator > 0, "Denominator must be greater than 0")
    def numerator =n
    def denominator =d

    def add(r:Rational) = new Rational(this.numerator * r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)
    def neg = new Rational(-this.numerator,this.denominator)
    override def toString(): String = numerator + "/" + denominator
}