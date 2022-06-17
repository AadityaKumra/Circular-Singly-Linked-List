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
      createCSLL(nodeValue); //to create CSLL in case of no node
      return;
    }
    else if(location==0){
      node.next=head;
      head=node;
      tail.next=head; 
      }
    else if(location>=size){
      tail.next=node;
      node.next=head;
      tail=node;
    }
    else{
      Node tempNode=new Node();
      for(int i=0;i<location-1;i++){
        tempNode=tempNode.next;
      }
      node.next=tempNode.next;
      tempNode.next=node;
    }
      size++;
  }
  public void traverseCSLL(){
    if(head!=null){
      Node tempNode=head;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print("->");
        }
        tempNode=tempNode.next;
      }
    }
      else{
      System.out.println("CSLL doesn't exist");
      }
       
    }
}