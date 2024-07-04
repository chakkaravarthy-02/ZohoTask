/*

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */

public int countYZ(String str) {
    str=str.toLowerCase();
    int count=0;
    for(int i=1;i<str.length()-1;i++){
        if(!Character.isLetter(str.charAt(i)) || str.charAt(i)==' '){
            if(Character.isLetter(str.charAt(i-1))){
                if(str.charAt(i-1)=='z' || str.charAt(i-1)=='y'){
                    count++;
                }
            }
        }
    }
    if(!Character.isLetter(str.charAt(str.length()-1))){
        if(Character.isLetter(str.charAt(str.length()-2))){
            if(str.charAt(str.length()-2)=='z' || str.charAt(str.length()-2)=='y'){
                count++;
            }
        }
    }else{
        if(Character.isLetter(str.charAt(str.length()-1))){
            if(str.charAt(str.length()-1)=='z' || str.charAt(str.length()-1)=='y'){
                count++;
            }
        }
    }
    return count;
}
