/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        Node zeroH = new Node(-1);
        Node oneH = new Node(-1);
        Node twoH = new Node(-1);

        Node zeroT = zeroH;
        Node oneT = oneH;
        Node twoT = twoH;
        
        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zeroT.next = temp;
                zeroT = zeroT.next;
                temp = temp.next;
            }else if(temp.data==1){
                oneT.next = temp;
                oneT = oneT.next;
                temp = temp.next;
            }else{
                twoT.next = temp;
                twoT = twoT.next;
                temp = temp.next;
            }
        }
        
        zeroT.next =(oneH.next!=null) ? oneH.next : twoH.next;
        
        oneT.next = twoH.next;
        twoT.next = null;
        
        zeroH = zeroH.next;
        
        return zeroH;
        
    }
}
