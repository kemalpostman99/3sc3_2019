
package ArrayGUI;
import java.util.Scanner;
import javax.swing.SpringLayout;
public class ViewEmployee {
    static int jumlah, pilihan;
    static String name, id, pil;
    static double gaji;

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah Employee");
        jumlah = sc.nextInt();
        ControllerEmployee ce = new ControllerEmployee(jumlah);
        System.out.println("Silahkan Masukkan Data Employee");
        for(int i=0; i<jumlah; i++){
            ModelEmployee me = new ModelEmployee();
            System.out.println("Masukkan ID Employee");
            id = sc.next();
            System.out.println("Masukkan Nama Employee");
            name = sc.next();
            System.out.println("Masukkan Gaji Employee");
            gaji = sc.nextDouble();
            
            me.setEmployeeID(id);
            me.setEmployeeName(name);
            me.setEmployeeSalary(gaji);
            
            ce.saveEmp(me);
                    
        }
        do{
           System.out.println("Silahkan pilih menu");
           System.out.println("1. simpan data");
           System.out.println("2. lihat semua data");
           System.out.println("3. lihat data by ID");
           System.out.println("4. lihat data by Name");
           System.out.println("5. Edit data");
           System.out.println("6. Hapus data");
           pilihan = sc.nextInt();
           switch(pilihan){
        case 1:
            ce.viewAllEmp();
            break;
        case 2:
            System.out.println("Masukkan ID ");
            String id_cari = sc.next();
            ModelEmployee me = ce.viewEmpById(id_cari);
            if(me !=null){
                System.out.println("ID Employee:" +me.getEmployeeId()+"/nNama: " +me.getEmployeeName()+"/nGaji: " + me.getEmployeeSalary());
            }else{
                System.out.println("Data tidak ditemukan");
            }
            break;
        case 3:
            System.out.println("Masukkan nama ");
            String nama_cari = sc.next();
            ModelEmployee mee = ce.viEmpbyName(nama_cari);
            if(mee !=null){
                System.out.println("ID Employee:" +mee.getEmployeeId()+"/nNama: " +mee.getEmployeeName()+"/nGaji: " + mee.getEmployeeSalary());
            }else{
                System.out.println("Data tidak ditemukan");             
            }
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
        default:        
    }
            System.out.println("Mau mengulang program? [y/n]");
            pil = sc.next();
        }while(pil.equalsIgnoreCase("Y"));
        System.out.println("Terimakasih telah"+"menggunakan Apps Kami :D/");
}
        }

