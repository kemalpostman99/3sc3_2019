package ArrayGUI;

public class ControllerEmployee {

    private ModelEmployee[] arr_emp;
    private int i;

    public ControllerEmployee(int pjg_arr) {
        
        arr_emp = new ModelEmployee[pjg_arr];

    }

    public void saveEmp(ModelEmployee me) {
        arr_emp[i++] = me;
    }

    ModelEmployee viewEmpById(String id_cari) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void viewAllEmp() {
        ModelEmployee me = new ModelEmployee();
        for (int i = 0; i < arr_emp.length; i++) {
            if (arr_emp[i] != null) {
                System.out.println("ID emp:" + me.getEmployeeId()
                        + "\nNama:" + me.getEmployeeName() + "\nGaji" + me.getEmployeeSalary());

            }
        }
    }

    public ModelEmployee viewEmpbyId(String emp_id) {
        ModelEmployee mod = new ModelEmployee();
        for (int i = 0; i < arr_emp.length; i++) {
            if (arr_emp[i] != null) {
                if (arr_emp[i].getEmployeeId().equals(emp_id)) {
                    mod = arr_emp[i];
                }
            }
        }
        return mod;
    }

    public ModelEmployee viEmpbyName(String name) {
        return null;

    }

    ModelEmployee viEmpbySalary(Double gaji_cari) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
