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

  public void insertNode(int nodeValue,int location){
    Node node=new Node();
    node.value=nodeValue;
    if(head==null){
      createCSLL(nodeValue);
      return;
    }
    else if(location==0){
      node.next=head;
      head=node;
      tail.next=head; 
      }
      
    
  }
  
}