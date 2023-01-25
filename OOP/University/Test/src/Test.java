public class Test {
    public  interface Toan{
        int cong();
        int tru();
        int nhan();
        int chia();
    }
    public int newClass(int a, int b) {
        class Sum implements Toan{
            public Sum() {
                super();
            }
            @Override
            public int cong() {
                return a + b;
            }

            @Override
            public int tru() {
                return a - b;
            }

            @Override
            public int nhan() {
                return a * b;
            }

            @Override
            public int chia() {
                return a / b;
            }

            int giaThua(int a){
                if (a == 1)return a;
                return  giaThua(a - 1) * a;
            }

        }
        return  new Sum().giaThua(a) + new Sum().giaThua(b);
    }
}
