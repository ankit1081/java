public class addition2 {
    public static void main(String a[]) {
        Add obj = new Add();
        obj.setValues(5,6);
        obj.sub();
        obj.showResult();
    }
}
class Add{
    int num1;
    int num2;
    int result;
    int showResult;

    public void setValues(int num1, int num2){
        num1 = 5;
        num2 = 6;
    
    }
    public void sub(){
        result = num2 - num1 ;
    }
    public void showResult(){
        System.out.println("result is:"+result);
    }
}
