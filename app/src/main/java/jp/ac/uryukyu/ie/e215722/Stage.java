package jp.ac.uryukyu.ie.e215722;
import java.util.Objects;
import java.util.Random;

/**ステージクラス
 * 
 */
public class Stage {
    static String[] stage = new String[9];  

    public String[] setStage(){
        for (int j=0; j<9; j++) {//空の要素をいれる
            stage[j] = null;
        } 
        return stage; 
    }
    
    public void showStage(String[] stage) {//盤面を表示する
        for (int i=0;i<9;i++) {
            System.out.print(stage[i]);
            if(i==2||i==5||i==8) {
                System.out.println();
            }
        }
        
    }

    public void Number(){//選べる番号を表示する
        System.out.println("番号は以下の通りです");
        int[] number = new int[9];
        for(int i=0; i<9; i++){
            System.out.print(i+1);
            if(i==2||i==5||i==8){
                System.out.println();
            }
        }
    }
    public boolean Check(String stage[]){//勝負が決まったかを確認して終わりならtrueを返す
        if(Objects.equals(stage[0],"")&&Objects.equals(stage[1],"○")&&Objects.equals(stage[2],"○")||
        Objects.equals(stage[3],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[5],"○")||
        Objects.equals(stage[6],"○")&&Objects.equals(stage[7],"○")&&Objects.equals(stage[8],"○")||
        Objects.equals(stage[0],"○")&&Objects.equals(stage[3],"○")&&Objects.equals(stage[6],"○")||
        Objects.equals(stage[1],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[7],"○")||
        Objects.equals(stage[2],"○")&&Objects.equals(stage[5],"○")&&Objects.equals(stage[8],"○")||
        Objects.equals(stage[0],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[8],"○")||
        Objects.equals(stage[2],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[6],"○")){
         return true;
        }else if(Objects.equals(stage[0],"×")&&Objects.equals(stage[1],"×")&&Objects.equals(stage[2],"×")||
         Objects.equals(stage[3],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[5],"×")||
         Objects.equals(stage[6],"×")&&Objects.equals(stage[7],"×")&&Objects.equals(stage[8],"×")||
         Objects.equals(stage[0],"×")&&Objects.equals(stage[3],"×")&&Objects.equals(stage[6],"×")||
         Objects.equals(stage[1],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[7],"×")||
         Objects.equals(stage[2],"×")&&Objects.equals(stage[5],"×")&&Objects.equals(stage[8],"×")||
         Objects.equals(stage[0],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[8],"×")||
         Objects.equals(stage[2],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[6],"×")){
         return true;
        }else{
            for(int i=0;i<9;i++){
                if(stage[i]==null){
                    return false;
                }
            }
        } return true;
    }
     
 

    
    public void Result(){//勝敗を表示する
        if(Objects.equals(stage[0],"")&&Objects.equals(stage[1],"○")&&Objects.equals(stage[2],"○")||
           Objects.equals(stage[3],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[5],"○")||
           Objects.equals(stage[6],"○")&&Objects.equals(stage[7],"○")&&Objects.equals(stage[8],"○")||
           Objects.equals(stage[0],"○")&&Objects.equals(stage[3],"○")&&Objects.equals(stage[6],"○")||
           Objects.equals(stage[1],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[7],"○")||
           Objects.equals(stage[2],"○")&&Objects.equals(stage[5],"○")&&Objects.equals(stage[8],"○")||
           Objects.equals(stage[0],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[8],"○")||
           Objects.equals(stage[2],"○")&&Objects.equals(stage[4],"○")&&Objects.equals(stage[6],"○")){
            System.out.println("○の勝ち！");
        }else if(Objects.equals(stage[0],"×")&&Objects.equals(stage[1],"×")&&Objects.equals(stage[2],"×")||
            Objects.equals(stage[3],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[5],"×")||
            Objects.equals(stage[6],"×")&&Objects.equals(stage[7],"×")&&Objects.equals(stage[8],"×")||
            Objects.equals(stage[0],"×")&&Objects.equals(stage[3],"×")&&Objects.equals(stage[6],"×")||
            Objects.equals(stage[1],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[7],"×")||
            Objects.equals(stage[2],"×")&&Objects.equals(stage[5],"×")&&Objects.equals(stage[8],"×")||
            Objects.equals(stage[0],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[8],"×")||
            Objects.equals(stage[2],"×")&&Objects.equals(stage[4],"×")&&Objects.equals(stage[6],"×")){
            System.out.println("×の勝ち");
        }else{
            System.out.println("引き分け！");
        }
        System.out.println();
        System.out.println("盤面の結果はこうなりました");
        showStage(stage);
    }


    public String getOrder(){//先攻が○か×かを決める
        Random ran = new Random();
        int b = ran.nextInt(2);
        if(b==0) {
            return "まる";
        }else{
            return "ばつ";
        }    
    }

    public String[] gameMaster(String[] stage, String first ){//ゲームを実行する
        int i=1;
        if(first.equals("まる")){
            while(i>0){
                Player pla =new Player();
                pla.Oselect(stage);
                if(Check(stage)==true) break;
                    pla.Xselect(stage);
                    if(Check(stage)==true)break;                    
            }
        }else{
            while(i>0){
                Player pla =new Player();
                pla.Xselect(stage);
                if(Check(stage)==true) break;
                    pla.Oselect(stage);
                    if(Check(stage)==true)break;   
            }
        }return stage;
    }
}
