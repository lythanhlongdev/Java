public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyArrayList<Integer> myArr = new MyArrayList<Integer>();

        /*
            Test case 1: kiêm tra sức tải và thời gian chạy của hàm add(T)

            lần 1: n = 1000
            kết quả:
                + Time: 0s
                + size: 10000
                + Array length : 10240

            lần 2: n = 100000
            kết quả:
                + Time: 4s
                + size: 100000
                + Array length : 163840

           lần 3: n = 100000000 => false
           kêt quả: Java heap space (tràn bộ nhớ)

        */
        int  n = 10000;
        final long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < n ; i++){
            myArr.add(i);
        }
        final long endtTime = System.currentTimeMillis();
        System.out.println("Time: "+(endtTime - startTime)/1000 + " s");
        System.out.println("Size: "+myArr.getSize());
        System.out.println("Array length: "+myArr.length());
        //myArr.showArray();

//        final long startTime = System.currentTimeMillis();
//        System.out.println(myArr.indexOf(10000));
//        final long endtTime = System.currentTimeMillis();
//        System.out.println("Time: "+(endtTime - startTime)/1000 + " s");
    }

}