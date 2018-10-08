/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan33.objectorienteduserlogin;
/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Membuat fitur Login dengan validasinya berbasis object
 */
public class User {
    private  String username;
    private  String password;
    public Boolean statusAkun;
     private boolean cekAkun (String parUsername,String parPassword){
        username = "RizkiAdam";
        password = "terbaikselalu";
        statusAkun = parPassword.equals(password) && parUsername.equals(username);
         return statusAkun;
         
         
     }
     private void hasilLogin (Boolean parStatusAkun,String parUsername ){
      if (parStatusAkun==true) {
            System.out.println("\n******HALLO "+parUsername.toUpperCase()
                    +"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password Anda Salah");
        }   
     }
      public void pengecekkanLogin (String parUsername,String parPassword){
         cekAkun(parUsername,parPassword);
        hasilLogin(statusAkun,parUsername);
     }
}
