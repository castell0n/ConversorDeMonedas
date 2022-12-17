package program;
import javax.swing.JOptionPane;

public class convertirMoneda {
    public double Colon = 8.7797;
    public double Euro = 0.9435;
    public double LibrasEsterlinas = 0.8235;
    public double YenJapanese = 136.7151;
    public double WonSulCoreano = 1309.9605;
    
    public void dolaresA_Colones(int cant){
        double resultant = cant * Colon;
        resultant = (double) Math.round(resultant * 100d)/100;
        JOptionPane.showMessageDialog(null,cant+" USD = "+resultant+" Colones");
    }

    public void dolaresA_Euros(int cant){
        double resultant = cant * Euro;
        resultant = (double) Math.round(resultant * 100d)/100;
        JOptionPane.showMessageDialog(null,cant+" USD = "+resultant+" Euros");
    }

    public void dolaresA_LibrasEsterlinas(int cant){
        double resultant = cant * LibrasEsterlinas;
        resultant = (double) Math.round(resultant * 100d)/100;
        JOptionPane.showMessageDialog(null,cant+" USD = "+resultant+" Libras Esterlinas");
    }

    public void dolaresA_YenJapones(int cant){
        double resultant = cant * YenJapanese;
        resultant = (double) Math.round(resultant * 100d)/100;
        JOptionPane.showMessageDialog(null,cant+" USD = "+resultant+" Yen Japanese");
    }

    public void dolaresA_WonSulCoreano(int cant){
        double resultant = cant * WonSulCoreano;
        resultant = (double) Math.round(resultant * 100d)/100;
        JOptionPane.showMessageDialog(null,cant+" USD = "+resultant+" Won Sul-Coreano");
    }
}