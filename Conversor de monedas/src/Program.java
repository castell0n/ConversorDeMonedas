import javax.swing.JOptionPane;
import program.convertirMoneda;

public class Program {

    public static void main(String[] args) {
        convertirMoneda obj01 = new convertirMoneda();
        int m;
        int cant;
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("""
                    Seleciona una opción para convertidor.
                    
                    1 - Colón a dolares
                    2 - Euros a dolares
                    3 - Libras Esterlinas a dolares
                    4 - Yen Japonés a dolares
                    5 - Won sul-coreano a dolares
                    
                    Para salir ingresa el numero 6"""));


            switch (m) {
                case 1 -> {
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Dólar a Peso\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.dolaresA_Colones(cant);
                }
                case 2 -> {
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Peso a Dólar\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.dolaresA_Euros(cant);
                }
                case 3 -> {
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Dólar a Peso\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.dolaresA_LibrasEsterlinas(cant);
                }
                case 4 -> {
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Peso a Dólar\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.dolaresA_YenJapones(cant);
                }
                case 5 -> {
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Peso a Dólar\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.dolaresA_WonSulCoreano(cant);
                }
                case 6 -> JOptionPane.showMessageDialog(null, "Salio del programa");
            }
        }while(m!=6);
    }
}