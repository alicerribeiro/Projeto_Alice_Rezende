package projeto;
public class A {
    int A1;
    float A2;    

    public int getA1() {
        System.out.println("getA1");
        return A1;
    }

    public void setA1(int A1) {
        System.out.println("setA1");
        this.A1 = A1;
    }

    public float getA2() {
        System.out.println("getA2");
        return A2;
    }

    public void setA2(float A2) {
        System.out.println("setA1");
        this.A2 = A2;
    }
    public void MA1(){
        System.out.println("MA1");
    }
    public void MA2(){
        System.out.println("MA2");
    }
    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }
}
