// UC4 - Display hello

public class UC4 {

    public static void main(String[] args) {

        String name = "";
		StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);

            if (i < args.length - 1) {
                nameBuilder.append(" ");
            }
        }

        name = nameBuilder.toString(); 

        System.out.println("Hello " + name + "!");
    }
}