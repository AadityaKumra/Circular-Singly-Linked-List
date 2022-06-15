class Main {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
    csll.createCSLL(5);
    // System.out.println(csll.head.value);
    // to check if its circular, print head.next.value;
    // System.out.println(csll.head.next.value);
    csll.insertNode(4,0);
    csll.insertNode(4,1);
    csll.insertNode(4,8);
    System.out.println(csll.head.value);
  }
}