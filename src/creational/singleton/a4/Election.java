package creational.singleton.a4;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private static Election instance;
    private int trumpVote = 0, bidenVote = 0;
    private Set<String> userWhoVoted = new HashSet<String>();
    private Election(){}
    public static Election getInstance(){
        if (instance == null) instance = new Election();
        return instance;
    }
    public void submitVote(String candidate, String user){
        if (candidate.toLowerCase().strip() == "" || user.toLowerCase().strip() == "") return;
        if (userWhoVoted.contains(user)) return;
        switch (candidate){
            case "trump":
                trumpVote += 1;
                userWhoVoted.add(user);
                break;
            case "biden":
                bidenVote += 1;
                userWhoVoted.add(user);
                break;
            default: return;
        }
    }
    public void printResult(){
        System.out.println("-".repeat(100));
        System.out.println("Trump: " + trumpVote);
        System.out.println("Biden: " + bidenVote);
        String res = "";
        if (trumpVote == bidenVote) res = "Draw";
        else if (trumpVote > bidenVote) res = "Trump win";
        else res = "Biden win";
        System.out.println(res);
    }
}