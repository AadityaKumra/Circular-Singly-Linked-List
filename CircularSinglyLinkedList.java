public class CircularSinglyLinkedList{
  public Node head;
  public Node tail;
  public int size;

  public Node createCSLL(int nodeValue){
    head=new Node();
    Node node=new Node();
    node.value=nodeValue; //Since circular
    node.next=node;  
    head=node;
    tail= node;
    size=1;
    return head;
  }
  
}