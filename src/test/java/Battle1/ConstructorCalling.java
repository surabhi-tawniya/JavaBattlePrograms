package Battle1;

public class ConstructorCalling {

        String str = "";
        String str2 = "";

        ConstructorCalling() {
            this("z");
            System.out.println("Default Constructor : " + str + str2);
        }
        ConstructorCalling(String str) {
            this("x", "y");
            this.str += str;
            System.out.println("One Parameterized Constructor : " + this.str + str2);
        }
        ConstructorCalling(String str, String str2) {
            this.str += str;
            this.str2 += str2;
            System.out.println("Two Parameterized Constructor : " + this.str + this.str2);
        }
        public static void main(String[] args) {
            ConstructorCalling cc = new ConstructorCalling();
        }
    }

