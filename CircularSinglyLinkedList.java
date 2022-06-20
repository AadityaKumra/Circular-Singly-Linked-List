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
      Node tempNode=head;
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
        tempNode=tempNode.next;
        if(i!=size-1){
          System.out.print(" -> ");
        }
      }
      System.out.println("");
    }
      else{
      System.out.println("CSLL doesn't exist");
      }
       
    }
  public boolean searchNode(int nodeValue){
    if(head!=null){
      Node tempNode=head;
      for(int i=0;i<size;i++){
        if(tempNode.value==nodeValue){
          System.out.println("Node found at "+(i+1)+"rd position");
          return true;
        }
        else{
          tempNode=tempNode.next;
        }
      }
      System.out.println("Node not found. ooops");
      return false;
    }
    else{
      System.out.println("csll doesn't exist");
      return false;
    }
  }
  public void deleteNode(int location){
    if(head==null){
      System.out.println("CSLL does not exist.");
      return;
    }
    else if(location==0){
      head=head.next;
      tail.next=head;
      size--;
      if(size==0){
        tail=null;
        head.next=null;
        head=null;
      }
    }
    else if(location>=size){
      Node tempNode=head;
      for(int i=0;i<size-1;i++){
        tempNode=tempNode.next;
      }
      //if only one element in csll
      if(tempNode==head){
        head.next=null;
        head=null;
        size--;
        return;
      }
      tempNode.next=head;
      tail=tempNode;
      size--;
      return;
    }
    else{
      Node tempNode=head;
      for(int i=0;i<location-1;i++){
        tempNode=tempNode.next;
      }
      tempNode.next=tempNode.next.next;
      size--;
      return;
    }
  }

  //delete csll
  public void deleteCSLL(){
    if(head==null){
      System.out.println("CSLL does not exist.");
    }
    else{
      head=null;
      tail.next=null;
      tail=null;
      System.out.println("CSLL TERMINATED SUCCESSFULLY. HAHA");
    }
  }
}