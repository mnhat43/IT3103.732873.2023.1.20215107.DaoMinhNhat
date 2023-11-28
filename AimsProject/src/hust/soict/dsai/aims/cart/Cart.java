package hust.soict.dsai.aims.cart;

import java.util.Iterator;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    // -----------------------------------------------------------------------
    // Thêm DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full!");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added!");
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	for(DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is already full!");
                return;
            }
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added!");
    	}
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full to add!");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        System.out.println("The dvd1 has been added!");
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full to add!");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println("The dvd2 has been added!");
    }

    // -----------------------------------------------------------------------
    // Xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                
                System.out.println("The disc has been removed!");
                break;
            }
        }
        if (!found) {
            System.out.println("Error 404! The disc is not found!");
        }
    }
    
    // -----------------------------------------------------------------------
    // Tính tổng số tiền các DVD trong giỏ hàng
    public float totalCost() {
        float total = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    // -----------------------------------------------------------------------
    // In danh sách các mặt hàng đã đặt hàng của giỏ hàng, giá của từng mặt hàng và tổng giá
    public void print() {
  		System.out.println("*************************CART*************************");
  		System.out.println("Ordered Items: ");
  		for (int i=0;i<qtyOrdered;i++) {
  			System.out.println(itemsOrdered[i].toString());
  		}
  		System.out.println("Total cost: " + this.totalCost());
  		System.out.println("******************************************************");
  	}
    
    // -----------------------------------------------------------------------
    //Search for DVDs in the cart by ID and display the search results
    public void  searchByID(int id) {
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemsOrdered[i].getId() == id) {
    			System.out.println("Result for id: " + id);
    			System.out.println(itemsOrdered[i].toString());
    			return;
    		}
    	}
    	System.out.println("No match is found !!!");
    }
    
    // -----------------------------------------------------------------------
    //Search for DVDs in the cart by title and print the results
    public void  searchByTitle(String title) {
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemsOrdered[i].getTitle().equals(title)) {
    			System.out.println("Result for title: " + title);
    			System.out.println(itemsOrdered[i].toString());
    			return;
    		}
    	}
    	System.out.println("No match is found !!!");
    }
    
}

