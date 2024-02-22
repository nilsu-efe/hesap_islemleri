
package constructor;


public class account {
    
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telno;
    
    public account(){
        System.out.println("kendi yaptığımız..");
    }
    
    public account(String isim, String email, String telno){
        
        /*this.isim=isim;
        this.email=email;
        this.telno=telno;
        
        this.bakiye=0.0;
        this.hesapno="bilgi yok";*/
        
        this("bilgi yok", 0.0, isim, email, telno);
        
    }
    
    public account(String hesapno,double bakiye,String isim,String email,String telno){
        
        this.bakiye=bakiye;
        this.email=email;
        this.hesapno=hesapno;
        this.isim=isim;
        this.telno=telno;
    }
    
    public void bilgiver(){
        System.out.println("hesap no:"+this.hesapno);
        System.out.println("isim:"+this.isim);
        System.out.println("tel no:"+this.telno);
        System.out.println("bakiye:"+this.bakiye);
        System.out.println("email:"+this.email);
    }
    
    public void paraYatirma(int miktar){
        this.bakiye=bakiye;
        bakiye+=miktar;
        System.out.println("yeni bakiye:"+bakiye);
    }
    
    public void paraCekme(int miktar){
        this.bakiye=bakiye;
        
        if(miktar > 1500){
            System.out.println("1500 tlden fazla çekemezsiniz:");
        }
        if(miktar>bakiye){
            System.out.println("yeterli bakiye yok");
            System.out.println("bakiyeniz:"+bakiye);
        }
        else{
            bakiye-=miktar;
            System.out.println("yeni bakiye:"+bakiye);
        }
    }
    

    /**
     * @return the hesapno
     */
    public String getHesapno() {
        return hesapno;
    }

    /**
     * @param hesapno the hesapno to set
     */
    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telno
     */
    public String getTelno() {
        return telno;
    }

    /**
     * @param telno the telno to set
     */
    public void setTelno(String telno) {
        this.telno = telno;
    }
    
    
    
}
