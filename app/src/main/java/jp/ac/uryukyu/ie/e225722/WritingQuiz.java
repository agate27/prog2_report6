package jp.ac.uryukyu.ie.e225722;
/**入力式のクイズのクラス。
*   String quiz; //クイズの問題文
*　  String answer; //クイズの答え
*　  int happiness;//得られる幸福度
*/
public class WritingQuiz extends Quiz{
    private String quiz;
    private String answer;
    private int happiness;
    
    /**
     * コンストラクタ。問題文、答え、幸福度を指定する。
     * @param quiz　クイズの問題文
     * @param answer　クイズの答え
     * @param happiness　得られる幸福度
     */

    WritingQuiz (String quiz, String answer, int happiness){
        this.quiz = quiz;
        this.answer = answer;
        this.happiness = happiness;
    }

    @Override
    public String getQuiz(){
        return quiz;
    }

    @Override
    public int getHappyness(){
        //引数が正しくない場合。
        if(happiness < 0) {
            throw new IllegalArgumentException("Quiz.happiness:引数damegeは正の数である必要があります");
        }
        return happiness;
    }

    @Override
    public boolean cheak (String input){
        return true;
    }

    @Override
    public boolean judge (String input){
        return input.equals(this.answer);
    }

    @Override
    public String getAnswer(){
        return this.answer;
    }
}

