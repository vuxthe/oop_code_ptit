
class ViDu{
    public static void main(String[] args) {
        String pass = "ddkkfkdf";
        System.out.println(pass.matches(".*\\d.*"));
    }

//    public static Boolean containsSequences(String uname, String pwd){
//        Boolean contains=false;
//        int count=0;
//        String[] tmp = uname.split("[\@\-\.\_]");
//        for (String seq: tmp){ //split the username following this regex.
//            if(pwd.indexOf(seq)>0){
//                count++;
//            }
//        }
//        if(count > uname.length() / 2){
//            contains=true;
//        }
//        return contains;
//    }
}