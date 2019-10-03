package cz.java.prokop.miroslav.texteditor;

public class funkcionalniTest {

    public static void main(String[] args) {

        String data = "Ahoj jak se máš?" + "\n" +
                "ahoj" + "\n" +
                "ahoj" + "\n" +
                "text";

        Zapis zapis = new Zapis();

        //zapis.zapisDoSouboru(data);

        CteniSouboru cteni = new CteniSouboru();

        String fileLocation = "text.txt";

        System.out.println(cteni.ctiZeSouboru(fileLocation));

    }

}