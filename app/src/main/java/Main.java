
import jp.ac.uryukyu.ie.e225722.*;


public class Main {
    public static void main(String[] args){
        Player player = new Player();//プレイヤーを用意
        GameMaster gameMaster = new GameMaster();//ゲームマスターを用意
        Girl girl = new Girl("丼子", 80);//キャラクターを用意
        
        //概要説明
        System.out.println("∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴　୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴");
        System.out.println("あなたはとあるダンジョンの隠し部屋で、謎の生命体(女の子？)(  ◝▿◜  )に出会いました。");
        System.out.println("名前は" + girl.getName() + "と話しています。");
        System.out.println("どうやらお腹が減っているようで、このままだとヤバそうです。。");
        System.out.println("クイズに正しく答えて食べ物を獲得しましょう！");
        System.out.println("獲得した食べ物を与えて" + girl.getName() +"の狂気度を下げましょう");
        System.out.println("狂気度が100％になると...");
        System.out.println("∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴　୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴");
        System.out.print("理解できましたか？ (yse/はい)");

        //肯定するまで、入力を繰り返す
        do{
            String str = player.Solution();
            //肯定するとループから抜ける。
            if (str.equals("yes") || str.equals("はい") ){
                System.out.println("部屋から出られなくなった！");
                break ;
            }
            System.out.println("(  ◝▿◜  )");
        }while(true);

        //ゲームを開始する。
        gameMaster.gameStart(player, girl);
        System.out.println("");
        System.out.println("✼••┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈••✼");
        //ゲームのエンディング
        girl.endStory();
    }
}
