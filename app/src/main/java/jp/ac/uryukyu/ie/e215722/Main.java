package jp.ac.uryukyu.ie.e215722;
 
public class Main { 
    public static void main(String[] args){
        
        Stage sta = new Stage();
        String stage[] = sta.setStage();
        String Player1 = sta.getOrder();
        stage = sta.gameMaster(stage, Player1);
        sta.Result();
    }
}
