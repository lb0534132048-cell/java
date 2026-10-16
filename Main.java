public class Main {
    public static void main(String[]args){
        MyDate d=new MyDate();
        MyTime t=new MyTime(2,5,3);
        try {
            d.setYear(-+2);
        }
        catch (Exception er){
            System.out.println(" MyDate d=new MyDate();\n d.setYear(-+2);"+er.getMessage());
        }
        System.out.println(d.getDate('-'));

        try {
             t=new MyTime(-2,5,3);
        }
        catch (Exception er){
            System.out.println(" t=new MyTime(-2,5,3);;"+er.getMessage());
        }
        System.out.println(t.getDate('-'));
        System.out.println(t.getDate('-','/'));
    }
}
