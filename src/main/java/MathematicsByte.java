public class MathematicsByte {
    public static void main(String[] args) {
        byte smollChisloMinMinus = -127;
        byte getSmollChisloMaxPlus = 127;
        //byte perebor = smollChisloMinMinus + getSmollChisloMaxPlus;
        //Проблема с типом данных, на int проблем не возникает, см переменную testByteInt,либо требуется явное определение
        byte perebor = (byte) (smollChisloMinMinus + getSmollChisloMaxPlus);
        int testByteInt = smollChisloMinMinus + getSmollChisloMaxPlus;
        System.out.println(testByteInt);
        System.out.println(perebor);
    }
}