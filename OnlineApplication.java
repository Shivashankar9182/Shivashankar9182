package com.exe;

class OnlineStore { 

    String item;

    synchronized void buyItem(String item) throws InterruptedException {
    	
        if (!item.equalsIgnoreCase("Oneplus phone")) {
        	
            System.out.println("The item  is not available. Waiting...");
            wait();
        }

        System.out.println("Your order for '" + item + "' has been placed successfully!");
    }

    synchronized void restockItem(String newItem) {
       
        System.out.println("The item is now available for purchase!");
        notify(); // Notify waiting threads that the item is available
    }
}

public class OnlineApplication {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        Thread customer = new Thread(() -> {
            try {
                store.buyItem("Oneplus phone");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        });

        Thread restocker = new Thread(() -> {
            store.restockItem("Oneplus phone");
        });

        customer.start();
        restocker.start();
    }
}
