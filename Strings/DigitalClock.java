import java.util.*;
public class DigitalClock {
    public int ReturnHashCount(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
                switch (n.charAt(i)) {
                    case '0':
                        count += 6;
                        break;
                    case '1':
                        count += 2;
                        break;
                    case '2':
                        count += 5;
                        break;
                    case '3':
                        count += 5;
                        break;
                    case '4':
                        count += 4;
                        break;
                    case '5':
                        count += 5;
                        break;
                    case '6':
                        count += 6;
                        break;
                    case '7':
                        count += 3;
                        break;
                    case '8':
                        count += 7;
                        break;
                    case '9':
                        count += 6;
                        break;
                    default:
                        System.out.println("NOT VALID CASE");
                        break;
                }
            }
    
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nos = sc.nextLine();
        DigitalClock d = new DigitalClock();
        int countHash = d.ReturnHashCount(nos);
        System.out.println("The hashes have been seen on the clock is "+countHash);
    }
}