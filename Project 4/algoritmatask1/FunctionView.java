/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmatask1;

public class FunctionView {

    Functions functions = new Functions();

    public char[] getRandomOut(int bil, boolean kondisi1, boolean kondisi2) {

        if (bil > (10)) {
            String out = "Out Of Range";
            String ubah = String.valueOf(out);
            return ubah.toCharArray();
        }
        return functions.getRandom(bil, kondisi1, kondisi2);
    }
    
        public int pecahanUangOut(int uang) {
        if(uang < 100){
            System.out.println("Nominal harus di atas Rp 100");
        }
        return functions.pecahanUang(uang);
    }
        
        public char[] acakCharOut(int bil, boolean kondisi1, boolean kondisi2) {

        return functions.getRandom(bil, kondisi1, kondisi2);
    }
    
    
}
