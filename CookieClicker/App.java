package CookieClicker;

class App{
    public void finalize(){
           System.out.println("Done");          
    }
    public static void main(String[] args) {
        
        CookieClickerGUI cookieClickerGUI = new CookieClickerGUI();
        cookieClickerGUI = null;
        System.gc();
    }
}