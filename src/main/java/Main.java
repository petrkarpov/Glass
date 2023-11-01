public class Main {
    public static void main(String[] args) {
        final int volumeGlassMl = 250;
        final double filledGlassPercent = 0.5;
        final double mlWaterInGlass = volumeGlassMl * filledGlassPercent;

        System.out.println("Миллилитров воды в стакане: " + mlWaterInGlass);
    }
}