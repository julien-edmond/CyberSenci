package sio.d3.javafx.cybersensi;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello depuis Test !");
        Question q= new Question("jeux mondialement connu et tres celebre","football");





        q.ajouterProposition("football");
        q.ajouterProposition("criquet");
        q.ajouterProposition("petanque");
        q.ajouterProposition("pite");





        System.out.println(" je suis to.string "+q.toString());
        System.out.println(" je suis to.string2 "+q.toString2());


       System.out.println( q.propositions.get(1));

         q.effacer(q.propositions.size()-1);

        System.out.println(" je suis to.string "+q.toString());


    }
}