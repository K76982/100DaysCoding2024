package days.pkg10;

public class Days10 {

    
    public static void main(String[] args) {
        byte myByte = 99; // mendeklarasikan tipe data byte
        System.out.println("Nilai byte :" +myByte);
        
        // contoh operasi aritmatika dengan byte
        byte a = 20;
        byte b = 40;
        byte c = 50;
        byte sum = (byte) (a + b + c); //perlu dijumlahkan karena hasil dari a + b + c adalah int
        System.out.println("Hasil penjumlahan byte : " + sum);
    }
    
}
