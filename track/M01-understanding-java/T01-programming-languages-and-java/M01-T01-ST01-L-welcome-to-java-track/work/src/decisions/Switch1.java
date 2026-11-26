package decisions;

public class Switch1 {
    public static void main(String[] args) {
        int marks = 88;
        // if (marks >= 91 && marks <= 100) {
        // System.out.println("Grade A");
        // } else if (marks >= 81 && marks <= 90) {

        // System.out.println("Grade B");
        // }

        // else if (marks >= 61 && marks <= 80) {
        // System.out.println("Grade C");
        // }

        // else if (marks >= 35 && marks <= 60) {
        // System.out.println("Grade D");
        // } else {

        // System.out.println("Fail..");
        // }
        switch (marks) {
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                System.out.println("Grade A");
                break;
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                System.out.println("Grade B");
                break;

            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
                System.out.println("Grade C");
                break;

            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade C");

        }
    }
}
