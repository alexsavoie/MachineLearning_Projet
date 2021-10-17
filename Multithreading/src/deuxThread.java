public class deuxThread {
    public static void main(String[] args) throws Exception {
       manger A = new manger();
       marcher B = new marcher();

        //Les deux threads s'execute en meme temps.
        A.start();
        B.start();
    
      try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        
    }

    System.out.println("je vais entrer en classe et commencer mes exercices");

    
    }   
}

