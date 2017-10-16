package Practica7;


public class Printer {
	private Queue<String> printerSpool;
	
	public Printer() {
		printerSpool = new Queue<String>();
	}
	
	public void printDocument(String name) {
		printerSpool.offer(name);
	}
	
	public void runPrinter() throws InterruptedException {
            for(int i=0;i<=printerSpool.size()+1;i++){
                System.out.println("Printing " +printerSpool.remove());
                Thread.sleep(5000);
            }
            System.out.println("Finished printing documents");
            
	}
}
