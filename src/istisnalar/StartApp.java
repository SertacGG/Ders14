package istisnalar;

public class StartApp {
    public static void main(String[] args) {
        int yas = -1;
        try {
            getYas(yas);
        } catch (IllegalStateException e) {
            System.out.println("Yaş değeri sıfırdan küçük olamaz.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizinin elemanın yanlış yerde arıyorsun.");
        } catch (NumberFormatException e) {
            System.out.println("Sayı uygun değil.");
        } catch (Exception e) {
            System.out.println("Super Exception a yakalandınız.");
        } finally {
            System.out.println("Son olarak burayı çalıştır");
        }
        System.out.println("Kod çalışıyor mu?");
    }

    public static int getYas(int yas) throws IllegalStateException, NumberFormatException {
        if (yas < 0) {
            IllegalStateException istisna = new IllegalStateException();
            System.out.println("Burası neresi");
            throw istisna;
        } else if (yas > 0) {
            NumberFormatException istisna = new NumberFormatException();
            throw istisna;
        }
        System.out.println("Method da sonuna kadar işlemi yapıp dönüyor mü");
        return yas;
    }
}
