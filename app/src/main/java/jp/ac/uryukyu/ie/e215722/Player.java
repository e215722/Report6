package jp.ac.uryukyu.ie.e215722;
import java.util.Scanner;
/**プレイヤークラス
 * 主にプレイヤーが行う操作を書いている
 */
public class Player {
    public String[] Oselect(String[] stage){//○のプレイヤーの操作
       System.out.println("○を置く場所を選択してください");
       Scanner scanner = new Scanner(System.in);
       Stage st = new Stage();
       st.showStage(stage);
       int num = Integer.parseInt(scanner.nextLine());
       if(stage[num-1]==null){
           stage[num-1]="○";
       }else{
           System.out.println("別のところを選んでください");
       }return stage;
    }

    public String[] Xselect(String[] stage){//×のプレイヤーの操作
        System.out.println("○を置く場所を選択してください");
        Scanner scanner = new Scanner(System.in);
        Stage st = new Stage();
        st.showStage(stage);
        int num =Integer.parseInt(scanner.nextLine());
        if(stage[num-1]==null){
            stage[num-1]="×";
        }else{
            System.out.println("別のところを選んでください");
        }return stage;
     }
 
}


