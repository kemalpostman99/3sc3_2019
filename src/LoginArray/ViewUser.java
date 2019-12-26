
package LoginArray;
import java.util.Scanner;

/**
 *
 * @author Tardin
 */
public class ViewUser {
    private static ModelUser[] dataUser;
    static Scanner sc = new Scanner(System.in);
    static ModelUser mu = new ModelUser();
    static String uName, pass;
    static int size;
    
    public static void main(String[] args){
        System.out.println("Masukkan banyak User:   ");
        size = sc.nextInt();
        ControllerUser cu = new ControllerUser(size);
        for(int i=0; i<=size; i++){
            dataUser = new ModelUser[size];
            System.out.println("Username:   ");
            uName =  sc.next();
            System.out.println("Username:   ");
            uName =  sc.next();
            mu.setUsername(uName);
            mu.setUsername(uName);
            cu.fungsiSimpan(mu);
        }
    }
    
}
