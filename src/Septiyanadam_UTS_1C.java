public class Septiyanadam_UTS_1C {
        public static void main(String[] args) {
            String status;
            for (int angka = 17; angka < 51 ; angka++){

                if (angka % 2 == 0){
                    status ="valid";
                }else {
                    status ="invalid";
                }
                System.out.println(angka + " adalah " +status);
            }
        }
    }
