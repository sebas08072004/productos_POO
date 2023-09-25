public class cls_productos{
    private String str_codigo;
    private String str_nombre;
    private String str_descripcion;
    private int int_stock;
    private float  flt_valor_compra;
    private float flt_ganancia;
    private float flt_valor_venta;

    public cls_productos(String cod, String nom, String des, int stock, float val_c, float gana){
        this.str_codigo = cod;
        this.str_nombre = nom;
        this.str_descripcion = des;
        this.int_stock = stock;
        this.flt_valor_compra = val_c;
        this.flt_ganancia = gana;
        
        //calcular valor venta
        this.flt_valor_venta =(flt_valor_compra + gana)+flt_valor_compra;
    }
    //metodos setters
    public void setNombre(String nombre) {
        this.str_nombre = nombre;
    }
    public void setDescripcion (String descripcion) {
        this.str_descripcion = descripcion;
    }
    
    //metodos getters
    public String getNombre() {return str_nombre;};
    public String getDescripcion() {return str_descripcion;};
    public String getCodigo() {return str_codigo;};
    public int getStock () {return int_stock;};
    public float getValor_compra () {return flt_valor_compra;};
    public float getGanancia() {return flt_ganancia;};
    public float getValor_venta() {return flt_valor_venta;};


    private static void fnt_registrar(String nombre){

    };

    private static void fnt_selector(int opcion){
        if(opcion == 1){
            
        }

    };
}
