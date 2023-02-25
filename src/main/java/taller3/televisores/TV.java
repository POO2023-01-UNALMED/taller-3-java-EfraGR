package taller3.televisores;

public class TV {
        private Marca marca;
        private int canal = 1;
        private int precio = 500;
        private boolean estado;
        private int volumen = 1;
        private Control control;

        //creo que seria publico
        private static int numTV;


        public TV(Marca marca, boolean estado){
            this.marca = marca;
            this.estado = estado;
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
            this.volumen = volumen;
        }
        public int getVolumen() {
            return volumen;
        }

        public void setCanal(int canal) {
            this.canal = canal;
        }
        public int getCanal() {
            return canal;
        }

        public boolean getEstado(){
            return estado;
        }        

        public static int getNumTV() {
            return numTV;
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


