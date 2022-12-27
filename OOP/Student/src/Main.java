import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date(11,12,2022);
        Department cntt = new Department("021105","CNTT","0866642465");
        Class k25cmu = new Class("java1","Lập trình hướng đối tượng",1,"Chính Quy",now,cntt);
        System.out.println(k25cmu.toString());
    }
}