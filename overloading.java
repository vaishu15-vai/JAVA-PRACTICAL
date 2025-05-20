// class overloading {
//     void  mutiply(int a,int b){
//         System.out.println(a*b);
//     }
//     void mutiply(int a){
//        System.out.println(a);

//     }
// }
// class Inneroverloading {
//   public static void main(String[] args) {
//     overloading a=new overloading();
//     a.mutiply(2,(int) 4.0);
//     // a.mutiply(2.0, 4.0);
//   }
    
// }
public class overloading {

    static int mutiply(int a,int b){
        return a*b;
    }
    static double mutiply(double a,double b){
        return a*b;
    }
}
 class Inneroverloading {

    public static void main(String[] args) {
        System.out.println(overloading.mutiply(2, 4));
        System.out.println(overloading.mutiply(234.0, 3.0));
    }
}
