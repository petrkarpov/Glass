public class Main {
    public static void main(String[] args) {
        final int VOLUME_GLASS_ML = 250;
        final double FILLED_GLASS_PERCENT = 0.5;
        final double ML_WATER_IN_GLASS = VOLUME_GLASS_ML * FILLED_GLASS_PERCENT;

        System.out.println("Миллилитров воды в стакане: " + ML_WATER_IN_GLASS);
    }
}