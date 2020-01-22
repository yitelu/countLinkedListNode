class Main {


  public static void main(String[] args) {

    Node head = new Node(2);
    Node nodeB = new Node(3);
    Node nodeC = new Node(4);

    head.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = null;

    int countNode =1;
    Node current = head;

    while(current.next != null){
      current = current.next;
      countNode++;   
    }

    System.out.println("num of total node: " + countNode);
  }



}