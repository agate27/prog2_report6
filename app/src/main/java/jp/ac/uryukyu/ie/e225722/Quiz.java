package jp.ac.uryukyu.ie.e225722;
/**問題を表す抽象クラス
* 
*/
public abstract class Quiz {

    /**問題文を返します。
     * @return　String 問題文
     */
    public abstract String getQuiz();

    /**幸福度を返します。
     * @return　int 幸福度
     */
    public abstract  int getHappyness();

    /**答えを返します。
     * @return　String 答え
     */
    public abstract String getAnswer();

    /**解答が正当であるか返します。
     * @param input　プレイヤーの解答
     * @return boolean
     */
    public abstract boolean cheak(String input);

    /**答えがあっているか返します。
     * @param input　プレイヤーの解答
     * @return　boolean
     */
    public abstract boolean judge(String input);
    
}

