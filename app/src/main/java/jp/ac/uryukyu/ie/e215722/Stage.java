package jp.ac.uryukyu.ie.e215722;
import java.util.Objects;

/**ステージクラス
 * 
 */
public class Stage {
    public String[] stage = new String[9];

    public void setStage(){
        for (int j=0; j<9; j++) {//空の要素をいれる
            stage[j] = null;
        }  
    }
    
    public void showStage(String[] stage) {//盤面を表示する
        for (int i=0;i<9;i++) {
            System.out.print(stage[i]);
            if(i==2||i==5||i==8) {
                System.out.println();
            }
        }
    }
   
    public void Result(){//勝敗を確認する
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


}
