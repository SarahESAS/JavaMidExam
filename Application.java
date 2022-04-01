package aplikasi;
/**
 *
 * @author SARAH
 */

import data.*;
public class Application {
    public static void main(String[] args) {
        Laptop3 uts13 = new Laptop3("Sarah", "Acer", "AMD EI-2500", 2, "Windows 7", 4, "SSD M 2",1000,"Grey","Best") ;
        System.out.println(uts13);
        Laptop3 uts23 = new Laptop3("Sarah", "Acer", "AMD EI-2500", 2, "Windows 7", 4, "SSD SATA",1000,"White","Good") ;
        System.out.println(uts23);
        Laptop3 uts33 = new Laptop3("Sarah", "Acer", "AMD EI-2500", 2, "Windows 7", 4, "HDD",1000,"Hitam","Middle") ;
        System.out.println(uts33);
    }
}
