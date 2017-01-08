package klondike;

/**
 * Created by Tamara on 07/01/2017.
 */
public class View {

    public void write(VistaVO vistaVO) {
        System.out.println("" +
                "===========================\n" +
                "Baraja: "+vistaVO.baraja+"\n" +
                "Descarte: "+vistaVO.descarte+"\n" +
                "Palo oros: "+vistaVO.oros+"\n" +
                "Palo copas: "+vistaVO.copas+"\n" +
                "Palo espadas: "+vistaVO.espadas+"\n" +
                "Palo bastos:"+vistaVO.bastos+"\n" +
                "Escalera 1: "+vistaVO.escalera[0]+"\n" +
                "Escalera 2: "+vistaVO.escalera[1]+"\n" +
                "Escalera 3: "+vistaVO.escalera[2]+"\n" +
                "Escalera 4: "+vistaVO.escalera[3]+"\n" +
                "Escalera 5: "+vistaVO.escalera[4]+"\n" +
                "Escalera 6: "+vistaVO.escalera[5]+"\n" +
                "Escalera 7: "+vistaVO.escalera[6]+"\n" +
                "---------------------------\n" +
                "1. Mover de baraja a descarte\n" +
                "2. Mover de descarte a baraja\n" +
                "3. Mover de descarte a palo\n" +
                "4. Mover de descarte a escalera\n" +
                "5. Mover de escalera a palo\n" +
                "6. Mover de escalera a escalera\n" +
                "7. Mover de palo a escalera\n" +
                "8. Voltear en escalera\n" +
                "9. Salir\n" +
                "Opción? [1-9]: " +
                "");
    }
}
