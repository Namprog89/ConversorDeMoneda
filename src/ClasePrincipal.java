

import com.sun.jdi.Value;

import javax.swing.*;
import java.lang.Integer.*;

public class ClasePrincipal {
    public static void main(String[] args)
    {
        String opcionMenu ;
        int opcion = 9;
        BuscarMoneda nuevaBusqueda = new BuscarMoneda();
        JOptionPane.showMessageDialog(null, "Bienvenido al Programa Convesor de Divisas");
        while (opcion != 0)
        {

            opcionMenu = JOptionPane.showInputDialog (" Selecione el Tipo de Moneda que desea convertir\n" +
                    "1 Dolar =>> Peso Argentino\n" +
                    "2 Peso Peso Argentino =>> Dolar\n" +
                    "3 Dolar =>> Real Basileño \n" +
                    "4 Real Basileño =>> Dolar\n" +
                    "5 Dolar =>> Peso Colombian\n" +
                    "6 Peso Colobiano =>> Dolar\n" +
                    "7 Dolar =>> Peso Chileno\n" +
                    "8 Peso Peso chileno=>> Dolar\n" +
                    "0 Si Desaea Salir del programa"
            );
            opcion = Integer.parseInt(opcionMenu);

            switch (opcion) {
                case 1:
                    ConvertidorMoneda.convertirMoneda("USD","ARS",nuevaBusqueda);
                    break;

                case 2:
                    ConvertidorMoneda.convertirMoneda("ARS","USD",nuevaBusqueda);
                    break;

                case 3:
                    ConvertidorMoneda.convertirMoneda("USD","BRL",nuevaBusqueda);
                    break;

                case 4:
                    ConvertidorMoneda.convertirMoneda("BRL","USD",nuevaBusqueda);
                    break;

                case 5:
                    ConvertidorMoneda.convertirMoneda("USD","COP",nuevaBusqueda);
                    break;

                case 6:
                    ConvertidorMoneda.convertirMoneda("COP","USD",nuevaBusqueda);
                    break;

                case 7:
                    ConvertidorMoneda.convertirMoneda("USD","CLP",nuevaBusqueda);
                    break;

                case 8 :
                    ConvertidorMoneda.convertirMoneda("CLP","USD",nuevaBusqueda);
                    break;

                case 0 :
                    JOptionPane.showMessageDialog(null," Gracias Por Usar Nuestro Convertidor de Monedas  ");
                    break;

            }
        }










































    }
}
