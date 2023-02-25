package taller3.televisores;

public class TV {
        private Marca marca;
        private int canal;
        private int precio;
        private boolean estado;
        private int volumen;
        private Control control;

        //creo que seria publico
        private static int numTV;


        public TV(Marca marca, boolean estado){
            TV.setNumTV(TV.getNumTV()+1);
            this.marca = marca;
            this.estado = estado;
            this.canal = 1;
            this.precio = 500;
            this.volumen = 1;
        }

        //setters and getters
        public void setMarca(Marca marca){
            this.marca = marca;
        }
        public Marca getMarca(){
            return this.marca;
        }

        public void setControl(Control control) {
            this.control = control;
        }
        public Control getControl() {
            return control;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }
        public int getPrecio() {
            return precio;
        }

        public void setVolumen(int volumen) {
            if (this.estado && volumen<=7 && volumen>=0){
                this.volumen = volumen;
            }            
        }
        public int getVolumen() {
            return volumen;
        }

        public void setCanal(int canal) {
            if (this.estado && canal<=120 && canal>=1){
                this.canal = canal;
            }            
        }
        public int getCanal() {
            return canal;
        }

        public boolean getEstado(){
            return estado;
        }        

        public static int getNumTV() {
            return TV.numTV;
        }
        public static void setNumTV(int numTV) {
            TV.numTV = numTV;
        }

        //end

        public void turnOn(){
            this.estado = true;
        }

        public void turnOff(){
            this.estado = false;
        }

        public void canalUp(){
            if (this.estado && this.canal+1<=120){
                this.canal++;
            } 
        }
        public void canalDown(){
            if (this.estado && this.canal-1>=1){
                this.canal--;
            } 
        }

        public void volumenUp(){
            if (this.estado && this.volumen+1<=7){
                this.volumen++;
            } 
        }
        public void volumenDown(){
            if (this.estado && this.volumen-1>=0){
                this.volumen--;
            }
        }
    }


