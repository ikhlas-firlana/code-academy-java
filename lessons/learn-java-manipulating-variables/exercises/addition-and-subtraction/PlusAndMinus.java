public class PlusAndMinus {
    public static void main(String[] args) {
        int zebrasInZoo = 8;
        int giraffesInZoo = 4;

        double balance = 20000.99;
        double depositAmount = 1000.0;
        balance = balance + depositAmount;

        double withdrawAmount = 500;
        balance = balance - withdrawAmount;

        int numPictureOfCats = 60 + 24;

        // Take a picture
        numPicturesOfCats++ // Value is now 85

        // Delete a picture
        numPicturesOfCats-- // Value is now 84

        int animalsInZoo = zebrasInZoo + giraffesInZoo;

        System.out.println(animalsInZoo);

        zebrasInZoo--;
        zebrasInZoo--;

        int numberZebrasAfterTrade = zebrasInZoo;

        System.out.println(numberZebrasAfterTrade);
    }
}