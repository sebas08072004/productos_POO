import javax.swing.JOptionPane;

public class app_inventario{
    static cls_productos[] productos = new cls_productos[100];
    static int int_posicionP = 0;

    public static void main(String[] args){

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
        }
    }
}