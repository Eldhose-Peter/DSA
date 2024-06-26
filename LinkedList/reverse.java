package LinkedList;

public class reverse {
    public static void main(String[] args) {
        
        ListNode head = ListNode.arraytoLinkedList(new int[]{1,2,3,4,5});
        ListNode.printList(head);
        //head = reverseList(head);
        head =reverseList2(head);
        ListNode.printList(head);
    }

    public static ListNode reverseList2(ListNode head){
            if(head==null||head.next==null)
                return head;

            ListNode rest = reverseList2(head.next);
            head.next.next=head;
            head.next=null;
            
            return rest;
    }

    public static ListNode reverseList(ListNode node){
       
        ListNode curNode = node;
        ListNode prevNode = null;
        ListNode nextNode = null;

        while(curNode!=null){
            nextNode = curNode.next;
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        return prevNode;

    }
}
