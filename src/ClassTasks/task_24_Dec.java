package ClassTasks;

public class task_24_Dec {
    static void main(String[] args) {
//        public class Lab067_To_Three_Max {
//
//            public static void main(String[] args) {

//                int n1 = 2;

//                int n2 = 9;
//
//                int n3 = -11;
//
//                System.out.println("MAX OUT OF THREE");
//
//            }
//
//        }

//        use the  nested ternary operator
        int c1 = 2,c2 = 9, c3 = -11;
        int r = (c1>c2) ? ((c1>c3) ? c1 : c3) : ((c2>c3) ? c2 : c3);
        System.out.printf("Max out of three is %d", r);
    }
}
