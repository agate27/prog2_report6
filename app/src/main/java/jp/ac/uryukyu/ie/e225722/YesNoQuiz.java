package jp.ac.uryukyu.ie.e225722;
/**入力式のクイズのクラス。
*   String quiz; //クイズの問題文
*　  String answer; //クイズの答え
*　  int happiness;//得られる幸福度
*/
public class YesNoQuiz extends Quiz{
    private String quiz;
    private String answer;
    private int happiness;

    /**
     * コンストラクタ。問題文、答え、幸福度を指定する。
     * @param quiz　クイズの問題文
     * @param answer　クイズの答え
     * @param happiness　得られる幸福度
     */
    YesNoQuiz (String quiz, String answer,int happiness){
        this.quiz = quiz;
        this.answer = answer;
        this.happiness = happiness;
    }

    @Override
    public  String getQuiz(){
        System.out.println("回答を「まる」か「ばつ」で入力してください");
        return this.quiz +"(まる/ばつ)※回答を「まる」か「ばつ」で入力してください";
    }

    @Override
    public int getHappyness(){
        //引数が正しくない場合。
        if(happiness < 0) {
            throw new IllegalArgumentException("Girl.happiness:引数happynessは正の数である必要があります");
        }
        return happiness;
    }
    
    @Override
    public String getAnswer(){
        return this.answer;
    }

    @Override
    public boolean cheak(String input){
        if (input.equals("まる")){
            // 「まる」と答えた場合trueを返す、
            return true;
        } else if (input.equals("ばつ")){
            // 「ばつ」と答えた場合trueを返す、
            return true;
        } else { 
            //「まる」または「ばつ」以外を答えた場合falseを返す。
            return false;
        }
    }
        
    @Override
    public  boolean judge(String input){
        return input.equals(this.answer);
    }

}
