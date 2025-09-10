public class Remove_duplicates {

    public static void Remove_duplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        // Base Case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
            
        }

        // Kaam
        char Currchar = str.charAt(idx);
        if(map[Currchar-'a']==true){
            // duplicate
            Remove_duplicates(str, idx+1, newstr, map);
        }
        else{
            map[Currchar-'a']= true;
            Remove_duplicates(str, idx+1, newstr.append(Currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        Remove_duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
