import javax.swing.*;

public class ConvertidorMoneda
{

    public static void convertirMoneda(String mondaBase, String monedaConvercion, BuscarMoneda buscarMoneda )
    {
        double cantidadIngresada ;
        double cantidadConvertida;

        Moneda monedasBuscada = buscarMoneda.buscarMonedaAPI(mondaBase,monedaConvercion);

        String mC ;
        mC = JOptionPane.showInputDialog(null,"Ingrese el valor de la moneda a converir");
        cantidadIngresada = Double.parseDouble(mC) ;
        cantidadConvertida = cantidadIngresada * monedasBuscada.conversion_rate();
        JOptionPane.showMessageDialog(null,"El Valor De La Mondad Convertida es : "+ cantidadConvertida);
    }

}
