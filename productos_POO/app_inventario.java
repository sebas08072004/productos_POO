import javax.swing.JOptionPane;

public class app_inventario{
    static cls_productos[] productos = new cls_productos[100];
    static int int_posicionP = 0;
    static boolean bln_sw;
    static int int_pos;

    public static void main(String[] args){
        fnt_menuP(true);
    }
;
    private static void fnt_registrar(String cod,   String nom, String desc, int sto, float valorc, float ga){
        productos[int_posicionP] = new cls_productos(cod, nom, desc, sto, valorc, ga);
        int_posicionP+=1;
        JOptionPane.showMessageDialog(null,"producto registrado", "Registrar", JOptionPane.INFORMATION_MESSAGE);
    }

      private static void fnt_consultar(String codigo){
        bln_sw = false;
        int_pos = 0;
        for(int i = 0; i< int_posicionP; i++){
            if(codigo.equals(productos[i].getCodigo())){
                bln_sw = true;
                int_pos = i;
                break;
        }
    }
        if(bln_sw == false){
            JOptionPane.showInputDialog(null,"no se encontraron registros");
        }
        else{
            JOptionPane.showInputDialog(null,"nombre" + productos[int_pos].getNombre() + "\nDescripcion" + productos[int_pos].getDescripcion() + 
            "\nstock" + productos[int_pos].getStock() + "\nvalor de la compra" + productos[int_pos].getValor_compra() + "\nganancia" + productos[int_pos].getGanancia()+ "\nvalor venta" + productos[int_pos].getValor_venta());
        }
    
    }

    private static void fnt_selector(int op){
        if(op == 1){
            String cod = JOptionPane.showInputDialog(null,"codigo");
            String nombre = JOptionPane.showInputDialog(null, "nombre");
            String desc = JOptionPane.showInputDialog(null, "descripcion");
            int stoc = Integer.parseInt(JOptionPane.showInputDialog(null,"stock"));
            float vcompra = Float.parseFloat(JOptionPane.showInputDialog(null,"valor de la compra"));
            float ganancia = Float.parseFloat(JOptionPane.showInputDialog(null,"Ganancia"));
            fnt_registrar(cod, nombre, desc, stoc, vcompra, ganancia);
        }
        if(op == 2){
            String cod = JOptionPane.showInputDialog(null, "codigo");
            fnt_consultar(cod);
        }
       
    
    }

  

    private static void fnt_menuP (boolean men){
        while  (men = true){
            int m = Integer.parseInt(JOptionPane.showInputDialog(null,"<<<<<<< MENU >>>>>>> \n" + 
                                                                      "1.registrar productos\n" +
                                                                      "2. consultar productos \n" +
                                                                      "3. actualizar productos \n" +
                                                                      "4. registro de comras \n" + 
                                                                      "5. reportes\n" +
                                                                      "6.salir\n >>>>>>>"));
                                                                      fnt_selector(m);
        }
    }
}