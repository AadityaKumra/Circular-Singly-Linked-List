class Main {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
    csll.createCSLL(5);
    // System.out.println(csll.head.value);
    // to check if its circular, print head.next.value;
    // System.out.println(csll.head.next.value);
    csll.insertNode(4,0);
    
    csll.insertNode(3,1);
    
    csll.insertNode(2,8);
    
    System.out.println(csll.head.value);
    
    csll.traverseCSLL();
    
    csll.searchNode(10);
    
    csll.deleteNode(0);
    
    csll.traverseCSLL();

    csll.deleteNode(1);
    
    csll.traverseCSLL();

    csll.deleteCSLL();
  }
}