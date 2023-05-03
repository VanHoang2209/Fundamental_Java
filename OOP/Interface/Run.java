package OOP.Interface;

public class Run {
    public static void main(String[] args) {
        MayTinhCasioFX500 fx = new MayTinhCasioFX500();
        MayTinhVinacal500MS vn = new MayTinhVinacal500MS();

        System.out.println("5.7 + 6.7 = "+fx.cong(5.7,6.7));
        System.out.println("5.7 - 6.7 = "+fx.tru(5.7,6.7));
        System.out.println("5.7 * 6.7 = "+fx.nhan(5.7,6.7));
        System.out.println("5.7 / 6.7 = "+fx.chia(5.7,6.7));

        System.out.println("5.7 + 6.7 = "+vn.cong(5.7,6.7));
        System.out.println("5.7 - 6.7 = "+vn.tru(5.7,6.7));
        System.out.println("5.7 * 6.7 = "+vn.nhan(5.7,6.7));
        System.out.println("5.7 / 6.7 = "+vn.chia(5.7,6.7));

        int arr[] = new int[] {6,7,4,3,1,9};
        int arr2[] = new int[] {6,7,4,3,1,9};

        SapXepChen sxchen = new SapXepChen();

        sxchen.SapXepTang(arr);
        sxchen.SapXepGiam(arr2);

        for(int i=0; i<arr.length; i++){
            System.out.println(" "+arr[i]);
        }
        System.out.println("====================");
        for(int i=0; i<arr2.length; i++){
            System.out.println(" "+arr2[i]);
        }

        SapXepChon sxchon = new SapXepChon();
        sxchon.SapXepTang(arr);
        sxchon.SapXepGiam(arr2);

//        for(int i=0; i<arr.length; i++){
//            System.out.println(" "+arr[i]);
//        }
//        System.out.println("====================");
//        for(int i=0; i<arr2.length; i++){
//            System.out.println(" "+arr2[i]);
//        }
        PhanMemMayTinhBoTui pmmt = new PhanMemMayTinhBoTui();
        System.out.println("1.5 + 2.5 = "+vn.cong(1.5,2.5));
        System.out.println("1.5 - 2.5 = "+vn.tru(1.5,2.5));
        System.out.println("1.5 * 2.5 = "+vn.nhan(1.5,2.5));
        System.out.println("1.5 / 2.5 = "+vn.chia(1.5,2.5));

        pmmt.SapXepTang(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(" "+arr[i]);
        }
        pmmt.SapXepGiam(arr2);
        for(int i=0; i<arr.length; i++){
            System.out.println(" "+arr2[i]);
        }
    }
}
