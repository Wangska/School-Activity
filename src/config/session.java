
package config;

public class session {
    
    private static session instance;
    private int id;
    private String last;
    private String statusss;
    private String typess;
    private String first;
    private String middle;
    private String adds;
    private String contac;
    private String email_add;
    private String gender_m;
    private String user_name;
    private String pass_word;
    
    private session(){
        
        
        
    }


    public static synchronized session getInstance() {
        if(instance == null){
        instance = new session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
         return instance == null;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getStatusss() {
        return statusss;
    }

    public void setStatusss(String statusss) {
        this.statusss = statusss;
    }

    public String getTypess() {
        return typess;
    }

    public void setTypess(String typess) {
        this.typess = typess;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getContac() {
        return contac;
    }

    public void setContac(String contac) {
        this.contac = contac;
    }

    public String getEmail_add() {
        return email_add;
    }

    public void setEmail_add(String email_add) {
        this.email_add = email_add;
    }

    public String getGender_m() {
        return gender_m;
    }

    public void setGender_m(String gender_m) {
        this.gender_m = gender_m;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }


    
}
