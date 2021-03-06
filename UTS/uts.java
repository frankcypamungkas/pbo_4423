import java.util.Stack;
import java.util.Scanner;
//frankcy pamungkas(A11.2019.12305)
public class uts {
    public static void main(String[] args) {
        System.out.print("Masukan String : "); 
        Scanner in = new Scanner(System.in); //inputan 
        String inputString = in.nextLine(); 
        Stack stack = new Stack(); //stack

        boolean karakterinvalid=false;//boolean jika ada '-' atau '=' lebih dari 1
        boolean lebihKanan = false;//boolean buat kondisional 
        int i = 0;
        //looping untuk ruas kiri =
        while (inputString.charAt(i) != '=') {
            if (inputString.charAt(i) == '1') { //jika yang ditunjuk 1
                stack.push(inputString.charAt(i));//push 1 ke stack
                i++;
            }
            else if(inputString.charAt(i) == '-'){
                System.out.println("Persamaan tidak valid");
                karakterinvalid=true;
                break;
            } else {
                i++;
            }
        }
        i++;
        //looping ruas kanan =
        while (i < inputString.length() && karakterinvalid==false) {
            if (inputString.charAt(i) == '1') {//jika ditunjuk 1
                if (!stack.isEmpty()) {//jika stack tidak kosong
                    stack.pop();
                    i++;
                } else {//jika kosong berarti ruas kanan masih ada 1 tetapi stack sudah habis maka persamaan tidak valid
                    System.out.println("Persamaan tidak valid");
                    lebihKanan = true;
                    break;
                }
            }else if(inputString.charAt(i) == '='){
                System.out.println("Persamaan tidak valid");
                karakterinvalid=true;
                break;
            }else {
                i++;
            }
        }

        if (!stack.isEmpty() && lebihKanan==false && karakterinvalid==false) {//jika stack tidak kosong tetapi ruas kanan sudah habis
            System.out.println("Persamaan tidak valid");
        } else if(stack.isEmpty() && lebihKanan==false && karakterinvalid==false){//jika stack kosong dan ruas kanan tidak sisa dan tidak ada karakter invalid
            System.out.println("Persamaan valid");
        }
    }
}
