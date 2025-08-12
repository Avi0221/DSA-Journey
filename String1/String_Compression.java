public class String_Compression {

    public static String Compress(String str){
        // StringBuilder sb = new StringBuilder();
        // int count = 1;
        // for(int i = 0; i < str.length(); i++){
        //     if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
        //         count++;
                
        //     }
        //     else{
        //         sb.append(str.charAt(i));
        //         sb.append(count);
        //         count = 1;

        //     }
        // }
        // return sb.toString();

        String newstr = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            newstr += str.charAt(i);
            if(count>1){
                newstr +=count.toString();
            }
        }
        return newstr;
        

    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(Compress(str));
    }
}
