package jp.ac.uryukyu.ie.e225722;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
   @Test//答えと入力が一致しているか
   void judgeskTest(){
   YesNoQuiz question= new YesNoQuiz("ダビデ像の目はハートか？", "まる",10);
   String input = "まる";
   boolean judges = question.judge(input);
   assertEquals(judges, true);
   }

   @Test//入力したものが指定されたもの以外たった場合の処理
   void cheakTest(){
      YesNoQuiz question= new YesNoQuiz("ダビデ像の目はハートか？", "まる",10);
      String input = "丸";
      boolean cheak = question.cheak(input);
      assertEquals(cheak, false);
   }

}
