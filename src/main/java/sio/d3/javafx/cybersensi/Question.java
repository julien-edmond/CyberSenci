package sio.d3.javafx.cybersensi;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String ennonce;
    private String bonne_reponse;
    private List<String> propositions;

    public Question(String ennonce, String bonne_reponse){
        this.ennonce = ennonce;
        this.bonne_reponse = bonne_reponse;
        this.propositions = new ArrayList<>();
    }

    public void ajouterProposition(String proposition){
        this.propositions.add(proposition);
    }
    public String toString(){
        return this.ennonce+"-"+ this.bonne_reponse+"-"+this.propositions;
    }
    public String toString2(){
        String s = this.ennonce+ "-" + this.bonne_reponse + "-";

        for(int i = 0; i < propositions.size(); i++){
            s = s + "-"+propositions.get(i);
        }
        return s;
    }

    public List<String> getPropositions() {
        return propositions;
    }
}
