public class MathematicsShort {
    public static void main(String[] args) {
        short shortChislo = 32767;
        System.out.println(shortChislo);
        //polmkaRazmera = shortChislo * 8;
        //polmkaRazmera = shortChislo - 1;
        //Система не даст выполнить никое действие(даже -), решение изменить тип или явно указать тип
        short polmkaRazmera;
        polmkaRazmera = (short) (shortChislo - 1);
        System.out.println(polmkaRazmera);
    }
}