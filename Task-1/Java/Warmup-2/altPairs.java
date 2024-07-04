/*

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

public String altPairs(String str) {
    String ans="";
    if(str.length()<3)
        return str;
    for (int i=0;i<str.length()-1;i+=4){
        ans+=str.charAt(i)+""+str.charAt(i+1);

    }
    if(str.length()>3)
        if(str.length()%2==1)
            return ans+str.charAt(str.length()-1);
    return ans;
}