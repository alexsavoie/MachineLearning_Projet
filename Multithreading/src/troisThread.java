public class troisThread {
        public static void main(String[] args) throws Exception {
           manger A = new manger();
           marcher B = new marcher();

            //Execution de A au complet avant de proceder a executer B.
            A.start();
            A.join();
            B.start();
        
          try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }
    
        System.out.println("je vais entrer en classe et commencer mes exercices");
    
        
        }   
    }

