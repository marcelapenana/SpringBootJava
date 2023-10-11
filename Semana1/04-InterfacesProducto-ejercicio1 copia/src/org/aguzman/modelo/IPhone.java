package org.aguzman.modelo;

public class IPhone extends Electronico {
    private String modelo;

    private String color;

    public IPhone() {
    }

    public IPhone(String fabricante, String modelo, String color) {
        super(fabricante);
        this.modelo = modelo;
        this.color = color;
    }
   /* @Override
    public String  ImprimirElectronico() {
        StringBuilder sb = new StringBuilder("Electronico: ");
        sb.append(getFabricante())
                .append("\n")
                .append("Modelo opcionde: ")
                .append(this.modelo)
                .append("\n")
                .append("Color: ")
                .append(this.color);

        return sb.toString();
    }
*/

    @Override
    public String ImprimirElectronico() {
        return "Electronico: "+("\n")+
                "Fabricante: "+fabricante+("\n")+
                "Modelo: "+modelo+("\n")+
                "Color: "+color+("\n")+
                "***************************";
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
