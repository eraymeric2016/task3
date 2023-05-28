package week_03;
/*
Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12

        public class SumOfDigits {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 900 + 100);
        int sum = 0;
        int digit;

        digit = number % 10;
        sum += digit;
        number /= 10;

        digit = number % 10;
        sum += digit;
        number /= 10;

        digit = number % 10;
        sum += digit;

        System.out.println("The sum of the digits in " + number + " is " + sum);
        Bu programda, Math.random() metodu kullanarak 100-999 arasında bir sayı
        oluşturuyoruz ve bu sayıyı number adlı bir tamsayı değişkenine atıyoruz.

 */
/*

Daha sonra, üç basamağın her birine tek tek erişmek için mod alma işlemi ve ardından
sayıyı 10'a bölme işlemi kullanıyoruz. Her bir basamağa eriştiğimizde, toplam
değişkenine ekleyerek son toplamı elde ediyoruz.

Son olarak, System.out.println() komutunu kullanarak, sonucu belirtilen formatta ekrana yazdırıyoruz.

Umarım bu örnek kod, sorunuza yardımcı olmuştur.
 */
public class task3 {
    public static void main(String[] args) {

        int number = (561);

        int firstDigit= number % 10;

        System.out.println(number / 10 % 10);
        int secondDigit = number / 100;


        int thirdDigit = number /10 % 10;
        System.out.println(firstDigit+secondDigit+thirdDigit);






















    }
}
