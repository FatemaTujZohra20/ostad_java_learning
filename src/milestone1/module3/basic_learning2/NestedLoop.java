package milestone1.module3.basic_learning2;

public class NestedLoop {
    public static void main(String[] args){
//        int count = 0;

//        for(int left = 1; left <= 5; left++){
//            System.out.println("left finger:" + left + " Count: " + count);
//
//            for(int right = 1; right <= 5; right++){
//                count += 1;
//                System.out.println("right finger:" + right + " Count: " + count);
//            }
//        }
        for(int i=0; i<5; i++){
            if(i%2==0) continue;
            System.out.println(i + " ");
        }

    }
}
