public class addition {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum(5, 6);
    }
}

class Add {
    int num1;
    int num2;
    int result;

    public void sum(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        result = num1 + num2;
        System.out.println("result is:" + result);
    }
}