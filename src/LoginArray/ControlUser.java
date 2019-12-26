/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoginArray;

/**
 *
 * @author Tardin
 */
public class ControlUser {
    private ModelUser[] dU;
    private int i;
    
    public ControllerUser(int ukuran){
        dU = new ModelUser[ukuran];
    }
    void fungsiSimpan(ModelUser user){
        dU[i++] = user;
    }
    void fungsiHapus(){
        
    }
    void fungsiEdit(){
    
}
}
