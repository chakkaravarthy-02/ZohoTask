/*

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */

public int blackjack(int a, int b) {
    int aMinus=a;
    if(aMinus>21){
        aMinus=0;
    }
    int bMinus=b;
    if(bMinus>21){
        bMinus=0;
    }
    if(aMinus>bMinus){
        return aMinus;
    }
    return bMinus;

}
