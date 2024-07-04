/*

Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

public boolean catDog(String str) {
    String cat="cat";
    String dog="dog";
    int catcount=0;
    int dogcount=0;

    for(int i=0;i<str.length()-2;i++){
        if(cat.equals(str.charAt(i)+""+str.charAt(i+1)+""+str.charAt(i+2))){
            catcount++;
        }
        if(dog.equals(str.charAt(i)+""+str.charAt(i+1)+""+str.charAt(i+2))){
            dogcount++;
        }
    }
    return catcount==dogcount;
}
