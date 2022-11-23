public class ComplexNumb {
    private int a;
    private int b;

    ComplexNumb(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    ComplexNumb sum(ComplexNumb num1) {
        int numbdjnibnjd = this.b + num1.getB();
        ComplexNumb result = new ComplexNumb(this.a + num1.getA(), numbdjnibnjd);
        return result;
    }

    ComplexNumb dif(ComplexNumb num1) {
        ComplexNumb result = new ComplexNumb(this.a - num1.getA(), this.b - num1.getB());
        return result;
    }
    ComplexNumb mul (ComplexNumb num1){
        ComplexNumb result = new ComplexNumb(this.a*num1.getA()-this.b*num1.getB(),this.a*num1.getB()+this.b*num1.getA());
        return result;
    }
    ComplexNumb div (ComplexNumb num1){
        int a = this.a*num1.getA()+this.b*num1.getB();
        int b = this.b*num1.getA()-this.a*num1.getB();
        int c = num1.getA()*num1.getA()+ num1.getB()*num1.getB();
        ComplexNumb result = new ComplexNumb(a/c,b/c);
        return result;
    }


}
