package jp.ac.uryukyu.ie.e225722;
import java.util.ArrayList;
import java.util.List;
/**ゲームの進行に関するクラス
*　  String[] qusetions //問題群
*/

    
public class GameMaster {
    //問題群の作成
    private Quiz[] qusetions = new Quiz[] {
        new YesNoQuiz("一円玉の直径は、ちょうど1cmになっている", "ばつ",1),
        new WritingQuiz("「ぎんなん」は何の種子？", "イチョウ",3),
        new YesNoQuiz("ダビデ像の目はハートか？", "まる",10),
        new WritingQuiz("アボカドには別名がありますが、カタカナでどんな別名？", "ワニナシ",50),
        new YesNoQuiz("ケチャップはもともと薬だった。", "まる",1),
        new WritingQuiz("カボチャの原産国は？", "カンボジア",30),
    };


    /**ゲームを進行させるメソッド
     * 問題群に入っているクイズの数だけ繰り返します。
     * 入力された文字列が想定したものと異なる場合は繰り返します。
     * 入力された回答と答えが一致するか調べます。
     * @param player　プレイヤー
     * @param girl　　　生命体
     */
    public void gameStart(Player player,Girl girl){
        //問題群の中になる問題の数だけ繰り返す。
        for(int i = 0; i < qusetions.length; i ++) {
            Quiz question = qusetions[i];
            System.out.println("");
            System.out.println(" ⇨ " + (i + 1) +  "日目");
            girl.showStatus();
            System.out.println(question.getQuiz());
            //回答リストを作成
            List<String> answerList = new ArrayList<String>();
            // ユーザからの入力を受け付ける。
            do{
                String input = player.Solution();
                //入力されたものが正常か判断する。
                if (question.cheak(input)){
                    //入力した答えを回答リストに入れます
                    answerList.add(input);
                    break ;
                }
                System.out.println("入力条件を確認してください");
            }while(true);

            //解答リストから回答を参照して、クイズの正解、不正解を判断する。
            String getInput =answerList.get(0);
            boolean judges = question.judge(getInput);

            if(judges){
                System.out.println("");
                System.out.println("やったね正解★");
            }else{
                System.out.println("");
                System.out.println("ざんねん不正解。正解は " + question.getAnswer() + "でした。");
            }

            int happiness = question.getHappyness();
            //狂気度はPlyerクラスのdice()を使ってランダムに指定します
            int madness = player.dice();
            girl.observation(judges, madness, happiness);
            //危険度を調べ、tureの場合処理を終わらせます。
            if (girl.isDead()){
                break;
            }

        }
    }
}
