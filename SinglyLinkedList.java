/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlylinkedlist;


public class SinglyLinkedList {
    
    // Tek Yönkü Linked Listin Düğümünü temsil eder
    class Node{
        int data;
        Node next;
     
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    }
    // Tek yönlü Linked Listin başını ve sonunu temsil ediyoruz
    public Node head = null; // baş 
    public Node tail = null; // son ( kuyruk)
    
    // addNode() fonksiyonu ile listeye eleman eklicez
    public void addNode(int data){
        // yeni bir node üreticez
        Node newNode = new Node(data); // parantez içindeki data list.addNode(12) gibi içerisinde data alıcak o data o data
        
     //listenin boş olup olmadığını kontrol ediyoruz    
    if (head==null) {
    // eğer liste boşsa head ve tail yeni node u gösterir
    head = newNode;    
    tail = newNode;    
}
    else{
        //newNode kuyruktan sonra eklenecek, böylece kuyruğun sonraki newNode'u işaret edecek
        tail.next = newNode;
          //newNode listenin kuyruğu oldu
          tail = newNode;
    }
}
   //display() listede bulunan  elemanları görüntüler
   public void display(){
       //Düğüm akımı başa işaret edecek
       Node current = head;
         if(head == null) {    
            System.out.println("Liste boş");    
            return;    
        }    
        System.out.print("elemanlar: ");    
        while(current != null) {    
            //İşaretçiyi artırarak her elemanı yazdırır
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
       
   }
   
   //countNodes()  kaç eleman olduğunu sayıcak 
    public int countNodes() {    
        int count = 0;    
        //Node current will point to head    
        Node current = head;    
            
        while(current != null) {    
            //Increment the count by 1 for each node    
            count++;    
            current = current.next;    
        }    
        return count;    
    }    
   
    //reverse() linked listi ters çevirmek için kullanılır 
      public void reverse(Node current) {  
        //linked list boş mu dolu mu diye kontrol eder 
        if(head == null) {  
            System.out.println("Liste boştur ");  
            return;  
        }  
        else {  
          //Sonraki düğümün boş olup olmadığını kontrol eder boş ise onu yazdırır
            if(current.next == null) {  
                System.out.print(current.data + " ");  
                return;  
            }  
            //Yinelemeli olarak ters işlevi çağırır
            reverse(current.next);  
            System.out.print(current.data + " ");  
        }  
    }  

    public static void main(String[] args) {
     
        SinglyLinkedList sList = new SinglyLinkedList();
        
       
        sList.addNode(12);
        sList.addNode(23);
        sList.addNode(43);
        sList.display();
        System.out.println(sList.countNodes());
        sList.reverse(sList.head);
       
          
        
    }
}
